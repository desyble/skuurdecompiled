public class Pd {
    private long c = 0L;
    private static int[] b;

    public boolean a(long l) {
        long l2;
        block2: {
            block3: {
                int[] nArray = Pd.b();
                try {
                    long l3 = this.d() - this.c - l;
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (nArray != null) break block2;
                    if (l2 < 0) break block3;
                }
                catch (H h) {
                    throw Pd.a(h);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    public boolean b(long l) {
        boolean bl;
        block4: {
            block5: {
                int[] nArray = Pd.b();
                try {
                    try {
                        bl = this.a(l);
                        if (nArray != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (H h) {
                        throw Pd.a(h);
                    }
                    this.e();
                    return true;
                }
                catch (H h) {
                    throw Pd.a(h);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void e() {
        this.c = this.d();
    }

    public long d() {
        return System.nanoTime() / 1000000L;
    }

    public long c() {
        return this.d() - this.c;
    }

    public void c(long l) {
        this.c = this.d() + l;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    private static H a(H h) {
        return h;
    }

    static {
        if (Pd.b() != null) {
            Pd.b(new int[2]);
        }
    }
}
