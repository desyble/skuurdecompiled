import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mH
extends lh {
    private final Map<Integer, Integer> o;
    private final kt<Kh> r;
    private final kt<Kh> l;
    private final kt<Number> k;
    private final kt<Number> n;
    private final kt<Number> u;
    private final kt<Boolean> s;
    private final kt<Boolean> q;
    private final kt<Boolean> t;
    private final kt<Boolean> m;
    @A
    public final R8<ck> p;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;

    public mH(EU eU, short s, char c, int n) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ v;
        super(eU);
        this.o = new HashMap<Integer, Integer>();
        this.r = new kt((String)((Object)mH.a("k", (int)30285, (long)(0x3BCC8C62349C213AL ^ l))), 0, 255, 0, 255, (String)((Object)mH.a("k", (int)31693, (long)(0x4F04861A6E002CA8L ^ l))));
        this.l = new kt((String)((Object)mH.a("k", (int)29199, (long)(0x2263EF9878D3A576L ^ l))), 255, 0, 0, 255, (String)((Object)mH.a("k", (int)17525, (long)(0x2F21290C2F391311L ^ l))));
        this.k = new kt((String)((Object)mH.a("k", (int)18514, (long)(0x265316D5208A1F24L ^ l))), (Object)20, (String)((Object)mH.a("k", (int)7043, (long)(0x473211D0473E4CF1L ^ l))), 1.0, 1.0, 70.0);
        this.n = new kt((String)((Object)mH.a("k", (int)23049, (long)(0x40628F7E94E68D72L ^ l))), (Object)0.1, (String)((Object)mH.a("k", (int)17517, (long)(0x2E0EF9B3FF551318L ^ l))), 0.1, 0.01, 1.0);
        this.u = new kt((String)((Object)mH.a("k", (int)996, (long)(0x7117B955ED965498L ^ l))), (Object)3, (String)((Object)mH.a("k", (int)6154, (long)(0xC5C31DE0B1BCF74L ^ l))), 0.1, 0.1, 10.0);
        this.s = new kt((String)((Object)mH.a("k", (int)5667, (long)(0x6BD1BD95B700415CL ^ l))), (Object)true, (String)((Object)mH.a("k", (int)11078, (long)(0x1B65072DD2037C37L ^ l))));
        this.q = new kt((String)((Object)mH.a("k", (int)30101, (long)(0x44D718A53F14A2EDL ^ l))), (Object)true, (String)((Object)mH.a("k", (int)4995, (long)(0x17E3EA6DF0B444F0L ^ l))));
        this.t = new kt((String)((Object)mH.a("k", (int)8008, (long)(0x4522D765F830C83CL ^ l))), (Object)false, (String)((Object)mH.a("k", (int)16960, (long)(0x234FCE4027C0953DL ^ l))));
        this.m = new kt((String)((Object)mH.a("k", (int)13659, (long)(0x65866272B530E221L ^ l))), (Object)false, (String)((Object)mH.a("k", (int)23300, (long)(0x51570BC5C24A8C74L ^ l))));
        this.p = this::lambda$new$0;
        this.a(new kt[]{this.r, this.l, this.k, this.n, this.u, this.s, this.q, this.t, this.m});
    }

    public void e() {
        this.o.clear();
    }

    private void a(LQ lQ, int n, int n2, int n3, float f, int n4) {
        double d;
        double d2;
        double d3;
        int n5;
        int n6;
        int n7;
        block3: {
            Random random;
            block2: {
                long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ v;
                long l2 = l ^ 0x143BFA62E416L;
                n7 = (int)(l2 >>> 48);
                n6 = (int)(l2 << 16 >>> 48);
                n5 = (int)(l2 << 32 >>> 32);
                random = Hk.a().J;
                d3 = 0.0;
                d2 = 0.5;
                boolean bl = mr.k();
                d = 0.0;
                try {
                    if (!bl) break block2;
                    if (!this.q.g()) break block3;
                }
                catch (H h) {
                    throw mH.a(h);
                }
                d3 = random.nextGaussian() * 0.02;
            }
            d = random.nextGaussian() * 0.02;
        }
        Ls ls = new Ls(f, (char)n7, (rd)Hk.a(), (char)n6, lQ.ax, n5, lQ.e + (double)lQ.az, lQ.av, d3, d2, d, this.k.m(), this.n.k(), this.u.k(), this.s.g(), this.t.g(), n4);
        Hk.b().Q.b((Lh)ls);
    }

    private void lambda$new$0(ck ck2) {
        long l;
        long l2 = l = v ^ 0x4211A45AB747L;
        long l3 = l2 ^ 0x3CDC23F75C56L;
        int n = (int)(l3 >>> 32);
        int n2 = (int)(l3 << 32 >>> 48);
        int n3 = (int)(l3 << 48 >>> 48);
        long l4 = l2 ^ 0x12610937FDDCL;
        int n4 = (int)(l4 >>> 32);
        int n5 = (int)(l4 << 32 >>> 48);
        int n6 = (int)(l4 << 48 >>> 48);
        Iterator iterator = Hk.a().b.iterator();
        boolean bl = mr.k();
        while (iterator.hasNext()) {
            block21: {
                Integer n7;
                Integer n8;
                Map<Integer, Integer> map;
                int n9;
                block24: {
                    LM lM;
                    block25: {
                        LM lM2;
                        block22: {
                            block23: {
                                LQ lQ;
                                block20: {
                                    LQ lQ2 = (LQ)iterator.next();
                                    try {
                                        try {
                                            lQ = lQ2;
                                            if (!bl) break block20;
                                            if (!(lQ instanceof LM)) break block21;
                                        }
                                        catch (H h) {
                                            throw mH.a(h);
                                        }
                                        lQ = lQ2;
                                    }
                                    catch (H h) {
                                        throw mH.a(h);
                                    }
                                }
                                lM = (LM)lQ;
                                try {
                                    try {
                                        lM2 = lM;
                                        if (!bl) break block22;
                                        if (lM2 != Hk.j()) break block23;
                                    }
                                    catch (H h) {
                                        throw mH.a(h);
                                    }
                                    if (bl) continue;
                                }
                                catch (H h) {
                                    throw mH.a(h);
                                }
                            }
                            lM2 = lM;
                        }
                        LM lM3 = lM2;
                        n9 = (int)Math.ceil(Tz.a((int)n, (char)((char)n2), (LM)lM3, (char)((char)n3)));
                        try {
                            try {
                                map = this.o;
                                n8 = lM.O();
                                if (!bl) break block24;
                                if (!map.containsKey(n8)) break block25;
                            }
                            catch (H h) {
                                throw mH.a(h);
                            }
                            n7 = this.o.get(lM.O());
                            if (!bl) break block21;
                        }
                        catch (H h) {
                            throw mH.a(h);
                        }
                        int n10 = n7;
                        if (n10 != n9) {
                            int n11;
                            float f;
                            block28: {
                                block29: {
                                    block26: {
                                        int n12;
                                        block27: {
                                            n12 = n10 - n9;
                                            f = n12;
                                            try {
                                                n11 = this.m.g();
                                                if (!bl) break block26;
                                                if (n11 == 0) break block27;
                                            }
                                            catch (H h) {
                                                throw mH.a(h);
                                            }
                                            f = (float)n12 / 2.0f;
                                        }
                                        n11 = n12;
                                    }
                                    try {
                                        try {
                                            if (!bl) break block28;
                                            if (n11 <= 0) break block29;
                                        }
                                        catch (H h) {
                                            throw mH.a(h);
                                        }
                                        n11 = this.l.s().a();
                                        break block28;
                                    }
                                    catch (H h) {
                                        throw mH.a(h);
                                    }
                                }
                                n11 = this.r.s().a();
                            }
                            int n13 = n11;
                            this.a((LQ)lM, n4, n5, n6, f, n13);
                        }
                    }
                    map = this.o;
                    n8 = lM.O();
                }
                n7 = map.put(n8, n9);
            }
            if (bl) continue;
        }
    }




    static {
        block11: {
            block10: {
                mH.v = _c.a((long)-9827023069387605L, (long)-8286842372699387573L, MethodHandles.lookup().lookupClass()).a(34332702399647L);
                mH.y = new HashMap<K, V>(13);
                var0 = mH.v ^ 41726386773784L;
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
                var6_5 = "\u00cct`\u00884\u00b3\u0095s\u00b5\u00e16/\u00b0i\u00c9\u00e6 1\u00c1V\u00a4\u00b2\u00d9\u00b3bs\u00b1\u00bd\u0090\u00bb\u00f4\u0003\u00fa\u0085\u00e6$E<\u00b4\u00bf\u00a0\u0002\u00d2Z\u00cfk\u00d3\u00e6\u008a D\u00f9_\u0087\u00f6vn\u00fc\u00f0\u00ee\u001e\u00a1\u00d5\u00dc\u0083\u00dbQg\u0000D\u0002\u00849\u00b7\u00bc/\u00a6C\u0007\u00f3\u0010\u00d7 $\u0010\u00da\u00e4\u00a7\u008b[\u0007\u00a5*Z\u00cc\u00b5\u0017\u0006\u00a0\u001f\u0095Z\u00abli6i\u0080}7J\u00f4+\u001c<H\u008c\u00d1\u00a5\u0007\u00f0\u0092\u00b2\r\u00fb\u00a4\u0005\u001d4}\u0099u\u00b7\u00fe)R\u00a4\u00f7*\u007fN\u00f6.m-\u00af\u00e0\u00d3(o=\u0010zo\u00d7=\u00c8\u00d3\u0099\u0094WG\u00ab\u00a4t\u00e1\u009b\u00f1\u00dd\u00fa\u0082\u0002\u00a0.\u00c7H\u00cf\u00f2\u00c3Kw\u0083\u00b8\u00e2m`]\u00e2 \u0004\u00d4a\u00d3\u00ba\u00e9sW?\u00f5\u00e9\u00e9\u00a5\\=l\u0081\u00e4\u0090\u00ec\u00a4\u00a0\u000f\u00ed\u0086Rj\u0007\u00a8\u00fd\u001d\\04\u00b4_\u0091P.\u001d\u0014N\u00b2\u00ab\u00a0\u0093F\u00a3\u0099\u00b2~\u00b0\u00ae\u00f0\u00884\u0006\u0012\u00c4\u00d8i\\\u0084Y\u0018\u001cS\b0\u0083\u00e3V\u00de\u00a2\u00d6d\u0096\u00b8qO@ \u008bZ\u00e3\u00051)\u00d6\u00fa,AW<\u00ccU\u0097\u00ad\u00fb\u000f[\u009d\u00dba\u0004\u00b7\u00f4\u009aNfk&\u00ce\u00e0\u0010\u00bf\u0082\u0005o\u00c9\u00a9\"n\u00ce\u001e\u0013\u0019\u00bc&R]0}\u00e9\u00b6\u00b7\u001c\u00d1\u00ae1\u00b4K\u00a24\u00b3\u0099\u00d5YG\u00ed[Q\u00c0\u00d6)\u0018\u00cbHb\u00cc-\u00ac6SS\u0098\u00cb\u0002M\u008f1V\u00d4\u0097\u00f9\u00ce\u00f3\u00b0\u0015f(\u00a5\u001d\u0080\u0098]\u00edPBR\u00f0\u0017\u00d4R\u000b\u00db\u0005\u00bfM\u00bd\u009fP\u00b6\u00dc\u001a?\u00c1M\u00d9q\u0011\u00e0\u00b1\u00c1\u0019`W\u00b3`\u00c5\u0080\u0010\u0004\u00d9w\u00c5d\tk\u00f9Q\t\u0001m}X\u00eb>\u0010v\u001d\u00c3I\u001a\"\u00b7\u0014\u00be\u0089\u0080\u00e1(\u00a508 \u0010Z\u0099\u00ef\u00ffI\u00c4q`\u0086\u00ac\u00e3\u0015-\u009bX\u00a8\u00f5\u00be\u0015\u0087\u0014\u00e1\u00e5\u0003\u00bd]\u00b8\u001d\u00f2\u00f2\u001f\u0010)\u0098\u00d1\u00c9\u00f0\u00b6\u00fb\u00bc\u00e9q\u00e5(\u00d8\u00dd&?\u0010fqj\u0016\u00f1t\u00ee\u00bdqD\u0018Y\u00d6\u0081\u0081\\";
                var8_6 = "\u00cct`\u00884\u00b3\u0095s\u00b5\u00e16/\u00b0i\u00c9\u00e6 1\u00c1V\u00a4\u00b2\u00d9\u00b3bs\u00b1\u00bd\u0090\u00bb\u00f4\u0003\u00fa\u0085\u00e6$E<\u00b4\u00bf\u00a0\u0002\u00d2Z\u00cfk\u00d3\u00e6\u008a D\u00f9_\u0087\u00f6vn\u00fc\u00f0\u00ee\u001e\u00a1\u00d5\u00dc\u0083\u00dbQg\u0000D\u0002\u00849\u00b7\u00bc/\u00a6C\u0007\u00f3\u0010\u00d7 $\u0010\u00da\u00e4\u00a7\u008b[\u0007\u00a5*Z\u00cc\u00b5\u0017\u0006\u00a0\u001f\u0095Z\u00abli6i\u0080}7J\u00f4+\u001c<H\u008c\u00d1\u00a5\u0007\u00f0\u0092\u00b2\r\u00fb\u00a4\u0005\u001d4}\u0099u\u00b7\u00fe)R\u00a4\u00f7*\u007fN\u00f6.m-\u00af\u00e0\u00d3(o=\u0010zo\u00d7=\u00c8\u00d3\u0099\u0094WG\u00ab\u00a4t\u00e1\u009b\u00f1\u00dd\u00fa\u0082\u0002\u00a0.\u00c7H\u00cf\u00f2\u00c3Kw\u0083\u00b8\u00e2m`]\u00e2 \u0004\u00d4a\u00d3\u00ba\u00e9sW?\u00f5\u00e9\u00e9\u00a5\\=l\u0081\u00e4\u0090\u00ec\u00a4\u00a0\u000f\u00ed\u0086Rj\u0007\u00a8\u00fd\u001d\\04\u00b4_\u0091P.\u001d\u0014N\u00b2\u00ab\u00a0\u0093F\u00a3\u0099\u00b2~\u00b0\u00ae\u00f0\u00884\u0006\u0012\u00c4\u00d8i\\\u0084Y\u0018\u001cS\b0\u0083\u00e3V\u00de\u00a2\u00d6d\u0096\u00b8qO@ \u008bZ\u00e3\u00051)\u00d6\u00fa,AW<\u00ccU\u0097\u00ad\u00fb\u000f[\u009d\u00dba\u0004\u00b7\u00f4\u009aNfk&\u00ce\u00e0\u0010\u00bf\u0082\u0005o\u00c9\u00a9\"n\u00ce\u001e\u0013\u0019\u00bc&R]0}\u00e9\u00b6\u00b7\u001c\u00d1\u00ae1\u00b4K\u00a24\u00b3\u0099\u00d5YG\u00ed[Q\u00c0\u00d6)\u0018\u00cbHb\u00cc-\u00ac6SS\u0098\u00cb\u0002M\u008f1V\u00d4\u0097\u00f9\u00ce\u00f3\u00b0\u0015f(\u00a5\u001d\u0080\u0098]\u00edPBR\u00f0\u0017\u00d4R\u000b\u00db\u0005\u00bfM\u00bd\u009fP\u00b6\u00dc\u001a?\u00c1M\u00d9q\u0011\u00e0\u00b1\u00c1\u0019`W\u00b3`\u00c5\u0080\u0010\u0004\u00d9w\u00c5d\tk\u00f9Q\t\u0001m}X\u00eb>\u0010v\u001d\u00c3I\u001a\"\u00b7\u0014\u00be\u0089\u0080\u00e1(\u00a508 \u0010Z\u0099\u00ef\u00ffI\u00c4q`\u0086\u00ac\u00e3\u0015-\u009bX\u00a8\u00f5\u00be\u0015\u0087\u0014\u00e1\u00e5\u0003\u00bd]\u00b8\u001d\u00f2\u00f2\u001f\u0010)\u0098\u00d1\u00c9\u00f0\u00b6\u00fb\u00bc\u00e9q\u00e5(\u00d8\u00dd&?\u0010fqj\u0016\u00f1t\u00ee\u00bdqD\u0018Y\u00d6\u0081\u0081\\".length();
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
                    var9_3[var7_4++] = mH.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "p\u00efs\u00e8U\u00997\u00ba\u008bu\u0018\u00f7\u00ba\u00b0,T\u00d2l\u001f(X\u00bc|\u00e3\u0018\f\u00ddC\u0010\u0000[\u0000\u0097\u00b3\u0006\u00ddV\u00c0lwz\u00b8\u00e5T[\u0094\u00e6\u00f3Q";
                    var8_6 = "p\u00efs\u00e8U\u00997\u00ba\u008bu\u0018\u00f7\u00ba\u00b0,T\u00d2l\u001f(X\u00bc|\u00e3\u0018\f\u00ddC\u0010\u0000[\u0000\u0097\u00b3\u0006\u00ddV\u00c0lwz\u00b8\u00e5T[\u0094\u00e6\u00f3Q".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = mH.a(var10_9).intern();
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
        mH.w = var9_3;
        mH.x = new String[18];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5307;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mH", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            mH.x[n2] = mH.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mH.a(n, l);
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
            throw new RuntimeException("mH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
