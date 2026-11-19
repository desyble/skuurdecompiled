import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import jdk.internal.org.objectweb.asm.*;
import jdk.internal.org.objectweb.asm.tree.*;

public final class PatchFull {
    public static void main(String[] args) throws IOException {
        try (ZipFile original = new ZipFile(args[0]);
             ZipOutputStream output = new ZipOutputStream(Files.newOutputStream(Path.of(args[1])))) {
            Map<String, Integer> changed = new HashMap<>();
            for (Enumeration<? extends ZipEntry> entries = original.entries(); entries.hasMoreElements();) {
                ZipEntry entry = entries.nextElement();
                if (entry.getName().equals("pI.class") || entry.getName().startsWith("pI$")
                    || entry.getName().startsWith("assets/minecraft/client/login/")
                    || entry.getName().startsWith("META-INF/maven/skuur/")) continue;
                output.putNextEntry(new ZipEntry(entry.getName()));
                try (InputStream input = original.getInputStream(entry)) {
                    if (Set.of("pj.class", "mr.class", "po.class", "cD.class").contains(entry.getName())) {
                        output.write(patch(input.readAllBytes(), changed));
                    } else {
                        input.transferTo(output);
                    }
                }
                output.closeEntry();
            }
            if (!changed.equals(Map.of("title", 1, "mark", 2, "render", 3, "widgets", 2, "settings", 1, "windowTitle", 1, "loginAction", 1, "loginButton", 1))) {
                throw new IllegalStateException("Unexpected patch sites: " + changed);
            }
            output.putNextEntry(new ZipEntry("LocalRenderScope.class"));
            Files.copy(Path.of(args[2]), output);
            output.closeEntry();
            System.out.println(changed);
        }
    }

