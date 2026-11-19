import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Sj {
    private final ta d;
    private final List<Kz> a;
    private float e;
    private float c;
    private boolean b;
    private double f = 0.0;
    private static final long g = _c.a((long)910064149406903811L, (long)5979452181755195855L, MethodHandles.lookup().lookupClass()).a(215907931562810L);
    private static final String h;

    public Sj(ta ta2, float f, float f2) {
        this.d = ta2;
        this.e = f;
        this.c = f2;
        this.b = true;
        this.a = new ArrayList<Kz>();
        this.a();
    }

    private void a() {
        lh[] lhArray = tf.m().a();
        int n = lhArray.length;
        int n2 = 0;
        boolean bl = RO.b();
        while (n2 < n) {
            block5: {
                block6: {
                    lh lh2 = lhArray[n2];
                    try {
                        try {
                            if (!bl) break block5;
                            if (lh2.e() != this.d) break block6;
                        }
                        catch (H h) {
                            throw Sj.a(h);
                        }
                        this.a.add(new Kz(lh2));
                    }
                    catch (H h) {
                        throw Sj.a(h);
                    }
                }
                ++n2;
            }
            if (bl) continue;
        }
    }







    public void a(byte var1_1, int var2_2, int var3_3, long var4_4) {
        block60: {
            block62: {
                block61: {
                    block59: {
                        block57: {
                            block58: {
                                block55: {
                                    block56: {
                                        block54: {
                                            block52: {
                                                block53: {
                                                    block51: {
                                                        block47: {
                                                            block50: {
                                                                block49: {
                                                                    block48: {
                                                                        block45: {
                                                                            block46: {
                                                                                v0 = var6_5 = ((long)var1_1 << 56 | var4_4 << 8 >>> 8) ^ Sj.g;
                                                                                v1 = v0 ^ 73660961214400L;
                                                                                var8_6 = (int)(v1 >>> 48);
                                                                                var9_7 = (int)(v1 << 16 >>> 48);
                                                                                var10_8 = (int)(v1 << 32 >>> 32);
                                                                                v2 = v0 ^ 95756721389293L;
                                                                                var11_9 = (int)(v2 >>> 32);
                                                                                var12_10 = (int)(v2 << 32 >>> 48);
                                                                                var13_11 = (int)(v2 << 48 >>> 48);
                                                                                var15_12 = 11.0f;
                                                                                var14_13 = RO.c();
                                                                                try {
                                                                                    v3 = this.b;
                                                                                    if (var14_13 != 0) break block45;
                                                                                    if (v3 == 0) break block46;
                                                                                }
                                                                                catch (H v4) {
                                                                                    throw Sj.a(v4);
                                                                                }
                                                                                block36: for (Kz var17_16 : this.a) {
                                                                                    var15_12 += var17_16.d();
                                                                                    try {
                                                                                        do {
                                                                                            v5 = var14_13;
                                                                                            if (var4_4 > 0L) {
                                                                                                if (v5 != 0) break block47;
                                                                                                v5 = var14_13;
                                                                                            }
                                                                                            if (v5 == 0) continue block36;
                                                                                        } while (var1_1 < 0);
                                                                                        break;
                                                                                    }
                                                                                    catch (H v6) {
                                                                                        throw Sj.a(v6);
                                                                                    }
                                                                                }
                                                                            }
                                                                            v3 = (cfr_temp_0 = (float)var2_2 - this.e) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v7 = var14_13;
                                                                                if (var4_4 > 0L) {
                                                                                    if (v7 != 0) break block48;
                                                                                    if (v3 < 0) break block47;
                                                                                }
                                                                                ** GOTO lbl57
                                                                            }
                                                                            catch (H v8) {
                                                                                throw Sj.a(v8);
                                                                            }
                                                                            cfr_temp_1 = (float)var2_2 - (this.e + 66.0f);
                                                                            v3 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                        }
                                                                        catch (H v9) {
                                                                            throw Sj.a(v9);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v7 = var14_13;
lbl57:


                                                                            if (var4_4 >= 0L) {
                                                                                if (v7 != 0) break block49;
                                                                                if (v3 > 0) break block47;
                                                                            }
                                                                            ** GOTO lbl73
                                                                        }
                                                                        catch (H v10) {
                                                                            throw Sj.a(v10);
                                                                        }
                                                                        cfr_temp_2 = (float)var3_3 - this.c;
                                                                        v3 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                    }
                                                                    catch (H v11) {
                                                                        throw Sj.a(v11);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        v7 = var14_13;
lbl73:


                                                                        if (var1_1 >= 0) {
                                                                            if (v7 != 0) break block50;
                                                                            if (v3 < 0) break block47;
                                                                        }
                                                                        ** GOTO lbl88
                                                                    }
                                                                    catch (H v12) {
                                                                        throw Sj.a(v12);
                                                                    }
                                                                    cfr_temp_3 = (float)var3_3 - (this.c + var15_12);
                                                                    v3 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                                                }
                                                                catch (H v13) {
                                                                    throw Sj.a(v13);
                                                                }
                                                            }
                                                            try {
                                                                v7 = var14_13;
lbl88:


                                                                if (v7 != 0) break block51;
                                                                if (v3 > 0) break block47;
                                                            }
                                                            catch (H v14) {
                                                                throw Sj.a(v14);
                                                            }
                                                            v3 = 1;
                                                            break block51;
                                                        }
                                                        v3 = 0;
                                                    }
                                                    var16_15 = v3;
                                                    var17_16 = (mr)tf.m().a(mr.class);
                                                    var18_17 = var17_16.n();
                                                    var19_18 = var17_16.a();
                                                    try {
                                                        try {
                                                            v15 = var18_17;
                                                            v16 = var14_13;
                                                            if (var1_1 >= 0) {
                                                                if (v16 != 0) break block52;
                                                                v16 = var19_18;
                                                            }
                                                            if (v15 == v16) break block53;
                                                        }
                                                        catch (H v17) {
                                                            throw Sj.a(v17);
                                                        }
                                                        v15 = 1;
                                                        break block52;
                                                    }
                                                    catch (H v18) {
                                                        throw Sj.a(v18);
                                                    }
                                                }
                                                v15 = 0;
                                            }
                                            var20_19 = v15;
                                            var21_20 = -603979776 | var18_17 & 0xFFFFFF;
                                            try {
                                                v19 = this;
                                                v20 = var16_15 != 0 ? 1.0 : 0.0;
                                            }
                                            catch (H v21) {
                                                throw Sj.a(v21);
                                            }
                                            v19.f = Lf.a((double)v20, (double)this.f, (double)0.2, (double)RO.c);
                                            var22_21 = r_.a((int)(-603979776 | r_.b((int)var18_17, (float)0.85f) & 0xFFFFFF), (int)(-268435456 | var18_17 & 0xFFFFFF), (double)this.f);
                                            var23_22 = r_.a((int)r_.a((int)220, (int)210), (int)r_.a((int)255, (int)210), (double)this.f);
                                            try {
                                                v22 = var20_19;
                                                if (var14_13 != 0) break block54;
                                                if (v22 == 0) {
                                                }
                                                ** GOTO lbl142
                                            }
                                            catch (H v23) {
                                                throw Sj.a(v23);
                                            }
                                            var24_23 = r_.a((int)r_.b((int)var21_20, (float)0.5f), (int)r_.b((int)var21_20, (float)0.4f), (double)this.f);
                                            try {
                                                if (var4_4 < 0L) break block55;
                                                if (var14_13 == 0) break block56;
lbl142:


                                                v22 = r_.a((int)(-603979776 | r_.b((int)var19_18, (float)0.85f) & 0xFFFFFF), (int)(-268435456 | var19_18 & 0xFFFFFF), (double)this.f);
                                            }
                                            catch (H v24) {
                                                throw Sj.a(v24);
                                            }
                                        }
                                        var24_23 = v22;
                                    }
                                    Od.a((char)((char)var8_6), (float)this.e, (float)this.c, (float)(this.e + 66.0f), (char)((char)var9_7), (float)(this.c + 11.0f), (int)var22_21, (int)var24_23, (int)var10_8);
                                    Od.a((double)this.e, (double)this.c, (double)(this.e + 66.0f), (double)(this.c + 11.0f), (double)0.5, (int)0, (int)r_.a((int)0, (int)80));
                                }
                                var25_24 = gh.e.a(13.0f);
                                var26_25 = Sj.h + this.d.b();
                                try {
                                    try {
                                        Od.b((String)var26_25, (float)(this.e + (float)(66 - var25_24.a(var11_9, (short)var12_10, (short)var13_11, var26_25)) / 2.0f), (float)(this.c + 5.5f - (float)var25_24.c() / 2.0f + 0.5f), (int)var23_22, (Di)var25_24);
                                        v25 = this;
                                        v26 = var14_13;
                                        if (var1_1 < 0) break block57;
                                        if (v26 != 0) break block58;
                                        if (!v25.b) break block59;
                                    }
                                    catch (H v27) {
                                        throw Sj.a(v27);
                                    }
                                    v25 = this;
                                }
                                catch (H v28) {
                                    throw Sj.a(v28);
                                }
                            }
                            v26 = var2_2;
                        }
                        v25.c(v26, var3_3);
                    }
                    try {
                        try {
                            if (LQ.J() == null) break block60;
                            if (var14_13 == 0) break block61;
                        }
                        catch (H v29) {
                            throw Sj.a(v29);
                        }
                        v30 = false;
                        break block62;
                    }
                    catch (H v31) {
                        throw Sj.a(v31);
                    }
                }
                v30 = true;
            }
            RO.b((boolean)v30);
        }
    }

    public void b(float f) {
        this.e = f;
    }

    public void a(float f) {
        this.c = f;
    }

    private void c(int n, int n2) {
        long l = g ^ 0x7A340D7450E4L;
        long l2 = l ^ 0x2060F1489AADL;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 56);
        int n5 = (int)(l2 << 40 >>> 40);
        float f = 11.0f;
        boolean bl = RO.b();
        for (Kz kz : this.a) {
            kz.c(n3, (byte)n4, n5, this.e, this.c + f, 66, n, n2);
            f += kz.d();
            if (bl) continue;
        }
    }

    public void c(int n, int n2, int n3) {
        block11: {
            Sj sj;
            block10: {
                boolean bl;
                block8: {
                    boolean bl2;
                    block9: {
                        bl2 = RO.b();
                        try {
                            try {
                                bl = this.b(n, n2);
                                if (!bl2) break block8;
                                if (!bl) break block9;
                            }
                            catch (H h) {
                                throw Sj.a(h);
                            }
                            this.a(n3);
                            return;
                        }
                        catch (H h) {
                            throw Sj.a(h);
                        }
                    }
                    try {
                        sj = this;
                        if (!bl2) break block10;
                        bl = sj.b;
                    }
                    catch (H h) {
                        throw Sj.a(h);
                    }
                }
                if (!bl) break block11;
                sj = this;
            }
            sj.a(n, n2, n3);
        }
    }

    private boolean b(int n, int n2) {
        float f;
        block18: {
            block15: {
                boolean bl;
                block17: {
                    block16: {
                        block14: {
                            bl = RO.c();
                            try {
                                try {
                                    float f2 = (float)n - this.e;
                                    f = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                    if (bl) break block14;
                                    if (f < 0) break block15;
                                }
                                catch (H h) {
                                    throw Sj.a(h);
                                }
                                float f3 = (float)n - (this.e + 66.0f);
                                f = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                            }
                            catch (H h) {
                                throw Sj.a(h);
                            }
                        }
                        try {
                            try {
                                if (bl) break block16;
                                if (f > 0) break block15;
                            }
                            catch (H h) {
                                throw Sj.a(h);
                            }
                            float f4 = (float)n2 - this.c;
                            f = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                        }
                        catch (H h) {
                            throw Sj.a(h);
                        }
                    }
                    try {
                        try {
                            if (bl) break block17;
                            if (f < 0) break block15;
                        }
                        catch (H h) {
                            throw Sj.a(h);
                        }
                        float f5 = (float)n2 - (this.c + 11.0f);
                        f = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                    }
                    catch (H h) {
                        throw Sj.a(h);
                    }
                }
                try {
                    if (bl) break block18;
                    if (f > 0) break block15;
                }
                catch (H h) {
                    throw Sj.a(h);
                }
                f = 1.0f;
                break block18;
            }
            f = 0.0f;
        }
        return (boolean)f;
    }

    private void a(int n) {
        try {
            if (n == 1) {
                this.b();
            }
        }
        catch (H h) {
            throw Sj.a(h);
        }
    }

    private void b() {
        boolean bl;
        block2: {
            block3: {
                boolean bl2 = RO.b();
                try {
                    Sj sj = this;
                    bl = this.b;
                    if (!bl2) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw Sj.a(h);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        sj.b = bl;
    }

    private void a(int n, int n2, int n3) {
        long l = g ^ 0x5EFCACF3EEBL;
        long l2 = l ^ 0x1F18CF0CAD8DL;
        int n4 = (int)(l2 >>> 48);
        long l3 = l2 << 16 >>> 16;
        float f = 11.0f;
        Iterator<Kz> iterator = this.a.iterator();
        boolean bl = RO.b();
        while (iterator.hasNext()) {
            block5: {
                Kz kz;
                block6: {
                    kz = iterator.next();
                    try {
                        try {
                            if (!bl) break block5;
                            if (!kz.b(this.e + 2.0f, this.c + f, 62, n, n2, (short)n4, n3, l3)) break block6;
                        }
                        catch (H h) {
                            throw Sj.a(h);
                        }
                        if (bl) break;
                    }
                    catch (H h) {
                        throw Sj.a(h);
                    }
                }
                f += kz.d();
            }
            if (bl) continue;
        }
    }

    public void b(int n, int n2, int n3) {
        block6: {
            Sj sj;
            boolean bl;
            block5: {
                bl = RO.b();
                try {
                    try {
                        sj = this;
                        if (!bl) break block5;
                        if (!sj.b) break block6;
                    }
                    catch (H h) {
                        throw Sj.a(h);
                    }
                    sj = this;
                }
                catch (H h) {
                    throw Sj.a(h);
                }
            }
            for (Kz kz : sj.a) {
                kz.a(n, n2, n3);
                if (bl) continue;
            }
        }
    }

    public boolean a(char c, int n) {
        boolean bl;
        block7: {
            block8: {
                boolean bl2 = RO.b();
                try {
                    bl = this.b;
                    if (!bl2) break block7;
                    if (!bl) break block8;
                }
                catch (H h) {
                    throw Sj.a(h);
                }
                for (Kz kz : this.a) {
                    block10: {
                        boolean bl3;
                        block9: {
                            try {
                                try {
                                    bl = kz.a(c, n);
                                    if (!bl2) break block7;
                                    if (!bl2) break block9;
                                }
                                catch (H h) {
                                    throw Sj.a(h);
                                }
                                if (!bl) break block10;
                            }
                            catch (H h) {
                                throw Sj.a(h);
                            }
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (bl2) continue;
                }
            }
            bl = false;
        }
        return bl;
    }




    static {
        long l = g ^ 0x5E24AA3EBDDAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0095\u008bpO\u00f5$\u001a=".getBytes("ISO-8859-1"));
                h = Sj.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}
