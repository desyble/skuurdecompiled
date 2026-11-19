import java.lang.reflect.Type;
import java.util.function.BooleanSupplier;

public class kt<E> {
    private final String b;
    private final String k;
    private final Type j;
    private final double i;
    private final double d;
    private final double c;
    private final String l;
    private BooleanSupplier a;
    private boolean g;
    private boolean h = false;
    private E e;
    private static int[] f;

    public kt(String string, E e) {
        this(string, e, "");
    }

    public kt(String string, E e, BooleanSupplier booleanSupplier) {
        this(string, e, "", booleanSupplier);
    }

    public kt(String string, BooleanSupplier booleanSupplier, kt<?> ... ktArray) {
        this.b = string;
        this.e = new wK(string, (kt[])ktArray);
        this.j = wK.class;
        this.k = "";
        this.a = booleanSupplier;
        this.i = 0.0;
        this.d = 0.0;
        this.c = 0.0;
        this.l = "";
    }

    public kt(String string, kt<?> ... ktArray) {
        this(string, kt::lambda$new$0, ktArray);
    }

    public kt(String string, BooleanSupplier booleanSupplier, kt<?> kt2) {
        this.b = string;
        this.e = new wK(string, new kt[]{kt2});
        this.j = wK.class;
        this.k = "";
        this.a = booleanSupplier;
        int[] nArray = kt.b();
        try {
            this.i = 0.0;
            this.d = 0.0;
            this.c = 0.0;
            this.l = "";
            if (LQ.J() != null) {
                kt.b(new int[1]);
            }
        }
        catch (H h) {
            throw kt.a(h);
        }
    }

    public kt(String string, kt<?> kt2) {
        this(string, kt::lambda$new$1, kt2);
    }

    public kt(String string, E e, String string2) {
        this(string, e, string2, kt::lambda$new$2);
    }

    public kt(String string, E e, String string2, BooleanSupplier booleanSupplier) {
        this.b = string;
        this.e = e;
        this.j = e.getClass().getGenericSuperclass();
        this.k = string2;
        this.a = booleanSupplier;
        this.l = "";
        if (e instanceof Number) {
            this.i = 0.5;
            this.d = 1.0;
            this.c = 20.0;
        } else {
            this.i = 0.0;
            this.d = 0.0;
            this.c = 0.0;
        }
    }

    public kt(String string, E e, String string2, boolean bl, BooleanSupplier booleanSupplier) {
        this(string, e, string2, booleanSupplier);
        this.g = bl;
    }

    public kt(String string, E e, String string2, double d, double d2, double d3) {
        this(string, e, string2, d, d2, d3, "", kt::lambda$new$4);
    }

    public kt(String string, E e, String string2, double d, double d2, double d3, BooleanSupplier booleanSupplier) {
        this(string, e, string2, d, d2, d3, "", booleanSupplier);
    }

    public kt(String string, E e, String string2, double d, double d2, double d3, String string3) {
        this(string, e, string2, d, d2, d3, string3, kt::lambda$new$5);
    }

    public kt(String string, E e, String string2, double d, double d2, double d3, String string3, BooleanSupplier booleanSupplier) {
        this.b = string;
        this.e = e;
        this.j = e.getClass().getGenericSuperclass();
        this.k = string2;
        this.i = d;
        this.d = d2;
        this.c = d3;
        this.l = string3;
        this.a = booleanSupplier;
    }

    public kt(String string, int n, int n2, int n3, int n4, String string2) {
        this(string, n, n2, n3, n4, false, string2, kt::lambda$new$6);
    }

    public kt(String string, int n, int n2, int n3, boolean bl, String string2) {
        this(string, n, n2, n3, 255, bl, string2, kt::lambda$new$7);
    }

    public kt(String string, int n, int n2, int n3, boolean bl, String string2, BooleanSupplier booleanSupplier) {
        this(string, n, n2, n3, 255, bl, string2, booleanSupplier);
    }

    public kt(String string, int n, int n2, int n3, int n4, String string2, BooleanSupplier booleanSupplier) {
        this(string, n, n2, n3, n4, false, string2, booleanSupplier);
    }

