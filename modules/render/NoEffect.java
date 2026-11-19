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

public class mp
extends lh {
    private final kt<Boolean> l;
    @A
    public final R8<cn> k;
    private static final long m;
    private static final String[] n;
    private static final String[] o;
    private static final Map p;

    public mp(int n, EU eU, short s, short s2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48) ^ m;
        super(eU);
        this.l = new kt((String)((Object)mp.a("x", (int)29774, (long)(0x36417D1A9A4794B2L ^ l))), (Object)true, (String)((Object)mp.a("x", (int)21471, (long)(0x1466262EAB223320L ^ l))));
        this.k = this::lambda$new$0;
        kt kt2 = new kt((String)((Object)mp.a("x", (int)23923, (long)(0x26CB5882593F3D8DL ^ l))), (Object)false, (String)((Object)mp.a("x", (int)25558, (long)(0x9F6111EE81032CL ^ l))));
        kt kt3 = new kt((String)((Object)mp.a("x", (int)19797, (long)(0x6B570FD165F3ADA8L ^ l))), (Object)true, (String)((Object)mp.a("x", (int)4362, (long)(0x6AB23012BDC671F1L ^ l))));
        this.a(new kt[]{kt2, this.l, kt3});
    }

    private void lambda$new$0(cn cn2) {
        block16: {
            int n;
            MI mI;
            int n2;
            int n3;
            int n4;
            block20: {
                boolean bl;
                block18: {
                    boolean bl2;
                    block19: {
                        MI mI2;
                        block17: {
                            boolean bl3;
                            block14: {
                                block15: {
                                    long l = m ^ 0x208206816275L;
                                    long l2 = l ^ 0x6E8C7E65617FL;
                                    n4 = (int)(l2 >>> 48);
                                    n3 = (int)(l2 << 16 >>> 32);
                                    n2 = (int)(l2 << 48 >>> 48);
                                    bl2 = mr.e();
                                    try {
                                        bl3 = cn2.b();
                                        if (bl2) break block14;
                                        if (!bl3) break block15;
                                    }
                                    catch (H h) {
                                        throw mp.a(h);
                                    }
                                    return;
                                }
                                bl3 = (Boolean)this.l.i();
                            }
                            try {
                                try {
                                    if (!bl3) break block16;
                                    mI2 = Hk.j();
                                    if (bl2) break block17;
                                }
                                catch (H h) {
                                    throw mp.a(h);
                                }
                                if (mI2 == null) break block16;
                            }
                            catch (H h) {
                                throw mp.a(h);
                            }
                            mI2 = Hk.j();
                        }
                        try {
                            try {
                                bl = mI2.k(d7.e.b());
                                if (bl2) break block18;
                                if (!bl) break block19;
                            }
                            catch (H h) {
                                throw mp.a(h);
                            }
                            Hk.j().l((short)n4, n3, (char)n2, d7.e.b());
                        }
                        catch (H h) {
                            throw mp.a(h);
                        }
                    }
                    try {
                        mI = Hk.j();
                        n = d7.P.b();
                        if (bl2) break block20;
                        bl = mI.k(n);
                    }
                    catch (H h) {
                        throw mp.a(h);
                    }
                }
                try {
                    if (!bl) break block16;
                    mI = Hk.j();
                    n = d7.P.b();
                }
                catch (H h) {
                    throw mp.a(h);
                }
            }
            int n5 = n;
            mI.l((short)n4, n3, (char)n2, n5);
        }
    }




    static {
        block11: {
            block10: {
                mp.m = _c.a((long)5364779781146609295L, (long)979215461717398674L, MethodHandles.lookup().lookupClass()).a(226666704348761L);
                mp.p = new HashMap<K, V>(13);
                var0 = mp.m ^ 25462446842538L;
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
                var6_5 = "\u0017d\u00e9b\u00b9\n\u00ac\u000f@\u00e2>\u00e0K8M\u00f3@\u0084\u00c4}\u00db\u008f\u0099\u00d0U0\u00e6\u0096\u0000\u00c3\u0091$\u00848\u00dd\u0092\u009e\u000e\u00d1\u00ab\u0012\u00aff\u000b4\u0080\n_\u00df\u00b8&0\u0091s\u00161\u000b\u00bc\u00de\u00ce\u00ee\u00ea\u009f}\u00dcT$KFn\u00a4\u0004P\u00a0s\u00d4\u0093\u008dP\u00d5\t\u0010\u00b1\u00cdL\u00c7\u009e\u0004\u00b0\u00f5\tGC9g'Jz\u0010\u0084\u00fc\u001c\u0011\u00c8W\u001d\u00dd^\u0014\u00cdK6\u00f8a\u0095";
                var8_6 = "\u0017d\u00e9b\u00b9\n\u00ac\u000f@\u00e2>\u00e0K8M\u00f3@\u0084\u00c4}\u00db\u008f\u0099\u00d0U0\u00e6\u0096\u0000\u00c3\u0091$\u00848\u00dd\u0092\u009e\u000e\u00d1\u00ab\u0012\u00aff\u000b4\u0080\n_\u00df\u00b8&0\u0091s\u00161\u000b\u00bc\u00de\u00ce\u00ee\u00ea\u009f}\u00dcT$KFn\u00a4\u0004P\u00a0s\u00d4\u0093\u008dP\u00d5\t\u0010\u00b1\u00cdL\u00c7\u009e\u0004\u00b0\u00f5\tGC9g'Jz\u0010\u0084\u00fc\u001c\u0011\u00c8W\u001d\u00dd^\u0014\u00cdK6\u00f8a\u0095".length();
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
                    var9_3[var7_4++] = mp.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ad\u008c\u00c5\u00e5`\u00b3\u00e3\u00cez<\u00e5\u0097\u00d3\u00c5o\u008a\u00fd\u0004\u00bd\u00fe^\u0081\u00a3\u00c4\u009b\tO\u00d6g%*\u0016\u009a\u009ajsM\u008dc\u00e2M\u0099\u00a4\u00d2\u00c5\u00c7:\u00b2\u00fe\u00dfB\u0087\u008f$a\u0001!!\u00e5\u00da\u00cb}\u001c\u0093\u0018\u00f9\u00c6\u00e5\u0085\u00af\u008e%)'\u00df\u00d9b\u0006wC\u00ec\flsd\u00c8\u00e2C4";
                    var8_6 = "\u00ad\u008c\u00c5\u00e5`\u00b3\u00e3\u00cez<\u00e5\u0097\u00d3\u00c5o\u008a\u00fd\u0004\u00bd\u00fe^\u0081\u00a3\u00c4\u009b\tO\u00d6g%*\u0016\u009a\u009ajsM\u008dc\u00e2M\u0099\u00a4\u00d2\u00c5\u00c7:\u00b2\u00fe\u00dfB\u0087\u008f$a\u0001!!\u00e5\u00da\u00cb}\u001c\u0093\u0018\u00f9\u00c6\u00e5\u0085\u00af\u008e%)'\u00df\u00d9b\u0006wC\u00ec\flsd\u00c8\u00e2C4".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = mp.a(var10_9).intern();
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
        mp.n = var9_3;
        mp.o = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x20C5;
        if (o[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])p.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mp", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = mp.n[n2].getBytes("ISO-8859-1");
            mp.o[n2] = mp.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return o[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mp.a(n, l);
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
            throw new RuntimeException("mp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mp.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
