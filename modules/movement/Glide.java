import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lE
extends lh {
    private final kt<RB> n;
    private int l;
    private int m;
    private int o;
    @A
    public final R8<b5> k;
    private static final long p;
    private static final String[] q;
    private static final String[] r;
    private static final Map s;

    public lE(short s, EU eU, short s2, int n) {
        long l = ((long)s << 48 | (long)s2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ p;
        super(eU);
        this.n = new kt((String)((Object)lE.a("b", (int)24653, (long)(0x7073A07138889402L ^ l))), (Object)new RB((String)((Object)lE.a("b", (int)1920, (long)(0x18665334D3E73C0L ^ l))), new String[]{lE.a("b", (int)29102, (long)(0x2DA7BDC73B4485E3L ^ l)), lE.a("b", (int)22678, (long)(0x19898B232A52CDCL ^ l)), lE.a("b", (int)17649, (long)(0x503A81E7731430B8L ^ l)), lE.a("b", (int)4125, (long)(0x914C73D3C766453L ^ l))}), (String)((Object)lE.a("b", (int)5576, (long)(0x7E1CDC0435296180L ^ l))));
        this.l = 0;
        this.m = 0;
        this.o = 0;
        this.k = this::lambda$new$0;
        this.a(new kt[]{this.n});
    }

    public void d(int n, int n2, int n3) {
        long l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
        long l2 = l ^ 0L;
        int n4 = (int)(l2 >>> 32);
        int n5 = (int)(l2 << 32 >>> 48);
        int n6 = (int)(l2 << 48 >>> 48);
        super.d(n4, n5, n6);
        this.l = 0;
        this.m = 0;
        this.o = 0;
    }

    public void a(char c, long l) {
        long l2 = (long)c << 48 | l << 16 >>> 16;
        long l3 = l2 ^ 0L;
        int n = (int)(l3 >>> 48);
        long l4 = l3 << 16 >>> 16;
        super.a((char)n, l4);
        Hk.b().ay.h = 1.0f;
        this.l = 0;
        this.m = 0;
        this.o = 0;
    }

    private void a(double d) {
        try {
            if (!tB.c()) {
                return;
            }
        }
        catch (H h) {
            throw lE.a(h);
        }
        double d2 = this.a();
        Hk.j().D = (double)(-rO.a((float)((float)d2))) * d;
        Hk.j().ac = (double)rO.g((float)((float)d2)) * d;
    }




    private double a() {
        block21: {
            block19: {
                block20: {
                    block18: {
                        block17: {
                            block16: {
                                block14: {
                                    block15: {
                                        var2_1 = Hk.j().H;
                                        var1_2 = lj.i();
                                        try {
                                            v0 = Hk.j().bl;
                                            if (!var1_2) break block14;
                                            if (!(v0 < 0.0f)) break block15;
                                        }
                                        catch (H v1) {
                                            throw lE.a(v1);
                                        }
                                        var2_1 += 180.0f;
                                    }
                                    v0 = 1.0f;
                                }
                                var3_3 = v0;
                                try {
                                    cfr_temp_0 = Hk.j().bl - 0.0f;
                                    v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                    if (!var1_2) break block16;
                                    if (v2 < 0) {
                                    }
                                    ** GOTO lbl27
                                }
                                catch (H v3) {
                                    throw lE.a(v3);
                                }
                                var3_3 = -0.5f;
                                try {
                                    if (var1_2) break block17;
lbl27:


                                    v2 = (cfr_temp_1 = Hk.j().bl - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                }
                                catch (H v4) {
                                    throw lE.a(v4);
                                }
                            }
                            try {
                                if (!var1_2) break block18;
                                if (v2 <= 0) break block17;
                            }
                            catch (H v5) {
                                throw lE.a(v5);
                            }
                            var3_3 = 0.5f;
                        }
                        v2 = (cfr_temp_2 = Hk.j().bc - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                    }
                    try {
                        if (!var1_2) break block19;
                        if (v2 <= 0) break block20;
                    }
                    catch (H v6) {
                        throw lE.a(v6);
                    }
                    var2_1 -= 70.0f * var3_3;
                }
                try {
                    v7 = Hk.j().bc;
                    if (!var1_2) break block21;
                    cfr_temp_3 = v7 - 0.0f;
                    v2 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                }
                catch (H v8) {
                    throw lE.a(v8);
                }
            }
            if (v2 < 0) {
                var2_1 += 70.0f * var3_3;
            }
            v7 = var2_1;
        }
        return Math.toRadians(v7);
    }




    private void lambda$new$0(b5 var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }




    static {
        block11: {
            block10: {
                lE.p = _c.a((long)-7187061321803391826L, (long)-6135126815934612123L, MethodHandles.lookup().lookupClass()).a(272739660823675L);
                lE.s = new HashMap<K, V>(13);
                var0 = lE.p ^ 70125153260962L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u00ed\u001f/\u0086D\u00cb\u00db\u00c6\u00edz_\u00df\u0001\u00b0\u009a\t \u00e6\"\u001387\"\u0087E7\u0017j0\u00cb\u00cc2\u00dd\b\u00dc\u00ba9&}\u00e5\u0015\u00f0\u008ey\u00c8T\u00d1\u00e0\u000f\u0010\u00cc\u00edxW\u00cb\u00a97\u007f\u00d3\u0088:\u00eb\u00cf\u00f2\u0084<\u0010\u00f2\u00f0\u00f5\u00ee\u00ff\u001e\u00aek\u0013\u00035\u00e3E[+u\u0010\u00ea\u00ad\u00a0n\u00c5i\u009f\u0082F\u00a9,\u0080\u0090\u00a8Dk \u008cW,d\u00b2\u009b\u00e14\u00d0W:\u00ee\r\u00e1\u0088\u0085\u00e0\u0093\u00eb\u00c5\u008d\u00c7\u00e0\u00b6x\u00dcq\u00a6\u00b0{\u00af\u0096\u0010\u00f9\u00a9\u009b\u00be\u0011'W\\\u00bf\\\u00c9BM3*\u00ac |\u00fa\u0096\u00e5\u00f3r5+&\u00fcFb\u00b7y\u00fc`\u00c0\u0080\u009d\u00a9\u0090?\u00f8\u0089\u0019V\u00d2`5n5z";
                var8_6 = "\u00ed\u001f/\u0086D\u00cb\u00db\u00c6\u00edz_\u00df\u0001\u00b0\u009a\t \u00e6\"\u001387\"\u0087E7\u0017j0\u00cb\u00cc2\u00dd\b\u00dc\u00ba9&}\u00e5\u0015\u00f0\u008ey\u00c8T\u00d1\u00e0\u000f\u0010\u00cc\u00edxW\u00cb\u00a97\u007f\u00d3\u0088:\u00eb\u00cf\u00f2\u0084<\u0010\u00f2\u00f0\u00f5\u00ee\u00ff\u001e\u00aek\u0013\u00035\u00e3E[+u\u0010\u00ea\u00ad\u00a0n\u00c5i\u009f\u0082F\u00a9,\u0080\u0090\u00a8Dk \u008cW,d\u00b2\u009b\u00e14\u00d0W:\u00ee\r\u00e1\u0088\u0085\u00e0\u0093\u00eb\u00c5\u008d\u00c7\u00e0\u00b6x\u00dcq\u00a6\u00b0{\u00af\u0096\u0010\u00f9\u00a9\u009b\u00be\u0011'W\\\u00bf\\\u00c9BM3*\u00ac |\u00fa\u0096\u00e5\u00f3r5+&\u00fcFb\u00b7y\u00fc`\u00c0\u0080\u009d\u00a9\u0090?\u00f8\u0089\u0019V\u00d2`5n5z".length();
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
                    var9_3[var7_4++] = lE.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00966\u00fa\b@\u00ee X?!\u0004\u00a6\u0004\u00c4\"M\u0010\u00cd\u0014\u00a1\u0098\u008comNf\u00b7H\u00c5$\u00a9\u0086E";
                    var8_6 = "\u00966\u00fa\b@\u00ee X?!\u0004\u00a6\u0004\u00c4\"M\u0010\u00cd\u0014\u00a1\u0098\u008comNf\u00b7H\u00c5$\u00a9\u0086E".length();
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
                    var9_3[var7_4++] = lE.a(var10_9).intern();
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
        lE.q = var9_3;
        lE.r = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A23;
        if (r[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lE", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = q[n2].getBytes("ISO-8859-1");
            lE.r[n2] = lE.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lE.a(n, l);
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
            throw new RuntimeException("lE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lE.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
