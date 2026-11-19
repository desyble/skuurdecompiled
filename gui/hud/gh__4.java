import java.awt.Font;
import java.io.InputStream;
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

public final class gh {
    public static final gh e;
    public static final gh g;
    public static final gh h;
    public static final gh c;
    public static final gh d;
    public static yS i;
    private final String a;
    private final boolean b;
    private final Map<Float, Di> f = new HashMap<Float, Di>();
    private static final long j;
    private static final String[] k;
    private static final String[] l;
    private static final Map m;

    private gh(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    private gh(String string) {
        this.a = string;
        this.b = false;
    }

    public Di a(float f) {
        return this.f.computeIfAbsent(Float.valueOf(f), arg_0 -> this.lambda$get$0(f, arg_0));
    }

    public Di a(float f, boolean bl) {
        return this.f.computeIfAbsent(Float.valueOf(f), arg_0 -> this.lambda$get$1(f, bl, arg_0));
    }




    private Di a(String string, float f, boolean bl, long l) {
        Font font;
        Font font2;
        int n;
        int n2;
        int n3;
        block14: {
            long l2 = l = j ^ l;
            long l3 = l2 ^ 0x4870BF7E71BCL;
            int n4 = (int)(l3 >>> 48);
            int n5 = (int)(l3 << 16 >>> 32);
            int n6 = (int)(l3 << 48 >>> 48);
            long l4 = l2 ^ 0x75C33E941A3DL;
            int n7 = (int)(l4 >>> 32);
            int n8 = (int)(l4 << 32 >>> 48);
            int n9 = (int)(l4 << 48 >>> 48);
            long l5 = l2 ^ 0x3463946A53D6L;
            int n10 = (int)(l5 >>> 48);
            int n11 = (int)(l5 << 16 >>> 32);
            int n12 = (int)(l5 << 48 >>> 48);
            long l6 = l2 ^ 0x1C9E4350315AL;
            n3 = (int)(l6 >>> 32);
            n2 = (int)(l6 << 32 >>> 48);
            n = (int)(l6 << 48 >>> 48);
            font2 = new Font((String)((Object)gh.a("p", (int)969, (long)(0x1EBB54195EB3500CL ^ l))), 0, (int)f);
            String string2 = Di.b();
            try {
                block15: {
                    block12: {
                        Font font3;
                        block13: {
                            if (!this.b) break block15;
                            font = new Font(string, 0, (int)f);
                            if (l <= 0L) break block12;
                            font3 = font;
                            if (string2 == null) break block13;
                            try {
                                block16: {
                                    if (font3.getFamily().equalsIgnoreCase(string)) break block14;
                                    break block16;
                                    catch (Exception exception) {
                                        throw gh.a(exception);
                                    }
                                }
                                font3 = font2;
                            }
                            catch (Exception exception) {
                                throw gh.a(exception);
                            }
                        }
                        font = font3;
                    }
                    if (string2 != null) break block14;
                }
                FO fO = new FO(n7, n8, (String)((Object)gh.a("p", (int)11897, (long)(0x4761D9F93F597DB8L ^ l))) + string + (String)((Object)gh.a("p", (int)5358, (long)(0x3D7A733CBAB2C722L ^ l))), (char)n9);
                InputStream inputStream = Hk.b().j().b((short)n4, n5, fO, n6).c();
                font = Font.createFont(0, inputStream).deriveFont(0, f);
                inputStream.close();
                Font font4 = null;
                try {
                    fO = new FO(n7, n8, (String)((Object)gh.a("p", (int)23882, (long)(0x20CB7B6F38790E8CL ^ l))) + string + (String)((Object)gh.a("p", (int)7935, (long)(0x36669FBC03EB4D3DL ^ l))), (char)n9);
                    InputStream inputStream2 = Hk.b().j().b((short)n4, n5, fO, n6).c();
                    font4 = Font.createFont(0, inputStream2).deriveFont(1, f);
                    inputStream2.close();
                }
                catch (Exception exception) {

                }
                if (font4 != null) {
                    return new Di(font, (char)n10, font4, font2, bl, n11, (short)n12);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException((String)((Object)gh.a("p", (int)26854, (long)(0x70D75E84CB153B21L ^ l))), exception);
            }
        }
        try {
            if (font != null) {
                return new Di(n3, font, n2, (short)n, font2, bl);
            }
        }
        catch (Exception exception) {
            throw gh.a(exception);
        }
        throw new RuntimeException((String)((Object)gh.a("p", (int)16461, (long)(0x7514ADC819DF138DL ^ l))));
    }

    private Di lambda$get$1(float f, boolean bl, Float f2) {
        long l = j ^ 0x18765CAE2BE8L;
        long l2 = l ^ 0xF8FBB32E0F5L;
        try {
            return this.a(this.a, f, bl, l2);
        }
        catch (Exception exception) {
            throw new RuntimeException((String)((Object)gh.a("p", (int)18287, (long)(0x7FCC7D7FDFE3B813L ^ l))) + this, exception);
        }
    }

    private Di lambda$get$0(float f, Float f2) {
        long l = j ^ 0x5D9F357FBC8FL;
        long l2 = l ^ 0x4A66D2E37792L;
        try {
            return this.a(this.a, f, true, l2);
        }
        catch (Exception exception) {
            throw new RuntimeException((String)((Object)gh.a("p", (int)21668, (long)(0x2B153F463CF03CBEL ^ l))) + this, exception);
        }
    }




    static {
        block11: {
            block10: {
                gh.j = _c.a((long)7692251647471122354L, (long)-2533683618681285840L, MethodHandles.lookup().lookupClass()).a(46563495698823L);
                var9 = gh.j ^ 33158301948742L;
                v0 = var9 ^ 90124743937965L;
                var11_1 = (int)(v0 >>> 48);
                var12_2 = (int)(v0 << 16 >>> 32);
                var13_3 = (int)(v0 << 48 >>> 48);
                gh.m = new HashMap<K, V>(13);
                var0_4 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v1 = SecretKeyFactory.getInstance("DES");
                v2 = new byte[8];
                v3 = v2;
                v2[0] = (byte)(var9 >>> 56);
                for (var1_5 = 1; var1_5 < 8; ++var1_5) {
                    v3 = v3;
                    v3[var1_5] = (byte)(var9 << var1_5 * 8 >>> 56);
                }
                var0_4.init(2, (Key)v1.generateSecret(new DESKeySpec(v3)), new IvParameterSpec(new byte[8]));
                var7_6 = new String[14];
                var5_7 = 0;
                var4_8 = "\u00da\u00d4\u00ee~\b;\nhw\u00fc\u00d7p\u00eb\u0088\u00ee\u00c8:xNjM\u008dN\u00f75\u00b73\u0089'&\u00ef\u00b7(_\u00cd\u00c6}\u00f0\u00ae\u00d9u\u00ec9\u00a3\u00f1\u00df\u0081*\u009f\u00e5\u0080u\u00e1S+\u00fd\u009e\u00b7\u00b6\u000f\u00e7y\u008f.\u0089B\u00d6*\u00b0li$\u0092\u0010\u00a4\u00a8NA#\u00a89\u0004\u001cQ\u00a4\u00de\u008a\u00d3\u00fb<\u0010\u00c8\u0019/\u00b4\u00cc!]S\u00fd\u00e7\u0006\u0089T(\u0006C\u0010\u00d2\u0011\u0013\u00f8p\u0080\u008cxE\u00e5{-7\u00e6w9\u0010\u00a4\u0087m\u0084\u00a7\u00c0,\t\u00e1\u00c6;\u00b2\u00f5+k\u00e1(\\\u0089\u0082\u0013\u00e7\u00d8\u00de\u00c1\u00139>\u00cfJ\u000fj\u009a\u00cf\u00cf\u0093\u009c\u00da#\u009e$?b\u0095\u0014\u00edj\u00eb.j\u00d6\u00b6\u001b\u0004\u000e\u00fb\u00f3\u0018\u00a0O\u00de\u001dnLBi\u00a3O\u0090H\u00b7\u00d7\u00b8\u00a8\u0083U\u00ae\u00fc\u0018\u0018\u00dc\u000f\u0010\u000e\u00d4\u007f;\u00fe\u00f1\u00ea\u008c*\u00cb\u0084\u00c3\u0090\u0092I- \u0081.\u0090\u00d0\u001f\u00e4\u00882\t\u00deA\u00a6t\u00adJ;\u00d8c\u00d9\u00d7X\u00ab\u00b7\u00f4o\u0093D\u00ad\u00db\u008c\u00ab\u00c7 \u00de\u00fe|\u00d44\u0091\r\u00ee\u00c2Z\u00d2_K\u00c4\u000f\u00bf\u00cc\u00cf\u00b3\u00e5\u0083I\u00c7B\u00f6\bX\u0002\u00a9Z\u0082G(\u009c\u0099\u00f8\u00fdS\u001cz\u0003\u00cc1\u00b9\b\u00ca\u00be\u0012|\u00e9J\u0086\u00e6\u00f2`\u0093\u00ea\u0006\u00024Is\u00ab\u00cd\u00a1\u0004\u00d3\u00c9\u00c9n\u00c4{\u000b";
                var6_9 = "\u00da\u00d4\u00ee~\b;\nhw\u00fc\u00d7p\u00eb\u0088\u00ee\u00c8:xNjM\u008dN\u00f75\u00b73\u0089'&\u00ef\u00b7(_\u00cd\u00c6}\u00f0\u00ae\u00d9u\u00ec9\u00a3\u00f1\u00df\u0081*\u009f\u00e5\u0080u\u00e1S+\u00fd\u009e\u00b7\u00b6\u000f\u00e7y\u008f.\u0089B\u00d6*\u00b0li$\u0092\u0010\u00a4\u00a8NA#\u00a89\u0004\u001cQ\u00a4\u00de\u008a\u00d3\u00fb<\u0010\u00c8\u0019/\u00b4\u00cc!]S\u00fd\u00e7\u0006\u0089T(\u0006C\u0010\u00d2\u0011\u0013\u00f8p\u0080\u008cxE\u00e5{-7\u00e6w9\u0010\u00a4\u0087m\u0084\u00a7\u00c0,\t\u00e1\u00c6;\u00b2\u00f5+k\u00e1(\\\u0089\u0082\u0013\u00e7\u00d8\u00de\u00c1\u00139>\u00cfJ\u000fj\u009a\u00cf\u00cf\u0093\u009c\u00da#\u009e$?b\u0095\u0014\u00edj\u00eb.j\u00d6\u00b6\u001b\u0004\u000e\u00fb\u00f3\u0018\u00a0O\u00de\u001dnLBi\u00a3O\u0090H\u00b7\u00d7\u00b8\u00a8\u0083U\u00ae\u00fc\u0018\u0018\u00dc\u000f\u0010\u000e\u00d4\u007f;\u00fe\u00f1\u00ea\u008c*\u00cb\u0084\u00c3\u0090\u0092I- \u0081.\u0090\u00d0\u001f\u00e4\u00882\t\u00deA\u00a6t\u00adJ;\u00d8c\u00d9\u00d7X\u00ab\u00b7\u00f4o\u0093D\u00ad\u00db\u008c\u00ab\u00c7 \u00de\u00fe|\u00d44\u0091\r\u00ee\u00c2Z\u00d2_K\u00c4\u000f\u00bf\u00cc\u00cf\u00b3\u00e5\u0083I\u00c7B\u00f6\bX\u0002\u00a9Z\u0082G(\u009c\u0099\u00f8\u00fdS\u001cz\u0003\u00cc1\u00b9\b\u00ca\u00be\u0012|\u00e9J\u0086\u00e6\u00f2`\u0093\u00ea\u0006\u00024Is\u00ab\u00cd\u00a1\u0004\u00d3\u00c9\u00c9n\u00c4{\u000b".length();
                var3_10 = 32;
                var2_11 = -1;
lbl26:


                while (true) {
                    v4 = ++var2_11;
                    v5 = var4_8.substring(v4, v4 + var3_10);
                    v6 = -1;
                    break block10;
                    break;
                }
lbl31:


                while (true) {
                    var7_6[var5_7++] = gh.a(var8_12).intern();
                    if ((var2_11 += var3_10) < var6_9) {
                        var3_10 = var4_8.charAt(var2_11);
                        ** continue;
                    }
                    var4_8 = "\u00b7\u00d0h)l\u00ebbU\u00f9\u0011\u0090\u00d34\u0091\t\u00f4\u00e1\u00a7<\u00d45\b\u0082\u00ce\u0010\u00e7\u009a+\u00ff\u00da)h\u00c7\u0019\u00a7\u0015\u0091\u007f\u00b8\u0084\u00af";
                    var6_9 = "\u00b7\u00d0h)l\u00ebbU\u00f9\u0011\u0090\u00d34\u0091\t\u00f4\u00e1\u00a7<\u00d45\b\u0082\u00ce\u0010\u00e7\u009a+\u00ff\u00da)h\u00c7\u0019\u00a7\u0015\u0091\u007f\u00b8\u0084\u00af".length();
                    var3_10 = 24;
                    var2_11 = -1;
lbl40:


                    while (true) {
                        v7 = ++var2_11;
                        v5 = var4_8.substring(v7, v7 + var3_10);
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl45:


                while (true) {
                    var7_6[var5_7++] = gh.a(var8_12).intern();
                    if ((var2_11 += var3_10) < var6_9) {
                        var3_10 = var4_8.charAt(var2_11);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_12 = var0_4.doFinal(v5.getBytes("ISO-8859-1"));
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl57:


                ** continue;
            }
        }
        gh.k = var7_6;
        gh.l = new String[14];
        gh.e = new gh((String)gh.a("p", (int)28398, (long)(3866251464750014770L ^ var9)));
        gh.g = new gh((String)gh.a("p", (int)30704, (long)(2009012943015065632L ^ var9)), true);
        gh.h = new gh((String)gh.a("p", (int)25755, (long)(16479605025614666L ^ var9)));
        gh.c = new gh((String)gh.a("p", (int)19465, (long)(8180553232037839826L ^ var9)));
        gh.d = new gh((String)gh.a("p", (int)9048, (long)(3886295483958652045L ^ var9)));
        gh.i = new yS((short)var11_1, var12_2, (char)var13_3, (String)gh.a("p", (int)28398, (long)(3866251464750014770L ^ var9)));
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x18DC;
        if (gh.l[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("gh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            gh.l[n2] = gh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return gh.l[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = gh.a(n, l);
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
            throw new RuntimeException("gh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
