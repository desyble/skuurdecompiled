import java.lang.invoke.MethodHandles;

public class m_
extends lh {
    private boolean k;
    @A
    public final R8<b5> n = this::lambda$new$0;
    @A
    public final R8<cq> m = m_::lambda$new$1;
    @A
    public final R8<c4> l = m_::lambda$new$2;
    private static final long o = _c.a((long)8205902185322220932L, (long)-5048603097896590888L, MethodHandles.lookup().lookupClass()).a(280693144870283L);

    public m_(EU eU) {
        super(eU);
    }

    public void d(int n, int n2, int n3) {
        this.k = false;
    }

    public void a(char c, long l) {
        Hk.b().ay.h = 1.0f;
        this.k = false;
    }

    private static void lambda$new$2(c4 c42) {
        int n;
        block20: {
            block21: {
                String[] stringArray;
                block18: {
                    int n2;
                    int n3;
                    int n4;
                    block19: {
                        block16: {
                            block17: {
                                block14: {
                                    xc xc2;
                                    block15: {
                                        long l = o ^ 0x4A60C955DA59L;
                                        long l2 = l ^ 0x49963E7E6762L;
                                        n4 = (int)(l2 >>> 32);
                                        n3 = (int)(l2 << 32 >>> 48);
                                        n2 = (int)(l2 << 48 >>> 48);
                                        stringArray = l1.c();
                                        try {
                                            if (Hk.j() == null) {
                                                return;
                                            }
                                        }
                                        catch (H h) {
                                            throw m_.a(h);
                                        }
                                        xc2 = c42.b();
                                        try {
                                            if (xc2 == null) {
                                                return;
                                            }
                                        }
                                        catch (H h) {
                                            throw m_.a(h);
                                        }
                                        A6 a6 = c42.c();
                                        try {
                                            n = a6 instanceof AF;
                                            if (stringArray == null) break block14;
                                            if (n != 0) break block15;
                                        }
                                        catch (H h) {
                                            throw m_.a(h);
                                        }
                                        return;
                                    }
                                    double d = (double)xc2.a() - Hk.j().e;
                                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                }
                                try {
                                    if (stringArray == null) break block16;
                                    if (n < 0) break block17;
                                }
                                catch (H h) {
                                    throw m_.a(h);
                                }
                                return;
                            }
                            n = Hk.j().K ? 1 : 0;
                        }
                        try {
                            if (stringArray == null) break block18;
                            if (n != 0) break block19;
                        }
                        catch (H h) {
                            throw m_.a(h);
                        }
                        return;
                    }
                    n = Hk.j().w(n4, n3, (char)n2) ? 1 : 0;
                }
                try {
                    if (stringArray == null) break block20;
                    if (n == 0) break block21;
                }
                catch (H h) {
                    throw m_.a(h);
                }
                return;
            }
            n = (int)Hk.j().e;
        }
        double d = (double)n - 1.0;
        em em2 = em.a((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)1.0, (double)1.0).a(Hk.j().ax, d, Hk.j().av);
        double d2 = 1.0E-7;
        em2 = em2.c(-1.0E-7, 0.0, -1.0E-7);
        c42.a(em2);
    }

    private static void lambda$new$1(cq cq2) {
        try {
            if (Hk.j().K) {
                cq2.b(0.0f);
            }
        }
        catch (H h) {
            throw m_.a(h);
        }
    }

    private void lambda$new$0(b5 b52) {
        block59: {
            double d;
            block60: {
                String[] stringArray;
                block58: {
                    block46: {
                        block47: {
                            float f;
                            float f2;
                            block54: {
                                block55: {
                                    float f3;
                                    float f4;
                                    float f5;
                                    block56: {
                                        block57: {
                                            float f6;
                                            block48: {
                                                block49: {
                                                    float f7;
                                                    block52: {
                                                        block53: {
                                                            float f8;
                                                            float f9;
                                                            block50: {
                                                                block51: {
                                                                    block44: {
                                                                        block45: {
                                                                            MI mI;
                                                                            block42: {
                                                                                block43: {
                                                                                    stringArray = l1.c();
                                                                                    try {
                                                                                        if (b52.h()) {
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    catch (H h) {
                                                                                        throw m_.a(h);
                                                                                    }
                                                                                    try {
                                                                                        mI = Hk.j();
                                                                                        if (stringArray == null) break block42;
                                                                                        if (mI != null) break block43;
                                                                                    }
                                                                                    catch (H h) {
                                                                                        throw m_.a(h);
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                mI = Hk.j();
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    double d2 = mI.ay - 0.0;
                                                                                    d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                                                                    if (stringArray == null) break block44;
                                                                                    if (d >= 0) break block45;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw m_.a(h);
                                                                                }
                                                                                this.k = true;
                                                                            }
                                                                            catch (H h) {
                                                                                throw m_.a(h);
                                                                            }
                                                                        }
                                                                        d = (double)this.k;
                                                                    }
                                                                    try {
                                                                        if (stringArray == null) break block46;
                                                                        if (d == false) break block47;
                                                                    }
                                                                    catch (H h) {
                                                                        throw m_.a(h);
                                                                    }
                                                                    f2 = Hk.j().H;
                                                                    f5 = Hk.j().cQ.c;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    f6 = f5;
                                                                                    if (stringArray == null) break block48;
                                                                                    if (f6 == 0.0f) break block49;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw m_.a(h);
                                                                                }
                                                                                f9 = f2;
                                                                                f8 = f5;
                                                                                if (stringArray == null) break block50;
                                                                            }
                                                                            catch (H h) {
                                                                                throw m_.a(h);
                                                                            }
                                                                            if (!(f8 < 0.0f)) break block51;
                                                                        }
                                                                        catch (H h) {
                                                                            throw m_.a(h);
                                                                        }
                                                                        f8 = 180.0f;
                                                                        break block50;
                                                                    }
                                                                    catch (H h) {
                                                                        throw m_.a(h);
                                                                    }
                                                                }
                                                                f8 = 0.0f;
                                                            }
                                                            f2 = f9 + f8;
                                                            try {
                                                                try {
                                                                    f7 = f5;
                                                                    if (stringArray == null) break block52;
                                                                    if (!(f7 < 0.0f)) break block53;
                                                                }
                                                                catch (H h) {
                                                                    throw m_.a(h);
                                                                }
                                                                f7 = -0.5f;
                                                                break block52;
                                                            }
                                                            catch (H h) {
                                                                throw m_.a(h);
                                                            }
                                                        }
                                                        f7 = 0.5f;
                                                    }
                                                    f5 = f7;
                                                }
                                                f6 = Hk.j().cQ.b;
                                            }
                                            float f10 = f6;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            f = f10;
                                                            if (stringArray == null) break block54;
                                                            if (f == 0.0f) break block55;
                                                        }
                                                        catch (H h) {
                                                            throw m_.a(h);
                                                        }
                                                        f4 = f2;
                                                        f3 = f10;
                                                        if (stringArray == null) break block56;
                                                    }
                                                    catch (H h) {
                                                        throw m_.a(h);
                                                    }
                                                    if (!(f3 < 0.0f)) break block57;
                                                }
                                                catch (H h) {
                                                    throw m_.a(h);
                                                }
                                                f3 = 90.0f;
                                                break block56;
                                            }
                                            catch (H h) {
                                                throw m_.a(h);
                                            }
                                        }
                                        f3 = -90.0f;
                                    }
                                    f2 = f4 + f3 * f5;
                                }
                                f = f2;
                            }
                            double d3 = Math.toRadians(f);
                            double d4 = 1.0E-8;
                            b52.a(f2);
                            b52.a(b52.e() - Math.sin(d3) * 1.0E-8);
                            b52.c(b52.b() + Math.cos(d3) * 1.0E-8);
                            this.k = false;
                        }
                        d = (double)Hk.j().K;
                    }
                    try {
                        try {
                            if (stringArray == null) break block58;
                            if (d == false) break block59;
                        }
                        catch (H h) {
                            throw m_.a(h);
                        }
                        d = (double)Hk.j().al;
                    }
                    catch (H h) {
                        throw m_.a(h);
                    }
                }
                try {
                    try {
                        if (stringArray == null) break block60;
                        if (d == false) break block59;
                    }
                    catch (H h) {
                        throw m_.a(h);
                    }
                    d = (double)Hk.i().Y.i();
                }
                catch (H h) {
                    throw m_.a(h);
                }
            }
            try {
                if (d == false) {
                    Hk.j().R();
                }
            }
            catch (H h) {
                throw m_.a(h);
            }
        }
    }

    private static H a(H h) {
        return h;
    }
}
