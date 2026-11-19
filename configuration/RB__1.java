public class RB {
    private String d;
    private String[] c;
    private static LQ[] b;

    public RB(String string, String ... stringArray) {
        block5: {
            this.d = string;
            this.c = stringArray;
            boolean bl = false;
            for (String string2 : stringArray) {
                if (!string.equalsIgnoreCase(string2)) continue;
                bl = true;
                break;
            }
            try {
                try {
                    if (bl || stringArray.length <= 0) break block5;
                }
                catch (H h) {
                    throw RB.a(h);
                }
                this.d = stringArray[0];
            }
            catch (H h) {
                throw RB.a(h);
            }
        }
    }

    public String f() {
        return this.d;
    }

    public void a(String string) {
        String[] stringArray = this.c;
        LQ[] lQArray = RB.d();
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            block5: {
                block6: {
                    String string2 = stringArray[n2];
                    try {
                        try {
                            if (lQArray == null) break block5;
                            if (!string.equalsIgnoreCase(string2)) break block6;
                        }
                        catch (H h) {
                            throw RB.a(h);
                        }
                        this.d = string2;
                        return;
                    }
                    catch (H h) {
                        throw RB.a(h);
                    }
                }
                ++n2;
            }
            if (lQArray != null) continue;
        }
    }

    public String[] a() {
        return this.c;
    }

    public void a(String[] stringArray) {
        this.c = stringArray;
    }

    public void e() {
        int n = this.c();
        int n2 = (n + 1) % this.c.length;
        this.d = this.c[n2];
    }

    public void b() {
        int n = this.c();
        try {
            if (n > 0) {
                this.d = this.c[n - 1];
            }
        }
        catch (H h) {
            throw RB.a(h);
        }
    }

    private int c() {
        int n;
        block5: {
            LQ[] lQArray = RB.d();
            for (int i = 0; i < this.c.length; ++i) {
                int n2;
                block6: {
                    try {
                        try {
                            n = this.c[i].equalsIgnoreCase(this.d) ? 1 : 0;
                            if (lQArray == null) break block5;
                            if (lQArray == null) break block6;
                        }
                        catch (H h) {
                            throw RB.a(h);
                        }
                        if (n == 0) continue;
                    }
                    catch (H h) {
                        throw RB.a(h);
                    }
                    n2 = i;
                }
                return n2;
            }
            n = 0;
        }
        return n;
    }

    public String toString() {
        return this.f();
    }

    public static void b(LQ[] lQArray) {
        b = lQArray;
    }

    public static LQ[] d() {
        return b;
    }

    private static H a(H h) {
        return h;
    }

    static {
        if (RB.d() == null) {
            RB.b(new LQ[4]);
        }
    }
}
