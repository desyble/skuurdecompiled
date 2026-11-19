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

public class md
extends lh {
    private final kt<RB> q;
    private final kt<Number> p;
    private final kt<Number> n;
    private final kt<Number> o;
    private final kt<Number> m;
    private final kt<Number> r;
    private final kt<Boolean> l;
    private final kt<Boolean> s;
    @A
    public final R8<cn> k;
    private static final long t;
    private static final String[] u;
    private static final String[] v;
    private static final Map w;

    public md(EU eU, int n, short s, int n2) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ t;
        super(eU);
        this.q = new kt((String)((Object)md.a("e", (int)26413, (long)(0x15A488952A22B02FL ^ l))), (Object)new RB((String)((Object)md.a("e", (int)5159, (long)(0x4841C746A54D4320L ^ l))), new String[]{md.a("e", (int)5159, (long)(0x4841C746A54D4320L ^ l)), md.a("e", (int)1612, (long)(0x1877737B23D1D152L ^ l)), md.a("e", (int)1295, (long)(0x3555C1CD249E5203L ^ l)), md.a("e", (int)28363, (long)(0x5ECECCDDA64B39C4L ^ l)), md.a("e", (int)17565, (long)(0x25148140E8E21382L ^ l)), md.a("e", (int)13021, (long)(0x7DBFE696EF01E5CFL ^ l)), md.a("e", (int)15893, (long)(0x4F980EBC8DDF690FL ^ l)), md.a("e", (int)30689, (long)(0x5BDC62361C420E2L ^ l)), md.a("e", (int)16994, (long)(0x2AB30C3DED43157FL ^ l)), md.a("e", (int)702, (long)(0x20A8B2FF766255A7L ^ l)), md.a("e", (int)30785, (long)(0x3D04A3BC41FCAF59L ^ l)), md.a("e", (int)12039, (long)(0x769F858D10C5780EL ^ l)), md.a("e", (int)18752, (long)(0x5DDE87279B769E46L ^ l)), md.a("e", (int)27475, (long)(0x1A8655858489BC58L ^ l))}), (String)((Object)md.a("e", (int)24142, (long)(0x17F97A4BDC860943L ^ l))));
        this.p = new kt("X", (Object)0, (String)((Object)md.a("e", (int)28092, (long)(0x5D30C1B895A2BABCL ^ l))), 0.01, -2.0, 2.0);
        this.n = new kt("Y", (Object)0, (String)((Object)md.a("e", (int)31240, (long)(0x3A39958BA47AAD06L ^ l))), 0.01, -2.0, 2.0);
        this.o = new kt("Z", (Object)0, (String)((Object)md.a("e", (int)3477, (long)(0x6FB1341FC5FEDA85L ^ l))), 0.01, -2.0, 2.0);
        this.m = new kt((String)((Object)md.a("e", (int)1295, (long)(0x3555C1CD249E5203L ^ l))), (Object)1, (String)((Object)md.a("e", (int)7247, (long)(0x2D6C825424644B4BL ^ l))), 0.01, 0.1, 10.0, this::lambda$new$0);
        this.r = new kt((String)((Object)md.a("e", (int)17096, (long)(0x3AE9CA6E813E95D4L ^ l))), (Object)6, (String)((Object)md.a("e", (int)3899, (long)(0x2980291E417FD82AL ^ l))), 1.0, 1.0, 15.0);
        this.l = new kt((String)((Object)md.a("e", (int)3287, (long)(0x46DDC11597A9DBCCL ^ l))), (Object)false, (String)((Object)md.a("e", (int)3616, (long)(0x1FF61720E094D934L ^ l))));
        this.s = new kt((String)((Object)md.a("e", (int)24270, (long)(0x79E99FE7864309C4L ^ l))), (Object)false, (String)((Object)md.a("e", (int)391, (long)(0x5C4A03D2B874568FL ^ l))));
        this.k = this::lambda$new$1;
        kt kt2 = new kt((String)((Object)md.a("e", (int)18991, (long)(0x272D61E544B19D2EL ^ l))), new kt[]{this.p, this.n, this.o});
        this.a(new kt[]{kt2, this.q, this.m, this.r, this.l, this.s});
    }

    public String b(short s, char c, int n) {
        Object object;
        block7: {
            int n2;
            long l;
            block5: {
                block6: {
                    md md2;
                    block4: {
                        l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ t;
                        boolean bl = mr.e();
                        try {
                            try {
                                md2 = this;
                                if (bl) break block4;
                                n2 = md2.b();
                                if (s < 0) break block5;
                                if (n2 == 0) break block6;
                            }
                            catch (H h) {
                                throw md.a(h);
                            }
                            md2 = this;
                        }
                        catch (H h) {
                            throw md.a(h);
                        }
                    }
                    object = md2.q.q();
                    break block7;
                }
                n2 = 1238;
            }
            object = md.a("e", (int)n2, (long)(0x16D162677BC67580L ^ l));
        }
        return object;
    }

    public float[] d() {
        float[] fArray;
        block6: {
            int n;
            block4: {
                block5: {
                    boolean bl = mr.e();
                    try {
                        try {
                            n = this.b();
                            if (bl) break block4;
                            if (n == 0) break block5;
                        }
                        catch (H h) {
                            throw md.a(h);
                        }
                        float[] fArray2 = new float[3];
                        fArray2[0] = this.p.k();
                        fArray2[1] = this.n.k();
                        fArray = fArray2;
                        fArray2[2] = this.o.k();
                        break block6;
                    }
                    catch (H h) {
                        throw md.a(h);
                    }
                }
                n = 3;
            }
            float[] fArray3 = new float[n];
            fArray3[0] = 0.0f;
            fArray3[1] = 0.0f;
            fArray = fArray3;
            fArray3[2] = 0.0f;
        }
        return fArray;
    }

    public float c() {
        return this.m.k() / 5.0f;
    }

    public boolean e() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    bl2 = mr.e();
                    try {
                        try {
                            bl = this.b();
                            if (bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw md.a(h);
                        }
                        bl = this.l.g();
                    }
                    catch (H h) {
                        throw md.a(h);
                    }
                }
                try {
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw md.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean a() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    bl2 = mr.e();
                    try {
                        try {
                            bl = this.b();
                            if (bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw md.a(h);
                        }
                        bl = this.s.g();
                    }
                    catch (H h) {
                        throw md.a(h);
                    }
                }
                try {
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw md.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private void lambda$new$1(cn cn2) {
        block29: {
            boolean bl;
            boolean bl2;
            int n;
            int n2;
            int n3;
            block25: {
                block26: {
                    long l = t ^ 0x79FEEE15102FL;
                    long l2 = l ^ 0x53726469C8BL;
                    n3 = (int)(l2 >>> 32);
                    n2 = (int)(l2 << 32 >>> 48);
                    n = (int)(l2 << 48 >>> 48);
                    bl2 = mr.k();
                    try {
                        bl = cn2.b();
                        if (!bl2) break block25;
                        if (!bl) break block26;
                    }
                    catch (H h) {
                        throw md.a(h);
                    }
                    return;
                }
                bl = this.l.g();
            }
            if (bl) {
                block31: {
                    uC uC2;
                    int n4;
                    MI mI;
                    block30: {
                        MI mI2;
                        cD cD2;
                        block27: {
                            block28: {
                                mI = Hk.j();
                                cD2 = Hk.b();
                                try {
                                    mI2 = mI;
                                    if (!bl2) break block27;
                                    if (mI2 != null) break block28;
                                }
                                catch (H h) {
                                    throw md.a(h);
                                }
                                return;
                            }
                            mI2 = mI;
                        }
                        n4 = mI2.x(n3, (char)n2, (short)n);
                        try {
                            try {
                                try {
                                    if (!Hk.i().aF.i()) break block29;
                                    uC2 = cD2.U;
                                    if (!bl2) break block30;
                                }
                                catch (H h) {
                                    throw md.a(h);
                                }
                                if (uC2 == null) break block29;
                            }
                            catch (H h) {
                                throw md.a(h);
                            }
                            uC2 = cD2.U;
                        }
                        catch (H h) {
                            throw md.a(h);
                        }
                    }
                    try {
                        MI mI3;
                        block32: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (uC2.d != Rt.BLOCK) break block29;
                                                    mI3 = mI;
                                                    if (!bl2) break block31;
                                                }
                                                catch (H h) {
                                                    throw md.a(h);
                                                }
                                                if (!mI3.aR) break block32;
                                            }
                                            catch (H h) {
                                                throw md.a(h);
                                            }
                                            mI3 = mI;
                                            if (!bl2) break block31;
                                        }
                                        catch (H h) {
                                            throw md.a(h);
                                        }
                                        if (mI3.aU >= n4 >> 1) break block32;
                                    }
                                    catch (H h) {
                                        throw md.a(h);
                                    }
                                    mI3 = mI;
                                    if (!bl2) break block31;
                                }
                                catch (H h) {
                                    throw md.a(h);
                                }
                                if (mI3.aU >= 0) break block29;
                            }
                            catch (H h) {
                                throw md.a(h);
                            }
                        }
                        mI.aR = true;
                        mI3 = mI;
                    }
                    catch (H h) {
                        throw md.a(h);
                    }
                }
                mI3.aU = -1;
            }
        }
    }

    private boolean lambda$new$0() {
        long l = t ^ 0xEDD665DDCCAL;
        return this.q.q().startsWith((String)((Object)md.a("e", (int)7772, (long)(0x10703065C5E2DA44L ^ l))));
    }




    static {
        block11: {
            block10: {
                md.t = _c.a((long)-2532275897330891351L, (long)7823620354041648629L, MethodHandles.lookup().lookupClass()).a(529966713943L);
                md.w = new HashMap<K, V>(13);
                var0 = md.t ^ 59061619252136L;
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
                var9_3 = new String[29];
                var7_4 = 0;
                var6_5 = "\u00fc\u00975\u0099T\u001f\u00a9|p\u00da3p\u00ec\u00bf\u0097o\u00e8\u00f4\u00f0\u00eb\u0097\u00c9\u0017\u00b7\u00ac\u00f9\u00f4D\u00df\u00e7\u001dhED\u008d#(_\u00b8:\u00a1\u0095e\u00c4\u009d\r\u00166\u0006\u00b08\u00f8L\u00f74\u00d3\u00a9>H\u00f2xk!8\u0010?&\u00c0\u00e5*n\u00f2.\u0099^\u00bc\u00d6I\u00caI% \u0017h\u00f0\u008eCf\u00d9\u0000\u00e2Y'\u0097\u00b1\u009f\u00a2f\u001f\u00e9er)\u0002}k_\u00fc7\u00d0oJ\u009c\u00bd\u0010(\u00f8\u00f2\u0098\u0087\u00acn\u0086\u00a5&\u00ff\u00f8\u0015|\u00f3\u00b6\u0010\\R\u00ed\u00ccF&\u00e6d\u0082n\u00e6\u001dA\u00a7<\u00c7\u0018\u00c9\u00d4>\u00bb\u00f8\u0010y3\u0006\u00b1hh\u00c0\u00ea]7AQN\u0015E=\u000fD\u0010\u00b5\u008aO\u000e$\u00e7\u00c4\u0000v\u0004\u0081\u00d6\u00df\u00ad6S\u0010\u0099\u0099s\u00f1\u0000\u00ef\u00c9\u00b5\u00f0J\u00ac\u00c3aiL\u009d\u0010.\u00ea\u009c#\u0004\u00a74Z\u000f\u0001\u00f5m\u00cf\u0085\n\u00ee A\u00df\u0018E\u0087\u0099+\u0080\t\u00f0k\u00b1\u00calQZ\u00a5\u00c9\u0087\u00ad]\u0003V\u00e7GL\u00deY\u00cd\u0000k\u00ab\u0010xjz/\u0012\u0095|\u00cc\u00c4\u00c0X\u00a6\u001f)h\u0081\u0010\u008d\u009ao\u00b4\u00e5\u00d2\u00a2\u00f4i\u00d9\u0015rd\u00df\u0095\u00188I\u00a3>1\u0007\u00e9}Q1\u00f5+\u0095G\u00fc\u008d\u00c5\u0005\u00ae=\t\u0088\u00c5F\u00de\u00dd\u0006SA\u00eb\u008e\u00d8\u00d4^\u0084T1_\u0013\u00be\\\u00a6\u00b2\u009d/\u0001@\u009d;\u00ca\u00e6F\f\u00f1\u00e4\u0003G\u0010\u00b2(\u00da\u00c7\u00bb\u008dc\u00a23\u00fe;\u00eae\u00fd\u00b3\u00b0\u0010[hY\u00f2\u008eV\u0094\u0094\u00e2\u00e1\u00d7g\u009cl\t~\u0010\u00f3\u001d!\u00e4=\u001d\u0019\u0082\u0015\u00eeY\u00a4\u00efDa\u00f5\u0010\u00af\u00a5&\u0019\u00b2\u007f:\u00c6E>\u00f3\u00d3`\u007f\u009d\u00c9\u0010\u00cd\u0012\u0007\u00ce\u00a7\r\u0088F\u009f\u00d3\u0097\u008dr\u00faf\u0093\u00102\u00eeRH\u00f1\u00e7\u0014\u00ea\u00a7ag\u00db-\u00040f(j\u0089\u00c5}e\u00b3\u008c\u00a0\u00ea\u00c4\u00c5\u00da\u0006-\u00eda\u00cd\u00b2\u00c9\u00d6\u0082\u0005<y\u0097\u00a6Oul\u00b6\u00f3\u0090\u00f5\u0012\"\u00a7\u0006\u00da\u00a7\u0099\u0010\u008bi\u00a7\b\u007f\u00fd>\u00ca\u00df\u00ee\u00d5\u008d\u001f/\u00fa\u0092\u0010\u00ed\u00ea[\u00d6'\u00cc\u001dC\u007f3\u00f3\b*r\u00ce+\u0010:\u00c0\u00dai\u00dbC\u009a\u00c2X\u00edq\u00ba\u0011\u00e5\u0004\u0092\u0010j\u00cb\u0015.@\u0080\u00c6E\u00b0\u0085\u00c8\u00b1v\u0013\u00c6\u00ed\u0010\u0015\u00ab\u00f2t~;_E\u0018}x$\u00fc+\u00a9c(\u00d2c\u00f0\u00cb\u00c8\u00af0\u0080Hm\u00bd \u00dc\u00a2y\u0082\u0080E\u00ebB'\u00c7R\u0016\u00d5=\u00b1t\u00e2G\u00c4\u0095\u00fc\u00f3\u00a2\u0002\u00c6\u0092RA\u0010\u0099\u00d0\u00a4\u00ad\u00e0\u0080\u00b3*\u00a2\u001aBW\u00985\u00f2u";
                var8_6 = "\u00fc\u00975\u0099T\u001f\u00a9|p\u00da3p\u00ec\u00bf\u0097o\u00e8\u00f4\u00f0\u00eb\u0097\u00c9\u0017\u00b7\u00ac\u00f9\u00f4D\u00df\u00e7\u001dhED\u008d#(_\u00b8:\u00a1\u0095e\u00c4\u009d\r\u00166\u0006\u00b08\u00f8L\u00f74\u00d3\u00a9>H\u00f2xk!8\u0010?&\u00c0\u00e5*n\u00f2.\u0099^\u00bc\u00d6I\u00caI% \u0017h\u00f0\u008eCf\u00d9\u0000\u00e2Y'\u0097\u00b1\u009f\u00a2f\u001f\u00e9er)\u0002}k_\u00fc7\u00d0oJ\u009c\u00bd\u0010(\u00f8\u00f2\u0098\u0087\u00acn\u0086\u00a5&\u00ff\u00f8\u0015|\u00f3\u00b6\u0010\\R\u00ed\u00ccF&\u00e6d\u0082n\u00e6\u001dA\u00a7<\u00c7\u0018\u00c9\u00d4>\u00bb\u00f8\u0010y3\u0006\u00b1hh\u00c0\u00ea]7AQN\u0015E=\u000fD\u0010\u00b5\u008aO\u000e$\u00e7\u00c4\u0000v\u0004\u0081\u00d6\u00df\u00ad6S\u0010\u0099\u0099s\u00f1\u0000\u00ef\u00c9\u00b5\u00f0J\u00ac\u00c3aiL\u009d\u0010.\u00ea\u009c#\u0004\u00a74Z\u000f\u0001\u00f5m\u00cf\u0085\n\u00ee A\u00df\u0018E\u0087\u0099+\u0080\t\u00f0k\u00b1\u00calQZ\u00a5\u00c9\u0087\u00ad]\u0003V\u00e7GL\u00deY\u00cd\u0000k\u00ab\u0010xjz/\u0012\u0095|\u00cc\u00c4\u00c0X\u00a6\u001f)h\u0081\u0010\u008d\u009ao\u00b4\u00e5\u00d2\u00a2\u00f4i\u00d9\u0015rd\u00df\u0095\u00188I\u00a3>1\u0007\u00e9}Q1\u00f5+\u0095G\u00fc\u008d\u00c5\u0005\u00ae=\t\u0088\u00c5F\u00de\u00dd\u0006SA\u00eb\u008e\u00d8\u00d4^\u0084T1_\u0013\u00be\\\u00a6\u00b2\u009d/\u0001@\u009d;\u00ca\u00e6F\f\u00f1\u00e4\u0003G\u0010\u00b2(\u00da\u00c7\u00bb\u008dc\u00a23\u00fe;\u00eae\u00fd\u00b3\u00b0\u0010[hY\u00f2\u008eV\u0094\u0094\u00e2\u00e1\u00d7g\u009cl\t~\u0010\u00f3\u001d!\u00e4=\u001d\u0019\u0082\u0015\u00eeY\u00a4\u00efDa\u00f5\u0010\u00af\u00a5&\u0019\u00b2\u007f:\u00c6E>\u00f3\u00d3`\u007f\u009d\u00c9\u0010\u00cd\u0012\u0007\u00ce\u00a7\r\u0088F\u009f\u00d3\u0097\u008dr\u00faf\u0093\u00102\u00eeRH\u00f1\u00e7\u0014\u00ea\u00a7ag\u00db-\u00040f(j\u0089\u00c5}e\u00b3\u008c\u00a0\u00ea\u00c4\u00c5\u00da\u0006-\u00eda\u00cd\u00b2\u00c9\u00d6\u0082\u0005<y\u0097\u00a6Oul\u00b6\u00f3\u0090\u00f5\u0012\"\u00a7\u0006\u00da\u00a7\u0099\u0010\u008bi\u00a7\b\u007f\u00fd>\u00ca\u00df\u00ee\u00d5\u008d\u001f/\u00fa\u0092\u0010\u00ed\u00ea[\u00d6'\u00cc\u001dC\u007f3\u00f3\b*r\u00ce+\u0010:\u00c0\u00dai\u00dbC\u009a\u00c2X\u00edq\u00ba\u0011\u00e5\u0004\u0092\u0010j\u00cb\u0015.@\u0080\u00c6E\u00b0\u0085\u00c8\u00b1v\u0013\u00c6\u00ed\u0010\u0015\u00ab\u00f2t~;_E\u0018}x$\u00fc+\u00a9c(\u00d2c\u00f0\u00cb\u00c8\u00af0\u0080Hm\u00bd \u00dc\u00a2y\u0082\u0080E\u00ebB'\u00c7R\u0016\u00d5=\u00b1t\u00e2G\u00c4\u0095\u00fc\u00f3\u00a2\u0002\u00c6\u0092RA\u0010\u0099\u00d0\u00a4\u00ad\u00e0\u0080\u00b3*\u00a2\u001aBW\u00985\u00f2u".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = md.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\n/}u\u00b6T\u00b2\u008e\u00a1\u00a2\u008d\u00f3cWleP\u00ee\u00eb\u00d9,\u007f\u0003\u009dU\u00ed \u0010\u009a\u00b5\u001f\u0004\u00a1\u0011e\u0081\u00d0\u00c0g\u00d4\u00ab\u0084nr\u00d0q\u0090ZF\u0099\u0014\u0006\u00f4\u000b{\u00f3&\u00aef\n\u008c\u00ee#\u0081f\u0003f\u00e5*\u00f0J2\u009f.I\u001c\u0018\u00f0\u00b8Y\u00bb\u00cenkm\u00b5\u0082\u0087N`X\u00f5\u00d1\r\u00b0\u0092\u0097";
                    var8_6 = "\n/}u\u00b6T\u00b2\u008e\u00a1\u00a2\u008d\u00f3cWleP\u00ee\u00eb\u00d9,\u007f\u0003\u009dU\u00ed \u0010\u009a\u00b5\u001f\u0004\u00a1\u0011e\u0081\u00d0\u00c0g\u00d4\u00ab\u0084nr\u00d0q\u0090ZF\u0099\u0014\u0006\u00f4\u000b{\u00f3&\u00aef\n\u008c\u00ee#\u0081f\u0003f\u00e5*\u00f0J2\u009f.I\u001c\u0018\u00f0\u00b8Y\u00bb\u00cenkm\u00b5\u0082\u0087N`X\u00f5\u00d1\r\u00b0\u0092\u0097".length();
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
                    var9_3[var7_4++] = md.a(var10_9).intern();
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
        md.u = var9_3;
        md.v = new String[29];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78A3;
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
                throw new RuntimeException("md", exception);
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
            md.v[n2] = md.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = md.a(n, l);
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
            throw new RuntimeException("md" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(md.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
