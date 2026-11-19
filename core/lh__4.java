import java.lang.invoke.MethodHandles;




public abstract class lh
implements Rx {
    protected final EU a;
    protected final Uk h;
    public Ak e;
    private String f;
    private boolean b;
    private int g;
    private boolean j;
    public qT<lh> c;
    public qy<R_> i;
    private static int[] d;
    private static final long bb;

    public lh(EU eU) {
        int[] nArray = lh.b();
        int[] nArray2 = nArray;
        try {
            this.h = new Uk();
            this.e = new Ak(0.0, 0.0);
            this.c = tf.m();
            this.i = tf.l().g();
            this.a = eU;
            if (nArray2 == null) {
                LQ.b((LQ[])new LQ[1]);
            }
        }
        catch (H h) {
            throw lh.b(h);
        }
    }





    public void c(short var1_1, int var2_2, int var3_3) {
        block17: {
            block14: {
                block15: {
                    block12: {
                        block13: {
                            v0 = var4_4 = (long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var3_3 << 48 >>> 48;
                            v1 = v0 ^ 111074440580948L;
                            var6_5 = (int)(v1 >>> 32);
                            var7_6 = (int)(v1 << 32 >>> 48);
                            var8_7 = (int)(v1 << 48 >>> 48);
                            v2 = v0 ^ 13771731683682L;
                            var9_8 = (int)(v2 >>> 48);
                            var10_9 = v2 << 16 >>> 16;
                            var12_10 = lh.b();
                            try {
                                v3 = this;
                                v4 = this.b;
                                if (var12_10 == null) break block12;
                                if (v4 != '\u0000') break block13;
                            }
                            catch (H v5) {
                                throw lh.b(v5);
                            }
                            v4 = '\u0001';
                            break block12;
                        }
                        v4 = '\u0000';
                    }
                    try {
                        block16: {
                            try {
                                try {
                                    if (var2_2 < 0) break block14;
                                    v3.b = v4;
                                    v3 = this;
                                    if (var12_10 == null) break block15;
                                    if (!v3.b) break block16;
                                }
                                catch (H v6) {
                                    throw lh.b(v6);
                                }
                                this.i.c((Object)this);
                                this.d(var6_5, var7_6, var8_7);
                                if (var3_3 > 0) {
                                    if (var12_10 != null) break block17;
                                }
                                ** GOTO lbl58
                            }
                            catch (H v7) {
                                throw lh.b(v7);
                            }
                        }
                        this.i.a((Object)this);
                        v3 = this;
                    }
                    catch (H v8) {
                        throw lh.b(v8);
                    }
                }
                v4 = (char)var9_8;
            }
            v3.a(v4, var10_9);
        }
        try {
            this.e();
lbl58:


            if (var1_1 >= 0 && LQ.J() != null) {
                lh.b(new int[1]);
            }
        }
        catch (H v9) {
            throw lh.b(v9);
        }
    }

    public void e() {
    }

    public void d(int n, int n2, int n3) {
    }

    public void a(char c, long l) {
    }

    public void a(kt<?> kt2) {
        String string;
        Uk uk;
        block4: {
            block5: {
                int[] nArray = lh.b();
                try {
                    try {
                        uk = this.h;
                        string = kt2.r();
                        if (nArray == null) break block4;
                        if (!uk.containsKey((Object)string)) break block5;
                    }
                    catch (H h) {
                        throw lh.b(h);
                    }
                    return;
                }
                catch (H h) {
                    throw lh.b(h);
                }
            }
            uk = this.h;
            string = kt2.r();
        }
        uk.put((Object)string, kt2);
    }

    public void a(kt<?> ... ktArray) {
        kt<?>[] ktArray2 = ktArray;
        int n = ktArray2.length;
        int[] nArray = lh.b();
        for (int i = 0; i < n; ++i) {
            kt<?> kt2 = ktArray2[i];
            this.a(kt2);
            if (nArray != null) continue;
        }
    }

    public kt<?> a(String string) {
        return (kt)this.h.get((Object)string);
    }

    public String a() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }

    public int c() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
    }

    public boolean d() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public Uk g() {
        return this.h;
    }

    public String f() {
        return this.a.b;
    }

    public String h() {
        return this.a.d;
    }

    public ta e() {
        return this.a.c;
    }

    public boolean b() {
        return this.b;
    }

    public void b(boolean bl, int n, short s, int n2) {
        block5: {
            lh lh2;
            int n3;
            int n4;
            int n5;
            block4: {
                long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ bb;
                long l2 = l ^ 0x5754058E6ED7L;
                n5 = (int)(l2 >>> 48);
                n4 = (int)(l2 << 16 >>> 32);
                n3 = (int)(l2 << 48 >>> 48);
                int[] nArray = lh.b();
                try {
                    try {
                        lh2 = this;
                        if (nArray == null) break block4;
                        if (lh2.b == bl) break block5;
                    }
                    catch (H h) {
                        throw lh.b(h);
                    }
                    lh2 = this;
                }
                catch (H h) {
                    throw lh.b(h);
                }
            }
            lh2.c((short)n5, n4, n3);
        }
    }

    public static void b(int[] nArray) {
        d = nArray;
    }

    public static int[] b() {
        return d;
    }

    static {
        bb = _c.a((long)7644902849091558422L, (long)3939426257301951225L, MethodHandles.lookup().lookupClass()).a(21723007313128L);
        if (lh.b() == null) {
            lh.b(new int[2]);
        }
    }

    private static H b(H h) {
        return h;
    }
}
