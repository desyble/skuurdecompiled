import imgui.ImColor;
import imgui.ImDrawList;
import imgui.ImGui;
import java.awt.image.BufferedImage;

public class zS {
    public static void a(double d, double d2, double d3, double d4, int n) {
        float f = (float)Math.min(d *= 2.0, d3 *= 2.0);
        float f2 = (float)Math.max(d, d3);
        float f3 = (float)Math.min(d2 *= 2.0, d4 *= 2.0);
        float f4 = (float)Math.max(d2, d4);
        int n2 = zS.a(n);
        ImGui.getBackgroundDrawList().addRectFilled(f, f3, f2, f4, n2);
    }

    public static void a(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        float f = (float)Math.min(d *= 2.0, d3 *= 2.0);
        float f2 = (float)Math.max(d, d3);
        float f3 = (float)Math.min(d2 *= 2.0, d4 *= 2.0);
        float f4 = (float)Math.max(d2, d4);
        float f5 = (float)(d5 *= 2.0);
        int n3 = zS.a(n);
        int n4 = zS.a(n2);
        ImDrawList imDrawList = ImGui.getBackgroundDrawList();
        imDrawList.addRectFilled(f + f5, f3 + f5, f2 - f5, f4 - f5, n3);
        imDrawList.addRectFilled(f + f5, f3, f2 - f5, f3 + f5, n4);
        imDrawList.addRectFilled(f, f3, f + f5, f4, n4);
        imDrawList.addRectFilled(f2 - f5, f3, f2, f4, n4);
        imDrawList.addRectFilled(f + f5, f4 - f5, f2 - f5, f4, n4);
    }

    public static void a(float f, float f2, float f3, int n) {
        LQ lQ;
        block5: {
            LQ lQ2;
            block6: {
                lQ2 = Hk.a().d(n);
                LQ[] lQArray = hV.c();
                try {
                    try {
                        lQ = lQ2;
                        if (lQArray == null) break block5;
                        if (lQ instanceof MA) break block6;
                    }
                    catch (H h) {
                        throw zS.a(h);
                    }
                    return;
                }
                catch (H h) {
                    throw zS.a(h);
                }
            }
            lQ = lQ2;
        }
        MA mA = (MA)lQ;
        f *= 2.0f;
        f2 *= 2.0f;
        f3 *= 2.0f;
        int n2 = Hk.b().aa().a(mA.d()).c();
        ImDrawList imDrawList = ImGui.getBackgroundDrawList();
        float f4 = ImGui.getStyle().getAlpha();
        int n3 = (int)(f4 * 255.0f);
        int n4 = ImColor.intToColor((int)255, (int)255, (int)255, (int)n3);
        float f5 = 0.125f;
        float f6 = 0.125f;
        float f7 = 0.25f;
        float f8 = 0.25f;
        imDrawList.addImage(n2, f, f2, f + f3, f2 + f3, f5, f6, f7, f8, n4);
        if (mA.a(Oj.HAT)) {
            float f9 = 0.625f;
            float f10 = 0.125f;
            float f11 = 0.75f;
            float f12 = 0.25f;
            imDrawList.addImage(n2, f, f2, f + f3, f2 + f3, f9, f10, f11, f12, n4);
        }
    }

    public static void a(float f, float f2, float f3, int n, float f4) {
        block4: {
            block5: {
                LQ[] lQArray = hV.c();
                try {
                    try {
                        if (lQArray == null) break block4;
                        if (n != -1) break block5;
                    }
                    catch (H h) {
                        throw zS.a(h);
                    }
                    return;
                }
                catch (H h) {
                    throw zS.a(h);
                }
            }
            f *= 2.0f;
            f2 *= 2.0f;
            f3 *= 2.0f;
        }
        ImDrawList imDrawList = ImGui.getBackgroundDrawList();
        float f5 = ImGui.getStyle().getAlpha();
        int n2 = (int)(f5 * 255.0f);
        int n3 = ImColor.intToColor((int)255, (int)255, (int)255, (int)n2);
        imDrawList.addImage(n, f, f2, f + f3, f2 + f3, 0.0f, 0.0f, 1.0f, 1.0f, n3);
    }




