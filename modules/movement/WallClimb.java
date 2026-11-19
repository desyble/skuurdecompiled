import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lD
extends lh {
    private final kt<RB> r;
    private final kt<Number> k;
    private boolean m;
    private final Queue<I2<?>> l;
    private boolean o;
    private boolean n;
    @A
    public final R8<b5> q;
    @A
    public final R8<bR> p;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;

    public lD(long l, int n, EU eU) {
        long l2 = (l << 32 | (long)n << 32 >>> 32) ^ s;
        super(eU);
        this.r = new kt((String)((Object)lD.a("c", (int)30332, (long)(0x5585A0AF77D35552L ^ l2))), (Object)new RB((String)((Object)lD.a("c", (int)25370, (long)(0x6FE038C582574032L ^ l2))), new String[]{lD.a("c", (int)25370, (long)(0x6FE038C582574032L ^ l2)), lD.a("c", (int)25770, (long)(0x6D43043EE18DC787L ^ l2)), lD.a("c", (int)32173, (long)(0x258B224B0DA9DE81L ^ l2)), lD.a("c", (int)13768, (long)(0x3F02AA1B19D216EFL ^ l2))}), (String)((Object)lD.a("c", (int)12955, (long)(0x5757FA5D974491B4L ^ l2))));
        this.k = new kt((String)((Object)lD.a("c", (int)10272, (long)(0x188BC5A796580B05L ^ l2))), (Object)0.3, (String)((Object)lD.a("c", (int)21442, (long)(0x49B84ED9628A70E9L ^ l2))), 0.05, 0.1, 1.0, this::lambda$new$0);
        this.l = new ConcurrentLinkedQueue();
        this.o = false;
        this.n = false;
        this.q = this::lambda$new$1;
        this.p = this::lambda$new$2;
        this.a(new kt[]{this.r, this.k});
    }

    private boolean a(I2<?> i2) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2 = lj.i();
                try {
                    bl = Hk.b().ay();
                    if (!bl2) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw lD.a(h);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private void b() {
        this.o = false;
        boolean bl = lj.i();
        while (!this.l.isEmpty()) {
            Ab.b(this.l.poll());
            if (bl) continue;
        }
    }

    public void d(int n, int n2, int n3) {
        this.m = false;
        this.l.clear();
        this.o = false;
        this.n = false;
    }

    public void a(char c, long l) {
        this.m = false;
        this.b();
        this.l.clear();
        this.o = false;
        this.n = false;
    }

    private void lambda$new$2(bR bR2) {
        block13: {
            boolean bl;
            boolean bl2;
            block12: {
                long l = s ^ 0x5F808DEE1F56L;
                bl2 = lj.k();
                try {
                    if (Hk.j() == null) {
                        return;
                    }
                }
                catch (H h) {
                    throw lD.a(h);
                }
                try {
                    try {
                        bl = this.r.q().equals(lD.a("c", (int)3603, (long)(0x58E4AA82936B3DCL ^ l)));
                        if (bl2) break block12;
                        if (!bl) break block13;
                    }
                    catch (H h) {
                        throw lD.a(h);
                    }
                    bl = this.o;
                }
                catch (H h) {
                    throw lD.a(h);
                }
            }
            if (bl) {
                I2 i2 = bR2.a();
                try {
                    boolean bl3;
                    try {
                        bl3 = this.a(i2);
                        if (bl2 || !bl3) break block13;
                    }
                    catch (H h) {
                        throw lD.a(h);
                    }
                    bR2.a(true);
                    bl3 = this.l.add(i2);
                }
                catch (H h) {
                    throw lD.a(h);
                }
            }
        }
    }




    private void lambda$new$1(b5 var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private boolean lambda$new$0() {
        long l = s ^ 0x325541D7F774L;
        return this.r.q().equals(lD.a("c", (int)25370, (long)(0x6FE039C9060136F6L ^ l)));
    }




    static {
        block11: {
            block10: {
                lD.s = _c.a((long)7963334643254982755L, (long)-2109489997873280072L, MethodHandles.lookup().lookupClass()).a(184305246184243L);
                lD.v = new HashMap<K, V>(13);
                var0 = lD.s ^ 120383294192555L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00161N7\u00e0\u0092\u001fa\u00a6\u0000%CA\u00ed\u00fa\u0090 \u00df\u00c5\u00d7\u0093\u00d7\u00c0\u00be)W\u00b3\u0005\u0084\u00f1\u00be\u0002n\u00b3\u001dx0)P\u00c8\u00bfB\u00d7\u00f1ntM&_\u0010\u001d\u008d\u0084?IvJ\u00f5 t\u008f\t\u0098W\u00112\u0010\u00f1\u00a1\u00dc\u008c\u00d3>\u00bb\u00af\u00ba\u00b5\u00df\u00bd\u0003\u0087\u00b6K\u0010R\u00f4\u009a\u001a\u00b6\u0093M\u00a2\u00dcKz\u00c6\u009a\u008f\u00e4\u00d9(\u0018\u00c3\u00e1\u00db\u001cZ\u0091c\u00d3\u00d8\u00dd@\u00a1\u00ebv\u00b3e\u00ee\u00cb\u00f5\u000f\u00df+\u0092\u00f1@\u00d4\u001cV%\u00a9\u009f\u00db\u00c1\u008f\u00bc_\u00fd\u0005\u00e6\u0010\u00a7!\u00ecd\u00f1,\u00b4\u00c9\u008f\u0015\u00e9\u009e\u00e56\u0099\u00f4\u0010\u00e34\u00bd\u00c3\u00f7\u00c7\u00c8!\u000f\u000e\u00af\u00a5((N\u00ca\u0010\u0089\u00b3\u00af$\u00a8\u0010\u00b6\u0098\u00b3\u00a5\u00c1\u00d3\u00e0'\u0018\u0088\u0010I\u00bcd|\u001a&\u00978QL\u0087\u0098\u0004\u000f]\u0004";
                var8_6 = "\u00161N7\u00e0\u0092\u001fa\u00a6\u0000%CA\u00ed\u00fa\u0090 \u00df\u00c5\u00d7\u0093\u00d7\u00c0\u00be)W\u00b3\u0005\u0084\u00f1\u00be\u0002n\u00b3\u001dx0)P\u00c8\u00bfB\u00d7\u00f1ntM&_\u0010\u001d\u008d\u0084?IvJ\u00f5 t\u008f\t\u0098W\u00112\u0010\u00f1\u00a1\u00dc\u008c\u00d3>\u00bb\u00af\u00ba\u00b5\u00df\u00bd\u0003\u0087\u00b6K\u0010R\u00f4\u009a\u001a\u00b6\u0093M\u00a2\u00dcKz\u00c6\u009a\u008f\u00e4\u00d9(\u0018\u00c3\u00e1\u00db\u001cZ\u0091c\u00d3\u00d8\u00dd@\u00a1\u00ebv\u00b3e\u00ee\u00cb\u00f5\u000f\u00df+\u0092\u00f1@\u00d4\u001cV%\u00a9\u009f\u00db\u00c1\u008f\u00bc_\u00fd\u0005\u00e6\u0010\u00a7!\u00ecd\u00f1,\u00b4\u00c9\u008f\u0015\u00e9\u009e\u00e56\u0099\u00f4\u0010\u00e34\u00bd\u00c3\u00f7\u00c7\u00c8!\u000f\u000e\u00af\u00a5((N\u00ca\u0010\u0089\u00b3\u00af$\u00a8\u0010\u00b6\u0098\u00b3\u00a5\u00c1\u00d3\u00e0'\u0018\u0088\u0010I\u00bcd|\u001a&\u00978QL\u0087\u0098\u0004\u000f]\u0004".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:


                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:


                while (true) {
                    var9_3[var7_4++] = lD.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b8\u00f0\u00bal5u^E\u001c;\u0097\u00f0\u00a5\u0003<\u0088\u0010ekLg\u00cf\u00c8\u00dbb\u008b\u0014\u0095G\u00c32\u00af\u0090";
                    var8_6 = "\u00b8\u00f0\u00bal5u^E\u001c;\u0097\u00f0\u00a5\u0003<\u0088\u0010ekLg\u00cf\u00c8\u00dbb\u008b\u0014\u0095G\u00c32\u00af\u0090".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:


                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:


                while (true) {
                    var9_3[var7_4++] = lD.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:


                ** continue;
            }
        }
        lD.t = var9_3;
        lD.u = new String[12];
    }

    private static H a(H h) {
        return h;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x526;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lD", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = t[n2].getBytes("ISO-8859-1");
            lD.u[n2] = lD.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lD.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("lD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
