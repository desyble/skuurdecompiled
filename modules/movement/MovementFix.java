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

public class lt
extends lh {
    private final kt<RB> m;
    @A
    public final R8<cq> k;
    @A
    public final R8<c8> l;
    @A
    public final R8<b7> n;
    private static final long o;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;

    public lt(int n, char c, EU eU, int n2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ o;
        super(eU);
        this.m = new kt((String)((Object)lt.a("c", (int)5935, (long)(0x2399D27507B5A5BBL ^ l))), (Object)new RB((String)((Object)lt.a("c", (int)23056, (long)(0x5BE441CB4AE26886L ^ l))), new String[]{lt.a("c", (int)29422, (long)(0xBCC7504ACC3407BL ^ l)), lt.a("c", (int)31253, (long)(0x55F85AB97B73C885L ^ l))}), (String)((Object)lt.a("c", (int)11188, (long)(0x5F21D4210381923L ^ l))));
        this.k = this::lambda$new$0;
        this.l = lt::lambda$new$1;
        this.n = lt::lambda$new$2;
        this.a(this.m);
    }

    private static void lambda$new$2(b7 b72) {
        try {
            if (dL.d()) {
                b72.a(dL.b[0]);
            }
        }
        catch (H h) {
            throw lt.a(h);
        }
    }

    private static void lambda$new$1(c8 c82) {
        try {
            if (dL.d()) {
                c82.b(dL.b[0]);
            }
        }
        catch (H h) {
            throw lt.a(h);
        }
    }

    private void lambda$new$0(cq cq2) {
        block6: {
            boolean bl;
            block5: {
                long l = o ^ 0x55A8A92C413AL;
                boolean bl2 = lj.i();
                try {
                    try {
                        bl = dL.d();
                        if (!bl2) break block5;
                        if (!bl) break block6;
                    }
                    catch (H h) {
                        throw lt.a(h);
                    }
                    bl = this.m.q().equals(lt.a("c", (int)29422, (long)(0xBCC339628064456L ^ l)));
                }
                catch (H h) {
                    throw lt.a(h);
                }
            }
            if (bl) {
                float f = dL.b[0];
                vs.a((cq)cq2, (float)f);
            }
        }
    }




    static {
        block11: {
            block10: {
                lt.o = _c.a((long)4393291538993570793L, (long)-3222110041495709489L, MethodHandles.lookup().lookupClass()).a(201909209021272L);
                lt.r = new HashMap<K, V>(13);
                var0 = lt.o ^ 2501658166743L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u0080\u00e9\u000e!\u009c\u00e4\u00d5\u00fc\u00a6<+\u001c\u00db\u009ed\u00f4\u0010\u00da8\u000b,\u008e\u00df\u00a7\u00ae{\u00a3\u00b3\u00a6jT\u0000\u0084\u0010fV\n\u007f\u00b91\u00fc\u00b8m\u0095-\u009c\t0\u0014\u00c6";
                var8_6 = "\u0080\u00e9\u000e!\u009c\u00e4\u00d5\u00fc\u00a6<+\u001c\u00db\u009ed\u00f4\u0010\u00da8\u000b,\u008e\u00df\u00a7\u00ae{\u00a3\u00b3\u00a6jT\u0000\u0084\u0010fV\n\u007f\u00b91\u00fc\u00b8m\u0095-\u009c\t0\u0014\u00c6".length();
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
                    var9_3[var7_4++] = lt.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ber\u00a0rVw{2\u00e6\u001b\u00a7]\u0019\u00a5_\u007f\u00a0\u00a0\u009a\u00c6\u00e6\u00b6\u00c9\u000f\u00ff]\u00c7Y\u00b3\u00bae\u00180G\u008c\u00c8'\u00db\u00fc\u00c1\u00a0(\u000fK\u00bd}\u00a3\u00a7\u00c0-\n\u00b5\u009b\u00d2o\u00b7\u0010\u00a5$\u00a0\u0002P;\u0010\u009f9J}\u00f364\u00cb]";
                    var8_6 = "\u00ber\u00a0rVw{2\u00e6\u001b\u00a7]\u0019\u00a5_\u007f\u00a0\u00a0\u009a\u00c6\u00e6\u00b6\u00c9\u000f\u00ff]\u00c7Y\u00b3\u00bae\u00180G\u008c\u00c8'\u00db\u00fc\u00c1\u00a0(\u000fK\u00bd}\u00a3\u00a7\u00c0-\n\u00b5\u009b\u00d2o\u00b7\u0010\u00a5$\u00a0\u0002P;\u0010\u009f9J}\u00f364\u00cb]".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = lt.a(var10_9).intern();
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
        lt.p = var9_3;
        lt.q = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44BF;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])r.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lt", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            lt.q[n2] = lt.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lt.a(n, l);
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
            throw new RuntimeException("lt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lt.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