    public static int a(BufferedImage var0, boolean var1_1) {
        block21: {
            block19: {
                block20: {
                    var2_2 = hV.c();
                    try {
                        try {
                            v0 = var0;
                            if (var2_2 == null) break block19;
                            if (v0 != null) break block20;
                        }
                        catch (H v1) {
                            throw zS.a(v1);
                        }
                        return -1;
                    }
                    catch (H v2) {
                        throw zS.a(v2);
                    }
                }
                v0 = new BufferedImage(8, 8, 2);
            }
            var3_3 = v0;
            var4_4 = 0;
            block14: while (true) {
                v3 = var4_4;
                block15: while (v3 < 8) {
                    v4 = 0;
                    if (var2_2 == null) break block21;
                    for (var5_5 = v11317000; var5_5 < 8; ++var5_5) {
                        block23: {
                            block22: {
                                var6_6 = var0.getRGB(var4_4 + 8, var5_5 + 8);
                                v3 = (int)var1_1;
                                if (var2_2 == null) continue block15;
                                try {
                                    try {
                                        try {
                                            if (var2_2 == null) break block22;
                                            if (v3 != 0) {
                                            }
                                            ** GOTO lbl58
                                        }
                                        catch (H v5) {
                                            throw zS.a(v5);
                                        }
                                        v6 = var0;
                                        v7 = var4_4 + 40;
                                        v8 = var5_5 + 8;
                                        if (var2_2 == null) break block23;
                                    }
                                    catch (H v9) {
                                        throw zS.a(v9);
                                    }
                                    v10 = v6.getRGB(v7, v8);
                                }
                                catch (H v11) {
                                    throw zS.a(v11);
                                }
                            }
                            var7_7 = v10;
                            var8_8 = var7_7 >> 24 & 255;
                            try {
                                try {
                                    if (var8_8 > 0) {
                                        var3_3.setRGB(var4_4, var5_5, (int)var7_7);
                                        if (var2_2 != null) continue;
                                    }
                                }
                                catch (H v12) {
                                    throw zS.a(v12);
                                }
lbl58:


                                v6 = var3_3;
                                v7 = var4_4;
                                v8 = var5_5;
                            }
                            catch (H v13) {
                                throw zS.a(v13);
                            }
                        }
                        v6.setRGB(v7, v8, var6_6);
                        if (var2_2 != null) continue;
                    }
                    ++var4_4;
                    if (var2_2 != null) continue block14;
                }
                break;
            }
            var4_4 = hE.a();
            hE.a((int)var4_4, (BufferedImage)var3_3, (boolean)false, (boolean)false);
            v4 = var4_4;
        }
        return v4;
    }

