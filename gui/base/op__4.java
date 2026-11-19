import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import tv.twitch.chat.ChatUserInfo;

public abstract class op
extends o9
implements zj {
    private static final Logger k;
    private static final Set<String> v;
    private static final Splitter h;
    protected cD i;
    protected Om u;
    public int l;
    public int r;
    protected List<o_> m = Lists.newArrayList();
    protected List<oH> n = Lists.newArrayList();
    public boolean p;
    protected DB t;
    private o_ q;
    protected int f;
    public long g;
    public int j;
    private URI s;
    private static String[] o;
    private static final long db;
    private static final String[] gb;
    private static final String[] hb;
    private static final Map ib;






    public void a(short s, int n, int n2, long l, float f) {
        int[] nArray;
        int n3;
        block7: {
            long l2 = (long)s << 48 | l << 16 >>> 16;
            long l3 = l2 ^ 0x4F3422393119L;
            int n4 = (int)(l3 >>> 48);
            int n5 = (int)(l3 << 16 >>> 32);
            int n6 = (int)(l3 << 48 >>> 48);
            n3 = 0;
            nArray = o9.b();
            block4: while (n3 < this.m.size()) {
                try {
                    this.m.get(n3).c((short)n4, n5, this.i, n, n2, n6);
                    ++n3;
                    while (l > 0L && nArray == null) {
                        if (nArray == null) continue block4;
                        if (l < 0L) continue;
                        break block4;
                    }
                    break block7;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
            }
            n3 = 0;
        }
        try {
            do {
                if (s < 0) continue;
                if (n3 >= this.n.size()) return;
                this.n.get(n3).a(this.i, n, n2);
                ++n3;
            } while (nArray == null || l <= 0L);
            return;
        }
        catch (H h) {
            throw op.b((Exception)((Object)h));
        }
    }

    protected void a(char c, char c2, char c3, int n, int n2) {
        block7: {
            cD cD2;
            block8: {
                op op2;
                block9: {
                    int[] nArray;
                    block6: {
                        long l = (long)c2 << 48 | (long)c3 << 48 >>> 16 | (long)n2 << 32 >>> 32;
                        long l2 = l ^ 0x6992CD3502A4L;
                        int n3 = (int)(l2 >>> 32);
                        long l3 = l2 << 32 >>> 32;
                        nArray = o9.b();
                        try {
                            try {
                                if (nArray != null) break block6;
                                if (n != 1) break block7;
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                            this.i.a((op)null, n3, l3);
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                    }
                    try {
                        cD2 = this.i;
                        if (c3 < '\u0000') break block8;
                        op2 = cD2.H;
                        if (nArray != null) break block9;
                        if (op2 != null) break block7;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    op2 = this;
                }
                cD2 = op2.i;
            }
            cD2.aj();
        }
    }




    public static String d() {
        block9: {
            int[] nArray = o9.b();
            try {
                DataFlavor dataFlavor;
                Transferable transferable;
                block10: {
                    Transferable transferable2;
                    block8: {
                        transferable2 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
                        try {
                            transferable = transferable2;
                            if (nArray != null) break block8;
                            if (transferable == null) break block9;
                        }
                        catch (Exception exception) {
                            throw op.b(exception);
                        }
                        transferable = transferable2;
                    }
                    dataFlavor = DataFlavor.stringFlavor;
                    if (nArray != null) break block10;
                    try {
                        block11: {
                            if (!transferable.isDataFlavorSupported(dataFlavor)) break block9;
                            break block11;
                            catch (Exception exception) {
                                throw op.b(exception);
                            }
                        }
                        transferable = transferable2;
                        dataFlavor = DataFlavor.stringFlavor;
                    }
                    catch (Exception exception) {
                        throw op.b(exception);
                    }
                }
                return (String)transferable.getTransferData(dataFlavor);
            }
            catch (Exception exception) {

            }
        }
        return "";
    }

    public static void d(String string) {
        if (!StringUtils.isEmpty((CharSequence)string)) {
            try {
                StringSelection stringSelection = new StringSelection(string);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            }
            catch (Exception exception) {

            }
        }
    }




    protected void a(qP var1_1, int var2_2, short var3_3, short var4_4, int var5_5, int var6_6) {























        throw new IllegalStateException("Decompilation failed");
    }

    protected void a(int n, String string, int n2, int n3, int n4) {
        long l = (long)n << 32 | (long)n4 << 32 >>> 32;
        long l2 = l ^ 0x398842F75965L;
        int n5 = (int)(l2 >>> 48);
        int n6 = (int)(l2 << 16 >>> 32);
        int n7 = (int)(l2 << 48 >>> 48);
        this.a((char)n5, n6, Arrays.asList(string), n2, (short)n7, n3);
    }





    protected void a(char var1_1, int var2_2, List var3_3, int var4_4, short var5_5, int var6_6) {
























        throw new IllegalStateException("Decompilation failed");
    }




    protected void a(short var1_1, FG var2_2, int var3_3, int var4_4, char var5_5, int var6_6) {
        block60: {
            block66: {
                block76: {
                    block77: {
                        block82: {
                            block75: {
                                block74: {
                                    block73: {
                                        block72: {
                                            block70: {
                                                block67: {
                                                    block62: {
                                                        block65: {
                                                            block64: {
                                                                block61: {
                                                                    block59: {
                                                                        v0 = var7_7 = ((long)var1_1 << 48 | (long)var5_5 << 48 >>> 16 | (long)var6_6 << 32 >>> 32) ^ op.db;
                                                                        v1 = v0 ^ 123022354006365L;
                                                                        var9_8 = (int)(v1 >>> 32);
                                                                        var10_9 = (int)(v1 << 32 >>> 32);
                                                                        v2 = v0 ^ 91418047933102L;
                                                                        var11_10 = (int)(v2 >>> 56);
                                                                        var12_11 = (int)(v2 << 8 >>> 32);
                                                                        var13_12 = (int)(v2 << 40 >>> 40);
                                                                        v3 = v0 ^ 137334523260481L;
                                                                        var14_13 = (int)(v3 >>> 32);
                                                                        var15_14 = (int)(v3 << 32 >>> 48);
                                                                        var16_15 = (int)(v3 << 48 >>> 48);
                                                                        v4 = v0 ^ 67975191702666L;
                                                                        var17_16 = (int)(v4 >>> 32);
                                                                        var18_17 = (int)(v4 << 32 >>> 48);
                                                                        var19_18 = (int)(v4 << 48 >>> 48);
                                                                        v5 = v0 ^ 140192805931895L;
                                                                        var20_19 = (int)(v5 >>> 32);
                                                                        var21_20 = (int)(v5 << 32 >>> 48);
                                                                        var22_21 = (int)(v5 << 48 >>> 48);
                                                                        v6 = v0 ^ 124233045771871L;
                                                                        var23_22 = v6 >>> 8;
                                                                        var25_23 = (int)(v6 << 56 >>> 56);
                                                                        v7 = v0 ^ 95018052393016L;
                                                                        var26_24 = (int)(v7 >>> 48);
                                                                        var27_25 = (int)(v7 << 16 >>> 32);
                                                                        var28_26 = (int)(v7 << 48 >>> 48);
                                                                        v8 = v0 ^ 110132159202677L;
                                                                        var29_27 = (int)(v8 >>> 32);
                                                                        var30_28 = (int)(v8 << 32 >>> 32);
                                                                        v9 = v0 ^ 116062944838029L;
                                                                        var31_29 = (int)(v9 >>> 32);
                                                                        var32_30 = (int)(v9 << 32 >>> 48);
                                                                        var33_31 = (int)(v9 << 48 >>> 48);
                                                                        var34_32 = o9.b();
                                                                        try {
                                                                            v10 = var2_2;
                                                                            if (var34_32 != null) break block59;
                                                                            if (v10 == null) break block60;
                                                                        }
                                                                        catch (Eq v11) {
                                                                            throw op.b((Exception)v11);
                                                                        }
                                                                        v10 = var2_2;
                                                                    }
                                                                    v12 = v10.b().c(var20_19, var21_20, var22_21);
                                                                    if (var34_32 != null) break block61;
                                                                    try {
                                                                        block78: {
                                                                            if (v12 == null) break block60;
                                                                            break block78;
                                                                            catch (Eq v13) {
                                                                                throw op.b((Exception)v13);
                                                                            }
                                                                        }
                                                                        v12 = var2_2.b().c(var20_19, var21_20, var22_21);
                                                                    }
                                                                    catch (Eq v14) {
                                                                        throw op.b((Exception)v14);
                                                                    }
                                                                }
                                                                var35_33 = v12;
                                                                try {
                                                                    v15 = var35_33.a();
                                                                    v16 = h8.SHOW_ITEM;
                                                                    v17 = var34_32;
                                                                    if (var1_1 < 0) ** GOTO lbl131
                                                                    if (v17 != null) break block62;
                                                                    if (v15 == v16) {
                                                                    }
                                                                    ** GOTO lbl123
                                                                }
                                                                catch (Eq v18) {
                                                                    throw op.b((Exception)v18);
                                                                }
                                                                var36_34 = null;
                                                                try {
                                                                    block63: {
                                                                        var37_36 = nN.a((int)var17_16, (char)((char)var18_17), (int)var19_18, (String)var35_33.b().f(var23_22, (byte)var25_23));
                                                                        v19 = var37_36;
                                                                        if (var34_32 != null) break block63;
                                                                        try {
                                                                            block79: {
                                                                                if (!(v19 instanceof jT)) break block64;
                                                                                break block79;
                                                                                catch (Eq v20) {
                                                                                    throw op.b((Exception)v20);
                                                                                }
                                                                            }
                                                                            v19 = (jT)var37_36;
                                                                        }
                                                                        catch (Eq v21) {
                                                                            throw op.b((Exception)v21);
                                                                        }
                                                                    }
                                                                    var36_34 = qP.c((jT)v19, (int)var14_13, (char)((char)var15_14), (char)((char)var16_15));
                                                                }
                                                                catch (Eq var37_37) {

                                                                }
                                                            }
                                                            if (var6_6 < 0) break block65;
                                                            if (var36_34 == null) ** GOTO lbl114
                                                            try {
                                                                block80: {
                                                                    this.a((qP)var36_34, var31_29, (short)var32_30, (short)var33_31, var3_3, var4_4);
                                                                    v22 = var34_32;
                                                                    if (var5_5 < '\u0000') ** GOTO lbl122
                                                                    if (v22 == null) break block65;
                                                                    break block80;
                                                                    catch (Eq v23) {
                                                                        throw op.b((Exception)v23);
                                                                    }
                                                                }
                                                                this.a(var9_8, mu.RED + (String)op.a("a", (int)26496, (long)(8916939014640124273L ^ var7_7)), var3_3, var4_4, var10_9);
                                                            }
                                                            catch (Eq v24) {
                                                                throw op.b((Exception)v24);
                                                            }
                                                        }
                                                        try {
                                                            v22 = var34_32;
lbl122:


                                                            if (v22 == null) break block66;
lbl123:


                                                            v15 = var35_33.a();
                                                            v16 = h8.SHOW_ENTITY;
                                                        }
                                                        catch (Eq v25) {
                                                            throw op.b((Exception)v25);
                                                        }
                                                    }
                                                    v17 = var34_32;
lbl131:


                                                    if (var6_6 <= 0) ** GOTO lbl186
                                                    if (v17 != null) break block67;
                                                    try {
                                                        block81: {
                                                            if (v15 != v16) ** GOTO lbl175
                                                            break block81;
                                                            catch (Eq v26) {
                                                                throw op.b((Exception)v26);
                                                            }
                                                        }
                                                        if (!this.i.i.b6) break block66;
                                                    }
                                                    catch (Eq v27) {
                                                        throw op.b((Exception)v27);
                                                    }
                                                    try {
                                                        block68: {
                                                            block69: {
                                                                var36_34 = nN.a((int)var17_16, (char)((char)var18_17), (int)var19_18, (String)var35_33.b().f(var23_22, (byte)var25_23));
                                                                if (var6_6 <= 0) break block66;
                                                                if (!(var36_34 instanceof jT)) ** GOTO lbl167
                                                                var37_36 = Lists.newArrayList();
                                                                var38_38 = (jT)var36_34;
                                                                try {
                                                                    var37_36.add(var38_38.d((String)op.a("a", (int)12660, (long)(940273596940359580L ^ var7_7))));
                                                                    v28 = var38_38.b((String)op.a("a", (int)19548, (long)(1096086008973453995L ^ var7_7)), 8);
                                                                    if (var1_1 < 0 || var34_32 != null) break block68;
                                                                    if (!v28) break block69;
                                                                }
                                                                catch (Eq v29) {
                                                                    throw op.b((Exception)v29);
                                                                }
                                                                var39_40 = var38_38.d((String)op.a("a", (int)5120, (long)(2755572112864359146L ^ var7_7)));
                                                                var37_36.add((String)op.a("a", (int)9436, (long)(7116300507782808106L ^ var7_7)) + var39_40 + (String)op.a("a", (int)17403, (long)(1656563745434789143L ^ var7_7)) + I6.b((String)var39_40) + ")");
                                                            }
                                                            v28 = var37_36.add(var38_38.d((String)op.a("a", (int)25243, (long)(3354430421249770622L ^ var7_7))));
                                                        }
                                                        try {
                                                            this.a((char)var26_24, var27_25, (List)var37_36, var3_3, (short)var28_26, var4_4);
                                                            if (var6_6 <= 0 || var34_32 == null) break block66;
lbl167:


                                                            this.a(var9_8, mu.RED + (String)op.a("a", (int)4223, (long)(2412248531758364316L ^ var7_7)), var3_3, var4_4, var10_9);
                                                            break block66;
                                                        }
                                                        catch (Eq v30) {
                                                            throw op.b((Exception)v30);
                                                        }
                                                    }
                                                    catch (Eq var36_35) {
                                                        try {
                                                            this.a(var9_8, mu.RED + (String)op.a("a", (int)8311, (long)(6547721155750889091L ^ var7_7)), var3_3, var4_4, var10_9);
                                                            if (var34_32 == null) break block66;
lbl175:


                                                            v15 = var35_33.a();
                                                            v16 = h8.SHOW_TEXT;
                                                        }
                                                        catch (Eq v31) {
                                                            throw op.b((Exception)v31);
                                                        }
                                                    }
                                                }
                                                try {
                                                    try {
                                                        block71: {
                                                            try {
                                                                try {
                                                                    v17 = var34_32;
lbl186:


                                                                    if (v17 != null) break block70;
                                                                    if (v15 != v16) break block71;
                                                                }
                                                                catch (Eq v32) {
                                                                    throw op.b((Exception)v32);
                                                                }
                                                                this.a((char)var26_24, var27_25, op.h.splitToList((CharSequence)var35_33.b().d((byte)var11_10, var12_11, var13_12)), var3_3, (short)var28_26, var4_4);
                                                                if (var34_32 == null) break block66;
                                                            }
                                                            catch (Eq v33) {
                                                                throw op.b((Exception)v33);
                                                            }
                                                        }
                                                        v34 = var35_33;
                                                        if (var34_32 != null) break block72;
                                                    }
                                                    catch (Eq v35) {
                                                        throw op.b((Exception)v35);
                                                    }
                                                    v15 = v34.a();
                                                    v16 = h8.SHOW_ACHIEVEMENT;
                                                }
                                                catch (Eq v36) {
                                                    throw op.b((Exception)v36);
                                                }
                                            }
                                            if (v15 != v16) break block66;
                                            v34 = var35_33;
                                        }
                                        var36_34 = c0.a((String)v34.b().f(var23_22, (byte)var25_23));
                                        try {
                                            v37 = var36_34;
                                            if (var34_32 != null) break block73;
                                            if (v37 != null) {
                                            }
                                            ** GOTO lbl276
                                        }
                                        catch (Eq v38) {
                                            throw op.b((Exception)v38);
                                        }
                                        v37 = var36_34;
                                    }
                                    var37_36 = v37.i();
                                    try {
                                        v39 = v40;
                                        v41 = v40;
                                        v42 = new StringBuilder().append((String)op.a("a", (int)17104, (long)(316598426646078516L ^ var7_7)));
                                        v43 = var36_34.d() != false ? op.a("a", (int)30519, (long)(3760424899151712726L ^ var7_7)) : op.a("a", (int)8517, (long)(6923852270522304427L ^ var7_7));
                                    }
                                    catch (Eq v44) {
                                        throw op.b((Exception)v44);
                                    }
                                    v39(v42.append((String)v43).toString(), new Object[0]);
                                    var38_39 = v41;
                                    try {
                                        try {
                                            var38_39.b().a(Boolean.valueOf(true));
                                            v45 = var36_34;
                                            if (var34_32 != null) break block74;
                                            if (!(v45 instanceof rX)) break block75;
                                        }
                                        catch (Eq v46) {
                                            throw op.b((Exception)v46);
                                        }
                                        v45 = var36_34;
                                    }
                                    catch (Eq v47) {
                                        throw op.b((Exception)v47);
                                    }
                                }
                                v48 = ((rX)v45).c(var29_27, var30_28);
                                break block82;
                            }
                            v48 = null;
                        }
                        var39_41 = v48;
                        var40_42 = Lists.newArrayList((Object[])new String[]{var37_36.d((byte)var11_10, var12_11, var13_12), var38_39.d((byte)var11_10, var12_11, var13_12)});
                        try {
                            try {
                                v49 = var34_32;
                                if (var6_6 >= 0) {
                                    if (v49 != null) break block76;
                                    if (var39_41 == null) break block77;
                                }
                                ** GOTO lbl275
                            }
                            catch (Eq v50) {
                                throw op.b((Exception)v50);
                            }
                            var40_42.addAll(this.t.a(var39_41, 150));
                        }
                        catch (Eq v51) {
                            throw op.b((Exception)v51);
                        }
                    }
                    this.a((char)var26_24, var27_25, var40_42, var3_3, (short)var28_26, var4_4);
                }
                try {
                    if (var5_5 <= '\u0000') break block66;
                    v49 = var34_32;
lbl275:


                    if (v49 == null) break block66;
lbl276:


                    this.a(var9_8, mu.RED + (String)op.a("a", (int)28049, (long)(3907828222701914995L ^ var7_7)), var3_3, var4_4, var10_9);
                }
                catch (Eq v52) {
                    throw op.b((Exception)v52);
                }
            }
            ri.h();
        }
    }

    protected void a(String string, boolean bl) {
    }




    protected boolean a(byte var1_1, int var2_2, FG var3_3, int var4_4) {
        block67: {
            block75: {
                block82: {
                    block81: {
                        block79: {
                            block77: {
                                block76: {
                                    block69: {
                                        block71: {
                                            block70: {
                                                block87: {
                                                    block68: {
                                                        block85: {
                                                            block84: {
                                                                block65: {
                                                                    block66: {
                                                                        v0 = var5_5 = (long)var1_1 << 56 | (long)var2_2 << 32 >>> 8 | (long)var4_4 << 40 >>> 40;
                                                                        var7_6 = v0 ^ 114346316420378L;
                                                                        v1 = v0 ^ 62667251285095L;
                                                                        var9_7 = (int)(v1 >>> 48);
                                                                        var10_8 = (int)(v1 << 16 >>> 32);
                                                                        var11_9 = (int)(v1 << 48 >>> 48);
                                                                        v2 = v0 ^ 59294601357093L;
                                                                        var12_10 = (int)(v2 >>> 32);
                                                                        var13_11 = (int)(v2 << 32 >>> 56);
                                                                        var14_12 = (int)(v2 << 40 >>> 40);
                                                                        v3 = v0 ^ 124076996035731L;
                                                                        var15_13 = (int)(v3 >>> 32);
                                                                        var16_14 = v3 << 32 >>> 32;
                                                                        var18_15 = o9.b();
                                                                        v4 = var3_3;
                                                                        if (var18_15 != null) break block65;
                                                                        try {
                                                                            block83: {
                                                                                if (v4 != null) break block66;
                                                                                break block83;
                                                                                catch (URISyntaxException v5) {
                                                                                    throw op.b(v5);
                                                                                }
                                                                            }
                                                                            return false;
                                                                        }
                                                                        catch (URISyntaxException v6) {
                                                                            throw op.b(v6);
                                                                        }
                                                                    }
                                                                    v4 = var3_3;
                                                                }
                                                                var19_16 = v4.b().d();
                                                                if (var4_4 <= 0 || !op.g()) ** GOTO lbl49
                                                                if (var3_3.b().a() == null) break block67;
                                                                break block84;
                                                                catch (URISyntaxException v7) {
                                                                    throw op.b(v7);
                                                                }
                                                            }
                                                            this.a(var3_3.b().a(), false);
                                                            if (var18_15 == null) break block67;
                                                            break block85;
                                                            catch (URISyntaxException v8) {
                                                                throw op.b(v8);
                                                            }
                                                        }
                                                        try {
                                                            block86: {
                                                                v9 = var19_16;
                                                                if (var2_2 <= 0 || var18_15 != null) break block68;
                                                                break block86;
                                                                catch (URISyntaxException v10) {
                                                                    throw op.b(v10);
                                                                }
                                                            }
                                                            if (v9 == null) break block67;
                                                        }
                                                        catch (URISyntaxException v11) {
                                                            throw op.b(v11);
                                                        }
                                                        v9 = var19_16;
                                                    }
                                                    v12 = v9.a();
                                                    v13 = wh.OPEN_URL;
                                                    v14 = var18_15;
                                                    if (var4_4 <= 0) ** GOTO lbl149
                                                    if (v14 != null) break block69;
                                                    if (v12 != v13) ** GOTO lbl141
                                                    break block87;
                                                    catch (URISyntaxException v15) {
                                                        throw op.b(v15);
                                                    }
                                                }
                                                try {
                                                    block88: {
                                                        v16 = this.i.i.bm;
                                                        if (var18_15 != null) break block70;
                                                        break block88;
                                                        catch (URISyntaxException v17) {
                                                            throw op.b(v17);
                                                        }
                                                    }
                                                    if (v16) break block71;
                                                }
                                                catch (URISyntaxException v18) {
                                                    throw op.b(v18);
                                                }
                                                v16 = false;
                                            }
                                            return v16;
                                        }
                                        try {
                                            block74: {
                                                block72: {
                                                    block73: {
                                                        var20_17 = new URI(var19_16.b());
                                                        var21_20 = var20_17.getScheme();
                                                        try {
                                                            if (var4_4 > 0 && var21_20 == null) {
                                                                throw new URISyntaxException(var19_16.b(), (String)op.a("a", (int)8472, (long)(9050449468673141909L ^ var5_5)));
                                                            }
                                                        }
                                                        catch (URISyntaxException v19) {
                                                            throw op.b(v19);
                                                        }
                                                        v20 = op.v.contains(var21_20.toLowerCase());
                                                        if (var1_1 < 0 || var18_15 != null) break block72;
                                                        try {
                                                            block89: {
                                                                if (v20) break block73;
                                                                break block89;
                                                                catch (URISyntaxException v21) {
                                                                    throw op.b(v21);
                                                                }
                                                            }
                                                            throw new URISyntaxException(var19_16.b(), (String)op.a("a", (int)27982, (long)(4536802863975751900L ^ var5_5)) + var21_20.toLowerCase());
                                                        }
                                                        catch (URISyntaxException v22) {
                                                            throw op.b(v22);
                                                        }
                                                    }
                                                    try {
                                                        v23 = this;
                                                        if (var18_15 != null) break block74;
                                                        v20 = v23.i.i.bu;
                                                    }
                                                    catch (URISyntaxException v24) {
                                                        throw op.b(v24);
                                                    }
                                                }
                                                if (!v20) ** GOTO lbl129
                                                try {
                                                    block90: {
                                                        this.s = var20_17;
                                                        this.i.a((op)new p_((zj)this, var19_16.b(), 31102009, var7_6, false), var15_13, var16_14);
                                                        if (var18_15 == null) break block75;
                                                        break block90;
                                                        catch (URISyntaxException v25) {
                                                            throw op.b(v25);
                                                        }
                                                    }
                                                    v23 = this;
                                                }
                                                catch (URISyntaxException v26) {
                                                    throw op.b(v26);
                                                }
                                            }
                                            v23.a(var20_17, (short)var9_7, var10_8, var11_9);
                                            break block75;
                                        }
                                        catch (URISyntaxException var20_18) {
                                            try {
                                                op.k.error((String)op.a("a", (int)28764, (long)(3731576543032180181L ^ var5_5)) + var19_16, (Throwable)var20_18);
                                                if (var18_15 == null) break block75;
lbl141:


                                                v12 = var19_16.a();
                                                v13 = wh.OPEN_FILE;
                                            }
                                            catch (URISyntaxException v27) {
                                                throw op.b(v27);
                                            }
                                        }
                                    }
                                    try {
                                        v14 = var18_15;
lbl149:


                                        if (var2_2 < 0) ** GOTO lbl170
                                        if (v14 != null) break block76;
                                        if (v12 == v13) {
                                        }
                                        ** GOTO lbl160
                                    }
                                    catch (URISyntaxException v28) {
                                        throw op.b(v28);
                                    }
                                    var20_19 = new File(var19_16.b()).toURI();
                                    try {
                                        this.a(var20_19, (short)var9_7, var10_8, var11_9);
                                        if (var18_15 == null) break block75;
lbl160:


                                        v12 = var19_16.a();
                                        v13 = wh.SUGGEST_COMMAND;
                                    }
                                    catch (URISyntaxException v29) {
                                        throw op.b(v29);
                                    }
                                }
                                try {
                                    block78: {
                                        try {
                                            try {
                                                v14 = var18_15;
lbl170:


                                                if (var2_2 > 0) {
                                                    if (v14 != null) break block77;
                                                    if (v12 != v13) break block78;
                                                }
                                                ** GOTO lbl193
                                            }
                                            catch (URISyntaxException v30) {
                                                throw op.b(v30);
                                            }
                                            this.a(var19_16.b(), true);
                                            if (var18_15 == null) break block75;
                                        }
                                        catch (URISyntaxException v31) {
                                            throw op.b(v31);
                                        }
                                    }
                                    v12 = var19_16.a();
                                    v13 = wh.RUN_COMMAND;
                                }
                                catch (URISyntaxException v32) {
                                    throw op.b(v32);
                                }
                            }
                            try {
                                block80: {
                                    try {
                                        try {
                                            v14 = var18_15;
lbl193:


                                            if (v14 != null) break block79;
                                            if (v12 != v13) break block80;
                                        }
                                        catch (URISyntaxException v33) {
                                            throw op.b(v33);
                                        }
                                        this.b(var19_16.b(), false);
                                        if (var18_15 == null) break block75;
                                    }
                                    catch (URISyntaxException v34) {
                                        throw op.b(v34);
                                    }
                                }
                                v12 = var19_16.a();
                                v13 = wh.TWITCH_USER_INFO;
                            }
                            catch (URISyntaxException v35) {
                                throw op.b(v35);
                            }
                        }
                        if (v12 != v13) ** GOTO lbl241
                        var20_19 = this.i.B().a(var19_16.b());
                        try {
                            try {
                                v36 = var18_15;
                                if (var4_4 <= 0) ** GOTO lbl229
                                if (v36 != null) break block81;
                                if (var20_19 != null) {
                                }
                                ** GOTO lbl232
                            }
                            catch (URISyntaxException v37) {
                                throw op.b(v37);
                            }
                            this.i.a((op)new pX(var12_10, this.i.B(), (byte)var13_11, (ChatUserInfo)var20_19, var14_12), var15_13, var16_14);
                        }
                        catch (URISyntaxException v38) {
                            throw op.b(v38);
                        }
                    }
                    try {
                        v36 = var18_15;
lbl229:


                        if (var4_4 >= 0) {
                            if (v36 == null) break block82;
                        }
                        ** GOTO lbl240
lbl232:


                        op.k.error((String)op.a("a", (int)10854, (long)(2756850535572318193L ^ var5_5)));
                    }
                    catch (URISyntaxException v39) {
                        throw op.b(v39);
                    }
                }
                try {
                    if (var1_1 < 0) break block75;
                    v36 = var18_15;
lbl240:


                    if (v36 == null) break block75;
lbl241:


                    op.k.error((String)op.a("a", (int)11244, (long)(4283608687348393575L ^ var5_5)) + var19_16);
                }
                catch (URISyntaxException v40) {
                    throw op.b(v40);
                }
            }
            return true;
        }
        return false;
    }

    public void e(String string) {
        this.b(string, true);
    }

    public void b(String string, boolean bl) {
        block4: {
            block5: {
                int[] nArray = o9.b();
                try {
                    try {
                        if (nArray != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    this.i.c.k().a(string);
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
            }
            this.i.ab.c(string);
        }
    }

    protected void a(int n, long l, int n2, int n3, char c) {
        block8: {
            int n4;
            int[] nArray;
            int n5;
            long l2;
            int n6;
            int n7;
            int n8;
            int n9;
            long l3;
            block7: {
                int n10;
                long l4;
                long l5 = l4 = l << 16 | (long)c << 48 >>> 48;
                long l6 = l5 ^ 0x5EEB9F9990B1L;
                l3 = l6 >>> 32;
                n9 = (int)(l6 << 32 >>> 32);
                long l7 = l5 ^ 0x61F5F100DAE4L;
                n8 = (int)(l7 >>> 32);
                n7 = (int)(l7 << 32 >>> 40);
                n6 = (int)(l7 << 56 >>> 56);
                long l8 = l5 ^ 0x3F9175FB34B9L;
                l2 = l8 >>> 16;
                n5 = (int)(l8 << 48 >>> 48);
                nArray = o9.b();
                try {
                    n10 = n3;
                    if (nArray != null) break block7;
                    if (n10 != 0) break block8;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                n10 = n4 = 0;
            }
            while (n4 < this.m.size()) {
                int[] nArray2;
                block9: {
                    block10: {
                        block11: {
                            o_ o_2 = this.m.get(n4);
                            try {
                                try {
                                    nArray2 = nArray;
                                    if (c <= '\u0000') break block9;
                                    if (nArray2 != null) break block10;
                                    if (!o_2.a(this.i, l2, n, (short)n5, n2)) break block11;
                                }
                                catch (H h) {
                                    throw op.b((Exception)((Object)h));
                                }
                                this.q = o_2;
                                o_2.a(this.i.ad(), l3, n9);
                                this.a(n8, o_2, n7, (byte)n6);
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                        }
                        ++n4;
                    }
                    nArray2 = nArray;
                }
                if (nArray2 == null) continue;
            }
        }
    }

    protected void b(int n, long l, int n2, int n3, int n4) {
        block4: {
            long l2 = (long)n << 32 | l << 32 >>> 32;
            long l3 = l2 ^ 0x1420E4F7D34CL;
            int n5 = (int)(l3 >>> 32);
            int n6 = (int)(l3 << 32 >>> 40);
            int n7 = (int)(l3 << 56 >>> 56);
            try {
                try {
                    if (this.q == null || n4 != 0) break block4;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                this.q.b(n2, n5, n6, (byte)n7, n3);
                this.q = null;
            }
            catch (H h) {
                throw op.b((Exception)((Object)h));
            }
        }
    }

    protected void a(long l, int n, int n2, int n3, long l2) {
    }

    protected void a(int n, o_ o_2, int n2, byte by) {
    }

    public void b(int n, cD cD2, int n2, short s, int n3, int n4) {
        long l = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n4 << 48 >>> 48) ^ db;
        long l2 = l ^ 0x55C65F75B71L;
        int n5 = (int)(l2 >>> 32);
        int n6 = (int)(l2 << 32 >>> 48);
        int n7 = (int)(l2 << 48 >>> 48);
        this.i = cD2;
        this.u = cD2.v();
        this.t = cD2.j;
        this.l = n2;
        this.r = n3;
        this.m.clear();
        this.o(n5, (char)n6, (char)n7);
    }

    public void o(int n, char c, char c2) {
    }




    public void m(short var1_1, short var2_2, int var3_3) {
        block36: {
            block37: {
                v0 = var4_4 = ((long)var1_1 << 48 | (long)var2_2 << 48 >>> 16 | (long)var3_3 << 32 >>> 32) ^ op.db;
                v1 = v0 ^ 47941893635161L;
                var6_5 = v1 >>> 8;
                var8_6 = (int)(v1 << 56 >>> 56);
                v2 = v0 ^ 62569505546513L;
                var9_7 = (int)(v2 >>> 48);
                var10_8 = (int)(v2 << 16 >>> 48);
                var11_9 = (int)(v2 << 32 >>> 32);
                v3 = v0 ^ 62569505546513L;
                var12_10 = (int)(v3 >>> 48);
                var13_11 = (int)(v3 << 16 >>> 48);
                var14_12 = (int)(v3 << 32 >>> 32);
                v4 = v0 ^ 47941893635161L;
                var15_13 = v4 >>> 8;
                var17_14 = (int)(v4 << 56 >>> 56);
                var18_15 = o9.b();
                try {
                    try {
                        v5 = Mouse.isCreated();
                        if (var18_15 != null) break block36;
                        if (v5) {
                        }
                        ** GOTO lbl89
                    }
                    catch (H v6) {
                        throw op.b((Exception)v6);
                    }
lbl31:


                    while (Mouse.next()) {
                        break block37;
                    }
                    ** GOTO lbl89
                }
                catch (H v7) {
                    throw op.b((Exception)v7);
                }
            }
            do {
                block40: {
                    block38: {
                        try {
                            block39: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v8 = tf.o();
                                                    v9 = var18_15;
                                                    if (var1_1 < 0) ** GOTO lbl109
                                                    if (v9 == null) {
                                                        if (var18_15 != null) break block38;
                                                    }
                                                    ** GOTO lbl104
                                                }
                                                catch (H v10) {
                                                    throw op.b((Exception)v10);
                                                }
                                                if (var1_1 < 0) break block38;
                                                if (v8 == null) break block39;
                                            }
                                            catch (H v11) {
                                                throw op.b((Exception)v11);
                                            }
                                            v12 = tf.o();
                                            if (var18_15 != null) break block38;
                                        }
                                        catch (H v13) {
                                            throw op.b((Exception)v13);
                                        }
                                        if (var1_1 < 0) break block38;
                                        if (!v12.c()) break block39;
                                    }
                                    catch (H v14) {
                                        throw op.b((Exception)v14);
                                    }
                                    tf.o().i((short)var9_7, (char)var10_8, var11_9);
                                    if (var18_15 == null) break block40;
                                }
                                catch (H v15) {
                                    throw op.b((Exception)v15);
                                }
                            }
                            v12 = this;
                        }
                        catch (H v16) {
                            throw op.b((Exception)v16);
                        }
                    }
                    v12.i((short)var12_10, (char)var13_11, var14_12);
                }
                var19_16 = Mouse.getEventDWheel();
                try {
                    if (var1_1 >= 0 && var19_16 != 0) {
                        hV.d().a((float)var19_16);
                    }
                }
                catch (H v17) {
                    throw op.b((Exception)v17);
                }
                if (var18_15 == null) ** GOTO lbl31
lbl89:


            } while (var1_1 < 0);
            v5 = Keyboard.isCreated();
        }
        try {
            if (var18_15 != null) ** GOTO lbl101
            if (v5) {
            }
            ** GOTO lbl135
        }
        catch (H v18) {
            throw op.b((Exception)v18);
        }
        block30: while (true) lbl-1000:


        {
            v5 = Keyboard.next();
lbl101:


            if (!v5) ** GOTO lbl135
            do {
                block43: {
                    block41: {
                        block42: {
                            v8 = tf.o();
lbl104:


                            try {
                                try {
                                    try {
                                        try {
                                            v9 = var18_15;
lbl109:


                                            if (v9 != null) break block41;
                                            if (v8 == null) break block42;
                                        }
                                        catch (H v19) {
                                            throw op.b((Exception)v19);
                                        }
                                        if (var2_2 < 0) break block43;
                                        v8 = tf.o();
                                        if (var18_15 != null) break block41;
                                    }
                                    catch (H v20) {
                                        throw op.b((Exception)v20);
                                    }
                                    if (!v8.c()) break block42;
                                }
                                catch (H v21) {
                                    throw op.b((Exception)v21);
                                }
                                tf.o().j(var15_13, (byte)var17_14);
                                if (var18_15 == null) ** GOTO lbl-1000
                            }
                            catch (H v22) {
                                throw op.b((Exception)v22);
                            }
                        }
                        v8 = this;
                    }
                    v8.j(var6_5, (byte)var8_6);
                }
                if (var18_15 == null) continue block30;
lbl135:


            } while (var3_3 >= 0);
            break;
        }
    }




    public void i(short var1_1, char var2_2, int var3_3) {
        block44: {
            block53: {
                block54: {
                    block52: {
                        block45: {
                            block49: {
                                block50: {
                                    block46: {
                                        block51: {
                                            block47: {
                                                block48: {
                                                    block38: {
                                                        block42: {
                                                            block39: {
                                                                block40: {
                                                                    block43: {
                                                                        block41: {
                                                                            v0 = var4_4 = (long)var1_1 << 48 | (long)var2_2 << 48 >>> 16 | (long)var3_3 << 32 >>> 32;
                                                                            v1 = v0 ^ 114609014738148L;
                                                                            var6_5 = v1 >>> 16;
                                                                            var8_6 = (int)(v1 << 48 >>> 48);
                                                                            var9_7 = v0 ^ 139938002828112L;
                                                                            v2 = v0 ^ 89372411521988L;
                                                                            var11_8 = (int)(v2 >>> 32);
                                                                            var12_9 = v2 << 32 >>> 32;
                                                                            var18_10 = Mouse.getEventX() * this.l / this.i.q;
                                                                            var19_11 = this.r - Mouse.getEventY() * this.r / this.i.z - 1;
                                                                            var20_12 = Mouse.getEventButton();
                                                                            var17_13 = o9.b();
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v3 = Mouse.getEventButtonState();
                                                                                                    if (var17_13 != null) break block38;
                                                                                                    if (v3 != 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl70
                                                                                                }
                                                                                                catch (H v4) {
                                                                                                    throw op.b((Exception)v4);
                                                                                                }
                                                                                                v5 = this;
                                                                                                if (var17_13 != null) break block39;
                                                                                            }
                                                                                            catch (H v6) {
                                                                                                throw op.b((Exception)v6);
                                                                                            }
                                                                                            if (var2_2 < '\u0000') break block40;
                                                                                            if (!v5.i.i.e) break block41;
                                                                                        }
                                                                                        catch (H v7) {
                                                                                            throw op.b((Exception)v7);
                                                                                        }
                                                                                        v8 = this;
                                                                                        v5 = v8;
                                                                                        v9 = v8.j;
                                                                                        if (var1_1 < 0 || var17_13 != null) break block42;
                                                                                    }
                                                                                    catch (H v10) {
                                                                                        throw op.b((Exception)v10);
                                                                                    }
                                                                                    if (var3_3 > 0) break block43;
                                                                                    v5.j = v9 + 1;
                                                                                    if (v9 <= 0) break block41;
                                                                                }
                                                                                catch (H v11) {
                                                                                    throw op.b((Exception)v11);
                                                                                }
                                                                                return;
                                                                            }
                                                                            catch (H v12) {
                                                                                throw op.b((Exception)v12);
                                                                            }
                                                                        }
                                                                        v13 = this;
                                                                        v14 = var20_12;
                                                                    }
                                                                    v13.f = v14;
                                                                    v15 = this;
                                                                }
                                                                v15.g = cD.A();
                                                                v5 = this;
                                                            }
                                                            v9 = var18_10;
                                                        }
                                                        try {
                                                            v5.a(v9, var6_5, var19_11, this.f, (char)var8_6);
                                                            if (var17_13 == null) break block44;
lbl70:


                                                            v3 = var20_12;
                                                        }
                                                        catch (H v16) {
                                                            throw op.b((Exception)v16);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v17 = -1;
                                                                            if (var1_1 < 0 || var17_13 != null) break block45;
                                                                            if (v3 != v17) {
                                                                            }
                                                                            ** GOTO lbl136
                                                                        }
                                                                        catch (H v18) {
                                                                            throw op.b((Exception)v18);
                                                                        }
                                                                        v19 = this;
                                                                        if (var17_13 != null) break block46;
                                                                    }
                                                                    catch (H v20) {
                                                                        throw op.b((Exception)v20);
                                                                    }
                                                                    if (var3_3 >= 0) break block47;
                                                                    if (!v19.i.i.e) break block48;
                                                                }
                                                                catch (H v21) {
                                                                    throw op.b((Exception)v21);
                                                                }
                                                                v22 = this;
                                                                v19 = v22;
                                                                v23 = v22.j;
                                                                v24 = 1;
                                                                if (var3_3 > 0) break block49;
                                                                v23 = v23 - v24;
                                                                if (var17_13 != null) break block50;
                                                            }
                                                            catch (H v25) {
                                                                throw op.b((Exception)v25);
                                                            }
                                                            if (var3_3 >= 0) break block51;
                                                            v19.j = v23;
                                                            if (v23 <= 0) break block48;
                                                        }
                                                        catch (H v26) {
                                                            throw op.b((Exception)v26);
                                                        }
                                                        return;
                                                    }
                                                    catch (H v27) {
                                                        throw op.b((Exception)v27);
                                                    }
                                                }
                                                v28 = this;
                                            }
                                            v29 = -1;
                                        }
                                        v28.f = v29;
                                        v19 = this;
                                    }
                                    v23 = var18_10;
                                }
                                v24 = var19_11;
                            }
                            var14_14 = var20_12;
                            var15_15 = v24;
                            var16_16 = v23;
                            try {
                                try {
                                    v19.b(var11_8, var12_9, var16_16, var15_15, var14_14);
                                    if (var3_3 <= 0 && var17_13 == null) break block44;
lbl136:


                                    v3 = this.f;
                                    if (var3_3 > 0 || var17_13 != null) break block52;
                                }
                                catch (H v30) {
                                    throw op.b((Exception)v30);
                                }
                                v17 = -1;
                            }
                            catch (H v31) {
                                throw op.b((Exception)v31);
                            }
                        }
                        try {
                            try {
                                if (v3 == v17) break block44;
                                v32 = this.g;
                                if (var2_2 < '\u0000') break block53;
                                v33 = 0L;
                                if (var17_13 != null) break block54;
                            }
                            catch (H v34) {
                                throw op.b((Exception)v34);
                            }
                            cfr_temp_0 = v32 - v33;
                            v3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        }
                        catch (H v35) {
                            throw op.b((Exception)v35);
                        }
                    }
                    try {
                        if (v3 <= 0) break block44;
                        v36 = cD.A();
                        v33 = this.g;
                    }
                    catch (H v37) {
                        throw op.b((Exception)v37);
                    }
                }
                v32 = v36 - v33;
            }
            var21_17 = v32;
            this.a(var9_7, var18_10, var19_11, this.f, var21_17);
        }
    }




    public void j(long var1_1, byte var3_2) {
        block53: {
            block54: {
                block52: {
                    block41: {
                        block42: {
                            block43: {
                                block51: {
                                    block50: {
                                        block49: {
                                            block48: {
                                                block45: {
                                                    block47: {
                                                        block46: {
                                                            block44: {
                                                                v0 = var4_3 = var1_1 << 8 | (long)var3_2 << 56 >>> 56;
                                                                v1 = v0 ^ 132463968852176L;
                                                                var6_4 = (int)(v1 >>> 48);
                                                                var7_5 = (int)(v1 << 16 >>> 48);
                                                                var8_6 = (int)(v1 << 32 >>> 32);
                                                                v2 = v0 ^ 30548933983250L;
                                                                var9_7 = v2 >>> 32;
                                                                var11_8 = (int)(v2 << 32 >>> 32);
                                                                var13_9 = System.currentTimeMillis();
                                                                var15_10 = Keyboard.getEventKey();
                                                                var12_11 = o9.b();
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    cfr_temp_0 = var13_9 - hV.d().a() - 250L;
                                                                                    v3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                                    if (var12_11 != null) break block41;
                                                                                    if (v3 < 0) break block42;
                                                                                }
                                                                                catch (H v4) {
                                                                                    throw op.b((Exception)v4);
                                                                                }
                                                                                if (!Keyboard.getEventKeyState()) break block43;
                                                                            }
                                                                            catch (H v5) {
                                                                                throw op.b((Exception)v5);
                                                                            }
                                                                            v6 = this.i.H;
                                                                            if (var3_2 > 0 || var12_11 != null) break block44;
                                                                        }
                                                                        catch (H v7) {
                                                                            throw op.b((Exception)v7);
                                                                        }
                                                                        if (v6 == null) break block45;
                                                                    }
                                                                    catch (H v8) {
                                                                        throw op.b((Exception)v8);
                                                                    }
                                                                    v6 = this.i.H;
                                                                }
                                                                catch (H v9) {
                                                                    throw op.b((Exception)v9);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    v10 = v6 instanceof pJ;
                                                                    v11 = var12_11;
                                                                    if (var1_1 > 0L) {
                                                                        if (v11 != null) break block46;
                                                                        if (v10 != 0) break block45;
                                                                    }
                                                                    ** GOTO lbl64
                                                                }
                                                                catch (H v12) {
                                                                    throw op.b((Exception)v12);
                                                                }
                                                                v10 = this.i.H instanceof pC;
                                                            }
                                                            catch (H v13) {
                                                                throw op.b((Exception)v13);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                v11 = var12_11;
lbl64:


                                                                if (var1_1 > 0L) {
                                                                    if (v11 != null) break block47;
                                                                    if (v10 != 0) break block45;
                                                                }
                                                                ** GOTO lbl78
                                                            }
                                                            catch (H v14) {
                                                                throw op.b((Exception)v14);
                                                            }
                                                            v10 = this.i.H instanceof pj;
                                                        }
                                                        catch (H v15) {
                                                            throw op.b((Exception)v15);
                                                        }
                                                    }
                                                    try {
                                                        v11 = var12_11;
lbl78:


                                                        if (v11 != null) break block48;
                                                        if (v10 != 0) break block45;
                                                    }
                                                    catch (H v16) {
                                                        throw op.b((Exception)v16);
                                                    }
                                                    v10 = 1;
                                                    break block48;
                                                }
                                                v10 = 0;
                                            }
                                            var16_12 = v10;
                                            try {
                                                v17 = var16_12;
                                                if (var3_2 > 0 || var12_11 != null) break block49;
                                                if (v17 == false) break block50;
                                            }
                                            catch (H v18) {
                                                throw op.b((Exception)v18);
                                            }
                                            v17 = var15_10;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (v17 != 54) break block50;
                                                            v19 = tf.o();
                                                            if (var12_11 != null) break block51;
                                                        }
                                                        catch (H v20) {
                                                            throw op.b((Exception)v20);
                                                        }
                                                        if (v19 == null) break block50;
                                                    }
                                                    catch (H v21) {
                                                        throw op.b((Exception)v21);
                                                    }
                                                    v19 = tf.o();
                                                    if (var12_11 != null) break block51;
                                                }
                                                catch (H v22) {
                                                    throw op.b((Exception)v22);
                                                }
                                                if (v19.c()) break block50;
                                            }
                                            catch (H v23) {
                                                throw op.b((Exception)v23);
                                            }
                                            tf.o().a();
                                            return;
                                        }
                                        catch (H v24) {
                                            throw op.b((Exception)v24);
                                        }
                                    }
                                    v19 = this;
                                }
                                v19.a(Keyboard.getEventCharacter(), (char)var6_4, (char)var7_5, var15_10, var8_6);
                            }
                            this.i.af(var9_7, var11_8);
                        }
                        v3 = (long)Keyboard.getEventKeyState();
                    }
                    try {
                        if (var12_11 != null) break block52;
                        if (v3 == false) break block53;
                    }
                    catch (H v25) {
                        throw op.b((Exception)v25);
                    }
                    v3 = Keyboard.getEventCharacter();
                }
                var16_12 = v3;
                try {
                    v26 = var16_12;
                    if (var1_1 < 0L || var12_11 != null) break block54;
                    if (v26 == false) break block53;
                }
                catch (H v27) {
                    throw op.b((Exception)v27);
                }
                v26 = var16_12;
            }
            try {
                if (v26 != true) {
                    hV.d().a((int)var16_12);
                }
            }
            catch (H v28) {
                throw op.b((Exception)v28);
            }
        }
    }

    public void n(short s, int n, short s2) {
    }

    public void c(char c, long l) {
    }

    public void f(int n, int n2) {
        long l = (long)n << 32 | (long)n2 << 32 >>> 32;
        long l2 = l ^ 0x3C37C034B092L;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        this.d(0, n3, (short)n4, (short)n5);
    }

    public void d(int n, int n2, short s, short s2) {
        block8: {
            op op2;
            int n3;
            int n4;
            int n5;
            block6: {
                long l;
                long l2 = l = (long)n2 << 32 | (long)s << 48 >>> 32 | (long)s2 << 48 >>> 48;
                long l3 = l2 ^ 0x47B95D06446FL;
                n5 = (int)(l3 >>> 48);
                n4 = (int)(l3 << 16 >>> 32);
                n3 = (int)(l3 << 48 >>> 48);
                long l4 = l2 ^ 0x6E74D5166812L;
                int n6 = (int)(l4 >>> 48);
                int n7 = (int)(l4 << 16 >>> 32);
                int n8 = (int)(l4 << 48 >>> 48);
                int[] nArray = o9.b();
                try {
                    block7: {
                        try {
                            try {
                                op2 = this;
                                if (nArray != null) break block6;
                                if (op2.i.aq == null) break block7;
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                            this.b(0, (short)n6, 0, n7, (char)n8, this.l, this.r, -1072689136, -804253680);
                            if (nArray == null) break block8;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                    }
                    op2 = this;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
            }
            op2.e((short)n5, n4, (char)n3, n);
        }
    }

    public void e(short s, int n, char c, int n2) {
        long l;
        long l2 = l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ db;
        long l3 = l2 ^ 0x36BD7041C65EL;
        int n3 = (int)(l3 >>> 48);
        int n4 = (int)(l3 << 16 >>> 32);
        int n5 = (int)(l3 << 48 >>> 48);
        long l4 = l2 ^ 0x4620A3B80ADBL;
        int n6 = (int)(l4 >>> 48);
        long l5 = l4 << 16 >>> 16;
        long l6 = l2 ^ 0x466E208A0F1CL;
        int n7 = (int)(l6 >>> 48);
        int n8 = (int)(l6 << 16 >>> 32);
        int n9 = (int)(l6 << 48 >>> 48);
        long l7 = l2 ^ 0x17012700D9B2L;
        int n10 = (int)(l7 >>> 48);
        int n11 = (int)(l7 << 16 >>> 32);
        int n12 = (int)(l7 << 48 >>> 48);
        ri.h();
        ri.d();
        OX oX2 = OX.c();
        Jk jk = oX2.a();
        this.i.aa().c((char)n7, n8, (short)n9, op.c);
        ri.c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f = 32.0f;
        jk.a((char)n6, 7, Kt.h, l5);
        jk.b(0.0, (double)this.r, 0.0).a(0.0, (double)((float)this.r / 32.0f + (float)n2)).b(64, 64, 64, 255).j((char)n10, n11, (short)n12);
        jk.b((double)this.l, (double)this.r, 0.0).a((double)((float)this.l / 32.0f), (double)((float)this.r / 32.0f + (float)n2)).b(64, 64, 64, 255).j((char)n10, n11, (short)n12);
        jk.b((double)this.l, 0.0, 0.0).a((double)((float)this.l / 32.0f), (double)n2).b(64, 64, 64, 255).j((char)n10, n11, (short)n12);
        jk.b(0.0, 0.0, 0.0).a(0.0, (double)n2).b(64, 64, 64, 255).j((char)n10, n11, (short)n12);
        oX2.b((short)n3, n4, n5);
    }

    public boolean k() {
        return true;
    }

    public void a(boolean bl, int n, int n2, int n3, char c) {
        block8: {
            int n4;
            long l;
            int n5;
            int n6;
            int n7;
            int n8;
            block7: {
                long l2;
                long l3 = l2 = (long)n2 << 32 | (long)n3 << 48 >>> 32 | (long)c << 48 >>> 48;
                long l4 = l3 ^ 0x1E976974B485L;
                n8 = (int)(l4 >>> 48);
                n7 = (int)(l4 << 16 >>> 32);
                n6 = (int)(l4 << 48 >>> 48);
                long l5 = l3 ^ 0x56B15F72CC71L;
                n5 = (int)(l5 >>> 32);
                l = l5 << 32 >>> 32;
                int[] nArray = o9.b();
                try {
                    try {
                        n4 = n;
                        if (nArray != null) break block7;
                        if (n4 != 31102009) break block8;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    n4 = bl ? 1 : 0;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
            }
            try {
                if (n4 != 0) {
                    this.a(this.s, (short)n8, n7, n6);
                }
            }
            catch (H h) {
                throw op.b((Exception)((Object)h));
            }
            this.s = null;
            this.i.a(this, n5, l);
        }
    }

    private void a(URI uRI, short s, int n, int n2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ db;
        try {
            Class<?> clazz = Class.forName((String)((Object)op.a("a", (int)8554, (long)(0x52253F87D19821F5L ^ l))));
            Object object = clazz.getMethod((String)((Object)op.a("a", (int)17680, (long)(0x395C52FEA2AD4582L ^ l))), new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod((String)((Object)op.a("a", (int)19942, (long)(0x448732EDBB6D4D66L ^ l))), URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            k.error((String)((Object)op.a("a", (int)18969, (long)(0xF1968F6CF964A8CL ^ l))), throwable);
        }
    }

    public static boolean l() {
        boolean bl;
        block18: {
            block22: {
                block21: {
                    int[] nArray;
                    block16: {
                        block17: {
                            block20: {
                                block19: {
                                    nArray = o9.b();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = cD.aa;
                                                        if (nArray != null) break block16;
                                                        if (!bl) break block17;
                                                    }
                                                    catch (H h) {
                                                        throw op.b((Exception)((Object)h));
                                                    }
                                                    bl = Keyboard.isKeyDown((int)219);
                                                    if (nArray != null) break block18;
                                                }
                                                catch (H h) {
                                                    throw op.b((Exception)((Object)h));
                                                }
                                                if (bl) break block19;
                                            }
                                            catch (H h) {
                                                throw op.b((Exception)((Object)h));
                                            }
                                            bl = Keyboard.isKeyDown((int)220);
                                            if (nArray != null) break block18;
                                        }
                                        catch (H h) {
                                            throw op.b((Exception)((Object)h));
                                        }
                                        if (!bl) break block20;
                                    }
                                    catch (H h) {
                                        throw op.b((Exception)((Object)h));
                                    }
                                }
                                bl = true;
                                break block18;
                            }
                            bl = false;
                            break block18;
                        }
                        bl = Keyboard.isKeyDown((int)29);
                    }
                    try {
                        try {
                            try {
                                if (nArray != null) break block18;
                                if (bl) break block21;
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                            bl = Keyboard.isKeyDown((int)157);
                            if (nArray != null) break block18;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        if (!bl) break block22;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                }
                bl = true;
                break block18;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean g() {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int[] nArray = o9.b();
                    try {
                        try {
                            try {
                                bl = Keyboard.isKeyDown((int)42);
                                if (nArray != null) break block6;
                                if (bl) break block7;
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                            bl = Keyboard.isKeyDown((int)54);
                            if (nArray != null) break block6;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        if (!bl) break block8;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean e() {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int[] nArray = o9.b();
                    try {
                        try {
                            try {
                                bl = Keyboard.isKeyDown((int)56);
                                if (nArray != null) break block6;
                                if (bl) break block7;
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                            bl = Keyboard.isKeyDown((int)184);
                            if (nArray != null) break block6;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        if (!bl) break block8;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean f(int n) {
        boolean bl;
        block14: {
            block11: {
                int[] nArray;
                block13: {
                    block12: {
                        block10: {
                            nArray = o9.b();
                            try {
                                try {
                                    bl = n;
                                    if (nArray != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (H h) {
                                    throw op.b((Exception)((Object)h));
                                }
                                bl = op.l();
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                        }
                        try {
                            if (nArray != null) break block12;
                            if (!bl) break block11;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        bl = op.g();
                    }
                    try {
                        if (nArray != null) break block13;
                        if (bl) break block11;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    bl = op.e();
                }
                try {
                    if (nArray != null) break block14;
                    if (bl) break block11;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean b(int n) {
        boolean bl;
        block14: {
            block11: {
                int[] nArray;
                block13: {
                    block12: {
                        block10: {
                            nArray = o9.b();
                            try {
                                try {
                                    bl = n;
                                    if (nArray != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (H h) {
                                    throw op.b((Exception)((Object)h));
                                }
                                bl = op.l();
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                        }
                        try {
                            if (nArray != null) break block12;
                            if (!bl) break block11;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        bl = op.g();
                    }
                    try {
                        if (nArray != null) break block13;
                        if (bl) break block11;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    bl = op.e();
                }
                try {
                    if (nArray != null) break block14;
                    if (bl) break block11;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean a(int n) {
        boolean bl;
        block14: {
            block11: {
                int[] nArray;
                block13: {
                    block12: {
                        block10: {
                            nArray = o9.b();
                            try {
                                try {
                                    bl = n;
                                    if (nArray != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (H h) {
                                    throw op.b((Exception)((Object)h));
                                }
                                bl = op.l();
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                        }
                        try {
                            if (nArray != null) break block12;
                            if (!bl) break block11;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        bl = op.g();
                    }
                    try {
                        if (nArray != null) break block13;
                        if (bl) break block11;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    bl = op.e();
                }
                try {
                    if (nArray != null) break block14;
                    if (bl) break block11;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean c(int n) {
        boolean bl;
        block14: {
            block11: {
                int[] nArray;
                block13: {
                    block12: {
                        block10: {
                            nArray = o9.b();
                            try {
                                try {
                                    bl = n;
                                    if (nArray != null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (H h) {
                                    throw op.b((Exception)((Object)h));
                                }
                                bl = op.l();
                            }
                            catch (H h) {
                                throw op.b((Exception)((Object)h));
                            }
                        }
                        try {
                            if (nArray != null) break block12;
                            if (!bl) break block11;
                        }
                        catch (H h) {
                            throw op.b((Exception)((Object)h));
                        }
                        bl = op.g();
                    }
                    try {
                        if (nArray != null) break block13;
                        if (bl) break block11;
                    }
                    catch (H h) {
                        throw op.b((Exception)((Object)h));
                    }
                    bl = op.e();
                }
                try {
                    if (nArray != null) break block14;
                    if (bl) break block11;
                }
                catch (H h) {
                    throw op.b((Exception)((Object)h));
                }
                bl = true;
                break block14;
            }
            bl = false;
        }
        return bl;
    }

    public void a(cD cD2, int n, int n2) {
        long l = db ^ 0x1BAB270D7519L;
        long l2 = l ^ 0x31FA7E203CBFL;
        int n3 = (int)(l2 >>> 32);
        int n4 = (int)(l2 << 32 >>> 48);
        int n5 = (int)(l2 << 48 >>> 48);
        this.b(n3, cD2, n, (short)n4, n2, n5);
    }




    static {
        block11: {
            block10: {
                op.db = _c.a((long)219595193224197738L, (long)6379687500543372760L, MethodHandles.lookup().lookupClass()).a(72847961535355L);
                var9 = op.db ^ 129835562815208L;
                op.ib = new HashMap<K, V>(13);
                op.b(null);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[24];
                var5_4 = 0;
                var4_5 = "L\u00b4wi6\u00a8((G\u0099\u0082\u008f\u00b3\u00f1v\b\u00ea\u009a\u00d13+20xf\u00d9\u00a6Z\u0012\u00f3Q3\u0018\u0006\"x\u00b8\u00f4r\u0081\u000f\u00be~\u00cd\u00fb?\u00da\u0081]6\u00c2W\u009b\u00f0\rx\u00eb0\u00cb#\u00b90c\u00a1\u001a\u0012`\u00f1@QbJ7\u00113\u00d9yfm\u0005T\u00afU\u00db\u00dd\u00a2\u00b4\u009dP.\u00e4\u00abo\u00f5\u00cd`f\t(\f\u00bd\u00ff\u00fca\u00d3\u009c\u0018\u0019\u008c\u00d7\u00bfz\u0096\u0015\u0086j\u00f0\u009d\u00d3\u00a2\u00b5\u00e2\u00a0\u00fbU\u0000\u00fe\u0005\u00bfJ:0\u00b5\u00d7\u00c2\u008co\u00a7cypD\u001e\u000b\u0080\u000erp\u0018\u0013N+\u00b4\u00ea\nb<6p\u00bb\u00dc\u00adK\t\u00cb4\u00d0\u0019\u0082\u0096*\u000bA\u00d7AZ\u000f\\L\u00fa\u0010p<m0\u00bc\u0010L\u0007\u0014\u008f\u00a4\u00b7C\u007f\\\f\u0010:\u001c9KUF\u00b0\u0085\u00fex\u00f4\u00ce[1\u00ddg(\u00f4\u00e2\u00f5\u0082@i\u0087\u0096\u00c3\u00db2\u00c5\u00ef\u0015\u001ds\u00e4\u00ebb\u00eb\u00e9U\b\u0010]\u00ac\u00a6;});&\u00de\u00b5\u00a0\u00f8l-\u00d3\u00a0\u0010\u00af\u00a1\u0095J)p\u00e9=o\u00d7\u0017\u00f0\u00de\u00d1l;8\u0083\u00fe\u00ec\u00ad\u00b3\u009a\u00a5A\u0018\u0006\u00dc\u000e\u00df\u00aad\u00ca&t\b_]\u00e2\u00ec\u0084\u0011\u00a3'\u008b\u001e|\u0099\u00ea.|7\u00181\u00ae\u00c6A\u00ea\u00ae\u008bg\t+\u000b\u00e2Z,\u00d8$\u00a5\u0088\u00a4\u001a\u0010.\u00b2ux\u00f6\u0016\u0087a\u009d\u00c3'\u00d5\u0086\u00e1\u00f8i(;#\u00eaP\u00c0IJ(\u00ee\u00cd\u00c5E3%m\u00b0z\b\u0017K\n\u00f9b\u0096\u00ec\u0085\u009c\u0099\u00ce\u00ce(\u0095\u00e8}-\u00cf\u00c0>\u00136\u0010a\u0097j\u00cb\u0091n\u00d2\u00a0Pj\u00c6!\u00faO\u0098N(\u001f\u0089A\u00a9\u00f72\u00dc\u0095\u00ca\u00ea\u00f6\u00ef\u00e5\u00e0\u0099,+z\u00e3\u00c4\u00ad7j#\u00fci\u00c6K\u009aK\u00c5\u00dd\u0084\u00e3\u0081G\u00d8\u0081\u00b7\u00a1\u0018\u0001\u00d8\u0097v\u00f4\u00fa(t\u00ab\u00cb\u000bpN:k9\u0089\u008e\u000f^\u001a\u00f8e\u00bd(\u00a0\u00d1\u0011\u000bl\u00a5M+\u00a4C\u009c!%\u00fe\u00e4\u00bb\u00fb\u00a8\u00e4\u00d7\u00cf\u00c8Ot>\u00e5\u009e8\u00c1f\n\u00afx\u009b\u00b2\u00e8\u00db\u00fe \u00c5(\u00c5\u00d6\u00c0W!@\u0094>m\u0096U\u00cbb\u00b3$]\u0092\u00f2\u0089\u0011\u00cd*\u0015\f\u0014\u00f1(\u0019g2\u00fa\u0090K\u00b5\u00b9\u0088\u0010\u00d0\u00df\u00c9 \u00a9x\u009f\u00b2\u009d\u00ab\u00b3K\u0004[\u008a\u00c0\u00ed\u0013a\u00c3\u008c)w\u00fd53\u00ff [S\u00f2\u00cb\u00b4\u0006\u00e0\u000f\u0010\u0098\u00d6\u00fe\u00cf\u0098 \f\u00e6\u00d6c\u00f3\u00b9\u00b7\u000e\u00d2\u0011\u0010\u00da\u00f0\u00dc\u00ae\u00ebI\u008fC\u00a9\u00fa\u0091\u001a+Sh\u00b9\u0018\u00acL\u001b\u001dx\u00a0(\u00c9n\u0099\u00a5\u008a\u008e\u00a7\u0094\u00b0\u00ee&Y'\u00b8\bq\u00aaP\u00de(\u00c6,\u009b\u00df\u00b3 h\u00f1\u00d2\u001b\u00d2\u0080_\u007f[<|\u00c7\u00c8a\u00bd\u00dc\u00ebp\u00b6\u00bd\u00b8\t\u00bbk\u00ca\u000b^\u00ef\u008bpg\u00a6\u0093\u008d<\u008a\b]m\u008f\u00efF| 4\t9\u00ff\u00807b\u001b\u001f\u00bc\u0083V7I\u007fK\r\u0010\u0013S\u0010\u00b2\u00d7\u00f7sI\u00d87";
                var6_6 = "L\u00b4wi6\u00a8((G\u0099\u0082\u008f\u00b3\u00f1v\b\u00ea\u009a\u00d13+20xf\u00d9\u00a6Z\u0012\u00f3Q3\u0018\u0006\"x\u00b8\u00f4r\u0081\u000f\u00be~\u00cd\u00fb?\u00da\u0081]6\u00c2W\u009b\u00f0\rx\u00eb0\u00cb#\u00b90c\u00a1\u001a\u0012`\u00f1@QbJ7\u00113\u00d9yfm\u0005T\u00afU\u00db\u00dd\u00a2\u00b4\u009dP.\u00e4\u00abo\u00f5\u00cd`f\t(\f\u00bd\u00ff\u00fca\u00d3\u009c\u0018\u0019\u008c\u00d7\u00bfz\u0096\u0015\u0086j\u00f0\u009d\u00d3\u00a2\u00b5\u00e2\u00a0\u00fbU\u0000\u00fe\u0005\u00bfJ:0\u00b5\u00d7\u00c2\u008co\u00a7cypD\u001e\u000b\u0080\u000erp\u0018\u0013N+\u00b4\u00ea\nb<6p\u00bb\u00dc\u00adK\t\u00cb4\u00d0\u0019\u0082\u0096*\u000bA\u00d7AZ\u000f\\L\u00fa\u0010p<m0\u00bc\u0010L\u0007\u0014\u008f\u00a4\u00b7C\u007f\\\f\u0010:\u001c9KUF\u00b0\u0085\u00fex\u00f4\u00ce[1\u00ddg(\u00f4\u00e2\u00f5\u0082@i\u0087\u0096\u00c3\u00db2\u00c5\u00ef\u0015\u001ds\u00e4\u00ebb\u00eb\u00e9U\b\u0010]\u00ac\u00a6;});&\u00de\u00b5\u00a0\u00f8l-\u00d3\u00a0\u0010\u00af\u00a1\u0095J)p\u00e9=o\u00d7\u0017\u00f0\u00de\u00d1l;8\u0083\u00fe\u00ec\u00ad\u00b3\u009a\u00a5A\u0018\u0006\u00dc\u000e\u00df\u00aad\u00ca&t\b_]\u00e2\u00ec\u0084\u0011\u00a3'\u008b\u001e|\u0099\u00ea.|7\u00181\u00ae\u00c6A\u00ea\u00ae\u008bg\t+\u000b\u00e2Z,\u00d8$\u00a5\u0088\u00a4\u001a\u0010.\u00b2ux\u00f6\u0016\u0087a\u009d\u00c3'\u00d5\u0086\u00e1\u00f8i(;#\u00eaP\u00c0IJ(\u00ee\u00cd\u00c5E3%m\u00b0z\b\u0017K\n\u00f9b\u0096\u00ec\u0085\u009c\u0099\u00ce\u00ce(\u0095\u00e8}-\u00cf\u00c0>\u00136\u0010a\u0097j\u00cb\u0091n\u00d2\u00a0Pj\u00c6!\u00faO\u0098N(\u001f\u0089A\u00a9\u00f72\u00dc\u0095\u00ca\u00ea\u00f6\u00ef\u00e5\u00e0\u0099,+z\u00e3\u00c4\u00ad7j#\u00fci\u00c6K\u009aK\u00c5\u00dd\u0084\u00e3\u0081G\u00d8\u0081\u00b7\u00a1\u0018\u0001\u00d8\u0097v\u00f4\u00fa(t\u00ab\u00cb\u000bpN:k9\u0089\u008e\u000f^\u001a\u00f8e\u00bd(\u00a0\u00d1\u0011\u000bl\u00a5M+\u00a4C\u009c!%\u00fe\u00e4\u00bb\u00fb\u00a8\u00e4\u00d7\u00cf\u00c8Ot>\u00e5\u009e8\u00c1f\n\u00afx\u009b\u00b2\u00e8\u00db\u00fe \u00c5(\u00c5\u00d6\u00c0W!@\u0094>m\u0096U\u00cbb\u00b3$]\u0092\u00f2\u0089\u0011\u00cd*\u0015\f\u0014\u00f1(\u0019g2\u00fa\u0090K\u00b5\u00b9\u0088\u0010\u00d0\u00df\u00c9 \u00a9x\u009f\u00b2\u009d\u00ab\u00b3K\u0004[\u008a\u00c0\u00ed\u0013a\u00c3\u008c)w\u00fd53\u00ff [S\u00f2\u00cb\u00b4\u0006\u00e0\u000f\u0010\u0098\u00d6\u00fe\u00cf\u0098 \f\u00e6\u00d6c\u00f3\u00b9\u00b7\u000e\u00d2\u0011\u0010\u00da\u00f0\u00dc\u00ae\u00ebI\u008fC\u00a9\u00fa\u0091\u001a+Sh\u00b9\u0018\u00acL\u001b\u001dx\u00a0(\u00c9n\u0099\u00a5\u008a\u008e\u00a7\u0094\u00b0\u00ee&Y'\u00b8\bq\u00aaP\u00de(\u00c6,\u009b\u00df\u00b3 h\u00f1\u00d2\u001b\u00d2\u0080_\u007f[<|\u00c7\u00c8a\u00bd\u00dc\u00ebp\u00b6\u00bd\u00b8\t\u00bbk\u00ca\u000b^\u00ef\u008bpg\u00a6\u0093\u008d<\u008a\b]m\u008f\u00efF| 4\t9\u00ff\u00807b\u001b\u001f\u00bc\u0083V7I\u007fK\r\u0010\u0013S\u0010\u00b2\u00d7\u00f7sI\u00d87".length();
                var3_7 = 32;
                var2_8 = -1;
lbl21:


                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:


                while (true) {
                    var7_3[var5_4++] = op.c(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u001cu\u00a1g\u00c7\u00ce6\u00a5\u0016\u00925_c\u0000\u001c\u00d4\u0010\u00f8b\u0010#0\u00a8\t\u0092\u008d\u0017\u000fWP\u001e]\u0091";
                    var6_6 = "\u001cu\u00a1g\u00c7\u00ce6\u00a5\u0016\u00925_c\u0000\u001c\u00d4\u0010\u00f8b\u0010#0\u00a8\t\u0092\u008d\u0017\u000fWP\u001e]\u0091".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl35:


                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:


                while (true) {
                    var7_3[var5_4++] = op.c(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:


                ** continue;
            }
        }
        op.gb = var7_3;
        op.hb = new String[24];
        op.k = LogManager.getLogger();
        op.v = Sets.newHashSet((Object[])new String[]{op.a("a", (int)19089, (long)(6511797558780812694L ^ var9)), op.a("a", (int)26981, (long)(5482956535901388407L ^ var9))});
        op.h = Splitter.on((char)'\n');
    }

    public static void b(String[] stringArray) {
        o = stringArray;
    }

    public static String[] h() {
        return o;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x288B;
        if (hb[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])ib.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ib.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("op", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = gb[n2].getBytes("ISO-8859-1");
            op.hb[n2] = op.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return hb[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = op.a(n, l);
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
            throw new RuntimeException("op" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(op.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