    private static byte[] patch(byte[] bytes, Map<String, Integer> changed) {
        ClassNode type = new ClassNode();
        new ClassReader(bytes).accept(type, 0);
        for (MethodNode method : type.methods) {
            if (type.name.equals("mr")) {
                boolean drawExtra = Set.of("(SCLK8;FI)V", "(LK8;FJB)V", "(SILK8;FI)V").contains(method.desc);
                boolean widgetVisible = method.name.equals("lambda$new$3") || method.name.equals("lambda$new$6");
                if (drawExtra || widgetVisible) {
                    method.instructions.clear();
                    method.tryCatchBlocks.clear();
                    if (method.localVariables != null) method.localVariables.clear();
                    if (widgetVisible) {
                        method.instructions.add(new FieldInsnNode(Opcodes.GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;"));
                        method.instructions.add(new InsnNode(Opcodes.ARETURN));
                    } else {
                        method.instructions.add(new InsnNode(Opcodes.RETURN));
                    }
                    changed.merge(drawExtra ? "render" : "widgets", 1, Integer::sum);
                    continue;
                }
                for (AbstractInsnNode node : method.instructions.toArray()) {
                    if (method.name.equals("a") && method.desc.equals("(F)V")
                        && node instanceof FieldInsnNode field && field.owner.equals("mr") && field.name.equals("J")) {
                        method.instructions.set(field, new LdcInsnNode("desyble"));
                        changed.merge("mark", 1, Integer::sum);
                    } else if (method.name.equals("<init>") && node instanceof MethodInsnNode call
                        && call.name.equals("a") && call.desc.equals("([Lkt;)V")) {
                        method.instructions.insertBefore(call, new MethodInsnNode(Opcodes.INVOKESTATIC,
                            "LocalRenderScope", "watermarkSettings", "([Lkt;)[Lkt;", false));
                        changed.merge("settings", 1, Integer::sum);
                    }
                }
            }
            if (type.name.equals("cD")) {
                for (AbstractInsnNode n : method.instructions.toArray()) {
                    if (n instanceof MethodInsnNode call && call.owner.equals("org/lwjgl/opengl/Display")
                        && call.name.equals("setTitle") && call.desc.equals("(Ljava/lang/String;)V")) {
                        method.instructions.insertBefore(call, new InsnNode(Opcodes.POP));
                        method.instructions.insertBefore(call, new LdcInsnNode("Desyble"));
                        changed.merge("windowTitle", 1, Integer::sum);
                    }
                }
            }
            if (type.name.equals("po")) stripLogin(method, changed);
            if (!type.name.equals("pj")) continue;
            for (AbstractInsnNode node : method.instructions.toArray()) {
                if (node instanceof MethodInsnNode call && call.owner.equals("imgui/ImGui")
                    && call.name.equals("begin") && call.desc.equals("(Ljava/lang/String;Limgui/type/ImBoolean;I)Z")) {
                    AbstractInsnNode title = call.getPrevious().getPrevious().getPrevious().getPrevious();
                    if (!(title instanceof InvokeDynamicInsnNode dynamic)
                        || !dynamic.desc.equals("(IJ)Ljava/lang/String;")) throw new IllegalStateException("Unexpected title producer");
                    InsnList replace = new InsnList();
                    replace.add(new InsnNode(Opcodes.POP2));
                    replace.add(new InsnNode(Opcodes.POP));
                    replace.add(new LdcInsnNode("Desyble"));
                    method.instructions.insertBefore(title, replace);
                    method.instructions.remove(title);
                    changed.merge("title", 1, Integer::sum);
                }
            }
        }
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        type.accept(writer);
        return writer.toByteArray();
    }
    private static void stripLogin(MethodNode method, Map<String, Integer> changed) {
        for (AbstractInsnNode n : method.instructions.toArray()) {
            if (!(n instanceof TypeInsnNode created) || created.getOpcode() != Opcodes.NEW) continue;
            if (created.desc.equals("pI")) {
                AbstractInsnNode end = created;
                while (!(end instanceof MethodInsnNode constructor && constructor.owner.equals("pI") && constructor.name.equals("<init>"))) {
                    end = end.getNext();
                    if (end == null) throw new IllegalStateException("Login constructor not found");
                }
                AbstractInsnNode after = end.getNext();
                for (AbstractInsnNode cursor = created; cursor != after;) {
                    AbstractInsnNode next = cursor.getNext();
                    if (cursor.getOpcode() < 0) throw new IllegalStateException("Unexpected login branch boundary");
                    method.instructions.set(cursor, new InsnNode(cursor == created ? Opcodes.ACONST_NULL : Opcodes.NOP));
                    cursor = next;
                }
                MethodInsnNode open = null;
                for (AbstractInsnNode cursor = after; cursor != null; cursor = cursor.getNext()) {
                    if (cursor instanceof MethodInsnNode call && call.owner.equals("cD") && call.desc.equals("(Lop;IJ)V")) {
                        open = call;
                        break;
                    }
                }
                if (open == null) throw new IllegalStateException("Login screen opener not found");
                for (int op : new int[]{Opcodes.POP2, Opcodes.POP, Opcodes.POP, Opcodes.POP}) {
                    method.instructions.insertBefore(open, new InsnNode(op));
                }
                method.instructions.remove(open);
                changed.merge("loginAction", 1, Integer::sum);
            } else if (created.desc.equals("o_") && created.getNext().getOpcode() == Opcodes.DUP
                && created.getNext().getNext() instanceof IntInsnNode id && id.operand == 6
                && method.name.equals("o")) {
                for (AbstractInsnNode cursor = id.getNext(); cursor != null; cursor = cursor.getNext()) {
                    if (cursor instanceof MethodInsnNode call && call.owner.equals("java/util/List")
                        && call.name.equals("add") && call.desc.equals("(Ljava/lang/Object;)Z")) {
                        method.instructions.insertBefore(call, new InsnNode(Opcodes.POP2));
                        method.instructions.set(call, new InsnNode(Opcodes.ICONST_0));
                        changed.merge("loginButton", 1, Integer::sum);
                        break;
                    }
                }
            }
        }
    }
}


