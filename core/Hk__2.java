import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Hk {
    private static final qE a;

    public static cD b() {
        return cD.C();
    }

    public static Kp d() {
        return Hk.b().R;
    }

    public static MI j() {
        return Hk.b().ab;
    }

    public static DB c() {
        return Hk.b().j;
    }

    public static qE g() {
        return a;
    }

    public static DB h() {
        return Hk.b().aT;
    }

    public static rT a() {
        return Hk.b().aq;
    }

    public static uA i() {
        return Hk.b().i;
    }

    public static g8 f() {
        return Hk.b().I();
    }

    public static List<LM> a(Predicate<LM> predicate) {
        ArrayList<LM> arrayList = new ArrayList<LM>();
        int[] nArray = Pd.b();
        for (LQ lQ : Hk.a().b) {
            block10: {
                LQ lQ2;
                block9: {
                    try {
                        try {
                            lQ2 = lQ;
                            if (nArray != null) break block9;
                            if (!(lQ2 instanceof LM)) break block10;
                        }
                        catch (H h) {
                            throw Hk.a(h);
                        }
                        lQ2 = lQ;
                    }
                    catch (H h) {
                        throw Hk.a(h);
                    }
                }
                LM lM = (LM)lQ2;
                try {
                    boolean bl;
                    try {
                        bl = predicate.test(lM);
                        if (nArray != null || !bl) break block10;
                    }
                    catch (H h) {
                        throw Hk.a(h);
                    }
                    bl = arrayList.add(lM);
                }
                catch (H h) {
                    throw Hk.a(h);
                }
            }
            if (nArray == null) continue;
        }
        return arrayList;
    }

    public static op e() {
        return Hk.b().H;
    }

    static {
        long l = _c.a((long)-221082877956824489L, (long)-4055720781146913381L, MethodHandles.lookup().lookupClass()).a(10496885067469L) ^ 0x7BF0A4B85620L;
        long l2 = l ^ 0x5D61537A2BDL;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 56);
        int n3 = (int)(l2 << 40 >>> 40);
        a = new qE(n, (byte)n2, n3);
    }

    private static H a(H h) {
        return h;
    }
}
