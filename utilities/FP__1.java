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

public abstract class FP {
    public static final FP[] e;
    public static final FP i;
    public static final FP l;
    public static final FP o;
    public static final FP j;
    public static final FP p;
    public static final FP q;
    public static final FP c;
    public static final FP f;
    public static final FP r;
    public static final FP s;
    public static final FP b;
    public static final FP t;
    private final int a;
    private final String d;
    private String m;
    private boolean n;
    private boolean g;
    private p[] k;
    private qP u;
    private static int h;
    private static final long v;
    private static final String[] x;
    private static final String[] y;
    private static final Map z;

    public FP(int n, int n2, int n3, String string, int n4) {
        long l = ((long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ v;
        this.m = FP.a("j", (int)9537, (long)(0x5C2C7BACFE56CB15L ^ l));
        this.n = true;
        this.g = true;
        this.a = n;
        this.d = string;
        FP.e[n] = this;
    }

    public int c() {
        return this.a;
    }

    public String k() {
        return this.d;
    }

    public String d(long l, short s) {
        long l2 = (l << 16 | (long)s << 48 >>> 48) ^ v;
        return (String)((Object)FP.a("j", (int)25231, (long)(0x2741068C8A24DD7FL ^ l2))) + this.k();
    }

    public qP n() {
        qP qP2;
        block4: {
            block5: {
                LQ[] lQArray = aQ.p();
                try {
                    try {
                        qP2 = this.u;
                        if (lQArray != null) break block4;
                        if (qP2 != null) break block5;
                    }
                    catch (H h) {
                        throw FP.a(h);
                    }
                    this.u = new qP(this.l(), 1, this.f());
                }
                catch (H h) {
                    throw FP.a(h);
                }
            }
            qP2 = this.u;
        }
        return qP2;
    }

    public abstract aQ l();

    public int f() {
        return 0;
    }

    public String q() {
        return this.m;
    }

    public FP a(String string) {
        this.m = string;
        return this;
    }

    public boolean e() {
        return this.g;
    }

    public FP h() {
        this.g = false;
        return this;
    }

    public boolean p() {
        return this.n;
    }

    public FP g() {
        this.n = false;
        return this;
    }

    public int o() {
        return this.a % 6;
    }

    public boolean j() {
        boolean bl;
        block4: {
            block5: {
                LQ[] lQArray = aQ.p();
                try {
                    try {
                        bl = this.a;
                        if (lQArray != null) break block4;
                        if (bl >= 6 != 0) break block5;
                    }
                    catch (H h) {
                        throw FP.a(h);
                    }
                    bl = true;
                    break block4;
                }
                catch (H h) {
                    throw FP.a(h);
                }
            }
            bl = false;
        }
        return bl;
    }

    public p[] m() {
        return this.k;
    }

    public FP a(p ... pArray) {
        this.k = pArray;
        return this;
    }

    public boolean a(p p2) {
        p[] pArray;
        LQ[] lQArray;
        block9: {
            block10: {
                lQArray = aQ.p();
                try {
                    try {
                        pArray = this.k;
                        if (lQArray != null) break block9;
                        if (pArray != null) break block10;
                    }
                    catch (H h) {
                        throw FP.a(h);
                    }
                    return false;
                }
                catch (H h) {
                    throw FP.a(h);
                }
            }
            pArray = this.k;
        }
        p[] pArray2 = pArray;
        int n = pArray2.length;
        int n2 = 0;
        while (n2 < n) {
            block11: {
                block12: {
                    p p3 = pArray2[n2];
                    try {
                        try {
                            if (lQArray != null) break block11;
                            if (p3 != p2) break block12;
                        }
                        catch (H h) {
                            throw FP.a(h);
                        }
                        return true;
                    }
                    catch (H h) {
                        throw FP.a(h);
                    }
                }
                ++n2;
            }
            if (lQArray == null) continue;
        }
        return false;
    }





    public void a(List var1_1, int var2_2, short var3_3, int var4_4) {
























        throw new IllegalStateException("Decompilation failed");
    }

    public void a(List<qP> list, p ... pArray) {
        long l = v ^ 0x5B0E40602579L;
        long l2 = l ^ 0x12A580CAD0FL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        yO[] yOArray = yO.u;
        int n4 = yOArray.length;
        LQ[] lQArray = aQ.p();
        int n5 = 0;
        while (n5 < n4) {
            block14: {
                block15: {
                    boolean bl;
                    yO yO2;
                    block16: {
                        yO2 = yOArray[n5];
                        try {
                            try {
                                if (lQArray != null) break block14;
                                if (yO2 == null) break block15;
                            }
                            catch (H h) {
                                throw FP.a(h);
                            }
                            if (yO2.r == null) break block15;
                        }
                        catch (H h) {
                            throw FP.a(h);
                        }
                        boolean bl2 = false;
                        for (int i = 0; i < pArray.length; ++i) {
                            try {
                                try {
                                    try {
                                        bl = bl2;
                                        if (lQArray != null || lQArray != null) break block16;
                                    }
                                    catch (H h) {
                                        throw FP.a(h);
                                    }
                                    if (bl) break;
                                }
                                catch (H h) {
                                    throw FP.a(h);
                                }
                                if (yO2.r != pArray[i]) continue;
                            }
                            catch (H h) {
                                throw FP.a(h);
                            }
                            bl2 = true;
                            if (lQArray == null) continue;
                            LQ.b((LQ[])new LQ[2]);
                            break;
                        }
                        bl = bl2;
                    }
                    try {
                        if (lQArray != null || !bl) break block15;
                    }
                    catch (H h) {
                        throw FP.a(h);
                    }
                    tv tv2 = new tv(yO2, yO2.d());
                    bl = list.add(eF.aX.a(n, (short)n2, tv2, n3));
                }
                ++n5;
            }
            if (lQArray == null) continue;
        }
    }




    static {
        block11: {
            block10: {
                FP.v = _c.a((long)1604025130724456306L, (long)496474187343061007L, MethodHandles.lookup().lookupClass()).a(148485272141690L);
                v0 = var9 = FP.v ^ 133312195074742L;
                v1 = v0 ^ 56939698910270L;
                var11_1 = (int)(v1 >>> 48);
                var12_2 = (int)(v1 << 16 >>> 32);
                var13_3 = (int)(v1 << 48 >>> 48);
                v2 = v0 ^ 25622777475089L;
                var14_4 = (int)(v2 >>> 32);
                var15_5 = (int)(v2 << 32 >>> 48);
                var16_6 = (int)(v2 << 48 >>> 48);
                v3 = v0 ^ 35454497705397L;
                var17_7 = (int)(v3 >>> 48);
                var18_8 = (int)(v3 << 16 >>> 48);
                var19_9 = (int)(v3 << 32 >>> 32);
                v4 = v0 ^ 5365985596517L;
                var20_10 = (int)(v4 >>> 48);
                var21_11 = (int)(v4 << 16 >>> 32);
                var22_12 = (int)(v4 << 48 >>> 48);
                v5 = v0 ^ 93618856948107L;
                var23_13 = (int)(v5 >>> 32);
                var24_14 = (int)(v5 << 32 >>> 48);
                var25_15 = (int)(v5 << 48 >>> 48);
                v6 = v0 ^ 75934641069989L;
                var26_16 = (int)(v6 >>> 32);
                var27_17 = (int)(v6 << 32 >>> 48);
                var28_18 = (int)(v6 << 48 >>> 48);
                v7 = v0 ^ 115737882013466L;
                var29_19 = v7 >>> 32;
                var31_20 = (int)(v7 << 32 >>> 32);
                v8 = v0 ^ 132267909612408L;
                var32_21 = (int)(v8 >>> 32);
                var33_22 = (int)(v8 << 32 >>> 48);
                var34_23 = (int)(v8 << 48 >>> 48);
                v9 = v0 ^ 99616674438819L;
                var35_24 = (int)(v9 >>> 48);
                var36_25 = (int)(v9 << 16 >>> 32);
                var37_26 = (int)(v9 << 48 >>> 48);
                v10 = v0 ^ 98858749774563L;
                var38_27 = (int)(v10 >>> 32);
                var39_28 = (int)(v10 << 32 >>> 48);
                var40_29 = (int)(v10 << 48 >>> 48);
                v11 = v0 ^ 131012039424910L;
                var41_30 = (int)(v11 >>> 32);
                var42_31 = (int)(v11 << 32 >>> 56);
                var43_32 = (int)(v11 << 40 >>> 40);
                v12 = v0 ^ 22097287914713L;
                var44_33 = (int)(v12 >>> 32);
                var45_34 = (int)(v12 << 32 >>> 48);
                var46_35 = (int)(v12 << 48 >>> 48);
                FP.z = new HashMap<K, V>(13);
                FP.b(84);
                var0_36 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v13 = SecretKeyFactory.getInstance("DES");
                v14 = new byte[8];
                v15 = v14;
                v14[0] = (byte)(var9 >>> 56);
                for (var1_37 = 1; var1_37 < 8; ++var1_37) {
                    v15 = v15;
                    v15[var1_37] = (byte)(var9 << var1_37 * 8 >>> 56);
                }
                var0_36.init(2, (Key)v13.generateSecret(new DESKeySpec(v15)), new IvParameterSpec(new byte[8]));
                var7_38 = new String[16];
                var5_39 = 0;
                var4_40 = "\ns\u00b8yB%\u001a\u001c\u00cf\u0016\u00ccyi\u00baR)\u00cbK*8t\u009dG\u00a8\u0091\u00b5\u00b0\u00e3\u00cd\u0012.\u0013\u0010ve\u00bf\u0086o%N\u00d5a\"\u00e4]\u00ee\u00de\u00c1\u00ff\u00184\u001cE\u00e1\u00fa\u0092Bo\u0013\u009b\u0000\u00196\u00e0\u00ec\u00cdf\u0083\u00bcu?\u00da\u00d9\u00ed\u0018\u00aa\u00d7?5\u00a4?Ee\u00ad\u00e6\u00e2ROf\u0087@\u00b2\u0016\u00c4\u0096<p\u0097\u00c7\u0018\u008fZ\u007f\u008e+^\u00d7.j\u0091w\u0005\u007f\u0019\u009fwB:\u00e2\u009e\u00c9\u00e4\u0013\u00fd\u0018\u00b6&\u0017\u00adO\u00cd\u00aeQ\u00f4\u00b69_P\u00af\u009c\u00ee\u0012\u00b5\u00eb\u00c5V\u0001_\u008a\u0010\u0003\u00b6\u0083V\b}\u0089\u0094\u00efe\u0003\u00c7\u00a4j\u008c\u00f3 \u009a\u00c7\u0003\u0018\u0097,\u0097\u00876p\u0080\u00ca`G\u0082)?{\u00e4\u0010\u008d\u0080N\u001eM|`\u00e1\u00b0\u009a_7 \u0010<\u00d9j\u00f6(\u00fd\u00a23WP\u00fe:\u00cc\u009e\u0013\u0085\u0000\u001b\u00ae\u0006\u00d7\u0096\tI\u00aa\u00e8=\u0095<\u00f1Y }\u0001T\u00d5\u00be\u00ba\u00ec\u009d3\u0087T+\u00ca\u00d2\u00e6\u00cf:\u00db\u0006\u00e1\u0083\u0014IDR[\u00daA\u0087\u00ac\u00f7\"\u0010N\u00c2\u009e(g\u00fb\u00b7C\u008eZ#\u00b4]\u0013f\u00dc\u0010\u00c4\u00df\u0012\u00de\u00b7Y\u00b21\u00aa\u00bd\u00ac(y7K\u000f\u0018\u009c\u009e\u00df\u0000\u00dc\u000b\u0018\u009axL\u00fc\u00db\u00ae\u009f\u0098&\u0093,\u009c\u0094%3\u0094M\u0010\u00d8\u0081\u00b5\u0092\u00e8Fj\u00b0\u009b&>\u00e6e\u008ad(";
                var6_41 = "\ns\u00b8yB%\u001a\u001c\u00cf\u0016\u00ccyi\u00baR)\u00cbK*8t\u009dG\u00a8\u0091\u00b5\u00b0\u00e3\u00cd\u0012.\u0013\u0010ve\u00bf\u0086o%N\u00d5a\"\u00e4]\u00ee\u00de\u00c1\u00ff\u00184\u001cE\u00e1\u00fa\u0092Bo\u0013\u009b\u0000\u00196\u00e0\u00ec\u00cdf\u0083\u00bcu?\u00da\u00d9\u00ed\u0018\u00aa\u00d7?5\u00a4?Ee\u00ad\u00e6\u00e2ROf\u0087@\u00b2\u0016\u00c4\u0096<p\u0097\u00c7\u0018\u008fZ\u007f\u008e+^\u00d7.j\u0091w\u0005\u007f\u0019\u009fwB:\u00e2\u009e\u00c9\u00e4\u0013\u00fd\u0018\u00b6&\u0017\u00adO\u00cd\u00aeQ\u00f4\u00b69_P\u00af\u009c\u00ee\u0012\u00b5\u00eb\u00c5V\u0001_\u008a\u0010\u0003\u00b6\u0083V\b}\u0089\u0094\u00efe\u0003\u00c7\u00a4j\u008c\u00f3 \u009a\u00c7\u0003\u0018\u0097,\u0097\u00876p\u0080\u00ca`G\u0082)?{\u00e4\u0010\u008d\u0080N\u001eM|`\u00e1\u00b0\u009a_7 \u0010<\u00d9j\u00f6(\u00fd\u00a23WP\u00fe:\u00cc\u009e\u0013\u0085\u0000\u001b\u00ae\u0006\u00d7\u0096\tI\u00aa\u00e8=\u0095<\u00f1Y }\u0001T\u00d5\u00be\u00ba\u00ec\u009d3\u0087T+\u00ca\u00d2\u00e6\u00cf:\u00db\u0006\u00e1\u0083\u0014IDR[\u00daA\u0087\u00ac\u00f7\"\u0010N\u00c2\u009e(g\u00fb\u00b7C\u008eZ#\u00b4]\u0013f\u00dc\u0010\u00c4\u00df\u0012\u00de\u00b7Y\u00b21\u00aa\u00bd\u00ac(y7K\u000f\u0018\u009c\u009e\u00df\u0000\u00dc\u000b\u0018\u009axL\u00fc\u00db\u00ae\u009f\u0098&\u0093,\u009c\u0094%3\u0094M\u0010\u00d8\u0081\u00b5\u0092\u00e8Fj\u00b0\u009b&>\u00e6e\u008ad(".length();
                var3_42 = 32;
                var2_43 = -1;
lbl81:


                while (true) {
                    v16 = ++var2_43;
                    v17 = var4_40.substring(v16, v16 + var3_42);
                    v18 = -1;
                    break block10;
                    break;
                }
lbl86:


                while (true) {
                    var7_38[var5_39++] = FP.a(var8_44).intern();
                    if ((var2_43 += var3_42) < var6_41) {
                        var3_42 = var4_40.charAt(var2_43);
                        ** continue;
                    }
                    var4_40 = "\u00af\u000e\u0088\u009a\u00ba\u00de\u0011\u00c9$=\u001fI\u009b'Bc\u0018\u00d8\u00d4\u00d952\u00cb\u009cO\u00a4\u00e5\u009d\u00ba\u00d8\u00fd\u00db\u001d\u00c2\u00a8\u00c2+<gv\u0086";
                    var6_41 = "\u00af\u000e\u0088\u009a\u00ba\u00de\u0011\u00c9$=\u001fI\u009b'Bc\u0018\u00d8\u00d4\u00d952\u00cb\u009cO\u00a4\u00e5\u009d\u00ba\u00d8\u00fd\u00db\u001d\u00c2\u00a8\u00c2+<gv\u0086".length();
                    var3_42 = 16;
                    var2_43 = -1;
lbl95:


                    while (true) {
                        v19 = ++var2_43;
                        v17 = var4_40.substring(v19, v19 + var3_42);
                        v18 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl100:


                while (true) {
                    var7_38[var5_39++] = FP.a(var8_44).intern();
                    if ((var2_43 += var3_42) < var6_41) {
                        var3_42 = var4_40.charAt(var2_43);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_44 = var0_36.doFinal(v17.getBytes("ISO-8859-1"));
            switch (v18) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl112:


                ** continue;
            }
        }
        FP.x = var7_38;
        FP.y = new String[16];
        FP.e = new FP[12];
        FP.i = new Fg(0, (String)FP.a("j", (int)12681, (long)(5383979191143679380L ^ var9)), var14_4, (short)var15_5, (char)var16_6);
        FP.l = new Ff(1, var23_13, (char)var24_14, (char)var25_15, (String)FP.a("j", (int)5507, (long)(8532028646951641499L ^ var9)));
        FP.o = new FQ(2, (short)var35_24, var36_25, (String)FP.a("j", (int)10850, (long)(7923929451689139827L ^ var9)), (short)var37_26);
        FP.j = new Fh(3, var44_33, (char)var45_34, var46_35, (String)FP.a("j", (int)679, (long)(6359327170815391415L ^ var9)));
        FP.p = new FL(4, (String)FP.a("j", (int)5315, (long)(3515862555894505686L ^ var9)), var29_19, var31_20).a(new p[]{p.ALL});
        FP.q = new F6(5, var32_21, var33_22, (char)var34_23, (String)FP.a("j", (int)31303, (long)(8074504608490229329L ^ var9))).a((String)FP.a("j", (int)29396, (long)(159647094672066240L ^ var9)));
        FP.c = new FF(var38_27, (char)var39_28, 6, (char)var40_29, (String)FP.a("j", (int)14207, (long)(162732842202514284L ^ var9)));
        FP.f = new Fd(7, (short)var17_7, (char)var18_8, (String)FP.a("j", (int)14030, (long)(1268183403432395472L ^ var9)), var19_9).a(new p[]{p.DIGGER, p.FISHING_ROD, p.BREAKABLE});
        FP.r = new FT(8, (char)var11_1, (String)FP.a("j", (int)14754, (long)(8812952977669246395L ^ var9)), var12_2, var13_3).a(new p[]{p.ARMOR, p.ARMOR_FEET, p.ARMOR_HEAD, p.ARMOR_LEGS, p.ARMOR_TORSO, p.BOW, p.WEAPON});
        FP.s = new F4(9, var26_16, (String)FP.a("j", (int)28923, (long)(4283387490261075177L ^ var9)), (char)var27_17, (char)var28_18);
        FP.b = new F3((short)var20_10, 10, (String)FP.a("j", (int)10586, (long)(6498638056873286L ^ var9)), var21_11, (short)var22_12);
        FP.t = new Fn(11, var41_30, (byte)var42_31, (String)FP.a("j", (int)27238, (long)(1477908272098287228L ^ var9)), var43_32).a((String)FP.a("j", (int)23484, (long)(6143827094424989607L ^ var9))).g().h();
    }

    public static void b(int n) {
        h = n;
    }

    public static int b() {
        return h;
    }

    public static int i() {
        int n = FP.b();
        try {
            if (n == 0) {
                return 20;
            }
        }
        catch (H h) {
            throw FP.a(h);
        }
        return 0;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x24D;
        if (y[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])z.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    z.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("FP", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = x[n2].getBytes("ISO-8859-1");
            FP.y[n2] = FP.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = FP.a(n, l);
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
            throw new RuntimeException("FP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(FP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
