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

public class lZ
extends lh {
    private final kt<RB> y;
    private final kt<RB> m;
    private final kt<RB> D;
    private final kt<Boolean> A;
    private double C;
    private double q;
    private int u;
    private double w;
    private boolean n;
    private int l;
    private double x;
    private boolean o;
    private int k;
    private boolean z;
    private int r;
    private boolean s;
    private int B;
    private boolean v;
    @A
    public final R8<bR> p;
    @A(value=3)
    public final R8<b5> t;
    @A
    public final R8<cb> E;
    private static final long F;
    private static final String[] G;
    private static final String[] H;
    private static final Map I;

    public lZ(EU eU, int n, int n2) {
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ F;
        super(eU);
        this.y = new kt((String)((Object)lZ.a("h", (int)17081, (long)(0x23A4B0D9940889BEL ^ l))), (Object)new RB((String)((Object)lZ.a("h", (int)30908, (long)(0x613F2BB1125933BCL ^ l))), new String[]{lZ.a("h", (int)30908, (long)(0x613F2BB1125933BCL ^ l)), lZ.a("h", (int)10062, (long)(0x4290F53EF001EC4DL ^ l)), lZ.a("h", (int)20409, (long)(0x3F5B6BD9E64E04BBL ^ l))}), (String)((Object)lZ.a("h", (int)20155, (long)(0x2C7116DC3DDA05BDL ^ l))));
        this.m = new kt((String)((Object)lZ.a("h", (int)1167, (long)(0x278BD111911B4F83L ^ l))), (Object)new RB((String)((Object)lZ.a("h", (int)18262, (long)(0x602E67D86A1C0C5FL ^ l))), new String[]{lZ.a("h", (int)18262, (long)(0x602E67D86A1C0C5FL ^ l)), lZ.a("h", (int)32126, (long)(0x6B15B1037983668L ^ l))}), (String)((Object)lZ.a("h", (int)25543, (long)(0x14CC2191950E28C9L ^ l))), this::lambda$new$0);
        this.D = new kt((String)((Object)lZ.a("h", (int)4110, (long)(0x266519D41844DB06L ^ l))), (Object)new RB((String)((Object)lZ.a("h", (int)18262, (long)(0x602E67D86A1C0C5FL ^ l))), new String[]{lZ.a("h", (int)18262, (long)(0x602E67D86A1C0C5FL ^ l)), lZ.a("h", (int)12486, (long)(0x3A98D213F456FBC2L ^ l))}), (String)((Object)lZ.a("h", (int)715, (long)(0x3594A1A65945C9CAL ^ l))), this::lambda$new$1);
        this.A = new kt((String)((Object)lZ.a("h", (int)27286, (long)(0x757B789D500D218DL ^ l))), (Object)false, (String)((Object)lZ.a("h", (int)144, (long)(0x6E10B36E878ACB9BL ^ l))), this::lambda$new$2);
        this.p = this::lambda$new$3;
        this.t = this::lambda$new$4;
        this.E = this::lambda$new$5;
        this.a(new kt[]{this.y, this.m, this.D, this.A});
    }

    public void d(int n, int n2, int n3) {
        lh[] lhArray;
        boolean bl;
        int n4;
        int n5;
        int n6;
        long l;
        block14: {
            block13: {
                l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
                long l2 = l ^ 0x650588930F54L;
                n6 = (int)(l2 >>> 48);
                n5 = (int)(l2 << 16 >>> 32);
                n4 = (int)(l2 << 48 >>> 48);
                bl = lj.i();
                try {
                    try {
                        if (!bl) break block13;
                        if (Hk.j() == null) break block14;
                    }
                    catch (H h) {
                        throw lZ.a(h);
                    }
                    this.C = lZ.a();
                    this.q = 0.0;
                    this.u = 2;
                    this.w = 2.0;
                    this.n = false;
                    this.l = 0;
                    this.x = 0.0;
                    this.o = true;
                    this.z = false;
                    this.k = 0;
                    this.r = -1;
                    this.s = false;
                    this.B = 0;
                }
                catch (H h) {
                    throw lZ.a(h);
                }
            }
            this.v = false;
        }
        lh[] lhArray2 = lhArray = new lh[]{tf.m().a(lj.class), tf.m().a(lV.class), tf.m().a(lx.class)};
        int n7 = lhArray2.length;
        int n8 = 0;
        while (n8 < n7) {
            boolean bl2;
            block15: {
                block16: {
                    block17: {
                        short s;
                        lh lh2;
                        block18: {
                            block19: {
                                lh lh3 = lhArray2[n8];
                                try {
                                    try {
                                        try {
                                            try {
                                                bl2 = bl;
                                                if (n <= 0) break block15;
                                                if (!bl2) break block16;
                                                if (lh3 == null) break block17;
                                            }
                                            catch (H h) {
                                                throw lZ.a(h);
                                            }
                                            lh2 = lh3;
                                            s = bl;
                                            if (n2 < 0) break block18;
                                            if (s == false) break block19;
                                        }
                                        catch (H h) {
                                            throw lZ.a(h);
                                        }
                                        if (!lh2.b()) break block17;
                                    }
                                    catch (H h) {
                                        throw lZ.a(h);
                                    }
                                    lh2 = lh3;
                                }
                                catch (H h) {
                                    throw lZ.a(h);
                                }
                            }
                            s = (short)n6;
                        }
                        lh2.c(s, n5, n4);
                        fJ.d().a((String)((Object)lZ.a("h", (int)8500, (long)(0x71D4BD7FFC73F941L ^ l))), (String)((Object)lZ.a("h", (int)3103, (long)(0x762799E2D45ED46FL ^ l))));
                    }
                    ++n8;
                }
                bl2 = bl;
            }
            if (bl2) continue;
        }
    }

    public void a(char c, long l) {
        int n;
        block10: {
            block8: {
                lZ lZ2;
                block11: {
                    block9: {
                        Hk.b().ay.h = 1.0f;
                        boolean bl = lj.k();
                        try {
                            try {
                                try {
                                    try {
                                        this.z = false;
                                        lZ2 = this;
                                        if (bl) break block8;
                                        if (!lZ2.s) break block9;
                                    }
                                    catch (H h) {
                                        throw lZ.a(h);
                                    }
                                    lZ2 = this;
                                    n = bl ? 1 : 0;
                                    if (c < '\u0000') break block10;
                                    if (n != 0) break block8;
                                }
                                catch (H h) {
                                    throw lZ.a(h);
                                }
                                if (l <= 0L) break block11;
                                if (lZ2.r == -1) break block9;
                            }
                            catch (H h) {
                                throw lZ.a(h);
                            }
                            Hk.j().bU.g = this.r;
                            this.r = -1;
                            this.s = false;
                        }
                        catch (H h) {
                            throw lZ.a(h);
                        }
                    }
                    lZ lZ3 = this;
                }
                lZ3.v = false;
                lZ2 = this;
            }
            n = 0;
        }
        lZ2.B = n;
    }

    public static double a() {
        double d;
        block5: {
            int n;
            block4: {
                d = 0.2873;
                boolean bl = lj.i();
                try {
                    try {
                        n = Hk.j().a(d7.h);
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (H h) {
                        throw lZ.a(h);
                    }
                    n = Hk.j().b(d7.h).e();
                }
                catch (H h) {
                    throw lZ.a(h);
                }
            }
            int n2 = n;
            d *= 1.0 + 0.2 * (double)(n2 + 1);
        }
        return d;
    }




    private void lambda$new$5(cb var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }




    private void lambda$new$4(b5 var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }

    private void lambda$new$3(bR bR2) {
        block10: {
            lZ lZ2;
            block11: {
                block9: {
                    boolean bl;
                    block8: {
                        long l = F ^ 0x78744604C27DL;
                        boolean bl2 = lj.i();
                        try {
                            try {
                                try {
                                    bl = this.y.q().equals(lZ.a("h", (int)10062, (long)(0x4290D5671C46B164L ^ l)));
                                    if (!bl2) break block8;
                                    if (!bl) break block9;
                                }
                                catch (H h) {
                                    throw lZ.a(h);
                                }
                                lZ2 = this;
                                if (!bl2) break block10;
                            }
                            catch (H h) {
                                throw lZ.a(h);
                            }
                            bl = lZ2.D.q().equals(lZ.a("h", (int)21579, (long)(0x2EFE61F6330A427BL ^ l)));
                        }
                        catch (H h) {
                            throw lZ.a(h);
                        }
                    }
                    if (bl) break block11;
                }
                return;
            }
            lZ2 = this;
        }
        lZ2.z = bR2.a() instanceof F2;
    }

    private boolean lambda$new$2() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    long l = F ^ 0x522CF6123259L;
                    bl2 = lj.k();
                    try {
                        try {
                            bl = this.y.q().equals(lZ.a("h", (int)30908, (long)(0x613F21B04E089EB1L ^ l)));
                            if (bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw lZ.a(h);
                        }
                        bl = this.m.q().equals(lZ.a("h", (int)18262, (long)(0x602E6DD9364DA152L ^ l)));
                    }
                    catch (H h) {
                        throw lZ.a(h);
                    }
                }
                try {
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw lZ.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$1() {
        long l = F ^ 0x22432613B99FL;
        return this.y.q().equals(lZ.a("h", (int)8170, (long)(0x1BBF7954F7CB723FL ^ l)));
    }

    private boolean lambda$new$0() {
        long l = F ^ 0x5151C9D876FCL;
        return this.y.q().equals(lZ.a("h", (int)30908, (long)(0x613F22CD71C2DA14L ^ l)));
    }




    static {
        block11: {
            block10: {
                lZ.F = _c.a((long)9124141476609114488L, (long)-3240591283256671360L, MethodHandles.lookup().lookupClass()).a(280037004111387L);
                lZ.I = new HashMap<K, V>(13);
                var0 = lZ.F ^ 73762065268886L;
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
                var9_3 = new String[26];
                var7_4 = 0;
                var6_5 = "\u00c9A\u00bb:\u0011\u0095\u00e7\u0019e!\u0080\u00ac\u00ac\u009e\u001eo\u00db\n\u001d7\u0002T\u00d7\u000bZ\u00a8\u00e4z\u00e4\f\u00f9t\u0010\u008d\u0081t\u00a0n?\u00c7o\u00ba\u00e6}&\u0012G\u00fa\u00f5\u0018\u00b4\n>|\u00de\u00c8\u008e\u001a\u000b\u00b1\u00bf\u00c1\u0006\u00a2[\u00fc\u00e6;\u00b1\u0087r\u00b9\u0005\u009f r\u00158a\u00dd\u00fe\u00f3G\u0085\u0083\u00cd\u0015}\u00ad\u00fd\u0019\u0084\u00eb\u00b8\u009bZL\u0095:[x\u0016-\u00a3\u00cf\u00f2i\u0010\u001f\u0088\u009c\u001d\u00ae\u00b8\u00ac\u00c4\u00b3/QA\u00c8\u00c1\u00c0\u00b8(\u0018\u001c\u00c3\u00da\u00a2%V\u00fdb\u00d0b5\u0004\u00cd5\u0014\u000b\u0086\u00e3A*\u00de\u00db\u00f8T\u008a\u0010\n\u00bb\u00ee\u00e4Jd\u00d1\u00d3\u0092zO5\u000f l\u00adCV/\u0093\u0084\u0081\u00de\u00f3\u00a0\u00e6\u0085\u00e5\u00d8EW\u00dad\u0000\u00cc\u00c4>\u001d[\u00e38B\u00f9\u0084\u0085\u007f\u0010 a\u00f1\u0018\u0010N\u00aeU\u0089V\u00dbV\u00e5,\u00fd\u000e \u0092vV\u0092\u00f5\u00ac\u000b\u0091\u0087\u00db}\u0002\u00a49kE\u00ff\u00f3D\u00c7K\u00f2S\u00a1\u00dc\u00d8\u00b1\u0085.-F#\u0010\u0084t\u009a\u0089\u00c2\u00ed?_Og\u0017\u00e7\u0093\u00b1\u00f3\u00eb\u0018`\u00e2\f\u009a{\u00e5vM1\u00e6-\"\u00d2x\u0089\u0094hi\u00ff\u00be\u00077t:@h\u0085\u00b3\u00c3A\u0005,Q\u00a7\u00eb\u00a4p!Up*9O%cp*\tK'!]\u00ac\u00e6:\u00f8\u0090\u0095\u009b\u00cfU\u00cf8\u008d\u00ba\u0011\u00e9\u0089\u0089\u00058e\u0015P\u00e9\u00c0&\u00fa\u0002\r\u0001\tn'(\u00cc\u00a6/\u00c2\u0010\u0091\u00ffG@\u00cf~Z\u00b7$\u00ddx\u00da\u00e7\u00bc\u0013p\u0010\u00d8\u00e1\u0095\u001a`Pk>\t\u0090\u0091\u0096\u0005L \u0004\u0010[i*R>l\u0005\u00c1\u00d1+\b\u0019\u00e9\u001e\u00e1\u0000 \u00c8\u0087\u00bcB\u00e1\u00e6O\u00b2\u001d\u00e5\u0080\u00d9\u00e4w\u00c5<S\u009bA\u0001\u00f49\u0091Z\u00a64\u009c\u00fd\u00e4Xu\u00ba\u0010\u008e\u00a7\u00f97\u0091\u0082p\u0086p\u00f9\u008c\u00e1\u00ef6\u0004\u00d00\u00c7\u00d1M,\u00b8\u001e\u00f3\u00cc\u000b\u00f6cX\u0090q\u0092\u00e0u\u00c3\u009a\u00b5\u001a\u0099\u00b6\u0096\u00f6\u0011\u0084\u007f\u00df\u00e5\u00c1\u00b4\u0089+\u00c2\u0016\u008d\u00afx\u00bag}\u0093K%3\u00bc\u001e(\u001a\u001dn\u00d3\u00c3\u00d5\u0004K\u0088W\u00e2\u00c5WifO\u0006I\u00b4\u00102\u00a9\u00d8\u00fa\u0005&\u0007m\u0088+[a\u00cax\b\u00fc8\u00da\u0087\u001c\u0010\u009e\u0018\u0092\\,`\u000bXa\u00bf\u0087\u00a4j\u0016\u00a1\u0087 \u00e7\u0085x\u00958\u000b\u00a0n\u0089\u00e9S\u0080\u00e5L\u0003\u00da\u00c2\f4E\u00da\u00a6\u001e\u00b4\u00d8\u00ca\u00d1\u0016\u009e0R\u00cd\u0010L\u0086\u00b7\u0085\u00a6V\u00a3\u00c1\u001f\u00c9Qxy0\u008c\u00e9\u0010\u00e0J\u00fa\u0091[\u0010\u00ed{\u0089]7I\u00cc\u00945D\u0018\u00eb\u00ad~\u00a1N\u00bd\u0095)\u00c1]\u00e4!\u00ac\u00f9W-\u00a9.\u00a1\u0011\u00be\u00be@\u00ed";
                var8_6 = "\u00c9A\u00bb:\u0011\u0095\u00e7\u0019e!\u0080\u00ac\u00ac\u009e\u001eo\u00db\n\u001d7\u0002T\u00d7\u000bZ\u00a8\u00e4z\u00e4\f\u00f9t\u0010\u008d\u0081t\u00a0n?\u00c7o\u00ba\u00e6}&\u0012G\u00fa\u00f5\u0018\u00b4\n>|\u00de\u00c8\u008e\u001a\u000b\u00b1\u00bf\u00c1\u0006\u00a2[\u00fc\u00e6;\u00b1\u0087r\u00b9\u0005\u009f r\u00158a\u00dd\u00fe\u00f3G\u0085\u0083\u00cd\u0015}\u00ad\u00fd\u0019\u0084\u00eb\u00b8\u009bZL\u0095:[x\u0016-\u00a3\u00cf\u00f2i\u0010\u001f\u0088\u009c\u001d\u00ae\u00b8\u00ac\u00c4\u00b3/QA\u00c8\u00c1\u00c0\u00b8(\u0018\u001c\u00c3\u00da\u00a2%V\u00fdb\u00d0b5\u0004\u00cd5\u0014\u000b\u0086\u00e3A*\u00de\u00db\u00f8T\u008a\u0010\n\u00bb\u00ee\u00e4Jd\u00d1\u00d3\u0092zO5\u000f l\u00adCV/\u0093\u0084\u0081\u00de\u00f3\u00a0\u00e6\u0085\u00e5\u00d8EW\u00dad\u0000\u00cc\u00c4>\u001d[\u00e38B\u00f9\u0084\u0085\u007f\u0010 a\u00f1\u0018\u0010N\u00aeU\u0089V\u00dbV\u00e5,\u00fd\u000e \u0092vV\u0092\u00f5\u00ac\u000b\u0091\u0087\u00db}\u0002\u00a49kE\u00ff\u00f3D\u00c7K\u00f2S\u00a1\u00dc\u00d8\u00b1\u0085.-F#\u0010\u0084t\u009a\u0089\u00c2\u00ed?_Og\u0017\u00e7\u0093\u00b1\u00f3\u00eb\u0018`\u00e2\f\u009a{\u00e5vM1\u00e6-\"\u00d2x\u0089\u0094hi\u00ff\u00be\u00077t:@h\u0085\u00b3\u00c3A\u0005,Q\u00a7\u00eb\u00a4p!Up*9O%cp*\tK'!]\u00ac\u00e6:\u00f8\u0090\u0095\u009b\u00cfU\u00cf8\u008d\u00ba\u0011\u00e9\u0089\u0089\u00058e\u0015P\u00e9\u00c0&\u00fa\u0002\r\u0001\tn'(\u00cc\u00a6/\u00c2\u0010\u0091\u00ffG@\u00cf~Z\u00b7$\u00ddx\u00da\u00e7\u00bc\u0013p\u0010\u00d8\u00e1\u0095\u001a`Pk>\t\u0090\u0091\u0096\u0005L \u0004\u0010[i*R>l\u0005\u00c1\u00d1+\b\u0019\u00e9\u001e\u00e1\u0000 \u00c8\u0087\u00bcB\u00e1\u00e6O\u00b2\u001d\u00e5\u0080\u00d9\u00e4w\u00c5<S\u009bA\u0001\u00f49\u0091Z\u00a64\u009c\u00fd\u00e4Xu\u00ba\u0010\u008e\u00a7\u00f97\u0091\u0082p\u0086p\u00f9\u008c\u00e1\u00ef6\u0004\u00d00\u00c7\u00d1M,\u00b8\u001e\u00f3\u00cc\u000b\u00f6cX\u0090q\u0092\u00e0u\u00c3\u009a\u00b5\u001a\u0099\u00b6\u0096\u00f6\u0011\u0084\u007f\u00df\u00e5\u00c1\u00b4\u0089+\u00c2\u0016\u008d\u00afx\u00bag}\u0093K%3\u00bc\u001e(\u001a\u001dn\u00d3\u00c3\u00d5\u0004K\u0088W\u00e2\u00c5WifO\u0006I\u00b4\u00102\u00a9\u00d8\u00fa\u0005&\u0007m\u0088+[a\u00cax\b\u00fc8\u00da\u0087\u001c\u0010\u009e\u0018\u0092\\,`\u000bXa\u00bf\u0087\u00a4j\u0016\u00a1\u0087 \u00e7\u0085x\u00958\u000b\u00a0n\u0089\u00e9S\u0080\u00e5L\u0003\u00da\u00c2\f4E\u00da\u00a6\u001e\u00b4\u00d8\u00ca\u00d1\u0016\u009e0R\u00cd\u0010L\u0086\u00b7\u0085\u00a6V\u00a3\u00c1\u001f\u00c9Qxy0\u008c\u00e9\u0010\u00e0J\u00fa\u0091[\u0010\u00ed{\u0089]7I\u00cc\u00945D\u0018\u00eb\u00ad~\u00a1N\u00bd\u0095)\u00c1]\u00e4!\u00ac\u00f9W-\u00a9.\u00a1\u0011\u00be\u00be@\u00ed".length();
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
                    var9_3[var7_4++] = lZ.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0087\u0005\u001f\u00b1s3\u00061pS~\u00a8T\u00a1:\u00c1\u0010#z\u00bb\u00f9\u0016\u00fb{\u00ae\u00ab\u00c7%6\u0094\u0015\u0085P";
                    var8_6 = "\u0087\u0005\u001f\u00b1s3\u00061pS~\u00a8T\u00a1:\u00c1\u0010#z\u00bb\u00f9\u0016\u00fb{\u00ae\u00ab\u00c7%6\u0094\u0015\u0085P".length();
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
                    var9_3[var7_4++] = lZ.a(var10_9).intern();
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
        lZ.G = var9_3;
        lZ.H = new String[26];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x48E7;
        if (H[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])I.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    I.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lZ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = G[n2].getBytes("ISO-8859-1");
            lZ.H[n2] = lZ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return H[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lZ.a(n, l);
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
            throw new RuntimeException("lZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lZ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
