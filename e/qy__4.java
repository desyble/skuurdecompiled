import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class qy<Event>
implements qO<Event> {
    private final Map<Type, List<yz<Event>>> d = new HashMap<Type, List<yz<Event>>>();
    private final Map<Type, List<R8<Event>>> a = new HashMap<Type, List<R8<Event>>>();
    private static final MethodHandles.Lookup c = MethodHandles.lookup();
    private static boolean b;

    public void c(Object object) {
        for (Field field : object.getClass().getDeclaredFields()) {
            A a = field.getAnnotation(A.class);
            if (a == null) continue;
            Type type = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
            }
            catch (Throwable throwable) {
                throw qy.a(throwable);
            }
            try {
                List<Object> list;
                R8 r8 = (R8)c.unreflectGetter(field).invokeWithArguments(object);
                byte by = a.value();
                yz yz2 = new yz(object, r8, by);
                if (this.d.containsKey(type)) {
                    list = this.d.get(type);
                    list.add(yz2);
                    list.sort(Comparator.comparingInt(qy::lambda$subscribe$0));
                    continue;
                }
                list = new ArrayList(1);
                list.add(yz2);
                this.d.put(type, list);
            }
            catch (Throwable throwable) {

            }
        }
        this.d();
    }

    private void d() {
        Map<Type, List<yz<Event>>> map = this.d;
        Map<Type, List<R8<Event>>> map2 = this.a;
        for (Type type : map.keySet()) {
            List<yz<Event>> list = map.get(type);
            int n = list.size();
            ArrayList<R8> arrayList = new ArrayList<R8>(n);
            try {
                for (int i = 0; i < n; ++i) {
                    arrayList.add(yz.c(list.get(i)));
                }
            }
            catch (H h) {
                throw qy.a(h);
            }
            map2.put(type, arrayList);
        }
    }

    public void a(Object object) {
        block9: {
            boolean bl;
            block11: {
                block10: {
                    boolean bl2;
                    block8: {
                        Iterator<List<yz<Event>>> iterator = this.d.values().iterator();
                        bl2 = qy.b();
                        while (iterator.hasNext()) {
                            List<yz<Event>> list = iterator.next();
                            try {
                                list.removeIf(arg_0 -> qy.lambda$unsubscribe$1(object, arg_0));
                                if (!bl2) {
                                    if (!bl2) continue;
                                    break;
                                }
                                break block8;
                            }
                            catch (H h) {
                                throw qy.a(h);
                            }
                        }
                        this.d();
                    }
                    try {
                        try {
                            if (LQ.J() == null) break block9;
                            if (!bl2) break block10;
                        }
                        catch (H h) {
                            throw qy.a(h);
                        }
                        bl = false;
                        break block11;
                    }
                    catch (H h) {
                        throw qy.a(h);
                    }
                }
                bl = true;
            }
            qy.b(bl);
        }
    }

    public void b(Event Event) {
        List list = this.a.getOrDefault(Event.getClass(), Collections.emptyList());
        boolean bl = qy.b();
        int n = list.size();
        while (n > 0) {
            ((R8)list.get(--n)).a(Event);
            if (!bl) continue;
            LQ.b((LQ[])new LQ[5]);
            break;
        }
    }

    private static boolean lambda$unsubscribe$1(Object object, yz yz2) {
        boolean bl;
        try {
            bl = yz.a((yz)yz2) == object;
        }
        catch (H h) {
            throw qy.a(h);
        }
        return bl;
    }

    private static int lambda$subscribe$0(yz yz2) {
        return yz.b((yz)yz2);
    }

    static {
        qy.b(false);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static boolean c() {
        boolean bl = qy.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (H h) {
            throw qy.a(h);
        }
        return false;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }
}
