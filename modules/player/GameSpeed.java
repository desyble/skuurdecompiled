import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mn
extends lh {
    public static final kt<RB> l;
    private final kt<Number> v;
    private final kt<Number> o;
    private final List<I2<?>> s;
    private boolean r;
    private int q;
    private int t;
    private boolean n;
    private boolean u;
    private boolean k;
    @A
    public final R8<H6> w;
    @A
    public final R8<b7> y;
    @A
    public final R8<b5> p;
    @A
    public final R8<cn> x;
    @A
    public final R8<bR> m;
    private static final long z;
    private static final String[] A;
    private static final String[] B;
    private static final Map C;

    public mn(EU eU, short s, int n, int n2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ z;
        super(eU);
        this.v = new kt((String)((Object)mn.a("o", (int)8066, (long)(0x3B677594B20BABB2L ^ l))), (Object)1.0, (String)((Object)mn.a("o", (int)25682, (long)(0x5F629757A128D06FL ^ l))), 0.1, 0.1, 10.0, "x");
        this.o = new kt((String)((Object)mn.a("o", (int)21256, (long)(0x1B593144664FE73DL ^ l))), (Object)2, (String)((Object)mn.a("o", (int)12344, (long)(0x27F09A9F76B1840FL ^ l))), 1.0, 1.0, 20.0, mn::lambda$new$0);
        this.s = new ArrayList();
        this.r = false;
        this.q = -1;
        this.t = 0;
        this.n = false;
        this.u = false;
        this.k = false;
        this.w = this::lambda$new$1;
        this.y = this::lambda$new$2;
        this.p = this::lambda$new$3;
        this.x = this::lambda$new$4;
        this.m = this::lambda$new$5;
        this.a(new kt[]{mn.l, this.v, this.o});
    }




    public void d(int var1_1, int var2_2, int var3_3) {
























        throw new IllegalStateException("Decompilation failed");
    }

    public void a(char c, long l) {
        block15: {
            block20: {
                mn mn2;
                block17: {
                    block16: {
                        int n;
                        block18: {
                            String[] stringArray;
                            block19: {
                                long l2 = (long)c << 48 | l << 16 >>> 16;
                                Hk.b().ay.h = 1.0f;
                                stringArray = m6.a();
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    this.s.clear();
                                                    if (stringArray != null) break block15;
                                                    if (!mn.l.q().equals(mn.a("o", (int)20730, (long)(0x7E492830AA42E500L ^ l2)))) break block16;
                                                }
                                                catch (H h) {
                                                    throw mn.a((Exception)((Object)h));
                                                }
                                                if (l <= 0L) break block17;
                                                if (Hk.j() == null) break block16;
                                            }
                                            catch (H h) {
                                                throw mn.a((Exception)((Object)h));
                                            }
                                            n = this.r;
                                            if (l < 0L || stringArray != null) break block18;
                                        }
                                        catch (H h) {
                                            throw mn.a((Exception)((Object)h));
                                        }
                                        if (n == 0) break block19;
                                    }
                                    catch (H h) {
                                        throw mn.a((Exception)((Object)h));
                                    }
                                    Ab.b((I2)new DZ((LQ)Hk.j(), OK.START_SPRINTING));
                                    this.r = false;
                                }
                                catch (H h) {
                                    throw mn.a((Exception)((Object)h));
                                }
                            }
                            try {
                                if (c < '\u0000') break block15;
                                mn2 = this;
                                if (stringArray != null) break block20;
                                n = mn2.q;
                            }
                            catch (H h) {
                                throw mn.a((Exception)((Object)h));
                            }
                        }
                        try {
                            if (n != -1) {
                                Hk.j().bU.g = this.q;
                                this.q = -1;
                            }
                        }
                        catch (H h) {
                            throw mn.a((Exception)((Object)h));
                        }
                    }
                    this.t = 0;
                    this.n = false;
                    this.u = false;
                }
                mn2 = this;
            }
            mn2.k = false;
            Hk.b().af.aa = -1;
        }
    }





    private int a() {
        String[] stringArray = m6.a();
        for (int i = 0; i < 9; ++i) {
            qP qP2;
            block5: {
                qP qP3 = Hk.j().bU.c(i);
                try {
                    qP2 = qP3;
                    if (stringArray != null) break block5;
                    if (qP2 == null) return i;
                }
                catch (H h) {
                    throw mn.a((Exception)((Object)h));
                }
                qP2 = qP3;
            }
            try {
                if (qP2.v() != null) continue;
                return i;
            }
            catch (H h) {
                throw mn.a((Exception)((Object)h));
            }
        }
        return -1;
    }




    private void lambda$new$5(bR var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }




    private void lambda$new$4(cn var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private void lambda$new$3(b5 b52) {
        block32: {
            block33: {
                int n;
                String[] stringArray;
                block30: {
                    block31: {
                        block27: {
                            block28: {
                                block25: {
                                    block26: {
                                        block24: {
                                            long l = z ^ 0x576C5FC9F463L;
                                            stringArray = m6.a();
                                            try {
                                                try {
                                                    try {
                                                        if (!b52.j() || Hk.j() == null) break block24;
                                                    }
                                                    catch (H h) {
                                                        throw mn.a((Exception)((Object)h));
                                                    }
                                                    n = mn.l.q().equals(mn.a("o", (int)26981, (long)(0x51E0A3AF8E769913L ^ l)));
                                                    if (stringArray != null) break block25;
                                                }
                                                catch (H h) {
                                                    throw mn.a((Exception)((Object)h));
                                                }
                                                if (n != 0) break block26;
                                            }
                                            catch (H h) {
                                                throw mn.a((Exception)((Object)h));
                                            }
                                        }
                                        return;
                                    }
                                    n = this.u;
                                }
                                try {
                                    block29: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (stringArray != null) break block27;
                                                            if (n == 0) break block28;
                                                        }
                                                        catch (H h) {
                                                            throw mn.a((Exception)((Object)h));
                                                        }
                                                        n = this.k;
                                                        if (stringArray != null) break block27;
                                                    }
                                                    catch (H h) {
                                                        throw mn.a((Exception)((Object)h));
                                                    }
                                                    if (n != 0) break block28;
                                                }
                                                catch (H h) {
                                                    throw mn.a((Exception)((Object)h));
                                                }
                                                if (!Hk.j().al) break block29;
                                            }
                                            catch (H h) {
                                                throw mn.a((Exception)((Object)h));
                                            }
                                            this.k = true;
                                            if (stringArray == null) break block28;
                                        }
                                        catch (H h) {
                                            throw mn.a((Exception)((Object)h));
                                        }
                                    }
                                    return;
                                }
                                catch (H h) {
                                    throw mn.a((Exception)((Object)h));
                                }
                            }
                            n = this.n;
                        }
                        try {
                            if (stringArray != null) break block30;
                            if (n == 0) break block31;
                        }
                        catch (H h) {
                            throw mn.a((Exception)((Object)h));
                        }
                        return;
                    }
                    n = this.a();
                }
                int n2 = n;
                try {
                    try {
                        if (stringArray != null) break block32;
                        if (Hk.j().bU.g == n2) break block33;
                    }
                    catch (H h) {
                        throw mn.a((Exception)((Object)h));
                    }
                    this.q = Hk.j().bU.g;
                    Hk.j().bU.g = n2;
                    Hk.b().af.aa = 999999999;
                }
                catch (H h) {
                    throw mn.a((Exception)((Object)h));
                }
            }
            this.n = true;
        }
    }

    private void lambda$new$2(b7 b72) {
        block8: {
            boolean bl;
            block7: {
                long l = z ^ 0x42AC32B1652FL;
                String[] stringArray = m6.a();
                try {
                    try {
                        bl = mn.l.q().equals(mn.a("o", (int)26981, (long)(0x51E0B66FE30E085FL ^ l)));
                        if (stringArray != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (H h) {
                        throw mn.a((Exception)((Object)h));
                    }
                    bl = this.k;
                }
                catch (H h) {
                    throw mn.a((Exception)((Object)h));
                }
            }
            try {
                if (bl) {
                    b72.a(true);
                }
            }
            catch (H h) {
                throw mn.a((Exception)((Object)h));
            }
        }
    }

    private void lambda$new$1(H6 h6) {
        this.s.clear();
        this.q = -1;
        this.t = 0;
        this.n = false;
        this.r = false;
        this.u = false;
        this.k = false;
    }

    private static boolean lambda$new$0() {
        long l = z ^ 0x6EB95FEE8268L;
        return mn.l.q().equals(mn.a("o", (int)21256, (long)(0x1B5955CB70DDD572L ^ l)));
    }




    static {
        block11: {
            block10: {
                mn.z = _c.a((long)-4345703690340163590L, (long)5666266683413167850L, MethodHandles.lookup().lookupClass()).a(147555801068554L);
                var9 = mn.z ^ 9841444072388L;
                mn.C = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[17];
                var5_4 = 0;
                var4_5 = "M\u00af\u00bd\u00da\u00act2\u0099\u0013S\u00a4\u00c1a\u0082\u00e02@:\u00fb\u00f7\u008a@\u00dd\u00b3\",\u00d9p~\u0093y~P\u00ec\u0080v|\u00aa\u00f3),B\u001d\u00bf\u00e1\u001a\u00d4\u00a8`\u00b6\u0010L\"\t\u00d8\u00b2\u00cd\u00f1r\u001c\u00ed\u00beL\u00af\u008d\u00e3e7\u00af\u00f7\u00f2vM\u0002\u009d\u00d8Y\u00fb\u00b9h\u0015\u0010\u0080\u008f=\u00ad\u0006\u00eb\u00f4a7\u00c9]\u00d0\u00a9\u0084\u00ca$@s'\u00b7\u008c\u00f4\u00b5\t\u00ac\u0086H\u00eb\u00a9\u00f3\\\u00d6<\u00f2\u001fs\u00f1\u0087%\u0087\u0099\u009a/\u0083\u00af\u0018\u009f\u0080\u00f1\u00d6\u00e9\u00f9\u0016\u00f9N\u00eb\u00d4\"N9v\u00af\u00b3p\u008dB\u00df:3`\u00b8\u00e6\u00a7^\u00dd\u00b5\u00a0U:\u00b8\u00b1\u0010\u001e\u00f7\u00e6\u009fz\u00f8<\u00abS'\\O\u00fd)IT8\u00e8~\u00e6\u00cb\u00a6\u00db\u00f2d\u00bbt\u0007\u0081\u00d3\u0087\u00ac\u0089+\u00d4\u008b\u0019de\u00f6\u00d7\u0010\u001bW\u00b3\u00ddf\u00ed\u00ceb)\u00dd\u00f9\u0097\u00e93Hp<\u00e0\t\u001bM>0\u00f3t@l+Y\u0013\" \u00e3\u00e7\u00cdU1\u0093Q\u00ea\u00a66\u00ab\f~utdY\u0013p1\u00d0\u00df\u00af\u00a6\u00f9^I\u00d3\u0084\u009e\u0005\u001c\u0010\u00f9\u00c0\u00b7\u00f7`at\u00eb\u0016zX\u008c\u008d!o\u008b\u0010j\u00e5\u00b9?\u008ep\u00de\u00d0\u00a8D\u0018?\n\u00f3\u0007\u009b\u0010\u00bc}\u00e0\u00d7\u00af\u00eeQI\u00e3\u00cb}\u0007\u00dc$\u00c9\u00aa\u0010^~\u00a5\u0087i\u00e7\u0015\r\u00cfP\u00a4\u00fa\u00aa\u009a_b\u0010H\u00e7\u00b8vjE\u00bb\u00e2\u0090\u00c6\u00d2:<,)O@\u0001\u0000&\u00f1\f\u0081\u00ab\u009d\u00f5\u0002\u0005l\u00a1E\u00ed\u0094\u00a6\u00f9\u0087\u0001T\u00bf\u00fd@N\u009a\u00e1\b\u00ef\u00c2|\u0007\u00dd\u00eemb`~\u00b8\u000f]Y\u00aa\u00a9l{\u00dd\u00e9\u00d7\u0015\u00956\u00bca\u00dc\u00c1\u00cc\b^\u00fc\u008aZ\u00f2B \u00ec\u00af<=\u00f5\u00a7t\u00b0j\\(\n\u00c9vul\u00a7\u00d6\u00b8\u001b\u009e\u0089s-\u008a]{\u00a4\u00fe^\u00e4\u008e\u0018\u00fe1\u00b9R\u00aa\u00cb\u00f62\u008fx\u00b1\u00d6\u0010\u008e\u0012\u00b2\u00a6)\u00ceHjp\u000fZ";
                var6_6 = "M\u00af\u00bd\u00da\u00act2\u0099\u0013S\u00a4\u00c1a\u0082\u00e02@:\u00fb\u00f7\u008a@\u00dd\u00b3\",\u00d9p~\u0093y~P\u00ec\u0080v|\u00aa\u00f3),B\u001d\u00bf\u00e1\u001a\u00d4\u00a8`\u00b6\u0010L\"\t\u00d8\u00b2\u00cd\u00f1r\u001c\u00ed\u00beL\u00af\u008d\u00e3e7\u00af\u00f7\u00f2vM\u0002\u009d\u00d8Y\u00fb\u00b9h\u0015\u0010\u0080\u008f=\u00ad\u0006\u00eb\u00f4a7\u00c9]\u00d0\u00a9\u0084\u00ca$@s'\u00b7\u008c\u00f4\u00b5\t\u00ac\u0086H\u00eb\u00a9\u00f3\\\u00d6<\u00f2\u001fs\u00f1\u0087%\u0087\u0099\u009a/\u0083\u00af\u0018\u009f\u0080\u00f1\u00d6\u00e9\u00f9\u0016\u00f9N\u00eb\u00d4\"N9v\u00af\u00b3p\u008dB\u00df:3`\u00b8\u00e6\u00a7^\u00dd\u00b5\u00a0U:\u00b8\u00b1\u0010\u001e\u00f7\u00e6\u009fz\u00f8<\u00abS'\\O\u00fd)IT8\u00e8~\u00e6\u00cb\u00a6\u00db\u00f2d\u00bbt\u0007\u0081\u00d3\u0087\u00ac\u0089+\u00d4\u008b\u0019de\u00f6\u00d7\u0010\u001bW\u00b3\u00ddf\u00ed\u00ceb)\u00dd\u00f9\u0097\u00e93Hp<\u00e0\t\u001bM>0\u00f3t@l+Y\u0013\" \u00e3\u00e7\u00cdU1\u0093Q\u00ea\u00a66\u00ab\f~utdY\u0013p1\u00d0\u00df\u00af\u00a6\u00f9^I\u00d3\u0084\u009e\u0005\u001c\u0010\u00f9\u00c0\u00b7\u00f7`at\u00eb\u0016zX\u008c\u008d!o\u008b\u0010j\u00e5\u00b9?\u008ep\u00de\u00d0\u00a8D\u0018?\n\u00f3\u0007\u009b\u0010\u00bc}\u00e0\u00d7\u00af\u00eeQI\u00e3\u00cb}\u0007\u00dc$\u00c9\u00aa\u0010^~\u00a5\u0087i\u00e7\u0015\r\u00cfP\u00a4\u00fa\u00aa\u009a_b\u0010H\u00e7\u00b8vjE\u00bb\u00e2\u0090\u00c6\u00d2:<,)O@\u0001\u0000&\u00f1\f\u0081\u00ab\u009d\u00f5\u0002\u0005l\u00a1E\u00ed\u0094\u00a6\u00f9\u0087\u0001T\u00bf\u00fd@N\u009a\u00e1\b\u00ef\u00c2|\u0007\u00dd\u00eemb`~\u00b8\u000f]Y\u00aa\u00a9l{\u00dd\u00e9\u00d7\u0015\u00956\u00bca\u00dc\u00c1\u00cc\b^\u00fc\u008aZ\u00f2B \u00ec\u00af<=\u00f5\u00a7t\u00b0j\\(\n\u00c9vul\u00a7\u00d6\u00b8\u001b\u009e\u0089s-\u008a]{\u00a4\u00fe^\u00e4\u008e\u0018\u00fe1\u00b9R\u00aa\u00cb\u00f62\u008fx\u00b1\u00d6\u0010\u008e\u0012\u00b2\u00a6)\u00ceHjp\u000fZ".length();
                var3_7 = 16;
                var2_8 = -1;
lbl20:


                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:


                while (true) {
                    var7_3[var5_4++] = mn.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "rp\u00c3\u0013\"\u0083 \u00c1\u0007V{\u0089}f\u00da\u00c6f\u008c\u000b\u008d\u0011\u00a7\u00f5\u00e8T\u00b59\u00b6\u0012\u00d7\u0010\u00c5\u0098\"a\u00a6/o:\u00e9\u008e\u00d5\u00e5\u00d4\"n\u009fL\u00fcz\u00b8.\u001fg\u001a\u00198i\u00a9\u0095\u0094\u00a1\u00f2(w\u00f7\u0003\u00b1\u00cf\u00c77\u00ed\u00d1UN--\u00f49.<\u0083!\u00c0D\u00d9\u00d21\u00e9R\u009ca\u00dd\u0013\u00f7\u00f2\u0007B\u0098\u001a\u00d4%\u00e0\f[/\u00cf\u00f4\u0017\u00fc\u009f%h";
                    var6_6 = "rp\u00c3\u0013\"\u0083 \u00c1\u0007V{\u0089}f\u00da\u00c6f\u008c\u000b\u008d\u0011\u00a7\u00f5\u00e8T\u00b59\u00b6\u0012\u00d7\u0010\u00c5\u0098\"a\u00a6/o:\u00e9\u008e\u00d5\u00e5\u00d4\"n\u009fL\u00fcz\u00b8.\u001fg\u001a\u00198i\u00a9\u0095\u0094\u00a1\u00f2(w\u00f7\u0003\u00b1\u00cf\u00c77\u00ed\u00d1UN--\u00f49.<\u0083!\u00c0D\u00d9\u00d21\u00e9R\u009ca\u00dd\u0013\u00f7\u00f2\u0007B\u0098\u001a\u00d4%\u00e0\f[/\u00cf\u00f4\u0017\u00fc\u009f%h".length();
                    var3_7 = 56;
                    var2_8 = -1;
lbl34:


                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:


                while (true) {
                    var7_3[var5_4++] = mn.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:


                ** continue;
            }
        }
        mn.A = var7_3;
        mn.B = new String[17];
        mn.l = new kt((String)mn.a("o", (int)23203, (long)(2968245700006704504L ^ var9)), (Object)new RB((String)mn.a("o", (int)514, (long)(4794647559516466650L ^ var9)), new String[]{mn.a("o", (int)514, (long)(4794647559516466650L ^ var9)), mn.a("o", (int)21256, (long)(1970662942386191582L ^ var9)), mn.a("o", (int)26981, (long)(5899992797938206388L ^ var9))}), (String)mn.a("o", (int)31680, (long)(156626486904902679L ^ var9)));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6341;
        if (B[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])C.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    C.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mn", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = A[n2].getBytes("ISO-8859-1");
            mn.B[n2] = mn.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return B[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mn.a(n, l);
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
            throw new RuntimeException("mn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mn.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
