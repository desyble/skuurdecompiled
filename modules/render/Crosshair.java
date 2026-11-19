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

public class mS
extends lh {
    private final kt<Kh> p;
    private final kt<Number> q;
    private final kt<Number> m;
    private final kt<Number> n;
    private final kt<Boolean> l;
    private final kt<Boolean> o;
    @A(value=0)
    public final R8<v7> k;
    private static final long r;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;

    public mS(int n, int n2, char c, EU eU) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ r;
        super(eU);
        this.p = new kt((String)((Object)mS.a("i", (int)10537, (long)(0x630CBEDCFDEAD26DL ^ l))), 255, 255, 255, 255, (String)((Object)mS.a("i", (int)28188, (long)(0x14852068F6BF155AL ^ l))));
        this.q = new kt((String)((Object)mS.a("i", (int)4478, (long)(0x3281E4A1AD426A37L ^ l))), (Object)7, (String)((Object)mS.a("i", (int)10743, (long)(0x29F72A9ADC99D2B9L ^ l))), 0.01, 0.2, 15.0);
        this.m = new kt((String)((Object)mS.a("i", (int)8534, (long)(0x5ED029C6BB235A1CL ^ l))), (Object)3, (String)((Object)mS.a("i", (int)535, (long)(0x1B407A99AED37950L ^ l))), 0.01, 0.2, 15.0);
        this.n = new kt((String)((Object)mS.a("i", (int)32023, (long)(0xE44120F95DE065BL ^ l))), (Object)0.35, (String)((Object)mS.a("i", (int)17235, (long)(0x7A308659DD853818L ^ l))), 0.01, 0.25, 3.0);
        this.l = new kt((String)((Object)mS.a("i", (int)6831, (long)(0x5EBB159BA51F61EAL ^ l))), (Object)false, (String)((Object)mS.a("i", (int)31328, (long)(0x66734D33203A0128L ^ l))));
        this.o = new kt((String)((Object)mS.a("i", (int)20311, (long)(0x524ADA1E967F3418L ^ l))), (Object)false, (String)((Object)mS.a("i", (int)28156, (long)(0x4552E510CB8896B1L ^ l))));
        this.k = this::lambda$new$0;
        this.a(new kt[]{this.p, this.q, this.m, this.n, this.l, this.o});
    }

    public boolean a() {
        boolean bl;
        block22: {
            block19: {
                block23: {
                    boolean bl2;
                    block21: {
                        block20: {
                            block18: {
                                bl2 = mr.e();
                                try {
                                    try {
                                        bl = (Boolean)this.l.i();
                                        if (bl2) break block18;
                                        if (!bl) break block19;
                                    }
                                    catch (H h) {
                                        throw mS.a(h);
                                    }
                                    bl = Hk.j().K;
                                }
                                catch (H h) {
                                    throw mS.a(h);
                                }
                            }
                            try {
                                try {
                                    if (bl2) break block20;
                                    if (bl) break block19;
                                }
                                catch (H h) {
                                    throw mS.a(h);
                                }
                                bl = Hk.j().aD();
                            }
                            catch (H h) {
                                throw mS.a(h);
                            }
                        }
                        try {
                            try {
                                if (bl2) break block21;
                                if (bl) break block19;
                            }
                            catch (H h) {
                                throw mS.a(h);
                            }
                            float f = Hk.j().cQ.c - 0.0f;
                            bl = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                        }
                        catch (H h) {
                            throw mS.a(h);
                        }
                    }
                    try {
                        try {
                            try {
                                if (bl2) break block22;
                                if (bl) break block23;
                            }
                            catch (H h) {
                                throw mS.a(h);
                            }
                            float f = Hk.j().cQ.b - 0.0f;
                            bl = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                            if (bl2) break block22;
                        }
                        catch (H h) {
                            throw mS.a(h);
                        }
                        if (!bl) break block19;
                    }
                    catch (H h) {
                        throw mS.a(h);
                    }
                }
                bl = true;
                break block22;
            }
            bl = false;
        }
        return bl;
    }

    private void lambda$new$0(v7 v72) {
        block37: {
            int n;
            K8 k8;
            block36: {
                int n2;
                float f;
                double d;
                double d2;
                boolean bl;
                block34: {
                    block35: {
                        int n3;
                        float f2;
                        block32: {
                            block33: {
                                int n4;
                                float f3;
                                double d3;
                                double d4;
                                block30: {
                                    block31: {
                                        int n5;
                                        float f4;
                                        block28: {
                                            block29: {
                                                int n6;
                                                double d5;
                                                double d6;
                                                double d7;
                                                double d8;
                                                block26: {
                                                    block27: {
                                                        int n7;
                                                        double d9;
                                                        block24: {
                                                            block25: {
                                                                int n8;
                                                                double d10;
                                                                double d11;
                                                                double d12;
                                                                double d13;
                                                                block22: {
                                                                    block23: {
                                                                        int n9;
                                                                        double d14;
                                                                        block20: {
                                                                            block21: {
                                                                                k8 = v72.c();
                                                                                bl = mr.k();
                                                                                try {
                                                                                    d13 = (float)k8.a() / 2.0f - this.n.k();
                                                                                    d14 = (double)((float)k8.c() / 2.0f) - 0.5 - (double)this.m.k() - (double)this.q.k();
                                                                                    n9 = this.a();
                                                                                    if (!bl) break block20;
                                                                                    if (n9 == 0) break block21;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw mS.a(h);
                                                                                }
                                                                                n9 = 2;
                                                                                break block20;
                                                                            }
                                                                            n9 = 0;
                                                                        }
                                                                        try {
                                                                            d12 = d14 - (double)n9;
                                                                            d11 = (float)k8.a() / 2.0f + 1.0f + this.n.k();
                                                                            d10 = (double)((float)k8.c() / 2.0f) - 0.5 - (double)this.m.k();
                                                                            n8 = this.a();
                                                                            if (!bl) break block22;
                                                                            if (n8 == 0) break block23;
                                                                        }
                                                                        catch (H h) {
                                                                            throw mS.a(h);
                                                                        }
                                                                        n8 = 2;
                                                                        break block22;
                                                                    }
                                                                    n8 = 0;
                                                                }
                                                                try {
                                                                    cp.b((double)d13, (double)d12, (double)d11, (double)(d10 - (double)n8), (double)0.5, (int)this.p.s().a(), (int)r_.a((int)0));
                                                                    d8 = (float)k8.a() / 2.0f - this.n.k();
                                                                    d9 = (double)((float)k8.c() / 2.0f) + 0.5 + (double)this.m.k();
                                                                    n7 = this.a();
                                                                    if (!bl) break block24;
                                                                    if (n7 == 0) break block25;
                                                                }
                                                                catch (H h) {
                                                                    throw mS.a(h);
                                                                }
                                                                n7 = 2;
                                                                break block24;
                                                            }
                                                            n7 = 0;
                                                        }
                                                        try {
                                                            d7 = d9 + (double)n7 - 0.15;
                                                            d6 = (float)k8.a() / 2.0f + 1.0f + this.n.k();
                                                            d5 = (double)((float)k8.c() / 2.0f) + 0.5 + (double)this.m.k() + (double)this.q.k();
                                                            n6 = this.a();
                                                            if (!bl) break block26;
                                                            if (n6 == 0) break block27;
                                                        }
                                                        catch (H h) {
                                                            throw mS.a(h);
                                                        }
                                                        n6 = 2;
                                                        break block26;
                                                    }
                                                    n6 = 0;
                                                }
                                                try {
                                                    cp.b((double)d8, (double)d7, (double)d6, (double)(d5 + (double)n6 - 0.15), (double)0.5, (int)this.p.s().a(), (int)r_.a((int)0));
                                                    f4 = (float)k8.a() / 2.0f - this.m.k() - this.q.k();
                                                    n5 = this.a();
                                                    if (!bl) break block28;
                                                    if (n5 == 0) break block29;
                                                }
                                                catch (H h) {
                                                    throw mS.a(h);
                                                }
                                                n5 = 2;
                                                break block28;
                                            }
                                            n5 = 0;
                                        }
                                        try {
                                            d4 = (double)(f4 - (float)n5) + 0.15;
                                            d3 = (double)((float)k8.c() / 2.0f - this.n.k()) - 0.5;
                                            f3 = (float)k8.a() / 2.0f - this.m.k();
                                            n4 = this.a();
                                            if (!bl) break block30;
                                            if (n4 == 0) break block31;
                                        }
                                        catch (H h) {
                                            throw mS.a(h);
                                        }
                                        n4 = 2;
                                        break block30;
                                    }
                                    n4 = 0;
                                }
                                try {
                                    cp.b((double)d4, (double)d3, (double)((double)(f3 - (float)n4) + 0.15), (double)((float)k8.c() / 2.0f + 0.5f + this.n.k()), (double)0.5, (int)this.p.s().a(), (int)r_.a((int)0));
                                    f2 = (float)k8.a() / 2.0f + 1.0f + this.m.k();
                                    n3 = this.a();
                                    if (!bl) break block32;
                                    if (n3 == 0) break block33;
                                }
                                catch (H h) {
                                    throw mS.a(h);
                                }
                                n3 = 2;
                                break block32;
                            }
                            n3 = 0;
                        }
                        try {
                            d2 = f2 + (float)n3;
                            d = (double)((float)k8.c() / 2.0f - this.n.k()) - 0.5;
                            f = (float)k8.a() / 2.0f + this.q.k() + this.m.k() + 1.0f;
                            n2 = this.a();
                            if (!bl) break block34;
                            if (n2 == 0) break block35;
                        }
                        catch (H h) {
                            throw mS.a(h);
                        }
                        n2 = 2;
                        break block34;
                    }
                    n2 = 0;
                }
                try {
                    try {
                        cp.b((double)d2, (double)d, (double)(f + (float)n2), (double)((double)((float)k8.c() / 2.0f) + 0.5 + (double)this.n.k()), (double)0.5, (int)this.p.s().a(), (int)r_.a((int)0));
                        n = ((Boolean)this.o.i()).booleanValue();
                        if (!bl) break block36;
                        if (n == 0) break block37;
                    }
                    catch (H h) {
                        throw mS.a(h);
                    }
                    n = k8.a();
                }
                catch (H h) {
                    throw mS.a(h);
                }
            }
            cp.b((double)((double)((float)n / 2.0f) - 0.5), (double)((float)k8.c() / 2.0f - 1.0f), (double)((double)((float)k8.a() / 2.0f + 1.0f) + 0.5), (double)((float)k8.c() / 2.0f + 1.0f), (double)0.5, (int)this.p.s().a(), (int)r_.a((int)0));
        }
    }




    static {
        block11: {
            block10: {
                mS.r = _c.a((long)8408710196126248714L, (long)-6106035947439382247L, MethodHandles.lookup().lookupClass()).a(171519856397609L);
                mS.u = new HashMap<K, V>(13);
                var0 = mS.r ^ 44834025703824L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00e1\u0018\u001dv\u000b\\\u00ad$\u00c4\u00ea\u00db\u0084\u001f\u0092N\u00008y\u00a7rK\u00bb\u0083\u0014\u009d\u0004.7\u00f7\u00b1*\u00bd\u00ba4B+0\t\u00c8\u00beR\u00a7aS\u00a0`\u0080,\u0010i\u000fQ\u00e9\u00fa\u00b18\u00f5\u0091\u00b1\u001b\u008f\u00ca\u0090,nR\u00e2\u00cd\u0086\u008b5\u00b0\u00c2(\u00cf%\u00b2\u00b3o\u00fe\u00e2&\u0098\u00b8\u00b9\b\u00a8\t\u00fc-\u00c1H\u0002\u00fb\u0005\u00e3\u0092\u00e1\u00a1\u009e\u00eeQ\u00e9\\L\u0088\u00c3\u0084\u00e4\u00d0M\u0018\u00d40\u0010\u0085\u00de>c\u00cab\u00c7\u00c6\u00f2}\u00dd\r\u0080%\u00ce@(\u00b50\u00b6G\u00f1v\u00a8\u00d8w\rrGV\u00d6\u00f1\u00c7\u00cc\u0084\u00abc|\u0090\u00ea\\ \u00b8\u00fb\u00fd\u00d5\u001a\u0095\u00f4\u00e4\u00fe\u00987\u00df\u00bb~\u00d0\u0010r\u00e88\u008b\u0011\u00b0\u00d4\u00bdIb\u00c4a\u00fd4dF\u0010\u00f3\u0080.\u00c1\f\u00f5\u0080\u00fe\u00ad=\u001c\u00b0\u00d53`I(\u00a9\u0003\u00b9\u009b\u00ae\u00a5zR#'f\u00c6\u00d0\u00d7Drq\u0017\r\u00c1\u0000V\u00c3\u00fa\u008e_R\u00a3\u000e\n4\u00e0ag\u0087\u001aK\u00af\u009b\u00e2\u0010\u0099\u00d8\u00d9a/\u00b1V\u0005\u00ed\u00f0}\u0014\u0087\u00a8ie\u0010\u0088!\rq*x\u00b4>\u00f6\u00ea3\u0095\u00fa,\u00df\u00ca";
                var8_6 = "\u00e1\u0018\u001dv\u000b\\\u00ad$\u00c4\u00ea\u00db\u0084\u001f\u0092N\u00008y\u00a7rK\u00bb\u0083\u0014\u009d\u0004.7\u00f7\u00b1*\u00bd\u00ba4B+0\t\u00c8\u00beR\u00a7aS\u00a0`\u0080,\u0010i\u000fQ\u00e9\u00fa\u00b18\u00f5\u0091\u00b1\u001b\u008f\u00ca\u0090,nR\u00e2\u00cd\u0086\u008b5\u00b0\u00c2(\u00cf%\u00b2\u00b3o\u00fe\u00e2&\u0098\u00b8\u00b9\b\u00a8\t\u00fc-\u00c1H\u0002\u00fb\u0005\u00e3\u0092\u00e1\u00a1\u009e\u00eeQ\u00e9\\L\u0088\u00c3\u0084\u00e4\u00d0M\u0018\u00d40\u0010\u0085\u00de>c\u00cab\u00c7\u00c6\u00f2}\u00dd\r\u0080%\u00ce@(\u00b50\u00b6G\u00f1v\u00a8\u00d8w\rrGV\u00d6\u00f1\u00c7\u00cc\u0084\u00abc|\u0090\u00ea\\ \u00b8\u00fb\u00fd\u00d5\u001a\u0095\u00f4\u00e4\u00fe\u00987\u00df\u00bb~\u00d0\u0010r\u00e88\u008b\u0011\u00b0\u00d4\u00bdIb\u00c4a\u00fd4dF\u0010\u00f3\u0080.\u00c1\f\u00f5\u0080\u00fe\u00ad=\u001c\u00b0\u00d53`I(\u00a9\u0003\u00b9\u009b\u00ae\u00a5zR#'f\u00c6\u00d0\u00d7Drq\u0017\r\u00c1\u0000V\u00c3\u00fa\u008e_R\u00a3\u000e\n4\u00e0ag\u0087\u001aK\u00af\u009b\u00e2\u0010\u0099\u00d8\u00d9a/\u00b1V\u0005\u00ed\u00f0}\u0014\u0087\u00a8ie\u0010\u0088!\rq*x\u00b4>\u00f6\u00ea3\u0095\u00fa,\u00df\u00ca".length();
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
                    var9_3[var7_4++] = mS.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "6C\u0093h\u001a\u008e\u0019p\u001a:\u00c6\u00f8\u00e0a\u00ca\u00a7\"\u00d6\u00902\u00e2Z:O\u00ec.\u00fe\u00c9}\u00fac\u00ad\u00e7\b 8NW\u00a2\u00cf(\u0096G\u0080\u0084mE\u00ea_\u00f6A\u0005\u00d4\u00a9\u00f2S\u00b5\neaix\u000b\n\u0094\u00ce\u00a0\u00d1\u00ee'\u008aA&lst\u00c8\u001c\u0086\u0003\u00ed";
                    var8_6 = "6C\u0093h\u001a\u008e\u0019p\u001a:\u00c6\u00f8\u00e0a\u00ca\u00a7\"\u00d6\u00902\u00e2Z:O\u00ec.\u00fe\u00c9}\u00fac\u00ad\u00e7\b 8NW\u00a2\u00cf(\u0096G\u0080\u0084mE\u00ea_\u00f6A\u0005\u00d4\u00a9\u00f2S\u00b5\neaix\u000b\n\u0094\u00ce\u00a0\u00d1\u00ee'\u008aA&lst\u00c8\u001c\u0086\u0003\u00ed".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = mS.a(var10_9).intern();
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
        mS.s = var9_3;
        mS.t = new String[12];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7132;
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
                throw new RuntimeException("mS", exception);
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
            mS.t[n2] = mS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mS.a(n, l);
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
            throw new RuntimeException("mS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
