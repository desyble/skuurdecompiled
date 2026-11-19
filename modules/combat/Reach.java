import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lp
extends lh {
    private final kt<Number> r;
    private final kt<Number> o;
    private final kt<Number> l;
    private final kt<Boolean> p;
    private final kt<Boolean> n;
    private final kt<Boolean> q;
    private final Random k;
    @A
    public final R8<TN> m;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;

    public lp(EU eU, int n, byte by, int n2) {
        long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ s;
        super(eU);
        this.r = new kt((String)((Object)lp.a("w", (int)28143, (long)(0x49340727C10B9D01L ^ l))), (Object)3.0, "", 0.01, 3.0, 6.0, "m");
        this.o = new kt((String)((Object)lp.a("w", (int)28180, (long)(0x76BF1BC291D79EF9L ^ l))), (Object)3.01, "", 0.01, 3.01, 6.0, "m");
        this.l = new kt((String)((Object)lp.a("w", (int)2351, (long)(0x3C80BD7B4B4679C3L ^ l))), (Object)100, "", 1.0, 1.0, 100.0, "%");
        this.p = new kt((String)((Object)lp.a("w", (int)28949, (long)(0x1A257328CFF881FEL ^ l))), (Object)false, (String)((Object)lp.a("w", (int)3079, (long)(0x7C75580F6C7DFCEFL ^ l))));
        this.n = new kt((String)((Object)lp.a("w", (int)13235, (long)(0x630801ED169CC35CL ^ l))), (Object)false, (String)((Object)lp.a("w", (int)3330, (long)(0x500310991E447DEBL ^ l))));
        this.q = new kt((String)((Object)lp.a("w", (int)20896, (long)(0x4AF1EE0FBA61A141L ^ l))), (Object)false, (String)((Object)lp.a("w", (int)19928, (long)(0x1496C2AA72B03D32L ^ l))));
        this.k = new Random();
        this.m = this::lambda$new$0;
        this.a(new kt[]{this.r, this.o, this.l, this.p, this.n, this.q});
    }

    private void lambda$new$0(TN tN) {
        double d;
        double d2;
        double d3;
        double d4;
        block51: {
            block52: {
                double d5;
                int[] nArray;
                block50: {
                    Object object;
                    block44: {
                        block45: {
                            block49: {
                                double d6;
                                block48: {
                                    cD cD2;
                                    cD cD3;
                                    block47: {
                                        uC uC2;
                                        block46: {
                                            int n;
                                            block42: {
                                                block43: {
                                                    block40: {
                                                        double d7;
                                                        block41: {
                                                            block38: {
                                                                block39: {
                                                                    cD3 = Hk.b();
                                                                    nArray = lX.f();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n = ((Boolean)this.n.i()).booleanValue();
                                                                                if (nArray != null) break block38;
                                                                                if (n == 0) break block39;
                                                                            }
                                                                            catch (H h) {
                                                                                throw lp.a(h);
                                                                            }
                                                                            n = cD3.ab.H();
                                                                            if (nArray != null) break block38;
                                                                        }
                                                                        catch (H h) {
                                                                            throw lp.a(h);
                                                                        }
                                                                        if (n != 0) break block39;
                                                                    }
                                                                    catch (H h) {
                                                                        throw lp.a(h);
                                                                    }
                                                                    return;
                                                                }
                                                                n = ((Boolean)this.q.i()).booleanValue();
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (nArray != null) break block40;
                                                                        if (n == 0) break block41;
                                                                    }
                                                                    catch (H h) {
                                                                        throw lp.a(h);
                                                                    }
                                                                    n = Hk.j().az();
                                                                    if (nArray != null) break block40;
                                                                }
                                                                catch (H h) {
                                                                    throw lp.a(h);
                                                                }
                                                                if (n == 0) break block41;
                                                            }
                                                            catch (H h) {
                                                                throw lp.a(h);
                                                            }
                                                            return;
                                                        }
                                                        n = (d7 = Math.random() * 100.0 - (double)this.l.m()) == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                                    }
                                                    try {
                                                        if (nArray != null) break block42;
                                                        if (n <= 0) break block43;
                                                    }
                                                    catch (H h) {
                                                        throw lp.a(h);
                                                    }
                                                    return;
                                                }
                                                try {
                                                    object = this.p;
                                                    if (nArray != null) break block44;
                                                    n = ((Boolean)object.i()).booleanValue() ? 1 : 0;
                                                }
                                                catch (H h) {
                                                    throw lp.a(h);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n == 0) break block45;
                                                            uC2 = cD3.U;
                                                            if (nArray != null) break block46;
                                                        }
                                                        catch (H h) {
                                                            throw lp.a(h);
                                                        }
                                                        if (uC2 == null) break block45;
                                                    }
                                                    catch (H h) {
                                                        throw lp.a(h);
                                                    }
                                                    cD2 = cD3;
                                                    if (nArray != null) break block47;
                                                }
                                                catch (H h) {
                                                    throw lp.a(h);
                                                }
                                                uC2 = cD2.U;
                                            }
                                            catch (H h) {
                                                throw lp.a(h);
                                            }
                                        }
                                        try {
                                            if (uC2.a == null) break block45;
                                            cD2 = cD3;
                                        }
                                        catch (H h) {
                                            throw lp.a(h);
                                        }
                                    }
                                    d4 = cD2.ab.e - (cD3.U.a.e + (double)cD3.U.a.V());
                                    try {
                                        try {
                                            try {
                                                double d6 = d4 - 0.2;
                                                d6 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                                                if (nArray != null) break block48;
                                                if (d6 >= 0) break block49;
                                            }
                                            catch (H h) {
                                                throw lp.a(h);
                                            }
                                            d5 = d4;
                                            if (nArray != null) break block50;
                                        }
                                        catch (H h) {
                                            throw lp.a(h);
                                        }
                                        double d6 = d5 - -0.2;
                                        d6 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                    }
                                    catch (H h) {
                                        throw lp.a(h);
                                    }
                                }
                                if (d6 > 0) break block45;
                            }
                            return;
                        }
                        object = this.r;
                    }
                    d4 = object.f();
                    d5 = this.o.f();
                }
                d3 = d5;
                try {
                    try {
                        double d = d4;
                        d = d3;
                        if (nArray != null) break block51;
                        if (!(d2 >= d)) break block52;
                    }
                    catch (H h) {
                        throw lp.a(h);
                    }
                    tN.a(d4);
                    return;
                }
                catch (H h) {
                    throw lp.a(h);
                }
            }
            double d = d4 + d3;
            d = 2.0;
        }
        double d10 = d2 / d;
        double d11 = (d3 - d4) / 4.0;
        double d12 = d10 + this.k.nextGaussian() * d11;
        tN.a(Math.min(d3, Math.max(d4, d12)));
    }




    static {
        block11: {
            block10: {
                lp.s = _c.a((long)3723763594258291416L, (long)2758007273675520821L, MethodHandles.lookup().lookupClass()).a(167959155971612L);
                lp.v = new HashMap<K, V>(13);
                var0 = lp.s ^ 115853013259149L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "E\u00f1\u00e5v\u0089\u00b6,\u0081\u00a4lJ\u00a6\u0014\u008aL\u0018V\u0080\u0088\u00a5\u0095\u0088\u0007\u0090\u0011c\u008c\u00a0@&\u0091\u0012\u00bf\u0094\u00e4\u008d\u00c6=\u00e7\u00f2\u0087\u00cb2\u00fae\u00fc\u00c1\u0085w(\u00dfh\u00dc\u001a\u0014|1\u00b2G\u00a3xpmh\u0087\u000bS\u0011K\u00f1\u00fa\u00b6\u0088\u00da\u00a2P8=,I\u00ed\u0095H\u00ba\u0015\u0095j\u00de\u0011O\u00e8P\u00b6\u00df\u00a0\u00a7f\u0085\u009a\n\u0007]\u00bf\u00d6'p\u00bcL\u009ee\u00bc\u00f1\u00beP(q\u00c6\u00d6\u001d\u00fd#\u00fe\u00b1\u0007g\u00eb\u0000\u00b0\u00b7\u00a1\u00e2\u00c5~\u00ff\u00e8B\u001a\u0001\u00d7@\u00a8\u008e2\u00b9\u00f9^\u00cc\u0012Y\u00d0\u000e\u00e1?Y70o#\u00aeB\u0097@O2UG=\u00c1,\u00ef\u0019\u0092\u00e6F\u00e5\u00db>\u0099\u00e04\u0098\u00b8\u00a9Z\u00e1N\bS\u00e0<h\u00f4\u0099\u00bd\u00b6e\u0012\u0098\u00b3bwQ&\u0006#O\u00e1\u00e0\u0080 #\u0000j\u0099va\u00c0\u008dT\u0094\u00f8wn\u0018\u000b3\u001a\u0015\u0098\u000bML\u0083\u00d19f\u00cf\u007f6Z\u00a3\u00f1@ \u00b0\u009d}/1\u008a\u0004}v\u00b4d\u00a2m 5\u00e6\u008c\u00dd\u008eWxD\u00f0z\u00ac\u001d\u0001\u00b2\u008cgV\u00879M\u00caSe!\u00f4b\u0081i\u00f1I\u000f\u00d6\u0015\u00d1[R\u00a1\u00b7\u00e2/\\\u0080\u00e71`\u0088\u00b2\u00d6\u00ab\u0018\u00bbY\u00e4~p\b\u00df\u0094'\u00dc|\u00da\u0084\u00a3\u00a4\u00a6\u00a4!y\u00c41\u00d1\u0019\u00cf\u0010Li\u00d2\u00ed-\u00e5\u00a7\u0096HT\u001c\u0006\u00a6\u00a0\u00da\u00bf(\u00d5k\u00b6\u00ecE\u00d2v\u00c5\u00e9\u000b\u00ad\u00c4\u009fY\u0012\u00f5\u00aen\u00cf}\u001a\u0088\u00f7\u001a\u00d5\u00cdU<\u00c2\u0013\u00a1\u00e6m\u00b8\u00e22N)\tV";
                var8_6 = "E\u00f1\u00e5v\u0089\u00b6,\u0081\u00a4lJ\u00a6\u0014\u008aL\u0018V\u0080\u0088\u00a5\u0095\u0088\u0007\u0090\u0011c\u008c\u00a0@&\u0091\u0012\u00bf\u0094\u00e4\u008d\u00c6=\u00e7\u00f2\u0087\u00cb2\u00fae\u00fc\u00c1\u0085w(\u00dfh\u00dc\u001a\u0014|1\u00b2G\u00a3xpmh\u0087\u000bS\u0011K\u00f1\u00fa\u00b6\u0088\u00da\u00a2P8=,I\u00ed\u0095H\u00ba\u0015\u0095j\u00de\u0011O\u00e8P\u00b6\u00df\u00a0\u00a7f\u0085\u009a\n\u0007]\u00bf\u00d6'p\u00bcL\u009ee\u00bc\u00f1\u00beP(q\u00c6\u00d6\u001d\u00fd#\u00fe\u00b1\u0007g\u00eb\u0000\u00b0\u00b7\u00a1\u00e2\u00c5~\u00ff\u00e8B\u001a\u0001\u00d7@\u00a8\u008e2\u00b9\u00f9^\u00cc\u0012Y\u00d0\u000e\u00e1?Y70o#\u00aeB\u0097@O2UG=\u00c1,\u00ef\u0019\u0092\u00e6F\u00e5\u00db>\u0099\u00e04\u0098\u00b8\u00a9Z\u00e1N\bS\u00e0<h\u00f4\u0099\u00bd\u00b6e\u0012\u0098\u00b3bwQ&\u0006#O\u00e1\u00e0\u0080 #\u0000j\u0099va\u00c0\u008dT\u0094\u00f8wn\u0018\u000b3\u001a\u0015\u0098\u000bML\u0083\u00d19f\u00cf\u007f6Z\u00a3\u00f1@ \u00b0\u009d}/1\u008a\u0004}v\u00b4d\u00a2m 5\u00e6\u008c\u00dd\u008eWxD\u00f0z\u00ac\u001d\u0001\u00b2\u008cgV\u00879M\u00caSe!\u00f4b\u0081i\u00f1I\u000f\u00d6\u0015\u00d1[R\u00a1\u00b7\u00e2/\\\u0080\u00e71`\u0088\u00b2\u00d6\u00ab\u0018\u00bbY\u00e4~p\b\u00df\u0094'\u00dc|\u00da\u0084\u00a3\u00a4\u00a6\u00a4!y\u00c41\u00d1\u0019\u00cf\u0010Li\u00d2\u00ed-\u00e5\u00a7\u0096HT\u001c\u0006\u00a6\u00a0\u00da\u00bf(\u00d5k\u00b6\u00ecE\u00d2v\u00c5\u00e9\u000b\u00ad\u00c4\u009fY\u0012\u00f5\u00aen\u00cf}\u001a\u0088\u00f7\u001a\u00d5\u00cdU<\u00c2\u0013\u00a1\u00e6m\u00b8\u00e22N)\tV".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = lp.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0085q\u009b\u0001\u0016B\u00fb\u009dH\u009a\u00f5|\u00a6\u0016%\u0095\u0081\u00f80\u0097\u0080@\u00aa2\u00ea\u00f6\u00a5\u00e7P\u0005-\u0097(v\\\u00fa\u00e1-\u008b\n\u00d6\u00af\u00f3\u001b6\u001c%\u00b6\u00cf\u0004|\u00a6k\r^12v\u008d\u0000\u00ce]\u00f3\u0088!\u00e4\u00dc\u0010}0\u00c8?\u0012";
                    var8_6 = "\u0085q\u009b\u0001\u0016B\u00fb\u009dH\u009a\u00f5|\u00a6\u0016%\u0095\u0081\u00f80\u0097\u0080@\u00aa2\u00ea\u00f6\u00a5\u00e7P\u0005-\u0097(v\\\u00fa\u00e1-\u008b\n\u00d6\u00af\u00f3\u001b6\u001c%\u00b6\u00cf\u0004|\u00a6k\r^12v\u008d\u0000\u00ce]\u00f3\u0088!\u00e4\u00dc\u0010}0\u00c8?\u0012".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = lp.a(var10_9).intern();
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
        lp.t = var9_3;
        lp.u = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x60BB;
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
                throw new RuntimeException("lp", exception);
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
            lp.u[n2] = lp.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lp.a(n, l);
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
            throw new RuntimeException("lp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
