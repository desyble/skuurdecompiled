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
import org.lwjgl.input.Mouse;

public class lS
extends lh {
    private final kt<Number> l;
    private final kt<Boolean> m;
    private final kt<Boolean> n;
    @A
    public final R8<TN> k;
    private static final long o;
    private static final String[] p;
    private static final String[] q;
    private static final Map r;

    public lS(EU eU, int n, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ o;
        super(eU);
        this.l = new kt((String)((Object)lS.a("u", (int)25924, (long)(0x12E5D4E616E882ECL ^ l))), (Object)0.01, (String)((Object)lS.a("u", (int)6722, (long)(0x7BCE32EF643FDECL ^ l))), 0.01, 0.01, 1.0);
        this.m = new kt((String)((Object)lS.a("u", (int)26791, (long)(0x6E7BEE0B51BD8F0CL ^ l))), (Object)true, (String)((Object)lS.a("u", (int)10000, (long)(0x4A9299073B9240BFL ^ l))));
        this.n = new kt((String)((Object)lS.a("u", (int)22709, (long)(0x71149E3AE6CCBF1FL ^ l))), (Object)false, (String)((Object)lS.a("u", (int)23713, (long)(0x1C7865273706BB08L ^ l))));
        this.k = this::lambda$new$0;
        this.a(new kt[]{this.l, this.m, this.n});
    }

    private void lambda$new$0(TN tN) {
        block13: {
            double d;
            TN tN2;
            block12: {
                Object object;
                int[] nArray;
                block10: {
                    block11: {
                        nArray = lX.f();
                        try {
                            try {
                                try {
                                    object = this.m;
                                    if (nArray != null) break block10;
                                    if (object.g()) break block11;
                                }
                                catch (H h) {
                                    throw lS.a(h);
                                }
                                if (!Mouse.isButtonDown((int)1)) break block11;
                            }
                            catch (H h) {
                                throw lS.a(h);
                            }
                            return;
                        }
                        catch (H h) {
                            throw lS.a(h);
                        }
                    }
                    object = this.l;
                }
                double d2 = object.f();
                try {
                    try {
                        tN2 = tN;
                        d = d2;
                        if (nArray != null) break block12;
                        tN2.a((float)d);
                        if (!((Boolean)this.n.i()).booleanValue()) break block13;
                    }
                    catch (H h) {
                        throw lS.a(h);
                    }
                    tN2 = tN;
                    d = tN.b() - d2;
                }
                catch (H h) {
                    throw lS.a(h);
                }
            }
            tN2.a(d);
        }
    }




    static {
        block11: {
            block10: {
                lS.o = _c.a((long)-8558948619670795305L, (long)-2347775897822919221L, MethodHandles.lookup().lookupClass()).a(108262466716551L);
                lS.r = new HashMap<K, V>(13);
                var0 = lS.o ^ 95620752677502L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00fbm\f5\u00e9\n\u00c7\u00e7\u007f\u008enE(\u00d7\u00d28H\u00dd\u000bdQ;\u00e8\u00d4\u00f4\u00d3d\u009cP\u0097>\u00bb\u0018\u000f\u00d1\u001e\u001b\u0098;8\u0019\u0083_\u00e0iy\u00e0L\u00fb%|e\u0012\u00fe\u001f\u00b1\u00e7\u0018\u00ed\u001e\u00cf\u00b6\u0000m\u00b5 \u00d1\u00fe\u00c6m\u00a8\u00d8\u00abT\u00c9a\u00c1\u0086GO\u000b\u0089X\u009eB\u00bd\u00e6\u0001\u00b5\u00fd\u00c3\u0091\u0088\u00a8\u00e27\u0084\u008f\u008e\u00a8\u0097\u00e0\u00d2\u0016z\u00b6\u0085\u0098\u00ca6\u00f7\u00ad\u009f\u001b\u00a3\b8\u00f0*\u00d1\\\u007f \u00b1c9Z\u008d.5w\u0010\u00ce\u00b6H\u00d0\u0090\u00df\u00fd\u00b3\u0093YT@\u0011\u008c\"\u00ece\u001dT\u000fB\u00fb\u00ee\u00bb/\\\u000e\u0016\u00b8WA\u00fc\u00e9\u00dd\u00c2\u00c3>\u00d7\u0019";
                var8_6 = "\u00fbm\f5\u00e9\n\u00c7\u00e7\u007f\u008enE(\u00d7\u00d28H\u00dd\u000bdQ;\u00e8\u00d4\u00f4\u00d3d\u009cP\u0097>\u00bb\u0018\u000f\u00d1\u001e\u001b\u0098;8\u0019\u0083_\u00e0iy\u00e0L\u00fb%|e\u0012\u00fe\u001f\u00b1\u00e7\u0018\u00ed\u001e\u00cf\u00b6\u0000m\u00b5 \u00d1\u00fe\u00c6m\u00a8\u00d8\u00abT\u00c9a\u00c1\u0086GO\u000b\u0089X\u009eB\u00bd\u00e6\u0001\u00b5\u00fd\u00c3\u0091\u0088\u00a8\u00e27\u0084\u008f\u008e\u00a8\u0097\u00e0\u00d2\u0016z\u00b6\u0085\u0098\u00ca6\u00f7\u00ad\u009f\u001b\u00a3\b8\u00f0*\u00d1\\\u007f \u00b1c9Z\u008d.5w\u0010\u00ce\u00b6H\u00d0\u0090\u00df\u00fd\u00b3\u0093YT@\u0011\u008c\"\u00ece\u001dT\u000fB\u00fb\u00ee\u00bb/\\\u000e\u0016\u00b8WA\u00fc\u00e9\u00dd\u00c2\u00c3>\u00d7\u0019".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = lS.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "s5\u00e9\u00c9\u00b1\u0017\u00d6\u00d9\u00ac\u00bd\u008aN\u00a5\u0083\u00ca~n\u0019'\u0094\u0091&\u00c3\u00d1/\u00cb\u001e\u00cdt:ad\u00f3\u008d#4\u00db\u0017\u00e7\u00d1\u00a1\u00da\u00c1\u0088\u0000\u001a&(\u00ba\u007f\u00f3\u008cE\u00d8lxY\u00de\u00b8\u00fbZ\u00a4\u00cd\u0003\u00d3\u00c4 \u0086\u00ab\u00d5\u00cdEb\u00dd\u00acb ~\u00dbP`\t\u00eb\u00ed\u0086\u00870e\u0083\u00ba]\u00baI=#3`\u00e2\u00d0\u00d7\u00c8\u00ac\u00d2\u00c3EMJ\u000e\u00a7=\u00fe76H\u00af\u0013\u0017\u00b3\u00e2O\u00d7\u001dv\u00ec\u0015\u00d8r\u00fad\u00eb\u00b7H\n#\u00ad\u00c4\u0098eR4\u0013!\u00d3\u00eb{\u00ea!K\u00bao\u00c1\u00f4\u009dzr\u00f9\u00a9\u0095\u00fb\u00c0\u00b2\u008c\u0019\u00ba&\u00cf\u0092\u00fe\u00a4\u0086\u00941\u00884\u00c1\u00fb\u008a";
                    var8_6 = "s5\u00e9\u00c9\u00b1\u0017\u00d6\u00d9\u00ac\u00bd\u008aN\u00a5\u0083\u00ca~n\u0019'\u0094\u0091&\u00c3\u00d1/\u00cb\u001e\u00cdt:ad\u00f3\u008d#4\u00db\u0017\u00e7\u00d1\u00a1\u00da\u00c1\u0088\u0000\u001a&(\u00ba\u007f\u00f3\u008cE\u00d8lxY\u00de\u00b8\u00fbZ\u00a4\u00cd\u0003\u00d3\u00c4 \u0086\u00ab\u00d5\u00cdEb\u00dd\u00acb ~\u00dbP`\t\u00eb\u00ed\u0086\u00870e\u0083\u00ba]\u00baI=#3`\u00e2\u00d0\u00d7\u00c8\u00ac\u00d2\u00c3EMJ\u000e\u00a7=\u00fe76H\u00af\u0013\u0017\u00b3\u00e2O\u00d7\u001dv\u00ec\u0015\u00d8r\u00fad\u00eb\u00b7H\n#\u00ad\u00c4\u0098eR4\u0013!\u00d3\u00eb{\u00ea!K\u00bao\u00c1\u00f4\u009dzr\u00f9\u00a9\u0095\u00fb\u00c0\u00b2\u008c\u0019\u00ba&\u00cf\u0092\u00fe\u00a4\u0086\u00941\u00884\u00c1\u00fb\u008a".length();
                    var5_7 = 80;
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
                    var9_3[var7_4++] = lS.a(var10_9).intern();
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
        lS.p = var9_3;
        lS.q = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C07;
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
                throw new RuntimeException("lS", exception);
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
            lS.q[n2] = lS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lS.a(n, l);
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
            throw new RuntimeException("lS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
