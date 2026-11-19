import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class wK {
    private final String b;
    private final List<kt<?>> a;

    public wK(String string, kt<?> ... ktArray) {
        this.b = string;
        this.a = new ArrayList(Arrays.asList(ktArray));
    }

    public String b() {
        return this.b;
    }

    public List<kt<?>> a() {
        return this.a;
    }

    public kt<?> a(String string) {
        Iterator<kt<?>> iterator = this.a.iterator();
        LQ[] lQArray = RB.d();
        while (iterator.hasNext()) {
            block6: {
                kt<?> kt2;
                block5: {
                    kt<?> kt3 = iterator.next();
                    try {
                        try {
                            kt2 = kt3;
                            if (lQArray == null) break block5;
                            if (!kt2.r().equalsIgnoreCase(string)) break block6;
                        }
                        catch (H h) {
                            throw wK.a(h);
                        }
                        kt2 = kt3;
                    }
                    catch (H h) {
                        throw wK.a(h);
                    }
                }
                return kt2;
            }
            if (lQArray != null) continue;
        }
        return null;
    }

    private static H a(H h) {
        return h;
    }
}
