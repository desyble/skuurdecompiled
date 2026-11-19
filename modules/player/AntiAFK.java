import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class mG
extends lh {
    private final kt<Number> G;
    private final kt<Number> B;
    private final kt<Number> m;
    private final kt<Boolean> y;
    private final kt<Number> u;
    private final kt<Boolean> t;
    private final kt<Boolean> I;
    private final kt<Number> l;
    private final kt<Number> H;
    private final Pd w;
    private long z;
    private long v;
    private int s;
    private double J;
    private double A;
    private float r;
    private float o;
    private float k;
    private float p;
    private float K;
    private float C;
    public static int n;
    private int D;
    private float q;
    private float F;
    @A
    public final R8<H6> E;
    @A
    public final R8<b5> x;
    private static final long L;
    private static final String[] M;
    private static final String[] N;
    private static final Map O;

    public mG(short s, int n, EU eU, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ L;
        super(eU);
        this.G = new kt((String)((Object)mG.a("v", (int)27311, (long)(0x1B8938224784751L ^ l))), (Object)10, (String)((Object)mG.a("v", (int)16583, (long)(0x65D3953D5108ED27L ^ l))), 1.0, 1.0, 120.0, "s");
        this.B = new kt((String)((Object)mG.a("v", (int)9589, (long)(0x1A7FFA3587460888L ^ l))), (Object)20, (String)((Object)mG.a("v", (int)11716, (long)(0x3EFE66B18540802EL ^ l))), 1.0, 1.0, 300.0, "s");
        this.m = new kt((String)((Object)mG.a("v", (int)22930, (long)(0x3335D77C38F37474L ^ l))), (Object)1, (String)((Object)mG.a("v", (int)9744, (long)(0x6C6BABFFDBD20BF9L ^ l))), 1.0, 1.0, 20.0);
        this.y = new kt((String)((Object)mG.a("v", (int)28529, (long)(0x77AA619312C54293L ^ l))), (Object)true, (String)((Object)mG.a("v", (int)26967, (long)(0x35EA3B2704C244BCL ^ l))));
        this.u = new kt((String)((Object)mG.a("v", (int)18320, (long)(0x7CBA953D0AB5EA7FL ^ l))), (Object)2, (String)((Object)mG.a("v", (int)19804, (long)(0x643B63B92E26E0BFL ^ l))), 0.1, 0.5, 10.0, "m", () -> this.y.i());
        this.t = new kt((String)((Object)mG.a("v", (int)1647, (long)(0x19C142C0E8BCAB88L ^ l))), (Object)true, (String)((Object)mG.a("v", (int)31138, (long)(0x6C8C1C6D3327D45AL ^ l))));
        this.I = new kt((String)((Object)mG.a("v", (int)16086, (long)(0x33E31FE8FEF91337L ^ l))), (Object)false, (String)((Object)mG.a("v", (int)19834, (long)(0x657310DDFBEAE092L ^ l))), () -> this.t.i());
        this.l = new kt((String)((Object)mG.a("v", (int)4946, (long)(0x501B1A261D333EB6L ^ l))), (Object)180, (String)((Object)mG.a("v", (int)6056, (long)(0x473DBA6BCEA2BA54L ^ l))), 5.0, 5.0, 180.0, "\u00b0", () -> this.t.i());
        this.H = new kt((String)((Object)mG.a("v", (int)2361, (long)(0x349C6C07BAD624D4L ^ l))), (Object)90, (String)((Object)mG.a("v", (int)31236, (long)(0x1675DD4AA69557E1L ^ l))), 5.0, 5.0, 90.0, "\u00b0", () -> this.t.i());
        this.w = new Pd();
        this.D = -1;
        this.q = 3.0f;
        this.F = 3.0f;
        this.E = this::lambda$new$0;
        this.x = this::lambda$new$1;
        kt kt2 = new kt((String)((Object)mG.a("v", (int)20632, (long)(0x180A1FFA1E5C7D67L ^ l))), new kt[]{this.G, this.B, this.m});
        kt kt3 = new kt((String)((Object)mG.a("v", (int)31238, (long)(0x3C61E39B866DD7E8L ^ l))), new kt[]{this.y, this.u});
        kt kt4 = new kt((String)((Object)mG.a("v", (int)1693, (long)(0x5664BA8B959E2B71L ^ l))), new kt[]{this.t, this.I, this.l, this.H});
        this.a(new kt[]{kt2, kt3, kt4});
    }

    public void d(int n, int n2, int n3) {
        block4: {
            block5: {
                this.z = System.currentTimeMillis();
                this.f();
                this.s = 0;
                mG.n = 0;
                this.D = -1;
                String[] stringArray = m6.a();
                try {
                    try {
                        if (stringArray != null) break block4;
                        if (Hk.j() == null) break block5;
                    }
                    catch (H h) {
                        throw mG.a(h);
                    }
                    this.k = Hk.j().H;
                    this.p = Hk.j().m;
                    this.K = this.k;
                    this.C = this.p;
                }
                catch (H h) {
                    throw mG.a(h);
                }
            }
            this.w.e();
        }
    }

    public void a(char c, long l) {
        this.s = 0;
        this.b();
        this.z = System.currentTimeMillis();
        dL.e();
    }

    private void h() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        this.q = (float)threadLocalRandom.nextDouble(1.0, 3.5);
        this.F = (float)threadLocalRandom.nextDouble(1.0, 3.5);
    }






    private void g() {
        block25: {
            boolean bl;
            block24: {
                String[] stringArray;
                block22: {
                    long l;
                    int n;
                    block23: {
                        int n2;
                        ThreadLocalRandom threadLocalRandom;
                        block20: {
                            long l2 = L ^ 0x15B2E79D96D4L;
                            long l3 = l2 ^ 0x405623BF097L;
                            n = (int)(l3 >>> 56);
                            l = l3 << 8 >>> 8;
                            threadLocalRandom = ThreadLocalRandom.current();
                            stringArray = m6.a();
                            try {
                                block21: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n2 = ((Boolean)this.y.i()).booleanValue();
                                                            if (stringArray != null) break block20;
                                                            if (n2 == 0) break block21;
                                                        }
                                                        catch (H h) {
                                                            throw mG.a(h);
                                                        }
                                                        double d = Hk.j().i(this.J, Hk.j().e, this.A) - ((Number)this.u.i()).doubleValue();
                                                        n2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                                        if (stringArray != null) break block20;
                                                    }
                                                    catch (H h) {
                                                        throw mG.a(h);
                                                    }
                                                    if (n2 <= 0) break block21;
                                                }
                                                catch (H h) {
                                                    throw mG.a(h);
                                                }
                                                this.K = this.a(this.J, this.A);
                                                this.D = this.a(this.K);
                                                mG.n = threadLocalRandom.nextInt(10, 20);
                                                bl = (Boolean)this.t.i();
                                                if (stringArray != null) break block22;
                                            }
                                            catch (H h) {
                                                throw mG.a(h);
                                            }
                                            if (!bl) break block23;
                                        }
                                        catch (H h) {
                                            throw mG.a(h);
                                        }
                                        this.C = rO.a((float)(this.o + (float)threadLocalRandom.nextDouble(-this.H.f(), this.H.f())), (float)-90.0f, (float)90.0f);
                                        if (stringArray == null) break block23;
                                    }
                                    catch (H h) {
                                        throw mG.a(h);
                                    }
                                }
                                n2 = 4;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                        }
                        int[] nArray = new int[n2];
                        nArray[0] = Hk.b().i.b4.d();
                        nArray[1] = Hk.b().i.br.d();
                        nArray[2] = Hk.b().i.q.d();
                        nArray[3] = Hk.b().i.bO.d();
                        int[] nArray2 = nArray;
                        try {
                            try {
                                this.D = nArray2[threadLocalRandom.nextInt(nArray2.length)];
                                mG.n = threadLocalRandom.nextInt(5, 15);
                                bl = (Boolean)this.t.i();
                                if (stringArray != null) break block22;
                                if (!bl) break block23;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                            this.K = this.r + (float)threadLocalRandom.nextDouble(-this.l.f(), this.l.f());
                            this.C = rO.a((float)(this.o + (float)threadLocalRandom.nextDouble(-this.H.f(), this.H.f())), (float)-90.0f, (float)90.0f);
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                    }
                    bl = this.a(Hk.j().ax, Hk.j().e, (byte)n, l, Hk.j().av, this.D);
                }
                try {
                    if (stringArray != null) break block24;
                    if (bl) break block25;
                }
                catch (H h) {
                    throw mG.a(h);
                }
                bl = false;
            }
            n = bl ? 1 : 0;
            this.D = -1;
        }
    }




    private void f() {
        block9: {
            block8: {
                var2_1 = ((Number)this.G.i()).longValue() * 1000L;
                var4_2 = ((Number)this.B.i()).longValue() * 1000L;
                var1_3 = m6.a();
                try {
                    try {
                        if (var1_3 != null) break block8;
                        if (var2_1 >= var4_2) {
                        }
                        ** GOTO lbl19
                    }
                    catch (H v0) {
                        throw mG.a(v0);
                    }
                    this.v = var2_1;
                }
                catch (H v1) {
                    throw mG.a(v1);
                }
            }
            try {
                if (var1_3 == null) break block9;
lbl19:


                this.v = ThreadLocalRandom.current().nextLong(var2_1, var4_2 + 1L);
            }
            catch (H v2) {
                throw mG.a(v2);
            }
        }
    }

    private int a(float f) {
        float f2;
        block28: {
            block29: {
                String[] stringArray;
                float f3;
                block26: {
                    float f4;
                    block27: {
                        block24: {
                            float f5;
                            block25: {
                                float f6 = Hk.j().H;
                                f3 = rO.d((float)(f - f6));
                                stringArray = m6.a();
                                try {
                                    try {
                                        try {
                                            try {
                                                float f7 = f3 - -45.0f;
                                                f2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                                if (stringArray != null) break block24;
                                                if (f2 <= 0) break block25;
                                            }
                                            catch (H h) {
                                                throw mG.a(h);
                                            }
                                            float f8 = f3 - 45.0f;
                                            f2 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                                            if (stringArray != null) break block24;
                                        }
                                        catch (H h) {
                                            throw mG.a(h);
                                        }
                                        if (f2 > 0) break block25;
                                    }
                                    catch (H h) {
                                        throw mG.a(h);
                                    }
                                    return Hk.b().i.b4.d();
                                }
                                catch (H h) {
                                    throw mG.a(h);
                                }
                            }
                            f2 = (f5 = f3 - 45.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (stringArray != null) break block26;
                                        if (f2 <= 0) break block27;
                                    }
                                    catch (H h) {
                                        throw mG.a(h);
                                    }
                                    float f9 = f3 - 135.0f;
                                    f2 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                    if (stringArray != null) break block26;
                                }
                                catch (H h) {
                                    throw mG.a(h);
                                }
                                if (f2 > 0) break block27;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                            return Hk.b().i.bO.d();
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                    }
                    f2 = (f4 = f3 - -135.0f) == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        try {
                            try {
                                if (stringArray != null) break block28;
                                if (f2 <= 0) break block29;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                            float f10 = f3 - -45.0f;
                            f2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                            if (stringArray != null) break block28;
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                        if (f2 > 0) break block29;
                    }
                    catch (H h) {
                        throw mG.a(h);
                    }
                    return Hk.b().i.q.d();
                }
                catch (H h) {
                    throw mG.a(h);
                }
            }
            f2 = Hk.b().i.br.d();
        }
        return (int)f2;
    }




    private boolean a(double var1_1, double var3_2, byte var5_3, long var6_4, double var8_5, int var10_6) {
        block31: {
            block32: {
                block27: {
                    block28: {
                        block26: {
                            block25: {
                                block24: {
                                    var11_7 = ((long)var5_3 << 56 | var6_4 << 8 >>> 8) ^ mG.L;
                                    v0 = var11_7 ^ 71793896317466L;
                                    var13_8 = (int)(v0 >>> 32);
                                    var14_9 = (int)(v0 << 32 >>> 32);
                                    var15_10 = m6.a();
                                    try {
                                        try {
                                            v1 = var10_6;
                                            if (var15_10 != null) break block24;
                                            if (v1 != -1) break block25;
                                        }
                                        catch (H v2) {
                                            throw mG.a(v2);
                                        }
                                        v1 = 1;
                                    }
                                    catch (H v3) {
                                        throw mG.a(v3);
                                    }
                                }
                                return (boolean)v1;
                            }
                            var16_11 = Hk.j().H;
                            try {
                                v4 = var10_6;
                                v5 = Hk.b().i.br.d();
                                v6 = var15_10;
                                if (var6_4 < 0L) ** GOTO lbl48
                                if (v6 != null) break block26;
                                if (v4 == v5) {
                                }
                                ** GOTO lbl40
                            }
                            catch (H v7) {
                                throw mG.a(v7);
                            }
                            v8 = var16_11 + 180.0f;
                            if (var5_3 < 0) break block32;
                            var16_11 = v8;
                            try {
                                if (var15_10 == null) break block27;
lbl40:


                                v4 = var10_6;
                                v5 = Hk.b().i.q.d();
                            }
                            catch (H v9) {
                                throw mG.a(v9);
                            }
                        }
                        try {
                            v6 = var15_10;
lbl48:


                            if (v6 != null) break block28;
                            if (v4 == v5) {
                            }
                            ** GOTO lbl59
                        }
                        catch (H v10) {
                            throw mG.a(v10);
                        }
                        v8 = var16_11 - 90.0f;
                        if (var5_3 < 0) break block32;
                        var16_11 = v8;
                        try {
                            if (var15_10 == null) break block27;
lbl59:


                            v4 = var10_6;
                            v5 = Hk.b().i.bO.d();
                        }
                        catch (H v11) {
                            throw mG.a(v11);
                        }
                    }
                    if (v4 == v5) {
                        var16_11 += 90.0f;
                    }
                }
                v8 = var16_11;
            }
            var17_12 = Math.toRadians(v8);
            var19_13 = var1_1 - Math.sin(var17_12) * 2.0;
            var21_14 = var8_5 + Math.cos(var17_12) * 2.0;
            var23_15 = false;
            var24_16 = 0;
            while (var24_16 <= 3) {
                block29: {
                    block30: {
                        var25_17 = new xc(var19_13, var3_2 - (double)var24_16, var21_14);
                        try {
                            try {
                                v12 = var15_10;
                                if (var5_3 < 0) break block29;
                                if (v12 != null) break block30;
                                v13 = Hk.a().c(var25_17, var13_8, var14_9);
                                if (var15_10 != null) break block31;
                            }
                            catch (H v14) {
                                throw mG.a(v14);
                            }
                            if (!v13) {
                            }
                            ** GOTO lbl97
                        }
                        catch (H v15) {
                            throw mG.a(v15);
                        }
                        var23_15 = true;
                        try {
                            if (var6_4 > 0L) {
                                if (var15_10 == null) break;
                            }
                            break block30;
lbl97:


                            ++var24_16;
                        }
                        catch (H v16) {
                            throw mG.a(v16);
                        }
                    }
                    v12 = var15_10;
                }
                if (v12 == null) continue;
            }
            v13 = var23_15;
        }
        return v13;
    }

    private float a(float f, float f2, float f3) {
        float f4;
        float f5;
        block12: {
            float f6;
            block10: {
                block11: {
                    String[] stringArray;
                    block8: {
                        float f7;
                        block9: {
                            f7 = rO.d((float)(f2 - f));
                            stringArray = m6.a();
                            try {
                                try {
                                    f5 = Math.abs(f7);
                                    f6 = f3;
                                    if (stringArray != null) break block8;
                                    if (!(f5 < f6)) break block9;
                                }
                                catch (H h) {
                                    throw mG.a(h);
                                }
                                return f + f7;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                        }
                        f5 = f;
                        f6 = f7;
                    }
                    try {
                        try {
                            if (stringArray != null) break block10;
                            if (!(f6 > 0.0f)) break block11;
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                        f4 = f3;
                        break block12;
                    }
                    catch (H h) {
                        throw mG.a(h);
                    }
                }
                f6 = f3;
            }
            f4 = -f6;
        }
        return f5 + f4;
    }

    private void b() {
        int n;
        block8: {
            int[] nArray;
            int[] nArray2 = nArray = new int[]{Hk.b().i.b4.d(), Hk.b().i.br.d(), Hk.b().i.q.d(), Hk.b().i.bO.d(), Hk.b().i.Y.d()};
            int n2 = nArray2.length;
            String[] stringArray = m6.a();
            int n3 = 0;
            while (n3 < n2) {
                block7: {
                    block9: {
                        int n4 = nArray2[n3];
                        try {
                            try {
                                try {
                                    if (stringArray != null) break block7;
                                    n = n4;
                                    if (stringArray != null) break block8;
                                }
                                catch (H h) {
                                    throw mG.a(h);
                                }
                                if (n < 0) break block9;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                            bU.a((int)n4, (boolean)Keyboard.isKeyDown((int)n4));
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                    }
                    ++n3;
                }
                if (stringArray == null) continue;
            }
            n = 0;
        }
        mG.n = n;
        this.D = -1;
    }

    private boolean a() {
        int n;
        block19: {
            block21: {
                block20: {
                    String[] stringArray;
                    block16: {
                        int[] nArray;
                        int[] nArray2 = nArray = new int[]{Hk.b().i.b4.d(), Hk.b().i.br.d(), Hk.b().i.q.d(), Hk.b().i.bO.d(), Hk.b().i.Y.d()};
                        int n2 = nArray2.length;
                        int n3 = 0;
                        stringArray = m6.a();
                        while (n3 < n2) {
                            block15: {
                                block17: {
                                    boolean bl;
                                    block18: {
                                        int n4 = nArray2[n3];
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (stringArray != null) break block15;
                                                        n = n4;
                                                        if (stringArray != null) break block16;
                                                    }
                                                    catch (H h) {
                                                        throw mG.a(h);
                                                    }
                                                    if (n < 0) break block17;
                                                }
                                                catch (H h) {
                                                    throw mG.a(h);
                                                }
                                                bl = Keyboard.isKeyDown((int)n4);
                                                if (stringArray != null) break block18;
                                            }
                                            catch (H h) {
                                                throw mG.a(h);
                                            }
                                            if (!bl) break block17;
                                        }
                                        catch (H h) {
                                            throw mG.a(h);
                                        }
                                        bl = true;
                                    }
                                    return bl;
                                }
                                ++n3;
                            }
                            if (stringArray == null) continue;
                        }
                        n = Mouse.isButtonDown((int)0);
                    }
                    try {
                        try {
                            try {
                                if (stringArray != null) break block19;
                                if (n != 0) break block20;
                            }
                            catch (H h) {
                                throw mG.a(h);
                            }
                            n = Mouse.isButtonDown((int)1) ? 1 : 0;
                            if (stringArray != null) break block19;
                        }
                        catch (H h) {
                            throw mG.a(h);
                        }
                        if (n == 0) break block21;
                    }
                    catch (H h) {
                        throw mG.a(h);
                    }
                }
                n = 1;
                break block19;
            }
            n = 0;
        }
        return n != 0;
    }

    private float a(double d, double d2) {
        double d3 = d - Hk.j().ax;
        double d4 = d2 - Hk.j().av;
        return (float)(Math.atan2(d4, d3) * 180.0 / Math.PI) - 90.0f;
    }





    private void lambda$new$1(b5 var1_1) {
        block96: {
            block108: {
                block106: {
                    block107: {
                        block99: {
                            block100: {
                                block105: {
                                    block104: {
                                        block103: {
                                            block101: {
                                                block102: {
                                                    block97: {
                                                        block98: {
                                                            block95: {
                                                                block88: {
                                                                    block89: {
                                                                        block93: {
                                                                            block94: {
                                                                                block92: {
                                                                                    block91: {
                                                                                        block90: {
                                                                                            block86: {
                                                                                                block87: {
                                                                                                    block84: {
                                                                                                        block85: {
                                                                                                            block83: {
                                                                                                                var2_2 = m6.a();
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (!var1_1.h() && Hk.j() != null) break block83;
                                                                                                                    }
                                                                                                                    catch (H v0) {
                                                                                                                        throw mG.a(v0);
                                                                                                                    }
                                                                                                                    return;
                                                                                                                }
                                                                                                                catch (H v1) {
                                                                                                                    throw mG.a(v1);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v2 = this.a();
                                                                                                                            if (var2_2 != null) break block84;
                                                                                                                            if (v2 == 0) break block85;
                                                                                                                        }
                                                                                                                        catch (H v3) {
                                                                                                                            throw mG.a(v3);
                                                                                                                        }
                                                                                                                        this.z = System.currentTimeMillis();
                                                                                                                        this.f();
                                                                                                                        v2 = this.s;
                                                                                                                        if (var2_2 != null) break block84;
                                                                                                                    }
                                                                                                                    catch (H v4) {
                                                                                                                        throw mG.a(v4);
                                                                                                                    }
                                                                                                                    if (v2 != 1) break block85;
                                                                                                                }
                                                                                                                catch (H v5) {
                                                                                                                    throw mG.a(v5);
                                                                                                                }
                                                                                                                this.s = 2;
                                                                                                                this.b();
                                                                                                            }
                                                                                                            catch (H v6) {
                                                                                                                throw mG.a(v6);
                                                                                                            }
                                                                                                        }
                                                                                                        v2 = this.s;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var2_2 != null) break block86;
                                                                                                                    if (v2 != 0) break block87;
                                                                                                                }
                                                                                                                catch (H v7) {
                                                                                                                    throw mG.a(v7);
                                                                                                                }
                                                                                                                cfr_temp_0 = System.currentTimeMillis() - this.z - this.v;
                                                                                                                v2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                                                if (var2_2 != null) break block86;
                                                                                                            }
                                                                                                            catch (H v8) {
                                                                                                                throw mG.a(v8);
                                                                                                            }
                                                                                                            if (v2 <= 0) break block87;
                                                                                                        }
                                                                                                        catch (H v9) {
                                                                                                            throw mG.a(v9);
                                                                                                        }
                                                                                                        this.s = 1;
                                                                                                        this.J = Hk.j().ax;
                                                                                                        this.A = Hk.j().av;
                                                                                                        this.r = Hk.j().H;
                                                                                                        this.o = Hk.j().m;
                                                                                                        this.k = Hk.j().H;
                                                                                                        this.p = Hk.j().m;
                                                                                                        this.K = this.k;
                                                                                                        this.C = this.p;
                                                                                                        this.w.e();
                                                                                                    }
                                                                                                    catch (H v10) {
                                                                                                        throw mG.a(v10);
                                                                                                    }
                                                                                                }
                                                                                                v2 = this.s;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v11 = 2;
                                                                                                            if (var2_2 != null) break block88;
                                                                                                            if (v2 != v11) break block89;
                                                                                                        }
                                                                                                        catch (H v12) {
                                                                                                            throw mG.a(v12);
                                                                                                        }
                                                                                                        v13 = this;
                                                                                                        if (var2_2 != null) break block90;
                                                                                                    }
                                                                                                    catch (H v14) {
                                                                                                        throw mG.a(v14);
                                                                                                    }
                                                                                                    if (((Boolean)v13.I.i()).booleanValue()) break block91;
                                                                                                }
                                                                                                catch (H v15) {
                                                                                                    throw mG.a(v15);
                                                                                                }
                                                                                                this.s = 0;
                                                                                                v13 = this;
                                                                                            }
                                                                                            catch (H v16) {
                                                                                                throw mG.a(v16);
                                                                                            }
                                                                                        }
                                                                                        v13.z = System.currentTimeMillis();
                                                                                        return;
                                                                                    }
                                                                                    var3_3 = Hk.j().H;
                                                                                    var4_5 = Hk.j().m;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                this.h();
                                                                                                this.k = this.a(this.k, var3_3, this.q * 5.0f);
                                                                                                this.p = rO.a((float)this.a(this.p, var4_5, this.F * 5.0f), (float)-90.0f, (float)90.0f);
                                                                                                dL.b((float[])new float[]{this.k, this.p});
                                                                                                cfr_temp_1 = Math.abs(rO.d((float)(this.k - var3_3))) - 1.0f;
                                                                                                v17 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                                                if (var2_2 != null) break block92;
                                                                                                if (v17 >= 0) break block93;
                                                                                            }
                                                                                            catch (H v18) {
                                                                                                throw mG.a(v18);
                                                                                            }
                                                                                            v19 = this;
                                                                                            if (var2_2 != null) break block94;
                                                                                        }
                                                                                        catch (H v20) {
                                                                                            throw mG.a(v20);
                                                                                        }
                                                                                        cfr_temp_2 = Math.abs(v19.p - var4_5) - 1.0f;
                                                                                        v17 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                                    }
                                                                                    catch (H v21) {
                                                                                        throw mG.a(v21);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v17 >= 0) break block93;
                                                                                    this.s = 0;
                                                                                    v19 = this;
                                                                                }
                                                                                catch (H v22) {
                                                                                    throw mG.a(v22);
                                                                                }
                                                                            }
                                                                            v19.z = System.currentTimeMillis();
                                                                        }
                                                                        return;
                                                                    }
                                                                    try {
                                                                        v2 = this.s;
                                                                        if (var2_2 != null) break block95;
                                                                        v11 = 1;
                                                                    }
                                                                    catch (H v23) {
                                                                        throw mG.a(v23);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v2 != v11) break block96;
                                                                    this.h();
                                                                    this.k = this.a(this.k, this.K, this.q);
                                                                    this.p = rO.a((float)this.a(this.p, this.C, this.F), (float)-90.0f, (float)90.0f);
                                                                    v2 = mG.n;
                                                                }
                                                                catch (H v24) {
                                                                    throw mG.a(v24);
                                                                }
                                                            }
                                                            try {
                                                                if (var2_2 != null) break block97;
                                                                if (v2 > 0) break block98;
                                                            }
                                                            catch (H v25) {
                                                                throw mG.a(v25);
                                                            }
                                                            var3_4 = 5000L / Math.max(((Number)this.m.i()).longValue(), 1L);
                                                            try {
                                                                try {
                                                                    v2 = (int)this.w.a(var3_4);
                                                                    if (var2_2 != null) break block97;
                                                                    if (v2 == 0) break block98;
                                                                }
                                                                catch (H v26) {
                                                                    throw mG.a(v26);
                                                                }
                                                                this.g();
                                                                this.w.e();
                                                            }
                                                            catch (H v27) {
                                                                throw mG.a(v27);
                                                            }
                                                        }
                                                        v2 = mG.n;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var2_2 != null) break block99;
                                                                    if (v2 <= 0) break block100;
                                                                }
                                                                catch (H v28) {
                                                                    throw mG.a(v28);
                                                                }
                                                                v29 = this.D;
                                                                v30 = -1 != 0;
                                                                if (var2_2 != null) break block101;
                                                            }
                                                            catch (H v31) {
                                                                throw mG.a(v31);
                                                            }
                                                            if (v29 == v30) break block102;
                                                        }
                                                        catch (H v32) {
                                                            throw mG.a(v32);
                                                        }
                                                        bU.a((int)this.D, (boolean)true);
                                                    }
                                                    catch (H v33) {
                                                        throw mG.a(v33);
                                                    }
                                                }
                                                v29 = Hk.b().i.Y.d();
                                                v30 = Hk.j().K;
                                            }
                                            try {
                                                try {
                                                    if (var2_2 != null) break block103;
                                                    if (!v30) break block104;
                                                }
                                                catch (H v34) {
                                                    throw mG.a(v34);
                                                }
                                                v30 = Hk.j().al;
                                            }
                                            catch (H v35) {
                                                throw mG.a(v35);
                                            }
                                        }
                                        try {
                                            if (var2_2 != null) break block105;
                                            if (!v30) break block104;
                                        }
                                        catch (H v36) {
                                            throw mG.a(v36);
                                        }
                                        v30 = true;
                                        break block105;
                                    }
                                    v30 = false;
                                }
                                try {
                                    try {
                                        bU.a((int)v29, (boolean)v30);
                                        v2 = --mG.n;
                                        if (var2_2 != null) break block99;
                                        if (v2 > 0) break block100;
                                    }
                                    catch (H v37) {
                                        throw mG.a(v37);
                                    }
                                    this.b();
                                }
                                catch (H v38) {
                                    throw mG.a(v38);
                                }
                            }
                            v2 = (int)((Boolean)this.t.i()).booleanValue();
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (var2_2 != null) break block106;
                                        if (v2 == 0) {
                                        }
                                        ** GOTO lbl282
                                    }
                                    catch (H v39) {
                                        throw mG.a(v39);
                                    }
                                    v2 = (int)((Boolean)this.y.i()).booleanValue();
                                    if (var2_2 != null) break block107;
                                }
                                catch (H v40) {
                                    throw mG.a(v40);
                                }
                                if (v2 == 0) break block96;
                            }
                            catch (H v41) {
                                throw mG.a(v41);
                            }
                            cfr_temp_3 = Hk.j().i(this.J, Hk.j().e, this.A) - ((Number)this.u.i()).doubleValue();
                            v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                        }
                        catch (H v42) {
                            throw mG.a(v42);
                        }
                    }
                    try {
                        try {
                            if (var2_2 != null) break block106;
                            if (v2 <= 0) break block96;
                        }
                        catch (H v43) {
                            throw mG.a(v43);
                        }
lbl282:


                        v2 = (int)((Boolean)this.I.i()).booleanValue();
                    }
                    catch (H v44) {
                        throw mG.a(v44);
                    }
                }
                try {
                    if (var2_2 != null) break block108;
                    if (v2 != 0) {
                    }
                    ** GOTO lbl302
                }
                catch (H v45) {
                    throw mG.a(v45);
                }
                v2 = 2;
            }
            try {
                v46 = new float[v2];
                v46[0] = this.k;
                v46[1] = this.p;
                dL.b((float[])v46);
                if (var2_2 == null) break block96;
lbl302:


                Hk.j().H = this.k;
                Hk.j().m = this.p;
            }
            catch (H v47) {
                throw mG.a(v47);
            }
        }
    }

    private void lambda$new$0(H6 h6) {
        this.s = 0;
        this.b();
        this.z = System.currentTimeMillis();
    }




    static {
        block11: {
            block10: {
                mG.L = _c.a((long)4050237762532166073L, (long)-4531354117854457652L, MethodHandles.lookup().lookupClass()).a(168697955708078L);
                mG.O = new HashMap<K, V>(13);
                var0 = mG.L ^ 113634212016493L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[21];
                var7_4 = 0;
                var6_5 = "8>Tl2\u00ee\u00b8mS\u00b0\u0089WY\u00aa\u00ca\u00cf\u00fa\u00ee\u0082\u0082T_~\u00de \u00d9\u00c8\u00f6CRel\u0082\u00e7\u00a6\u00f0\u00d7[\tm\u00dd\u00ec\u00e9\u00b6\u00b8A}\u0005\u00ab\u001a5\u00e0\u0005\u00a2\u0081\u00f5\u00bc\u0018\u00a1.\u00c2\u00a7m\u00e5;\u0018@\u00df\u00c2o|1\u0018z\u0092\u00ee\u00b8\u0006\u009a\u00a8\u00b4Y\u0010\u00ce\u0087\u0096pw\u001b\u00c3)\u00bf\u00e7-\u00f3\u0001?!\u00b68\u000149l\u00d0w\u0019\u008b\u0096_\u0085\u0017\u0004\u00f2_\u0086\u00d4\u0007\u00e06\u00ef\u00c3&?Q|\u00c8/</\u00fa}Z\u001e!#\u00ca;\u00f3g\u001a\u0080\u00ca\u0016\u001cx\u00e5\u0010*\n$\u0017\u00ea:\u00c7\u00d0P\u0002\u00a7\u00b2\u00db\u00b3\u0091\u0010\u00a1{\u00b5S\t\u0089'\u00e8\u001fMuG\u00det\u0017\u00fe\u00b9;\u00a8Xi\u00ba\u00ee\u0095\u0017\u00b3-I\u001d\u008f?\u00c7\u00ff\u0085&E{\"\u001b\u00d2\u00f2GK\u00a7+\u0005W}\u00a2_\u0000\u00b4\u00a3\u00cc@8\u0099(k\u0010\u00da\u00c9\r\u00b4M\u00d8\u00ae78rfN\u0001p) \u00e3\u00b0Yz\u009b\n\u00c1}\u007f\u00f9iN\u0082\u0010>o\u00c2\u00a8\u00ea\u0094\u0004&$\u00ba\u0092\u0013\u00ca\u00cc\u00f0\u00a0\u008a\u00c0C\u00a9\u009c\u00cd\u0090U*\u00ce\u00df\u00c2l\nZ\u00cbx\u00afcy\u00b8\u00a9\u00a1f\u00e45?\u00fa\u00cf\u00a5Q\u00cdJ\u00e8eB0N&s\u00c4\u0095\u00d4\u00d3\u00a7\u008dzE\u00f1\"\u00f2\u00de\u00f9\u00b2N\u00eb\u0094k\u00b9r;>\u009e<2\u00c2F-R\u008c\u00c8\u00c2\u008f\u00bb\u0091\u0093\u00ffN\u0085]`\u00e1\u00a6k\u008f\u008cdF\u00ec*R)\u009a\u00e4\u00a5\u0082^\u001d\u00fa\u00aeL\u00b6\u00b6\u00d0\u00e43\u001cQ\u00e3\u00a4\u00d5K\u0092\u00e5\u00c7\u00c1\u0000(\u00d3\u00a1\u009d\u008a[\u0005B0\u00ce\u00ca\u0019\u0014\u0091\u00f1gRZ\u00f1\u0085\u0016q\u0099qTG\u00eco\u0094\u00e1\u0081\u00a4X\u0081\u00f8\u001d\u00b4n/\u00be:\u00d4V\u009f>O+\u0083\u0084\u00d0X\u00a9]\u00cc\u00e5;7yd\u00c8 \b!\u0096\r\u00eb\u00f9\t\nr\u00ab\u0002\u00d9Z\u00b8[\u0081\u001e\u009fv<H\u00e4\u00fd\u00f3s>\u00b0eU\u00aa\u00b8}8\u0001\u00ad\b\u0087\u0092r%\u00f1LEu\u0006\u0017:~\u0006\u0012\u008cI\u00f6r\u00d7i\u0086%\u001c\u00bc\u008c\u009c6\b/\u00c8GX\u00df\u00c9(\u007f\u009ad\u00cd\u0011+\u0095P\u0090jo\u0097\u00121\r>\u00e9\u00ee\u0018y\u00a90\u0085\u001c\u009a\u00dfi\u001e\u00b1H\u0017\u00c0\u00f2\u00be\u009f\u0089\u0004\u0096\u0095\u001d\u00d6\u0083\u00ab\u0010,Qr\u00e17\u0093\u0007D\u00d1g\u0018\u008eZf\u0010\u00ecp\u00ce\u00d7L\f\u00bdH\u00ea\u00b0M\u0080V,\u00d4\u0019\u008f\u00cdtZ\u00d5\u00a5L\u00d3<\u00ef\n\u001d\u00e2\u00f2\u00fe>,\r\u009e\u00e8\u00d4\u00c5\u00d2\u0089\r\u00f7\u009b\u00d3C\u009dT\u00f4\u00eb\u007f\u00d9\u00f1\u00ae\u00ec)U\u009b%:>\u00fbL\u00aa\u0005\u00ab2\u0086\u00821\u0019!\u00ba\u0019g\u00ad\u00d8\u00f7\u00f0\u00fc\u0007\u008fg8\u00f99G\u0002\u00a4\u000e&\u00dcW\u00f2d\u00ce\n\bC\u0007\u0017\u008a'\u00bf\u00f5;3\u00af\u00a5\u009b\u00cd\u009d\u00bc\u0096\u00b6\u0018\u008a6kB\u00c7YA\u00fdM\u008a\u0001H\u0097/\u00a6X\u00ae\u00ab\u00aeu\u00839g\u00b0\u0010\u00ebS2\u00e7\u009e\u00b0\u00f3\u0013\u0003\u00f8\u00c1\u00b3J\u00ce\u00a7\u00f8Xqq)\u00047\u00cd(GM\u00de\u00b8\u0089,\"\u00c6:\u00f8&AQ\u0093\u009a\u00e4>\u0004g\u008c\u00ff\u00d7}\u00c8h3\u00af\u0004@V#\u00e3%\u0089\\Ob4p\u00f4\u00cc\u00e8\u0013v\u00c4M\u00a4\u0094\u00ba\u00ba\u00e0\u000eC\u00c4z\u0005\u0010=gw\u00ecT\u00e2\u008cPx\u008a&\u009fC\u00af\u0086>o\u009e\u00d1\u00ea|x\u0085w8N\u009c#R\b\u00d8\u00fd\u0000\b\u00d3U\u000b\u0081\\\u00cb\u00cc\u00f4b);\u0092XQB^\u0000\u00ac\u00d7\u009a\u0094\f\u007f\u00a1\u00e5|\u007foj\u00c36%\u00b5e\u008d\u00c6\u009eTuy\u00d7\u00a6b\u000fY\u00ae{ \u0082\u00d2QFP\u0083\u0011\u00163\u00cc7\u0081k\u00dd4\u009dp7@\u00e1?1\u0094+;\u00a3\u0000\u00a0\u0003\u0002\u00d4\u00cb \u00df!\u00d0-:\u00f6\u00e7\u00b25)\u0099g\u00a6\f+6\u009f\u00d4qH5\u00013My\u009e1,;\u001a4\u00b5";
                var8_6 = "8>Tl2\u00ee\u00b8mS\u00b0\u0089WY\u00aa\u00ca\u00cf\u00fa\u00ee\u0082\u0082T_~\u00de \u00d9\u00c8\u00f6CRel\u0082\u00e7\u00a6\u00f0\u00d7[\tm\u00dd\u00ec\u00e9\u00b6\u00b8A}\u0005\u00ab\u001a5\u00e0\u0005\u00a2\u0081\u00f5\u00bc\u0018\u00a1.\u00c2\u00a7m\u00e5;\u0018@\u00df\u00c2o|1\u0018z\u0092\u00ee\u00b8\u0006\u009a\u00a8\u00b4Y\u0010\u00ce\u0087\u0096pw\u001b\u00c3)\u00bf\u00e7-\u00f3\u0001?!\u00b68\u000149l\u00d0w\u0019\u008b\u0096_\u0085\u0017\u0004\u00f2_\u0086\u00d4\u0007\u00e06\u00ef\u00c3&?Q|\u00c8/</\u00fa}Z\u001e!#\u00ca;\u00f3g\u001a\u0080\u00ca\u0016\u001cx\u00e5\u0010*\n$\u0017\u00ea:\u00c7\u00d0P\u0002\u00a7\u00b2\u00db\u00b3\u0091\u0010\u00a1{\u00b5S\t\u0089'\u00e8\u001fMuG\u00det\u0017\u00fe\u00b9;\u00a8Xi\u00ba\u00ee\u0095\u0017\u00b3-I\u001d\u008f?\u00c7\u00ff\u0085&E{\"\u001b\u00d2\u00f2GK\u00a7+\u0005W}\u00a2_\u0000\u00b4\u00a3\u00cc@8\u0099(k\u0010\u00da\u00c9\r\u00b4M\u00d8\u00ae78rfN\u0001p) \u00e3\u00b0Yz\u009b\n\u00c1}\u007f\u00f9iN\u0082\u0010>o\u00c2\u00a8\u00ea\u0094\u0004&$\u00ba\u0092\u0013\u00ca\u00cc\u00f0\u00a0\u008a\u00c0C\u00a9\u009c\u00cd\u0090U*\u00ce\u00df\u00c2l\nZ\u00cbx\u00afcy\u00b8\u00a9\u00a1f\u00e45?\u00fa\u00cf\u00a5Q\u00cdJ\u00e8eB0N&s\u00c4\u0095\u00d4\u00d3\u00a7\u008dzE\u00f1\"\u00f2\u00de\u00f9\u00b2N\u00eb\u0094k\u00b9r;>\u009e<2\u00c2F-R\u008c\u00c8\u00c2\u008f\u00bb\u0091\u0093\u00ffN\u0085]`\u00e1\u00a6k\u008f\u008cdF\u00ec*R)\u009a\u00e4\u00a5\u0082^\u001d\u00fa\u00aeL\u00b6\u00b6\u00d0\u00e43\u001cQ\u00e3\u00a4\u00d5K\u0092\u00e5\u00c7\u00c1\u0000(\u00d3\u00a1\u009d\u008a[\u0005B0\u00ce\u00ca\u0019\u0014\u0091\u00f1gRZ\u00f1\u0085\u0016q\u0099qTG\u00eco\u0094\u00e1\u0081\u00a4X\u0081\u00f8\u001d\u00b4n/\u00be:\u00d4V\u009f>O+\u0083\u0084\u00d0X\u00a9]\u00cc\u00e5;7yd\u00c8 \b!\u0096\r\u00eb\u00f9\t\nr\u00ab\u0002\u00d9Z\u00b8[\u0081\u001e\u009fv<H\u00e4\u00fd\u00f3s>\u00b0eU\u00aa\u00b8}8\u0001\u00ad\b\u0087\u0092r%\u00f1LEu\u0006\u0017:~\u0006\u0012\u008cI\u00f6r\u00d7i\u0086%\u001c\u00bc\u008c\u009c6\b/\u00c8GX\u00df\u00c9(\u007f\u009ad\u00cd\u0011+\u0095P\u0090jo\u0097\u00121\r>\u00e9\u00ee\u0018y\u00a90\u0085\u001c\u009a\u00dfi\u001e\u00b1H\u0017\u00c0\u00f2\u00be\u009f\u0089\u0004\u0096\u0095\u001d\u00d6\u0083\u00ab\u0010,Qr\u00e17\u0093\u0007D\u00d1g\u0018\u008eZf\u0010\u00ecp\u00ce\u00d7L\f\u00bdH\u00ea\u00b0M\u0080V,\u00d4\u0019\u008f\u00cdtZ\u00d5\u00a5L\u00d3<\u00ef\n\u001d\u00e2\u00f2\u00fe>,\r\u009e\u00e8\u00d4\u00c5\u00d2\u0089\r\u00f7\u009b\u00d3C\u009dT\u00f4\u00eb\u007f\u00d9\u00f1\u00ae\u00ec)U\u009b%:>\u00fbL\u00aa\u0005\u00ab2\u0086\u00821\u0019!\u00ba\u0019g\u00ad\u00d8\u00f7\u00f0\u00fc\u0007\u008fg8\u00f99G\u0002\u00a4\u000e&\u00dcW\u00f2d\u00ce\n\bC\u0007\u0017\u008a'\u00bf\u00f5;3\u00af\u00a5\u009b\u00cd\u009d\u00bc\u0096\u00b6\u0018\u008a6kB\u00c7YA\u00fdM\u008a\u0001H\u0097/\u00a6X\u00ae\u00ab\u00aeu\u00839g\u00b0\u0010\u00ebS2\u00e7\u009e\u00b0\u00f3\u0013\u0003\u00f8\u00c1\u00b3J\u00ce\u00a7\u00f8Xqq)\u00047\u00cd(GM\u00de\u00b8\u0089,\"\u00c6:\u00f8&AQ\u0093\u009a\u00e4>\u0004g\u008c\u00ff\u00d7}\u00c8h3\u00af\u0004@V#\u00e3%\u0089\\Ob4p\u00f4\u00cc\u00e8\u0013v\u00c4M\u00a4\u0094\u00ba\u00ba\u00e0\u000eC\u00c4z\u0005\u0010=gw\u00ecT\u00e2\u008cPx\u008a&\u009fC\u00af\u0086>o\u009e\u00d1\u00ea|x\u0085w8N\u009c#R\b\u00d8\u00fd\u0000\b\u00d3U\u000b\u0081\\\u00cb\u00cc\u00f4b);\u0092XQB^\u0000\u00ac\u00d7\u009a\u0094\f\u007f\u00a1\u00e5|\u007foj\u00c36%\u00b5e\u008d\u00c6\u009eTuy\u00d7\u00a6b\u000fY\u00ae{ \u0082\u00d2QFP\u0083\u0011\u00163\u00cc7\u0081k\u00dd4\u009dp7@\u00e1?1\u0094+;\u00a3\u0000\u00a0\u0003\u0002\u00d4\u00cb \u00df!\u00d0-:\u00f6\u00e7\u00b25)\u0099g\u00a6\f+6\u009f\u00d4qH5\u00013My\u009e1,;\u001a4\u00b5".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:


                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:


                while (true) {
                    var9_3[var7_4++] = mG.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "].\u00c10\u00e2$\u0095\u00b3\u00b0z\u0002~\u00fa1\u00c5\u009cx\u00f9M\u007fL\u0006\u0083\u00b7\u009b\u0089\r\u0018\u00f8\u00d2\u00e5@fY'\u00e1\u0002\u00e2;\u00daH\u0019\u00dbq U\u00d90 \u009c\u00a5\u00d0\u00b2\t\u0086\u00ba\r\u009b(uY\u0015*\u001cN$\u00c5\f!\u00ec\u008b\u00dd@\u00c3dT\u00d3`\u008e\u000b\u00d8\u00e4N7\u00e1\u00b1\u00ae\u0012gj\u00e8\u009b\u00de\u00e1(.5\u00a1D\u00e1C^1^\u00c6\u00a5\u00c2\u007fQR\u00b0\u00d4\u0013\u00e4G\u0094B\u00fa#\u007fA\u0088\u0097A\u00fa\\\u00ebT\u000e}\u00ba\u00a2\u0091\u0000b\u0006]";
                    var8_6 = "].\u00c10\u00e2$\u0095\u00b3\u00b0z\u0002~\u00fa1\u00c5\u009cx\u00f9M\u007fL\u0006\u0083\u00b7\u009b\u0089\r\u0018\u00f8\u00d2\u00e5@fY'\u00e1\u0002\u00e2;\u00daH\u0019\u00dbq U\u00d90 \u009c\u00a5\u00d0\u00b2\t\u0086\u00ba\r\u009b(uY\u0015*\u001cN$\u00c5\f!\u00ec\u008b\u00dd@\u00c3dT\u00d3`\u008e\u000b\u00d8\u00e4N7\u00e1\u00b1\u00ae\u0012gj\u00e8\u009b\u00de\u00e1(.5\u00a1D\u00e1C^1^\u00c6\u00a5\u00c2\u007fQR\u00b0\u00d4\u0013\u00e4G\u0094B\u00fa#\u007fA\u0088\u0097A\u00fa\\\u00ebT\u000e}\u00ba\u00a2\u0091\u0000b\u0006]".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:


                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:


                while (true) {
                    var9_3[var7_4++] = mG.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:


                ** continue;
            }
        }
        mG.M = var9_3;
        mG.N = new String[21];
        mG.n = 0;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x23D4;
        if (N[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])O.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    O.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mG", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = M[n2].getBytes("ISO-8859-1");
            mG.N[n2] = mG.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return N[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mG.a(n, l);
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
            throw new RuntimeException("mG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mG.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