    public static void a(double d, double d2, double d3, double d4, float f, int n) {
        float f2 = (float)(d *= 2.0);
        float f3 = (float)(d2 *= 2.0);
        LQ[] lQArray = hV.c();
        float f4 = (float)(d + (d3 *= 2.0));
        float f5 = (float)(d2 + (d4 *= 2.0));
        float f6 = (f2 + f4) / 2.0f;
        float f7 = (f3 + f5) / 2.0f;
        float f8 = f6 - (f6 - f2) * f;
        float f9 = f6 + (f4 - f6) * f;
        int n2 = zS.a(n);
        int n3 = zS.a(n & 0xFFFFFF);
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n >> 24 & 0xFF;
        int n8 = n7 << 24 | n4 / 2 << 16 | n5 / 2 << 8 | n6 / 2;
        int n9 = zS.a(n8);
        int n10 = zS.a(n8 & 0xFFFFFF);
        ImDrawList imDrawList = ImGui.getBackgroundDrawList();
        try {
            imDrawList.addRectFilledMultiColor(f8, f3, f6, f7, (long)n3, (long)n2, (long)n2, (long)n3);
            imDrawList.addRectFilledMultiColor(f6, f3, f9, f7, (long)n2, (long)n3, (long)n3, (long)n2);
            imDrawList.addRectFilledMultiColor(f2, f3, f8, f7, (long)n3, (long)n3, (long)n3, (long)n3);
            imDrawList.addRectFilledMultiColor(f9, f3, f4, f7, (long)n3, (long)n3, (long)n3, (long)n3);
            imDrawList.addRectFilledMultiColor(f8, f7, f6, f5, (long)n10, (long)n9, (long)n9, (long)n10);
            imDrawList.addRectFilledMultiColor(f6, f7, f9, f5, (long)n9, (long)n10, (long)n10, (long)n9);
            imDrawList.addRectFilledMultiColor(f2, f7, f8, f5, (long)n10, (long)n10, (long)n10, (long)n10);
            imDrawList.addRectFilledMultiColor(f9, f7, f4, f5, (long)n10, (long)n10, (long)n10, (long)n10);
            if (lQArray == null) {
                LQ.b((LQ[])new LQ[1]);
            }
        }
        catch (H h) {
            throw zS.a(h);
        }
    }

    public static void b(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        int n3;
        int n4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        block11: {
            block12: {
                float f6;
                LQ[] lQArray;
                block13: {
                    block10: {
                        float f7;
                        float f8;
                        block9: {
                            d4 *= 2.0;
                            d5 *= 2.0;
                            f5 = (float)(d *= 2.0);
                            f4 = (float)(d2 *= 2.0);
                            f3 = (float)(d3 *= 2.0);
                            lQArray = hV.c();
                            f2 = (float)d4;
                            float f9 = (float)d5;
                            try {
                                try {
                                    f8 = f9;
                                    f7 = 0.0f;
                                    if (lQArray == null) break block9;
                                    if (!(f8 > f7)) break block10;
                                }
                                catch (H h) {
                                    throw zS.a(h);
                                }
                                f8 = f3 - f5;
                                f7 = f9;
                            }
                            catch (H h) {
                                throw zS.a(h);
                            }
                        }
                        f6 = f8 / f7;
                        break block13;
                    }
                    f6 = 1.0f;
                }
                f = f6;
                f = Math.max(0.0f, Math.min(1.0f, f));
                n4 = n >> 24 & 0xFF;
                try {
                    n3 = n4;
                    if (lQArray == null) break block11;
                    if (n3 != 0) break block12;
                }
                catch (H h) {
                    throw zS.a(h);
                }
                n4 = 255;
            }
            n3 = n >> 16 & 0xFF;
        }
        int n5 = n3;
        int n6 = n >> 8 & 0xFF;
        int n7 = n & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = (int)((float)n5 + (float)(n8 - n5) * f);
        int n12 = (int)((float)n6 + (float)(n9 - n6) * f);
        int n13 = (int)((float)n7 + (float)(n10 - n7) * f);
        int n14 = n4 << 24 | n11 << 16 | n12 << 8 | n13;
        try {
            ImGui.getBackgroundDrawList().addRectFilledMultiColor(f5, f4, f3, f2, (long)zS.a(n), (long)zS.a(n14), (long)zS.a(n14), (long)zS.a(n));
            if (LQ.J() != null) {
                hV.b((LQ[])new LQ[4]);
            }
        }
        catch (H h) {
            throw zS.a(h);
        }
    }

    public static int a(int n) {
        float f = ImGui.getStyle().getAlpha();
        int n2 = n >> 24 & 0xFF;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        n2 = (int)((float)n2 * f);
        return n2 << 24 | n5 << 16 | n4 << 8 | n3;
    }

    private static H a(H h) {
        return h;
    }
}
