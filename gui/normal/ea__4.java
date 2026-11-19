import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ea {
    public static List<RX> d;
    private float a;
    private float c;
    private boolean e;
    private double b;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    public ea(float f, short s, char c, int n, float f2) {
        long l = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ ea.f;
        long l2 = l ^ 0x3DAC0A6F3AEDL;
        int n2 = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        this.b = 0.0;
        this.a = f;
        this.c = f2;
        this.e = true;
        d = new ArrayList<RX>();
        ea.a(n2, l3);
    }





    public static void a(int var0, long var1_1) {
        var3_2 = ((long)var0 << 32 | var1_1 << 32 >>> 32) ^ ea.f;
        v0 = var3_2 ^ 76906060241305L;
        var5_3 = (int)(v0 >>> 32);
        var6_4 = (int)(v0 << 32 >>> 40);
        var7_5 = (int)(v0 << 56 >>> 56);
        ea.d.clear();
        var9_6 = tf.f().c(var5_3, var6_4, (byte)var7_5);
        var10_7 = var9_6.iterator();
        var8_8 = RO.b();
        block10: while (var10_7.hasNext()) {
            v1    = var10_7.next();
            do {
                block15: {
                    block14: {
                        var11_9 = (String)v1   ;
                        try {
                            try {
                                try {
                                    block16: {
                                        v2 = var11_9.equalsIgnoreCase((String)ea.a("k", (int)6124, (long)(4046970664060529202L ^ var3_2)));
                                        v3 = var8_8;
                                        if (var0 < 0) break block16;
                                        if (!v3) ** GOTO lbl48
                                        v3 = var8_8;
                                    }
                                    if (!v3) break block14;
                                }
                                catch (H v4) {
                                    throw ea.a(v4);
                                }
                                if (var0 <= 0) break block15;
                                if (!v2) break block14;
                            }
                            catch (H v5) {
                                throw ea.a(v5);
                            }
                            ea.d.add(new RX(var11_9));
                        }
                        catch (H v6) {
                            throw ea.a(v6);
                        }
                    }
                    v7 = var8_8;
                }
                if (v7) continue block10;
                v1    = var9_6.iterator();
            } while (var0 < 0);
        }
        var10_7 = v1   ;
        do {
            v2 = var10_7.hasNext();
lbl48:


            if (!v2) break;
            var11_9 = (String)var10_7.next();
            try {
                try {
                    v8 = var11_9.equalsIgnoreCase((String)ea.a("k", (int)20393, (long)(8432674548159836788L ^ var3_2)));
                    if (!var8_8 || v8) continue;
                }
                catch (H v9) {
                    throw ea.a(v9);
                }
                v8 = ea.d.add(new RX(var11_9));
            }
            catch (H v10) {
                throw ea.a(v10);
            }
        } while (var8_8);
    }







    public void b(int var1_1, int var2_2, int var3_3, short var4_4, short var5_5) {
        block55: {
            block53: {
                block54: {
                    block51: {
                        block52: {
                            block50: {
                                block48: {
                                    block49: {
                                        block47: {
                                            block43: {
                                                block46: {
                                                    block45: {
                                                        block44: {
                                                            block41: {
                                                                block42: {
                                                                    v0 = var6_6 = ((long)var3_3 << 32 | (long)var4_4 << 48 >>> 32 | (long)var5_5 << 48 >>> 48) ^ ea.f;
                                                                    v1 = v0 ^ 130000947945245L;
                                                                    var8_7 = (int)(v1 >>> 48);
                                                                    var9_8 = (int)(v1 << 16 >>> 48);
                                                                    var10_9 = (int)(v1 << 32 >>> 32);
                                                                    v2 = v0 ^ 109769337810480L;
                                                                    var11_10 = (int)(v2 >>> 32);
                                                                    var12_11 = (int)(v2 << 32 >>> 48);
                                                                    var13_12 = (int)(v2 << 48 >>> 48);
                                                                    v3 = v0 ^ 71718567042501L;
                                                                    var14_13 = v3 >>> 16;
                                                                    var16_14 = (int)(v3 << 48 >>> 48);
                                                                    var18_15 = 11.0f;
                                                                    var17_16 = RO.b();
                                                                    try {
                                                                        v4 = this.e;
                                                                        if (var17_16 == 0) break block41;
                                                                        if (v4 == 0) break block42;
                                                                    }
                                                                    catch (H v5) {
                                                                        throw ea.a(v5);
                                                                    }
                                                                    block32: for (RX var20_19 : ea.d) {
                                                                        var18_15 += var20_19.a();
                                                                        try {
                                                                            do {
                                                                                v6 = var17_16;
                                                                                if (var3_3 >= 0) {
                                                                                    if (v6 == 0) break block43;
                                                                                    v6 = var17_16;
                                                                                }
                                                                                if (v6 != 0) continue block32;
                                                                            } while (var5_5 > 0);
                                                                            break;
                                                                        }
                                                                        catch (H v7) {
                                                                            throw ea.a(v7);
                                                                        }
                                                                    }
                                                                }
                                                                v4 = (cfr_temp_0 = (float)var1_1 - this.a) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                            }
                                                            try {
                                                                try {
                                                                    v8 = var17_16;
                                                                    if (var5_5 < 0) {
                                                                        if (v8 == 0) break block44;
                                                                        if (v4 < 0) break block43;
                                                                    }
                                                                    ** GOTO lbl61
                                                                }
                                                                catch (H v9) {
                                                                    throw ea.a(v9);
                                                                }
                                                                cfr_temp_1 = (float)var1_1 - (this.a + 66.0f);
                                                                v4 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                            }
                                                            catch (H v10) {
                                                                throw ea.a(v10);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v8 = var17_16;
lbl61:


                                                                if (var4_4 >= 0) {
                                                                    if (v8 == 0) break block45;
                                                                    if (v4 > 0) break block43;
                                                                }
                                                                ** GOTO lbl77
                                                            }
                                                            catch (H v11) {
                                                                throw ea.a(v11);
                                                            }
                                                            cfr_temp_2 = (float)var2_2 - this.c;
                                                            v4 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                        }
                                                        catch (H v12) {
                                                            throw ea.a(v12);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            v8 = var17_16;
lbl77:


                                                            if (var3_3 >= 0) {
                                                                if (v8 == 0) break block46;
                                                                if (v4 < 0) break block43;
                                                            }
                                                            ** GOTO lbl92
                                                        }
                                                        catch (H v13) {
                                                            throw ea.a(v13);
                                                        }
                                                        cfr_temp_3 = (float)var2_2 - (this.c + var18_15);
                                                        v4 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                                    }
                                                    catch (H v14) {
                                                        throw ea.a(v14);
                                                    }
                                                }
                                                try {
                                                    v8 = var17_16;
lbl92:


                                                    if (v8 == 0) break block47;
                                                    if (v4 > 0) break block43;
                                                }
                                                catch (H v15) {
                                                    throw ea.a(v15);
                                                }
                                                v4 = 1;
                                                break block47;
                                            }
                                            v4 = 0;
                                        }
                                        var19_18 = v4;
                                        var20_19 = (mr)tf.m().a(mr.class);
                                        var21_20 = var20_19.n();
                                        var22_21 = var20_19.a();
                                        try {
                                            try {
                                                v16 = var21_20;
                                                v17 = var17_16;
                                                if (var4_4 > 0) {
                                                    if (v17 == 0) break block48;
                                                    v17 = var22_21;
                                                }
                                                if (v16 == v17) break block49;
                                            }
                                            catch (H v18) {
                                                throw ea.a(v18);
                                            }
                                            v16 = 1;
                                            break block48;
                                        }
                                        catch (H v19) {
                                            throw ea.a(v19);
                                        }
                                    }
                                    v16 = 0;
                                }
                                var23_22 = v16;
                                var24_23 = -603979776 | var21_20 & 0xFFFFFF;
                                try {
                                    v20 = this;
                                    v21 = var19_18 != 0 ? 1.0 : 0.0;
                                }
                                catch (H v22) {
                                    throw ea.a(v22);
                                }
                                v20.b = Lf.a((double)v21, (double)this.b, (double)0.2, (double)RO.c);
                                var25_24 = r_.a((int)(-603979776 | r_.b((int)var21_20, (float)0.85f) & 0xFFFFFF), (int)(-268435456 | var21_20 & 0xFFFFFF), (double)this.b);
                                var26_25 = r_.a((int)r_.a((int)220, (int)210), (int)r_.a((int)255, (int)210), (double)this.b);
                                try {
                                    v23 = var23_22;
                                    if (var17_16 == 0) break block50;
                                    if (v23 == 0) {
                                    }
                                    ** GOTO lbl147
                                }
                                catch (H v24) {
                                    throw ea.a(v24);
                                }
                                var27_26 = r_.a((int)r_.b((int)var24_23, (float)0.5f), (int)r_.b((int)var24_23, (float)0.4f), (double)this.b);
                                try {
                                    v25 = var17_16;
                                    if (var4_4 <= 0) break block51;
                                    if (v25 != 0) break block52;
lbl147:


                                    v23 = r_.a((int)(-603979776 | r_.b((int)var22_21, (float)0.85f) & 0xFFFFFF), (int)(-268435456 | var22_21 & 0xFFFFFF), (double)this.b);
                                }
                                catch (H v26) {
                                    throw ea.a(v26);
                                }
                            }
                            var27_26 = v23;
                        }
                        Od.a((char)((char)var8_7), (float)this.a, (float)this.c, (float)(this.a + 66.0f), (char)((char)var9_8), (float)(this.c + 11.0f), (int)var25_24, (int)var27_26, (int)var10_9);
                        v25 = 11133;
                        Od.a((double)this.a, (double)this.c, (double)(this.a + 66.0f), (double)(this.c + 11.0f), (double)0.5, (int)0, (int)r_.a((int)0, (int)80));
                    }
                    var28_27 = gh.e.a(13.0f);
                    var29_28 = ea.a("k", (int)v25, (long)(497258592491287534L ^ var6_6));
                    try {
                        try {
                            Od.b((String)var29_28, (float)(this.a + (float)(66 - var28_27.a(var11_10, (short)var12_11, (short)var13_12, (String)var29_28)) / 2.0f), (float)(this.c + 5.5f - (float)var28_27.c() / 2.0f + 0.5f), (int)var26_25, (Di)var28_27);
                            v27 = this;
                            v28 = var17_16;
                            if (var5_5 > 0) break block53;
                            if (v28 == 0) break block54;
                            if (!v27.e) break block55;
                        }
                        catch (H v29) {
                            throw ea.a(v29);
                        }
                        v27 = this;
                    }
                    catch (H v30) {
                        throw ea.a(v30);
                    }
                }
                v28 = var1_1;
            }
            v27.a(v28, var14_13, var2_2, (short)var16_14);
        }
    }

    public void b(float f) {
        this.a = f;
    }

    public void a(float f) {
        this.c = f;
    }

    private void a(int n, long l, int n2, short s) {
        long l2 = (l << 16 | (long)s << 48 >>> 48) ^ f;
        long l3 = l2 ^ 0x7BA0FF11B0E2L;
        long l4 = l3 >>> 8;
        int n3 = (int)(l3 << 56 >>> 56);
        float f = 11.0f;
        boolean bl = RO.b();
        for (RX rX : d) {
            rX.a(l4, this.a, this.c + f, 66, n, n2, (byte)n3);
            f += rX.a();
            if (bl) continue;
        }
    }

    public void b(int n, int n2, int n3) {
        block11: {
            ea ea2;
            long l;
            int n4;
            block10: {
                boolean bl;
                block8: {
                    boolean bl2;
                    block9: {
                        long l2 = f ^ 0x2C94BC8704DAL;
                        long l3 = l2 ^ 0x7E3E38A635EDL;
                        n4 = (int)(l3 >>> 32);
                        l = l3 << 32 >>> 32;
                        bl2 = RO.c();
                        try {
                            try {
                                bl = this.c(n, n2);
                                if (bl2) break block8;
                                if (!bl) break block9;
                            }
                            catch (H h) {
                                throw ea.a(h);
                            }
                            this.a(n3);
                            return;
                        }
                        catch (H h) {
                            throw ea.a(h);
                        }
                    }
                    try {
                        ea2 = this;
                        if (bl2) break block10;
                        bl = ea2.e;
                    }
                    catch (H h) {
                        throw ea.a(h);
                    }
                }
                if (!bl) break block11;
                ea2 = this;
            }
            ea2.a(n, n2, n3, n4, l);
        }
    }

    private boolean c(int n, int n2) {
        float f;
        block18: {
            block15: {
                boolean bl;
                block17: {
                    block16: {
                        block14: {
                            bl = RO.b();
                            try {
                                try {
                                    float f2 = (float)n - this.a;
                                    f = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                    if (!bl) break block14;
                                    if (f < 0) break block15;
                                }
                                catch (H h) {
                                    throw ea.a(h);
                                }
                                float f3 = (float)n - (this.a + 66.0f);
                                f = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                            }
                            catch (H h) {
                                throw ea.a(h);
                            }
                        }
                        try {
                            try {
                                if (!bl) break block16;
                                if (f > 0) break block15;
                            }
                            catch (H h) {
                                throw ea.a(h);
                            }
                            float f4 = (float)n2 - this.c;
                            f = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                        }
                        catch (H h) {
                            throw ea.a(h);
                        }
                    }
                    try {
                        try {
                            if (!bl) break block17;
                            if (f < 0) break block15;
                        }
                        catch (H h) {
                            throw ea.a(h);
                        }
                        float f5 = (float)n2 - (this.c + 11.0f);
                        f = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                    }
                    catch (H h) {
                        throw ea.a(h);
                    }
                }
                try {
                    if (!bl) break block18;
                    if (f > 0) break block15;
                }
                catch (H h) {
                    throw ea.a(h);
                }
                f = 1.0f;
                break block18;
            }
            f = 0.0f;
        }
        return (boolean)f;
    }

    private void a(int n) {
        long l = f ^ 0x4DDB9E9E036L;
        long l2 = l ^ 0x3116A5544DEL;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        try {
            if (n == 1) {
                this.b((short)n2, n3, (short)n4);
            }
        }
        catch (H h) {
            throw ea.a(h);
        }
    }

    private void b(short s, int n, short s2) {
        block8: {
            boolean bl;
            long l;
            int n2;
            block6: {
                block7: {
                    long l2 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ f;
                    long l3 = l2 ^ 0x162790F4BC16L;
                    n2 = (int)(l3 >>> 32);
                    l = l3 << 32 >>> 32;
                    boolean bl2 = RO.b();
                    try {
                        ea ea2 = this;
                        bl = this.e;
                        if (!bl2) break block6;
                        if (bl) break block7;
                    }
                    catch (H h) {
                        throw ea.a(h);
                    }
                    bl = true;
                    break block6;
                }
                bl = false;
            }
            try {
                ea2.e = bl;
                int n3 = this.e;
                if (s >= 0) {
                    if (n3 == 0) break block8;
                    n3 = n2;
                }
                ea.a(n3, l);
            }
            catch (H h) {
                throw ea.a(h);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, long l) {
        long l2 = ((long)n4 << 32 | l << 32 >>> 32) ^ f;
        long l3 = l2 ^ 0x66AA6302DD48L;
        int n5 = (int)(l3 >>> 48);
        int n6 = (int)(l3 << 16 >>> 48);
        int n7 = (int)(l3 << 32 >>> 32);
        float f = 11.0f;
        ArrayList<RX> arrayList = new ArrayList<RX>(d);
        boolean bl = RO.c();
        for (RX rX : arrayList) {
            boolean bl2;
            block5: {
                block6: {
                    block7: {
                        try {
                            try {
                                bl2 = bl;
                                if (l <= 0L) break block5;
                                if (bl2) break block6;
                                if (!rX.a(this.a + 2.0f, (short)n5, (short)n6, this.c + f, 62, n, n2, n3, n7)) break block7;
                            }
                            catch (H h) {
                                throw ea.a(h);
                            }
                            if (!bl) break;
                        }
                        catch (H h) {
                            throw ea.a(h);
                        }
                    }
                    f += rX.a();
                }
                bl2 = bl;
            }
            if (!bl2) continue;
        }
    }




    static {
        f = _c.a((long)-6156344565714964349L, (long)5449270238781511308L, MethodHandles.lookup().lookupClass()).a(98819030357314L);
        i = new HashMap(13);
        long l = f ^ 0xF988AA47580L;
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
        String string = "a\u009arG\u00da\u00dbJ\u001e\u008c\u00f1x{\u009d\u00d2\u00f2i2\u00ff*\u00f5\u00f3\u001d\u00aa\u00ac|\u00e8\u00a7\u00a3/\u00d3\u00a3]V\u00c8\u0019R\u00ffPX\u00a3\u0010\u00c6\u0016d\u00e0\u00f8\b\u00da\u00be\u00c0\u0002Y\u00bb\u00c6\u00a4CS\u0010Q\u009d\u00ec\u00ddH\u0096\u00f1\u00c8h(E\u00e3Q\u001fE\u00b2";
        int n2 = "a\u009arG\u00da\u00dbJ\u001e\u008c\u00f1x{\u009d\u00d2\u00f2i2\u00ff*\u00f5\u00f3\u001d\u00aa\u00ac|\u00e8\u00a7\u00a3/\u00d3\u00a3]V\u00c8\u0019R\u00ffPX\u00a3\u0010\u00c6\u0016d\u00e0\u00f8\b\u00da\u00be\u00c0\u0002Y\u00bb\u00c6\u00a4CS\u0010Q\u009d\u00ec\u00ddH\u0096\u00f1\u00c8h(E\u00e3Q\u001fE\u00b2".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ea.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                h = new String[3];
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D17;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ea", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            ea.h[n2] = ea.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ea.b(n, l);
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
            throw new RuntimeException("ea" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ea.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
