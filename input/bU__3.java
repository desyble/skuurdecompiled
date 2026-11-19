import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bU
implements Comparable<bU> {
    private static final List<bU> h;
    private static final qb<bU> g;
    private static final Set<String> i;
    private final String e;
    private final int b;
    private final String c;
    private int f;
    private boolean a;
    private int d;
    private static final long j;

    public static void a(int n) {
        block4: {
            int n2 = uA.c();
            if (n != 0) {
                bU bU2;
                block3: {
                    bU bU3 = (bU)g.e(n);
                    try {
                        bU2 = bU3;
                        if (n2 == 0) break block3;
                        if (bU2 == null) break block4;
                    }
                    catch (H h) {
                        throw bU.a(h);
                    }
                    bU2 = bU3;
                }
                ++bU2.d;
            }
        }
    }

    public static void a(int n, boolean bl) {
        block4: {
            int n2 = uA.b();
            if (n != 0) {
                block3: {
                    bU bU2;
                    bU bU3 = (bU)g.e(n);
                    try {
                        bU2 = bU3;
                        if (n2 != 0) break block3;
                        if (bU2 == null) break block4;
                    }
                    catch (H h) {
                        throw bU.a(h);
                    }
                    bU2 = bU3;
                }
                bU2.a = bl;
            }
        }
    }

    public static void e() {
        Iterator<bU> iterator = h.iterator();
        int n = uA.b();
        while (iterator.hasNext()) {
            bU bU2 = iterator.next();
            bU2.j();
            if (n == 0) continue;
        }
    }

    public static void h() {
        int n = uA.b();
        g.a();
        int n2 = n;
        for (bU bU2 : h) {
            g.a(bU2.f, (Object)bU2);
            if (n2 == 0) continue;
        }
    }

    public static Set<String> f() {
        return i;
    }

    public bU(String string, int n, String string2) {
        this.e = string;
        this.f = n;
        this.b = n;
        this.c = string2;
        h.add(this);
        g.a(n, (Object)this);
        i.add(string2);
    }

    public boolean i() {
        return this.a;
    }

    public String g() {
        return this.c;
    }

    public boolean c() {
        int n;
        block4: {
            block5: {
                int n2 = uA.b();
                try {
                    try {
                        n = this.d--;
                        if (n2 != 0) break block4;
                        if (n != 0) break block5;
                    }
                    catch (H h) {
                        throw bU.a(h);
                    }
                    return false;
                }
                catch (H h) {
                    throw bU.a(h);
                }
            }
            n = 1;
        }
        return n != 0;
    }

    private void j() {
        this.d = 0;
        this.a = false;
    }

    public String a() {
        return this.e;
    }

    public int b() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public void b(int n) {
        this.f = n;
    }

    public int a(bU bU2) {
        int n;
        block2: {
            int n2;
            block3: {
                long l = j ^ 0x7940BE598296L;
                long l2 = l ^ 0x7F9C70B70954L;
                int n3 = (int)(l2 >>> 48);
                int n4 = (int)(l2 << 16 >>> 32);
                int n5 = (int)(l2 << 48 >>> 48);
                n2 = EG.a((char)((char)n3), (int)n4, (String)this.c, (short)((short)n5), (Object[])new Object[0]).compareTo(EG.a((char)((char)n3), (int)n4, (String)bU2.c, (short)((short)n5), (Object[])new Object[0]));
                int n6 = uA.b();
                try {
                    n = n2;
                    if (n6 != 0) break block2;
                    if (n != 0) break block3;
                }
                catch (H h) {
                    throw bU.a(h);
                }
                n2 = EG.a((char)((char)n3), (int)n4, (String)this.e, (short)((short)n5), (Object[])new Object[0]).compareTo(EG.a((char)((char)n3), (int)n4, (String)bU2.e, (short)((short)n5), (Object[])new Object[0]));
            }
            n = n2;
        }
        return n;
    }

    static {
        j = _c.a((long)7851851023482412858L, (long)2704557365600876564L, MethodHandles.lookup().lookupClass()).a(201005452419171L);
        h = Lists.newArrayList();
        g = new qb();
        i = Sets.newHashSet();
    }

    private static H a(H h) {
        return h;
    }
}
