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

public class m4
extends lh {
    private final kt<Number> l;
    private final kt<RB> m;
    @A
    public final R8<b5> k;
    private static final long n;
    private static final String[] o;
    private static final String[] p;
    private static final Map q;

    public m4(long l, EU eU) {
        l = n ^ l;
        super(eU);
        this.l = new kt((String)((Object)m4.a("g", (int)3172, (long)(0x717B27266E795BFEL ^ l))), (Object)1, "", 1.0, 0.0, 4.0, (String)((Object)m4.a("g", (int)3801, (long)(0x4EBC926EACFED944L ^ l))));
        this.m = new kt((String)((Object)m4.a("g", (int)618, (long)(0x59C66F2EB159D5F1L ^ l))), (Object)new RB((String)((Object)m4.a("g", (int)25758, (long)(0x43399CCB34E3302L ^ l))), new String[]{m4.a("g", (int)11126, (long)(0x2A1077E174A27CE9L ^ l)), m4.a("g", (int)22583, (long)(0x319C6425E8318FA3L ^ l)), m4.a("g", (int)1279, (long)(0x9736C76810AD36AL ^ l))}), (String)((Object)m4.a("g", (int)4926, (long)(0x1F511039C9CB44A0L ^ l))));
        this.k = this::lambda$new$0;
        this.a(new kt[]{this.l, this.m});
    }




    private void lambda$new$0(b5 var1_1) {
        block37: {
            block36: {
                block35: {
                    block34: {
                        block33: {
                            block31: {
                                block30: {
                                    block29: {
                                        block28: {
                                            var2_2 = m4.n ^ 90407361775891L;
                                            var5_3 = Hk.b();
                                            var6_4 = var5_3.ab.T();
                                            var4_5 = m6.a();
                                            try {
                                                if (var6_4 == null) {
                                                    return;
                                                }
                                            }
                                            catch (H v0) {
                                                throw m4.a(v0);
                                            }
                                            var7_6 = this.m.q();
                                            var8_7 = var6_4.v();
                                            try {
                                                try {
                                                    v1 = var8_7 instanceof aF;
                                                    if (var4_5 != null) break block28;
                                                    if (!v1) break block29;
                                                }
                                                catch (H v2) {
                                                    throw m4.a(v2);
                                                }
                                                v1 = var7_6.equals(m4.a("g", (int)22583, (long)(3574811736452611239L ^ var2_2)));
                                            }
                                            catch (H v3) {
                                                throw m4.a(v3);
                                            }
                                        }
                                        try {
                                            if (var4_5 != null) break block30;
                                            if (!v1) break block29;
                                        }
                                        catch (H v4) {
                                            throw m4.a(v4);
                                        }
                                        v1 = true;
                                        break block30;
                                    }
                                    v1 = false;
                                }
                                var9_8 = v1;
                                try {
                                    block32: {
                                        try {
                                            try {
                                                try {
                                                    v5 = var8_7 instanceof aI;
                                                    if (var4_5 != null) break block31;
                                                    if (v5) break block32;
                                                }
                                                catch (H v6) {
                                                    throw m4.a(v6);
                                                }
                                                v5 = var8_7 instanceof bn;
                                                if (var4_5 != null) break block31;
                                            }
                                            catch (H v7) {
                                                throw m4.a(v7);
                                            }
                                            if (!v5) break block33;
                                        }
                                        catch (H v8) {
                                            throw m4.a(v8);
                                        }
                                    }
                                    v5 = var7_6.equals(m4.a("g", (int)11879, (long)(2854303248112110331L ^ var2_2)));
                                }
                                catch (H v9) {
                                    throw m4.a(v9);
                                }
                            }
                            try {
                                if (var4_5 != null) break block34;
                                if (!v5) break block33;
                            }
                            catch (H v10) {
                                throw m4.a(v10);
                            }
                            v5 = true;
                            break block34;
                        }
                        v5 = false;
                    }
                    var10_9 = v5;
                    var11_10 = var7_6.equals(m4.a("g", (int)31532, (long)(3818973118753710001L ^ var2_2)));
                    try {
                        v11 = var9_8;
                        if (var4_5 != null) break block35;
                        if (!v11) {
                        }
                        ** GOTO lbl97
                    }
                    catch (H v12) {
                        throw m4.a(v12);
                    }
                    v11 = var10_9;
                }
                try {
                    if (var4_5 != null) break block36;
                    if (!v11) {
                    }
                    ** GOTO lbl97
                }
                catch (H v13) {
                    throw m4.a(v13);
                }
                v11 = var11_10;
            }
            try {
                if (!v11) break block37;
lbl97:


                var5_3.I = this.l.m();
            }
            catch (H v14) {
                throw m4.a(v14);
            }
        }
    }




    static {
        block11: {
            block10: {
                m4.n = _c.a((long)1689185095881392799L, (long)-4885391909416888952L, MethodHandles.lookup().lookupClass()).a(40163924294099L);
                m4.q = new HashMap<K, V>(13);
                var0 = m4.n ^ 139090680205787L;
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
                var6_5 = "\u008dt\u00f7z\u00938\u00b6\u00de\u0082\u0013Q\u00f7\u0098\u00fb6X\u0010\u00e3@\u00ad\u00b1n#\u00b1\u0011\u00c6\u00bc\u00c8\u00b1L\u00b7\u00cc\u001d8r%\u0094\u00de\u00c1\u00c8\u00db\u00fcq\u00b4+\u00ca{\u00d39H\u009c\u00dfft\u00c6h\u00be\u00a94\u00e7X\u00c6\u0006\u00e84\u00d2nP#\u0015\u00b2K\u0089pb|c\u0093\u001ff\u00a8\u00a1\u0018]L\u008d\u00c7\u000b\u00a6\u000e\u001046\u0085\u009f\u001cIua2\u00d9\u00e4\u0089\u00b5\u00e7\u00ef\u00dd 58\"\u00aet\u0080\u00e3\u00f5\u00df\u00f9\u0018\u00816\u00cf(\u00d2\u0012\u00a0\u00fd\u00edN\u00bd\u00ack\u00e5S\u009b\u0089#sT\u0080\u0010 S\u001axO\u00a6\u0093`6\u00f9E\u0013\u00acK\u00cf\u00f8\u0010\u008f\u0087\u00ae\u00ec>\u0000\u0091\u00d8\u00afc\u00f1j\r^w0 s\u0088\b\u00d2\u0095\u00a7\u0007\u0019\u001cI\u00e3\u00bb@o\u0000\u00e8\u0092tns\u00ea=]\u00e6\u000e9a\u00c1E\u0018]z";
                var8_6 = "\u008dt\u00f7z\u00938\u00b6\u00de\u0082\u0013Q\u00f7\u0098\u00fb6X\u0010\u00e3@\u00ad\u00b1n#\u00b1\u0011\u00c6\u00bc\u00c8\u00b1L\u00b7\u00cc\u001d8r%\u0094\u00de\u00c1\u00c8\u00db\u00fcq\u00b4+\u00ca{\u00d39H\u009c\u00dfft\u00c6h\u00be\u00a94\u00e7X\u00c6\u0006\u00e84\u00d2nP#\u0015\u00b2K\u0089pb|c\u0093\u001ff\u00a8\u00a1\u0018]L\u008d\u00c7\u000b\u00a6\u000e\u001046\u0085\u009f\u001cIua2\u00d9\u00e4\u0089\u00b5\u00e7\u00ef\u00dd 58\"\u00aet\u0080\u00e3\u00f5\u00df\u00f9\u0018\u00816\u00cf(\u00d2\u0012\u00a0\u00fd\u00edN\u00bd\u00ack\u00e5S\u009b\u0089#sT\u0080\u0010 S\u001axO\u00a6\u0093`6\u00f9E\u0013\u00acK\u00cf\u00f8\u0010\u008f\u0087\u00ae\u00ec>\u0000\u0091\u00d8\u00afc\u00f1j\r^w0 s\u0088\b\u00d2\u0095\u00a7\u0007\u0019\u001cI\u00e3\u00bb@o\u0000\u00e8\u0092tns\u00ea=]\u00e6\u000e9a\u00c1E\u0018]z".length();
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
                    var9_3[var7_4++] = m4.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008f~\u00b4\u00c1~,\u0002\u0017s2O\u008az\b\u00b0\u00f3 \u00f8\u0018\u00c7\u0095i\u008e5\u00b772\u00d61\u00b1\u00d1 \u009aSZ\u00a2\u0016L\u00b2\u00bb\ny\u00e1\u00f7\u00a3\u000e\u0085\u00f6\u00a7";
                    var8_6 = "\u008f~\u00b4\u00c1~,\u0002\u0017s2O\u008az\b\u00b0\u00f3 \u00f8\u0018\u00c7\u0095i\u008e5\u00b772\u00d61\u00b1\u00d1 \u009aSZ\u00a2\u0016L\u00b2\u00bb\ny\u00e1\u00f7\u00a3\u000e\u0085\u00f6\u00a7".length();
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
                    var9_3[var7_4++] = m4.a(var10_9).intern();
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
        m4.o = var9_3;
        m4.p = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xFC0;
        if (p[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])q.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("m4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = o[n2].getBytes("ISO-8859-1");
            m4.p[n2] = m4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return p[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = m4.a(n, l);
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
            throw new RuntimeException("m4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
