import imgui.ImGui;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.lwjgl.opengl.GL11;

public class hV {
    private static hV h;
    private final List<HG> i = new ArrayList<HG>(32);
    private final List<HG> a = new ArrayList<HG>(8);
    private final aP e = new aP();
    private final Tw f = new Tw();
    private long c = System.nanoTime();
    private long k = 0L;
    public static boolean g;
    private final List<Runnable> j = new ArrayList<Runnable>();
    private final List<Runnable> d = new ArrayList<Runnable>();
    private static LQ[] b;
    private static final long l;

    private hV() {
    }

    public static hV d() {
        hV hV2;
        block4: {
            block5: {
                LQ[] lQArray = hV.c();
                try {
                    try {
                        hV2 = h;
                        if (lQArray == null) break block4;
                        if (hV2 != null) break block5;
                    }
                    catch (H h) {
                        throw hV.a(h);
                    }
                    h = new hV();
                }
                catch (H h) {
                    throw hV.a(h);
                }
            }
            hV2 = h;
        }
        return hV2;
    }

    public void b(long l, int n) {
        long l2;
        long l3 = l2 = (l << 32 | (long)n << 32 >>> 32) ^ hV.l;
        long l4 = l3 ^ 0x6F7BFB967BF2L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 32);
        int n4 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0x778A51449DBCL;
        int n5 = (int)(l5 >>> 32);
        long l6 = l5 << 32 >>> 32;
        ImGui.createContext();
        this.f.a(n5, l6);
        this.e.e((short)n2, n3, n4);
        ImGui.init();
        this.c = System.nanoTime();
    }

    public void b(Runnable runnable) {
        this.j.add(runnable);
    }

    public void a(int n, Runnable runnable) {
        block2: {
            int n2;
            block3: {
                LQ[] lQArray = hV.c();
                try {
                    n2 = n;
                    if (lQArray == null) break block2;
                    if (n2 > 0) break block3;
                }
                catch (H h) {
                    throw hV.a(h);
                }
                return;
            }
            n2 = this.j.add(() -> hV.lambda$draw$0(n, runnable)) ? 1 : 0;
        }
    }

    public void a(Runnable runnable) {
        this.d.add(runnable);
    }

    public void a(HG hG) {
        this.a.add(hG);
    }







    public void b(Uf var1_1) {
        block45: {
            block43: {
                block42: {
                    block50: {
                        block49: {
                            block41: {
                                block40: {
                                    block47: {
                                        block46: {
                                            v0 = hV.c();
                                            yS.a();
                                            var2_2 = v0;
                                            v1 = hV.g;
                                            if (var2_2 == null) break block40;
                                            if (v1) ** GOTO lbl25
                                            break block46;
                                            catch (Throwable v2) {
                                                throw hV.a(v2);
                                            }
                                        }
                                        v1 = ImGui.getIO().getFonts().isBuilt();
                                        if (var2_2 == null) break block40;
                                        break block47;
                                        catch (Throwable v3) {
                                            throw hV.a(v3);
                                        }
                                    }
                                    try {
                                        block48: {
                                            if (v1) break block41;
                                            break block48;
                                            catch (Throwable v4) {
                                                throw hV.a(v4);
                                            }
                                        }
                                        ImGui.getIO().getFonts().build();
                                        this.e.r();
                                        v1 = false;
                                    }
                                    catch (Throwable v5) {
                                        throw hV.a(v5);
                                    }
                                }
                                hV.g = v1;
                                return;
                            }
                            var3_3 = System.nanoTime();
                            try {
                                if (ImGui.getIO().getWantTextInput()) {
                                    this.k = System.currentTimeMillis();
                                }
                            }
                            catch (Throwable v6) {
                                throw hV.a(v6);
                            }
                            var5_4 = (float)(var3_3 - this.c) / 1.0E9f;
                            this.c = var3_3;
                            v7 = var5_4;
                            if (var2_2 == null) break block42;
                            if (v7 <= 0.0f) ** GOTO lbl67
                            break block49;
                            catch (Throwable v8) {
                                throw hV.a(v8);
                            }
                        }
                        v7 = var5_4;
                        if (var2_2 == null) break block42;
                        break block50;
                        catch (Throwable v9) {
                            throw hV.a(v9);
                        }
                    }
                    try {
                        block51: {
                            if (!(v7 > 1.0f)) break block43;
                            break block51;
                            catch (Throwable v10) {
                                throw hV.a(v10);
                            }
                        }
                        v7 = 0.016666668f;
                    }
                    catch (Throwable v11) {
                        throw hV.a(v11);
                    }
                }
                var5_4 = v7;
            }
            ri.I();
            this.f.a((float)var1_1.g, (float)var1_1.b, var5_4);
            ImGui.newFrame();
            try {
                block44: {
                    var6_5 = this.i.iterator();
                    while (var6_5.hasNext()) {
                        var7_8 = var6_5.next();
                        try {
                            var7_8.a();
                            if (var2_2 != null) {
                                if (var2_2 != null) continue;
                                break;
                            }
                            break block44;
                        }
                        catch (Throwable v12) {
                            throw hV.a(v12);
                        }
                    }
                    var6_5 = this.j.iterator();
                }
                while (var6_5.hasNext()) {
                    var7_10 = (Runnable)var6_5.next();
                    try {
                        var7_10.run();
                        if (var2_2 != null) {
                            if (var2_2 != null) continue;
                            break;
                        }
                        break block45;
                    }
                    catch (Throwable v13) {
                        throw hV.a(v13);
                    }
                }
                this.i.clear();
                this.j.clear();
            }
            catch (Throwable var6_6) {
                this.i.clear();
                this.j.clear();
                catch (Throwable var8_13) {
                    this.i.clear();
                    this.j.clear();
                    throw var8_13;
                }
            }
        }
        ImGui.render();
        this.e.a(Objects.requireNonNull(ImGui.getDrawData()));
        ri.g();
        try {
            for (HG var7_12 : this.a) {
                try {
                    var7_12.a();
                    if (var2_2 == null) return;
                    if (var2_2 != null) continue;
                    return;
                }
                catch (Throwable v14) {
                    throw hV.a(v14);
                    return;
                }
            }
        }
        catch (Throwable var6_7) {
            return;
        }
        finally {
            this.a.clear();
        }
    }





    public void a(Uf var1_1) {
        block51: {
            block49: {
                block47: {
                    block45: {
                        block44: {
                            block43: {
                                block41: {
                                    block42: {
                                        block39: {
                                            block40: {
                                                block38: {
                                                    block53: {
                                                        block52: {
                                                            v0 = hV.c();
                                                            yS.a();
                                                            var2_2 = v0;
                                                            v1 = hV.g;
                                                            if (var2_2 == null) break block38;
                                                            if (v1) ** GOTO lbl25
                                                            break block52;
                                                            catch (Throwable v2) {
                                                                throw hV.a(v2);
                                                            }
                                                        }
                                                        v3 = ImGui.getIO().getFonts().isBuilt();
                                                        if (var2_2 == null) break block39;
                                                        break block53;
                                                        catch (Throwable v4) {
                                                            throw hV.a(v4);
                                                        }
                                                    }
                                                    try {
                                                        block54: {
                                                            if (v3) break block40;
                                                            break block54;
                                                            catch (Throwable v5) {
                                                                throw hV.a(v5);
                                                            }
                                                        }
                                                        ImGui.getIO().getFonts().build();
                                                        this.e.r();
                                                        v1 = false;
                                                    }
                                                    catch (Throwable v6) {
                                                        throw hV.a(v6);
                                                    }
                                                }
                                                hV.g = v1;
                                                return;
                                            }
                                            v3 = this.d.isEmpty();
                                        }
                                        try {
                                            if (var2_2 == null) break block41;
                                            if (!v3) break block42;
                                        }
                                        catch (Throwable v7) {
                                            throw hV.a(v7);
                                        }
                                        return;
                                    }
                                    v3 = GL11.glGetBoolean((int)2929);
                                }
                                var3_3 = v3;
                                var4_4 = GL11.glGetBoolean((int)2896);
                                var5_5 = GL11.glGetBoolean((int)3008);
                                var6_6 = GL11.glGetBoolean((int)3042);
                                ri.r();
                                ri.h();
                                ri.q();
                                ri.b((int)770, (int)771, (int)1, (int)0);
                                ri.I();
                                this.f.a((float)var1_1.g, (float)var1_1.b, 0.016666668f);
                                ImGui.newFrame();
                                try {
                                    for (Runnable var8_9 : this.d) {
                                        try {
                                            var8_9.run();
                                            if (var2_2 != null) {
                                                if (var2_2 != null) continue;
                                                break;
                                            }
                                            break block43;
                                        }
                                        catch (Throwable v8) {
                                            throw hV.a(v8);
                                        }
                                    }
                                    this.d.clear();
                                }
                                catch (Throwable var7_8) {
                                    this.d.clear();
                                    catch (Throwable var9_10) {
                                        this.d.clear();
                                        throw var9_10;
                                    }
                                }
                            }
                            try {
                                try {
                                    ImGui.render();
                                    this.e.a(Objects.requireNonNull(ImGui.getDrawData()));
                                    if (var2_2 == null) break block44;
                                    if (var3_3) {
                                    }
                                    ** GOTO lbl96
                                }
                                catch (Throwable v9) {
                                    throw hV.a(v9);
                                }
                                ri.H();
                            }
                            catch (Throwable v10) {
                                throw hV.a(v10);
                            }
                        }
                        try {
                            if (var2_2 != null) break block45;
lbl96:


                            ri.r();
                        }
                        catch (Throwable v11) {
                            throw hV.a(v11);
                        }
                    }
                    try {
                        block46: {
                            try {
                                if (!var4_4) break block46;
                                ri.z();
                                if (var2_2 != null) break block47;
                            }
                            catch (Throwable v12) {
                                throw hV.a(v12);
                            }
                        }
                        ri.h();
                    }
                    catch (Throwable v13) {
                        throw hV.a(v13);
                    }
                }
                try {
                    block48: {
                        try {
                            if (!var5_5) break block48;
                            ri.g();
                            if (var2_2 != null) break block49;
                        }
                        catch (Throwable v14) {
                            throw hV.a(v14);
                        }
                    }
                    ri.I();
                }
                catch (Throwable v15) {
                    throw hV.a(v15);
                }
            }
            try {
                block50: {
                    try {
                        if (!var6_6) break block50;
                        ri.q();
                        if (var2_2 != null) break block51;
                    }
                    catch (Throwable v16) {
                        throw hV.a(v16);
                    }
                }
                ri.a();
            }
            catch (Throwable v17) {
                throw hV.a(v17);
            }
        }
    }

    public void a(float f) {
        this.f.a(f / 120.0f);
    }

    public void a(int n) {
        this.f.a(n);
    }

    public long a() {
        return this.k;
    }




    private static void lambda$draw$0(int n, Runnable runnable) {
        float f;
        float f2;
        block7: {
            block8: {
                f2 = (float)n / 255.0f;
                LQ[] lQArray = hV.c();
                float f3 = f2 - 1.0f;
                f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                if (lQArray == null) break block7;
                try {
                    block10: {
                        if (f < 0) break block8;
                        break block10;
                        catch (H h) {
                            throw hV.a(h);
                        }
                    }
                    runnable.run();
                    return;
                }
                catch (H h) {
                    throw hV.a(h);
                }
            }
            f = 0.0f;
        }
        ImGui.pushStyleVar((int)f, (float)f2);
        try {
            runnable.run();
        }
        finally {
            ImGui.popStyleVar();
        }
    }

    static {
        l = _c.a((long)-2545659982949404748L, (long)43947175241703857L, MethodHandles.lookup().lookupClass()).a(62541254887828L);
        g = false;
        hV.b(new LQ[2]);
    }

    public static void b(LQ[] lQArray) {
        b = lQArray;
    }

    public static LQ[] c() {
        return b;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}
