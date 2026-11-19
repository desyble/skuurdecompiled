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

public class ls
extends lh {
    private final kt<RB> r;
    private final kt<RB> k;
    private final kt<Number> m;
    private final kt<Number> l;
    private final kt<RB> p;
    private int q;
    private int n;
    @A
    public final R8<b5> s;
    @A
    public final R8<c4> o;
    private static final long t;
    private static final String[] u;
    private static final String[] v;
    private static final Map w;

    public ls(int n, char c, EU eU, int n2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ t;
        super(eU);
        this.r = new kt((String)((Object)ls.a("p", (int)6252, (long)(0x6FC7C415E8BAD489L ^ l))), (Object)new RB((String)((Object)ls.a("p", (int)15936, (long)(0x15449C95CB06F2BAL ^ l))), new String[]{ls.a("p", (int)18228, (long)(0x7137ADEDBA438BDAL ^ l)), ls.a("p", (int)21730, (long)(0x29227F786641181AL ^ l)), ls.a("p", (int)19395, (long)(0x4F3A52AD96FF0727L ^ l)), ls.a("p", (int)22962, (long)(0x1E9FCBEF1DE3155EL ^ l)), ls.a("p", (int)26979, (long)(0x723BD8B93C7EA58EL ^ l)), ls.a("p", (int)19933, (long)(0x57BE08D6C27C812EL ^ l)), ls.a("p", (int)30810, (long)(0x2E3B5A5740E734A3L ^ l)), ls.a("p", (int)20050, (long)(0x4723A34B837802BBL ^ l))}), (String)((Object)ls.a("p", (int)3626, (long)(0xC437217EA13C2DDL ^ l))));
        this.k = new kt((String)((Object)ls.a("p", (int)19679, (long)(0x3C3C705254C28029L ^ l))), (Object)new RB((String)((Object)ls.a("p", (int)25526, (long)(0x74361532C7582F5EL ^ l))), new String[]{ls.a("p", (int)18336, (long)(0x60E4B02002F00B55L ^ l)), ls.a("p", (int)23657, (long)(0x1B9C03A119579082L ^ l))}), (String)((Object)ls.a("p", (int)21688, (long)(0x3A67830D54679846L ^ l))), this::lambda$new$0);
        this.m = new kt((String)((Object)ls.a("p", (int)18303, (long)(0x1E14AB901D070B99L ^ l))), (Object)0.2, (String)((Object)ls.a("p", (int)5384, (long)(0x4755EDF15D9359FAL ^ l))), 0.05, 0.0, 5.0, this::lambda$new$1);
        this.l = new kt((String)((Object)ls.a("p", (int)10936, (long)(0x7805FD71B6246657L ^ l))), (Object)1.0, (String)((Object)ls.a("p", (int)12657, (long)(0x56E57871656D7D8DL ^ l))), 0.1, 0.1, 9.5, this::lambda$new$2);
        this.p = new kt((String)((Object)ls.a("p", (int)6971, (long)(0x6D92715099E5D7D9L ^ l))), (Object)new RB((String)((Object)ls.a("p", (int)26583, (long)(0x616648D7E6442B2AL ^ l))), new String[]{ls.a("p", (int)26583, (long)(0x616648D7E6442B2AL ^ l)), ls.a("p", (int)29875, (long)(0x306A42A9DFC13852L ^ l)), ls.a("p", (int)19806, (long)(0x4480538246EC01B4L ^ l))}), (String)((Object)ls.a("p", (int)4471, (long)(0x4803DFEAED5CDD88L ^ l))));
        this.q = 0;
        this.n = 0;
        this.s = this::lambda$new$3;
        this.o = this::lambda$new$4;
        this.a(new kt[]{this.r, this.k, this.m, this.l, this.p});
    }

    public void d(int n, int n2, int n3) {
        block4: {
            block5: {
                long l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
                long l2 = l ^ 0x650588930F54L;
                int n4 = (int)(l2 >>> 48);
                int n5 = (int)(l2 << 16 >>> 32);
                int n6 = (int)(l2 << 48 >>> 48);
                boolean bl = lj.k();
                try {
                    try {
                        if (bl) break block4;
                        if (Hk.j() != null) break block5;
                    }
                    catch (H h) {
                        throw ls.a(h);
                    }
                    this.c((short)n4, n5, n6);
                    return;
                }
                catch (H h) {
                    throw ls.a(h);
                }
            }
            this.q = 0;
            this.n = 0;
        }
    }

    public void a(char c, long l) {
        this.q = 0;
        this.n = 0;
    }

    private boolean a() {
        int n;
        block13: {
            block11: {
                boolean bl;
                block12: {
                    long l;
                    int n2;
                    block10: {
                        long l2 = t ^ 0x121ED3E395E9L;
                        long l3 = l2 ^ 0x3BCF4983AC7AL;
                        n2 = (int)(l3 >>> 56);
                        l = l3 << 8 >>> 8;
                        bl = lj.k();
                        try {
                            try {
                                n = Hk.j().aD();
                                if (bl) break block10;
                                if (n != 0) break block11;
                            }
                            catch (H h) {
                                throw ls.a(h);
                            }
                            float f = Hk.j().r - 4.0f;
                            n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                        }
                        catch (H h) {
                            throw ls.a(h);
                        }
                    }
                    try {
                        try {
                            if (bl) break block12;
                            if (n >= 0) break block11;
                        }
                        catch (H h) {
                            throw ls.a(h);
                        }
                        n = tB.e((byte)((byte)n2), (long)l) ? 1 : 0;
                    }
                    catch (H h) {
                        throw ls.a(h);
                    }
                }
                try {
                    if (bl) break block13;
                    if (n != 0) break block11;
                }
                catch (H h) {
                    throw ls.a(h);
                }
                n = 1;
                break block13;
            }
            n = 0;
        }
        return n != 0;
    }





    private boolean c(short s, char c, int n) {
        ey ey2;
        ey ey3;
        block6: {
            long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ t;
            long l2 = l ^ 0x5ACFDAED5857L;
            long l3 = l2 >>> 16;
            int n2 = (int)(l2 << 48 >>> 48);
            double d = Hk.j().e + (double)Hk.j().V();
            xc xc2 = new xc(Hk.j().ax, d, Hk.j().av);
            boolean bl = lj.i();
            A6 a6 = Hk.a().b(xc2, l3, (short)n2).a();
            try {
                try {
                    ey3 = a6.g();
                    ey2 = ey.s;
                    if (!bl) break block6;
                    if (ey3 == ey2) return true;
                }
                catch (H h) {
                    throw ls.a(h);
                }
                ey3 = a6.g();
                ey2 = ey.g;
            }
            catch (H h) {
                throw ls.a(h);
            }
        }
        try {
            if (ey3 != ey2) return false;
            return true;
        }
        catch (H h) {
            throw ls.a(h);
        }
    }

    private boolean e(short s, int n, char c) {
        boolean bl;
        block12: {
            block14: {
                block13: {
                    boolean bl2;
                    block10: {
                        long l;
                        block11: {
                            l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ t;
                            bl2 = lj.k();
                            try {
                                try {
                                    bl = Hk.j().c(Hk.j().D, 0.66, Hk.j().ac);
                                    if (bl2) break block10;
                                    if (bl) break block11;
                                }
                                catch (H h) {
                                    throw ls.a(h);
                                }
                                return false;
                            }
                            catch (H h) {
                                throw ls.a(h);
                            }
                        }
                        bl = this.p.q().equals(ls.a("p", (int)26583, (long)(0x6166043A0F53ED71L ^ l)));
                    }
                    try {
                        try {
                            try {
                                if (bl2) break block12;
                                if (bl) break block13;
                            }
                            catch (H h) {
                                throw ls.a(h);
                            }
                            bl = Hk.j().K;
                            if (bl2) break block12;
                        }
                        catch (H h) {
                            throw ls.a(h);
                        }
                        if (!bl) break block14;
                    }
                    catch (H h) {
                        throw ls.a(h);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }




    private void lambda$new$4(c4 var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }




    private void lambda$new$3(b5 var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }

    private boolean lambda$new$2() {
        long l = t ^ 0x61E3508BA8BL;
        return this.r.q().equals(ls.a("p", (int)26583, (long)(0x61667C62B9E77335L ^ l)));
    }

    private boolean lambda$new$1() {
        long l = t ^ 0x36F00E922127L;
        return this.r.q().equals(ls.a("p", (int)26583, (long)(0x61664C8C827DE899L ^ l)));
    }

    private boolean lambda$new$0() {
        long l = t ^ 0x7FAAAB7F3D06L;
        return this.r.q().equals(ls.a("p", (int)28440, (long)(0x558CC37919DC7C71L ^ l)));
    }




    static {
        block11: {
            block10: {
                ls.t = _c.a((long)-8281161092837689230L, (long)271597338710917321L, MethodHandles.lookup().lookupClass()).a(275787944997534L);
                ls.w = new HashMap<K, V>(13);
                var0 = ls.t ^ 77490335860679L;
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
                var9_3 = new String[32];
                var7_4 = 0;
                var6_5 = "\u00a4#\u0096G\u0012\u000f!,\u001c(\u0018E\u009bH\u00ca\u0083 \u0003S\u00cc\u00b1v\u00a6\u00fe^\u00b3\u00d9@\u00ff\"I\u0007m8\u00b9-\u0000\u00f6&J%#\u00da\u0099\u0084q((_\u0010q\u00830\u0082J\u00e2\u00f3\u000e6m\u00c1\u00f7\u00f4\u0001[\u00ab\u00105B\u00e7\u00f0\u00db@\u00baYNK\u0089\u00b8\u00e4\u00ab\u00e7S\u0010\u0095d\u009fU>\u00f2\u008b\u00ae\u00aek\u00fe\u00ecT\u00c89\u00cc\u0010\u00c0\u0095mmz\u00b5\u00105\u0098\u0099\u0019\u00fe\u00ed\u00ce\u000fh\u0010a\u00bf\u00c0N\u00d8\u00ec@\u00da,q\u008d\u0096\u0002\u00d00\u00e4\u0010B]\u00ea\u0019@e\u00aea\u0011\u00e6\u00e2<\u00ca\u00d4\u00b9\u0088\u0010p\u00b4\u00d1\f\u00ec@P\t\u0098~\u0084Mv\u0013-!\u0010n\u009f\u00d3GU\u000e\u00cf\u0007s+@\r\u00d3Z\u0086z\u0010\u00a2\u001c\u00ea\u008f>\u00cd\u00c2\u0089\u00e3\u00c2G\u008c\u00a6\u00c9W\u00d6\u0010\u008exPL4I\u0082<\u008fz\u00d2BH\u00fb\u00d24\u0010\u0006\u00135?e\u00dd1\u00b8\u009b\u00f0\u007f\u0093A\u0000\u009e\u0099\u00104\u00be\u0015j\u00d7\u00b7\u00e4\\\u001eI\u0085\u00e7d\u00fbx\u00f1\u0010\u0017`\u00d7\u00f6\u0000\u00bcMGm\u009dWL\u008e'\u00cb\u00ff\u0010\n\u00e0\u000bN\u00d4\u00c3Ig\u0085C;\u0092\u00a5#*\u00e0\u0010V\\\u00c8e\u008b\u00ae\u00c7%\u00e4t\u00d1\u00b0\u0091\u00caV\u00af0\u00b6\u00ed*\u00e5\u008dk\u00b2\u00b1|\u00fc\u00ba\u009c\u0084\u0019[\u001f\u00b6\u0086%\u0016\u0092\u009e\u00b7[\u00ff\u0014#D\u00ecz(Z\u00a8\u0090b\u00d4\u0094+\u00ba\u00fe\u00d34\u00f9\u001f?\u009e\u0099\u001d\u0010\u009b\u001e\u0095{H\u0005\u008a\u001a*\u00df\u00c8\u00f4/\u008a\u00aav\u0010\u00c3\u0086\u0092\u009f_j\u00b1\u00c9)M\u00fa\u00bd\u00a6\u001b\u00f3\u00d4\u0018)\u0084)\u00e9\u00db\u0099 Hb\u00c5%B\u007f\u00ce\u0015%\u009aH\u00ea\u00f0\u0012\u00b1\u00a3\u00b8 \u00f1\u00bd;\u009c\u008a\u0004\u00015\u001a\u001d|=\u00b0\u0090sC\u00e9\u0089]]\u00e5E\b\u00ad'\u009b<\u00bd\u0085\u00be\u0087\u0002\u0010\u0006\u00f7\u00ecy\u00d6\u00df\u0084\u00f2\u00fa\u00ec(Va!$\u0013\u0010\u00b1\u00f2\u00d6\u008el\u00d1\u00f1\u00ca9\u0088$X\b\u00a3\u009cA\u0010\u00ca\u008ez\u00c5T]\u0084/5\u00ad\u009dF\u00bb\u00e0\u00d6\u0095\u0010~ \u0091F\u00d6Q(d<$\u00f0\u00fdN8\u0002\u0083\u0010\u00a4\u0080\u0091Otrh\u007f\u0096\u00dd\tV\u00ff\u00bb\u00b0\u00ef\u0010bl\u0081I\u00b8\u0085\u001e\u00fbs\u0007\u00dd\u00a4\u0017<\u0086i8\u00d0\u00dcr9\u00e0\u00d1\u0011\u00a8B\u0082\u00cb0\r\u00ca\u007f\u009dp\u000e\u00eb\u00c9gC\u0096\u00ec`\u009aI\\V[V\u008cS\u008a\u00cc\u0016\u00e3\u00fd\u00f3\u00c8?\u00fffj)n\u008f%\u00bfE\u00da\u0098\u0011\u0015\u009ee \u007f\u00e9\u0081\u0091+\u00c6\u00e7J\u00903e\u0083\u00c4\u001f\u00b75\u00ec/\u00b5\u00e9\u00f5\u00de\u00e1R\u00ff\u001cK\u0010H5\u00de\u007f";
                var8_6 = "\u00a4#\u0096G\u0012\u000f!,\u001c(\u0018E\u009bH\u00ca\u0083 \u0003S\u00cc\u00b1v\u00a6\u00fe^\u00b3\u00d9@\u00ff\"I\u0007m8\u00b9-\u0000\u00f6&J%#\u00da\u0099\u0084q((_\u0010q\u00830\u0082J\u00e2\u00f3\u000e6m\u00c1\u00f7\u00f4\u0001[\u00ab\u00105B\u00e7\u00f0\u00db@\u00baYNK\u0089\u00b8\u00e4\u00ab\u00e7S\u0010\u0095d\u009fU>\u00f2\u008b\u00ae\u00aek\u00fe\u00ecT\u00c89\u00cc\u0010\u00c0\u0095mmz\u00b5\u00105\u0098\u0099\u0019\u00fe\u00ed\u00ce\u000fh\u0010a\u00bf\u00c0N\u00d8\u00ec@\u00da,q\u008d\u0096\u0002\u00d00\u00e4\u0010B]\u00ea\u0019@e\u00aea\u0011\u00e6\u00e2<\u00ca\u00d4\u00b9\u0088\u0010p\u00b4\u00d1\f\u00ec@P\t\u0098~\u0084Mv\u0013-!\u0010n\u009f\u00d3GU\u000e\u00cf\u0007s+@\r\u00d3Z\u0086z\u0010\u00a2\u001c\u00ea\u008f>\u00cd\u00c2\u0089\u00e3\u00c2G\u008c\u00a6\u00c9W\u00d6\u0010\u008exPL4I\u0082<\u008fz\u00d2BH\u00fb\u00d24\u0010\u0006\u00135?e\u00dd1\u00b8\u009b\u00f0\u007f\u0093A\u0000\u009e\u0099\u00104\u00be\u0015j\u00d7\u00b7\u00e4\\\u001eI\u0085\u00e7d\u00fbx\u00f1\u0010\u0017`\u00d7\u00f6\u0000\u00bcMGm\u009dWL\u008e'\u00cb\u00ff\u0010\n\u00e0\u000bN\u00d4\u00c3Ig\u0085C;\u0092\u00a5#*\u00e0\u0010V\\\u00c8e\u008b\u00ae\u00c7%\u00e4t\u00d1\u00b0\u0091\u00caV\u00af0\u00b6\u00ed*\u00e5\u008dk\u00b2\u00b1|\u00fc\u00ba\u009c\u0084\u0019[\u001f\u00b6\u0086%\u0016\u0092\u009e\u00b7[\u00ff\u0014#D\u00ecz(Z\u00a8\u0090b\u00d4\u0094+\u00ba\u00fe\u00d34\u00f9\u001f?\u009e\u0099\u001d\u0010\u009b\u001e\u0095{H\u0005\u008a\u001a*\u00df\u00c8\u00f4/\u008a\u00aav\u0010\u00c3\u0086\u0092\u009f_j\u00b1\u00c9)M\u00fa\u00bd\u00a6\u001b\u00f3\u00d4\u0018)\u0084)\u00e9\u00db\u0099 Hb\u00c5%B\u007f\u00ce\u0015%\u009aH\u00ea\u00f0\u0012\u00b1\u00a3\u00b8 \u00f1\u00bd;\u009c\u008a\u0004\u00015\u001a\u001d|=\u00b0\u0090sC\u00e9\u0089]]\u00e5E\b\u00ad'\u009b<\u00bd\u0085\u00be\u0087\u0002\u0010\u0006\u00f7\u00ecy\u00d6\u00df\u0084\u00f2\u00fa\u00ec(Va!$\u0013\u0010\u00b1\u00f2\u00d6\u008el\u00d1\u00f1\u00ca9\u0088$X\b\u00a3\u009cA\u0010\u00ca\u008ez\u00c5T]\u0084/5\u00ad\u009dF\u00bb\u00e0\u00d6\u0095\u0010~ \u0091F\u00d6Q(d<$\u00f0\u00fdN8\u0002\u0083\u0010\u00a4\u0080\u0091Otrh\u007f\u0096\u00dd\tV\u00ff\u00bb\u00b0\u00ef\u0010bl\u0081I\u00b8\u0085\u001e\u00fbs\u0007\u00dd\u00a4\u0017<\u0086i8\u00d0\u00dcr9\u00e0\u00d1\u0011\u00a8B\u0082\u00cb0\r\u00ca\u007f\u009dp\u000e\u00eb\u00c9gC\u0096\u00ec`\u009aI\\V[V\u008cS\u008a\u00cc\u0016\u00e3\u00fd\u00f3\u00c8?\u00fffj)n\u008f%\u00bfE\u00da\u0098\u0011\u0015\u009ee \u007f\u00e9\u0081\u0091+\u00c6\u00e7J\u00903e\u0083\u00c4\u001f\u00b75\u00ec/\u00b5\u00e9\u00f5\u00de\u00e1R\u00ff\u001cK\u0010H5\u00de\u007f".length();
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
                    var9_3[var7_4++] = ls.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Q\u008dTD\u00ce\u00be\u00f7\u007f\u00beo\u00ff*?\u000e\u00d0\\(BT\u00aaN\u00e2\u0003):\u00d5\u00de~4\u001d\u00cf3s+\u00c2A\u00dez\u00d5~\u009c\r:c\u00dc\u0084\u00d4d|\u008b\u00a1>X\u00f82Ak";
                    var8_6 = "Q\u008dTD\u00ce\u00be\u00f7\u007f\u00beo\u00ff*?\u000e\u00d0\\(BT\u00aaN\u00e2\u0003):\u00d5\u00de~4\u001d\u00cf3s+\u00c2A\u00dez\u00d5~\u009c\r:c\u00dc\u0084\u00d4d|\u008b\u00a1>X\u00f82Ak".length();
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
                    var9_3[var7_4++] = ls.a(var10_9).intern();
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
        ls.u = var9_3;
        ls.v = new String[32];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F1C;
        if (v[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])w.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ls", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = u[n2].getBytes("ISO-8859-1");
            ls.v[n2] = ls.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ls.a(n, l);
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
            throw new RuntimeException("ls" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ls.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
