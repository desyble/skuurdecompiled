import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class hB
extends hw {
    private static final String[] a;
    private static final String[] d;
    private static final Map e;

    public String b(short s, int n, int n2) {
        long l = (long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48;
        return hB.b("v", (int)17646, (long)(0x2F7A20366D022D97L ^ l));
    }

    public int c() {
        return 2;
    }

    public String b(int n, int n2, p5 p52, char c) {
        long l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48;
        return hB.b("v", (int)31573, (long)(0x649F98CF484C3038L ^ l));
    }




    public void a(int var1_1, p5 var2_2, String[] var3_3, int var4_4) {























        throw new IllegalStateException("Decompilation failed");
    }





    public List a(p5 var1_1, long var2_2, short var4_3, String[] var5_4, xc var6_5) {
        block34: {
            block37: {
                block38: {
                    block35: {
                        block36: {
                            block33: {
                                block31: {
                                    block32: {
                                        var7_6 = var2_2 << 16 | (long)var4_3 << 48 >>> 48;
                                        var9_7 = hw.b();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = var5_4.length;
                                                        if (var9_7 != null) break block31;
                                                        if (v0 <= 0) break block32;
                                                    }
                                                    catch (H v1) {
                                                        throw hB.a(v1);
                                                    }
                                                    v0 = var5_4.length;
                                                    v2 = 3;
                                                    v3 = var9_7;
                                                    if (var4_3 >= 0) {
                                                        if (v3 != null) break block33;
                                                    }
                                                    ** GOTO lbl40
                                                }
                                                catch (H v4) {
                                                    throw hB.a(v4);
                                                }
                                                if (v0 > v2) break block32;
                                            }
                                            catch (H v5) {
                                                throw hB.a(v5);
                                            }
                                            v6 = hB.b((String[])var5_4, (int)0, (xc)var6_5);
                                            break block34;
                                        }
                                        catch (H v7) {
                                            throw hB.a(v7);
                                        }
                                    }
                                    v0 = var5_4.length;
                                }
                                v2 = 3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v3 = var9_7;
lbl40:


                                            if (v3 != null) break block35;
                                            if (v0 <= v2) break block36;
                                        }
                                        catch (H v8) {
                                            throw hB.a(v8);
                                        }
                                        v0 = var5_4.length;
                                        v2 = 6;
                                        v9 = var9_7;
                                        if (var4_3 >= 0) {
                                            if (v9 != null) break block35;
                                        }
                                        ** GOTO lbl71
                                    }
                                    catch (H v10) {
                                        throw hB.a(v10);
                                    }
                                    if (v0 > v2) break block36;
                                }
                                catch (H v11) {
                                    throw hB.a(v11);
                                }
                                v6 = hB.b((String[])var5_4, (int)3, (xc)var6_5);
                                break block34;
                            }
                            catch (H v12) {
                                throw hB.a(v12);
                            }
                        }
                        v0 = var5_4.length;
                        v2 = 6;
                    }
                    try {
                        try {
                            try {
                                try {
                                    v9 = var9_7;
lbl71:


                                    if (v9 != null) break block37;
                                    if (v0 <= v2) break block38;
                                }
                                catch (H v13) {
                                    throw hB.a(v13);
                                }
                                v0 = var5_4.length;
                                v2 = 9;
                                if (var9_7 != null) break block37;
                            }
                            catch (H v14) {
                                throw hB.a(v14);
                            }
                            if (v0 > v2) break block38;
                        }
                        catch (H v15) {
                            throw hB.a(v15);
                        }
                        v6 = hB.b((String[])var5_4, (int)6, (xc)var6_5);
                        break block34;
                    }
                    catch (H v16) {
                        throw hB.a(v16);
                    }
                }
                try {
                    v17 = var5_4;
                    if (var9_7 == null) {
                        v0 = v17.length;
                        v2 = 10;
                    }
                    ** GOTO lbl103
                }
                catch (H v18) {
                    throw hB.a(v18);
                }
            }
            if (v0 == v2) {
                v17 = var5_4;
lbl103:


                v6 = hB.a((String[])v17, (String[])new String[]{hB.b("v", (int)19201, (long)(2354623682643504401L ^ var7_6)), hB.b("v", (int)17343, (long)(2048936477991413160L ^ var7_6))});
            } else {
                v6 = null;
            }
        }
        return v6;
    }




    static {
        block11: {
            block10: {
                hB.e = new HashMap<K, V>(13);
                var0 = _c.a((long)-6409483074062360176L, (long)5099016469392592051L, MethodHandles.lookup().lookupClass()).a(51703613870454L) ^ 119404618610382L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "\u00ee\u00a8n\u00f5\u00b20F\u00ea\u00bc\u0015\u008a\u008d\u00ed\u00c22\u00e7,N{_\u00a1 \u00e3\u001c6]\n\u00ba\u00e8\u0094\u001574\u009c\u00bbI-w\u0019\u001e>=o\u00da\u00ae\u0085\u00b9p\u0010p\u0090\u00d7\u0013\u00fd\u00fd\\K\u00b5u\u0091%0\u00f2\u009d\u00be\u0010U\u007f\u00c5\u0080\u0097\u00fc\u009f\u00de\u00b6\u00e4\u00c7\u00d4\u00de\u00feP\u000b(\\|\u00a2.z\u00f5mU\u00c2\u0004\u00069mt\"\u0007\u0012\u00e7vME\u007f\u00ec\u00ca/\u0007\u00d6d~\u00f8XI\u00a4dkG\u0013\u00f2s_((\u00c3\u00b5\u00b2\"W\u00ce\u00be@\u00fc\u00b9\u008d`qB\u000e`\u00a5tRpQ\"W\u00d2HU\u00db\u0091>\u0016\u0093~\u00f5\u000bv\u00abr\u00a8i(\u00e3\u0099\u0011Ye\u000b\u00e9'+\u008b\u00ec\u00a0Y\u0094\f&\u009d\u009b\u0010b\u0019OGY\f[MH\u0095\u00e0\u00db\u00f6\u0015\u008f{c\u00e4\u00a7z\u00c9\u0010\u00d1\u00af\u00af\u0081\u0087\u0014\u0088\u00d7x\u0004\u00bf\u0099\u00a6\u001c\u008c\u00e78\u00e5\u00eb\u00c3=\u00eb\u00f9\u00a8G\u0013\u00c6x\u00c9\u0006(\u00c54E\u001f\u00bc\u0002\u001fd1\u00b2Oa\u00b7\u00a7;B\n\u00aeG\u00e5\u00bb\u00eal(\u00d1C?\t\u00bd;'\u0096\u009f\"))\u0098\u001a\u00da\u00f7\u0082\u00bc8\u00e4K^\u0002<q2^!\"K\u00ab\u0096\u000b*\u00bcn!\u00a2F\u00fd\u0094\u00b5\u00b9\u0089\u0081i\u0019\u0082^n\u00a1A\u00e9\u008c0o.7\u000f\u0087f\u0018\u00ca)\u00df\u00a7Q\u00e8\u00d3D\u00a9\u00d4\u0093\u00f6\u00e0";
                var8_6 = "\u00ee\u00a8n\u00f5\u00b20F\u00ea\u00bc\u0015\u008a\u008d\u00ed\u00c22\u00e7,N{_\u00a1 \u00e3\u001c6]\n\u00ba\u00e8\u0094\u001574\u009c\u00bbI-w\u0019\u001e>=o\u00da\u00ae\u0085\u00b9p\u0010p\u0090\u00d7\u0013\u00fd\u00fd\\K\u00b5u\u0091%0\u00f2\u009d\u00be\u0010U\u007f\u00c5\u0080\u0097\u00fc\u009f\u00de\u00b6\u00e4\u00c7\u00d4\u00de\u00feP\u000b(\\|\u00a2.z\u00f5mU\u00c2\u0004\u00069mt\"\u0007\u0012\u00e7vME\u007f\u00ec\u00ca/\u0007\u00d6d~\u00f8XI\u00a4dkG\u0013\u00f2s_((\u00c3\u00b5\u00b2\"W\u00ce\u00be@\u00fc\u00b9\u008d`qB\u000e`\u00a5tRpQ\"W\u00d2HU\u00db\u0091>\u0016\u0093~\u00f5\u000bv\u00abr\u00a8i(\u00e3\u0099\u0011Ye\u000b\u00e9'+\u008b\u00ec\u00a0Y\u0094\f&\u009d\u009b\u0010b\u0019OGY\f[MH\u0095\u00e0\u00db\u00f6\u0015\u008f{c\u00e4\u00a7z\u00c9\u0010\u00d1\u00af\u00af\u0081\u0087\u0014\u0088\u00d7x\u0004\u00bf\u0099\u00a6\u001c\u008c\u00e78\u00e5\u00eb\u00c3=\u00eb\u00f9\u00a8G\u0013\u00c6x\u00c9\u0006(\u00c54E\u001f\u00bc\u0002\u001fd1\u00b2Oa\u00b7\u00a7;B\n\u00aeG\u00e5\u00bb\u00eal(\u00d1C?\t\u00bd;'\u0096\u009f\"))\u0098\u001a\u00da\u00f7\u0082\u00bc8\u00e4K^\u0002<q2^!\"K\u00ab\u0096\u000b*\u00bcn!\u00a2F\u00fd\u0094\u00b5\u00b9\u0089\u0081i\u0019\u0082^n\u00a1A\u00e9\u008c0o.7\u000f\u0087f\u0018\u00ca)\u00df\u00a7Q\u00e8\u00d3D\u00a9\u00d4\u0093\u00f6\u00e0".length();
                var5_7 = 48;
                var4_8 = -1;
lbl19:


                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:


                while (true) {
                    var9_3[var7_4++] = hB.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Sh\u0081\u0081yD\r\u00e4\u00d3a\u00fe&\u00c3\u0080\u00b2\u00c3\u0099\u00e9\u001b]\u00df\u00a9|\u00ce\u00ebB\u009df\u009d\u00b5\u00de\u009b8.O\u00fc\u00b6I8\u00c4\u0015\u0004jd\u0002'<\u00d9(V\u00eb\u00d0}\u00f0\t\u0081\u0098\u001f\u00c2\u00f7\u00fa!\u0013\u00b2\u008c=G\u009dJBi\u00b9\u0085\u0080G\u00d9\u00a8BrOi\u00a9\u00e6\u00d5\u00ea\u00a6\u00beLN";
                    var8_6 = "Sh\u0081\u0081yD\r\u00e4\u00d3a\u00fe&\u00c3\u0080\u00b2\u00c3\u0099\u00e9\u001b]\u00df\u00a9|\u00ce\u00ebB\u009df\u009d\u00b5\u00de\u009b8.O\u00fc\u00b6I8\u00c4\u0015\u0004jd\u0002'<\u00d9(V\u00eb\u00d0}\u00f0\t\u0081\u0098\u001f\u00c2\u00f7\u00fa!\u0013\u00b2\u008c=G\u009dJBi\u00b9\u0085\u0080G\u00d9\u00a8BrOi\u00a9\u00e6\u00d5\u00ea\u00a6\u00beLN".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl33:


                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl38:


                while (true) {
                    var9_3[var7_4++] = hB.b(var10_9).intern();
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
lbl50:


                ** continue;
            }
        }
        hB.a = var9_3;
        hB.d = new String[11];
    }

    private static H a(H h) {
        return h;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3E08;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("hB", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = a[n2].getBytes("ISO-8859-1");
            hB.d[n2] = hB.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = hB.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("hB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(hB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
