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

public class m6
extends lh {
    public boolean s;
    private bz q;
    int p;
    private final kt<Boolean> l;
    @A
    public final R8<v7> m;
    @A
    public final R8<b7> o;
    @A(value=2)
    public final R8<b5> n;
    @A
    public final R8<cn> k;
    private static String[] r;
    private static final long t;
    private static final String[] u;
    private static final String[] v;
    private static final Map w;

    public m6(int n, int n2, EU eU) {
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ t;
        super(eU);
        this.q = null;
        this.l = new kt((String)((Object)m6.a("y", (int)25624, (long)(0x1C874D5C9B7232A7L ^ l))), (Object)false, (String)((Object)m6.a("y", (int)1009, (long)(0x592CE959DF47554FL ^ l))));
        this.m = this::lambda$new$0;
        this.o = this::lambda$new$1;
        this.n = this::lambda$new$2;
        this.k = this::lambda$new$3;
        this.a(new kt[]{this.l});
    }

    public void d(int n, int n2, int n3) {
        block4: {
            block5: {
                String[] stringArray = m6.a();
                try {
                    try {
                        if (stringArray != null) break block4;
                        if (Hk.j() != null) break block5;
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                    return;
                }
                catch (H h) {
                    throw m6.a(h);
                }
            }
            this.q = null;
            this.p = Hk.j().bU.g;
        }
    }

    public void a(char c, long l) {
        block7: {
            block8: {
                m6 m62;
                block9: {
                    String[] stringArray = m6.a();
                    try {
                        if (l >= 0L && Hk.j() == null) {
                            return;
                        }
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                    try {
                        try {
                            if (c < '\u0000') break block7;
                            m62 = this;
                            if (stringArray != null) break block8;
                            if (!m62.s) break block9;
                        }
                        catch (H h) {
                            throw m6.a(h);
                        }
                        Hk.j().ay = 0.0;
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                }
                Hk.j().bU.g = this.p;
                Hk.b().af.aa = -1;
                m62 = this;
            }
            m62.q = null;
        }
    }





    private void b(long l, char c, bz bz2) {
        uC uC2;
        int n;
        int n2;
        int n3;
        int n4;
        long l2;
        block8: {
            long l3;
            long l4 = l3 = (l << 16 | (long)c << 48 >>> 48) ^ t;
            long l5 = l4 ^ 0x74D45EF8A40L;
            l2 = l5 >>> 8;
            n4 = (int)(l5 << 56 >>> 56);
            long l6 = l4 ^ 0x17D5B8B5B0C5L;
            n3 = (int)(l6 >>> 32);
            n2 = (int)(l6 << 32 >>> 32);
            n = this.d();
            String[] stringArray = m6.a();
            try {
                if (n == -1) {
                    return;
                }
            }
            catch (H h) {
                throw m6.a(h);
            }
            uC uC3 = Hk.j().a(4.5, 1.0f);
            try {
                uC2 = uC3;
                if (c < '\u0000' || stringArray != null) break block8;
                if (uC2 == null) return;
            }
            catch (H h) {
                throw m6.a(h);
            }
            uC2 = uC3;
        }
        try {
            if (uC2.d != Rt.BLOCK) {
                return;
            }
        }
        catch (H h) {
            throw m6.a(h);
        }
        qP qP2 = Hk.j().bU.c(n);
        Hk.j().bU.g = n;
        Hk.b().af.aa = 999999999;
        Hk.b().R.a(l2, (byte)n4, Hk.j(), Hk.a(), qP2, bz2.b, bz2.a, m6.a(bz2.b, bz2.a));
        Hk.j().G(n3, n2);
    }

    public D0 a(char c, xc xc2, int n, short s) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ t;
        long l2 = l ^ 0x1A50A00E1CE4L;
        long l3 = l2 >>> 16;
        int n2 = (int)(l2 << 48 >>> 48);
        return Hk.a().b(xc2, l3, (short)n2);
    }

    private void a(bz bz2) {
        bz bz3;
        block2: {
            block3: {
                String[] stringArray = m6.a();
                try {
                    bz3 = bz2;
                    if (stringArray != null) break block2;
                    if (bz3 != null) break block3;
                }
                catch (H h) {
                    throw m6.a(h);
                }
                return;
            }
            bz3 = bz2;
        }
        eA eA2 = m6.a(bz3.b, bz2.a);
        float[] fArray = jI.b((eA)eA2);
        dL.a((float[])fArray, (double)180.0);
    }

    private static eA a(xc xc2, qu qu2) {
        double d = (double)xc2.c() + 0.5;
        double d2 = (double)xc2.a() + 0.5;
        double d3 = (double)xc2.b() + 0.5;
        return new eA(d += (double)qu2.b() * 0.5, d2 += (double)qu2.k() * 0.5, d3 += (double)qu2.g() * 0.5);
    }

    public A6 c(xc xc2) {
        long l = t ^ 0x30913E5AEF5EL;
        long l2 = l ^ 0x49C2D16817FAL;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        return this.a((char)n, xc2, n2, (short)n3).a();
    }

    public ey b(xc xc2) {
        return this.c(xc2).g();
    }

    protected void a(int n, int n2) {
        Hk.b().R.a(Hk.j().b8.d, n, n2, 2, (M2)Hk.j());
    }

    private boolean c() {
        boolean bl;
        block13: {
            String[] stringArray = m6.a();
            for (int i = 36; i < 45; ++i) {
                boolean bl2;
                block15: {
                    block14: {
                        try {
                            try {
                                try {
                                    bl = Hk.j().b8.c(i).c();
                                    if (stringArray != null) break block13;
                                    if (stringArray != null) break block14;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                                if (!bl) continue;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                            bl2 = m6.a(Hk.j().b8.c(i).d());
                        }
                        catch (H h) {
                            throw m6.a(h);
                        }
                    }
                    try {
                        block16: {
                            try {
                                try {
                                    if (stringArray != null) break block15;
                                    if (bl2) break block16;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                                if (stringArray == null) continue;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                        }
                        bl2 = false;
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                }
                return bl2;
            }
            bl = true;
        }
        return bl;
    }

    private boolean a(A6 a6) {
        boolean bl;
        block10: {
            block11: {
                int n;
                block12: {
                    block14: {
                        block13: {
                            String[] stringArray = m6.a();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = a6.g().j();
                                                if (stringArray != null) break block10;
                                                if (!bl) break block11;
                                            }
                                            catch (H h) {
                                                throw m6.a(h);
                                            }
                                            n = a6 instanceof CX;
                                            if (stringArray != null) break block12;
                                        }
                                        catch (H h) {
                                            throw m6.a(h);
                                        }
                                        if (n == 0) break block13;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                    double d = a6.q() - 0.125;
                                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                    if (stringArray != null) break block12;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                                if (n > 0) break block14;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                        }
                        n = 1;
                        break block12;
                    }
                    n = 0;
                }
                return n != 0;
            }
            bl = false;
        }
        return bl;
    }

    private int d() {
        int n = 36;
        String[] stringArray = m6.a();
        while (n < 45) {
            block19: {
                block20: {
                    int n2;
                    block23: {
                        block22: {
                            qP qP2;
                            block21: {
                                qP2 = Hk.j().b8.c(n).d();
                                try {
                                    try {
                                        try {
                                            try {
                                                if (stringArray != null) break block19;
                                                if (qP2 == null) break block20;
                                            }
                                            catch (H h) {
                                                throw m6.a(h);
                                            }
                                            n2 = qP2.v() instanceof aF;
                                            if (stringArray != null) break block21;
                                        }
                                        catch (H h) {
                                            throw m6.a(h);
                                        }
                                        if (n2 == 0) break block20;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                    n2 = qP2.f;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                            }
                            try {
                                try {
                                    if (stringArray != null) break block22;
                                    if (n2 <= 0) break block20;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                                n2 = m6.a(qP2) ? 1 : 0;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                        }
                        try {
                            block24: {
                                try {
                                    try {
                                        if (stringArray != null) break block23;
                                        if (n2 != 0) break block24;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                    if (stringArray == null) break block20;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                            }
                            n2 = n - 36;
                        }
                        catch (H h) {
                            throw m6.a(h);
                        }
                    }
                    return n2;
                }
                ++n;
            }
            if (stringArray == null) continue;
        }
        return -1;
    }

    private bz d(xc xc2) {
        bz bz2;
        block54: {
            bz bz3;
            block55: {
                String[] stringArray;
                block52: {
                    block53: {
                        block50: {
                            block51: {
                                block48: {
                                    int n;
                                    long l;
                                    block46: {
                                        bz bz4;
                                        block45: {
                                            block43: {
                                                block44: {
                                                    block41: {
                                                        block42: {
                                                            block39: {
                                                                block40: {
                                                                    block37: {
                                                                        block38: {
                                                                            long l2 = t ^ 0x3942B313FF03L;
                                                                            long l3 = l2 ^ 0x77B55EE40217L;
                                                                            l = l3 >>> 16;
                                                                            n = (int)(l3 << 48 >>> 48);
                                                                            bz3 = this.a(xc2, l, (short)n, 0, -1, 0, qu.UP);
                                                                            stringArray = m6.a();
                                                                            try {
                                                                                try {
                                                                                    bz4 = bz3;
                                                                                    if (stringArray != null) break block37;
                                                                                    if (bz4 == null) break block38;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw m6.a(h);
                                                                                }
                                                                                return bz3;
                                                                            }
                                                                            catch (H h) {
                                                                                throw m6.a(h);
                                                                            }
                                                                        }
                                                                        bz4 = bz3 = this.a(xc2, l, (short)n, -1, 0, 0, qu.EAST);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (stringArray != null) break block39;
                                                                            if (bz4 == null) break block40;
                                                                        }
                                                                        catch (H h) {
                                                                            throw m6.a(h);
                                                                        }
                                                                        return bz3;
                                                                    }
                                                                    catch (H h) {
                                                                        throw m6.a(h);
                                                                    }
                                                                }
                                                                bz4 = bz3 = this.a(xc2, l, (short)n, 1, 0, 0, qu.WEST);
                                                            }
                                                            try {
                                                                try {
                                                                    if (stringArray != null) break block41;
                                                                    if (bz4 == null) break block42;
                                                                }
                                                                catch (H h) {
                                                                    throw m6.a(h);
                                                                }
                                                                return bz3;
                                                            }
                                                            catch (H h) {
                                                                throw m6.a(h);
                                                            }
                                                        }
                                                        bz4 = bz3 = this.a(xc2, l, (short)n, 0, 0, -1, qu.SOUTH);
                                                    }
                                                    try {
                                                        try {
                                                            if (stringArray != null) break block43;
                                                            if (bz4 == null) break block44;
                                                        }
                                                        catch (H h) {
                                                            throw m6.a(h);
                                                        }
                                                        return bz3;
                                                    }
                                                    catch (H h) {
                                                        throw m6.a(h);
                                                    }
                                                }
                                                bz4 = bz3 = this.a(xc2, l, (short)n, 0, 0, 1, qu.NORTH);
                                            }
                                            try {
                                                if (stringArray != null) break block45;
                                                if (bz4 == null) break block46;
                                            }
                                            catch (H h) {
                                                throw m6.a(h);
                                            }
                                            bz4 = bz3;
                                        }
                                        return bz4;
                                    }
                                    int n2 = 2;
                                    while (n2 <= 4) {
                                        block47: {
                                            block49: {
                                                bz3 = this.a(xc2, l, (short)n, 0, -n2, 0, qu.UP);
                                                try {
                                                    try {
                                                        try {
                                                            if (stringArray != null) break block47;
                                                            bz2 = bz3;
                                                            if (stringArray != null) break block48;
                                                        }
                                                        catch (H h) {
                                                            throw m6.a(h);
                                                        }
                                                        if (bz2 == null) break block49;
                                                    }
                                                    catch (H h) {
                                                        throw m6.a(h);
                                                    }
                                                    return bz3;
                                                }
                                                catch (H h) {
                                                    throw m6.a(h);
                                                }
                                            }
                                            ++n2;
                                        }
                                        if (stringArray == null) continue;
                                    }
                                    bz2 = bz3 = this.a(xc2, -1, 0);
                                }
                                try {
                                    try {
                                        if (stringArray != null) break block50;
                                        if (bz2 == null) break block51;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                    return bz3;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                            }
                            bz2 = bz3 = this.a(xc2, 1, 0);
                        }
                        try {
                            try {
                                if (stringArray != null) break block52;
                                if (bz2 == null) break block53;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                            return bz3;
                        }
                        catch (H h) {
                            throw m6.a(h);
                        }
                    }
                    bz2 = bz3 = this.a(xc2, 0, -1);
                }
                try {
                    try {
                        if (stringArray != null) break block54;
                        if (bz2 == null) break block55;
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                    return bz3;
                }
                catch (H h) {
                    throw m6.a(h);
                }
            }
            bz2 = bz3 = this.a(xc2, 0, 1);
        }
        return bz2;
    }

    private bz a(xc xc2, long l, short s, int n, int n2, int n3, qu qu2) {
        long l2;
        long l3 = l2 = (l << 16 | (long)s << 48 >>> 48) ^ t;
        long l4 = l3 ^ 0x2DF4A2CB1954L;
        long l5 = l4 >>> 16;
        int n4 = (int)(l4 << 48 >>> 48);
        long l6 = l3 ^ 0xB8D887B4ACFL;
        int n5 = (int)(l6 >>> 56);
        int n6 = (int)(l6 << 8 >>> 32);
        int n7 = (int)(l6 << 40 >>> 40);
        xc xc3 = xc2.a(n, n2, n3);
        A6 a6 = Hk.a().b(xc3, l5, (short)n4).a();
        try {
            if (!a6.g((rd)Hk.a(), (byte)n5, n6, n7, xc3)) {
                return new bz(xc3, qu2);
            }
        }
        catch (H h) {
            throw m6.a(h);
        }
        return null;
    }

    private bz a(xc xc2, int n, int n2) {
        bz bz2;
        block16: {
            bz bz3;
            xc xc3;
            int n3;
            long l;
            block17: {
                String[] stringArray;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                long l2 = t ^ 0x4129090011EAL;
                                long l3 = l2 ^ 0xFDEE4F7ECFEL;
                                l = l3 >>> 16;
                                n3 = (int)(l3 << 48 >>> 48);
                                xc3 = xc2.a(n, 0, n2);
                                stringArray = m6.a();
                                bz3 = this.a(xc3, l, (short)n3, -1, 0, 0, qu.EAST);
                                try {
                                    try {
                                        bz2 = bz3;
                                        if (stringArray != null) break block12;
                                        if (bz2 == null) break block13;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                    return bz3;
                                }
                                catch (H h) {
                                    throw m6.a(h);
                                }
                            }
                            bz2 = bz3 = this.a(xc3, l, (short)n3, 1, 0, 0, qu.WEST);
                        }
                        try {
                            try {
                                if (stringArray != null) break block14;
                                if (bz2 == null) break block15;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                            return bz3;
                        }
                        catch (H h) {
                            throw m6.a(h);
                        }
                    }
                    bz2 = bz3 = this.a(xc3, l, (short)n3, 0, 0, -1, qu.SOUTH);
                }
                try {
                    try {
                        if (stringArray != null) break block16;
                        if (bz2 == null) break block17;
                    }
                    catch (H h) {
                        throw m6.a(h);
                    }
                    return bz3;
                }
                catch (H h) {
                    throw m6.a(h);
                }
            }
            bz2 = bz3 = this.a(xc3, l, (short)n3, 0, 0, 1, qu.NORTH);
        }
        return bz2;
    }

    private static boolean a(qP qP2) {
        return cf.e((qP)qP2);
    }

    private int e() {
        int n;
        block16: {
            int n2 = 0;
            String[] stringArray = m6.a();
            int n3 = 0;
            while (n3 < 45) {
                block19: {
                    block18: {
                        int n4;
                        block20: {
                            yP yP2;
                            block15: {
                                block17: {
                                    try {
                                        try {
                                            yP2 = Hk.j().b8.c(n3);
                                            if (stringArray != null) break block15;
                                            n = yP2.c() ? 1 : 0;
                                            if (stringArray != null) break block16;
                                        }
                                        catch (H h) {
                                            throw m6.a(h);
                                        }
                                        if (n != 0) break block17;
                                        break block18;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                }
                                yP2 = Hk.j().b8.c(n3);
                            }
                            qP qP2 = yP2.d();
                            try {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (stringArray != null) break block19;
                                                    if (qP2.f <= 0) break block18;
                                                }
                                                catch (H h) {
                                                    throw m6.a(h);
                                                }
                                                n4 = m6.a(qP2);
                                                if (stringArray != null) break block20;
                                            }
                                            catch (H h) {
                                                throw m6.a(h);
                                            }
                                            if (n4 != 0) break block21;
                                        }
                                        catch (H h) {
                                            throw m6.a(h);
                                        }
                                        if (stringArray == null) break block18;
                                    }
                                    catch (H h) {
                                        throw m6.a(h);
                                    }
                                }
                                n4 = n2 + qP2.f;
                            }
                            catch (H h) {
                                throw m6.a(h);
                            }
                        }
                        n2 = n4;
                    }
                    ++n3;
                }
                if (stringArray == null) continue;
            }
            n = n2;
        }
        return n;
    }





    private void lambda$new$3(cn var1_1) {
        block218: {
            block215: {
                block217: {
                    block216: {
                        block209: {
                            block210: {
                                block211: {
                                    block214: {
                                        block212: {
                                            block213: {
                                                block208: {
                                                    block203: {
                                                        block206: {
                                                            block207: {
                                                                block205: {
                                                                    block204: {
                                                                        block202: {
                                                                            block198: {
                                                                                block199: {
                                                                                    block201: {
                                                                                        block200: {
                                                                                            block193: {
                                                                                                block194: {
                                                                                                    block192: {
                                                                                                        block191: {
                                                                                                            block190: {
                                                                                                                block189: {
                                                                                                                    block187: {
                                                                                                                        block188: {
                                                                                                                            block185: {
                                                                                                                                block186: {
                                                                                                                                    block176: {
                                                                                                                                        block178: {
                                                                                                                                            block184: {
                                                                                                                                                block182: {
                                                                                                                                                    block180: {
                                                                                                                                                        block179: {
                                                                                                                                                            block177: {
                                                                                                                                                                block174: {
                                                                                                                                                                    block175: {
                                                                                                                                                                        block173: {
                                                                                                                                                                            block172: {
                                                                                                                                                                                block170: {
                                                                                                                                                                                    block171: {
                                                                                                                                                                                        v0 = var2_2 = m6.t ^ 56754158105771L;
                                                                                                                                                                                        v1 = v0 ^ 2563560472670L;
                                                                                                                                                                                        var4_3 = v1 >>> 16;
                                                                                                                                                                                        var6_4 = (int)(v1 << 48 >>> 48);
                                                                                                                                                                                        v2 = v0 ^ 51801133778866L;
                                                                                                                                                                                        var7_5 = v2 >>> 8;
                                                                                                                                                                                        var9_6 = (int)(v2 << 56 >>> 56);
                                                                                                                                                                                        v3 = v0 ^ 8040300906844L;
                                                                                                                                                                                        var10_7 = v3 >>> 16;
                                                                                                                                                                                        var12_8 = (int)(v3 << 48 >>> 48);
                                                                                                                                                                                        var13_9 = m6.a();
                                                                                                                                                                                        try {
                                                                                                                                                                                            if (var1_1.b()) {
                                                                                                                                                                                                return;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (H v4) {
                                                                                                                                                                                            throw m6.a(v4);
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            v5 = Hk.j();
                                                                                                                                                                                            if (var13_9 != null) break block170;
                                                                                                                                                                                            if (v5 != null) break block171;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (H v6) {
                                                                                                                                                                                            throw m6.a(v6);
                                                                                                                                                                                        }
                                                                                                                                                                                        return;
                                                                                                                                                                                    }
                                                                                                                                                                                    v5 = Hk.j();
                                                                                                                                                                                }
                                                                                                                                                                                var14_10 = v5.ax;
                                                                                                                                                                                var16_11 = Hk.j().av;
                                                                                                                                                                                try {
                                                                                                                                                                                    if (var13_9 != null) break block172;
                                                                                                                                                                                    if (!this.a(Hk.a().b(new xc(Hk.j().ax, Hk.j().e - 1.0, Hk.j().av), var4_3, (short)var6_4).a())) break block173;
                                                                                                                                                                                }
                                                                                                                                                                                catch (H v7) {
                                                                                                                                                                                    throw m6.a(v7);
                                                                                                                                                                                }
                                                                                                                                                                                var14_10 = Hk.j().ax;
                                                                                                                                                                            }
                                                                                                                                                                            var16_11 = Hk.j().av;
                                                                                                                                                                        }
                                                                                                                                                                        var18_12 = Hk.j().e - (double)((int)Hk.j().e);
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        v8 = Hk.j().e;
                                                                                                                                                                                        v9 = Hk.i().ah.c();
                                                                                                                                                                                        if (var13_9 != null) break block174;
                                                                                                                                                                                        if (v9 == 0) break block175;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (H v10) {
                                                                                                                                                                                        throw m6.a(v10);
                                                                                                                                                                                    }
                                                                                                                                                                                    v9 = Hk.j().al;
                                                                                                                                                                                    if (var13_9 != null) break block174;
                                                                                                                                                                                }
                                                                                                                                                                                catch (H v11) {
                                                                                                                                                                                    throw m6.a(v11);
                                                                                                                                                                                }
                                                                                                                                                                                if (v9 == 0) break block175;
                                                                                                                                                                            }
                                                                                                                                                                            catch (H v12) {
                                                                                                                                                                                throw m6.a(v12);
                                                                                                                                                                            }
                                                                                                                                                                            v13 = 1.2;
                                                                                                                                                                            break block176;
                                                                                                                                                                        }
                                                                                                                                                                        catch (H v14) {
                                                                                                                                                                            throw m6.a(v14);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v9 = tf.m().b(lx.class);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (var13_9 != null) break block177;
                                                                                                                                                                    if (v9 == 0) break block178;
                                                                                                                                                                }
                                                                                                                                                                catch (H v15) {
                                                                                                                                                                    throw m6.a(v15);
                                                                                                                                                                }
                                                                                                                                                                v9 = tB.c();
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (var13_9 != null) break block179;
                                                                                                                                                                    if (v9 == 0) break block178;
                                                                                                                                                                }
                                                                                                                                                                catch (H v16) {
                                                                                                                                                                    throw m6.a(v16);
                                                                                                                                                                }
                                                                                                                                                                cfr_temp_0 = var18_12 - 0.24919;
                                                                                                                                                                v9 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                                                                            }
                                                                                                                                                            catch (H v17) {
                                                                                                                                                                throw m6.a(v17);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            block181: {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    if (var13_9 != null) break block180;
                                                                                                                                                                                    if (v9 >= 0) break block181;
                                                                                                                                                                                }
                                                                                                                                                                                catch (H v18) {
                                                                                                                                                                                    throw m6.a(v18);
                                                                                                                                                                                }
                                                                                                                                                                                cfr_temp_1 = var18_12 - 0.105;
                                                                                                                                                                                v9 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                                                                                                                if (var13_9 != null) break block182;
                                                                                                                                                                            }
                                                                                                                                                                            catch (H v19) {
                                                                                                                                                                                throw m6.a(v19);
                                                                                                                                                                            }
                                                                                                                                                                            if (v9 <= 0) {
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl200
                                                                                                                                                                        }
                                                                                                                                                                        catch (H v20) {
                                                                                                                                                                            throw m6.a(v20);
                                                                                                                                                                        }
                                                                                                                                                                        cfr_temp_2 = Rf.a((double)var18_12, (int)4) - 0.0993;
                                                                                                                                                                        v9 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                                                                                                        if (var13_9 != null) break block182;
                                                                                                                                                                    }
                                                                                                                                                                    catch (H v21) {
                                                                                                                                                                        throw m6.a(v21);
                                                                                                                                                                    }
                                                                                                                                                                    if (v9 != 0) {
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl200
                                                                                                                                                                }
                                                                                                                                                                catch (H v22) {
                                                                                                                                                                    throw m6.a(v22);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v9 = (cfr_temp_3 = Rf.a((double)var18_12, (int)4) - 0.0013) == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                                                                                                                        }
                                                                                                                                                        catch (H v23) {
                                                                                                                                                            throw m6.a(v23);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            block183: {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            if (var13_9 != null) break block182;
                                                                                                                                                                                                            if (v9 == 0) break block183;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (H v24) {
                                                                                                                                                                                                            throw m6.a(v24);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        cfr_temp_4 = Rf.a((double)var18_12, (int)4) - 0.0156;
                                                                                                                                                                                                        v9 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                                                                                                                        if (var13_9 != null) break block182;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (H v25) {
                                                                                                                                                                                                        throw m6.a(v25);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (v9 == 0) break block183;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (H v26) {
                                                                                                                                                                                                    throw m6.a(v26);
                                                                                                                                                                                                }
                                                                                                                                                                                                cfr_temp_5 = Rf.a((double)var18_12, (int)4) - 0.0479;
                                                                                                                                                                                                v9 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                                                                                                                                                if (var13_9 != null) break block182;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (H v27) {
                                                                                                                                                                                                throw m6.a(v27);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (v9 == 0) break block183;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (H v28) {
                                                                                                                                                                                            throw m6.a(v28);
                                                                                                                                                                                        }
                                                                                                                                                                                        cfr_temp_6 = Rf.a((double)var18_12, (int)4) - 0.01553;
                                                                                                                                                                                        v9 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                                                                                                                                                        if (var13_9 != null) break block182;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (H v29) {
                                                                                                                                                                                        throw m6.a(v29);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v9 == 0) break block183;
                                                                                                                                                                                }
                                                                                                                                                                                catch (H v30) {
                                                                                                                                                                                    throw m6.a(v30);
                                                                                                                                                                                }
                                                                                                                                                                                cfr_temp_7 = Rf.a((double)var18_12, (int)4) - 0.0902;
                                                                                                                                                                                v9 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                                                                                                                                                                if (var13_9 != null) break block182;
                                                                                                                                                                            }
                                                                                                                                                                            catch (H v31) {
                                                                                                                                                                                throw m6.a(v31);
                                                                                                                                                                            }
                                                                                                                                                                            if (v9 == 0) break block183;
                                                                                                                                                                        }
                                                                                                                                                                        catch (H v32) {
                                                                                                                                                                            throw m6.a(v32);
                                                                                                                                                                        }
                                                                                                                                                                        v13 = Rf.a((double)var18_12, (int)4);
                                                                                                                                                                        if (var13_9 != null) break block176;
                                                                                                                                                                    }
                                                                                                                                                                    catch (H v33) {
                                                                                                                                                                        throw m6.a(v33);
                                                                                                                                                                    }
                                                                                                                                                                    if (v13 != 0.2734) break block184;
                                                                                                                                                                }
                                                                                                                                                                catch (H v34) {
                                                                                                                                                                    throw m6.a(v34);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v13 = Math.abs(Hk.j().ay);
                                                                                                                                                            if (var13_9 != null) break block176;
                                                                                                                                                        }
                                                                                                                                                        catch (H v35) {
                                                                                                                                                            throw m6.a(v35);
                                                                                                                                                        }
                                                                                                                                                        cfr_temp_8 = v13 - 0.45;
                                                                                                                                                        v9 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 < 0.0 ? -1 : 1);
                                                                                                                                                    }
                                                                                                                                                    catch (H v36) {
                                                                                                                                                        throw m6.a(v36);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (v9 >= 0) break block184;
                                                                                                                                                    v13 = 1.25;
                                                                                                                                                    break block176;
                                                                                                                                                }
                                                                                                                                                catch (H v37) {
                                                                                                                                                    throw m6.a(v37);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v13 = 1.0;
                                                                                                                                            break block176;
                                                                                                                                        }
                                                                                                                                        v13 = 0.8;
                                                                                                                                    }
                                                                                                                                    var20_13 = v8 - v13;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        cfr_temp_9 = var18_12 - 0.27;
                                                                                                                                                        v38 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                                                                                                                                        if (var13_9 != null) break block185;
                                                                                                                                                        if (v38 <= 0) break block186;
                                                                                                                                                    }
                                                                                                                                                    catch (H v39) {
                                                                                                                                                        throw m6.a(v39);
                                                                                                                                                    }
                                                                                                                                                    cfr_temp_10 = Hk.j().ay - 0.01;
                                                                                                                                                    v38 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 < 0.0 ? -1 : 1);
                                                                                                                                                    if (var13_9 != null) break block185;
                                                                                                                                                }
                                                                                                                                                catch (H v40) {
                                                                                                                                                    throw m6.a(v40);
                                                                                                                                                }
                                                                                                                                                if (v38 >= 0) break block186;
                                                                                                                                            }
                                                                                                                                            catch (H v41) {
                                                                                                                                                throw m6.a(v41);
                                                                                                                                            }
                                                                                                                                            cfr_temp_11 = var18_12 - 0.42;
                                                                                                                                            v38 = cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 < 0.0 ? -1 : 1);
                                                                                                                                            if (var13_9 != null) break block185;
                                                                                                                                        }
                                                                                                                                        catch (H v42) {
                                                                                                                                            throw m6.a(v42);
                                                                                                                                        }
                                                                                                                                        if (v38 >= 0) break block186;
                                                                                                                                    }
                                                                                                                                    catch (H v43) {
                                                                                                                                        throw m6.a(v43);
                                                                                                                                    }
                                                                                                                                    var20_13 -= 0.5;
                                                                                                                                }
                                                                                                                                v38 = (cfr_temp_12 = Rf.a((double)var18_12, (int)4) - 0.005) == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (var13_9 != null) break block187;
                                                                                                                                if (v38 != false) break block188;
                                                                                                                            }
                                                                                                                            catch (H v44) {
                                                                                                                                throw m6.a(v44);
                                                                                                                            }
                                                                                                                            var20_13 = 0.8;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v45 = Rf.a((double)var18_12, (int)4);
                                                                                                                            v46 = 0.1662;
                                                                                                                            if (var13_9 != null) break block189;
                                                                                                                            cfr_temp_13 = v45 - v46;
                                                                                                                            v38 = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1);
                                                                                                                        }
                                                                                                                        catch (H v47) {
                                                                                                                            throw m6.a(v47);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (v38 != false) break block190;
                                                                                                                        v45 = var20_13;
                                                                                                                        v46 = 1.0;
                                                                                                                    }
                                                                                                                    catch (H v48) {
                                                                                                                        throw m6.a(v48);
                                                                                                                    }
                                                                                                                }
                                                                                                                var20_13 = v45 + v46;
                                                                                                            }
                                                                                                            var22_14 = new xc(var14_10, var20_13, var16_11);
                                                                                                            var23_15 = Hk.a().b(var22_14, var4_3, (short)var6_4).a();
                                                                                                            var24_16 = this.d(var22_14);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v49 = Hk.j().ay;
                                                                                                                    v50 = -0.625;
                                                                                                                    if (var13_9 != null) break block191;
                                                                                                                    if (!(v49 <= v50)) break block192;
                                                                                                                }
                                                                                                                catch (H v51) {
                                                                                                                    throw m6.a(v51);
                                                                                                                }
                                                                                                                v49 = var20_13;
                                                                                                                v50 = Math.min(Hk.j().ay * 2.0, 2.5);
                                                                                                            }
                                                                                                            catch (H v52) {
                                                                                                                throw m6.a(v52);
                                                                                                            }
                                                                                                        }
                                                                                                        var20_13 = v49 + v50;
                                                                                                    }
                                                                                                    var25_17 = new xc(var14_10, var20_13, var16_11);
                                                                                                    try {
                                                                                                        v53 = this.c();
                                                                                                        if (var13_9 != null) break block193;
                                                                                                        if (!v53) break block194;
                                                                                                    }
                                                                                                    catch (H v54) {
                                                                                                        throw m6.a(v54);
                                                                                                    }
                                                                                                    var26_18 = 9;
                                                                                                    while (var26_18 < 36) {
                                                                                                        block195: {
                                                                                                            var27_19 = Hk.j().b8.c(var26_18).d();
                                                                                                            try {
                                                                                                                block196: {
                                                                                                                    try {
                                                                                                                        block197: {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var13_9 != null) break block195;
                                                                                                                                            v53 = Hk.j().b8.c(var26_18).c();
                                                                                                                                            if (var13_9 != null) break block193;
                                                                                                                                        }
                                                                                                                                        catch (H v55) {
                                                                                                                                            throw m6.a(v55);
                                                                                                                                        }
                                                                                                                                        if (!v53) break block196;
                                                                                                                                    }
                                                                                                                                    catch (H v56) {
                                                                                                                                        throw m6.a(v56);
                                                                                                                                    }
                                                                                                                                    if (!m6.a(var27_19)) break block197;
                                                                                                                                }
                                                                                                                                catch (H v57) {
                                                                                                                                    throw m6.a(v57);
                                                                                                                                }
                                                                                                                                if (var13_9 == null) break block196;
                                                                                                                            }
                                                                                                                            catch (H v58) {
                                                                                                                                throw m6.a(v58);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this.a(var26_18, 7);
                                                                                                                        if (var13_9 == null) break;
                                                                                                                    }
                                                                                                                    catch (H v59) {
                                                                                                                        throw m6.a(v59);
                                                                                                                    }
                                                                                                                }
                                                                                                                ++var26_18;
                                                                                                            }
                                                                                                            catch (H v60) {
                                                                                                                throw m6.a(v60);
                                                                                                            }
                                                                                                        }
                                                                                                        if (var13_9 == null) continue;
                                                                                                    }
                                                                                                }
                                                                                                v53 = this.b(var25_17).j();
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (var13_9 != null) break block198;
                                                                                                                        if (!v53) break block199;
                                                                                                                    }
                                                                                                                    catch (H v61) {
                                                                                                                        throw m6.a(v61);
                                                                                                                    }
                                                                                                                    v53 = this.a(var23_15);
                                                                                                                    if (var13_9 != null) break block198;
                                                                                                                }
                                                                                                                catch (H v62) {
                                                                                                                    throw m6.a(v62);
                                                                                                                }
                                                                                                                if (!v53) break block199;
                                                                                                            }
                                                                                                            catch (H v63) {
                                                                                                                throw m6.a(v63);
                                                                                                            }
                                                                                                            v64    = var24_16;
                                                                                                            if (var13_9 != null) break block200;
                                                                                                        }
                                                                                                        catch (H v65) {
                                                                                                            throw m6.a(v65);
                                                                                                        }
                                                                                                        if (v64    == null) break block199;
                                                                                                    }
                                                                                                    catch (H v66) {
                                                                                                        throw m6.a(v66);
                                                                                                    }
                                                                                                    this.q = var24_16;
                                                                                                    v67 = this;
                                                                                                    if (var13_9 != null) break block201;
                                                                                                }
                                                                                                catch (H v68) {
                                                                                                    throw m6.a(v68);
                                                                                                }
                                                                                                v64    = v67.l.i();
                                                                                            }
                                                                                            catch (H v69) {
                                                                                                throw m6.a(v69);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (((Boolean)v64   ).booleanValue()) {
                                                                                                this.a(var24_16);
                                                                                            }
                                                                                        }
                                                                                        catch (H v70) {
                                                                                            throw m6.a(v70);
                                                                                        }
                                                                                        this.b(var10_7, (char)var12_8, var24_16);
                                                                                        v67 = this;
                                                                                    }
                                                                                    v67.q = null;
                                                                                }
                                                                                v53 = false;
                                                                            }
                                                                            var26_18 = (int)v53;
                                                                            var27_20 = this.s;
                                                                            try {
                                                                                try {
                                                                                    v71 = this;
                                                                                    v72 = ((Boolean)this.l.i()).booleanValue();
                                                                                    if (var13_9 != null) break block202;
                                                                                    if (v72 != 0) break block203;
                                                                                }
                                                                                catch (H v73) {
                                                                                    throw m6.a(v73);
                                                                                }
                                                                                v72 = Hk.i().Y.i();
                                                                            }
                                                                            catch (H v74) {
                                                                                throw m6.a(v74);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (var13_9 != null) break block204;
                                                                            if (v72 == 0) break block203;
                                                                        }
                                                                        catch (H v75) {
                                                                            throw m6.a(v75);
                                                                        }
                                                                        v72 = tB.c();
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var13_9 != null) break block205;
                                                                            if (v72 != 0) break block203;
                                                                        }
                                                                        catch (H v76) {
                                                                            throw m6.a(v76);
                                                                        }
                                                                        cfr_temp_14 = Hk.j().e - (double)rO.g((double)Hk.j().e);
                                                                        v72 = cfr_temp_14 == 0.0 ? 0 : (cfr_temp_14 > 0.0 ? 1 : -1);
                                                                    }
                                                                    catch (H v77) {
                                                                        throw m6.a(v77);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var13_9 != null) break block206;
                                                                                if (v72 != 0) {
                                                                                }
                                                                                ** GOTO lbl483
                                                                            }
                                                                            catch (H v78) {
                                                                                throw m6.a(v78);
                                                                            }
                                                                            v72 = var26_18;
                                                                            if (var13_9 != null) break block207;
                                                                        }
                                                                        catch (H v79) {
                                                                            throw m6.a(v79);
                                                                        }
                                                                        if (v72 == 0) break block203;
                                                                    }
                                                                    catch (H v80) {
                                                                        throw m6.a(v80);
                                                                    }
                                                                    cfr_temp_15 = Hk.j().e - ((double)rO.g((double)Hk.j().e) + 0.5);
                                                                    v72 = cfr_temp_15 == 0.0 ? 0 : (cfr_temp_15 > 0.0 ? 1 : -1);
                                                                }
                                                                catch (H v81) {
                                                                    throw m6.a(v81);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var13_9 != null) break block206;
                                                                    if (v72 != 0) break block203;
                                                                }
                                                                catch (H v82) {
                                                                    throw m6.a(v82);
                                                                }
lbl483:


                                                                v72 = this.e();
                                                            }
                                                            catch (H v83) {
                                                                throw m6.a(v83);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var13_9 != null) break block208;
                                                                if (v72 <= 1) break block203;
                                                            }
                                                            catch (H v84) {
                                                                throw m6.a(v84);
                                                            }
                                                            v72 = 1;
                                                            break block208;
                                                        }
                                                        catch (H v85) {
                                                            throw m6.a(v85);
                                                        }
                                                    }
                                                    v72 = 0;
                                                }
                                                try {
                                                    v71.s = v72;
                                                    v86 = this.s;
                                                    if (var13_9 != null) break block209;
                                                    if (!v86) break block210;
                                                }
                                                catch (H v87) {
                                                    throw m6.a(v87);
                                                }
                                                var28_21 = Hk.j().q();
                                                var29_22 = -1.0;
                                                for (em var32_24 : Hk.a().b((LQ)Hk.j(), var28_21.b(0.0, var29_22, 0.0), var7_5, (byte)var9_6)) {
                                                    var29_22 = var32_24.a(var28_21, var29_22);
                                                    try {
                                                        if (var13_9 == null) {
                                                            if (var13_9 == null) continue;
                                                            break;
                                                        }
                                                        break block210;
                                                    }
                                                    catch (H v88) {
                                                        throw m6.a(v88);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v89 = this;
                                                                cfr_temp_16 = var29_22 - 0.0;
                                                                v90 = cfr_temp_16 == 0.0 ? 0 : (cfr_temp_16 > 0.0 ? 1 : -1);
                                                                if (var13_9 != null) break block211;
                                                                if (v90 == false) break block212;
                                                            }
                                                            catch (H v91) {
                                                                throw m6.a(v91);
                                                            }
                                                            v90 = var26_18;
                                                            if (var13_9 != null) break block213;
                                                        }
                                                        catch (H v92) {
                                                            throw m6.a(v92);
                                                        }
                                                        if (v90 == false) break block214;
                                                    }
                                                    catch (H v93) {
                                                        throw m6.a(v93);
                                                    }
                                                    cfr_temp_17 = var29_22 - -0.5;
                                                    v90 = cfr_temp_17 == 0.0 ? 0 : (cfr_temp_17 > 0.0 ? 1 : -1);
                                                }
                                                catch (H v94) {
                                                    throw m6.a(v94);
                                                }
                                            }
                                            try {
                                                if (var13_9 != null) break block211;
                                                if (v90 != false) break block214;
                                            }
                                            catch (H v95) {
                                                throw m6.a(v95);
                                            }
                                        }
                                        v90 = (double)true;
                                        break block211;
                                    }
                                    v90 = (double)false;
                                }
                                v89.s = v90;
                            }
                            v86 = this.s;
                        }
                        try {
                            try {
                                try {
                                    if (var13_9 != null) break block215;
                                    if (v86) {
                                    }
                                    ** GOTO lbl588
                                }
                                catch (H v96) {
                                    throw m6.a(v96);
                                }
                                v97 = Hk.j();
                                if (var26_18 == 0) break block216;
                            }
                            catch (H v98) {
                                throw m6.a(v98);
                            }
                            v99 = 0.5;
                            break block217;
                        }
                        catch (H v100) {
                            throw m6.a(v100);
                        }
                    }
                    v99 = 1.0;
                }
                try {
                    v97.ay = v99;
                    if (var13_9 == null) break block218;
lbl588:


                    v86 = var27_20;
                }
                catch (H v101) {
                    throw m6.a(v101);
                }
            }
            try {
                if (v86) {
                    Hk.j().ay = 0.0;
                }
            }
            catch (H v102) {
                throw m6.a(v102);
            }
        }
    }





    private void lambda$new$2(b5 var1_1) {
        block98: {
            block97: {
                block96: {
                    block95: {
                        block93: {
                            block94: {
                                block91: {
                                    block92: {
                                        block82: {
                                            block84: {
                                                block90: {
                                                    block88: {
                                                        block86: {
                                                            block85: {
                                                                block83: {
                                                                    block80: {
                                                                        block81: {
                                                                            block78: {
                                                                                block79: {
                                                                                    var2_2 = m6.a();
                                                                                    try {
                                                                                        v0 = Hk.j();
                                                                                        if (var2_2 != null) break block78;
                                                                                        if (v0 != null) break block79;
                                                                                    }
                                                                                    catch (H v1) {
                                                                                        throw m6.a(v1);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                v0 = Hk.j();
                                                                            }
                                                                            var3_3 = v0.ax;
                                                                            var5_4 = Hk.j().av;
                                                                            var7_5 = Hk.j().e - (double)((int)Hk.j().e);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v2 = Hk.j().e;
                                                                                            v3 = Hk.i().ah.c();
                                                                                            if (var2_2 != null) break block80;
                                                                                            if (v3 == 0) break block81;
                                                                                        }
                                                                                        catch (H v4) {
                                                                                            throw m6.a(v4);
                                                                                        }
                                                                                        v3 = Hk.j().al;
                                                                                        if (var2_2 != null) break block80;
                                                                                    }
                                                                                    catch (H v5) {
                                                                                        throw m6.a(v5);
                                                                                    }
                                                                                    if (v3 == 0) break block81;
                                                                                }
                                                                                catch (H v6) {
                                                                                    throw m6.a(v6);
                                                                                }
                                                                                v7 = 1.2;
                                                                                break block82;
                                                                            }
                                                                            catch (H v8) {
                                                                                throw m6.a(v8);
                                                                            }
                                                                        }
                                                                        v3 = tf.m().b(lx.class);
                                                                    }
                                                                    try {
                                                                        if (var2_2 != null) break block83;
                                                                        if (v3 == 0) break block84;
                                                                    }
                                                                    catch (H v9) {
                                                                        throw m6.a(v9);
                                                                    }
                                                                    v3 = tB.c();
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var2_2 != null) break block85;
                                                                        if (v3 == 0) break block84;
                                                                    }
                                                                    catch (H v10) {
                                                                        throw m6.a(v10);
                                                                    }
                                                                    cfr_temp_0 = var7_5 - 0.24919;
                                                                    v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                }
                                                                catch (H v11) {
                                                                    throw m6.a(v11);
                                                                }
                                                            }
                                                            try {
                                                                block87: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var2_2 != null) break block86;
                                                                                        if (v3 >= 0) break block87;
                                                                                    }
                                                                                    catch (H v12) {
                                                                                        throw m6.a(v12);
                                                                                    }
                                                                                    cfr_temp_1 = var7_5 - 0.105;
                                                                                    v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                    if (var2_2 != null) break block88;
                                                                                }
                                                                                catch (H v13) {
                                                                                    throw m6.a(v13);
                                                                                }
                                                                                if (v3 <= 0) {
                                                                                }
                                                                                ** GOTO lbl170
                                                                            }
                                                                            catch (H v14) {
                                                                                throw m6.a(v14);
                                                                            }
                                                                            cfr_temp_2 = Rf.a((double)var7_5, (int)4) - 0.0993;
                                                                            v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                            if (var2_2 != null) break block88;
                                                                        }
                                                                        catch (H v15) {
                                                                            throw m6.a(v15);
                                                                        }
                                                                        if (v3 != 0) {
                                                                        }
                                                                        ** GOTO lbl170
                                                                    }
                                                                    catch (H v16) {
                                                                        throw m6.a(v16);
                                                                    }
                                                                }
                                                                v3 = (cfr_temp_3 = Rf.a((double)var7_5, (int)4) - 0.0013) == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                                            }
                                                            catch (H v17) {
                                                                throw m6.a(v17);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                block89: {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var2_2 != null) break block88;
                                                                                                                if (v3 == 0) break block89;
                                                                                                            }
                                                                                                            catch (H v18) {
                                                                                                                throw m6.a(v18);
                                                                                                            }
                                                                                                            cfr_temp_4 = Rf.a((double)var7_5, (int)4) - 0.0156;
                                                                                                            v3 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                                            if (var2_2 != null) break block88;
                                                                                                        }
                                                                                                        catch (H v19) {
                                                                                                            throw m6.a(v19);
                                                                                                        }
                                                                                                        if (v3 == 0) break block89;
                                                                                                    }
                                                                                                    catch (H v20) {
                                                                                                        throw m6.a(v20);
                                                                                                    }
                                                                                                    cfr_temp_5 = Rf.a((double)var7_5, (int)4) - 0.0479;
                                                                                                    v3 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                                                    if (var2_2 != null) break block88;
                                                                                                }
                                                                                                catch (H v21) {
                                                                                                    throw m6.a(v21);
                                                                                                }
                                                                                                if (v3 == 0) break block89;
                                                                                            }
                                                                                            catch (H v22) {
                                                                                                throw m6.a(v22);
                                                                                            }
                                                                                            cfr_temp_6 = Rf.a((double)var7_5, (int)4) - 0.01553;
                                                                                            v3 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 > 0.0 ? 1 : -1);
                                                                                            if (var2_2 != null) break block88;
                                                                                        }
                                                                                        catch (H v23) {
                                                                                            throw m6.a(v23);
                                                                                        }
                                                                                        if (v3 == 0) break block89;
                                                                                    }
                                                                                    catch (H v24) {
                                                                                        throw m6.a(v24);
                                                                                    }
                                                                                    cfr_temp_7 = Rf.a((double)var7_5, (int)4) - 0.0902;
                                                                                    v3 = cfr_temp_7 == 0.0 ? 0 : (cfr_temp_7 > 0.0 ? 1 : -1);
                                                                                    if (var2_2 != null) break block88;
                                                                                }
                                                                                catch (H v25) {
                                                                                    throw m6.a(v25);
                                                                                }
                                                                                if (v3 == 0) break block89;
                                                                            }
                                                                            catch (H v26) {
                                                                                throw m6.a(v26);
                                                                            }
                                                                            v7 = Rf.a((double)var7_5, (int)4);
                                                                            if (var2_2 != null) break block82;
                                                                        }
                                                                        catch (H v27) {
                                                                            throw m6.a(v27);
                                                                        }
                                                                        if (v7 != 0.2734) break block90;
                                                                    }
                                                                    catch (H v28) {
                                                                        throw m6.a(v28);
                                                                    }
                                                                }
                                                                v7 = Math.abs(Hk.j().ay);
                                                                if (var2_2 != null) break block82;
                                                            }
                                                            catch (H v29) {
                                                                throw m6.a(v29);
                                                            }
                                                            cfr_temp_8 = v7 - 0.45;
                                                            v3 = cfr_temp_8 == 0.0 ? 0 : (cfr_temp_8 < 0.0 ? -1 : 1);
                                                        }
                                                        catch (H v30) {
                                                            throw m6.a(v30);
                                                        }
                                                    }
                                                    try {
                                                        if (v3 >= 0) break block90;
                                                        v7 = 1.25;
                                                        break block82;
                                                    }
                                                    catch (H v31) {
                                                        throw m6.a(v31);
                                                    }
                                                }
                                                v7 = 1.0;
                                                break block82;
                                            }
                                            v7 = 0.8;
                                        }
                                        var9_6 = v2 - v7;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            cfr_temp_9 = var7_5 - 0.27;
                                                            v32 = cfr_temp_9 == 0.0 ? 0 : (cfr_temp_9 > 0.0 ? 1 : -1);
                                                            if (var2_2 != null) break block91;
                                                            if (v32 <= 0) break block92;
                                                        }
                                                        catch (H v33) {
                                                            throw m6.a(v33);
                                                        }
                                                        cfr_temp_10 = Hk.j().ay - 0.01;
                                                        v32 = cfr_temp_10 == 0.0 ? 0 : (cfr_temp_10 < 0.0 ? -1 : 1);
                                                        if (var2_2 != null) break block91;
                                                    }
                                                    catch (H v34) {
                                                        throw m6.a(v34);
                                                    }
                                                    if (v32 >= 0) break block92;
                                                }
                                                catch (H v35) {
                                                    throw m6.a(v35);
                                                }
                                                cfr_temp_11 = var7_5 - 0.42;
                                                v32 = cfr_temp_11 == 0.0 ? 0 : (cfr_temp_11 < 0.0 ? -1 : 1);
                                                if (var2_2 != null) break block91;
                                            }
                                            catch (H v36) {
                                                throw m6.a(v36);
                                            }
                                            if (v32 >= 0) break block92;
                                        }
                                        catch (H v37) {
                                            throw m6.a(v37);
                                        }
                                        var9_6 -= 0.5;
                                    }
                                    v32 = (cfr_temp_12 = Rf.a((double)var7_5, (int)4) - 0.005) == 0.0 ? 0 : (cfr_temp_12 > 0.0 ? 1 : -1);
                                }
                                try {
                                    if (var2_2 != null) break block93;
                                    if (v32 != false) break block94;
                                }
                                catch (H v38) {
                                    throw m6.a(v38);
                                }
                                var9_6 = 0.8;
                            }
                            try {
                                v39 = Rf.a((double)var7_5, (int)4);
                                v40 = 0.1662;
                                if (var2_2 != null) break block95;
                                cfr_temp_13 = v39 - v40;
                                v32 = cfr_temp_13 == 0.0 ? 0 : (cfr_temp_13 > 0.0 ? 1 : -1);
                            }
                            catch (H v41) {
                                throw m6.a(v41);
                            }
                        }
                        try {
                            if (v32 != false) break block96;
                            v39 = var9_6;
                            v40 = 1.0;
                        }
                        catch (H v42) {
                            throw m6.a(v42);
                        }
                    }
                    var9_6 = v39 + v40;
                }
                var11_7 = new xc(var3_3, var9_6, var5_4);
                var12_8 = this.d(var11_7);
                try {
                    try {
                        v43 = this;
                        if (var2_2 != null) break block97;
                        if (((Boolean)v43.l.i()).booleanValue()) break block98;
                    }
                    catch (H v44) {
                        throw m6.a(v44);
                    }
                    v43 = this;
                }
                catch (H v45) {
                    throw m6.a(v45);
                }
            }
            v43.a(var12_8);
        }
    }

    private void lambda$new$1(b7 b72) {
        try {
            if (this.s) {
                b72.a(true);
            }
        }
        catch (H h) {
            throw m6.a(h);
        }
    }

    private void lambda$new$0(v7 v72) {
        long l = t ^ 0x7AF35BE30BE0L;
        long l2 = l ^ 0xB10681B1E70L;
        int n = (int)(l2 >>> 48);
        int n2 = (int)(l2 << 16 >>> 32);
        int n3 = (int)(l2 << 48 >>> 48);
        String string = this.e() + (String)((Object)m6.a("y", (int)20713, (long)(0x2E6009A6440629C3L ^ l)));
        Hk.h().a(string, (float)v72.c().a() / 2.057f + (float)Hk.h().c((char)n, n2, string, (char)n3) - 10.0f, (float)v72.c().c() / 2.024f, -1);
    }

    public static void b(String[] stringArray) {
        r = stringArray;
    }

    public static String[] a() {
        return r;
    }




    static {
        t = _c.a((long)-4539619102517354131L, (long)-1995859293664987535L, MethodHandles.lookup().lookupClass()).a(218201637948183L);
        w = new HashMap(13);
        long l = t ^ 0x790807086FEFL;
        m6.b(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00e8!qT\u009b\u0010[\u00fc\u00aaXsG\u00b3\u00b7\u00ce\u00ba\u00dfo\u00ce\u0080xH\u00e2s\u0094l\u00b5|y\u0081\u00a3\u0005)7\u00adTa\u00b6`\u0093p\u001d\u00fb\u00e7\u00b9\u00fc\u000fT137\u00c1l@6\u00ab_OWi\u00c7\u0087\f\u00c1\u0018x\u0004x)\u00ce\u00f9\u001e\u00bb\u000b\u008c\u00c3\u0018\u001e\u00c9QF\u00bfp\u0099\u0001\u001a\u0085J\u00b3\u0010\u00b2\u0081\u008b\u0014*\u00ea7\u00c4dAl(\u00e8ndu";
        int n2 = "\u00e8!qT\u009b\u0010[\u00fc\u00aaXsG\u00b3\u00b7\u00ce\u00ba\u00dfo\u00ce\u0080xH\u00e2s\u0094l\u00b5|y\u0081\u00a3\u0005)7\u00adTa\u00b6`\u0093p\u001d\u00fb\u00e7\u00b9\u00fc\u000fT137\u00c1l@6\u00ab_OWi\u00c7\u0087\f\u00c1\u0018x\u0004x)\u00ce\u00f9\u001e\u00bb\u000b\u008c\u00c3\u0018\u001e\u00c9QF\u00bfp\u0099\u0001\u001a\u0085J\u00b3\u0010\u00b2\u0081\u008b\u0014*\u00ea7\u00c4dAl(\u00e8ndu".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = m6.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                u = stringArray;
                v = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x627D;
        if (v[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])w.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("m6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = u[n2].getBytes("ISO-8859-1");
            m6.v[n2] = m6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = m6.a(n, l);
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
            throw new RuntimeException("m6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(m6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
