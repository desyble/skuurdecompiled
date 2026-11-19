import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class pJ
extends op {
    public static float w;
    private double A;
    private boolean y;
    private boolean x;
    private final List<Sj> B;
    private final ea z;
    private static final long C;

    public pJ() {
        block4: {
            long l = C ^ 0x63476C95D5AFL;
            long l2 = l ^ 0x7343A00D4C9DL;
            int n = (int)(l2 >>> 48);
            int n2 = (int)(l2 << 16 >>> 48);
            int n3 = (int)(l2 << 32 >>> 32);
            boolean bl = RO.b();
            this.A = 0.0;
            this.y = false;
            this.B = new ArrayList<Sj>();
            boolean bl2 = bl;
            for (ta ta2 : ta.a()) {
                try {
                    this.B.add(new Sj(ta2, 0.0f, 0.0f));
                    if (bl2) {
                        if (bl2) continue;
                        break;
                    }
                    break block4;
                }
                catch (H h) {
                    throw pJ.a(h);
                }
            }
            this.z = new ea(0.0f, (short)n, (char)n2, n3, 0.0f);
        }
    }

    public void o(int n, char c, char c2) {
        long l;
        long l2 = l = (long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48;
        long l3 = l2 ^ 0L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 48);
        int n4 = (int)(l3 << 48 >>> 48);
        long l4 = l2 ^ 0x2674AE90F933L;
        int n5 = (int)(l4 >>> 32);
        int n6 = (int)(l4 << 32 >>> 48);
        int n7 = (int)(l4 << 48 >>> 48);
        this.a(true, n5, (short)n6, (char)n7);
        super.o(n2, (char)n3, (char)n4);
    }

    public void a() {
        boolean bl;
        pJ pJ2;
        int n;
        int n2;
        int n3;
        block2: {
            block3: {
                long l = C ^ 0x692273CC046AL;
                long l2 = l ^ 0x5471BA115C99L;
                n3 = (int)(l2 >>> 32);
                n2 = (int)(l2 << 32 >>> 48);
                n = (int)(l2 << 48 >>> 48);
                boolean bl2 = RO.c();
                try {
                    pJ2 = this;
                    bl = this.y;
                    if (bl2) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw pJ.a(h);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        pJ2.a(bl, n3, (short)n2, (char)n);
    }





    public void a(boolean var1_1, int var2_2, short var3_3, char var4_4) {
        block12: {
            block10: {
                block11: {
                    var5_5 = ((long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ pJ.C;
                    v0 = var5_5 ^ 49171110641677L;
                    var7_6 = (int)(v0 >>> 32);
                    var8_7 = v0 << 32 >>> 32;
                    this.y = var1_1;
                    var10_8 = RO.b();
                    try {
                        try {
                            try {
                                v1 = var1_1;
                                if (!var10_8) break block10;
                                if (v1 != 0) {
                                }
                                ** GOTO lbl42
                            }
                            catch (H v2) {
                                throw pJ.a(v2);
                            }
                            ea.a((int)var7_6, (long)var8_7);
                            this.x = Keyboard.areRepeatEventsEnabled();
                            cfr_temp_0 = pJ.w - 0.01f;
                            v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            if (var4_4 > '\u0000') {
                                if (!var10_8) break block11;
                            }
                            ** GOTO lbl40
                        }
                        catch (H v3) {
                            throw pJ.a(v3);
                        }
                        if (v1 >= 0) break block12;
                    }
                    catch (H v4) {
                        throw pJ.a(v4);
                    }
                    v5 = true;
                }
                try {
                    Keyboard.enableRepeatEvents((boolean)v5);
                    this.A = 0.0;
                    pJ.w = 0.0f;
                    v1 = (int)var10_8;
lbl40:


                    if (var3_3 >= 0) break block10;
                    if (v1 != 0) break block12;
lbl42:


                    v1 = this.x;
                }
                catch (H v6) {
                    throw pJ.a(v6);
                }
            }
            Keyboard.enableRepeatEvents((boolean)v1);
        }
    }

    public boolean c() {
        return this.y;
    }




    public void a(int var1_1, char var2_2, int var3_3, long var4_4, K8 var6_5) {
























        throw new IllegalStateException("Decompilation failed");
    }




    protected void a(char var1_1, char var2_2, char var3_3, int var4_4, int var5_5) {
























        throw new IllegalStateException("Decompilation failed");
    }

    protected void a(int n, long l, int n2, int n3, char c) {
        block10: {
            boolean bl = RO.b();
            try {
                if (w < 0.1f) {
                    return;
                }
            }
            catch (H h) {
                throw pJ.a(h);
            }
            K8 k8 = new K8(Hk.b());
            double d = 2.0 / (double)k8.d();
            block4: for (Sj sj : this.B) {
                try {
                    sj.c((int)((double)n / d), (int)((double)n2 / d), n3);
                    do {
                        boolean bl2 = bl;
                        if (c > '\u0000') {
                            if (!bl2) break block10;
                            bl2 = bl;
                        }
                        if (bl2) continue block4;
                    } while (c <= '\u0000');
                    break;
                }
                catch (H h) {
                    throw pJ.a(h);
                }
            }
            this.z.b((int)((double)n / d), (int)((double)n2 / d), n3);
        }
    }

    protected void b(int n, long l, int n2, int n3, int n4) {
        boolean bl = RO.b();
        try {
            if (w < 0.1f) {
                return;
            }
        }
        catch (H h) {
            throw pJ.a(h);
        }
        K8 k8 = new K8(Hk.b());
        double d = 2.0 / (double)k8.d();
        for (Sj sj : this.B) {
            sj.b((int)((double)n2 / d), (int)((double)n3 / d), n4);
            if (bl) continue;
        }
    }




    public void i(short var1_1, char var2_2, int var3_3) {
        block9: {
            block8: {
                v0 = var4_4 = (long)var1_1 << 48 | (long)var2_2 << 48 >>> 16 | (long)var3_3 << 32 >>> 32;
                v1 = v0 ^ 0L;
                var6_5 = (int)(v1 >>> 48);
                var7_6 = (int)(v1 << 16 >>> 48);
                var8_7 = (int)(v1 << 32 >>> 32);
                v2 = v0 ^ 29244432302857L;
                var9_8 = (int)(v2 >>> 48);
                var10_9 = v2 << 16 >>> 16;
                var12_10 = RO.b();
                try {
                    try {
                        if (!var12_10) break block8;
                        if (Hk.e() == this) {
                        }
                        ** GOTO lbl28
                    }
                    catch (H v3) {
                        throw pJ.a(v3);
                    }
                    super.i((short)var6_5, (char)var7_6, var8_7);
                }
                catch (H v4) {
                    throw pJ.a(v4);
                }
            }
            try {
                if (var3_3 >= 0 || var12_10) break block9;
lbl28:


                this.b((char)var9_8, var10_9);
            }
            catch (H v5) {
                throw pJ.a(v5);
            }
        }
    }




    public void b(char var1_1, long var2_2) {
        block43: {
            block48: {
                block49: {
                    block47: {
                        block44: {
                            block46: {
                                block45: {
                                    block39: {
                                        block42: {
                                            block41: {
                                                block40: {
                                                    v0 = var4_3 = ((long)var1_1 << 48 | var2_2 << 16 >>> 16) ^ pJ.C;
                                                    var6_4 = v0 ^ 90123422829390L;
                                                    v1 = v0 ^ 140711831739354L;
                                                    var8_5 = (int)(v1 >>> 32);
                                                    var9_6 = v1 << 32 >>> 32;
                                                    v2 = v0 ^ 77579356011770L;
                                                    var11_7 = v2 >>> 16;
                                                    var13_8 = (int)(v2 << 48 >>> 48);
                                                    var15_9 = Hk.e();
                                                    var14_10 = RO.c();
                                                    try {
                                                        if (var15_9 == null) {
                                                            return;
                                                        }
                                                    }
                                                    catch (H v3) {
                                                        throw pJ.a(v3);
                                                    }
                                                    var16_11 = Mouse.getEventX() * var15_9.l / Hk.b().q;
                                                    var17_12 = var15_9.r - Mouse.getEventY() * var15_9.r / Hk.b().z - 1;
                                                    var18_13 = Mouse.getEventButton();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v4 = Mouse.getEventButtonState();
                                                                        v5 = var14_10;
                                                                        if (var2_2 <= 0L) ** GOTO lbl80
                                                                        if (v5 != 0) break block39;
                                                                        if (v4 != 0) {
                                                                        }
                                                                        ** GOTO lbl70
                                                                    }
                                                                    catch (H v6) {
                                                                        throw pJ.a(v6);
                                                                    }
                                                                    v7 = Hk.i().e;
                                                                    if (var14_10 != 0) break block40;
                                                                }
                                                                catch (H v8) {
                                                                    throw pJ.a(v8);
                                                                }
                                                                if (v7 == 0) break block41;
                                                            }
                                                            catch (H v9) {
                                                                throw pJ.a(v9);
                                                            }
                                                            v10 = var15_9;
                                                            if (var1_1 < '\u0000' || var14_10 != 0) break block42;
                                                        }
                                                        catch (H v11) {
                                                            throw pJ.a(v11);
                                                        }
                                                        v12 = v10.j;
                                                        v7 = v12;
                                                        v10.j = v12 + 1;
                                                    }
                                                    catch (H v13) {
                                                        throw pJ.a(v13);
                                                    }
                                                }
                                                if (v7 > 0) {
                                                    return;
                                                }
                                            }
                                            this.f = var18_13;
                                            v10 = var15_9;
                                        }
                                        try {
                                            v10.g = cD.A();
                                            this.a(var16_11, var11_7, var17_12, this.f, (char)var13_8);
                                            v4 = var14_10;
                                            if (var1_1 < '\u0000') break block39;
                                            if (v4 == 0) break block43;
lbl70:


                                            v4 = var18_13;
                                        }
                                        catch (H v14) {
                                            throw pJ.a(v14);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v5 = -1;
lbl80:


                                                    if (var1_1 < '\u0000' || var14_10 != 0) break block44;
                                                    if (v4 != v5) {
                                                    }
                                                    ** GOTO lbl113
                                                }
                                                catch (H v15) {
                                                    throw pJ.a(v15);
                                                }
                                                v16 = Hk.i().e;
                                                if (var14_10 != 0) break block45;
                                            }
                                            catch (H v17) {
                                                throw pJ.a(v17);
                                            }
                                            if (var2_2 > 0L) {
                                                if (v16 == 0) break block46;
                                            }
                                            ** GOTO lbl110
                                        }
                                        catch (H v18) {
                                            throw pJ.a(v18);
                                        }
                                        v16 = var15_9.j = var15_9.j - 1;
                                    }
                                    catch (H v19) {
                                        throw pJ.a(v19);
                                    }
                                }
                                if (v16 > 0) {
                                    return;
                                }
                            }
                            try {
                                try {
                                    block50: {
                                        this.f = -1;
                                        this.b(var8_5, var9_6, var16_11, var17_12, var18_13);
                                        v4 = var14_10;
lbl110:


                                        if (var1_1 >= '\u0000') {
                                            if (v4 == 0) break block43;
                                        }
                                        break block50;
lbl113:


                                        v4 = this.f;
                                    }
                                    if (var1_1 < '\u0000' || var14_10 != 0) break block47;
                                }
                                catch (H v20) {
                                    throw pJ.a(v20);
                                }
                                v5 = -1;
                            }
                            catch (H v21) {
                                throw pJ.a(v21);
                            }
                        }
                        try {
                            try {
                                if (v4 == v5) break block43;
                                v22 = var15_9.g;
                                if (var2_2 < 0L) break block48;
                                v23 = 0L;
                                if (var14_10 != 0) break block49;
                            }
                            catch (H v24) {
                                throw pJ.a(v24);
                            }
                            cfr_temp_0 = v22 - v23;
                            v4 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        }
                        catch (H v25) {
                            throw pJ.a(v25);
                        }
                    }
                    try {
                        if (v4 <= 0) break block43;
                        v26 = cD.A();
                        v23 = var15_9.g;
                    }
                    catch (H v27) {
                        throw pJ.a(v27);
                    }
                }
                v22 = v26 - v23;
            }
            var19_14 = v22;
            this.a(var6_4, var16_11, var17_12, this.f, var19_14);
        }
    }

    public void j(long l, byte by) {
        block14: {
            int n;
            long l2;
            block15: {
                char c;
                pJ pJ2;
                int n2;
                int n3;
                int n4;
                int n5;
                block18: {
                    char c2;
                    block19: {
                        block17: {
                            boolean bl;
                            block22: {
                                block20: {
                                    int n6;
                                    boolean bl2;
                                    long l3;
                                    int n7;
                                    long l4;
                                    int n8;
                                    block16: {
                                        long l5;
                                        long l6 = l5 = l << 8 | (long)by << 56 >>> 56;
                                        long l7 = l6 ^ 0x35A81F307027L;
                                        n8 = (int)(l7 >>> 48);
                                        l4 = l7 << 16 >>> 16;
                                        long l8 = l6 ^ 0x7879ABCF18D0L;
                                        n5 = (int)(l8 >>> 48);
                                        n4 = (int)(l8 << 16 >>> 48);
                                        n3 = (int)(l8 << 32 >>> 32);
                                        long l9 = l6 ^ 0x1BC8BA5BBC12L;
                                        l2 = l9 >>> 32;
                                        n = (int)(l9 << 32 >>> 32);
                                        long l10 = l6 ^ 0x11EB66FA1A74L;
                                        n7 = (int)(l10 >>> 32);
                                        l3 = l10 << 32 >>> 32;
                                        bl2 = RO.b();
                                        try {
                                            if (!bl2) break block14;
                                            if (!Keyboard.getEventKeyState()) break block15;
                                        }
                                        catch (H h) {
                                            throw pJ.a(h);
                                        }
                                        c2 = Keyboard.getEventCharacter();
                                        n2 = Keyboard.getEventKey();
                                        try {
                                            try {
                                                try {
                                                    n6 = n2;
                                                    if (l <= 0L || !bl2) break block16;
                                                    if (n6 != 1) break block17;
                                                }
                                                catch (H h) {
                                                    throw pJ.a(h);
                                                }
                                                pJ2 = this;
                                                c = (char)(bl2 ? 1 : 0);
                                                if (by > 0) break block18;
                                                if (c == '\u0000') break block19;
                                            }
                                            catch (H h) {
                                                throw pJ.a(h);
                                            }
                                            n6 = pJ2.c() ? 1 : 0;
                                        }
                                        catch (H h) {
                                            throw pJ.a(h);
                                        }
                                    }
                                    try {
                                        block21: {
                                            try {
                                                try {
                                                    if (n6 == 0) break block17;
                                                    if (by > 0) break block20;
                                                    if (Hk.e() != this) break block21;
                                                }
                                                catch (H h) {
                                                    throw pJ.a(h);
                                                }
                                                Hk.b().a(null, n7, l3);
                                                bl = bl2;
                                                if (by >= 0) break block22;
                                                if (bl) break block20;
                                            }
                                            catch (H h) {
                                                throw pJ.a(h);
                                            }
                                        }
                                        this.c((char)n8, l4);
                                    }
                                    catch (H h) {
                                        throw pJ.a(h);
                                    }
                                }
                                bl = false;
                            }
                            Keyboard.enableRepeatEvents((boolean)bl);
                            return;
                        }
                        pJ2 = this;
                    }
                    c = c2;
                }
                pJ2.a(c, (char)n5, (char)n4, n2, n3);
            }
            Hk.b().af(l2, n);
        }
    }

    public void c(char c, long l) {
        long l2;
        long l3 = l2 = (long)c << 48 | l << 16 >>> 16;
        long l4 = l3 ^ 0x2BEC053C202DL;
        int n = (int)(l4 >>> 32);
        int n2 = (int)(l4 << 32 >>> 48);
        int n3 = (int)(l4 << 48 >>> 48);
        long l5 = l3 ^ 0L;
        int n4 = (int)(l5 >>> 48);
        long l6 = l5 << 16 >>> 16;
        w = 1.0f;
        tu.a().b();
        this.a(false, n, (short)n2, (char)n3);
        super.c((char)n4, l6);
    }

    public boolean k() {
        return false;
    }

    static {
        C = _c.a((long)-2715394756925825651L, (long)-1160873071503440876L, MethodHandles.lookup().lookupClass()).a(160667116989645L);
        w = 0.0f;
    }

    private static H a(H h) {
        return h;
    }
}
