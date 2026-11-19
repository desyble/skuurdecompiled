import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class qd<E> {
    private final List<E> a;
    private E[] d;
    private final Class<E> f;
    private boolean b = true;
    private final Map<Class<?>, E> e = new HashMap();
    private static String[] c;

    public qd(Class<E> clazz, int n) {
        this.f = clazz;
        this.a = new ArrayList(n > 0 ? n : 16);
        this.d = (Object[])Array.newInstance(clazz, 0);
    }

    public abstract void d(char var1, int var2, int var3);

    public void a(E e) {
        block2: {
            E e2;
            block3: {
                String[] stringArray = qd.b();
                try {
                    e2 = e;
                    if (stringArray == null) break block2;
                    if (e2 != null) break block3;
                }
                catch (H h) {
                    throw qd.a(h);
                }
                return;
            }
            this.a.add(e);
            e2 = this.e.put(e.getClass(), e);
        }
        this.b = true;
    }

    public E[] c() {
        qd qd2;
        block4: {
            block5: {
                String[] stringArray = qd.b();
                try {
                    try {
                        qd2 = this;
                        if (stringArray == null) break block4;
                        if (!qd2.b) break block5;
                    }
                    catch (H h) {
                        throw qd.a(h);
                    }
                    this.d = this.a.toArray((Object[])Array.newInstance(this.f, this.a.size()));
                    this.b = false;
                }
                catch (H h) {
                    throw qd.a(h);
                }
            }
            qd2 = this;
        }
        return qd2.d;
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    public static String[] b() {
        return c;
    }

    private static H a(H h) {
        return h;
    }

    static {
        if (qd.b() == null) {
            qd.b(new String[1]);
        }
    }
}