    public kt(String string, int n, int n2, int n3, int n4, boolean bl, String string2, BooleanSupplier booleanSupplier) {
        this.b = string;
        this.e = new Kh(n, n2, n3, n4);
        int[] nArray = kt.b();
        try {
            this.j = Kh.class;
            this.k = string2;
            this.a = booleanSupplier;
            this.i = 0.0;
            this.d = 0.0;
            this.c = 0.0;
            this.l = "";
            this.h = bl;
            if (nArray != null) {
                LQ.b((LQ[])new LQ[2]);
            }
        }
        catch (H h) {
            throw kt.a(h);
        }
    }

    public void a(E e) {
        this.e = e;
    }

    public E i() {
        return this.e;
    }

    public boolean g() {
        return (Boolean)this.e;
    }

    public wK c() {
        block5: {
            E e;
            block4: {
                int[] nArray = kt.b();
                try {
                    try {
                        e = this.e;
                        if (nArray != null) break block4;
                        if (!(e instanceof wK)) break block5;
                    }
                    catch (H h) {
                        throw kt.a(h);
                    }
                    e = this.e;
                }
                catch (H h) {
                    throw kt.a(h);
                }
            }
            return (wK)e;
        }
        return null;
    }

    public int m() {
        return ((Number)this.e).intValue();
    }

    public float k() {
        return ((Number)this.e).floatValue();
    }

    public double f() {
        return ((Number)this.e).doubleValue();
    }

    public String q() {
        E e;
        block4: {
            block5: {
                int[] nArray = kt.b();
                try {
                    try {
                        e = this.e;
                        if (nArray != null) break block4;
                        if (!(e instanceof RB)) break block5;
                    }
                    catch (H h) {
                        throw kt.a(h);
                    }
                    return ((RB)this.e).f();
                }
                catch (H h) {
                    throw kt.a(h);
                }
            }
            e = this.e;
        }
        return (String)e;
    }

    public Kh s() {
        return (Kh)this.e;
    }

    public String r() {
        return this.b;
    }

    public String p() {
        return this.k;
    }

    public String o() {
        return this.r().replace("-", " ");
    }

    public double n() {
        return this.i;
    }

    public double d() {
        return this.d;
    }

    public double t() {
        return this.c;
    }

    public String h() {
        String string;
        block6: {
            kt kt2;
            block4: {
                block5: {
                    int[] nArray = kt.b();
                    try {
                        try {
                            kt2 = this;
                            if (nArray != null) break block4;
                            if (kt2.l != null) break block5;
                        }
                        catch (H h) {
                            throw kt.a(h);
                        }
                        string = "";
                        break block6;
                    }
                    catch (H h) {
                        throw kt.a(h);
                    }
                }
                kt2 = this;
            }
            string = kt2.l;
        }
        return string;
    }

    public boolean j() {
        return this.a.getAsBoolean();
    }

    public boolean e() {
        return this.g;
    }

    public boolean l() {
        return this.h;
    }

    public void a(BooleanSupplier booleanSupplier) {
        BooleanSupplier booleanSupplier2 = this.a;
        this.a = () -> kt.lambda$addVisibilityCondition$8(booleanSupplier2, booleanSupplier);
    }

    private static boolean lambda$addVisibilityCondition$8(BooleanSupplier booleanSupplier, BooleanSupplier booleanSupplier2) {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    nArray = kt.b();
                    try {
                        try {
                            bl = booleanSupplier.getAsBoolean();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw kt.a(h);
                        }
                        bl = booleanSupplier2.getAsBoolean();
                    }
                    catch (H h) {
                        throw kt.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw kt.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private static boolean lambda$new$7() {
        return true;
    }

    private static boolean lambda$new$6() {
        return true;
    }

    private static boolean lambda$new$5() {
        return true;
    }

    private static boolean lambda$new$4() {
        return true;
    }

    private static boolean lambda$new$3() {
        return true;
    }

    private static boolean lambda$new$2() {
        return true;
    }

    private static boolean lambda$new$1() {
        return true;
    }

    private static boolean lambda$new$0() {
        return true;
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    public static int[] b() {
        return f;
    }

    private static H a(H h) {
        return h;
    }

    static {
        if (kt.b() != null) {
            kt.b(new int[2]);
        }
    }
}
