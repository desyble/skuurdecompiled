import imgui.ImGui;
import imgui.type.ImBoolean;
import imgui.type.ImFloat;
import imgui.type.ImString;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.input.Keyboard;




public class pj
extends op {
    private static pj B;
    private final ImBoolean w;
    private boolean z;
    private final Pd A;
    private int x;
    private int y;
    private static final long C;
    private static final String[] D;
    private static final String[] E;
    private static final Map F;

    public pj() {
        int n = FP.i();
        this.w = new ImBoolean(true);
        int n2 = n;
        try {
            this.z = true;
            this.A = new Pd();
            this.x = 0;
            this.y = 0;
            if (n2 != 0) {
                LQ.b((LQ[])new LQ[2]);
            }
        }
        catch (H h) {
            throw pj.a(h);
        }
    }

    public void b() {
        long l = C ^ 0x743BE92880F9L;
        long l2 = l ^ 0x4F24CB27D207L;
        int n = (int)(l2 >>> 32);
        long l3 = l2 << 32 >>> 32;
        cD.C().a((op)pj.e(), n, l3);
        this.w.set(true);
        this.A.e();
    }

    public static void a() {
        B = new pj();
    }

    public static pj e() {
        return B;
    }

    public void a(short s, int n, int n2, long l, float f) {
        hV.d().b(this::k);
    }

    protected void a(char c, char c2, char c3, int n, int n2) {
        int n3;
        block23: {
            pj pj2;
            long l;
            int n4;
            block24: {
                int n5;
                block21: {
                    long l2;
                    long l3 = l2 = (long)c2 << 48 | (long)c3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
                    long l4 = l3 ^ 0L;
                    int n6 = (int)(l4 >>> 48);
                    int n7 = (int)(l4 << 16 >>> 48);
                    int n8 = (int)(l4 << 32 >>> 32);
                    long l5 = l3 ^ 0x6992CD3502A4L;
                    n4 = (int)(l5 >>> 32);
                    l = l5 << 32 >>> 32;
                    int n9 = FP.i();
                    super.a(c, (char)n6, (char)n7, n, n8);
                    n3 = n9;
                    try {
                        try {
                            block22: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n5 = n;
                                                    if (n3 != 0) break block21;
                                                    if (n5 == 54) break block22;
                                                }
                                                catch (H h) {
                                                    throw pj.a(h);
                                                }
                                                n5 = n;
                                                if (n3 != 0) break block21;
                                            }
                                            catch (H h) {
                                                throw pj.a(h);
                                            }
                                            if (n5 == 210) break block22;
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                        n5 = n;
                                        if (n3 != 0) break block21;
                                    }
                                    catch (H h) {
                                        throw pj.a(h);
                                    }
                                    if (n5 != 211) break block23;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                            }
                            pj2 = this;
                            if (n3 != 0) break block24;
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                        n5 = pj2.A.a(50L) ? 1 : 0;
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                }
                if (n5 == 0) break block23;
                pj2 = this;
            }
            pj2.i.a(null, n4, l);
        }
        try {
            if (n2 >= 0 && LQ.J() != null) {
                FP.b((int)(++n3));
            }
        }
        catch (H h) {
            throw pj.a(h);
        }
    }

    public void c(char c, long l) {
        block6: {
            int n;
            block4: {
                block5: {
                    int n2 = FP.b();
                    Keyboard.enableRepeatEvents((boolean)false);
                    int n3 = n2;
                    try {
                        pj pj2;
                        try {
                            pj2 = this;
                            n = n3;
                            if (c < '\u0000') break block4;
                            if (n == 0) break block5;
                            if (!pj2.z) break block6;
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                        pj2 = this;
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                }
                n = 0;
            }
            pj2.z = n;
        }
    }

    private void k() {
        block28: {
            pj pj2;
            long l;
            int n;
            block27: {
                boolean bl;
                block21: {
                    int n2;
                    block22: {
                        boolean bl2;
                        int n3;
                        int n4;
                        int n5;
                        block23: {
                            long l2;
                            block24: {
                                long l3 = l2 = C ^ 0x5ACCD21453E7L;
                                long l4 = l3 ^ 0x347F86B59850L;
                                n5 = (int)(l4 >>> 32);
                                n4 = (int)(l4 << 32 >>> 48);
                                n3 = (int)(l4 << 48 >>> 48);
                                long l5 = l3 ^ 0x798A3962EAD6L;
                                int n6 = (int)(l5 >>> 48);
                                int n7 = (int)(l5 << 16 >>> 32);
                                int n8 = (int)(l5 << 48 >>> 48);
                                long l6 = l3 ^ 0x61D3F01B0119L;
                                n = (int)(l6 >>> 32);
                                l = l6 << 32 >>> 32;
                                int n9 = FP.b();
                                this.l((char)n6, n7, (short)n8);
                                ImGui.setNextWindowSize((float)850.0f, (float)600.0f, (int)4);
                                n2 = n9;
                                try {
                                    try {
                                        try {
                                            try {
                                                ImGui.setNextWindowPos((float)100.0f, (float)100.0f, (int)4);
                                                bl = ImGui.begin("Desyble", (ImBoolean)this.w, (int)32);
                                                if (n2 == 0) break block21;
                                                if (!bl) break block22;
                                            }
                                            catch (H h) {
                                                throw pj.a(h);
                                            }
                                            bl2 = this.z;
                                            if (n2 == 0) break block23;
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                        if (!bl2) break block24;
                                    }
                                    catch (H h) {
                                        throw pj.a(h);
                                    }
                                    ImGui.textDisabled((String)((Object)pj.b("c", (int)28522, (long)(0x2B5162DFD1F032B9L ^ l2))));
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                            }
                            bl2 = ImGui.beginTabBar((String)((Object)pj.b("c", (int)15935, (long)(0x6997DBC39C4EE3E3L ^ l2))));
                        }
                        if (bl2) {
                            ta[] taArray;
                            ta[] taArray2 = taArray = ta.a();
                            int n10 = taArray2.length;
                            int n11 = 0;
                            while (n11 < n10) {
                                block25: {
                                    block26: {
                                        ta ta2 = taArray2[n11];
                                        String string = ta2.b();
                                        try {
                                            try {
                                                try {
                                                    if (n2 == 0) break block25;
                                                    bl = ImGui.beginTabItem((String)string);
                                                    if (n2 == 0) break block21;
                                                }
                                                catch (H h) {
                                                    throw pj.a(h);
                                                }
                                                if (!bl) break block26;
                                            }
                                            catch (H h) {
                                                throw pj.a(h);
                                            }
                                            this.a(n5, ta2, (char)n4, (char)n3);
                                            ImGui.endTabItem();
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                    }
                                    ++n11;
                                }
                                if (n2 != 0) continue;
                            }
                            ImGui.endTabBar();
                        }
                        ImGui.end();
                    }
                    try {
                        this.q();
                        pj2 = this;
                        if (n2 == 0) break block27;
                        bl = pj2.w.get();
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                }
                if (bl) break block28;
                pj2 = this;
            }
            pj2.i.a(null, n, l);
        }
    }





    private void a(int var1_1, ta var2_2, char var3_3, char var4_4) {
        block84: {
            block80: {
                var5_5 = ((long)var1_1 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ pj.C;
                v0 = var5_5 ^ 61119788611120L;
                var7_6 = (int)(v0 >>> 32);
                var8_7 = (int)(v0 << 32 >>> 48);
                var9_8 = (int)(v0 << 48 >>> 48);
                var11_9 = tf.m().a();
                var10_10 = FP.i();
                var12_11 = new ArrayList<lh>();
                var13_12 = var11_9;
                var14_13 = var13_12.length;
                var15_15 = 0;
                while (var15_15 < var14_13) {
                    block81: {
                        block82: {
                            block83: {
                                var16_17 = var13_12[var15_15];
                                try {
                                    try {
                                        try {
                                            v1 = var10_10;
                                            if (var3_3 >= '\u0000') {
                                                if (v1 != 0) break block80;
                                                v1 = var10_10;
                                            }
                                            if (var1_1 < 0) break block81;
                                            if (v1 != 0) break block82;
                                        }
                                        catch (H v2) {
                                            throw pj.a(v2);
                                        }
                                        if (var16_17.e() != var2_2) break block83;
                                    }
                                    catch (H v3) {
                                        throw pj.a(v3);
                                    }
                                    var12_11.add(var16_17);
                                }
                                catch (H v4) {
                                    throw pj.a(v4);
                                }
                            }
                            ++var15_15;
                        }
                        v1 = var10_10;
                    }
                    if (v1 == 0) continue;
                }
                var12_11.sort((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lambda$drawModules$0(lh lh ), (Llh;Llh;)I)());
                ImGui.beginChild((String)pj.b("c", (int)9783, (long)(3596504655498645724L ^ var5_5)));
                if (var4_4 > '\u0000') {

                }
            }
            for (lh var14_14 : var12_11) {
                block101: {
                    block99: {
                        block100: {
                            block98: {
                                block97: {
                                    block94: {
                                        block95: {
                                            block96: {
                                                block93: {
                                                    block92: {
                                                        block90: {
                                                            block91: {
                                                                block87: {
                                                                    block89: {
                                                                        block88: {
                                                                            block85: {
                                                                                block86: {
                                                                                    var15_16 = var14_14.f();
                                                                                    try {
                                                                                        try {
                                                                                            ImGui.pushID((String)var15_16);
                                                                                            v5 = var10_10;
                                                                                            if (var1_1 > 0) {
                                                                                                if (v5 != 0) break block84;
                                                                                                v5 = (int)var14_14.b();
                                                                                            }
                                                                                            if (var10_10 != 0) break block85;
                                                                                        }
                                                                                        catch (H v6) {
                                                                                            throw pj.a(v6);
                                                                                        }
                                                                                        if (v5 != 0) break block86;
                                                                                    }
                                                                                    catch (H v7) {
                                                                                        throw pj.a(v7);
                                                                                    }
                                                                                    v5 = 1;
                                                                                    break block85;
                                                                                }
                                                                                v5 = 0;
                                                                            }
                                                                            var16_18 = v5;
                                                                            var17_19 = ((mr)tf.m().a(mr.class)).m();
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v8 = var17_19.equals(pj.b("c", (int)3690, (long)(4961316294617118872L ^ var5_5)));
                                                                                        if (var10_10 != 0) break block87;
                                                                                        if (v8 != 0) break block88;
                                                                                    }
                                                                                    catch (H v9) {
                                                                                        throw pj.a(v9);
                                                                                    }
                                                                                    v8 = var17_19.equals(pj.b("c", (int)5236, (long)(120196450995806853L ^ var5_5)));
                                                                                    if (var10_10 != 0) break block87;
                                                                                }
                                                                                catch (H v10) {
                                                                                    throw pj.a(v10);
                                                                                }
                                                                                if (v8 == 0) break block89;
                                                                            }
                                                                            catch (H v11) {
                                                                                throw pj.a(v11);
                                                                            }
                                                                        }
                                                                        v8 = 1;
                                                                        break block87;
                                                                    }
                                                                    v8 = 0;
                                                                }
                                                                var18_20 = v8;
                                                                var19_21 = var17_19.equals(pj.b("c", (int)10188, (long)(8260569661216821562L ^ var5_5)));
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v12 = var16_18;
                                                                                    if (var10_10 != 0) break block90;
                                                                                    if (v12 != 0) {
                                                                                    }
                                                                                    ** GOTO lbl158
                                                                                }
                                                                                catch (H v13) {
                                                                                    throw pj.a(v13);
                                                                                }
                                                                                v12 = (int)var19_21;
                                                                                v14 = var10_10;
                                                                                if (var1_1 >= 0) {
                                                                                    if (v14 != 0) break block90;
                                                                                }
                                                                                ** GOTO lbl167
                                                                            }
                                                                            catch (H v15) {
                                                                                throw pj.a(v15);
                                                                            }
                                                                            if (var4_4 <= '\u0000') break block90;
                                                                            if (v12 == 0) {
                                                                            }
                                                                            ** GOTO lbl158
                                                                        }
                                                                        catch (H v16) {
                                                                            throw pj.a(v16);
                                                                        }
                                                                        v12 = var18_20;
                                                                        if (var4_4 >= '\u0000') {
                                                                            if (var10_10 != 0) break block91;
                                                                        }
                                                                        ** GOTO lbl156
                                                                    }
                                                                    catch (H v17) {
                                                                        throw pj.a(v17);
                                                                    }
                                                                    if (v12 == 0) {
                                                                    }
                                                                    ** GOTO lbl145
                                                                }
                                                                catch (H v18) {
                                                                    throw pj.a(v18);
                                                                }
                                                                var20_23 = ImGui.getStyle().getColors()[34];
                                                                var21_24 = ImGui.getStyle().getColors()[33];
                                                                try {
                                                                    ImGui.pushStyleColor((int)25, (float)var20_23[0], (float)var20_23[1], (float)var20_23[2], (float)var20_23[3]);
                                                                    ImGui.pushStyleColor((int)24, (float)var21_24[0], (float)var21_24[1], (float)var21_24[2], (float)var21_24[3]);
                                                                    v19 = var10_10;
                                                                    if (var3_3 < '\u0000') break block91;
                                                                    if (v19 == 0) break block92;
lbl145:


                                                                    ImGui.pushStyleColor((int)0, (float)0.5f, (float)0.5f, (float)0.5f, (float)1.0f);
                                                                    ImGui.pushStyleColor((int)24, (float)0.16f, (float)0.16f, (float)0.16f, (float)0.54f);
                                                                    ImGui.pushStyleColor((int)25, (float)0.2f, (float)0.2f, (float)0.2f, (float)0.54f);
                                                                    v19 = 26;
                                                                }
                                                                catch (H v20) {
                                                                    throw pj.a(v20);
                                                                }
                                                            }
                                                            try {
                                                                ImGui.pushStyleColor((int)v19, (float)0.16f, (float)0.16f, (float)0.16f, (float)0.54f);
                                                                v12 = var10_10;
lbl156:


                                                                if (var1_1 <= 0) break block90;
                                                                if (v12 == 0) break block92;
lbl158:


                                                                v12 = (int)var19_21;
                                                            }
                                                            catch (H v21) {
                                                                throw pj.a(v21);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v14 = var10_10;
lbl167:


                                                                    if (v14 != 0) break block93;
                                                                    if (v12 == 0) break block92;
                                                                }
                                                                catch (H v22) {
                                                                    throw pj.a(v22);
                                                                }
                                                                v12 = var16_18;
                                                                if (var10_10 != 0) break block93;
                                                            }
                                                            catch (H v23) {
                                                                throw pj.a(v23);
                                                            }
                                                            if (v12 != 0) break block92;
                                                        }
                                                        catch (H v24) {
                                                            throw pj.a(v24);
                                                        }
                                                        var20_23 = ImGui.getStyle().getColors()[34];
                                                        var21_24 = ImGui.getStyle().getColors()[33];
                                                        ImGui.pushStyleColor((int)25, (float)var20_23[0], (float)var20_23[1], (float)var20_23[2], (float)var20_23[3]);
                                                        ImGui.pushStyleColor((int)24, (float)var21_24[0], (float)var21_24[1], (float)var21_24[2], (float)var21_24[3]);
                                                    }
                                                    v12 = (int)ImGui.collapsingHeader((String)var15_16);
                                                }
                                                var20_22 = v12;
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v25 = var16_18;
                                                                    if (var10_10 != 0) break block94;
                                                                    if (v25 != 0) {
                                                                    }
                                                                    ** GOTO lbl234
                                                                }
                                                                catch (H v26) {
                                                                    throw pj.a(v26);
                                                                }
                                                                v25 = (int)var19_21;
                                                                v27 = var10_10;
                                                                if (var4_4 >= '\u0000') {
                                                                    if (v27 != 0) break block94;
                                                                }
                                                                ** GOTO lbl244
                                                            }
                                                            catch (H v28) {
                                                                throw pj.a(v28);
                                                            }
                                                            if (var1_1 < 0) break block94;
                                                            if (v25 == 0) {
                                                            }
                                                            ** GOTO lbl234
                                                        }
                                                        catch (H v29) {
                                                            throw pj.a(v29);
                                                        }
                                                        v30 = var18_20;
                                                        if (var10_10 != 0) break block95;
                                                    }
                                                    catch (H v31) {
                                                        throw pj.a(v31);
                                                    }
                                                    if (v30 != 0) break block96;
                                                }
                                                catch (H v32) {
                                                    throw pj.a(v32);
                                                }
                                                v30 = 2;
                                                break block95;
                                            }
                                            v30 = 4;
                                        }
                                        try {
                                            ImGui.popStyleColor((int)v30);
                                            v25 = var10_10;
                                            if (var4_4 <= '\u0000') break block94;
                                            if (v25 == 0) break block97;
lbl234:


                                            v25 = var16_18;
                                        }
                                        catch (H v33) {
                                            throw pj.a(v33);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v27 = var10_10;
lbl244:


                                                    if (v27 != 0) break block98;
                                                    if (v25 != 0) break block97;
                                                }
                                                catch (H v34) {
                                                    throw pj.a(v34);
                                                }
                                                v25 = (int)var19_21;
                                                v35 = var10_10;
                                                if (var3_3 >= '\u0000') {
                                                    if (v35 != 0) break block98;
                                                }
                                                ** GOTO lbl270
                                            }
                                            catch (H v36) {
                                                throw pj.a(v36);
                                            }
                                            if (v25 == 0) break block97;
                                        }
                                        catch (H v37) {
                                            throw pj.a(v37);
                                        }
                                        ImGui.popStyleColor((int)2);
                                    }
                                    catch (H v38) {
                                        throw pj.a(v38);
                                    }
                                }
                                v25 = (int)ImGui.isItemHovered();
                            }
                            try {
                                v35 = var10_10;
lbl270:


                                if (v35 != 0) break block99;
                                if (v25 == 0) break block100;
                            }
                            catch (H v39) {
                                throw pj.a(v39);
                            }
                            var21_24 = var14_14.h();
                            try {
                                try {
                                    v25 = (int)var21_24.isEmpty();
                                    if (var1_1 <= 0 || var10_10 != 0) break block99;
                                    if (v25 != 0) break block100;
                                }
                                catch (H v40) {
                                    throw pj.a(v40);
                                }
                                ImGui.setTooltip((String)var14_14.h());
                            }
                            catch (H v41) {
                                throw pj.a(v41);
                            }
                        }
                        v25 = var20_22;
                    }
                    try {
                        if (var3_3 < '\u0000') break block101;
                        if (v25 != 0) {
                            ImGui.indent((float)15.0f);
                            this.a(var14_14, var7_6, (short)var8_7, var9_8);
                            ImGui.unindent((float)15.0f);
                            ImGui.spacing();
                        }
                    }
                    catch (H v42) {
                        throw pj.a(v42);
                    }
                    ImGui.popID();
                    v25 = var10_10;
                }
                if (v25 == 0) continue;
            }
            ImGui.endChild();
            if (var4_4 > '\u0000') {

            }
        }
    }




    private void a(lh var1_1, int var2_2, short var3_3, int var4_4) {
        block68: {
            block69: {
                block65: {
                    block66: {
                        block67: {
                            block63: {
                                block64: {
                                    v0 = var5_5 = ((long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ pj.C;
                                    v1 = v0 ^ 21363438224081L;
                                    var7_6 = (int)(v1 >>> 48);
                                    var8_7 = (int)(v1 << 16 >>> 32);
                                    var9_8 = (int)(v1 << 48 >>> 48);
                                    v2 = v0 ^ 101617959418634L;
                                    var10_9 = (int)(v2 >>> 48);
                                    var11_10 = (int)(v2 << 16 >>> 32);
                                    var12_11 = (int)(v2 << 48 >>> 48);
                                    v3 = v0 ^ 14776396549576L;
                                    var13_12 = (int)(v3 >>> 48);
                                    var14_13 = (int)(v3 << 16 >>> 32);
                                    var15_14 = (int)(v3 << 48 >>> 48);
                                    v4 = v0 ^ 83371967498233L;
                                    var16_15 = v4 >>> 8;
                                    var18_16 = (int)(v4 << 56 >>> 56);
                                    v5 = v0 ^ 127778078249265L;
                                    var19_17 = (int)(v5 >>> 48);
                                    var20_18 = (int)(v5 << 16 >>> 32);
                                    var21_19 = (int)(v5 << 48 >>> 48);
                                    v6 = v0 ^ 103083019137569L;
                                    var22_20 = (int)(v6 >>> 32);
                                    var23_21 = (int)(v6 << 32 >>> 48);
                                    var24_22 = (int)(v6 << 48 >>> 48);
                                    v7 = v0 ^ 36355242885518L;
                                    var25_23 = (int)(v7 >>> 32);
                                    var26_24 = (int)(v7 << 32 >>> 56);
                                    var27_25 = (int)(v7 << 40 >>> 40);
                                    v8 = v0 ^ 19609160596372L;
                                    var28_26 = (int)(v8 >>> 32);
                                    var29_27 = (int)(v8 << 32 >>> 40);
                                    var30_28 = (int)(v8 << 56 >>> 56);
                                    var32_29 = var1_1.b();
                                    var33_30 = new ImBoolean(var32_29);
                                    var31_31 = FP.i();
                                    try {
                                        try {
                                            v9 = ImGui.checkbox((String)((String)pj.b("c", (int)20146, (long)(3091963474492980509L ^ var5_5)) + var1_1.f()), (ImBoolean)var33_30);
                                            if (var31_31 != 0) break block63;
                                            if (!v9) break block64;
                                        }
                                        catch (H v10) {
                                            throw pj.a(v10);
                                        }
                                        var1_1.c((short)var19_17, var20_18, var21_19);
                                    }
                                    catch (H v11) {
                                        throw pj.a(v11);
                                    }
                                }
                                ImGui.sameLine();
                                v9 = var1_1.d();
                            }
                            var34_32 = v9;
                            var35_33 = new ImBoolean(var34_32);
                            try {
                                try {
                                    if (var3_3 < 0 && !ImGui.checkbox((String)((String)pj.b("c", (int)28972, (long)(6277656612897800855L ^ var5_5)) + var1_1.f()), (ImBoolean)var35_33)) break block65;
                                    v12 = var1_1;
                                    v13 = var34_32;
                                    if (var31_31 != 0) break block66;
                                }
                                catch (H v14) {
                                    throw pj.a(v14);
                                }
                                if (v13) break block67;
                            }
                            catch (H v15) {
                                throw pj.a(v15);
                            }
                            v13 = true;
                            break block66;
                        }
                        v13 = false;
                    }
                    v12.a(v13);
                }
                var36_34 = new ArrayList<E>(var1_1.g().values());
                try {
                    try {
                        v16 = var36_34;
                        if (var31_31 != 0) break block68;
                        if (!v16.isEmpty()) break block69;
                    }
                    catch (H v17) {
                        throw pj.a(v17);
                    }
                    ImGui.textDisabled((String)pj.b("c", (int)30736, (long)(8476575522903509921L ^ var5_5)));
                    return;
                }
                catch (H v18) {
                    throw pj.a(v18);
                }
            }
            v16 = var36_34;
        }
        var37_35 = v16.iterator();
        block54: while (true) {
            v19 = var37_35.hasNext();
            while (v19 != 0) {
                block74: {
                    block75: {
                        block84: {
                            block82: {
                                block80: {
                                    block78: {
                                        block76: {
                                            block72: {
                                                block70: {
                                                    var38_36 = (kt)var37_35.next();
                                                    try {
                                                        try {
                                                            v20 = var38_36;
                                                            if (var31_31 != 0) break block70;
                                                            if (!v20.j()) {
                                                                continue block54;
                                                            }
                                                        }
                                                        catch (H v21) {
                                                            throw pj.a(v21);
                                                        }
                                                    }
                                                    catch (H v22) {
                                                        throw pj.a(v22);
                                                    }
                                                    v20 = var38_36;
                                                }
                                                var39_37 = v20.o();
                                                var40_38 = var1_1.f() + "_" + var39_37;
                                                var41_39 = var38_36.i();
                                                try {
                                                    block73: {
                                                        try {
                                                            try {
                                                                v19 = var41_39 instanceof Boolean;
                                                                v23 = var31_31;
                                                                if (var4_4 > 0) {
                                                                    if (v23 != 0) break block72;
                                                                    if (v19 == 0) break block73;
                                                                }
                                                                ** GOTO lbl150
                                                            }
                                                            catch (H v24) {
                                                                throw pj.a(v24);
                                                            }
                                                            this.b(var38_36, var39_37, (short)var7_6, var8_7, var40_38, var9_8);
                                                            v19 = var31_31;
                                                            if (var4_4 < 0) break block74;
                                                            if (v19 == 0) break block75;
                                                        }
                                                        catch (H v25) {
                                                            throw pj.a(v25);
                                                        }
                                                    }
                                                    v19 = var41_39 instanceof Number;
                                                }
                                                catch (H v26) {
                                                    throw pj.a(v26);
                                                }
                                            }
                                            try {
                                                block77: {
                                                    try {
                                                        try {
                                                            v23 = var31_31;
lbl150:


                                                            if (var3_3 <= 0) {
                                                                if (v23 != 0) break block76;
                                                                if (v19 == 0) break block77;
                                                            }
                                                            ** GOTO lbl174
                                                        }
                                                        catch (H v27) {
                                                            throw pj.a(v27);
                                                        }
                                                        this.a(var22_20, var38_36, var39_37, var23_21, var24_22, var40_38, var1_1);
                                                        v19 = var31_31;
                                                        if (var4_4 < 0) break block74;
                                                        if (v19 == 0) break block75;
                                                    }
                                                    catch (H v28) {
                                                        throw pj.a(v28);
                                                    }
                                                }
                                                v19 = var41_39 instanceof RB;
                                            }
                                            catch (H v29) {
                                                throw pj.a(v29);
                                            }
                                        }
                                        try {
                                            block79: {
                                                try {
                                                    try {
                                                        v23 = var31_31;
lbl174:


                                                        if (var3_3 <= 0) {
                                                            if (v23 != 0) break block78;
                                                            if (v19 == 0) break block79;
                                                        }
                                                        ** GOTO lbl198
                                                    }
                                                    catch (H v30) {
                                                        throw pj.a(v30);
                                                    }
                                                    this.a(var28_26, var38_36, var29_27, var39_37, var40_38, (byte)var30_28);
                                                    v19 = var31_31;
                                                    if (var4_4 <= 0) break block74;
                                                    if (v19 == 0) break block75;
                                                }
                                                catch (H v31) {
                                                    throw pj.a(v31);
                                                }
                                            }
                                            v19 = var41_39 instanceof qK;
                                        }
                                        catch (H v32) {
                                            throw pj.a(v32);
                                        }
                                    }
                                    try {
                                        block81: {
                                            try {
                                                try {
                                                    v23 = var31_31;
lbl198:


                                                    if (var4_4 >= 0) {
                                                        if (v23 != 0) break block80;
                                                        if (v19 == 0) break block81;
                                                    }
                                                    ** GOTO lbl222
                                                }
                                                catch (H v33) {
                                                    throw pj.a(v33);
                                                }
                                                this.e(var38_36, var25_23, var39_37, (byte)var26_24, var40_38, var27_25);
                                                v19 = var31_31;
                                                if (var2_2 < 0) break block74;
                                                if (v19 == 0) break block75;
                                            }
                                            catch (H v34) {
                                                throw pj.a(v34);
                                            }
                                        }
                                        v19 = var41_39 instanceof Kh;
                                    }
                                    catch (H v35) {
                                        throw pj.a(v35);
                                    }
                                }
                                try {
                                    block83: {
                                        try {
                                            try {
                                                v23 = var31_31;
lbl222:


                                                if (var4_4 >= 0) {
                                                    if (v23 != 0) break block82;
                                                    if (v19 == 0) break block83;
                                                }
                                                ** GOTO lbl247
                                            }
                                            catch (H v36) {
                                                throw pj.a(v36);
                                            }
                                            this.d(var38_36, var39_37, var16_15, (byte)var18_16, var40_38);
                                            v19 = var31_31;
                                            if (var2_2 <= 0) break block74;
                                            if (v19 == 0) break block75;
                                        }
                                        catch (H v37) {
                                            throw pj.a(v37);
                                        }
                                    }
                                    v19 = var41_39 instanceof wK;
                                }
                                catch (H v38) {
                                    throw pj.a(v38);
                                }
                            }
                            try {
                                block85: {
                                    try {
                                        try {
                                            if (var3_3 > 0) break block84;
                                            v23 = var31_31;
lbl247:


                                            if (v23 != 0) break block84;
                                            if (v19 == 0) break block85;
                                        }
                                        catch (H v39) {
                                            throw pj.a(v39);
                                        }
                                        this.b((char)var10_9, var38_36, var11_10, var39_37, (short)var12_11, var40_38, var1_1);
                                        v19 = var31_31;
                                        if (var2_2 < 0) break block74;
                                        if (v19 == 0) break block75;
                                    }
                                    catch (H v40) {
                                        throw pj.a(v40);
                                    }
                                }
                                v19 = var41_39 instanceof String;
                            }
                            catch (H v41) {
                                throw pj.a(v41);
                            }
                        }
                        try {
                            if (var4_4 <= 0) break block74;
                            if (v19 != 0) {
                                this.c(var38_36, (char)var13_12, var39_37, var40_38, var14_13, (char)var15_14);
                            }
                        }
                        catch (H v42) {
                            throw pj.a(v42);
                        }
                    }
                    v19 = var31_31;
                }
                if (var3_3 >= 0) continue;
                if (v19 != 0) break block54;
                continue block54;
            }
            break;
        }
    }




    private void b(kt kt2, String string, short s, int n, String string2, int n2) {
        block2: {
            block3: {
                long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ C;
                boolean bl = (Boolean)kt2.i();
                ImBoolean imBoolean = new ImBoolean(bl);
                int n3 = FP.b();
                try {
                    if (n3 == 0) break block2;
                    if (!ImGui.checkbox((String)(string + (String)((Object)pj.b("c", (int)5089, (long)(0x25146C1818B351E0L ^ l))) + string2), (ImBoolean)imBoolean)) break block3;
                }
                catch (H h) {
                    throw pj.a(h);
                }
                kt2.a((Object)imBoolean.get());
            }
            this.a(kt2);
        }
    }




    private void a(int n, kt kt2, String string, int n2, int n3, String string2, lh lh2) {
        block21: {
            block22: {
                float f;
                double d;
                float f2;
                float f3;
                int n4;
                int n5;
                int n6;
                block24: {
                    Object object;
                    block23: {
                        boolean bl;
                        int n7;
                        int n8;
                        block28: {
                            String string3;
                            long l;
                            block19: {
                                String string4;
                                float f4;
                                float f5;
                                Object object2;
                                String string5;
                                block27: {
                                    block20: {
                                        String string6;
                                        StringBuilder stringBuilder;
                                        String string7;
                                        block26: {
                                            float f6;
                                            block18: {
                                                int n9;
                                                block17: {
                                                    Object object3;
                                                    block25: {
                                                        ImFloat imFloat;
                                                        block16: {
                                                            int n10;
                                                            block15: {
                                                                l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ C;
                                                                long l2 = l ^ 0xED2FF658E8BL;
                                                                n6 = (int)(l2 >>> 48);
                                                                n5 = (int)(l2 << 16 >>> 32);
                                                                n4 = (int)(l2 << 48 >>> 48);
                                                                f6 = ((Number)kt2.i()).floatValue();
                                                                f3 = (float)kt2.d();
                                                                f2 = (float)kt2.t();
                                                                d = kt2.n();
                                                                string7 = kt2.h();
                                                                n8 = FP.i();
                                                                n7 = this.a(d);
                                                                try {
                                                                    n10 = n7;
                                                                    if (n8 != 0) break block15;
                                                                    if (n10 == 0) break block16;
                                                                }
                                                                catch (H h) {
                                                                    throw pj.a(h);
                                                                }
                                                                n10 = 1;
                                                            }
                                                            float[] fArray = new float[n10];
                                                            object3 = fArray;
                                                            fArray[0] = f6;
                                                            break block25;
                                                        }
                                                        object3 = imFloat;
                                                        imFloat = new ImFloat(f6);
                                                    }
                                                    object = object3;
                                                    try {
                                                        try {
                                                            stringBuilder = new StringBuilder();
                                                            float f7 = f6 - (float)((int)f6);
                                                            n9 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                                            if (n8 != 0) break block17;
                                                            if (n9 != false) break block18;
                                                        }
                                                        catch (H h) {
                                                            throw pj.a(h);
                                                        }
                                                        n9 = (int)f6;
                                                    }
                                                    catch (H h) {
                                                        throw pj.a(h);
                                                    }
                                                }
                                                string6 = String.valueOf(n9);
                                                break block26;
                                            }
                                            string6 = new DecimalFormat((String)((Object)pj.b("c", (int)20499, (long)(0x4199AF5D1517E2F1L ^ l)))).format(f6);
                                        }
                                        string3 = stringBuilder.append(string6).append(string7).toString();
                                        try {
                                            if (n7 == 0) break block19;
                                            string5 = (String)((Object)pj.b("c", (int)29168, (long)(0x2B9B1FAAEDAB4302L ^ l))) + string2 + (String)((Object)pj.b("c", (int)28497, (long)(0x46256E4A162FDDAEL ^ l)));
                                            object2 = object;
                                            f5 = f3;
                                            f4 = f2;
                                            if (d != 1.0) break block20;
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                        string4 = (String)((Object)pj.b("c", (int)8401, (long)(0x253DDC69BAD8122AL ^ l))) + string7;
                                        break block27;
                                    }
                                    string4 = string3;
                                }
                                bl = ImGui.sliderFloat((String)string5, (float[])object2, (float)f5, (float)f4, (String)string4);
                                break block28;
                            }
                            bl = ImGui.inputFloat((String)((String)((Object)pj.b("c", (int)29168, (long)(0x2B9B1FAAEDAB4302L ^ l))) + string2 + (String)((Object)pj.b("c", (int)15067, (long)(0x26FC58D6D9558823L ^ l)))), (ImFloat)((ImFloat)object), (float)((float)d), (float)(f2 - f3), (String)string3);
                        }
                        boolean bl2 = bl;
                        try {
                            try {
                                try {
                                    int n11 = n8;
                                    if (n2 >= 0) {
                                        if (n11 != 0) break block21;
                                        n11 = bl2 ? 1 : 0;
                                    }
                                    if (n11 == 0) break block22;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                if (n7 == 0) break block23;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            f = object[0];
                            break block24;
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                    }
                    f = ((ImFloat)object).get();
                }
                float f8 = f;
                float f9 = (float)((double)Math.round((double)f8 / d) * d);
                f9 = Math.max(f3, Math.min(f2, (float)Math.round(f9 * 100.0f) / 100.0f));
                f9 = this.a((short)n6, n5, kt2, f9, lh2, (char)n4);
                kt2.a((Object)Float.valueOf(f9));
            }
            this.a(kt2);
            ImGui.sameLine();
            ImGui.text((String)string);
        }
    }




    private void a(int n, kt kt2, int n2, String string, String string2, byte by) {
        block13: {
            block14: {
                long l = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ C;
                RB rB = (RB)kt2.i();
                int n3 = FP.i();
                String string3 = rB.f();
                String[] stringArray = rB.a();
                try {
                    if (n3 != 0) break block13;
                    if (!ImGui.beginCombo((String)(string + (String)((Object)pj.b("c", (int)29168, (long)(0x2B9B53BF921A8AB7L ^ l))) + string2), (String)string3)) break block14;
                }
                catch (H h) {
                    throw pj.a(h);
                }
                for (String string4 : stringArray) {
                    int n4;
                    block15: {
                        boolean bl;
                        block16: {
                            bl = string4.equalsIgnoreCase(string3);
                            try {
                                try {
                                    try {
                                        n4 = n3;
                                        if (n > 0) {
                                            if (n4 != 0) break block13;
                                            n4 = ImGui.selectable((String)string4, (boolean)bl) ? 1 : 0;
                                        }
                                        if (n3 != 0) break block15;
                                    }
                                    catch (H h) {
                                        throw pj.a(h);
                                    }
                                    if (n4 == 0) break block16;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                rB.a(string4);
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                        }
                        n4 = bl ? 1 : 0;
                    }
                    if (n4 == 0) continue;
                    ImGui.setItemDefaultFocus();
                    if (n3 == 0) continue;
                }
                if (n < 0) break block13;
                ImGui.endCombo();
            }
            this.a(kt2);
        }
    }




    private void e(kt kt2, int n, String string, byte by, String string2, int n2) {
        block10: {
            int n3;
            qK qK2;
            long l;
            block9: {
                l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ C;
                qK2 = (qK)kt2.i();
                n3 = FP.b();
                try {
                    if (n3 == 0) break block9;
                    if (!ImGui.treeNode((String)(string + (String)((Object)pj.b("c", (int)29168, (long)(0x2B9B637A924130ADL ^ l))) + string2))) break block10;
                }
                catch (H h) {
                    throw pj.a(h);
                }
                this.a(kt2);
            }
            List list = qK2.a();
            for (kt kt3 : list) {
                int n4;
                block11: {
                    block12: {
                        block13: {
                            boolean bl = (Boolean)kt3.i();
                            ImBoolean imBoolean = new ImBoolean(bl);
                            try {
                                try {
                                    n4 = n3;
                                    if (n2 > 0) {
                                        if (n4 == 0) break block10;
                                        n4 = n3;
                                    }
                                    if (n < 0) break block11;
                                    if (n4 == 0) break block12;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                if (!ImGui.checkbox((String)(kt3.o() + (String)((Object)pj.b("c", (int)29168, (long)(0x2B9B637A924130ADL ^ l))) + string2 + "_" + kt3.o()), (ImBoolean)imBoolean)) break block13;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            kt3.a((Object)imBoolean.get());
                        }
                        this.a(kt3);
                    }
                    n4 = n3;
                }
                if (n4 != 0) continue;
            }
            if (n >= 0) {
                ImGui.treePop();
            }
        }
    }




    private void d(kt kt2, String string, long l, byte by, String string2) {
        block2: {
            block3: {
                long l2 = (l << 8 | (long)by << 56 >>> 56) ^ C;
                Kh kh = (Kh)kt2.i();
                int n = FP.b();
                float[] fArray = new float[]{(float)kh.e() / 255.0f, (float)kh.d() / 255.0f, (float)kh.c() / 255.0f, (float)kh.b() / 255.0f};
                try {
                    if (n == 0) break block2;
                    if (!ImGui.colorEdit4((String)(string + (String)((Object)pj.b("c", (int)29168, (long)(0x2B9B09B9839676DAL ^ l2))) + string2), (float[])fArray, (int)196640)) break block3;
                }
                catch (H h) {
                    throw pj.a(h);
                }
                Kh kh2 = new Kh((int)(fArray[0] * 255.0f), (int)(fArray[1] * 255.0f), (int)(fArray[2] * 255.0f), (int)(fArray[3] * 255.0f));
                kt2.a((Object)kh2);
            }
            this.a(kt2);
        }
    }





    private void b(char var1_1, kt var2_2, int var3_3, String var4_4, short var5_5, String var6_6, lh var7_7) {
        block53: {
            v0 = var8_8 = ((long)var1_1 << 48 | (long)var3_3 << 32 >>> 16 | (long)var5_5 << 48 >>> 48) ^ pj.C;
            v1 = v0 ^ 126220948327103L;
            var10_9 = (int)(v1 >>> 48);
            var11_10 = (int)(v1 << 16 >>> 32);
            var12_11 = (int)(v1 << 48 >>> 48);
            v2 = v0 ^ 67936932066148L;
            var13_12 = (int)(v2 >>> 48);
            var14_13 = (int)(v2 << 16 >>> 32);
            var15_14 = (int)(v2 << 48 >>> 48);
            v3 = v0 ^ 119651064497574L;
            var16_15 = (int)(v3 >>> 48);
            var17_16 = (int)(v3 << 16 >>> 32);
            var18_17 = (int)(v3 << 48 >>> 48);
            v4 = v0 ^ 46667074998167L;
            var19_18 = v4 >>> 8;
            var21_19 = (int)(v4 << 56 >>> 56);
            v5 = v0 ^ 66395502066255L;
            var22_20 = (int)(v5 >>> 32);
            var23_21 = (int)(v5 << 32 >>> 48);
            var24_22 = (int)(v5 << 48 >>> 48);
            v6 = v0 ^ 71135793957344L;
            var25_23 = (int)(v6 >>> 32);
            var26_24 = (int)(v6 << 32 >>> 56);
            var27_25 = (int)(v6 << 40 >>> 40);
            v7 = v0 ^ 123658951554042L;
            var28_26 = (int)(v7 >>> 32);
            var29_27 = (int)(v7 << 32 >>> 40);
            var30_28 = (int)(v7 << 56 >>> 56);
            var32_29 = (wK)var2_2.i();
            var31_30 = FP.b();
            if (!ImGui.treeNode((String)(var4_4 + (String)pj.b("c", (int)29168, (long)(3142138158041795113L ^ var8_8)) + var6_6))) break block53;
            var33_31 = var32_29.a().iterator();
            block44: while (true) {
                v8 = var33_31.hasNext();
                while (v8 != 0) {
                    block58: {
                        block59: {
                            block68: {
                                block66: {
                                    block64: {
                                        block62: {
                                            block60: {
                                                block56: {
                                                    block54: {
                                                        var34_32 = (kt)var33_31.next();
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var5_5 <= 0 || var31_30 == 0) break block53;
                                                                    v9 = var34_32;
                                                                    if (var31_30 == 0) break block54;
                                                                }
                                                                catch (H v10) {
                                                                    throw pj.a(v10);
                                                                }
                                                                if (!v9.j()) {
                                                                    continue block44;
                                                                }
                                                            }
                                                            catch (H v11) {
                                                                throw pj.a(v11);
                                                            }
                                                        }
                                                        catch (H v12) {
                                                            throw pj.a(v12);
                                                        }
                                                        v9 = var34_32;
                                                    }
                                                    var35_33 = v9.o();
                                                    var36_34 = var6_6 + "_" + var35_33;
                                                    var37_35 = var34_32.i();
                                                    try {
                                                        block57: {
                                                            try {
                                                                try {
                                                                    v8 = var37_35 instanceof Boolean;
                                                                    v13 = var31_30;
                                                                    if (var1_1 >= '\u0000') {
                                                                        if (v13 == 0) break block56;
                                                                        if (v8 == 0) break block57;
                                                                    }
                                                                    ** GOTO lbl96
                                                                }
                                                                catch (H v14) {
                                                                    throw pj.a(v14);
                                                                }
                                                                this.b(var34_32, var35_33, (short)var10_9, var11_10, var36_34, var12_11);
                                                                v8 = var31_30;
                                                                if (var3_3 <= 0) break block58;
                                                                if (v8 != 0) break block59;
                                                            }
                                                            catch (H v15) {
                                                                throw pj.a(v15);
                                                            }
                                                        }
                                                        v8 = var37_35 instanceof Number;
                                                    }
                                                    catch (H v16) {
                                                        throw pj.a(v16);
                                                    }
                                                }
                                                try {
                                                    block61: {
                                                        try {
                                                            try {
                                                                v13 = var31_30;
lbl96:


                                                                if (var5_5 >= 0) {
                                                                    if (v13 == 0) break block60;
                                                                    if (v8 == 0) break block61;
                                                                }
                                                                ** GOTO lbl120
                                                            }
                                                            catch (H v17) {
                                                                throw pj.a(v17);
                                                            }
                                                            this.a(var22_20, var34_32, var35_33, var23_21, var24_22, var36_34, var7_7);
                                                            v8 = var31_30;
                                                            if (var1_1 < '\u0000') break block58;
                                                            if (v8 != 0) break block59;
                                                        }
                                                        catch (H v18) {
                                                            throw pj.a(v18);
                                                        }
                                                    }
                                                    v8 = var37_35 instanceof RB;
                                                }
                                                catch (H v19) {
                                                    throw pj.a(v19);
                                                }
                                            }
                                            try {
                                                block63: {
                                                    try {
                                                        try {
                                                            v13 = var31_30;
lbl120:


                                                            if (var3_3 > 0) {
                                                                if (v13 == 0) break block62;
                                                                if (v8 == 0) break block63;
                                                            }
                                                            ** GOTO lbl144
                                                        }
                                                        catch (H v20) {
                                                            throw pj.a(v20);
                                                        }
                                                        this.a(var28_26, var34_32, var29_27, var35_33, var36_34, (byte)var30_28);
                                                        v8 = var31_30;
                                                        if (var5_5 < 0) break block58;
                                                        if (v8 != 0) break block59;
                                                    }
                                                    catch (H v21) {
                                                        throw pj.a(v21);
                                                    }
                                                }
                                                v8 = var37_35 instanceof qK;
                                            }
                                            catch (H v22) {
                                                throw pj.a(v22);
                                            }
                                        }
                                        try {
                                            block65: {
                                                try {
                                                    try {
                                                        v13 = var31_30;
lbl144:


                                                        if (var3_3 > 0) {
                                                            if (v13 == 0) break block64;
                                                            if (v8 == 0) break block65;
                                                        }
                                                        ** GOTO lbl168
                                                    }
                                                    catch (H v23) {
                                                        throw pj.a(v23);
                                                    }
                                                    this.e(var34_32, var25_23, var35_33, (byte)var26_24, var36_34, var27_25);
                                                    v8 = var31_30;
                                                    if (var5_5 < 0) break block58;
                                                    if (v8 != 0) break block59;
                                                }
                                                catch (H v24) {
                                                    throw pj.a(v24);
                                                }
                                            }
                                            v8 = var37_35 instanceof Kh;
                                        }
                                        catch (H v25) {
                                            throw pj.a(v25);
                                        }
                                    }
                                    try {
                                        block67: {
                                            try {
                                                try {
                                                    v13 = var31_30;
lbl168:


                                                    if (var1_1 >= '\u0000') {
                                                        if (v13 == 0) break block66;
                                                        if (v8 == 0) break block67;
                                                    }
                                                    ** GOTO lbl193
                                                }
                                                catch (H v26) {
                                                    throw pj.a(v26);
                                                }
                                                this.d(var34_32, var35_33, var19_18, (byte)var21_19, var36_34);
                                                v8 = var31_30;
                                                if (var1_1 < '\u0000') break block58;
                                                if (v8 != 0) break block59;
                                            }
                                            catch (H v27) {
                                                throw pj.a(v27);
                                            }
                                        }
                                        v8 = var37_35 instanceof wK;
                                    }
                                    catch (H v28) {
                                        throw pj.a(v28);
                                    }
                                }
                                try {
                                    block69: {
                                        try {
                                            try {
                                                if (var3_3 < 0) break block68;
                                                v13 = var31_30;
lbl193:


                                                if (v13 == 0) break block68;
                                                if (v8 == 0) break block69;
                                            }
                                            catch (H v29) {
                                                throw pj.a(v29);
                                            }
                                            this.b((char)var13_12, var34_32, var14_13, var35_33, (short)var15_14, var36_34, var7_7);
                                            v8 = var31_30;
                                            if (var1_1 < '\u0000') break block58;
                                            if (v8 != 0) break block59;
                                        }
                                        catch (H v30) {
                                            throw pj.a(v30);
                                        }
                                    }
                                    v8 = var37_35 instanceof String;
                                }
                                catch (H v31) {
                                    throw pj.a(v31);
                                }
                            }
                            try {
                                if (var5_5 <= 0) break block58;
                                if (v8 != 0) {
                                    this.c(var34_32, (char)var16_15, var35_33, var36_34, var17_16, (char)var18_17);
                                }
                            }
                            catch (H v32) {
                                throw pj.a(v32);
                            }
                        }
                        v8 = var31_30;
                    }
                    if (var3_3 < 0) continue;
                    if (v8 == 0) break block44;
                    continue block44;
                }
                break;
            }
            ImGui.treePop();
        }
    }





    private void c(kt var1_1, char var2_2, String var3_3, String var4_4, int var5_5, char var6_6) {
        block24: {
            block25: {
                block27: {
                    block26: {
                        block22: {
                            block20: {
                                block21: {
                                    var7_7 = ((long)var2_2 << 48 | (long)var5_5 << 32 >>> 16 | (long)var6_6 << 48 >>> 48) ^ pj.C;
                                    var10_8 = (String)var1_1.i();
                                    var9_9 = FP.i();
                                    var11_10 = new ImString(var10_8, 256);
                                    try {
                                        try {
                                            v0 = ImGui.inputText((String)(var3_3 + (String)pj.b("c", (int)29168, (long)(3142192139900402923L ^ var7_7)) + var4_4), (ImString)var11_10, (int)256);
                                            if (var9_9 != 0) break block20;
                                            if (!v0) break block21;
                                        }
                                        catch (H v1) {
                                            throw pj.a(v1);
                                        }
                                        var1_1.a((Object)var11_10.get());
                                    }
                                    catch (H v2) {
                                        throw pj.a(v2);
                                    }
                                }
                                v0 = ImGui.isItemActive();
                            }
                            try {
                                block23: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var9_9 != 0) break block22;
                                                    if (!v0) break block23;
                                                }
                                                catch (H v3) {
                                                    throw pj.a(v3);
                                                }
                                                v0 = Keyboard.areRepeatEventsEnabled();
                                                v4 = var9_9;
                                                if (var6_6 > '\u0000') {
                                                    if (v4 != 0) break block22;
                                                }
                                                ** GOTO lbl57
                                            }
                                            catch (H v5) {
                                                throw pj.a(v5);
                                            }
                                            if (var2_2 < '\u0000') break block22;
                                            if (v0) break block23;
                                        }
                                        catch (H v6) {
                                            throw pj.a(v6);
                                        }
                                        Keyboard.enableRepeatEvents((boolean)true);
                                        if (var2_2 < '\u0000') break block24;
                                        if (var9_9 == 0) break block25;
                                    }
                                    catch (H v7) {
                                        throw pj.a(v7);
                                    }
                                }
                                v0 = ImGui.isItemActive();
                            }
                            catch (H v8) {
                                throw pj.a(v8);
                            }
                        }
                        try {
                            v4 = var9_9;
lbl57:


                            if (var6_6 >= '\u0000') {
                                if (v4 != 0) break block26;
                                if (v0) break block25;
                            }
                            ** GOTO lbl68
                        }
                        catch (H v9) {
                            throw pj.a(v9);
                        }
                        v0 = Keyboard.areRepeatEventsEnabled();
                    }
                    try {
                        v4 = var9_9;
lbl68:


                        if (v4 != 0) break block27;
                        if (!v0) break block25;
                    }
                    catch (H v10) {
                        throw pj.a(v10);
                    }
                    v0 = false;
                }
                Keyboard.enableRepeatEvents((boolean)v0);
            }
            this.a(var1_1);
        }
    }

    private void a(kt<?> kt2) {
        block14: {
            String string;
            block17: {
                int n;
                block16: {
                    boolean bl;
                    block15: {
                        block13: {
                            n = FP.i();
                            try {
                                try {
                                    bl = ImGui.isItemHovered();
                                    if (n != 0) break block13;
                                    if (!bl) break block14;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                bl = ImGui.getIO().getKeyShift();
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block15;
                                if (bl) break block16;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            bl = ImGui.getIO().getKeyCtrl();
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                    }
                    if (!bl) break block14;
                }
                String string2 = kt2.p();
                try {
                    try {
                        string = string2;
                        if (n != 0) break block17;
                        if (string.isEmpty()) break block14;
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                    string = kt2.p();
                }
                catch (H h) {
                    throw pj.a(h);
                }
            }
            ImGui.setTooltip((String)string);
        }
    }

    private float a(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }






    private float a(short var1_1, int var2_2, kt var3_3, float var4_4, lh var5_5, char var6_6) {
        block46: {
            block50: {
                block51: {
                    block52: {
                        block49: {
                            block48: {
                                block47: {
                                    block39: {
                                        block41: {
                                            block43: {
                                                block44: {
                                                    block45: {
                                                        block42: {
                                                            block40: {
                                                                var7_7 = ((long)var1_1 << 48 | (long)var2_2 << 32 >>> 16 | (long)var6_6 << 48 >>> 48) ^ pj.C;
                                                                v0 = var7_7 ^ 9289059251537L;
                                                                var9_8 = (int)(v0 >>> 56);
                                                                var10_9 = v0 << 8 >>> 8;
                                                                var13_10 = var3_3.r();
                                                                var12_11 = FP.i();
                                                                try {
                                                                    v1 = var13_10.startsWith((String)pj.b("c", (int)25634, (long)(6442211835352820524L ^ var7_7)));
                                                                    if (var12_11 != 0) break block39;
                                                                    if (v1) {
                                                                    }
                                                                    ** GOTO lbl79
                                                                }
                                                                catch (H v2) {
                                                                    throw pj.a(v2);
                                                                }
                                                                var14_12 = var13_10.substring(4);
                                                                var15_13 = this.a(var14_12, var5_5, (byte)var9_8, true, var10_9);
                                                                try {
                                                                    try {
                                                                        v3    = var15_13;
                                                                        v4 = var12_11;
                                                                        if (var6_6 > '\u0000') {
                                                                            if (v4 != 0) break block40;
                                                                            if (v3    == null) break block41;
                                                                        }
                                                                        ** GOTO lbl38
                                                                    }
                                                                    catch (H v5) {
                                                                        throw pj.a(v5);
                                                                    }
                                                                    v3    = var15_13.i();
                                                                }
                                                                catch (H v6) {
                                                                    throw pj.a(v6);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    v4 = var12_11;
lbl38:


                                                                    if (v4 != 0) break block42;
                                                                    v7 = v3    instanceof Number;
                                                                    if (var1_1 >= 0) {
                                                                        if (v7 == 0) break block41;
                                                                    }
                                                                    ** GOTO lbl78
                                                                }
                                                                catch (H v8) {
                                                                    throw pj.a(v8);
                                                                }
                                                                v3    = var15_13.i();
                                                            }
                                                            catch (H v9) {
                                                                throw pj.a(v9);
                                                            }
                                                        }
                                                        var16_14 = ((Number)v3   ).floatValue();
                                                        try {
                                                            try {
                                                                v10 = var4_4;
                                                                if (var1_1 < 0) break block43;
                                                                v11 = var16_14;
                                                                if (var12_11 != 0) break block44;
                                                                if (!(v10 > v11)) break block45;
                                                            }
                                                            catch (H v12) {
                                                                throw pj.a(v12);
                                                            }
                                                            var15_13.a((Object)Float.valueOf(var4_4));
                                                            return var4_4;
                                                        }
                                                        catch (H v13) {
                                                            throw pj.a(v13);
                                                        }
                                                    }
                                                    v14 = var4_4;
                                                    v11 = var16_14;
                                                }
                                                v10 = Math.min(v14, v11);
                                            }
                                            return v10;
                                        }
                                        try {
                                            try {
                                                block53: {
                                                    if (var1_1 < 0) break block53;
                                                    v7 = var12_11;
lbl78:


                                                    if (v7 == 0) break block46;
                                                }
                                                v15 = var13_10;
                                                if (var12_11 != 0) break block47;
                                            }
                                            catch (H v16) {
                                                throw pj.a(v16);
                                            }
                                            v1 = v15.startsWith((String)pj.b("c", (int)15405, (long)(1222679087525196599L ^ var7_7)));
                                        }
                                        catch (H v17) {
                                            throw pj.a(v17);
                                        }
                                    }
                                    try {
                                        if (!v1) break block46;
                                        v15 = var13_10.substring(4);
                                    }
                                    catch (H v18) {
                                        throw pj.a(v18);
                                    }
                                }
                                var14_12 = v15;
                                var15_13 = this.a(var14_12, var5_5, (byte)var9_8, false, var10_9);
                                try {
                                    try {
                                        v19    = var15_13;
                                        v20 = var12_11;
                                        if (var1_1 >= 0) {
                                            if (v20 != 0) break block48;
                                            if (v19    == null) break block46;
                                        }
                                        ** GOTO lbl118
                                    }
                                    catch (H v21) {
                                        throw pj.a(v21);
                                    }
                                    v19    = var15_13.i();
                                }
                                catch (H v22) {
                                    throw pj.a(v22);
                                }
                            }
                            try {
                                try {
                                    v20 = var12_11;
lbl118:


                                    if (v20 != 0) break block49;
                                    if (!(v19    instanceof Number)) break block46;
                                }
                                catch (H v23) {
                                    throw pj.a(v23);
                                }
                                v19    = var15_13.i();
                            }
                            catch (H v24) {
                                throw pj.a(v24);
                            }
                        }
                        var16_15 = ((Number)v19   ).floatValue();
                        try {
                            try {
                                v25 = var4_4;
                                if (var6_6 <= '\u0000') break block50;
                                v26 = var16_15;
                                if (var12_11 != 0) break block51;
                                if (!(v25 < v26)) break block52;
                            }
                            catch (H v27) {
                                throw pj.a(v27);
                            }
                            var15_13.a((Object)Float.valueOf(var4_4));
                            return var4_4;
                        }
                        catch (H v28) {
                            throw pj.a(v28);
                        }
                    }
                    v29 = var4_4;
                    v26 = var16_15;
                }
                v25 = Math.max(v29, v26);
            }
            return v25;
        }
        return var4_4;
    }




    private kt a(String string, lh lh2, byte by, boolean bl, long l) {
        String string2;
        int n;
        block15: {
            kt kt2;
            block14: {
                CallSite callSite;
                StringBuilder stringBuilder;
                long l2 = ((long)by << 56 | l << 8 >>> 8) ^ C;
                n = FP.b();
                try {
                    stringBuilder = new StringBuilder();
                    callSite = bl ? pj.b("c", (int)18764, (long)(0xD77D7247D414065L ^ l2)) : pj.b("c", (int)1763, (long)(0x41DC137E25178FC5L ^ l2));
                }
                catch (H h) {
                    throw pj.a(h);
                }
                string2 = stringBuilder.append((String)((Object)callSite)).append(string).toString();
                kt kt3 = (kt)lh2.g().get((Object)string2);
                try {
                    kt2 = kt3;
                    if (n == 0) break block14;
                    if (kt2 == null) break block15;
                }
                catch (H h) {
                    throw pj.a(h);
                }
                kt2 = kt3;
            }
            return kt2;
        }
        Iterator iterator = lh2.g().values().iterator();
        block10: while (true) {
            int n2 = iterator.hasNext();
            block11: while (n2 != 0) {
                block17: {
                    Object object;
                    block16: {
                        kt kt4 = (kt)iterator.next();
                        try {
                            try {
                                object = kt4.i();
                                if (n == 0) break block16;
                                n2 = object instanceof wK;
                                if (l < 0L) continue block10;
                                if (n2 == 0) break block17;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            object = kt4.i();
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                    }
                    wK wK2 = (wK)object;
                    Iterator iterator2 = wK2.a().iterator();
                    block12: while (true) {
                        boolean bl2 = iterator2.hasNext();
                        while (bl2) {
                            kt kt5;
                            block18: {
                                kt kt6 = (kt)iterator2.next();
                                try {
                                    kt5 = kt6;
                                    if (n == 0) break block18;
                                    n2 = kt5.r().equals(string2) ? 1 : 0;
                                    if (n == 0) continue block11;
                                    if (by < 0) continue;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                if (n2 == 0) continue block12;
                                kt5 = kt6;
                            }
                            return kt5;
                            if (n != 0) continue block12;
                        }
                        break;
                    }
                }
                n2 = n;
                if (l < 0L) continue;
                if (n2 != 0) continue block10;
            }
            break;
        }
        return null;
    }

    private boolean a(double d) {
        double d2;
        block24: {
            block26: {
                block25: {
                    int n;
                    block22: {
                        n = FP.b();
                        try {
                            double d3;
                            block23: {
                                try {
                                    try {
                                        try {
                                            double d4 = d - 1.0;
                                            d2 = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                                            if (n == 0) break block22;
                                            if (d2 < 0) break block23;
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                        double d5 = d % 1.0 - 0.0;
                                        d2 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                                        if (n == 0) break block24;
                                    }
                                    catch (H h) {
                                        throw pj.a(h);
                                    }
                                    if (d2 == false) break block25;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                            }
                            d2 = (d3 = d - 0.1) == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block24;
                                                if (d2 == false) break block25;
                                            }
                                            catch (H h) {
                                                throw pj.a(h);
                                            }
                                            double d6 = d - 0.01;
                                            d2 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                                            if (n == 0) break block24;
                                        }
                                        catch (H h) {
                                            throw pj.a(h);
                                        }
                                        if (d2 == false) break block25;
                                    }
                                    catch (H h) {
                                        throw pj.a(h);
                                    }
                                    double d7 = d - 0.5;
                                    d2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                                    if (n == 0) break block24;
                                }
                                catch (H h) {
                                    throw pj.a(h);
                                }
                                if (d2 == false) break block25;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            double d8 = d - 0.05;
                            d2 = d8 == 0.0 ? 0 : (d8 > 0.0 ? 1 : -1);
                            if (n == 0) break block24;
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                        if (d2 != false) break block26;
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                }
                d2 = 1.0;
                break block24;
            }
            d2 = 0.0;
        }
        return (boolean)d2;
    }

    public boolean k() {
        return false;
    }




    private void l(char var1_1, int var2_2, short var3_3) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private void q() {
        block11: {
            int n;
            block10: {
                int n2;
                block8: {
                    block9: {
                        n2 = FP.b();
                        try {
                            try {
                                n = this.x;
                                if (n2 == 0) break block8;
                                if (n <= 0) break block9;
                            }
                            catch (H h) {
                                throw pj.a(h);
                            }
                            ImGui.popStyleColor((int)this.x);
                        }
                        catch (H h) {
                            throw pj.a(h);
                        }
                    }
                    n = this.y;
                }
                try {
                    try {
                        if (n2 == 0) break block10;
                        if (n <= 0) break block11;
                    }
                    catch (H h) {
                        throw pj.a(h);
                    }
                    n = this.y;
                }
                catch (H h) {
                    throw pj.a(h);
                }
            }
            ImGui.popStyleVar((int)n);
        }
    }

    private void a(int n, int n2, int n3, int n4, float f) {
        ImGui.pushStyleColor((int)n, (float)((float)n2 / 255.0f), (float)((float)n3 / 255.0f), (float)((float)n4 / 255.0f), (float)f);
        ++this.x;
    }

    private void a(int n, float f) {
        ImGui.pushStyleVar((int)n, (float)f);
        ++this.y;
    }

    private void a(int n, float f, float f2) {
        ImGui.pushStyleVar((int)n, (float)f, (float)f2);
        ++this.y;
    }

    private void h() {
        int n = ((mr)tf.m().a(mr.class)).n();
        float f = (float)(n >> 16 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = (float)(n >> 24 & 0xFF) / 255.0f;
        float[] fArray = new float[]{f, f2, f3, f4};
        this.a(18, 10.0f);
        this.a(21, 5.0f);
        this.a(20, 10.0f);
        this.a(12, 3.0f);
        this.a(22, 3.0f);
        ImGui.pushStyleColor((int)0, (float)0.94f, (float)0.94f, (float)0.94f, (float)1.0f);
        ++this.x;
        ImGui.pushStyleColor((int)2, (float)0.11f, (float)0.11f, (float)0.11f, (float)1.0f);
        ++this.x;
        ImGui.pushStyleColor((int)4, (float)0.11f, (float)0.11f, (float)0.11f, (float)0.94f);
        ++this.x;
        ImGui.pushStyleColor((int)5, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)7, (float)0.15f, (float)0.15f, (float)0.15f, (float)0.54f);
        ++this.x;
        ImGui.pushStyleColor((int)11, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)10, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)8, (float)0.19f, (float)0.19f, (float)0.19f, (float)0.54f);
        ++this.x;
        ImGui.pushStyleColor((int)9, (float)0.26f, (float)0.26f, (float)0.26f, (float)0.54f);
        ++this.x;
        ImGui.pushStyleColor((int)14, (float)0.11f, (float)0.11f, (float)0.11f, (float)0.94f);
        ++this.x;
        ImGui.pushStyleColor((int)15, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)49, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)18, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)19, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        float[] fArray2 = new float[]{this.a(f * 1.15f), this.a(f2 * 1.15f), this.a(f3 * 1.15f), f4};
        float[] fArray3 = new float[]{this.a(f * 0.95f), this.a(f2 * 0.95f), this.a(f3 * 0.95f), f4};
        ImGui.pushStyleColor((int)20, (float)fArray3[0], (float)fArray3[1], (float)fArray3[2], (float)fArray3[3]);
        ++this.x;
        ImGui.pushStyleColor((int)21, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)22, (float)fArray2[0], (float)fArray2[1], (float)fArray2[2], (float)fArray2[3]);
        ++this.x;
        ImGui.pushStyleColor((int)23, (float)fArray3[0], (float)fArray3[1], (float)fArray3[2], (float)fArray3[3]);
        ++this.x;
        ImGui.pushStyleColor((int)24, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)25, (float)fArray2[0], (float)fArray2[1], (float)fArray2[2], (float)fArray2[3]);
        ++this.x;
        ImGui.pushStyleColor((int)26, (float)fArray3[0], (float)fArray3[1], (float)fArray3[2], (float)fArray3[3]);
        ++this.x;
        ImGui.pushStyleColor((int)27, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)33, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)34, (float)fArray2[0], (float)fArray2[1], (float)fArray2[2], (float)fArray2[3]);
        ++this.x;
        ImGui.pushStyleColor((int)35, (float)fArray3[0], (float)fArray3[1], (float)fArray3[2], (float)fArray3[3]);
        ++this.x;
        ImGui.pushStyleColor((int)30, (float)fArray[0], (float)fArray[1], (float)fArray[2], (float)fArray[3]);
        ++this.x;
        ImGui.pushStyleColor((int)31, (float)fArray2[0], (float)fArray2[1], (float)fArray2[2], (float)fArray2[3]);
        ++this.x;
        ImGui.pushStyleColor((int)32, (float)fArray3[0], (float)fArray3[1], (float)fArray3[2], (float)fArray3[3]);
        ++this.x;
    }

    private void p() {
        this.a(0, 1.0f);
        this.a(2, 8.0f, 8.0f);
        this.a(3, 0.0f);
        this.a(4, 1.0f);
        this.a(5, 32.0f, 32.0f);
        this.a(6, 0.0f, 0.5f);
        this.a(7, 0.0f);
        this.a(8, 1.0f);
        this.a(9, 0.0f);
        this.a(10, 1.0f);
        this.a(11, 4.0f, 3.0f);
        this.a(12, 0.0f);
        this.a(13, 1.0f);
        this.a(14, 8.0f, 4.0f);
        this.a(15, 4.0f, 4.0f);
        this.a(17, 4.0f, 2.0f);
        this.a(16, 21.0f);
        this.a(18, 14.0f);
        this.a(19, 0.0f);
        this.a(20, 10.0f);
        this.a(21, 0.0f);
        this.a(22, 0.0f);
        this.a(23, 0.5f, 0.5f);
        this.a(24, 0.0f, 0.0f);
        this.a(0, 255, 255, 255, 1.0f);
        this.a(1, 127, 127, 127, 1.0f);
        this.a(2, 73, 86, 66, 1.0f);
        this.a(3, 73, 86, 66, 1.0f);
        this.a(4, 61, 68, 51, 1.0f);
        this.a(5, 137, 145, 130, 0.5f);
        this.a(6, 35, 40, 28, 0.52f);
        this.a(7, 61, 68, 51, 1.0f);
        this.a(8, 68, 76, 58, 1.0f);
        this.a(9, 76, 86, 66, 1.0f);
        this.a(10, 61, 68, 51, 1.0f);
        this.a(11, 73, 86, 66, 1.0f);
        this.a(12, 0, 0, 0, 0.51f);
        this.a(13, 61, 68, 51, 1.0f);
        this.a(14, 89, 107, 79, 1.0f);
        this.a(15, 71, 81, 61, 1.0f);
        this.a(16, 63, 76, 56, 1.0f);
        this.a(17, 58, 68, 53, 1.0f);
        this.a(18, 150, 137, 45, 1.0f);
        this.a(19, 89, 107, 79, 1.0f);
        this.a(20, 137, 145, 130, 0.5f);
        this.a(21, 73, 86, 66, 0.4f);
        this.a(22, 89, 107, 79, 1.0f);
        this.a(23, 137, 145, 130, 0.5f);
        this.a(24, 89, 107, 79, 1.0f);
        this.a(25, 89, 107, 79, 0.6f);
        this.a(26, 137, 145, 130, 0.5f);
        this.a(27, 35, 40, 28, 1.0f);
        this.a(28, 137, 145, 130, 1.0f);
        this.a(29, 150, 137, 45, 1.0f);
        this.a(30, 48, 58, 45, 0.0f);
        this.a(31, 137, 145, 130, 1.0f);
        this.a(32, 150, 137, 45, 1.0f);
        this.a(33, 89, 107, 79, 1.0f);
        this.a(34, 137, 145, 130, 0.78f);
        this.a(35, 150, 137, 45, 1.0f);
        this.a(36, 61, 68, 51, 1.0f);
        this.a(37, 89, 107, 79, 1.0f);
        this.a(40, 155, 155, 155, 1.0f);
        this.a(41, 150, 137, 45, 1.0f);
        this.a(42, 255, 198, 71, 1.0f);
        this.a(43, 255, 153, 0, 1.0f);
        this.a(44, 48, 48, 51, 1.0f);
        this.a(45, 79, 79, 89, 1.0f);
        this.a(46, 58, 58, 63, 1.0f);
        this.a(47, 0, 0, 0, 0.0f);
        this.a(48, 255, 255, 255, 0.06f);
        this.a(49, 150, 137, 45, 1.0f);
        this.a(50, 186, 170, 61, 1.0f);
        this.a(51, 150, 137, 45, 1.0f);
        this.a(52, 255, 255, 255, 0.7f);
        this.a(53, 204, 204, 204, 0.2f);
        this.a(54, 204, 204, 204, 0.35f);
    }

    private void g() {
        this.a(0, 1.0f);
        this.a(2, 8.0f, 8.0f);
        this.a(3, 0.0f);
        this.a(4, 1.0f);
        this.a(5, 32.0f, 32.0f);
        this.a(6, 0.0f, 0.5f);
        this.a(7, 0.0f);
        this.a(8, 1.0f);
        this.a(9, 0.0f);
        this.a(10, 1.0f);
        this.a(11, 4.0f, 3.0f);
        this.a(12, 0.0f);
        this.a(13, 0.0f);
        this.a(14, 8.0f, 4.0f);
        this.a(15, 4.0f, 4.0f);
        this.a(17, 4.0f, 2.0f);
        this.a(16, 21.0f);
        this.a(18, 14.0f);
        this.a(19, 0.0f);
        this.a(20, 10.0f);
        this.a(21, 0.0f);
        this.a(22, 0.0f);
        this.a(23, 0.5f, 0.5f);
        this.a(24, 0.0f, 0.0f);
        this.a(0, 255, 255, 255, 1.0f);
        this.a(1, 151, 151, 151, 1.0f);
        this.a(2, 37, 37, 38, 1.0f);
        this.a(3, 37, 37, 38, 1.0f);
        this.a(4, 37, 37, 38, 1.0f);
        this.a(5, 78, 78, 78, 1.0f);
        this.a(6, 78, 78, 78, 1.0f);
        this.a(7, 51, 51, 55, 1.0f);
        this.a(8, 29, 151, 236, 1.0f);
        this.a(9, 0, 119, 200, 1.0f);
        this.a(10, 37, 37, 38, 1.0f);
        this.a(11, 37, 37, 38, 1.0f);
        this.a(12, 37, 37, 38, 1.0f);
        this.a(13, 51, 51, 55, 1.0f);
        this.a(14, 51, 51, 55, 1.0f);
        this.a(15, 82, 82, 85, 1.0f);
        this.a(16, 90, 90, 95, 1.0f);
        this.a(17, 90, 90, 95, 1.0f);
        this.a(18, 0, 119, 200, 1.0f);
        this.a(19, 29, 151, 236, 1.0f);
        this.a(20, 0, 119, 200, 1.0f);
        this.a(21, 51, 51, 55, 1.0f);
        this.a(22, 29, 151, 236, 1.0f);
        this.a(23, 29, 151, 236, 1.0f);
        this.a(24, 51, 51, 55, 1.0f);
        this.a(25, 29, 151, 236, 1.0f);
        this.a(26, 0, 119, 200, 1.0f);
        this.a(27, 78, 78, 78, 1.0f);
        this.a(28, 78, 78, 78, 1.0f);
        this.a(29, 78, 78, 78, 1.0f);
        this.a(30, 37, 37, 38, 1.0f);
        this.a(31, 51, 51, 55, 1.0f);
        this.a(32, 82, 82, 85, 1.0f);
        this.a(33, 37, 37, 38, 1.0f);
        this.a(34, 29, 151, 236, 1.0f);
        this.a(35, 0, 119, 200, 1.0f);
        this.a(36, 37, 37, 38, 1.0f);
        this.a(37, 0, 119, 200, 1.0f);
        this.a(40, 0, 119, 200, 1.0f);
        this.a(41, 29, 151, 236, 1.0f);
        this.a(42, 0, 119, 200, 1.0f);
        this.a(43, 29, 151, 236, 1.0f);
        this.a(44, 48, 48, 51, 1.0f);
        this.a(45, 79, 79, 89, 1.0f);
        this.a(46, 58, 58, 63, 1.0f);
        this.a(47, 0, 0, 0, 0.0f);
        this.a(48, 255, 255, 255, 0.06f);
        this.a(49, 0, 119, 200, 1.0f);
        this.a(50, 37, 37, 38, 1.0f);
        this.a(51, 37, 37, 38, 1.0f);
        this.a(52, 255, 255, 255, 0.7f);
        this.a(53, 204, 204, 204, 0.2f);
        this.a(54, 37, 37, 38, 1.0f);
    }

    private void d() {
        this.a(0, 1.0f);
        this.a(2, 8.0f, 8.0f);
        this.a(3, 0.0f);
        this.a(4, 1.0f);
        this.a(5, 32.0f, 32.0f);
        this.a(6, 0.0f, 0.5f);
        this.a(7, 0.0f);
        this.a(8, 1.0f);
        this.a(9, 0.0f);
        this.a(10, 1.0f);
        this.a(11, 4.0f, 3.0f);
        this.a(12, 0.0f);
        this.a(13, 0.0f);
        this.a(14, 8.0f, 4.0f);
        this.a(15, 4.0f, 4.0f);
        this.a(17, 4.0f, 2.0f);
        this.a(16, 21.0f);
        this.a(18, 14.0f);
        this.a(19, 0.0f);
        this.a(20, 10.0f);
        this.a(21, 0.0f);
        this.a(22, 0.0f);
        this.a(23, 0.5f, 0.5f);
        this.a(24, 0.0f, 0.0f);
        this.a(0, 255, 255, 255, 1.0f);
        this.a(1, 127, 127, 127, 1.0f);
        this.a(2, 54, 57, 63, 1.0f);
        this.a(3, 47, 49, 54, 1.0f);
        this.a(4, 20, 20, 20, 0.94f);
        this.a(5, 109, 109, 127, 0.5f);
        this.a(6, 0, 0, 0, 0.0f);
        this.a(7, 79, 84, 92, 1.0f);
        this.a(8, 79, 84, 92, 1.0f);
        this.a(9, 88, 101, 242, 1.0f);
        this.a(10, 47, 49, 54, 1.0f);
        this.a(11, 32, 34, 37, 1.0f);
        this.a(12, 32, 34, 37, 1.0f);
        this.a(13, 32, 34, 37, 1.0f);
        this.a(14, 5, 5, 5, 0.53f);
        this.a(15, 79, 79, 79, 1.0f);
        this.a(16, 104, 104, 104, 1.0f);
        this.a(17, 130, 130, 130, 1.0f);
        this.a(18, 59, 165, 93, 1.0f);
        this.a(19, 255, 255, 255, 1.0f);
        this.a(20, 255, 255, 255, 1.0f);
        this.a(21, 79, 84, 92, 1.0f);
        this.a(22, 104, 109, 115, 1.0f);
        this.a(23, 32, 34, 37, 1.0f);
        this.a(24, 79, 84, 92, 1.0f);
        this.a(25, 104, 109, 115, 1.0f);
        this.a(26, 104, 109, 115, 1.0f);
        this.a(27, 109, 109, 127, 0.5f);
        this.a(28, 25, 102, 191, 0.78f);
        this.a(29, 25, 102, 191, 1.0f);
        this.a(30, 66, 150, 249, 0.2f);
        this.a(31, 66, 150, 249, 0.67f);
        this.a(32, 66, 150, 249, 0.95f);
        this.a(33, 47, 49, 54, 1.0f);
        this.a(34, 60, 63, 69, 1.0f);
        this.a(35, 66, 70, 77, 1.0f);
        this.a(36, 17, 26, 37, 0.97f);
        this.a(37, 34, 66, 108, 1.0f);
        this.a(40, 155, 155, 155, 1.0f);
        this.a(41, 88, 101, 242, 1.0f);
        this.a(42, 88, 101, 242, 1.0f);
        this.a(43, 92, 102, 109, 1.0f);
        this.a(44, 48, 48, 51, 1.0f);
        this.a(45, 79, 79, 89, 1.0f);
        this.a(46, 58, 58, 63, 1.0f);
        this.a(47, 0, 0, 0, 0.0f);
        this.a(48, 255, 255, 255, 0.06f);
        this.a(49, 13, 107, 219, 1.0f);
        this.a(50, 88, 101, 242, 1.0f);
        this.a(51, 66, 150, 249, 1.0f);
        this.a(52, 255, 255, 255, 0.7f);
        this.a(53, 204, 204, 204, 0.2f);
        this.a(54, 204, 204, 204, 0.35f);
    }

    private static int lambda$drawModules$0(lh lh2, lh lh3) {
        return lh2.f().compareToIgnoreCase(lh3.f());
    }




    static {
        block11: {
            block10: {
                pj.C = _c.a((long)-7760338853595727148L, (long)6681976110720345812L, MethodHandles.lookup().lookupClass()).a(271103625021184L);
                pj.F = new HashMap<K, V>(13);
                var0 = pj.C ^ 135254372673191L;
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
                var9_3 = new String[25];
                var7_4 = 0;
                var6_5 = "\u00f8\u00bf\u00f6\u00fc\u0005\u008b\u00d4\u00b8\u00c8\u00c92\u00b6\u001c\u00ef3'\u0010}\u00da\u00f2\u0081\u00d76D\u001e]Z\u00af\u00ba\u007f\u0087Y\u0003\u0010~O\u0098\u00c7P\u00fa>T^0\u001b\u00b7\u0005\f\"\u0019\u0010x\u0019\u00cbQ\u0086\u0010\u00fc\u00ab\u00e3\u00d0\u00b0\u00c7\u000b\u00e4b9@\u00a8U4\u00fb\u0018\u00ce\u00e2$G{\u008b\u001aK\u00f5\u0083\u0093C\u0093h\u0098\u00ca\u00e1\u009b\u008f\u00b5:\u00f1\u00fez\u00f5~\u00eeL)t\u009e\n\u00fa\u009bL\u00a1\u009e-h\u00ea!\u0012E\u00814\u0088\r\u00c9\u00fc\u00ba\u0006u\u00ae\u00d8`!r\u00d7;\u0018\u001ab2\u0004\u001d\u0004M\u00bdb!\u00eb\u0094\u00a3\u00f6>\u00ac\u00e6D`\u0086\u00b7^\u008a\u00ff \u0092.\u0084q\u00f0\u00e57t\u00e5\u0013\u0014\u0099\u00f2Xf\u00b2\u00b1\u00ce\u0012D\u00be\u00ce\u00f9.\u00a5\u00d1\u00b7\u0098*cx\u00d9\u0010\u00d3@Y5nV\u00ce\u00aa\u0014\u00ec\u00989\u00cbC\u00cf\u00c7\u0010\u00fam\u0000 \u00d4\u00b1V\u00a9-)\u008f\u0085\u009f\u0011\u00d1O\u0010\u00be\u0081\u00c2f&`\u00b5\u00dc\u0005\u00be\u00e0\"\u0082\u00df\u00fa\u00b2\u0010y\u0011\u00ecxH\u00bb1\n\u00e2i\u00be\r\u008f\u00fb\u00b4g \u00b26\u00f6\u00e7\u00f9\u00d7\u009b\u001e\u00a1\u00c2\u00c9L\u008a\u0006Rp\u00d1\u00ce\u0096\u00ec\u00e6\u00d7jL\u00f8\u00fe\u00da\u00d3\u008a!\u0017\u0083\u0010\u00c3\u00e7\u0092)\u00b0)5\u00aa\r\u00bfc]\u00f9z!o\u0010\u00e5\u00c4\u0098&\u00e4b\u0007Kml\u00a4\u00f1\u00c4w\u00c4=\u0010\"\u001e\u00df\u00da\u00ed,\u00b1\u00920p\u0081]r\u00d7#P\u0010\u001b\u00f1RP\u00be.\u00caS\u0085B\u00acY\u00ec\u00d0Qd\u0010\r\u00ad\u0083\u0086Z\u0091\u009b\u0010o\u00df_\u0082\u0086\u00e2zB\u0010\u00b6,\u00fb\u0016\u009d\u00d8{\u00db\u00e1\u00c0>\u00d8P\u000b$\u00d5\u00189,3R]j&\"\u000f\u0080V|\u00b1\u00d6:\u00e1\u00a7\u0081\u009e\u009b@{\u0092\u009b\u0010\u00cd\u0005?\u00b1\u00d2\u000b.\u00c2\u00e8\t\u00f2x\u00a0\u00a3\u009b\u00ee\u0010\u00ba\u00f4#QK3\u0000\u008d\u00a3>\u001bjC\u00a5\u00bf\u00dd\u0010\u00ca\u00cb\u0080\u0087\u0000\u00d6\u009a\u00afk\u0001@kB&rc\u0010\u0017H\u00da\u00eaS\u00b4\"\u0080\u00a1\u00c4Q\u0084\u00cbr\u00d1\u00f2";
                var8_6 = "\u00f8\u00bf\u00f6\u00fc\u0005\u008b\u00d4\u00b8\u00c8\u00c92\u00b6\u001c\u00ef3'\u0010}\u00da\u00f2\u0081\u00d76D\u001e]Z\u00af\u00ba\u007f\u0087Y\u0003\u0010~O\u0098\u00c7P\u00fa>T^0\u001b\u00b7\u0005\f\"\u0019\u0010x\u0019\u00cbQ\u0086\u0010\u00fc\u00ab\u00e3\u00d0\u00b0\u00c7\u000b\u00e4b9@\u00a8U4\u00fb\u0018\u00ce\u00e2$G{\u008b\u001aK\u00f5\u0083\u0093C\u0093h\u0098\u00ca\u00e1\u009b\u008f\u00b5:\u00f1\u00fez\u00f5~\u00eeL)t\u009e\n\u00fa\u009bL\u00a1\u009e-h\u00ea!\u0012E\u00814\u0088\r\u00c9\u00fc\u00ba\u0006u\u00ae\u00d8`!r\u00d7;\u0018\u001ab2\u0004\u001d\u0004M\u00bdb!\u00eb\u0094\u00a3\u00f6>\u00ac\u00e6D`\u0086\u00b7^\u008a\u00ff \u0092.\u0084q\u00f0\u00e57t\u00e5\u0013\u0014\u0099\u00f2Xf\u00b2\u00b1\u00ce\u0012D\u00be\u00ce\u00f9.\u00a5\u00d1\u00b7\u0098*cx\u00d9\u0010\u00d3@Y5nV\u00ce\u00aa\u0014\u00ec\u00989\u00cbC\u00cf\u00c7\u0010\u00fam\u0000 \u00d4\u00b1V\u00a9-)\u008f\u0085\u009f\u0011\u00d1O\u0010\u00be\u0081\u00c2f&`\u00b5\u00dc\u0005\u00be\u00e0\"\u0082\u00df\u00fa\u00b2\u0010y\u0011\u00ecxH\u00bb1\n\u00e2i\u00be\r\u008f\u00fb\u00b4g \u00b26\u00f6\u00e7\u00f9\u00d7\u009b\u001e\u00a1\u00c2\u00c9L\u008a\u0006Rp\u00d1\u00ce\u0096\u00ec\u00e6\u00d7jL\u00f8\u00fe\u00da\u00d3\u008a!\u0017\u0083\u0010\u00c3\u00e7\u0092)\u00b0)5\u00aa\r\u00bfc]\u00f9z!o\u0010\u00e5\u00c4\u0098&\u00e4b\u0007Kml\u00a4\u00f1\u00c4w\u00c4=\u0010\"\u001e\u00df\u00da\u00ed,\u00b1\u00920p\u0081]r\u00d7#P\u0010\u001b\u00f1RP\u00be.\u00caS\u0085B\u00acY\u00ec\u00d0Qd\u0010\r\u00ad\u0083\u0086Z\u0091\u009b\u0010o\u00df_\u0082\u0086\u00e2zB\u0010\u00b6,\u00fb\u0016\u009d\u00d8{\u00db\u00e1\u00c0>\u00d8P\u000b$\u00d5\u00189,3R]j&\"\u000f\u0080V|\u00b1\u00d6:\u00e1\u00a7\u0081\u009e\u009b@{\u0092\u009b\u0010\u00cd\u0005?\u00b1\u00d2\u000b.\u00c2\u00e8\t\u00f2x\u00a0\u00a3\u009b\u00ee\u0010\u00ba\u00f4#QK3\u0000\u008d\u00a3>\u001bjC\u00a5\u00bf\u00dd\u0010\u00ca\u00cb\u0080\u0087\u0000\u00d6\u009a\u00afk\u0001@kB&rc\u0010\u0017H\u00da\u00eaS\u00b4\"\u0080\u00a1\u00c4Q\u0084\u00cbr\u00d1\u00f2".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = pj.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "k\u00d7\u00b1\u00b5\u0097<\u0010\u00b5\u0019\u00d2\u00f4X\u00bep\u00be?%kOc\u0098\u0090'\u0085\u0018\u00fa]M\u000b\u00d0Zs\u000bz\n\u00e6\u00b4\u008bu\u00d6\u00b6\u001e{4\u00dc;\n\u008br";
                    var8_6 = "k\u00d7\u00b1\u00b5\u0097<\u0010\u00b5\u0019\u00d2\u00f4X\u00bep\u00be?%kOc\u0098\u0090'\u0085\u0018\u00fa]M\u000b\u00d0Zs\u000bz\n\u00e6\u00b4\u008bu\u00d6\u00b6\u001e{4\u00dc;\n\u008br".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = pj.a(var10_9).intern();
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
        pj.D = var9_3;
        pj.E = new String[25];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D54;
        if (E[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])F.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    F.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("pj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = D[n2].getBytes("ISO-8859-1");
            pj.E[n2] = pj.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return E[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = pj.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("pj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(pj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

