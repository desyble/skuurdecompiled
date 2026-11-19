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

public class l7
extends lh {
    private final kt<RB> m;
    private final kt<RB> n;
    private final kt<RB> l;
    @A
    public final R8<cn> o;
    @A
    public final R8<bR> k;
    private static final long p;
    private static final String[] q;
    private static final String[] r;
    private static final Map s;

    public l7(short s, EU eU, long l) {
        long l2 = ((long)s << 48 | l << 16 >>> 16) ^ p;
        super(eU);
        this.m = new kt((String)((Object)l7.a("q", (int)16002, (long)(0x1B83D8C724B34C35L ^ l2))), (Object)new RB((String)((Object)l7.a("q", (int)12834, (long)(0x7935CA96EF6C09EL ^ l2))), new String[]{l7.a("q", (int)12834, (long)(0x7935CA96EF6C09EL ^ l2)), l7.a("q", (int)30823, (long)(0x52938DD298D50ADFL ^ l2))}), (String)((Object)l7.a("q", (int)3363, (long)(0x7977B3118C71FF9CL ^ l2))));
        this.n = new kt((String)((Object)l7.a("q", (int)9696, (long)(0x5045AA086BD9D750L ^ l2))), (Object)new RB((String)((Object)l7.a("q", (int)14953, (long)(0x22588F2FAFC348DAL ^ l2))), new String[]{l7.a("q", (int)14953, (long)(0x22588F2FAFC348DAL ^ l2)), l7.a("q", (int)10122, (long)(0x6A4109567CBD553BL ^ l2))}), (String)((Object)l7.a("q", (int)19058, (long)(0x4FFC607C2C89B8C9L ^ l2))), this::lambda$new$0);
        this.l = new kt((String)((Object)l7.a("q", (int)13327, (long)(0xA889525023C6B2L ^ l2))), (Object)new RB((String)((Object)l7.a("q", (int)9317, (long)(0x2CA0719CA40DD6D1L ^ l2))), new String[]{l7.a("q", (int)14953, (long)(0x22588F2FAFC348DAL ^ l2)), l7.a("q", (int)9317, (long)(0x2CA0719CA40DD6D1L ^ l2))}), (String)((Object)l7.a("q", (int)19246, (long)(0x4639A5CDDBAF399BL ^ l2))), this::lambda$new$1);
        this.o = this::lambda$new$2;
        this.k = this::lambda$new$3;
        this.a(new kt[]{this.m, this.n, this.l});
    }

    private void lambda$new$3(bR bR2) {
        block22: {
            bR bR3;
            block23: {
                boolean bl;
                String[] stringArray;
                block21: {
                    block19: {
                        long l;
                        block20: {
                            long l2;
                            int n;
                            block18: {
                                l = p ^ 0x3A85903B6304L;
                                long l3 = l ^ 0x438688297D1L;
                                n = (int)(l3 >>> 32);
                                l2 = l3 << 32 >>> 32;
                                stringArray = l1.c();
                                try {
                                    try {
                                        if (Hk.j() != null && Hk.a() != null) break block18;
                                    }
                                    catch (H h) {
                                        throw l7.a(h);
                                    }
                                    return;
                                }
                                catch (H h) {
                                    throw l7.a(h);
                                }
                            }
                            try {
                                bl = Hk.j().P(n, l2);
                                if (stringArray == null) break block19;
                                if (bl) break block20;
                            }
                            catch (H h) {
                                throw l7.a(h);
                            }
                            return;
                        }
                        bl = this.m.q().equals(l7.a("q", (int)8853, (long)(0x7D156962F2436261L ^ l)));
                    }
                    try {
                        try {
                            try {
                                if (stringArray == null) break block21;
                                if (!bl) break block22;
                            }
                            catch (H h) {
                                throw l7.a(h);
                            }
                            bR3 = bR2;
                            if (stringArray == null) break block23;
                        }
                        catch (H h) {
                            throw l7.a(h);
                        }
                        bl = bR3.a() instanceof Sh;
                    }
                    catch (H h) {
                        throw l7.a(h);
                    }
                }
                try {
                    block24: {
                        try {
                            try {
                                if (bl) break block24;
                                bR3 = bR2;
                                if (stringArray == null) break block23;
                            }
                            catch (H h) {
                                throw l7.a(h);
                            }
                            if (!(bR3.a() instanceof DZ)) break block22;
                        }
                        catch (H h) {
                            throw l7.a(h);
                        }
                    }
                    bR3 = bR2;
                }
                catch (H h) {
                    throw l7.a(h);
                }
            }
            bR3.a(true);
        }
    }




    private void lambda$new$2(cn var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private boolean lambda$new$1() {
        long l = p ^ 0x563D5217613BL;
        return this.m.q().equals(l7.a("q", (int)12834, (long)(0x79305CC155870E7L ^ l)));
    }

    private boolean lambda$new$0() {
        long l = p ^ 0x19FE93B48E1EL;
        return this.m.q().equals(l7.a("q", (int)12834, (long)(0x7934A0FD4FB9FC2L ^ l)));
    }




    static {
        block11: {
            block10: {
                l7.p = _c.a((long)-1032893828724143475L, (long)-5529916398561270610L, MethodHandles.lookup().lookupClass()).a(207649276453669L);
                l7.s = new HashMap<K, V>(13);
                var0 = l7.p ^ 121214462150324L;
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
                var9_3 = new String[16];
                var7_4 = 0;
                var6_5 = "\u000f\f\u00f0*\u00d0cp\u000b\u00d1x\u00b5\u00bb\u00dc\u00a5\u0000&\u0010\u00c6\u00d4!3\u00de\u009d\u000b\u00c3^\u0096\u001f\u0014%T\u00a7\u00be\u0010\u00b4\u0083kO\u00c5&\u00f1\u0098\u0086\u00ba=\u008d\u0095\u0013_\u00c8\u0018\u00fa\u0012^\u009c5vZ\u00b9w7\u00a3P\u0001&.\u0084M\u0002\u00d0\u00d6\u00dfWg\u00e6\u0010\u00ca\u008b\u00da\u00a3\u00ea\u0083<\u00de\u0017\u009enM\u00b0\u0089\u00d5\u00ed\u0010\u0095-X\u00920\u00e4\u00faT\u00a2\u00d7K\u00b0\u00e2\u007f\u0005\u00ad \u00c4\u00a2\u00beZ\u00cb\u00ad\u00e9*\u00cd&\u009b\u00b5i\u001bJp.d\u0096KVK\u00b9\u00ec\u0086\u00d8\u00ef\u00d1\u00e1\u00f5\u00a9Y\u0010F\u0092\u00af>\u009d\u00cd\u00a3\u00fc\u00b91i\u00fam\u000f\u00f7\u0082(\u00bf\u00a0Q\u00b9\u00dc\u00be\u00f4{\u0013\n@y\u00d6\u0094=A\u00ca\u00a5\u00f5\u007f\u000bPz\u00d3{G\u00e6&\u00b4\u0012!4\u00d2/\u007f\u00e1\r\u00cb\u00932\u0010\u00d1\u00bce\u00db\u00f2Bl\u0098\u001b\u0083$\u009f\u00fe\u00cf]t\u0010\u0088*\u0086s\u00c6{\u00d9\u00a6\u00baEO|\u00cd#\u00b3L\u0010\u001aS\u0083E\u00d1g\u00e7\u0017M\u00fd>\u0018\u0015\n\u0007\u00860\u0099\u00b2\u0007Dk&\r\u00df\u0012\u00d9\u0088\u00ed?\u00d6N\u001d9\u00f8p zB\u00a6\u0099\u00d6t\u00b4\u00a5/\u00da`\u00e8\u00d0.\u00dd\u00d4$\u00fe\u00b9dj=GN\u00f6\u00e7\u00deZ\u0010^\u00aaE5\u0005\u0095\u00f8\u00c7\u00d4f\u00c3H@\u0002\u0082\u00f4";
                var8_6 = "\u000f\f\u00f0*\u00d0cp\u000b\u00d1x\u00b5\u00bb\u00dc\u00a5\u0000&\u0010\u00c6\u00d4!3\u00de\u009d\u000b\u00c3^\u0096\u001f\u0014%T\u00a7\u00be\u0010\u00b4\u0083kO\u00c5&\u00f1\u0098\u0086\u00ba=\u008d\u0095\u0013_\u00c8\u0018\u00fa\u0012^\u009c5vZ\u00b9w7\u00a3P\u0001&.\u0084M\u0002\u00d0\u00d6\u00dfWg\u00e6\u0010\u00ca\u008b\u00da\u00a3\u00ea\u0083<\u00de\u0017\u009enM\u00b0\u0089\u00d5\u00ed\u0010\u0095-X\u00920\u00e4\u00faT\u00a2\u00d7K\u00b0\u00e2\u007f\u0005\u00ad \u00c4\u00a2\u00beZ\u00cb\u00ad\u00e9*\u00cd&\u009b\u00b5i\u001bJp.d\u0096KVK\u00b9\u00ec\u0086\u00d8\u00ef\u00d1\u00e1\u00f5\u00a9Y\u0010F\u0092\u00af>\u009d\u00cd\u00a3\u00fc\u00b91i\u00fam\u000f\u00f7\u0082(\u00bf\u00a0Q\u00b9\u00dc\u00be\u00f4{\u0013\n@y\u00d6\u0094=A\u00ca\u00a5\u00f5\u007f\u000bPz\u00d3{G\u00e6&\u00b4\u0012!4\u00d2/\u007f\u00e1\r\u00cb\u00932\u0010\u00d1\u00bce\u00db\u00f2Bl\u0098\u001b\u0083$\u009f\u00fe\u00cf]t\u0010\u0088*\u0086s\u00c6{\u00d9\u00a6\u00baEO|\u00cd#\u00b3L\u0010\u001aS\u0083E\u00d1g\u00e7\u0017M\u00fd>\u0018\u0015\n\u0007\u00860\u0099\u00b2\u0007Dk&\r\u00df\u0012\u00d9\u0088\u00ed?\u00d6N\u001d9\u00f8p zB\u00a6\u0099\u00d6t\u00b4\u00a5/\u00da`\u00e8\u00d0.\u00dd\u00d4$\u00fe\u00b9dj=GN\u00f6\u00e7\u00deZ\u0010^\u00aaE5\u0005\u0095\u00f8\u00c7\u00d4f\u00c3H@\u0002\u0082\u00f4".length();
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
                    var9_3[var7_4++] = l7.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c5l\u00dd\u00da\u00eb\u009al\u00ab\u00c2\u0086L\u001f\u00f8\u0012\u00afl\u0010\u00bb\u00a0\u00f1\u0082\u008cn\f\u001c\u00997\u009a(\u00a6\u0092}\u0007";
                    var8_6 = "\u00c5l\u00dd\u00da\u00eb\u009al\u00ab\u00c2\u0086L\u001f\u00f8\u0012\u00afl\u0010\u00bb\u00a0\u00f1\u0082\u008cn\f\u001c\u00997\u009a(\u00a6\u0092}\u0007".length();
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
                    var9_3[var7_4++] = l7.a(var10_9).intern();
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
        l7.q = var9_3;
        l7.r = new String[16];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B4A;
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
                throw new RuntimeException("l7", exception);
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
            l7.r[n2] = l7.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = l7.a(n, l);
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
            throw new RuntimeException("l7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(l7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
