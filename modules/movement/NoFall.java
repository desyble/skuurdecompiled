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

public class lw
extends lh {
    private final kt<RB> p;
    private final kt<Boolean> n;
    private boolean k;
    private float l;
    private int m;
    @A
    public final R8<b5> q;
    @A
    public final R8<v7> o;
    private static final long r;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;

    public lw(short s, int n, EU eU, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ r;
        super(eU);
        this.p = new kt((String)((Object)lw.a("n", (int)5696, (long)(0x10A6E2B12C8EA155L ^ l))), (Object)new RB((String)((Object)lw.a("n", (int)28635, (long)(0xE6D3363179158C6L ^ l))), new String[]{lw.a("n", (int)19319, (long)(0x3DD30DA947BEFC6CL ^ l)), lw.a("n", (int)24667, (long)(0x535583916A2BD749L ^ l)), lw.a("n", (int)32090, (long)(0x59C2D4A6FDEECA40L ^ l)), lw.a("n", (int)23229, (long)(0x4AD57648C71BEDA5L ^ l)), lw.a("n", (int)2693, (long)(0x118A647D77F9BD91L ^ l)), lw.a("n", (int)21297, (long)(0x4620ACD94A36E422L ^ l)), lw.a("n", (int)9540, (long)(0x2B3CA1FC3F36925DL ^ l))}), (String)((Object)lw.a("n", (int)9363, (long)(0x3B258DD36732139CL ^ l))));
        this.n = new kt((String)((Object)lw.a("n", (int)30042, (long)(0x7E26EAC0FD4EC24AL ^ l))), (Object)false, (String)((Object)lw.a("n", (int)32093, (long)(0x69CA3D6650CD4A41L ^ l))), this::lambda$new$0);
        this.k = false;
        this.l = 0.0f;
        this.m = 0;
        this.q = this::lambda$new$1;
        this.o = lw::lambda$new$2;
        this.a(this.p);
        this.a(this.n);
    }

    private boolean a() {
        double d;
        block2: {
            block3: {
                boolean bl = lj.i();
                try {
                    double d2 = (double)(Hk.j().r - this.l) - Hk.j().ay - 3.0;
                    d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                    if (!bl) break block2;
                    if (d <= 0) break block3;
                }
                catch (H h) {
                    throw lw.a(h);
                }
                d = 1.0;
                break block2;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    public void a(char c, long l) {
        lw lw2;
        long l2;
        int n;
        block4: {
            block5: {
                long l3 = (long)c << 48 | l << 16 >>> 16;
                long l4 = l3 ^ 0L;
                n = (int)(l4 >>> 48);
                l2 = l4 << 16 >>> 16;
                boolean bl = lj.i();
                try {
                    try {
                        lw2 = this;
                        if (!bl) break block4;
                        if (!lw2.k) break block5;
                    }
                    catch (H h) {
                        throw lw.a(h);
                    }
                    Hk.b().ay.h = 1.0f;
                    this.k = false;
                }
                catch (H h) {
                    throw lw.a(h);
                }
            }
            this.l = 0.0f;
            lw2 = this;
        }
        super.a((char)n, l2);
    }

    private static void lambda$new$2(v7 v72) {
    }




    private void lambda$new$1(b5 var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private boolean lambda$new$0() {
        long l = r ^ 0x9E8A384BEE1L;
        return this.p.q().equals(lw.a("n", (int)6723, (long)(0x50F9C782EA4D697CL ^ l)));
    }




    static {
        block11: {
            block10: {
                lw.r = _c.a((long)3406189184471576142L, (long)2844116820746312797L, MethodHandles.lookup().lookupClass()).a(106128243437431L);
                lw.u = new HashMap<K, V>(13);
                var0 = lw.r ^ 29869245849547L;
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
                var9_3 = new String[18];
                var7_4 = 0;
                var6_5 = "\u00f0=\u0094\u00b1\u0018\u00c2\u00ac\u00ba\u00ed\u00b7\u00ae\u0080\u00fe\u00e5=\u00e5h\u0092\u00ed\u00c8,f?\u0082i\u008fEn\u008b\u0086\u00cd4\u0010m\u0016\u00bbIj\u0014!\u0096\u00c6\u0096\u00d7bU\u009ai\u00a78#\u00ed\u0000\u00fb%\u0080\u00b5\u00b4\u00a7\u0007\u00ed\u0090\u00aaz%;\u00ff\u00a6\u00ab\u00f6\u00b3\u00d2\u00b3\u00daI^\u0083F=\u00adr\u00aeF\u00b8\u00bcV\u0094x/\u0098\u00bb\u00d1\u00b56`\u00e5HP_\u00b9\u00db\u00f4jh\u007f\u0010\u0010\u00fc\u00b2\u0019\u00b8\u00f3]\u00f8\u0017g\u00dc\u00f7~V\u001b\u00d4K [\u00e3\u00de\u00ce\u0002\u00e3SQ\u00c9\u00dd\u00c1\u000f\u0091\u00be\u0085\fgOq\u00d3H\u00bc\u0003\u00b1\u00b1)%\u00fe\u00d9\u00e6\u0095\u00d6\u0010\u00dchr\u008c9B\u00b8\u00baw\u00bbC\u008c\u0094\u00d2o\u00cd\u0018\u00b8-\u00b9\u00d9$\u00d9\u00c3\u00f9\u001f\u00f3\u00c6_\u009c\u00ac\u001b\u0084\u0017\u00ef,~\u00e4\u00f6\u00c5\u00e0\u0010wnN\"P\u0011\u001cS\u001b\u00e9Zq\u008d\u00db\u0080O\u0010Dk\u0011\u0002X\u00a1&\u0018\u00b6\u00c3.p+^#[\u0010\u000fW-\f;\f\u0013\u0011\u009a\u0081|QU\u00eb\u00c3.\u0010\u00d0@\u00d3\u00e1\u0005\u0093\u00a7>F\u00f9&\u00c4\u00bbg\u00bad\u0010s\u00bf\u0007\u00cc\u00ebx\r\u00c0\u0013O\u00b5c\u0085_\u0081:\u0010J\u00dd\u0017Da\u00a9\u00dd\u0007+\u00ae_\u0084V\u00bdLD\u0010\u00dfP\u00ed\u00d4F\u00f9\u009e\u001c!\u00bb\u0007W\u00ee\u00ebRM\u0010nTs\u00b2Ab\u00c5\u009a\u00df\u00e7\u00a1\u0088^\u00f6:\u00cd\u0010\u008a\u00ff\u0002\u00b1Yw\u00d7#\u00a5KJ@\u0007\"\u0093F";
                var8_6 = "\u00f0=\u0094\u00b1\u0018\u00c2\u00ac\u00ba\u00ed\u00b7\u00ae\u0080\u00fe\u00e5=\u00e5h\u0092\u00ed\u00c8,f?\u0082i\u008fEn\u008b\u0086\u00cd4\u0010m\u0016\u00bbIj\u0014!\u0096\u00c6\u0096\u00d7bU\u009ai\u00a78#\u00ed\u0000\u00fb%\u0080\u00b5\u00b4\u00a7\u0007\u00ed\u0090\u00aaz%;\u00ff\u00a6\u00ab\u00f6\u00b3\u00d2\u00b3\u00daI^\u0083F=\u00adr\u00aeF\u00b8\u00bcV\u0094x/\u0098\u00bb\u00d1\u00b56`\u00e5HP_\u00b9\u00db\u00f4jh\u007f\u0010\u0010\u00fc\u00b2\u0019\u00b8\u00f3]\u00f8\u0017g\u00dc\u00f7~V\u001b\u00d4K [\u00e3\u00de\u00ce\u0002\u00e3SQ\u00c9\u00dd\u00c1\u000f\u0091\u00be\u0085\fgOq\u00d3H\u00bc\u0003\u00b1\u00b1)%\u00fe\u00d9\u00e6\u0095\u00d6\u0010\u00dchr\u008c9B\u00b8\u00baw\u00bbC\u008c\u0094\u00d2o\u00cd\u0018\u00b8-\u00b9\u00d9$\u00d9\u00c3\u00f9\u001f\u00f3\u00c6_\u009c\u00ac\u001b\u0084\u0017\u00ef,~\u00e4\u00f6\u00c5\u00e0\u0010wnN\"P\u0011\u001cS\u001b\u00e9Zq\u008d\u00db\u0080O\u0010Dk\u0011\u0002X\u00a1&\u0018\u00b6\u00c3.p+^#[\u0010\u000fW-\f;\f\u0013\u0011\u009a\u0081|QU\u00eb\u00c3.\u0010\u00d0@\u00d3\u00e1\u0005\u0093\u00a7>F\u00f9&\u00c4\u00bbg\u00bad\u0010s\u00bf\u0007\u00cc\u00ebx\r\u00c0\u0013O\u00b5c\u0085_\u0081:\u0010J\u00dd\u0017Da\u00a9\u00dd\u0007+\u00ae_\u0084V\u00bdLD\u0010\u00dfP\u00ed\u00d4F\u00f9\u009e\u001c!\u00bb\u0007W\u00ee\u00ebRM\u0010nTs\u00b2Ab\u00c5\u009a\u00df\u00e7\u00a1\u0088^\u00f6:\u00cd\u0010\u008a\u00ff\u0002\u00b1Yw\u00d7#\u00a5KJ@\u0007\"\u0093F".length();
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
                    var9_3[var7_4++] = lw.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c0\u00df\u0084\u00be\u0095\u00d9\u009a\u00b3M\u0093\u00aa\u00bc\u00bc\u008dZ0\u0012p\u0096\u00b1\n\u00a9q\u00c8'#\u008bj\u0012\u00ba\u00e9Y\u0018\u00f8R0\u00cb\u0005\u008ch\u00a8\u008f0\u0019\u008a\u00da\u0095\t\u00ac'\u0080\u001359H\u00c4\u00c1";
                    var8_6 = "\u00c0\u00df\u0084\u00be\u0095\u00d9\u009a\u00b3M\u0093\u00aa\u00bc\u00bc\u008dZ0\u0012p\u0096\u00b1\n\u00a9q\u00c8'#\u008bj\u0012\u00ba\u00e9Y\u0018\u00f8R0\u00cb\u0005\u008ch\u00a8\u008f0\u0019\u008a\u00da\u0095\t\u00ac'\u0080\u001359H\u00c4\u00c1".length();
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
                    var9_3[var7_4++] = lw.a(var10_9).intern();
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
        lw.s = var9_3;
        lw.t = new String[18];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5BA7;
        if (t[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])u.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lw", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = s[n2].getBytes("ISO-8859-1");
            lw.t[n2] = lw.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lw.a(n, l);
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
            throw new RuntimeException("lw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
