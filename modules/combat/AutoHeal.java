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

public class lW
extends lh {
    private final kt<Boolean> p;
    private final kt<Number> y;
    private final kt<Number> u;
    private final kt<Number> s;
    private final kt<Boolean> n;
    private final kt<Boolean> F;
    private final kt<Number> q;
    private final kt<Number> z;
    private final kt<Number> G;
    private final kt<Boolean> H;
    kt<wK> B;
    kt<wK> D;
    private final kt<Boolean> k;
    private final kt<Number> t;
    private final kt<Boolean> C;
    private final Pd x;
    private long w;
    private int o;
    private int l;
    private boolean A;
    private boolean v;
    private boolean m;
    private int r;
    @A
    public final R8<b5> E;
    private static final long I;
    private static final String[] J;
    private static final String[] K;
    private static final Map L;

    public lW(EU eU, long l, int n) {
        long l2 = (l << 32 | (long)n << 32 >>> 32) ^ I;
        super(eU);
        this.p = new kt((String)((Object)lW.a("o", (int)9325, (long)(0x6CE268ED42A20A42L ^ l2))), (Object)true, (String)((Object)lW.a("o", (int)13376, (long)(0x3695BEC68A0E9A70L ^ l2))));
        this.y = new kt((String)((Object)lW.a("o", (int)6963, (long)(0x51B9F47D2C6C3504L ^ l2))), (Object)4, (String)((Object)lW.a("o", (int)30332, (long)(0x4E54B532477FD854L ^ l2))), 0.1, 0.1, 9.5, () -> this.p.i());
        this.u = new kt((String)((Object)lW.a("o", (int)18042, (long)(0x3E6EC59F1D3E859L ^ l2))), (Object)400, "", 1.0, 100.0, 1000.0, (String)((Object)lW.a("o", (int)28296, (long)(0x2BBA99DCC43F40BCL ^ l2))), () -> this.p.i());
        this.s = new kt((String)((Object)lW.a("o", (int)6555, (long)(0x7ACA653372FAB7BFL ^ l2))), (Object)500, "", 1.0, 100.0, 1000.0, (String)((Object)lW.a("o", (int)6945, (long)(0x5FDA8AC503E8B500L ^ l2))), () -> this.p.i());
        this.n = new kt((String)((Object)lW.a("o", (int)8447, (long)(0x7AAFF9FD4E380ECAL ^ l2))), (Object)true, (String)((Object)lW.a("o", (int)7616, (long)(0x6C95688C900F33EBL ^ l2))), () -> this.p.i());
        this.F = new kt((String)((Object)lW.a("o", (int)23775, (long)(0x5AC52BE8C503F2EEL ^ l2))), (Object)true, (String)((Object)lW.a("o", (int)8215, (long)(0x1AAC944992A28E21L ^ l2))));
        this.q = new kt((String)((Object)lW.a("o", (int)14419, (long)(0x44D2FC2EE4339668L ^ l2))), (Object)4, (String)((Object)lW.a("o", (int)18777, (long)(0x62DC8DBAD2A4E770L ^ l2))), 0.1, 0.1, 9.5, () -> this.F.i());
        this.z = new kt((String)((Object)lW.a("o", (int)15520, (long)(0x21BCA949EF6F1299L ^ l2))), (Object)400, "", 1.0, 100.0, 1000.0, (String)((Object)lW.a("o", (int)6945, (long)(0x5FDA8AC503E8B500L ^ l2))), () -> this.F.i());
        this.G = new kt((String)((Object)lW.a("o", (int)5598, (long)(0x7CEA3F2EF7FD3BE4L ^ l2))), (Object)500, "", 1.0, 100.0, 1000.0, (String)((Object)lW.a("o", (int)6945, (long)(0x5FDA8AC503E8B500L ^ l2))), () -> this.F.i());
        this.H = new kt((String)((Object)lW.a("o", (int)7112, (long)(0x47B04F70C8735FBL ^ l2))), (Object)false, (String)((Object)lW.a("o", (int)19916, (long)(0x1B4AF7699FCBE3E1L ^ l2))), () -> this.F.i());
        this.B = new kt((String)((Object)lW.a("o", (int)12553, (long)(0x77ADB16CD8121F27L ^ l2))), new kt[]{this.p, this.y, this.u, this.s, this.n});
        this.D = new kt((String)((Object)lW.a("o", (int)28601, (long)(0x44A7C3FE9F50C195L ^ l2))), new kt[]{this.F, this.q, this.z, this.G, this.H});
        this.k = new kt((String)((Object)lW.a("o", (int)3899, (long)(0x20AB25B38B3EA109L ^ l2))), (Object)true, (String)((Object)lW.a("o", (int)18414, (long)(0x7F0F7FC6B35BE9C8L ^ l2))));
        this.t = new kt((String)((Object)lW.a("o", (int)6031, (long)(0xA6524AD3088B9AFL ^ l2))), (Object)6, (String)((Object)lW.a("o", (int)20112, (long)(0x45AAF845D16860B7L ^ l2))), 1.0, 1.0, 9.0, () -> this.k.g());
        this.C = new kt((String)((Object)lW.a("o", (int)25134, (long)(0x6611C602C559CC0BL ^ l2))), (Object)true, (String)((Object)lW.a("o", (int)30924, (long)(0x78850270247556EEL ^ l2))));
        this.x = new Pd();
        this.w = 0L;
        this.o = -1;
        this.l = -1;
        this.E = this::lambda$new$0;
        this.a(new kt[]{this.B, this.D, this.t, this.k, this.C});
    }

    public void d(int n, int n2, int n3) {
        long l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
        long l2 = l ^ 0L;
        int n4 = (int)(l2 >>> 32);
        int n5 = (int)(l2 << 32 >>> 48);
        int n6 = (int)(l2 << 48 >>> 48);
        super.d(n4, n5, n6);
        this.x.e();
        this.A = false;
        this.v = false;
        this.o = -1;
        this.l = -1;
        this.r = 0;
        this.a(this.u.m(), this.s.m());
    }

    public void a(char c, long l) {
        long l2 = (long)c << 48 | l << 16 >>> 16;
        long l3 = l2 ^ 0L;
        int n = (int)(l3 >>> 48);
        long l4 = l3 << 16 >>> 16;
        super.a((char)n, l4);
        this.b();
        this.r = 0;
    }




    private void f(char var1_1, short var2_2, int var3_3) {
        block77: {
            block86: {
                block87: {
                    block84: {
                        block81: {
                            block82: {
                                block80: {
                                    block78: {
                                        block76: {
                                            block73: {
                                                block75: {
                                                    block74: {
                                                        block71: {
                                                            block72: {
                                                                block69: {
                                                                    block70: {
                                                                        block68: {
                                                                            block67: {
                                                                                block66: {
                                                                                    block65: {
                                                                                        block64: {
                                                                                            block63: {
                                                                                                var4_4 = ((long)var1_1 << 48 | (long)var2_2 << 48 >>> 16 | (long)var3_3 << 32 >>> 32) ^ lW.I;
                                                                                                v0 = var4_4 ^ 22269109562246L;
                                                                                                var6_5 = (int)(v0 >>> 32);
                                                                                                var7_6 = (int)(v0 << 32 >>> 48);
                                                                                                var8_7 = (int)(v0 << 48 >>> 48);
                                                                                                var9_8 = lX.f();
                                                                                                try {
                                                                                                    if (!this.x.a(this.w)) {
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                                catch (H v1) {
                                                                                                    throw lW.a(v1);
                                                                                                }
                                                                                                var10_9 = Hk.j().a();
                                                                                                try {
                                                                                                    try {
                                                                                                        v2 = ((Boolean)this.F.i()).booleanValue();
                                                                                                        v3 = var9_8;
                                                                                                        if (var1_1 >= '\u0000') {
                                                                                                            if (v3 != null) break block63;
                                                                                                            if (v2 == 0) break block64;
                                                                                                        }
                                                                                                        ** GOTO lbl35
                                                                                                    }
                                                                                                    catch (H v4) {
                                                                                                        throw lW.a(v4);
                                                                                                    }
                                                                                                    cfr_temp_0 = var10_9 - this.q.k() * 2.0f;
                                                                                                    v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                }
                                                                                                catch (H v5) {
                                                                                                    throw lW.a(v5);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                v3 = var9_8;
lbl35:


                                                                                                if (v3 != null) break block65;
                                                                                                if (v2 > 0) break block64;
                                                                                            }
                                                                                            catch (H v6) {
                                                                                                throw lW.a(v6);
                                                                                            }
                                                                                            v2 = 1;
                                                                                            break block65;
                                                                                        }
                                                                                        v2 = 0;
                                                                                    }
                                                                                    var11_10 = v2;
                                                                                    try {
                                                                                        try {
                                                                                            v7 = ((Boolean)this.p.i()).booleanValue();
                                                                                            v8 = var9_8;
                                                                                            if (var1_1 >= '\u0000') {
                                                                                                if (v8 != null) break block66;
                                                                                                if (v7 == 0) break block67;
                                                                                            }
                                                                                            ** GOTO lbl65
                                                                                        }
                                                                                        catch (H v9) {
                                                                                            throw lW.a(v9);
                                                                                        }
                                                                                        cfr_temp_1 = var10_9 - this.y.k() * 2.0f;
                                                                                        v7 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                                    }
                                                                                    catch (H v10) {
                                                                                        throw lW.a(v10);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    v8 = var9_8;
lbl65:


                                                                                    if (v8 != null) break block68;
                                                                                    if (v7 > 0) break block67;
                                                                                }
                                                                                catch (H v11) {
                                                                                    throw lW.a(v11);
                                                                                }
                                                                                v7 = 1;
                                                                                break block68;
                                                                            }
                                                                            v7 = 0;
                                                                        }
                                                                        var12_11 = v7;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v12 = var11_10;
                                                                                            if (var9_8 != null) break block69;
                                                                                            if (v12 == 0) break block70;
                                                                                        }
                                                                                        catch (H v13) {
                                                                                            throw lW.a(v13);
                                                                                        }
                                                                                        v12 = (int)((Boolean)this.H.i()).booleanValue();
                                                                                        if (var9_8 != null) break block69;
                                                                                    }
                                                                                    catch (H v14) {
                                                                                        throw lW.a(v14);
                                                                                    }
                                                                                    if (v12 == 0) break block70;
                                                                                }
                                                                                catch (H v15) {
                                                                                    throw lW.a(v15);
                                                                                }
                                                                                v12 = (int)Hk.j().a(d7.B);
                                                                                if (var9_8 != null) break block69;
                                                                            }
                                                                            catch (H v16) {
                                                                                throw lW.a(v16);
                                                                            }
                                                                            if (v12 == 0) break block70;
                                                                        }
                                                                        catch (H v17) {
                                                                            throw lW.a(v17);
                                                                        }
                                                                        var11_10 = 0;
                                                                    }
                                                                    v12 = -1;
                                                                }
                                                                var13_12 = v12;
                                                                var14_13 = false;
                                                                try {
                                                                    v18 = var11_10;
                                                                    if (var1_1 < '\u0000' || var9_8 != null) break block71;
                                                                    if (v18 == 0) break block72;
                                                                }
                                                                catch (H v19) {
                                                                    throw lW.a(v19);
                                                                }
                                                                var13_12 = this.d(var6_5, (char)var7_6, (char)var8_7);
                                                            }
                                                            v18 = var13_12;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v20 = -1;
                                                                    v21 = var9_8;
                                                                    if (var1_1 >= '\u0000') {
                                                                        if (v21 != null) break block73;
                                                                        if (v18 != v20) break block74;
                                                                    }
                                                                    ** GOTO lbl153
                                                                }
                                                                catch (H v22) {
                                                                    throw lW.a(v22);
                                                                }
                                                                v18 = var12_11;
                                                                if (var9_8 != null) break block75;
                                                            }
                                                            catch (H v23) {
                                                                throw lW.a(v23);
                                                            }
                                                            if (v18 == 0) break block74;
                                                        }
                                                        catch (H v24) {
                                                            throw lW.a(v24);
                                                        }
                                                        var13_12 = this.e();
                                                        var14_13 = true;
                                                    }
                                                    v18 = var13_12;
                                                }
                                                v20 = -1;
                                            }
                                            try {
                                                try {
                                                    v21 = var9_8;
lbl153:


                                                    if (var3_3 > 0) {
                                                        if (v21 != null) break block76;
                                                        if (v18 == v20) break block77;
                                                    }
                                                    ** GOTO lbl171
                                                }
                                                catch (H v25) {
                                                    throw lW.a(v25);
                                                }
                                                this.o = Hk.j().bU.g;
                                                v18 = var13_12;
                                                v20 = 36;
                                            }
                                            catch (H v26) {
                                                throw lW.a(v26);
                                            }
                                        }
                                        try {
                                            block79: {
                                                try {
                                                    try {
                                                        v21 = var9_8;
lbl171:


                                                        if (v21 != null) break block78;
                                                        if (v18 < v20) break block79;
                                                    }
                                                    catch (H v27) {
                                                        throw lW.a(v27);
                                                    }
                                                    this.l = var13_12 - 36;
                                                    if (var2_2 <= 0 || var9_8 == null) break block80;
                                                }
                                                catch (H v28) {
                                                    throw lW.a(v28);
                                                }
                                            }
                                            this.l = this.t.m() - 1;
                                            v18 = var13_12;
                                            v20 = this.l;
                                        }
                                        catch (H v29) {
                                            throw lW.a(v29);
                                        }
                                    }
                                    cf.a((int)v18, (int)v20);
                                }
                                try {
                                    block83: {
                                        try {
                                            try {
                                                try {
                                                    v30 = this.l;
                                                    if (var2_2 < 0 || var9_8 != null) break block81;
                                                    if (v30 == this.o) break block82;
                                                }
                                                catch (H v31) {
                                                    throw lW.a(v31);
                                                }
                                                if (var3_3 < 0) break block82;
                                                if (!((Boolean)this.C.i()).booleanValue()) break block83;
                                            }
                                            catch (H v32) {
                                                throw lW.a(v32);
                                            }
                                            Ab.c((I2)new ja(this.l));
                                            if (var1_1 >= '\u0000') {
                                                if (var9_8 == null) break block82;
                                            }
                                            ** GOTO lbl223
                                        }
                                        catch (H v33) {
                                            throw lW.a(v33);
                                        }
                                    }
                                    Hk.j().bU.g = this.l;
                                }
                                catch (H v34) {
                                    throw lW.a(v34);
                                }
                            }
                            try {
                                this.A = true;
                                this.v = false;
                                this.m = var14_13;
lbl223:


                                if (var2_2 > 0) {
                                    v35 = this;
                                    v36 = 1;
                                    if (var9_8 != null) break block84;
                                    v35.r = v36;
                                }
                                v30 = (int)var14_13;
                            }
                            catch (H v37) {
                                throw lW.a(v37);
                            }
                        }
                        try {
                            block85: {
                                try {
                                    if (v30 == 0) break block85;
                                    v38 = this;
                                    if (var3_3 <= 0) break block86;
                                    v38.a(this.u.m(), this.s.m());
                                    if (var9_8 == null) break block87;
                                }
                                catch (H v39) {
                                    throw lW.a(v39);
                                }
                            }
                            v35 = this;
                            v36 = this.z.m();
                        }
                        catch (H v40) {
                            throw lW.a(v40);
                        }
                    }
                    v35.a(v36, this.G.m());
                }
                v38 = this;
            }
            v38.x.e();
        }
    }

    private void b() {
        block34: {
            lW lW2;
            block35: {
                block36: {
                    lW lW3;
                    block37: {
                        int n;
                        int[] nArray;
                        block32: {
                            block33: {
                                block30: {
                                    block31: {
                                        nArray = lX.f();
                                        try {
                                            n = this.A;
                                            if (nArray != null) break block30;
                                            if (n != 0) break block31;
                                        }
                                        catch (H h) {
                                            throw lW.a(h);
                                        }
                                        return;
                                    }
                                    n = this.m;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (nArray != null) break block32;
                                                        if (n == 0) break block33;
                                                    }
                                                    catch (H h) {
                                                        throw lW.a(h);
                                                    }
                                                    n = ((Boolean)this.n.i()).booleanValue() ? 1 : 0;
                                                    if (nArray != null) break block32;
                                                }
                                                catch (H h) {
                                                    throw lW.a(h);
                                                }
                                                if (n == 0) break block33;
                                            }
                                            catch (H h) {
                                                throw lW.a(h);
                                            }
                                            n = this.v ? 1 : 0;
                                            if (nArray != null) break block32;
                                        }
                                        catch (H h) {
                                            throw lW.a(h);
                                        }
                                        if (n == 0) break block33;
                                    }
                                    catch (H h) {
                                        throw lW.a(h);
                                    }
                                    Ab.c((I2)new hv(Jv.DROP_ITEM, xc.h, qu.DOWN));
                                }
                                catch (H h) {
                                    throw lW.a(h);
                                }
                            }
                            try {
                                lW2 = this;
                                if (nArray != null) break block34;
                                n = lW2.o;
                            }
                            catch (H h) {
                                throw lW.a(h);
                            }
                        }
                        try {
                            block38: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n == -1) break block35;
                                                        lW3 = this;
                                                        if (nArray != null) break block36;
                                                    }
                                                    catch (H h) {
                                                        throw lW.a(h);
                                                    }
                                                    if (lW3.l == this.o) break block37;
                                                }
                                                catch (H h) {
                                                    throw lW.a(h);
                                                }
                                                lW3 = this;
                                                if (nArray != null) break block36;
                                            }
                                            catch (H h) {
                                                throw lW.a(h);
                                            }
                                            if (lW3.l == -1) break block37;
                                        }
                                        catch (H h) {
                                            throw lW.a(h);
                                        }
                                        if (!((Boolean)this.C.i()).booleanValue()) break block38;
                                    }
                                    catch (H h) {
                                        throw lW.a(h);
                                    }
                                    Ab.c((I2)new ja(this.o));
                                    if (nArray == null) break block37;
                                }
                                catch (H h) {
                                    throw lW.a(h);
                                }
                            }
                            Hk.j().bU.g = this.o;
                        }
                        catch (H h) {
                            throw lW.a(h);
                        }
                    }
                    lW3 = this;
                }
                lW3.o = -1;
            }
            this.A = false;
            this.v = false;
            lW2 = this;
        }
        lW2.l = -1;
    }




    private int e() {
        var2_1 = 44;
        var1_2 = lX.f();
        do {
            block11: {
                block12: {
                    if (((Boolean)this.k.i()).booleanValue()) {
                        try {
                            v0 = 9;
                            if (var1_2 != null) ** GOTO lbl12
                        }
                        catch (H v1) {
                            throw lW.a(v1);
                        }
                    } else {
                        v0 = 36;
                    }
lbl12:


                    if (var2_1 < v0) break;
                    var3_3 = Hk.j().b8.c(var2_1).d();
                    try {
                        try {
                            try {
                                if (var1_2 != null) continue;
                                if (var3_3 == null) break block11;
                            }
                            catch (H v2) {
                                throw lW.a(v2);
                            }
                            v3 = var3_3.v() instanceof ac;
                            if (var1_2 != null) break block12;
                        }
                        catch (H v4) {
                            throw lW.a(v4);
                        }
                        if (v3 == 0) break block11;
                    }
                    catch (H v5) {
                        throw lW.a(v5);
                    }
                    v3 = var2_1;
                }
                return v3;
            }
            --var2_1;
        } while (var1_2 == null);
        return -1;
    }




    private int d(int var1_1, char var2_2, char var3_3) {
        var4_4 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var3_3 << 48 >>> 48) ^ lW.I;
        v0 = var4_4 ^ 101345051638945L;
        var6_5 = (int)(v0 >>> 48);
        var7_6 = (int)(v0 << 16 >>> 32);
        var8_7 = (int)(v0 << 48 >>> 48);
        var10_8 = 44;
        var9_9 = lX.f();
        block14: while (true) {
            if (((Boolean)this.k.i()).booleanValue()) {
                try {
                    v1 = 9;
                    if (var9_9 != null) ** GOTO lbl19
                }
                catch (H v2) {
                    throw lW.a(v2);
                }
            } else {
                v1 = 36;
            }
lbl19:


            if (var10_8 < v1) ** GOTO lbl68
            do {
                block20: {
                    block18: {
                        block19: {
                            block21: {
                                var11_10 = Hk.j().b8.c(var10_8).d();
                                try {
                                    if (var9_9 != null) break block18;
                                    if (var11_10 == null) break block19;
                                }
                                catch (H v3) {
                                    throw lW.a(v3);
                                }
                                var12_11 = var11_10.v();
                                try {
                                    if (var9_9 != null) break block18;
                                    if (var11_10.w((char)var6_5, var7_6, (short)var8_7) == null) break block19;
                                }
                                catch (H v4) {
                                    throw lW.a(v4);
                                }
                                var13_12 = qM.a((String)var11_10.w((char)var6_5, var7_6, (short)var8_7));
                                try {
                                    try {
                                        try {
                                            try {
                                                v5 = var9_9;
                                                if (var3_3 <= '\u0000') break block20;
                                                if (v5 != null) break block18;
                                                if (!var13_12.startsWith((String)lW.a("o", (int)20761, (long)(7796201225228711235L ^ var4_4)))) break block19;
                                            }
                                            catch (H v6) {
                                                throw lW.a(v6);
                                            }
                                            v7 = aQ.a((aQ)var12_11);
                                            if (var9_9 != null) break block21;
                                        }
                                        catch (H v8) {
                                            throw lW.a(v8);
                                        }
                                        if (v7 != aQ.a((aQ)eF.bK)) break block19;
                                    }
                                    catch (H v9) {
                                        throw lW.a(v9);
                                    }
                                    v7 = var10_8;
                                }
                                catch (H v10) {
                                    throw lW.a(v10);
                                }
                            }
                            return v7;
                        }
                        --var10_8;
                    }
                    v5 = var9_9;
                }
                if (v5 == null) continue block14;
lbl68:


            } while (var3_3 < '\u0000');
            break;
        }
        return -1;
    }




    private void a(int var1_1, int var2_2) {
        block9: {
            block8: {
                var3_3 = lX.f();
                try {
                    try {
                        if (var3_3 != null) break block8;
                        if (var1_1 >= var2_2) {
                        }
                        ** GOTO lbl17
                    }
                    catch (H v0) {
                        throw lW.a(v0);
                    }
                    this.w = var1_1;
                }
                catch (H v1) {
                    throw lW.a(v1);
                }
            }
            try {
                if (var3_3 == null) break block9;
lbl17:


                this.w = var1_1 + (int)(Math.random() * (double)(var2_2 - var1_1 + 1));
            }
            catch (H v2) {
                throw lW.a(v2);
            }
        }
    }

    public boolean c() {
        return this.A;
    }





    private void lambda$new$0(b5 var1_1) {
        block32: {
            block33: {
                block31: {
                    block30: {
                        block27: {
                            block28: {
                                block29: {
                                    block25: {
                                        block26: {
                                            var2_2 = lW.I ^ 40630902075703L;
                                            v0 = var2_2 ^ 38538300114698L;
                                            var4_3 = (int)(v0 >>> 48);
                                            var5_4 = (int)(v0 << 16 >>> 48);
                                            var6_5 = (int)(v0 << 32 >>> 32);
                                            var7_6 = lX.f();
                                            try {
                                                v1 = var1_1.h();
                                                if (var7_6 != null) break block25;
                                                if (!v1) break block26;
                                            }
                                            catch (H v2) {
                                                throw lW.a(v2);
                                            }
                                            return;
                                        }
                                        try {
                                            v3 = this;
                                            if (var7_6 != null) break block27;
                                            v1 = v3.A;
                                        }
                                        catch (H v4) {
                                            throw lW.a(v4);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (v1) {
                                                    v5 = this;
                                                    if (var7_6 != null) break block28;
                                                }
                                                ** GOTO lbl50
                                            }
                                            catch (H v6) {
                                                throw lW.a(v6);
                                            }
                                            if (v5.r > 0) break block29;
                                        }
                                        catch (H v7) {
                                            throw lW.a(v7);
                                        }
                                        this.b();
                                    }
                                    catch (H v8) {
                                        throw lW.a(v8);
                                    }
                                }
                                v5 = this;
                            }
                            try {
                                --v5.r;
                                if (var7_6 == null) break block30;
lbl50:


                                v3 = this;
                            }
                            catch (H v9) {
                                throw lW.a(v9);
                            }
                        }
                        v3.f((char)var4_3, (short)var5_4, var6_5);
                    }
                    try {
                        try {
                            v10 = this.A;
                            if (var7_6 != null) break block31;
                            if (v10 == 0) break block32;
                        }
                        catch (H v11) {
                            throw lW.a(v11);
                        }
                        v10 = this.v;
                    }
                    catch (H v12) {
                        throw lW.a(v12);
                    }
                }
                try {
                    try {
                        if (var7_6 != null) break block33;
                        if (v10 != 0) break block32;
                    }
                    catch (H v13) {
                        throw lW.a(v13);
                    }
                    v10 = this.l;
                }
                catch (H v14) {
                    throw lW.a(v14);
                }
            }
            if (v10 != -1) {
                var8_7 = Hk.j().bU.c(this.l);
                try {
                    if (var8_7 != null) {
                        Ab.c((I2)new Kg(var8_7));
                    }
                }
                catch (H v15) {
                    throw lW.a(v15);
                }
                this.v = true;
            }
        }
    }




    static {
        block11: {
            block10: {
                lW.I = _c.a((long)5351707339144778488L, (long)-615759427737589666L, MethodHandles.lookup().lookupClass()).a(248498667452140L);
                lW.L = new HashMap<K, V>(13);
                var0 = lW.I ^ 60829993786538L;
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
                var9_3 = new String[27];
                var7_4 = 0;
                var6_5 = "{!\u00bf\u00e5\u001a\tX\u0093'\u0005\u00a7)~\u00a9z\u0091y\u00fd\u00c0\u00fa<\u00a0&\u00b28}\u00f1'\u001d\u001a$\bY\u00d3m\u0090\u00a6>\u00de[\u00f2\u00ef\u0092a\u00ae\u000f\u00f1\u0084Q,\u00be%\u00c5\u0011\u00e5s\u00c5\u0086\t~\u00ebI\"\u000f_\u0097\u00b2\u00bak\u000e\u00e4\u0081\t\u00e8\u00d9&\u008e\u00f0\u00fb:\u00b7\u0010-\u00a0\u0003y\u00caS>\u0018\u00ad\rN\u00fa\u00c8b\u00df\u0006\u0010%6\u001au\u00cb\u00ef\u00d2\u0005\u00d0S\u00faq\u0002\u00bc }0\u00883\u00ec\u00f3N\u00aaQ\u0018\u00b9Q3\u00f7\u00f3Kr\u00e4\u00e0\u007f@\u008f\u008d\u00fbFg^\u00c3u|\u00deo\u00a7#\u0085\u00c8\u00fa$\u0093+\u00b0<\u00f6\u00f9q\u00e8\u00ab)D\u00dfHvCk\u00cb\u00fddh\u00b4\u00a8\u00c3uGud\u0011\u00ca\u00e5A\u009eh,\u00c6\u0014\u00bd \u0090\u0091\u00aa\u00d1\u0011\u00fc\u00e3k\u0094\"\u00b1j\u000f\u00a2\r\u0096\u00a1m\u0006H\u0004\u00f0^\u00d1\u0097m_\u00f4_ b\u00d2%\ny6'\u00a3\u009d\u0000\u00d2<J\r\u0088\u00df\u00cb\u0010\u00a0\u00d8\u008a\u0083V\u00ff,\u00ed`F\u0088\u0013\u00c3\u001c\u00dbZ\u0018\u00f4\u009fR;hh}\u0011U\u00fa\u0019n\u0099\u0000\u00c6\u0084*\u0010\u001e\u0000\u00bb=L?@J\u00a5y_\u00ec\u009cL\u00b4\u00ab\u0007\u0090\u00a5\u00c7\u00f4/\u00dc\u00f0o\u00e4\u00ef\u00a4\u00b7\u009f\u00b8g\u001d[y\u0087\u00a0Y\u00a5\u0091\u000e\u00f7a\u00f7\u00118\u00b2\ff\u00b5\fHiJ\u00b0aG}\u00c9;\u009c\u00c1\u0092*\u008cc\u00fdP\u008d\u0084\u00f9\u00109\u00e90\u00e2\u0086\u00f3\u00a0\u0017s1\u00bb\u00fd\u00bc\u00cb\u00f1\u00828)}V\u00e9\u00f0\u00b5\u0001\u00b7\u009cp\u00e8\b\u0012\u00c4\u001c\u00d6\u00b2\u00e4\u00ed\u000b@#?^C\u009dO\bZBX\u00f2\u00ad\u0012`Y\u0002\u00df\fT\u007f\u00e3\u00e5\u00ce\u00d5\u00fcSW\u00d1\u00eds\u0090H7\u00c6\u000e0N\u00ff\u00cb\u0085\\}\u00eb:\u0091\u00deY\u00d8\u0006\u00ffFp\u0082l\u0019\r\u0014%x\u0006\u000f0\u0016dj9-\u0088\u00fc\u000fL\u00f5\u0006k\u00a20\u0087\u00d5m\"H\u0081\u00d2\u00f0\u00107\u0082\u00c7\u00e4\u0088\f\u00ecS\fLS\u00e3*\u001f]\u008a\u0010i\u008c\u00fd\u0001\u0015\u00f3D)o \u0013M:\u0096\u00dcSh&\u00ff\u00a1oy\u00cd2\u00aa\u00e1[\u009bh\u00b2\u00b2\u00e7\u00b6\u0080\u000b\u00ac\u00b6\u00e1Nz\u00b5L\u00f6}\u00a8=\u00d1\u0011\u0007\u00bc\u00a9U'\u00a4\u0018\u00c4\u00cd\u00ef\u00a4\u00b1\u0003sE\u009a9\u00da[\u00a4H\u00fa\u00b9\u00a7\u00e3\u00b0\u00e3j\u00ab\u00fb'\u007f\u00f3\u00ed\u0005\u00c9)\u00ceWN\b\u0019\u0010\u00c8S\u00e1\u00d9\u00c33\u00d1\u00b1\u0000N\u0085,\b\u00ac\u0099~\u007f\u000eA\u00d84\u00e8\u00ab\u00b0\u00e0\u00c6\u0013\u00fbd\u00e4 \u00ces\u007f\u00d9\u00af\u00d4\u0081Q\u000b\u008c\u00e6p\u0088\u0017\u007fs\u001e\u0093\f\u001a*\u00fc\u00d3\u000b5_`l\u0015\u00e5\u007f\u0087\u0018\u00fa]\u0088\u00bc\u0085\u0083S\u0086\u00c2\u00ber^\u00a0\u0014\u009fZ\u00f5\\\u00e7-\u00e8(qE {\u00c8\u00ee5P\u0002\u0099\u00c0Y\u00df\u0013\u00e7M\u00a2\u008c\u0014X\u0010\u00ac\u00a39\u00065\u0082\u00b1E\u009c\u00cb\u00c32R\u0099\u0010c%\u00c3f8WX\u0007+\u0004\u00f9\\!$q\u00cc(X\u009f\u0092i\u0081\u00bbw\u0095\u00a5h\u0081h_\u0018.-\u008a\u00ac\u00ef:\u00bd\u00ad'\u00eaH=\u00d0#1\u00d8\u00dez\u009bro\u0080Q\u00bc\u00ac\t\u0010\u0091kW\u00b8\u00da\u00ceAP\u00e7\u00ef\u0002\u00db.r\u00b1\u00888\u00e4*2f@\u00f3\u00a1\u001d\u00b8Q\u009b;\u00f6\u000f\u00d4L\u00a7\u00b4\u00ac\f\u009d\u001e\u00b8\u000f\u00e6\u0000\u00a3<\u0013\u00d3m\u00f0\u00ce\u00e9\u00cf\u00b1\u00bc\u00b4^r3'g;7\u00f8\u00f3UB\u00cc\u00a6\u00edzf\u00d5j\u0010\u00f7\u0085P\u009b\u00d5hF\u0089\u00e2h\u00cdOQ\tA\u0007\u0010\u00ea\u0001\u001f(F\u00a6\u00ffr\u00d8,P\u0082\u00f6\u00ac(`\u0010+\u0000\u00bf\u00b7\u00a7G\u00cd$\u00f7\u0007\u00f7\u0097\u009c\u001c\u00dc\u00a3";
                var8_6 = "{!\u00bf\u00e5\u001a\tX\u0093'\u0005\u00a7)~\u00a9z\u0091y\u00fd\u00c0\u00fa<\u00a0&\u00b28}\u00f1'\u001d\u001a$\bY\u00d3m\u0090\u00a6>\u00de[\u00f2\u00ef\u0092a\u00ae\u000f\u00f1\u0084Q,\u00be%\u00c5\u0011\u00e5s\u00c5\u0086\t~\u00ebI\"\u000f_\u0097\u00b2\u00bak\u000e\u00e4\u0081\t\u00e8\u00d9&\u008e\u00f0\u00fb:\u00b7\u0010-\u00a0\u0003y\u00caS>\u0018\u00ad\rN\u00fa\u00c8b\u00df\u0006\u0010%6\u001au\u00cb\u00ef\u00d2\u0005\u00d0S\u00faq\u0002\u00bc }0\u00883\u00ec\u00f3N\u00aaQ\u0018\u00b9Q3\u00f7\u00f3Kr\u00e4\u00e0\u007f@\u008f\u008d\u00fbFg^\u00c3u|\u00deo\u00a7#\u0085\u00c8\u00fa$\u0093+\u00b0<\u00f6\u00f9q\u00e8\u00ab)D\u00dfHvCk\u00cb\u00fddh\u00b4\u00a8\u00c3uGud\u0011\u00ca\u00e5A\u009eh,\u00c6\u0014\u00bd \u0090\u0091\u00aa\u00d1\u0011\u00fc\u00e3k\u0094\"\u00b1j\u000f\u00a2\r\u0096\u00a1m\u0006H\u0004\u00f0^\u00d1\u0097m_\u00f4_ b\u00d2%\ny6'\u00a3\u009d\u0000\u00d2<J\r\u0088\u00df\u00cb\u0010\u00a0\u00d8\u008a\u0083V\u00ff,\u00ed`F\u0088\u0013\u00c3\u001c\u00dbZ\u0018\u00f4\u009fR;hh}\u0011U\u00fa\u0019n\u0099\u0000\u00c6\u0084*\u0010\u001e\u0000\u00bb=L?@J\u00a5y_\u00ec\u009cL\u00b4\u00ab\u0007\u0090\u00a5\u00c7\u00f4/\u00dc\u00f0o\u00e4\u00ef\u00a4\u00b7\u009f\u00b8g\u001d[y\u0087\u00a0Y\u00a5\u0091\u000e\u00f7a\u00f7\u00118\u00b2\ff\u00b5\fHiJ\u00b0aG}\u00c9;\u009c\u00c1\u0092*\u008cc\u00fdP\u008d\u0084\u00f9\u00109\u00e90\u00e2\u0086\u00f3\u00a0\u0017s1\u00bb\u00fd\u00bc\u00cb\u00f1\u00828)}V\u00e9\u00f0\u00b5\u0001\u00b7\u009cp\u00e8\b\u0012\u00c4\u001c\u00d6\u00b2\u00e4\u00ed\u000b@#?^C\u009dO\bZBX\u00f2\u00ad\u0012`Y\u0002\u00df\fT\u007f\u00e3\u00e5\u00ce\u00d5\u00fcSW\u00d1\u00eds\u0090H7\u00c6\u000e0N\u00ff\u00cb\u0085\\}\u00eb:\u0091\u00deY\u00d8\u0006\u00ffFp\u0082l\u0019\r\u0014%x\u0006\u000f0\u0016dj9-\u0088\u00fc\u000fL\u00f5\u0006k\u00a20\u0087\u00d5m\"H\u0081\u00d2\u00f0\u00107\u0082\u00c7\u00e4\u0088\f\u00ecS\fLS\u00e3*\u001f]\u008a\u0010i\u008c\u00fd\u0001\u0015\u00f3D)o \u0013M:\u0096\u00dcSh&\u00ff\u00a1oy\u00cd2\u00aa\u00e1[\u009bh\u00b2\u00b2\u00e7\u00b6\u0080\u000b\u00ac\u00b6\u00e1Nz\u00b5L\u00f6}\u00a8=\u00d1\u0011\u0007\u00bc\u00a9U'\u00a4\u0018\u00c4\u00cd\u00ef\u00a4\u00b1\u0003sE\u009a9\u00da[\u00a4H\u00fa\u00b9\u00a7\u00e3\u00b0\u00e3j\u00ab\u00fb'\u007f\u00f3\u00ed\u0005\u00c9)\u00ceWN\b\u0019\u0010\u00c8S\u00e1\u00d9\u00c33\u00d1\u00b1\u0000N\u0085,\b\u00ac\u0099~\u007f\u000eA\u00d84\u00e8\u00ab\u00b0\u00e0\u00c6\u0013\u00fbd\u00e4 \u00ces\u007f\u00d9\u00af\u00d4\u0081Q\u000b\u008c\u00e6p\u0088\u0017\u007fs\u001e\u0093\f\u001a*\u00fc\u00d3\u000b5_`l\u0015\u00e5\u007f\u0087\u0018\u00fa]\u0088\u00bc\u0085\u0083S\u0086\u00c2\u00ber^\u00a0\u0014\u009fZ\u00f5\\\u00e7-\u00e8(qE {\u00c8\u00ee5P\u0002\u0099\u00c0Y\u00df\u0013\u00e7M\u00a2\u008c\u0014X\u0010\u00ac\u00a39\u00065\u0082\u00b1E\u009c\u00cb\u00c32R\u0099\u0010c%\u00c3f8WX\u0007+\u0004\u00f9\\!$q\u00cc(X\u009f\u0092i\u0081\u00bbw\u0095\u00a5h\u0081h_\u0018.-\u008a\u00ac\u00ef:\u00bd\u00ad'\u00eaH=\u00d0#1\u00d8\u00dez\u009bro\u0080Q\u00bc\u00ac\t\u0010\u0091kW\u00b8\u00da\u00ceAP\u00e7\u00ef\u0002\u00db.r\u00b1\u00888\u00e4*2f@\u00f3\u00a1\u001d\u00b8Q\u009b;\u00f6\u000f\u00d4L\u00a7\u00b4\u00ac\f\u009d\u001e\u00b8\u000f\u00e6\u0000\u00a3<\u0013\u00d3m\u00f0\u00ce\u00e9\u00cf\u00b1\u00bc\u00b4^r3'g;7\u00f8\u00f3UB\u00cc\u00a6\u00edzf\u00d5j\u0010\u00f7\u0085P\u009b\u00d5hF\u0089\u00e2h\u00cdOQ\tA\u0007\u0010\u00ea\u0001\u001f(F\u00a6\u00ffr\u00d8,P\u0082\u00f6\u00ac(`\u0010+\u0000\u00bf\u00b7\u00a7G\u00cd$\u00f7\u0007\u00f7\u0097\u009c\u001c\u00dc\u00a3".length();
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
                    var9_3[var7_4++] = lW.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "w\u00f9\u00b7\u0097\u00bd\u00a6\u00e4\u0003\u00b2\u00bcm\u008dd\u008f\\\\\u00c0q:\u00b0\u00d4\u00e1\u00c4jjf8\u00dcG^\u00f9F \r\u00a3\u008a\u0082\u0089\u00b5\u0099Z\u00a9>\"\u00a2'\u00cc\u00f8Oe3zv\u001e\u001a\u0015\u00022DW\u00f7hD\u00fe\u0086";
                    var8_6 = "w\u00f9\u00b7\u0097\u00bd\u00a6\u00e4\u0003\u00b2\u00bcm\u008dd\u008f\\\\\u00c0q:\u00b0\u00d4\u00e1\u00c4jjf8\u00dcG^\u00f9F \r\u00a3\u008a\u0082\u0089\u00b5\u0099Z\u00a9>\"\u00a2'\u00cc\u00f8Oe3zv\u001e\u001a\u0015\u00022DW\u00f7hD\u00fe\u0086".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = lW.a(var10_9).intern();
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
        lW.J = var9_3;
        lW.K = new String[27];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68CF;
        if (K[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])L.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    L.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lW", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = J[n2].getBytes("ISO-8859-1");
            lW.K[n2] = lW.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return K[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lW.a(n, l);
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
            throw new RuntimeException("lW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lW.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
