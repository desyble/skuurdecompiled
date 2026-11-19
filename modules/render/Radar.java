import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Mouse;

public class ma
extends lh {
    private final kt<Number> o;
    private final kt<Number> k;
    private final kt<Number> n;
    private final kt<Number> q;
    private final kt<Boolean> r;
    private final kt<qK> t;
    private boolean l;
    private float u;
    private float v;
    private final mr p;
    private final lX s;
    @A(value=1)
    public final R8<v7> m;
    private static final long w;
    private static final String[] x;
    private static final String[] y;
    private static final Map z;

    public ma(short s, int n, char c, EU eU) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ w;
        super(eU);
        this.o = new kt((String)((Object)ma.a("m", (int)20698, (long)(0x53F0504FE60F124FL ^ l))), (Object)125, (String)((Object)ma.a("m", (int)31622, (long)(0x54B16CCB82CF391AL ^ l))), 1.0, 50.0, 250.0);
        this.k = new kt("X", (Object)3, (String)((Object)ma.a("m", (int)1016, (long)(0x7B7BFF3E07604178L ^ l))), 0.01, 0.0, 0.0, ma::lambda$new$0);
        this.n = new kt("Y", (Object)0.35, (String)((Object)ma.a("m", (int)20184, (long)(0xDCDCFE6E1EE0C42L ^ l))), 0.01, 0.0, 0.0, ma::lambda$new$1);
        this.q = new kt((String)((Object)ma.a("m", (int)19379, (long)(0x252D50461E118939L ^ l))), (Object)2.0, (String)((Object)ma.a("m", (int)4311, (long)(0x440F0B10025ED245L ^ l))), 1.0, 1.0, 5.0);
        this.r = new kt((String)((Object)ma.a("m", (int)11021, (long)(0x355DADF0B5276996L ^ l))), (Object)false, (String)((Object)ma.a("m", (int)25846, (long)(0x3BFF6DE7DD23A67EL ^ l))));
        this.t = new kt((String)((Object)ma.a("m", (int)28535, (long)(0x447609F7F0FF2DE9L ^ l))), (Object)new qK((String)((Object)ma.a("m", (int)32665, (long)(0x5FE3428E444CBD08L ^ l))), new kt[]{new kt((String)((Object)ma.a("m", (int)16941, (long)(0x25E39A6E8DEB00B4L ^ l))), (Object)true, (String)((Object)ma.a("m", (int)3714, (long)(0x2F842D9E62054C06L ^ l)))), new kt((String)((Object)ma.a("m", (int)12659, (long)(0x3E43CBF6F9FDF3F2L ^ l))), (Object)false, (String)((Object)ma.a("m", (int)25113, (long)(0x43627526430DA086L ^ l)))), new kt((String)((Object)ma.a("m", (int)26386, (long)(0x17F43C5991282582L ^ l))), (Object)false, (String)((Object)ma.a("m", (int)12880, (long)(0x46B6E166650070C4L ^ l)))), new kt((String)((Object)ma.a("m", (int)8409, (long)(0x77BA24411B76624AL ^ l))), (Object)false, (String)((Object)ma.a("m", (int)23219, (long)(0x40C9ECCC4A0C1830L ^ l)))), new kt((String)((Object)ma.a("m", (int)6048, (long)(0x7AC69A0DA9775522L ^ l))), (Object)false, (String)((Object)ma.a("m", (int)20655, (long)(0x71530C411501232L ^ l)))), new kt((String)((Object)ma.a("m", (int)10199, (long)(0x5EF864AECB4655AL ^ l))), (Object)false, (String)((Object)ma.a("m", (int)24442, (long)(0x288DCA6738269DE2L ^ l))))}), (String)((Object)ma.a("m", (int)644, (long)(0x58404AB5C267C00DL ^ l))));
        this.l = false;
        this.u = 0.0f;
        this.v = 0.0f;
        this.p = (mr)tf.m().a(mr.class);
        this.s = (lX)tf.m().a(lX.class);
        this.m = this::lambda$new$2;
        this.a(new kt[]{this.t, this.k, this.n, this.o, this.q, this.r});
    }

    private boolean a(Object object) {
        boolean bl;
        block85: {
            block86: {
                boolean bl2;
                long l;
                block69: {
                    block70: {
                        boolean bl3;
                        block83: {
                            block84: {
                                LM lM;
                                block81: {
                                    block82: {
                                        block79: {
                                            block80: {
                                                block77: {
                                                    block78: {
                                                        block75: {
                                                            block76: {
                                                                block73: {
                                                                    block74: {
                                                                        block71: {
                                                                            block72: {
                                                                                block67: {
                                                                                    block68: {
                                                                                        l = w ^ 0x7AC24734E0C0L;
                                                                                        bl2 = mr.e();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        bl = object instanceof LM;
                                                                                                        if (bl2) break block67;
                                                                                                        if (bl) break block68;
                                                                                                    }
                                                                                                    catch (H h) {
                                                                                                        throw ma.a(h);
                                                                                                    }
                                                                                                    bl = object instanceof Ms;
                                                                                                    if (bl2) break block67;
                                                                                                }
                                                                                                catch (H h) {
                                                                                                    throw ma.a(h);
                                                                                                }
                                                                                                if (bl) break block68;
                                                                                            }
                                                                                            catch (H h) {
                                                                                                throw ma.a(h);
                                                                                            }
                                                                                            return false;
                                                                                        }
                                                                                        catch (H h) {
                                                                                            throw ma.a(h);
                                                                                        }
                                                                                    }
                                                                                    bl = object instanceof LM;
                                                                                }
                                                                                try {
                                                                                    if (bl2) break block69;
                                                                                    if (!bl) break block70;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw ma.a(h);
                                                                                }
                                                                                lM = (LM)object;
                                                                                try {
                                                                                    if (lM == Hk.j()) {
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                catch (H h) {
                                                                                    throw ma.a(h);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        bl = l6.a().contains(lM);
                                                                                        if (bl2) break block71;
                                                                                        if (!bl) break block72;
                                                                                    }
                                                                                    catch (H h) {
                                                                                        throw ma.a(h);
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw ma.a(h);
                                                                                }
                                                                            }
                                                                            bl = lM.G();
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (bl2) break block73;
                                                                                if (bl) break block74;
                                                                            }
                                                                            catch (H h) {
                                                                                throw ma.a(h);
                                                                            }
                                                                            return false;
                                                                        }
                                                                        catch (H h) {
                                                                            throw ma.a(h);
                                                                        }
                                                                    }
                                                                    bl = ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)2051, (long)(0x15E98EA013622023L ^ l)))).g();
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (bl2) break block75;
                                                                                if (bl) break block76;
                                                                            }
                                                                            catch (H h) {
                                                                                throw ma.a(h);
                                                                            }
                                                                            bl = lM.k();
                                                                            if (bl2) break block75;
                                                                        }
                                                                        catch (H h) {
                                                                            throw ma.a(h);
                                                                        }
                                                                        if (!bl) break block76;
                                                                    }
                                                                    catch (H h) {
                                                                        throw ma.a(h);
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (H h) {
                                                                    throw ma.a(h);
                                                                }
                                                            }
                                                            bl = lM instanceof M2;
                                                        }
                                                        try {
                                                            try {
                                                                if (bl2) break block77;
                                                                if (!bl) break block78;
                                                            }
                                                            catch (H h) {
                                                                throw ma.a(h);
                                                            }
                                                            return ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)30202, (long)(0x7171F93DBFFEDDCAL ^ l)))).g();
                                                        }
                                                        catch (H h) {
                                                            throw ma.a(h);
                                                        }
                                                    }
                                                    bl = ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)27958, (long)(0x1D545C0B1696C51AL ^ l)))).g();
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (bl2) break block79;
                                                                if (!bl) break block80;
                                                            }
                                                            catch (H h) {
                                                                throw ma.a(h);
                                                            }
                                                            bl = lM instanceof LR;
                                                            if (bl2) break block79;
                                                        }
                                                        catch (H h) {
                                                            throw ma.a(h);
                                                        }
                                                        if (!bl) break block80;
                                                    }
                                                    catch (H h) {
                                                        throw ma.a(h);
                                                    }
                                                    return true;
                                                }
                                                catch (H h) {
                                                    throw ma.a(h);
                                                }
                                            }
                                            bl = ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)18290, (long)(0x66914F3B22206F53L ^ l)))).g();
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (bl2) break block81;
                                                        if (!bl) break block82;
                                                    }
                                                    catch (H h) {
                                                        throw ma.a(h);
                                                    }
                                                    bl = lM instanceof M3;
                                                    if (bl2) break block81;
                                                }
                                                catch (H h) {
                                                    throw ma.a(h);
                                                }
                                                if (!bl) break block82;
                                            }
                                            catch (H h) {
                                                throw ma.a(h);
                                            }
                                            return true;
                                        }
                                        catch (H h) {
                                            throw ma.a(h);
                                        }
                                    }
                                    bl = ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)13016, (long)(0x3FC1720747909AFAL ^ l)))).g();
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (bl2) break block69;
                                                            if (!bl) break block70;
                                                        }
                                                        catch (H h) {
                                                            throw ma.a(h);
                                                        }
                                                        bl3 = lM instanceof Ma;
                                                        if (bl2) break block83;
                                                    }
                                                    catch (H h) {
                                                        throw ma.a(h);
                                                    }
                                                    if (bl3) break block84;
                                                }
                                                catch (H h) {
                                                    throw ma.a(h);
                                                }
                                                bl3 = lM instanceof Mk;
                                                if (bl2) break block83;
                                            }
                                            catch (H h) {
                                                throw ma.a(h);
                                            }
                                            if (bl3) break block84;
                                        }
                                        catch (H h) {
                                            throw ma.a(h);
                                        }
                                        bl = lM instanceof M4;
                                        if (bl2) break block69;
                                    }
                                    catch (H h) {
                                        throw ma.a(h);
                                    }
                                    if (!bl) break block70;
                                }
                                catch (H h) {
                                    throw ma.a(h);
                                }
                            }
                            bl3 = true;
                        }
                        return bl3;
                    }
                    bl = object instanceof Ms;
                }
                try {
                    try {
                        if (bl2) break block85;
                        if (!bl) break block86;
                    }
                    catch (H h) {
                        throw ma.a(h);
                    }
                    return ((qK)this.t.i()).b((String)((Object)ma.a("m", (int)11499, (long)(0x3B86A2FBD93304DAL ^ l)))).g();
                }
                catch (H h) {
                    throw ma.a(h);
                }
            }
            bl = false;
        }
        return bl;
    }




    private void a(double var1_1, double var3_2, double var5_3, double var7_4, float var9_5, float var10_6, float var11_7, float var12_8, float var13_9, int var14_10, int var15_11) {
        block20: {
            block19: {
                block18: {
                    block17: {
                        block16: {
                            block15: {
                                var17_12 = (float)((var5_3 + (var1_1 - var5_3) * (double)var11_7 - (double)var9_5) * (double)this.q.k());
                                var18_13 = (float)((var7_4 + (var3_2 - var7_4) * (double)var11_7 - (double)var10_6) * (double)this.q.k());
                                var19_14 = (float)Math.cos((double)Hk.j().H * 0.017453292519943295);
                                var20_15 = (float)Math.sin((double)Hk.j().H * 0.017453292519943295);
                                var21_16 = -(var18_13 * var19_14 - var17_12 * var20_15);
                                var16_17 = mr.k();
                                var22_18 = -(var17_12 * var19_14 + var18_13 * var20_15);
                                try {
                                    cfr_temp_0 = (double)var21_16 - ((double)((float)var14_10 / 2.0f) - 1.5);
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                    if (!var16_17) break block15;
                                    if (v0 > 0) {
                                    }
                                    ** GOTO lbl20
                                }
                                catch (H v1) {
                                    throw ma.a(v1);
                                }
                                var21_16 = (float)var14_10 / 2.0f - 1.5f;
                                try {
                                    if (var16_17) break block16;
lbl20:


                                    v0 = (cfr_temp_1 = var21_16 - -((float)var14_10 / 2.0f - 3.0f)) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                }
                                catch (H v2) {
                                    throw ma.a(v2);
                                }
                            }
                            try {
                                if (!var16_17) break block17;
                                if (v0 >= 0) break block16;
                            }
                            catch (H v3) {
                                throw ma.a(v3);
                            }
                            var21_16 = -((float)var14_10 / 2.0f - 3.0f);
                        }
                        v0 = (cfr_temp_2 = (double)var22_18 - ((double)((float)var14_10 / 2.0f) - 1.5)) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    }
                    try {
                        if (!var16_17) break block18;
                        if (v0 > 0) {
                        }
                        ** GOTO lbl46
                    }
                    catch (H v4) {
                        throw ma.a(v4);
                    }
                    var22_18 = (float)var14_10 / 2.0f - 1.5f;
                    try {
                        try {
                            if (var16_17) break block19;
lbl46:


                            v5 = var22_18;
                            v6 = -((double)((float)var14_10 / 2.0f) - 2.5);
                            if (!var16_17) break block20;
                        }
                        catch (H v7) {
                            throw ma.a(v7);
                        }
                        cfr_temp_3 = v5 - v6;
                        v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                    }
                    catch (H v8) {
                        throw ma.a(v8);
                    }
                }
                if (v0 < 0) {
                    var22_18 = -((float)var14_10 / 2.0f - 2.5f);
                }
            }
            v5 = (double)(var12_8 + (float)var14_10 / 2.0f + var22_18) - 1.5;
            v6 = (double)(var13_9 + (float)var14_10 / 2.0f + var21_16) - 1.5;
        }
        cp.a((double)v5, (double)v6, (double)((double)(var12_8 + (float)var14_10 / 2.0f + var22_18) + 0.5), (double)((double)(var13_9 + (float)var14_10 / 2.0f + var21_16) + 0.5), (int)var15_11);
    }





    private void lambda$new$2(v7 var1_1) {
        block65: {
            block70: {
                block66: {
                    block68: {
                        block67: {
                            v0 = var2_2 = ma.w ^ 51674567641723L;
                            v1 = v0 ^ 30060351194347L;
                            var4_3 = (int)(v1 >>> 56);
                            var5_4 = (int)(v1 << 8 >>> 32);
                            var6_5 = (int)(v1 << 40 >>> 40);
                            v2 = v0 ^ 74792845418865L;
                            var7_6 = (int)(v2 >>> 32);
                            var8_7 = v2 << 32 >>> 32;
                            var11_8 = this.o.m();
                            var12_9 = this.k.k();
                            var13_10 = this.n.k();
                            var14_11 = Hk.b().ay.c;
                            var15_12 = (float)Hk.j().ax;
                            var16_13 = (float)Hk.j().av;
                            var17_14 = var1_1.c().a();
                            var18_15 = var1_1.c().c();
                            var19_16 = Mouse.getX() * var17_14 / Hk.b().q;
                            var20_17 = var18_15 - Mouse.getY() * var18_15 / Hk.b().z - 1;
                            var10_18 = mr.e();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var10_18) break block65;
                                                if (!(Hk.e() instanceof oa)) break block66;
                                            }
                                            catch (H v3) {
                                                throw ma.a(v3);
                                            }
                                            v4 = Mouse.isButtonDown((int)0);
                                            if (var10_18) break block67;
                                        }
                                        catch (H v5) {
                                            throw ma.a(v5);
                                        }
                                        if (v4) {
                                        }
                                        ** GOTO lbl121
                                    }
                                    catch (H v6) {
                                        throw ma.a(v6);
                                    }
                                    v7 = this;
                                    if (var10_18) break block68;
                                }
                                catch (H v8) {
                                    throw ma.a(v8);
                                }
                                v4 = v7.l;
                            }
                            catch (H v9) {
                                throw ma.a(v9);
                            }
                        }
                        try {
                            block69: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (v4) break block69;
                                                                    v10 = var19_16;
                                                                    v11 = var12_9 - 0.5f;
                                                                    if (var10_18) break block70;
                                                                }
                                                                catch (H v12) {
                                                                    throw ma.a(v12);
                                                                }
                                                                if (!(v10 >= v11)) break block66;
                                                            }
                                                            catch (H v13) {
                                                                throw ma.a(v13);
                                                            }
                                                            v10 = var19_16;
                                                            v11 = var12_9 + (float)var11_8 + 0.5f;
                                                            if (var10_18) break block70;
                                                        }
                                                        catch (H v14) {
                                                            throw ma.a(v14);
                                                        }
                                                        if (!(v10 <= v11)) break block66;
                                                    }
                                                    catch (H v15) {
                                                        throw ma.a(v15);
                                                    }
                                                    v10 = var20_17;
                                                    v11 = var13_10 - 0.5f;
                                                    if (var10_18) break block70;
                                                }
                                                catch (H v16) {
                                                    throw ma.a(v16);
                                                }
                                                if (!(v10 >= v11)) break block66;
                                            }
                                            catch (H v17) {
                                                throw ma.a(v17);
                                            }
                                            v10 = var20_17;
                                            v11 = var13_10 + (float)var11_8 + 0.5f;
                                            if (var10_18) break block70;
                                        }
                                        catch (H v18) {
                                            throw ma.a(v18);
                                        }
                                        if (!(v10 <= v11)) break block66;
                                    }
                                    catch (H v19) {
                                        throw ma.a(v19);
                                    }
                                    this.l = true;
                                    this.u = (float)var19_16 - var12_9;
                                    this.v = (float)var20_17 - var13_10;
                                    if (!var10_18) break block66;
                                }
                                catch (H v20) {
                                    throw ma.a(v20);
                                }
                            }
                            this.k.a((Object)Float.valueOf((float)var19_16 - this.u));
                            v7 = this;
                        }
                        catch (H v21) {
                            throw ma.a(v21);
                        }
                    }
                    try {
                        v7.n.a((Object)Float.valueOf((float)var20_17 - this.v));
                        if (!var10_18) break block66;
lbl121:


                        this.l = false;
                    }
                    catch (H v22) {
                        throw ma.a(v22);
                    }
                }
                var12_9 = this.k.k();
                var13_10 = this.n.k();
                v10 = var12_9;
                v11 = 0.5f;
            }
            cp.a((double)(v10 - v11), (double)(var13_10 - 0.5f), (double)(var12_9 + (float)var11_8 + 0.5f), (double)(var13_10 + (float)var11_8 + 0.5f), (int)r_.a((int)0, (int)140));
            cp.b((double)var12_9, (double)var13_10, (double)(var12_9 + (float)var11_8), (double)(var13_10 + (float)var11_8), (double)0.5, (int)r_.a((int)26), (int)r_.a((int)16));
            cp.a((double)var12_9, (double)var13_10, (double)(var12_9 + (float)var11_8), (double)((double)var13_10 + 0.5), (int)this.p.n());
            cp.a((double)var12_9, (double)((double)var13_10 + 0.5), (double)(var12_9 + (float)var11_8), (double)(var13_10 + 1.0f), (int)r_.b((int)this.p.n(), (float)0.5f));
            cp.a((double)((double)var12_9 + ((double)((float)var11_8 / 2.0f) - 0.5)), (double)((double)var13_10 + 1.0), (double)((double)var12_9 + ((double)((float)var11_8 / 2.0f) + 0.5)), (double)((double)(var13_10 + (float)var11_8) - 0.5), (int)r_.a((int)80, (int)255));
            cp.a((double)((double)var12_9 + 0.5), (double)((double)var13_10 + ((double)((float)var11_8 / 2.0f) - 0.5)), (double)((double)(var12_9 + (float)var11_8) - 0.5), (double)((double)var13_10 + ((double)((float)var11_8 / 2.0f) + 0.5)), (int)r_.a((int)80, (int)255));
        }
        for (Object var24_22 : Hk.a().S().stream().filter((Predicate<LQ>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, a(java.lang.Object ), (LLQ;)Z)((ma)this)).toArray()) {
            block82: {
                block80: {
                    block81: {
                        block79: {
                            block71: {
                                block73: {
                                    block78: {
                                        block76: {
                                            block77: {
                                                block75: {
                                                    block74: {
                                                        block72: {
                                                            try {
                                                                v23 = var24_22 instanceof LM;
                                                                if (var10_18) break block71;
                                                                if (v23) {
                                                                }
                                                                ** GOTO lbl219
                                                            }
                                                            catch (H v24) {
                                                                throw ma.a(v24);
                                                            }
                                                            var25_23 = (LM)var24_22;
                                                            var27_25 = this.s.e();
                                                            try {
                                                                v25 = var27_25;
                                                                if (var10_18) break block72;
                                                                if (v25 != null) {
                                                                }
                                                                ** GOTO lbl164
                                                            }
                                                            catch (H v26) {
                                                                throw ma.a(v26);
                                                            }
                                                            v25 = var27_25;
                                                        }
                                                        if (v25 != var25_23) ** GOTO lbl164
                                                        var26_24 = this.p.n();
                                                        try {
                                                            try {
                                                                if (!var10_18) break block73;
lbl164:


                                                                v27 = tf.c().b((byte)var4_3, var5_4, (LM)var25_23, var6_5);
                                                                if (var10_18) break block74;
                                                            }
                                                            catch (H v28) {
                                                                throw ma.a(v28);
                                                            }
                                                            if (v27 != 0) {
                                                            }
                                                            ** GOTO lbl177
                                                        }
                                                        catch (H v29) {
                                                            throw ma.a(v29);
                                                        }
                                                        var26_24 = r_.a((int)15, (int)176, (int)245);
                                                        try {
                                                            if (!var10_18) break block73;
lbl177:


                                                            v27 = tf.c().a(var7_6, var8_7, (LM)var25_23);
                                                        }
                                                        catch (H v30) {
                                                            throw ma.a(v30);
                                                        }
                                                    }
                                                    try {
                                                        if (var10_18) break block75;
                                                        if (v27 != 0) {
                                                        }
                                                        ** GOTO lbl192
                                                    }
                                                    catch (H v31) {
                                                        throw ma.a(v31);
                                                    }
                                                    var26_24 = r_.a((int)200, (int)60, (int)71);
                                                    try {
                                                        if (!var10_18) break block73;
lbl192:


                                                        v27 = this.r.g();
                                                    }
                                                    catch (H v32) {
                                                        throw ma.a(v32);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var10_18) break block76;
                                                        if (v27 == 0) break block77;
                                                    }
                                                    catch (H v33) {
                                                        throw ma.a(v33);
                                                    }
                                                    v34 = this.p.n();
                                                    break block78;
                                                }
                                                catch (H v35) {
                                                    throw ma.a(v35);
                                                }
                                            }
                                            v27 = 200;
                                        }
                                        v34 = r_.a((int)v27);
                                    }
                                    var26_24 = v34;
                                }
                                try {
                                    try {
                                        this.a(var25_23.ax, var25_23.av, var25_23.am, var25_23.a, var15_12, var16_13, var14_11, var12_9, var13_10, var11_8, var26_24);
                                        if (!var10_18) continue;
lbl219:


                                        v36 = var24_22;
                                        if (var10_18) break block79;
                                    }
                                    catch (H v37) {
                                        throw ma.a(v37);
                                    }
                                    v23 = v36 instanceof Ms;
                                }
                                catch (H v38) {
                                    throw ma.a(v38);
                                }
                            }
                            if (!v23) continue;
                            v36 = var24_22;
                        }
                        var25_23 = (Ms)v36;
                        try {
                            try {
                                v39 = this.r.g();
                                if (var10_18) break block80;
                                if (v39 == 0) break block81;
                            }
                            catch (H v40) {
                                throw ma.a(v40);
                            }
                            v41 = this.p.n();
                            break block82;
                        }
                        catch (H v42) {
                            throw ma.a(v42);
                        }
                    }
                    v39 = 255;
                }
                v41 = r_.a((int)v39);
            }
            var26_24 = v41;
            this.a(var25_23.ax, var25_23.av, var25_23.am, var25_23.a, var15_12, var16_13, var14_11, var12_9, var13_10, var11_8, var26_24);
            if (!var10_18) continue;
        }
    }

    private static boolean lambda$new$1() {
        return false;
    }

    private static boolean lambda$new$0() {
        return false;
    }




    static {
        block11: {
            block10: {
                ma.w = _c.a((long)-6827202620018556805L, (long)7941629462956494924L, MethodHandles.lookup().lookupClass()).a(209890780039426L);
                ma.z = new HashMap<K, V>(13);
                var0 = ma.w ^ 60860855960742L;
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
                var9_3 = new String[29];
                var7_4 = 0;
                var6_5 = "t\u00d28x\u001e\u00ba:\u00bd\b\u008a\u00fbWM\u0099\u00b6\u000f\u0014\u00ba+q\u00d0\u0089\u009aYj\u00a7Q\u00b2\u00b7%?r\u00183\u00b9\u00c78\u00e0KM\u00c0\u00db\u00d0.|\u00a1\u00b1\u0094'y\u00aa\u00b1\u00db\u00fc\u00d1\u0095b W\u008cp\u0090\u001fB8\u00feQ\u00ba\u00f2\u00d9\u008ckMC\u0084\u0092\u00a3|\u00c5\u0087 :>\u00eaQZ\u001bb\u00a4\u00f0(h\u00a7AK\u001f\u00a6\u00d1D\u00d6>G\u00c5\u00e2\u00d07\u00c5\u00db\u00ae-\u0097\u00b3\u0014&\u0010\u0097k\f\u00a7M6\u00a2\u0006\u00dc: e\u00ed\u00ac%d\u0010\u0093\u00ce(\u00b78?\u00a2q1\u0012\u00f93ywl\u008c\u0018{\u00c31\u00e0X\u00ce2\u00b5\u00be\u001c\u00c1\u0007j\u00e8_\u00b8\u0089\u00d0\u0096\u009b]\u008d\u0087$\u0010+\u00f4f\u0089\u001d\u00a8\u00afq\u0016\n\u00a1g\u00f1]\u00fb\u0006\u0010x\u0011\u00e80\u00a6;\u0091v\u00e1\u001d\u00a3a\u00b5\u00efdi\u0010\u00a2O\u00a4\u00d7\u00ce^\u0014\u00b0\u00ea\u000f\u009c\u00a2\u00b39\u007fr \u00a5*\u00c5sC\u00b6\u00e1A\u0014\tyg\u008eD\u00dc\u007f\u0085r9\u007f,y\u00f2\u00f2\u00c7\u00efm\u007fsH\u00d6\u00b9 \u00e0\u00ae\u00e1\u00b7G\u0011)\u000f\u0017!J\u008e\u0001\u0097\u009a<r\u00e0t\u00fc\u0095\u00f7T\u00b5[lQaA#<L\u0010o\u0093\u008d\u0017\u00db\u00d1+\u00f2\u00b6Z\u001e\u009e\u0003 W\u001f0\u008e_\nL\u00be\u00ce\u0096\u00b3X?C\u001b\u00c9\u00f5\u00e0\u00b5!\u00c04V\u00a5\u0013\u00fd\u0006\u00f5no\u00b8\u0017\u00b6\u00ec\u000bgm\u0012\u001a\f2.\u00ca\u00f9\u00f6/\u00d1fk\u0082S \u008fD\u0093\u0080\u0015#\\\u00a1\u001enY+\u0001\\3\f\u00a1 \u0018\u00fc\u00b9\u0000\u001b\u00b5\u00d9<\u00bea\u00ccH\u00f7\u00c7\u0018\u00a4\u00f0\u008b\u000f\u0015\u00af\u00c20+\u00be\u00f2\u00ed\u00ce\u00d6\u001d?\u00e7\u000e\u00bfa\u001d\u00a3KD \u00e2W\u00e0\u0000\u00dd\u00f1\u0092OM\r\u00a1\r\u00edvn\u007f\u00db\u00e6,\u00a8Ab\u00c7\u00b0HO\u0011d\u00b7\u008fR\u0090\u0010!\u00e0]\n_\u00be\u00d9\u00c1)\u00a9[Y}\u0005)\u00cd\u0010\u00df\u00fbX\u00a4\u00c8\u008d\u0012\u008a\u0081\u00bf\u00f3z\u00c8b\u00b8\u000f \u0098`\u00adb\u00ad\u00a8\u0010\u0014\u00df\u00d1g\u00bf\u00c3C\u000f\u00c9\u0016\u00e0\u00db\u0010\u0092\u00ca\u00dc\u00be\u00b4=\t\u0005a~\u00ed^ \u0000\u009ap\u0092p\u00a6ct\u0084\u00ca\u008b.]~\u00a6G\u0019\u0095\u00c5B\":\u00bc\u00d4\u00e2YG\u0006\u00b6%\u00e4)\u0018p[\u00ebS\u00a3\u00e6\u00ae\u00c3\u001a**\u0096O@#\u00d2\u00b6Q\u0016\u0094Q\u008c\u00b4\u0084\u0018\u0091\u00eeu\n\u00f1;\u00be\u00edc\u00fe\u0017\u0096`~h.<\u00cc\u00b3p\u00b4!K] \u0015>\u0011Z\u00ffl\u0018\u00b0\u00f9\u00b6\u00e78\u00aa\u00d0N0\u0000\u0096\u00ca\u0086\u0018\u000bpxi|\u00a8\u0081k$\u00d3\u00be \u008a\u00d8\u00e8\u00bd\u00cc\u001e\u00ff\u0016\u00e0r*_pI9\u00fa\u00b8\u00d5I\u00d5\u00e7p\u0016\u00f5\nH\u00ea\f\u00cd\u00e3yP(\u0017\u001a\u0018\r\u00d9\u0085\u009e\u0091\u0003\u0084\u0083\u008dB\u00b8D\u0005\u00ba\"WG\u0087\u00fa\u00b8E\u00f3\u00bb\u00dd\u00c1\\$\u00d4b\u008b\u00b3:b\u00c2\u00f4\u0085\u00ed8\u001c\u00a8\u0099\u00c3\u00e2\u009aB\u0014\u00a0\u00bf\u00aa-\u00e9\u00eb\u00e4\u00a7\u00146\u00d3\u00fbNG\u008e\u0016\r\u00bb\u00ce\u00d2J\u008d@\u00cbFY3\u00c5\u00d1*\u0091$F2P\u0013\u00ff\u00c0\u00c1\u00c5\u0006\u0003.G\u001a\u00b5\u000e\u0018\u0010\u00f7\b\u00be\u00a6\u00ef\u00d0\u00b0S\u00fdr\n\u0019\u00c8\u00bd\u00cf\u00e1";
                var8_6 = "t\u00d28x\u001e\u00ba:\u00bd\b\u008a\u00fbWM\u0099\u00b6\u000f\u0014\u00ba+q\u00d0\u0089\u009aYj\u00a7Q\u00b2\u00b7%?r\u00183\u00b9\u00c78\u00e0KM\u00c0\u00db\u00d0.|\u00a1\u00b1\u0094'y\u00aa\u00b1\u00db\u00fc\u00d1\u0095b W\u008cp\u0090\u001fB8\u00feQ\u00ba\u00f2\u00d9\u008ckMC\u0084\u0092\u00a3|\u00c5\u0087 :>\u00eaQZ\u001bb\u00a4\u00f0(h\u00a7AK\u001f\u00a6\u00d1D\u00d6>G\u00c5\u00e2\u00d07\u00c5\u00db\u00ae-\u0097\u00b3\u0014&\u0010\u0097k\f\u00a7M6\u00a2\u0006\u00dc: e\u00ed\u00ac%d\u0010\u0093\u00ce(\u00b78?\u00a2q1\u0012\u00f93ywl\u008c\u0018{\u00c31\u00e0X\u00ce2\u00b5\u00be\u001c\u00c1\u0007j\u00e8_\u00b8\u0089\u00d0\u0096\u009b]\u008d\u0087$\u0010+\u00f4f\u0089\u001d\u00a8\u00afq\u0016\n\u00a1g\u00f1]\u00fb\u0006\u0010x\u0011\u00e80\u00a6;\u0091v\u00e1\u001d\u00a3a\u00b5\u00efdi\u0010\u00a2O\u00a4\u00d7\u00ce^\u0014\u00b0\u00ea\u000f\u009c\u00a2\u00b39\u007fr \u00a5*\u00c5sC\u00b6\u00e1A\u0014\tyg\u008eD\u00dc\u007f\u0085r9\u007f,y\u00f2\u00f2\u00c7\u00efm\u007fsH\u00d6\u00b9 \u00e0\u00ae\u00e1\u00b7G\u0011)\u000f\u0017!J\u008e\u0001\u0097\u009a<r\u00e0t\u00fc\u0095\u00f7T\u00b5[lQaA#<L\u0010o\u0093\u008d\u0017\u00db\u00d1+\u00f2\u00b6Z\u001e\u009e\u0003 W\u001f0\u008e_\nL\u00be\u00ce\u0096\u00b3X?C\u001b\u00c9\u00f5\u00e0\u00b5!\u00c04V\u00a5\u0013\u00fd\u0006\u00f5no\u00b8\u0017\u00b6\u00ec\u000bgm\u0012\u001a\f2.\u00ca\u00f9\u00f6/\u00d1fk\u0082S \u008fD\u0093\u0080\u0015#\\\u00a1\u001enY+\u0001\\3\f\u00a1 \u0018\u00fc\u00b9\u0000\u001b\u00b5\u00d9<\u00bea\u00ccH\u00f7\u00c7\u0018\u00a4\u00f0\u008b\u000f\u0015\u00af\u00c20+\u00be\u00f2\u00ed\u00ce\u00d6\u001d?\u00e7\u000e\u00bfa\u001d\u00a3KD \u00e2W\u00e0\u0000\u00dd\u00f1\u0092OM\r\u00a1\r\u00edvn\u007f\u00db\u00e6,\u00a8Ab\u00c7\u00b0HO\u0011d\u00b7\u008fR\u0090\u0010!\u00e0]\n_\u00be\u00d9\u00c1)\u00a9[Y}\u0005)\u00cd\u0010\u00df\u00fbX\u00a4\u00c8\u008d\u0012\u008a\u0081\u00bf\u00f3z\u00c8b\u00b8\u000f \u0098`\u00adb\u00ad\u00a8\u0010\u0014\u00df\u00d1g\u00bf\u00c3C\u000f\u00c9\u0016\u00e0\u00db\u0010\u0092\u00ca\u00dc\u00be\u00b4=\t\u0005a~\u00ed^ \u0000\u009ap\u0092p\u00a6ct\u0084\u00ca\u008b.]~\u00a6G\u0019\u0095\u00c5B\":\u00bc\u00d4\u00e2YG\u0006\u00b6%\u00e4)\u0018p[\u00ebS\u00a3\u00e6\u00ae\u00c3\u001a**\u0096O@#\u00d2\u00b6Q\u0016\u0094Q\u008c\u00b4\u0084\u0018\u0091\u00eeu\n\u00f1;\u00be\u00edc\u00fe\u0017\u0096`~h.<\u00cc\u00b3p\u00b4!K] \u0015>\u0011Z\u00ffl\u0018\u00b0\u00f9\u00b6\u00e78\u00aa\u00d0N0\u0000\u0096\u00ca\u0086\u0018\u000bpxi|\u00a8\u0081k$\u00d3\u00be \u008a\u00d8\u00e8\u00bd\u00cc\u001e\u00ff\u0016\u00e0r*_pI9\u00fa\u00b8\u00d5I\u00d5\u00e7p\u0016\u00f5\nH\u00ea\f\u00cd\u00e3yP(\u0017\u001a\u0018\r\u00d9\u0085\u009e\u0091\u0003\u0084\u0083\u008dB\u00b8D\u0005\u00ba\"WG\u0087\u00fa\u00b8E\u00f3\u00bb\u00dd\u00c1\\$\u00d4b\u008b\u00b3:b\u00c2\u00f4\u0085\u00ed8\u001c\u00a8\u0099\u00c3\u00e2\u009aB\u0014\u00a0\u00bf\u00aa-\u00e9\u00eb\u00e4\u00a7\u00146\u00d3\u00fbNG\u008e\u0016\r\u00bb\u00ce\u00d2J\u008d@\u00cbFY3\u00c5\u00d1*\u0091$F2P\u0013\u00ff\u00c0\u00c1\u00c5\u0006\u0003.G\u001a\u00b5\u000e\u0018\u0010\u00f7\b\u00be\u00a6\u00ef\u00d0\u00b0S\u00fdr\n\u0019\u00c8\u00bd\u00cf\u00e1".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = ma.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "E\u00aab\u00d3\u00d0p1\u00ffR\u001f`-o6\u00ae]\u0010\u0099\u0007\u00e97\u00abR\u009eyF\u0011\u0000\u00b2\u00c7\u0082Xt";
                    var8_6 = "E\u00aab\u00d3\u00d0p1\u00ffR\u001f`-o6\u00ae]\u0010\u0099\u0007\u00e97\u00abR\u009eyF\u0011\u0000\u00b2\u00c7\u0082Xt".length();
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
                    var9_3[var7_4++] = ma.a(var10_9).intern();
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
        ma.x = var9_3;
        ma.y = new String[29];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6864;
        if (y[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])z.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    z.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ma", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = x[n2].getBytes("ISO-8859-1");
            ma.y[n2] = ma.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return y[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ma.a(n, l);
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
            throw new RuntimeException("ma" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ma.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
