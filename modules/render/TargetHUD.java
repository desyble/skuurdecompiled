import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mK
extends lh {
    private final mr k = (mr)tf.m().a(mr.class);
    private final lX n = (lX)tf.m().a(lX.class);
    private final Map<Integer, wX> m = new LinkedHashMap<Integer, wX>();
    @A
    public final R8<bR> l = this::lambda$new$0;
    @A(value=0)
    public final R8<v7> o = this::a;
    private static final long p = _c.a((long)-8737646637209167996L, (long)386122179695129501L, MethodHandles.lookup().lookupClass()).a(190573490336974L);
    private static final String[] q;
    private static final String[] r;
    private static final Map s;

    public mK(EU eU) {
        super(eU);
    }

    private void a(v7 v72) {
        int n;
        float f;
        float f2;
        float f3;
        Object object;
        boolean bl;
        block91: {
            int n2;
            int n3;
            int n4;
            int n5;
            block75: {
                Object object2;
                Object object3;
                block74: {
                    boolean bl2;
                    int n6;
                    int n7;
                    int n8;
                    block72: {
                        long l;
                        long l2 = l = p ^ 0x2B3E5F9C433L;
                        long l3 = l2 ^ 0x4BB3C91DEE59L;
                        n5 = (int)(l3 >>> 48);
                        n4 = (int)(l3 << 16 >>> 32);
                        n3 = (int)(l3 << 48 >>> 48);
                        long l4 = l2 ^ 0x7B998D752DCFL;
                        n8 = (int)(l4 >>> 48);
                        n7 = (int)(l4 << 16 >>> 48);
                        n6 = (int)(l4 << 32 >>> 32);
                        object3 = this.m.values().iterator();
                        bl = mr.e();
                        while (object3.hasNext()) {
                            object2 = object3.next();
                            ((wX)object2).r = false;
                            if (!bl) continue;
                        }
                        object3 = new ArrayList();
                        try {
                            block73: {
                                try {
                                    try {
                                        bl2 = Hk.e() instanceof oa;
                                        if (bl) break block72;
                                        if (!bl2) break block73;
                                    }
                                    catch (H h) {
                                        throw mK.a(h);
                                    }
                                    object3.add(Hk.j());
                                    if (!bl) break block74;
                                }
                                catch (H h) {
                                    throw mK.a(h);
                                }
                            }
                            bl2 = this.n.b();
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                    }
                    try {
                        try {
                            if (bl || !bl2) break block74;
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                        bl2 = object3.addAll(this.n.c((short)n8, (char)n7, n6));
                    }
                    catch (H h) {
                        throw mK.a(h);
                    }
                }
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    block80: {
                        Object object4;
                        block79: {
                            block76: {
                                block77: {
                                    mK mK2;
                                    int n9;
                                    block78: {
                                        LM lM = (LM)object2.next();
                                        n2 = lM.O();
                                        if (bl) break block75;
                                        n9 = n2;
                                        object = this.m.get(n9);
                                        try {
                                            try {
                                                try {
                                                    object4 = object;
                                                    if (bl) break block76;
                                                    if (object4 != null) break block77;
                                                }
                                                catch (H h) {
                                                    throw mK.a(h);
                                                }
                                                mK2 = this;
                                                if (bl) break block78;
                                            }
                                            catch (H h) {
                                                throw mK.a(h);
                                            }
                                            if (mK2.m.size() >= 4) break block77;
                                        }
                                        catch (H h) {
                                            throw mK.a(h);
                                        }
                                        object = new wX(lM);
                                        mK2 = this;
                                    }
                                    mK2.a(n9, (wX)object);
                                }
                                object4 = object;
                            }
                            try {
                                try {
                                    if (bl) break block79;
                                    if (object4 == null) break block80;
                                }
                                catch (H h) {
                                    throw mK.a(h);
                                }
                                ((wX)object).r = true;
                                ((wX)object).l = false;
                                ((wX)object).j.e();
                                object4 = object;
                            }
                            catch (H h) {
                                throw mK.a(h);
                            }
                        }
                        object4.b((short)n5, n4, (short)n3);
                    }
                    if (!bl) continue;
                }
                n2 = v72.c().a();
            }
            f3 = (float)n2 / 2.0f + 18.0f;
            f2 = (float)v72.c().c() / 2.0f + 18.0f;
            Iterator<Map.Entry<Integer, wX>> iterator = this.m.entrySet().iterator();
            object = new ArrayList();
            while (iterator.hasNext()) {
                block87: {
                    double d;
                    wX wX2;
                    block88: {
                        block89: {
                            block90: {
                                double d2;
                                float f4;
                                block85: {
                                    block86: {
                                        float f5;
                                        boolean bl3;
                                        block81: {
                                            block82: {
                                                boolean bl4;
                                                boolean bl5;
                                                block84: {
                                                    block83: {
                                                        wX2 = iterator.next().getValue();
                                                        try {
                                                            try {
                                                                try {
                                                                    bl3 = wX2.r;
                                                                    if (bl) break block81;
                                                                    if (bl3) break block82;
                                                                }
                                                                catch (H h) {
                                                                    throw mK.a(h);
                                                                }
                                                                if (Hk.a().d(wX2.h.O()) == null) break block83;
                                                            }
                                                            catch (H h) {
                                                                throw mK.a(h);
                                                            }
                                                            bl5 = true;
                                                            break block84;
                                                        }
                                                        catch (H h) {
                                                            throw mK.a(h);
                                                        }
                                                    }
                                                    bl5 = false;
                                                }
                                                boolean bl6 = bl5;
                                                try {
                                                    bl4 = wX2.h == Hk.j();
                                                }
                                                catch (H h) {
                                                    throw mK.a(h);
                                                }
                                                boolean bl7 = bl4;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl3 = bl7;
                                                                        if (bl) break block81;
                                                                        if (bl3) break block82;
                                                                    }
                                                                    catch (H h) {
                                                                        throw mK.a(h);
                                                                    }
                                                                    bl3 = bl6;
                                                                    if (bl) break block81;
                                                                }
                                                                catch (H h) {
                                                                    throw mK.a(h);
                                                                }
                                                                if (!bl3) break block82;
                                                            }
                                                            catch (H h) {
                                                                throw mK.a(h);
                                                            }
                                                            bl3 = wX2.j.a(800L);
                                                            if (bl) break block81;
                                                        }
                                                        catch (H h) {
                                                            throw mK.a(h);
                                                        }
                                                        if (bl3) break block82;
                                                    }
                                                    catch (H h) {
                                                        throw mK.a(h);
                                                    }
                                                    wX2.r = true;
                                                    wX2.l = false;
                                                    wX2.b((short)n5, n4, (short)n3);
                                                }
                                                catch (H h) {
                                                    throw mK.a(h);
                                                }
                                            }
                                            bl3 = wX2.r;
                                        }
                                        try {
                                            f5 = bl3 ? 1.0f : 0.0f;
                                        }
                                        catch (H h) {
                                            throw mK.a(h);
                                        }
                                        f4 = f5;
                                        try {
                                            try {
                                                d2 = wX2.k;
                                                if (bl) break block85;
                                                if (!(d2 < (double)f4)) break block86;
                                            }
                                            catch (H h) {
                                                throw mK.a(h);
                                            }
                                            d2 = 0.01;
                                            break block85;
                                        }
                                        catch (H h) {
                                            throw mK.a(h);
                                        }
                                    }
                                    d2 = 0.03;
                                }
                                double d3 = d2;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        wX2.k = (float)Lf.a((double)f4, (double)wX2.k, (double)d3, (double)cp.f);
                                                        double d4 = wX2.k - (double)0.01f;
                                                        d = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                                                        if (bl) break block87;
                                                        if (d >= 0) break block88;
                                                    }
                                                    catch (H h) {
                                                        throw mK.a(h);
                                                    }
                                                    d = (double)wX2.r;
                                                    if (bl) break block87;
                                                }
                                                catch (H h) {
                                                    throw mK.a(h);
                                                }
                                                if (d != false) break block88;
                                            }
                                            catch (H h) {
                                                throw mK.a(h);
                                            }
                                            d = (double)wX2.l;
                                            if (bl) break block89;
                                        }
                                        catch (H h) {
                                            throw mK.a(h);
                                        }
                                        if (d != false) break block90;
                                    }
                                    catch (H h) {
                                        throw mK.a(h);
                                    }
                                    wX2.l = true;
                                    wX2.g.e();
                                }
                                catch (H h) {
                                    throw mK.a(h);
                                }
                            }
                            d = (double)wX2.g.a(100L);
                        }
                        try {
                            try {
                                if (bl) break block87;
                                if (d == false) break block88;
                            }
                            catch (H h) {
                                throw mK.a(h);
                            }
                            wX2.a();
                            iterator.remove();
                            if (!bl) continue;
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                    }
                    d = (double)object.add(wX2);
                }
                if (!bl) continue;
            }
            f = 80.0f;
            for (n = 0; n < object.size(); ++n) {
                f = Math.max(f, ((wX)object.get((int)n)).s);
                try {
                    if (!bl) {
                        if (!bl) continue;
                        break;
                    }
                    break block91;
                }
                catch (H h) {
                    throw mK.a(h);
                }
            }
            n = 0;
        }
        while (n < object.size()) {
            float f6;
            wX wX3 = (wX)object.get(n);
            int n10 = object.size() - 1 - n;
            try {
                f6 = n10 % 2 == 0 ? 0.0f : f + 1.0f;
            }
            catch (H h) {
                throw mK.a(h);
            }
            float f7 = f6;
            float f8 = (float)(n10 / 2) * 25.0f;
            this.a(wX3, f3 + f7, f2 + f8);
            ++n;
            if (!bl) continue;
        }
    }

    private void a(wX wX2, float f, float f2) {
        try {
            if (wX2.o == null) {
                return;
            }
        }
        catch (H h) {
            throw mK.a(h);
        }
        int n = this.k.n();
        int n2 = this.k.a();
        int n3 = (int)(wX2.k * 255.0);
        hV.d().a(n3, () -> mK.lambda$renderTargetHud$2(wX2, f, f2, n3, n, n2));
    }

    private void a(int n, wX wX2) {
        this.m.put(n, wX2);
    }




    private static void lambda$renderTargetHud$2(wX var0, float var1_1, float var2_2, int var3_3, int var4_4, int var5_5) {
        block72: {
            block73: {
                block71: {
                    block69: {
                        block70: {
                            block67: {
                                block68: {
                                    block64: {
                                        block65: {
                                            block62: {
                                                block60: {
                                                    block61: {
                                                        block59: {
                                                            block58: {
                                                                block57: {
                                                                    block56: {
                                                                        block54: {
                                                                            block55: {
                                                                                v0 = var6_6 = mK.p ^ 91715526902723L;
                                                                                v1 = v0 ^ 116307889151734L;
                                                                                var8_7 = (int)(v1 >>> 32);
                                                                                var9_8 = v1 << 32 >>> 32;
                                                                                v2 = v0 ^ 37921687466429L;
                                                                                var11_9 = v2 >>> 32;
                                                                                var13_10 = (int)(v2 << 32 >>> 32);
                                                                                var17_11 = gh.i;
                                                                                var16_12 = mr.e();
                                                                                var18_13 = tf.l.h().b(var0.o);
                                                                                try {
                                                                                    v3 = var17_11.a(var11_9, var13_10, var0.o, 14.5f);
                                                                                    v4 = var17_11;
                                                                                    v5 = var18_13 == null ? "" : " " + var18_13.a;
                                                                                }
                                                                                catch (H v6) {
                                                                                    throw mK.a(v6);
                                                                                }
                                                                                var14_14 = 14.5f;
                                                                                var15_15 = v5;
                                                                                var19_16 = Math.max(v3 + v4.a(var11_9, var13_10, var15_15, var14_14) + 20.5f, 80.0f);
                                                                                try {
                                                                                    try {
                                                                                        var0.s = var19_16;
                                                                                        zS.a((double)var1_1, (double)var2_2, (double)(var1_1 + var19_16), (double)(var2_2 + 24.0f), (int)r_.a((int)20, (int)170));
                                                                                        v7 = var0.f;
                                                                                        v8 = -1;
                                                                                        if (var16_12) break block54;
                                                                                        if (v7 == v8) break block55;
                                                                                    }
                                                                                    catch (H v9) {
                                                                                        throw mK.a(v9);
                                                                                    }
                                                                                    zS.a((float)(var1_1 + 2.0f), (float)(var2_2 + 2.0f), (float)16.0f, (int)var0.f, (float)var3_3);
                                                                                }
                                                                                catch (H v10) {
                                                                                    throw mK.a(v10);
                                                                                }
                                                                            }
                                                                            v7 = var0.m;
                                                                            v8 = 10;
                                                                        }
                                                                        try {
                                                                            v11 = v7 == v8 ? 1.0f : 0.0f;
                                                                        }
                                                                        catch (H v12) {
                                                                            throw mK.a(v12);
                                                                        }
                                                                        var20_17 = v11;
                                                                        try {
                                                                            try {
                                                                                if (var16_12) break block56;
                                                                                if ((double)var20_17 > var0.d) {
                                                                                }
                                                                                ** GOTO lbl63
                                                                            }
                                                                            catch (H v13) {
                                                                                throw mK.a(v13);
                                                                            }
                                                                            var0.d = var20_17;
                                                                        }
                                                                        catch (H v14) {
                                                                            throw mK.a(v14);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (!var16_12) break block57;
lbl63:


                                                                        var0.d = (float)Lf.a((double)var20_17, (double)var0.d, (double)0.002, (double)0.10000000149011612, (double)cp.f);
                                                                    }
                                                                    catch (H v15) {
                                                                        throw mK.a(v15);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        v16 = var0.d;
                                                                        v17 = 0.01;
                                                                        if (var16_12) break block58;
                                                                        if (!(v16 > v17)) break block59;
                                                                    }
                                                                    catch (H v18) {
                                                                        throw mK.a(v18);
                                                                    }
                                                                    v16 = var1_1 + 2.0f;
                                                                    v17 = var2_2 + 2.0f;
                                                                }
                                                                catch (H v19) {
                                                                    throw mK.a(v19);
                                                                }
                                                            }
                                                            zS.a((double)v16, (double)v17, (double)(var1_1 + 2.0f + 16.0f), (double)(var2_2 + 2.0f + 16.0f), (int)r_.a((int)255, (int)0, (int)0, (int)((int)(var0.d * 70.0))));
                                                        }
                                                        try {
                                                            try {
                                                                var17_11.a(var0.o, var1_1 + 20.0f, var2_2 + 0.5f, var8_7, 14.5f, r_.a((int)255, (int)210), var9_8);
                                                                if (var16_12) break block60;
                                                                if (var18_13 != null) {
                                                                }
                                                                break block61;
                                                            }
                                                            catch (H v20) {
                                                                throw mK.a(v20);
                                                            }
                                                            var17_11.a(" " + var18_13.a, var1_1 + 19.0f + var17_11.a(var11_9, var13_10, var0.o, 14.5f), var2_2 + 0.5f, var8_7, 14.5f, var4_4, var9_8);
                                                        }
                                                        catch (H v21) {
                                                            throw mK.a(v21);
                                                        }
                                                    }
                                                    zS.a((double)(var1_1 + 1.5f), (double)(var2_2 + 19.5f), (double)((double)(var1_1 + var19_16) - 1.5), (double)(var2_2 + 22.5f), (double)0.5, (int)r_.a((int)20, (int)120), (int)r_.a((int)41, (int)41, (int)41, (int)124));
                                                }
                                                var21_18 = var0.b + var0.c;
                                                var22_19 = Math.max(0.0f, Math.min(var21_18 / var0.a, 1.0f));
                                                var23_20 = (var19_16 - 4.0f) * var22_19;
                                                try {
                                                    try {
                                                        block63: {
                                                            try {
                                                                try {
                                                                    var0.p = Lf.a((double)var23_20, (double)var0.p, (double)0.02, (double)cp.f);
                                                                    v22 = var0.q;
                                                                    if (var16_12) break block62;
                                                                    if (v22 == 0) break block63;
                                                                }
                                                                catch (H v23) {
                                                                    throw mK.a(v23);
                                                                }
                                                                var0.p = var23_20;
                                                                var0.i = var23_20;
                                                                var0.q = false;
                                                                if (!var16_12) break block64;
                                                            }
                                                            catch (H v24) {
                                                                throw mK.a(v24);
                                                            }
                                                        }
                                                        var0.p = Lf.a((double)var23_20, (double)var0.p, (double)0.02, (double)cp.f);
                                                        v25 = var0;
                                                        if (var16_12) break block65;
                                                    }
                                                    catch (H v26) {
                                                        throw mK.a(v26);
                                                    }
                                                    cfr_temp_0 = v25.i - var0.p;
                                                    v22 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                }
                                                catch (H v27) {
                                                    throw mK.a(v27);
                                                }
                                            }
                                            try {
                                                block66: {
                                                    try {
                                                        if (v22 >= 0) break block66;
                                                        var0.i = var0.p;
                                                        if (!var16_12) break block64;
                                                    }
                                                    catch (H v28) {
                                                        throw mK.a(v28);
                                                    }
                                                }
                                                v25 = var0;
                                            }
                                            catch (H v29) {
                                                throw mK.a(v29);
                                            }
                                        }
                                        v25.i = (float)Lf.a((double)var23_20, (double)var0.i, (double)0.005, (double)cp.f);
                                    }
                                    try {
                                        try {
                                            cfr_temp_1 = var0.i - 0.5;
                                            v30 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                            if (var16_12) break block67;
                                            if (v30 <= 0) break block68;
                                        }
                                        catch (H v31) {
                                            throw mK.a(v31);
                                        }
                                        zS.b((double)(var1_1 + 2.0f), (double)(var2_2 + 20.0f), (double)((double)(var1_1 + 2.0f) + var0.i), (double)(var2_2 + 22.0f), (double)(var19_16 - 4.0f), (int)r_.b((int)var4_4, (float)0.7f), (int)r_.b((int)var5_5, (float)0.7f));
                                    }
                                    catch (H v32) {
                                        throw mK.a(v32);
                                    }
                                }
                                v30 = (cfr_temp_2 = var0.p - 0.5) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                            }
                            try {
                                try {
                                    if (var16_12) break block69;
                                    if (v30 <= 0) break block70;
                                }
                                catch (H v33) {
                                    throw mK.a(v33);
                                }
                                zS.b((double)(var1_1 + 2.0f), (double)(var2_2 + 20.0f), (double)((double)(var1_1 + 2.0f) + var0.p), (double)(var2_2 + 22.0f), (double)(var19_16 - 4.0f), (int)var4_4, (int)var5_5);
                            }
                            catch (H v34) {
                                throw mK.a(v34);
                            }
                        }
                        try {
                            v35 = var0.c;
                            v36 = 0.0f;
                            if (var16_12) break block71;
                            cfr_temp_3 = v35 - v36;
                            v30 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                        }
                        catch (H v37) {
                            throw mK.a(v37);
                        }
                    }
                    if (v30 > 0) {
                        var24_21 = Math.min(var0.c / var0.a, 1.0f);
                        var25_22 = (var19_16 - 4.0f) * var24_21;
                        zS.a((double)(var1_1 + 2.0f), (double)(var2_2 + 20.0f), (double)(var1_1 + 2.0f + var25_22), (double)(var2_2 + 22.0f), (int)r_.a((int)var4_4, (float)0.4f));
                    }
                    v35 = Hk.j().a() + Hk.j().K();
                    v36 = var21_18;
                }
                var24_21 = v35 - v36;
                try {
                    v38 = new StringBuilder();
                    v39 = var24_21 > 0.0f ? "+" : "";
                }
                catch (H v40) {
                    throw mK.a(v40);
                }
                try {
                    v41 = v38.append(v39);
                    v42 = Math.abs(var24_21) >= 100.0f ? String.format(Locale.US, (String)mK.a("h", (int)16310, (long)(7930491678039710568L ^ var6_6)), new Object[]{Float.valueOf(var24_21)}) : String.format(Locale.US, (String)mK.a("h", (int)10567, (long)(3950013517193743768L ^ var6_6)), new Object[]{Float.valueOf(var24_21)});
                }
                catch (H v43) {
                    throw mK.a(v43);
                }
                var25_23 = v41.append(v42).toString();
                try {
                    if (var16_12) break block72;
                    if (var24_21 == 0.0f) break block73;
                }
                catch (H v44) {
                    throw mK.a(v44);
                }
                var26_24 = var17_11.a(var11_9, var13_10, var25_23, 12.5f);
                var17_11.a(var25_23, var1_1 + var19_16 - 2.0f - var26_24, var2_2 + 12.5f, var8_7, 12.5f, r_.a((int)255, (int)210), var9_8);
            }
            hV.d().a((HG)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$null$1(float wX float int ), ()V)((float)var1_1, (wX)var0, (float)var2_2, (int)var3_3));
        }
    }

    private static void lambda$null$1(float f, wX wX2, float f2, int n) {
        wX wX3;
        boolean bl;
        float f3;
        int n2;
        int n3;
        block5: {
            block6: {
                long l = p ^ 0x4426B6CA56F3L;
                long l2 = l ^ 0x705F7161F904L;
                n3 = (int)(l2 >>> 32);
                n2 = (int)(l2 << 32 >>> 32);
                f3 = f + 20.0f;
                bl = mr.k();
                try {
                    wX3 = wX2;
                    if (!bl) break block5;
                    if (wX3.e == null) break block6;
                }
                catch (H h) {
                    throw mK.a(h);
                }
                cp.a((int)n3, (qP)wX2.e, (float)f3, (float)(f2 + 10.0f), (float)0.5f, (int)n, (int)n2);
                f3 += 8.0f;
            }
            wX3 = wX2;
        }
        int n4 = wX3.t.length - 1;
        while (n4 >= 0) {
            block7: {
                block8: {
                    qP qP2 = wX2.t[n4];
                    try {
                        if (!bl) break block7;
                        if (qP2 == null) break block8;
                    }
                    catch (H h) {
                        throw mK.a(h);
                    }
                    cp.a((int)n3, (qP)qP2, (float)f3, (float)(f2 + 10.0f), (float)0.5f, (int)n, (int)n2);
                    f3 += 8.0f;
                }
                --n4;
            }
            if (bl) continue;
        }
    }

    private void lambda$new$0(bR bR2) {
        block24: {
            int n;
            int n2;
            LQ lQ;
            int n3;
            int n4;
            int n5;
            block28: {
                int n6;
                boolean bl;
                block27: {
                    F2 f2;
                    block26: {
                        I2 i2;
                        block25: {
                            boolean bl2;
                            block23: {
                                long l = p ^ 0x5F64C3EBB1CCL;
                                long l2 = l ^ 0x1664EF0F9BA6L;
                                n5 = (int)(l2 >>> 48);
                                n4 = (int)(l2 << 16 >>> 32);
                                n3 = (int)(l2 << 48 >>> 48);
                                bl = mr.e();
                                try {
                                    try {
                                        try {
                                            bl2 = this.n.b();
                                            if (bl) break block23;
                                            if (bl2) break block24;
                                        }
                                        catch (H h) {
                                            throw mK.a(h);
                                        }
                                        i2 = bR2.a();
                                        if (bl) break block25;
                                    }
                                    catch (H h) {
                                        throw mK.a(h);
                                    }
                                    bl2 = i2 instanceof F2;
                                }
                                catch (H h) {
                                    throw mK.a(h);
                                }
                            }
                            try {
                                if (!bl2) break block24;
                                i2 = bR2.a();
                            }
                            catch (H h) {
                                throw mK.a(h);
                            }
                        }
                        F2 f22 = (F2)i2;
                        try {
                            try {
                                f2 = f22;
                                if (bl) break block26;
                                if (f2.a() != G9.ATTACK) break block24;
                            }
                            catch (H h) {
                                throw mK.a(h);
                            }
                            f2 = f22;
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                    }
                    lQ = f2.a((rd)Hk.b().aq);
                    try {
                        try {
                            n6 = lQ instanceof M2;
                            if (bl) break block27;
                            if (n6 == 0) break block24;
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                        n6 = lQ.O();
                    }
                    catch (H h) {
                        throw mK.a(h);
                    }
                }
                n2 = n6;
                try {
                    block29: {
                        try {
                            try {
                                n = this.m.containsKey(n2);
                                if (bl) break block28;
                                if (n == 0) break block29;
                            }
                            catch (H h) {
                                throw mK.a(h);
                            }
                            this.m.get((Object)Integer.valueOf((int)n2)).j.e();
                            if (!bl) break block24;
                        }
                        catch (H h) {
                            throw mK.a(h);
                        }
                    }
                    n = this.m.size();
                }
                catch (H h) {
                    throw mK.a(h);
                }
            }
            if (n < 4) {
                wX wX2 = new wX((LM)lQ);
                wX2.r = true;
                wX2.b((short)n5, n4, (short)n3);
                wX2.j.e();
                this.a(n2, wX2);
            }
        }
    }




    static {
        s = new HashMap(13);
        long l = p ^ 0x2BC9856C1E4L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = ";4\u00c7\u00a8nA<Z\u00c7L\u00fa\u00f9\u00eb\u00e8\n~\u0010\u00be\u00c3\u000ee\u009d G\u00cbu\u008d\u00e3\u001cT\u00b8}\u0016";
        int n2 = ";4\u00c7\u00a8nA<Z\u00c7L\u00fa\u00f9\u00eb\u00e8\n~\u0010\u00be\u00c3\u000ee\u009d G\u00cbu\u008d\u00e3\u001cT\u00b8}\u0016".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = mK.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                q = stringArray;
                r = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16F6;
        if (r[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mK", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = q[n2].getBytes("ISO-8859-1");
            mK.r[n2] = mK.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mK.a(n, l);
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
            throw new RuntimeException("mK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
