import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.e;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lF
extends lh {
    private final kt<Number> l;
    private final kt<Number> n;
    private final kt<Number> m;
    private final kt<Number> k;
    private final kt<RB> p;
    private final kt<RB> u;
    private M5 s;
    private final Pd o;
    private long v;
    private boolean q;
    @A
    public final R8<b5> r;
    @A
    public final R8<cn> t;
    private static final long w;
    private static final String[] x;
    private static final String[] y;
    private static final Map z;

    public lF(short s, EU eU, int n, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ w;
        super(eU);
        this.l = new kt((String)((Object)lF.a("e", (int)1154, (long)(0x144D8A0CEEF931E2L ^ l))), (Object)4.5, (String)((Object)lF.a("e", (int)15295, (long)(0x36FC18CEF6950ECEL ^ l))), 0.1, 3.0, 8.0, "m");
        this.n = new kt((String)((Object)lF.a("e", (int)10311, (long)(0x1BD65901228C1D3EL ^ l))), (Object)6.0, (String)((Object)lF.a("e", (int)196, (long)(0x65142E0CC563B5B4L ^ l))), 0.1, 3.0, 10.0, "m");
        this.m = new kt((String)((Object)lF.a("e", (int)26398, (long)(0x75813B68CB25D266L ^ l))), (Object)120, (String)((Object)lF.a("e", (int)6425, (long)(0xEA783DECD222C63L ^ l))), 5.0, 10.0, 180.0, "\u00b0");
        this.k = new kt((String)((Object)lF.a("e", (int)8276, (long)(0x5E357441B302952AL ^ l))), (Object)10, (String)((Object)lF.a("e", (int)24589, (long)(0x3CBCC7EEE75DD57FL ^ l))), 1.0, 1.0, 20.0);
        this.p = new kt((String)((Object)lF.a("e", (int)21665, (long)(0xC73C52DC27D61C0L ^ l))), (Object)new RB((String)((Object)lF.a("e", (int)1374, (long)(0x180000BAB28E302DL ^ l))), new String[]{lF.a("e", (int)1374, (long)(0x180000BAB28E302DL ^ l)), lF.a("e", (int)11249, (long)(0x69E11E1CC5319E8EL ^ l))}), (String)((Object)lF.a("e", (int)26476, (long)(0x66F28CC8F84DD210L ^ l))));
        this.u = new kt((String)((Object)lF.a("e", (int)3609, (long)(0x5C89CFABB690BB6DL ^ l))), (Object)new RB((String)((Object)lF.a("e", (int)14878, (long)(0x11E694379ADF8F69L ^ l))), new String[]{lF.a("e", (int)14878, (long)(0x11E694379ADF8F69L ^ l)), lF.a("e", (int)1374, (long)(0x180000BAB28E302DL ^ l)), lF.a("e", (int)17494, (long)(0x7D7BB0D6F276F135L ^ l))}), (String)((Object)lF.a("e", (int)28362, (long)(0x2B3AFBBE031CDBA8L ^ l))));
        this.s = null;
        this.o = new Pd();
        this.v = 0L;
        this.q = false;
        this.r = this::lambda$new$3;
        this.t = this::lambda$new$4;
        this.a(new kt[]{this.m, this.l, this.n, this.k, this.p, this.u});
    }

    public void a(char c, long l) {
        this.s = null;
        this.q = false;
        dL.e();
    }




    private void g(int var1_1, short var2_2, short var3_3) {
























        throw new IllegalStateException("Decompilation failed");
    }






    private void f(short s, int n, char c) {
        block8: {
            int n2;
            int n3;
            int n4;
            block6: {
                long l;
                long l2 = l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ w;
                long l3 = l2 ^ 0x2BB4BC9BB075L;
                int n5 = (int)(l3 >>> 48);
                long l4 = l3 << 16 >>> 16;
                long l5 = l2 ^ 0x128A7C4A7659L;
                n4 = (int)(l5 >>> 32);
                n3 = (int)(l5 << 32 >>> 48);
                n2 = (int)(l5 << 48 >>> 48);
                int[] nArray = lX.f();
                try {
                    block7: {
                        try {
                            try {
                                if (nArray != null) break block6;
                                if (!e.g().f().olderThanOrEqualTo(ProtocolVersion.v1_8)) break block7;
                            }
                            catch (H h) {
                                throw lF.a(h);
                            }
                            this.g(n4, (short)n3, (short)n2);
                            Hk.b().R.a((short)n5, l4, (M2)Hk.j(), (LQ)this.s);
                            if (nArray == null) break block8;
                        }
                        catch (H h) {
                            throw lF.a(h);
                        }
                    }
                    Hk.b().R.a((short)n5, l4, (M2)Hk.j(), (LQ)this.s);
                }
                catch (H h) {
                    throw lF.a(h);
                }
            }
            this.g(n4, (short)n3, (short)n2);
        }
    }

    private void b() {
        long l;
        this.v = l = 1000L / Math.max(((Number)this.k.i()).longValue(), 1L);
        this.o.e();
    }

    private boolean a(M5 m5, float f) {
        float f2;
        block2: {
            block3: {
                float f3 = this.a(m5);
                int[] nArray = lX.f();
                try {
                    f2 = f3 == f ? 0 : (f3 < f ? -1 : 1);
                    if (nArray != null) break block2;
                    if (f2 > 0) break block3;
                }
                catch (H h) {
                    throw lF.a(h);
                }
                f2 = 1.0f;
                break block2;
            }
            f2 = 0.0f;
        }
        return (boolean)f2;
    }

    private float a(M5 m5) {
        double d;
        block18: {
            double d2;
            double d3;
            block19: {
                double d4;
                double d5;
                block20: {
                    double d6;
                    double d7;
                    int[] nArray;
                    block16: {
                        block17: {
                            d5 = m5.ax - Hk.j().ax;
                            d4 = m5.av - Hk.j().av;
                            nArray = lX.f();
                            d7 = Math.toDegrees(Math.atan(d4 / d5));
                            try {
                                try {
                                    try {
                                        try {
                                            double d8 = d4 - 0.0;
                                            d6 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                                            if (nArray != null) break block16;
                                            if (d6 >= 0) break block17;
                                        }
                                        catch (H h) {
                                            throw lF.a(h);
                                        }
                                        double d9 = d5 - 0.0;
                                        d6 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                                        if (nArray != null) break block16;
                                    }
                                    catch (H h) {
                                        throw lF.a(h);
                                    }
                                    if (d6 >= 0) break block17;
                                }
                                catch (H h) {
                                    throw lF.a(h);
                                }
                                d = 90.0 + d7;
                                break block18;
                            }
                            catch (H h) {
                                throw lF.a(h);
                            }
                        }
                        try {
                            d3 = d4;
                            d2 = 0.0;
                            if (nArray != null) break block19;
                            double d10 = d3 - d2;
                            d6 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                        }
                        catch (H h) {
                            throw lF.a(h);
                        }
                    }
                    try {
                        try {
                            try {
                                if (d6 >= 0) break block20;
                                d3 = d5;
                                d2 = 0.0;
                                if (nArray != null) break block19;
                            }
                            catch (H h) {
                                throw lF.a(h);
                            }
                            if (!(d3 > d2)) break block20;
                        }
                        catch (H h) {
                            throw lF.a(h);
                        }
                        d = -90.0 + d7;
                        break block18;
                    }
                    catch (H h) {
                        throw lF.a(h);
                    }
                }
                d3 = d5;
                d2 = d4;
            }
            d = Math.toDegrees(-Math.atan(d3 / d2));
        }
        double d11 = d;
        return Math.abs(rO.d((float)(-(Hk.j().H - (float)d11))));
    }

    private eA b(M5 m5) {
        double d = Hk.j().ax;
        double d2 = Hk.j().e + (double)Hk.j().V();
        double d3 = Hk.j().av;
        double d4 = m5.q().b;
        double d5 = m5.q().g;
        double d6 = m5.q().e;
        double d7 = m5.q().a;
        double d8 = m5.q().c;
        double d9 = m5.q().f;
        double d10 = rO.c((double)d, (double)d4, (double)d7);
        double d11 = rO.c((double)d2, (double)d5, (double)d8);
        double d12 = rO.c((double)d3, (double)d6, (double)d9);
        return new eA(d10, d11, d12);
    }

    private float[] a(eA eA2) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        double d = threadLocalRandom.nextDouble(-0.05, 0.1);
        double d2 = threadLocalRandom.nextDouble(-0.05, 0.1);
        double d3 = eA2.b + d;
        double d4 = eA2.c + d2;
        double d5 = eA2.a + d;
        return this.a(d3, d4, d5);
    }

    private float[] a(double d, double d2, double d3) {
        double d4 = d - Hk.j().ax;
        double d5 = d2 - (Hk.j().e + (double)Hk.j().V());
        double d6 = d3 - Hk.j().av;
        double d7 = Math.hypot(d4, d6);
        float f = (float)(Math.atan2(d6, d4) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d5, d7) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    private boolean c(M5 m5) {
        double d;
        block14: {
            block13: {
                int[] nArray;
                block12: {
                    float[] fArray;
                    block11: {
                        float[] fArray2;
                        block10: {
                            fArray = dL.c;
                            nArray = lX.f();
                            try {
                                try {
                                    fArray2 = fArray;
                                    if (nArray != null) break block10;
                                    if (fArray2 != null) break block11;
                                }
                                catch (H h) {
                                    throw lF.a(h);
                                }
                                float[] fArray3 = new float[2];
                                fArray3[0] = Hk.j().H;
                                fArray2 = fArray3;
                                fArray3[1] = Hk.j().m;
                            }
                            catch (H h) {
                                throw lF.a(h);
                            }
                        }
                        fArray = fArray2;
                    }
                    eA eA2 = this.b(m5);
                    float[] fArray4 = this.a(eA2);
                    double d2 = Math.abs(rO.d((float)(fArray[0] - fArray4[0])));
                    double d3 = Math.abs(fArray[1] - fArray4[1]);
                    try {
                        try {
                            double d4 = d2 - 45.0;
                            d = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                            if (nArray != null) break block12;
                            if (d >= 0) break block13;
                        }
                        catch (H h) {
                            throw lF.a(h);
                        }
                        double d5 = d3 - 30.0;
                        d = d5 == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
                    }
                    catch (H h) {
                        throw lF.a(h);
                    }
                }
                try {
                    if (nArray != null) break block14;
                    if (d >= 0) break block13;
                }
                catch (H h) {
                    throw lF.a(h);
                }
                d = 1.0;
                break block14;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    private void lambda$new$4(cn cn2) {
        block16: {
            int n;
            int n2;
            int n3;
            int n4;
            block15: {
                int[] nArray;
                block14: {
                    long l = w ^ 0x52C3182E79DBL;
                    long l2 = l ^ 0x94C68FA775L;
                    n4 = (int)(l2 >>> 48);
                    n3 = (int)(l2 << 16 >>> 32);
                    n2 = (int)(l2 << 48 >>> 48);
                    nArray = lX.f();
                    try {
                        if (cn2.b()) {
                            return;
                        }
                    }
                    catch (H h) {
                        throw lF.a(h);
                    }
                    try {
                        try {
                            if (Hk.j() != null && this.s != null) break block14;
                        }
                        catch (H h) {
                            throw lF.a(h);
                        }
                        return;
                    }
                    catch (H h) {
                        throw lF.a(h);
                    }
                }
                double d = Hk.j().b((LQ)this.s);
                try {
                    try {
                        n = this.c(this.s);
                        if (nArray != null) break block15;
                        if (n == 0) break block16;
                    }
                    catch (H h) {
                        throw lF.a(h);
                    }
                    double d2 = d - (double)this.l.k();
                    n = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                }
                catch (H h) {
                    throw lF.a(h);
                }
            }
            try {
                if (n <= 0) {
                    this.f((short)n4, n3, (char)n2);
                    this.s = null;
                }
            }
            catch (H h) {
                throw lF.a(h);
            }
        }
    }




    private void lambda$new$3(b5 var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }

    private static double lambda$null$2(M5 m5) {
        return Hk.j().b((LQ)m5);
    }

    private static M5 lambda$null$1(LQ lQ) {
        return (M5)lQ;
    }

    private static boolean lambda$null$0(LQ lQ) {
        return lQ instanceof M5;
    }




    static {
        block11: {
            block10: {
                lF.w = _c.a((long)-7955378040897088657L, (long)-193049012218311257L, MethodHandles.lookup().lookupClass()).a(232503830145999L);
                lF.z = new HashMap<K, V>(13);
                var0 = lF.w ^ 30268169394575L;
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
                var9_3 = new String[20];
                var7_4 = 0;
                var6_5 = "v\u00aew\u008b\u0018\u00f4\u00f5\u00f3\u00a0?:\u00fe\u00d4\u0004\u00e7\u0005\u0011\u0085\u00ed\u00b0\u0018\u00e5\u00e7o\u00a5s\u00e0\u00e5~\\w\u009e\u00b91p\u00cc\u0087w\"X\u00d4\u0085\u00f4\u001b\u00c3\u0002b\u00e00\u00a3\u000e,!*\u00f0\u00f1A\\2up\u000b!\u009c\u00e1\u001d.\u00b1p$\u00a5\"\u00a30=\u00ee\u00ef\u00c1\u0006\u00d8;\u0083\u00c6T,\u0080\t\u00e0\u009a\u0000F\u00b7;\u00f8M\u001d\u00d9\u0010a\u00a1\u0003U&kk\u00fbe\u008aNi'0\u00dfH8\u00d2\u00d2\u00a2\u00ef\u0097\u00935\u00d1\u00a48\u00d0N/j\u00c9\u00c4,\u00e2[\u0006\rSv\u001bC\u0080\u00d5A\u009d\u008f1\u00c6fa\u00f5\u00b3\u00a4u\u00cc\u0005Mt]\u0095\u008a\u00e3\tb\u009c\u0011\u00a0\u00de\u00ad \u0011\u00c8\u0010\u00c0.)\u00c5\u001a\u00a3\u00d3\u00ed\u00e9\u00a2v<h`\u00df\u00c0\u0018EV\u00f7 \u00a5\u0005\u000b\u00a8lUV\u00e8\u0089^u\u00fa\u008aF\u00d9)\u00b9^~\u00a6\u0010X\u00c7\u0018N\u00b8\u00d7y*(\u008bK\u00e3\u00c0\u00f1S\u0088\u00101\u00ca\u00bfn\u00d2\u00b4\u00cev\u00ef\u00db\u00fd\u00dao,\u0010\u00a2 Y\u00a2\u00f7KMd\u00e6\u000e\u00fc\u00f9|)\u0094\u00ed\u00f6R\u00ff\u009e\u00ef\u00f9B</\u009aaT\u00bd\u00e1\u0094&\u009e}\u0018\u000e\u009c\u0084\u0019z\u00b9q\u00ae\u00d4\u0011\u00ec\u00e8I_C\u00d0k\u00fb\u00d3.\u0014\u00fd\u0092\u00d0\u0010F\u00f9\u00a0\u00b0\u00a2P\u009d\u009e\u00f3\u0002|\u0088\u0082\u00c7\u00d4\u00f8@\u00a5\u008d?\u0093\u0080\u00d9{(}\u0003\u009e\u001f\u00fc\u0001p\u001dDb\u0081\u00fd{\u00a2\u00a3\u0097\u0017\u00edD\u00ecK\u00df\u008cw-\u0081\u00car\u00c0\rO +\u00a0r\u001b\u00af\u00b432\u00be\u0014\u00c7\u0001\u00b8s\u00bc\u00ae\u00dc\u00d7\u00c1\u00fbI\u00d3|\u00ec\u0010Z\u00f2\u00a8\u001c\u00d7\u00afp\u00b0m\u00ee\u00dat\u008d\u0005\u00bf\u00ac(\u00b17\u00df\r\u00be\u00ce\u009c\u00ea\u009e\u00971\u00c2\\\u00caF\t\u00fat\u0011\u00fch-#\u0091\u00b5\u00c76(>\u00c3\u00f4\u0001\u00c4\u00a1\u0005\u0017x\n\u008e\u00f3\u0010t\u0005C\u0019\u00e5\u00e3\u00dd\u00ac\u008c\u0099\u00fd&n\u00a2\u001f\f \u0089' \u00c3\u00dcd)\u0096Pw\u00f2\u008e\u00ac\u00c7>j\ny\u00e2#\u00c2\u0092'\u00ec\u00ff\u00a0\u00b3\nX\u00c61\u00c6\u0010e\u00be\u001d7\u00d8~\u00aa\u00b4\u000f\u001eKV\u00be\u00a9\u00bb\u00fd\u0010\u00f0\b\u00c8\u008d\u0090=\u0010\u00af\u0092\f\u009bJ\u00e1\u0018%\u001a";
                var8_6 = "v\u00aew\u008b\u0018\u00f4\u00f5\u00f3\u00a0?:\u00fe\u00d4\u0004\u00e7\u0005\u0011\u0085\u00ed\u00b0\u0018\u00e5\u00e7o\u00a5s\u00e0\u00e5~\\w\u009e\u00b91p\u00cc\u0087w\"X\u00d4\u0085\u00f4\u001b\u00c3\u0002b\u00e00\u00a3\u000e,!*\u00f0\u00f1A\\2up\u000b!\u009c\u00e1\u001d.\u00b1p$\u00a5\"\u00a30=\u00ee\u00ef\u00c1\u0006\u00d8;\u0083\u00c6T,\u0080\t\u00e0\u009a\u0000F\u00b7;\u00f8M\u001d\u00d9\u0010a\u00a1\u0003U&kk\u00fbe\u008aNi'0\u00dfH8\u00d2\u00d2\u00a2\u00ef\u0097\u00935\u00d1\u00a48\u00d0N/j\u00c9\u00c4,\u00e2[\u0006\rSv\u001bC\u0080\u00d5A\u009d\u008f1\u00c6fa\u00f5\u00b3\u00a4u\u00cc\u0005Mt]\u0095\u008a\u00e3\tb\u009c\u0011\u00a0\u00de\u00ad \u0011\u00c8\u0010\u00c0.)\u00c5\u001a\u00a3\u00d3\u00ed\u00e9\u00a2v<h`\u00df\u00c0\u0018EV\u00f7 \u00a5\u0005\u000b\u00a8lUV\u00e8\u0089^u\u00fa\u008aF\u00d9)\u00b9^~\u00a6\u0010X\u00c7\u0018N\u00b8\u00d7y*(\u008bK\u00e3\u00c0\u00f1S\u0088\u00101\u00ca\u00bfn\u00d2\u00b4\u00cev\u00ef\u00db\u00fd\u00dao,\u0010\u00a2 Y\u00a2\u00f7KMd\u00e6\u000e\u00fc\u00f9|)\u0094\u00ed\u00f6R\u00ff\u009e\u00ef\u00f9B</\u009aaT\u00bd\u00e1\u0094&\u009e}\u0018\u000e\u009c\u0084\u0019z\u00b9q\u00ae\u00d4\u0011\u00ec\u00e8I_C\u00d0k\u00fb\u00d3.\u0014\u00fd\u0092\u00d0\u0010F\u00f9\u00a0\u00b0\u00a2P\u009d\u009e\u00f3\u0002|\u0088\u0082\u00c7\u00d4\u00f8@\u00a5\u008d?\u0093\u0080\u00d9{(}\u0003\u009e\u001f\u00fc\u0001p\u001dDb\u0081\u00fd{\u00a2\u00a3\u0097\u0017\u00edD\u00ecK\u00df\u008cw-\u0081\u00car\u00c0\rO +\u00a0r\u001b\u00af\u00b432\u00be\u0014\u00c7\u0001\u00b8s\u00bc\u00ae\u00dc\u00d7\u00c1\u00fbI\u00d3|\u00ec\u0010Z\u00f2\u00a8\u001c\u00d7\u00afp\u00b0m\u00ee\u00dat\u008d\u0005\u00bf\u00ac(\u00b17\u00df\r\u00be\u00ce\u009c\u00ea\u009e\u00971\u00c2\\\u00caF\t\u00fat\u0011\u00fch-#\u0091\u00b5\u00c76(>\u00c3\u00f4\u0001\u00c4\u00a1\u0005\u0017x\n\u008e\u00f3\u0010t\u0005C\u0019\u00e5\u00e3\u00dd\u00ac\u008c\u0099\u00fd&n\u00a2\u001f\f \u0089' \u00c3\u00dcd)\u0096Pw\u00f2\u008e\u00ac\u00c7>j\ny\u00e2#\u00c2\u0092'\u00ec\u00ff\u00a0\u00b3\nX\u00c61\u00c6\u0010e\u00be\u001d7\u00d8~\u00aa\u00b4\u000f\u001eKV\u00be\u00a9\u00bb\u00fd\u0010\u00f0\b\u00c8\u008d\u0090=\u0010\u00af\u0092\f\u009bJ\u00e1\u0018%\u001a".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = lF.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f1\u00f9n\u00a4O*\t\u00d0V.V\u00016\u008fx\u00e8Pj\u00b5\u0082\u00901\u00b3v\u0096\u001a\u00e0\u00ddy.\u00fa\u00c1:w\u0093\u0093]\u000b\u00cb\u0006\f\u00a3\u00a4\u00d5\u0085\u00fb\u00ca\u00a3\u00e1\u0015\u00ab\u00feu\u00d3\u00b2=he(\u0097\u00f8\u00a8\u0098\u00c8U\u00eeM\u00b5\u00ce\u00dc\u0012%\u0007X\u00d1\u0097\u00f2_\u00ec\u000b/r\u00b7\u001dH\u000b\u00ae\u00d8\u0086\u0003\u00a0\u00ca\u0011\u001c\u0002%\b";
                    var8_6 = "\u00f1\u00f9n\u00a4O*\t\u00d0V.V\u00016\u008fx\u00e8Pj\u00b5\u0082\u00901\u00b3v\u0096\u001a\u00e0\u00ddy.\u00fa\u00c1:w\u0093\u0093]\u000b\u00cb\u0006\f\u00a3\u00a4\u00d5\u0085\u00fb\u00ca\u00a3\u00e1\u0015\u00ab\u00feu\u00d3\u00b2=he(\u0097\u00f8\u00a8\u0098\u00c8U\u00eeM\u00b5\u00ce\u00dc\u0012%\u0007X\u00d1\u0097\u00f2_\u00ec\u000b/r\u00b7\u001dH\u000b\u00ae\u00d8\u0086\u0003\u00a0\u00ca\u0011\u001c\u0002%\b".length();
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
                    var9_3[var7_4++] = lF.a(var10_9).intern();
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
        lF.x = var9_3;
        lF.y = new String[20];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7547;
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
                throw new RuntimeException("lF", exception);
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
            lF.y[n2] = lF.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lF.a(n, l);
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
            throw new RuntimeException("lF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
