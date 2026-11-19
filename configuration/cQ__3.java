import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
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

public class cQ {
    private final Gson a;
    private final qT<lh> d;
    public String c;
    private static String b;
    private static final long e;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public cQ(short s, int n, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ e;
        long l2 = l ^ 0x482C0FA43328L;
        int n2 = (int)(l2 >>> 48);
        int n3 = (int)(l2 << 16 >>> 32);
        int n4 = (int)(l2 << 48 >>> 48);
        this.c = cQ.a("t", (int)30739, (long)(0x713F5579594B6EF0L ^ l));
        this.a = new GsonBuilder().setPrettyPrinting().create();
        String string = cQ.b();
        try {
            this.d = tf.m();
            Nh.a((Path)Nh.a((char)((char)n2), (int)n3, (short)((short)n4)));
            if (LQ.J() != null) {
                cQ.b("SdScH");
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw cQ.a(numberFormatException);
        }
    }




    public boolean d(int var1_1, String var2_2, short var3_3, short var4_4) {
























        throw new IllegalStateException("Decompilation failed");
    }





    public boolean c(int var1_1, short var2_2, String var3_3, int var4_4) {
        block26: {
            block24: {
                block25: {
                    block22: {
                        block23: {
                            v0 = var5_5 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ cQ.e;
                            v1 = v0 ^ 5653546336700L;
                            var7_6 = (int)(v1 >>> 48);
                            var8_7 = (int)(v1 << 16 >>> 48);
                            var9_8 = (int)(v1 << 32 >>> 32);
                            v2 = v0 ^ 138784480724117L;
                            var10_9 = (int)(v2 >>> 48);
                            var11_10 = (int)(v2 << 16 >>> 32);
                            var12_11 = (int)(v2 << 48 >>> 48);
                            v3 = v0 ^ 96209670214936L;
                            var13_12 = v3 >>> 8;
                            var15_13 = (int)(v3 << 56 >>> 56);
                            var17_14 = Nh.a((char)((char)var7_6), (short)((short)var8_7), (int)var9_8, (String)var3_3);
                            var16_15 = cQ.b();
                            try {
                                try {
                                    v4 = var17_14;
                                    if (var16_15 == null) break block22;
                                    if (v4.exists()) break block23;
                                }
                                catch (NumberFormatException v5) {
                                    throw cQ.a(v5);
                                }
                                return false;
                            }
                            catch (NumberFormatException v6) {
                                throw cQ.a(v6);
                            }
                        }
                        v4 = var17_14;
                    }
                    var18_16 = Nh.a((File)v4);
                    var19_17 = (JsonArray)this.a.fromJson(var18_16, JsonArray.class);
                    try {
                        try {
                            v7 = var19_17;
                            if (var16_15 == null) break block24;
                            if (v7 != null) break block25;
                        }
                        catch (NumberFormatException v8) {
                            throw cQ.a(v8);
                        }
                        return false;
                    }
                    catch (NumberFormatException v9) {
                        throw cQ.a(v9);
                    }
                }
                v7 = var19_17;
            }
            for (E v10 : v7) {
                block17: while (true) {
                    var21_19 = (JsonElement)v10   ;
                    var22_20 = var21_19.getAsJsonObject();
                    if (var16_15 == null) break block26;
                    block18: for (String v11 : var22_20.keySet()) {
                        do {
                            block27: {
                                block28: {
                                    block29: {
                                        var24_22 = v11;
                                        var25_23 = var22_20.getAsJsonObject(var24_22);
                                        var26_24 = this.d.a(var24_22);
                                        v10    = var26_24;
                                        if (var16_15 == null) continue block17;
                                        try {
                                            if (var2_2 > 0) ** break;
                                            continue block17;
                                            if (v10    == null && var16_15 != null) continue block18;
                                        }
                                        catch (NumberFormatException v12) {
                                            throw cQ.a(v12);
                                        }
                                        var27_25 = var25_23.get((String)cQ.a("t", (int)19628, (long)(648500031613000093L ^ var5_5))).getAsInt();
                                        var28_26 = var25_23.get((String)cQ.a("t", (int)21058, (long)(5417879969536034678L ^ var5_5))).getAsBoolean();
                                        var29_27 = var25_23.get((String)cQ.a("t", (int)11640, (long)(4101172563898808394L ^ var5_5))).getAsBoolean();
                                        try {
                                            try {
                                                var26_24.a(var27_25);
                                                if (var2_2 < 0) break block27;
                                                v13 = var26_24;
                                                if (var16_15 == null) break block28;
                                                if (v13.b() == var28_26) break block29;
                                            }
                                            catch (NumberFormatException v14) {
                                                throw cQ.a(v14);
                                            }
                                            var26_24.c((short)var10_9, var11_10, var12_11);
                                        }
                                        catch (NumberFormatException v15) {
                                            throw cQ.a(v15);
                                        }
                                    }
                                    v13 = var26_24;
                                }
                                v13.a(var29_27);
                            }
                            var30_28 = var25_23.getAsJsonArray((String)cQ.a("t", (int)19339, (long)(7370996327369334455L ^ var5_5)));
                            try {
                                if (var2_2 > 0 && var30_28 != null) {
                                    this.a(var26_24, var13_12, var30_28, (byte)var15_13);
                                }
                            }
                            catch (NumberFormatException v16) {
                                throw cQ.a(v16);
                            }
                            if (var16_15 != null) continue block18;
                            v11 = var16_15;
                        } while (var1_1 < 0);
                    }
                    break;
                }
                if (v11 != null) continue;
            }
            this.c = var3_3;
            if (var2_2 > 0) {

            }
        }
        return true;
    }

    public boolean a(int n, char c, String string, int n2) {
        boolean bl;
        block4: {
            File file;
            block5: {
                long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ e;
                long l2 = l ^ 0x2873CCA4AAB9L;
                int n3 = (int)(l2 >>> 48);
                int n4 = (int)(l2 << 16 >>> 48);
                int n5 = (int)(l2 << 32 >>> 32);
                file = Nh.a((char)((char)n3), (short)((short)n4), (int)n5, (String)string);
                String string2 = cQ.b();
                try {
                    try {
                        bl = file.exists();
                        if (string2 == null) break block4;
                        if (bl) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw cQ.a(numberFormatException);
                    }
                    return false;
                }
                catch (NumberFormatException numberFormatException) {
                    throw cQ.a(numberFormatException);
                }
            }
            bl = file.delete();
        }
        return bl;
    }







    public List c(int n, int n2, byte by) {
        ArrayList<String> arrayList;
        File[] fileArray;
        ArrayList<String> arrayList2;
        String string;
        long l;
        block10: {
            l = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ e;
            long l2 = l ^ 0x1945A9F79481L;
            int n3 = (int)(l2 >>> 48);
            int n4 = (int)(l2 << 16 >>> 32);
            int n5 = (int)(l2 << 48 >>> 48);
            File file = Nh.a((char)((char)n3), (int)n4, (short)((short)n5)).toFile();
            string = cQ.b();
            arrayList2 = new ArrayList<String>();
            File[] fileArray2 = file.listFiles(cQ::lambda$listConfigs$0);
            try {
                try {
                    fileArray = fileArray2;
                    if (string == null) break block10;
                    if (fileArray == null) {
                        return arrayList2;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw cQ.a(numberFormatException);
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw cQ.a(numberFormatException);
            }
            fileArray = fileArray2;
        }
        block6: for (File file : fileArray) {
            try {
                do {
                    arrayList = arrayList2;
                    String string2 = string;
                    if (n2 > 0) {
                        if (string2 == null) return arrayList;
                        string2 = file.getName().replace((CharSequence)((Object)cQ.a("t", (int)2576, (long)(0x256A1A74505BB50L ^ l))), "");
                    }
                    arrayList.add(string2);
                    if (string != null) continue block6;
                } while (by <= 0);
                break;
            }
            catch (NumberFormatException numberFormatException) {
                throw cQ.a(numberFormatException);
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }








    private void a(lh var1_1, long var2_2, JsonArray var4_3, byte var5_4) {
        v0 = var6_5 = (var2_2 << 8 | (long)var5_4 << 56 >>> 56) ^ cQ.e;
        v1 = v0 ^ 126519266535928L;
        var8_6 = (int)(v1 >>> 32);
        var9_7 = (int)(v1 << 32 >>> 48);
        var10_8 = (int)(v1 << 48 >>> 48);
        v2 = v0 ^ 137589546992140L;
        var11_9 = (int)(v2 >>> 32);
        var12_10 = (int)(v2 << 32 >>> 48);
        var13_11 = (int)(v2 << 48 >>> 48);
        var15_12 = var4_3.iterator();
        var14_13 = cQ.b();
        block18: while (var15_12.hasNext() != false) {
            block29: {
                block30: {
                    block31: {
                        block32: {
                            block25: {
                                var16_14 = (JsonElement)var15_12.next();
                                var17_15 = var16_14.getAsJsonObject();
                                var18_16 = var17_15.get((String)cQ.a("t", (int)22594, (long)(9114157921382542849L ^ var6_5))).getAsString();
                                v3 = var1_1.a(var18_16);
                                block19: while (true) {
                                    v4 = var19_17 = v3;
                                    block20: while (true) {
                                        block28: {
                                            block26: {
                                                if (v4 == null) continue block18;
                                                try {
                                                    v5 = var17_15.has((String)cQ.a("t", (int)14191, (long)(8977292504082661664L ^ var6_5)));
                                                    if (var5_4 <= 0 || var14_13 == null) break block25;
                                                    if (v5) {
                                                    }
                                                    ** GOTO lbl89
                                                }
                                                catch (NumberFormatException v6) {
                                                    throw cQ.a(v6);
                                                }
                                                var20_18 = var17_15.getAsJsonArray((String)cQ.a("t", (int)14191, (long)(8977292504082661664L ^ var6_5)));
                                                var21_19 = var19_17.i();
                                                try {
                                                    try {
                                                        block27: {
                                                            try {
                                                                try {
                                                                    v7 = var21_19 instanceof wK;
                                                                    if (var14_13 == null) break block26;
                                                                    if (!v7) break block27;
                                                                }
                                                                catch (NumberFormatException v8) {
                                                                    throw cQ.a(v8);
                                                                }
                                                                this.a((wK)var21_19, var11_9, var12_10, (short)var13_11, (JsonArray)var20_18);
                                                                v9 = var14_13;
                                                                if (var5_4 > 0) {
                                                                    if (v9 != null) break block19;
                                                                }
                                                                ** GOTO lbl87
                                                            }
                                                            catch (NumberFormatException v10) {
                                                                throw cQ.a(v10);
                                                            }
                                                        }
                                                        v11 = var21_19;
                                                        if (var14_13 == null) break block28;
                                                    }
                                                    catch (NumberFormatException v12) {
                                                        throw cQ.a(v12);
                                                    }
                                                    v7 = v11 instanceof qK;
                                                }
                                                catch (NumberFormatException v13) {
                                                    throw cQ.a(v13);
                                                }
                                            }
                                            if (!v7) break block19;
                                            v11 = var21_19;
                                        }
                                        var22_20 = (qK)v11;
                                        var23_21 = var20_18.iterator();
                                        while (var23_21.hasNext()) {
                                            var24_22 = (JsonElement)var23_21.next();
                                            var25_23 = var24_22.getAsJsonObject();
                                            var26_24 = var25_23.get((String)cQ.a("t", (int)22594, (long)(9114157921382542849L ^ var6_5))).getAsString();
                                            var27_25 = var25_23.get((String)cQ.a("t", (int)25945, (long)(4003491093015925519L ^ var6_5))).getAsString();
                                            v4 = var28_26 = var22_20.b(var26_24);
                                            if (var14_13 == null) continue block20;
                                            try {
                                                if (var2_2 < 0L) continue block19;
                                                if (v4 != null) {
                                                    this.a(var28_26, var8_6, (char)var9_7, var27_25, (short)var10_8);
                                                }
                                            }
                                            catch (NumberFormatException v14) {
                                                throw cQ.a(v14);
                                            }
                                            if (var14_13 != null) continue;
                                        }
                                        break block19;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    try {
                                        v9 = var14_13;
                                        if (var2_2 <= 0L) break block29;
lbl87:


                                        if (var2_2 <= 0L) break block29;
                                        if (v9 != null) break block30;
lbl89:


                                        v15 = var17_15;
                                        if (var2_2 <= 0L) break block31;
                                        v16 = cQ.a("t", (int)25945, (long)(4003491093015925519L ^ var6_5));
                                        if (var14_13 == null) break block32;
                                    }
                                    catch (NumberFormatException v17) {
                                        throw cQ.a(v17);
                                    }
                                    v5 = v15.has((String)v16);
                                }
                                catch (NumberFormatException v18) {
                                    throw cQ.a(v18);
                                }
                            }
                            try {
                                if (!v5) break block30;
                                v19 = var17_15;
                                v16 = cQ.a("t", (int)25945, (long)(4003491093015925519L ^ var6_5));
                            }
                            catch (NumberFormatException v20) {
                                throw cQ.a(v20);
                            }
                        }
                        v15 = v19.get((String)v16);
                    }
                    var20_18 = v15.getAsString();
                    this.a(var19_17, var8_6, (char)var9_7, var20_18, (short)var10_8);
                }
                v9 = var14_13;
            }
            if (v9 == null) return;
        }
    }

    private JsonObject a(wK wK2, int n, byte by, int n2) {
        JsonObject jsonObject;
        block13: {
            long l = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ e;
            long l2 = l ^ 0x5ABAF9A7F661L;
            int n3 = (int)(l2 >>> 32);
            int n4 = (int)(l2 << 32 >>> 56);
            int n5 = (int)(l2 << 40 >>> 40);
            jsonObject = new JsonObject();
            String string = cQ.b();
            jsonObject.addProperty((String)((Object)cQ.a("t", (int)25213, (long)(0x33F79669BD2FCE97L ^ l))), wK2.b());
            JsonArray jsonArray = new JsonArray();
            for (kt kt2 : wK2.a()) {
                String string2;
                block17: {
                    block18: {
                        Object object;
                        block16: {
                            block14: {
                                block15: {
                                    object = kt2.i();
                                    try {
                                        try {
                                            try {
                                                string2 = string;
                                                if (n >= 0) {
                                                    if (string2 == null) break block13;
                                                    string2 = string;
                                                }
                                                if (n <= 0) break block14;
                                                if (string2 == null) break block15;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw cQ.a(numberFormatException);
                                            }
                                            if (!(object instanceof wK)) break block16;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw cQ.a(numberFormatException);
                                        }
                                        jsonArray.add((JsonElement)this.a((wK)object, n3, (byte)n4, n5));
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw cQ.a(numberFormatException);
                                    }
                                }
                                string2 = string;
                            }
                            if (n2 < 0) break block17;
                            if (string2 != null) break block18;
                        }
                        JsonObject jsonObject2 = new JsonObject();
                        jsonObject2.addProperty((String)((Object)cQ.a("t", (int)22594, (long)(0x7E7BA65AB0E274A7L ^ l))), kt2.r());
                        jsonObject2.addProperty((String)((Object)cQ.a("t", (int)29619, (long)(0x14AFF22C1EFADF53L ^ l))), object.toString());
                        jsonArray.add((JsonElement)jsonObject2);
                    }
                    string2 = string;
                }
                if (string2 != null) continue;
            }
            jsonObject.add((String)((Object)cQ.a("t", (int)16863, (long)(0x7AC0803E125D6D33L ^ l))), (JsonElement)jsonArray);
            if (n2 >= 0) {

            }
        }
        return jsonObject;
    }




    private void a(wK var1_1, int var2_2, int var3_3, short var4_4, JsonArray var5_5) {
        v0 = var6_6 = ((long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var4_4 << 48 >>> 48) ^ cQ.e;
        v1 = v0 ^ 92944808107413L;
        var8_7 = (int)(v1 >>> 32);
        var9_8 = (int)(v1 << 32 >>> 48);
        var10_9 = (int)(v1 << 48 >>> 48);
        v2 = v0 ^ 99759098951265L;
        var11_10 = (int)(v2 >>> 32);
        var12_11 = (int)(v2 << 32 >>> 48);
        var13_12 = (int)(v2 << 48 >>> 48);
        var15_13 = var5_5.iterator();
        var14_14 = cQ.b();
        block14: while (true) {
            v3 = var15_13.hasNext();
            block15: while (v3) {
                var16_15 = (JsonElement)var15_13.next();
                var17_16 = var16_15.getAsJsonObject();
                var18_17 = var17_16.get((String)cQ.a("t", (int)22594, (long)(9114117753381624428L ^ var6_6))).getAsString();
                block16: for (kt var20_19 : var1_1.a()) {
                    v3 = var20_19.r().equals(var18_17);
                    if (var2_2 < 0) continue block15;
                    v4 = var14_14;
                    while (v4 != null) {
                        block21: {
                            block19: {
                                block20: {
                                    try {
                                        v4 = var14_14;
                                        if (var4_4 <= 0) continue;
                                        if (var4_4 > 0) {
                                            if (v4 == null) break block19;
                                            if (v3) break block20;
                                        }
                                        ** GOTO lbl46
                                    }
                                    catch (NumberFormatException v5) {
                                        throw cQ.a(v5);
                                    }
                                    if (var4_4 >= 0) continue block16;
                                }
                                v6 = var17_16.has((String)cQ.a("t", (int)14191, (long)(8977249030835467597L ^ var6_6)));
                            }
                            try {
                                block22: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v7 = var14_14;
lbl46:


                                                    if (v7 == null) break block21;
                                                    if (!v6) break block22;
                                                }
                                                catch (NumberFormatException v8) {
                                                    throw cQ.a(v8);
                                                }
                                                v6 = var20_19.i() instanceof wK;
                                                if (var3_3 < 0 || var14_14 == null) break block21;
                                            }
                                            catch (NumberFormatException v9) {
                                                throw cQ.a(v9);
                                            }
                                            if (var2_2 < 0) break block21;
                                            if (!v6) break block22;
                                        }
                                        catch (NumberFormatException v10) {
                                            throw cQ.a(v10);
                                        }
                                        this.a((wK)var20_19.i(), var11_10, var12_11, (short)var13_12, var17_16.getAsJsonArray((String)cQ.a("t", (int)14191, (long)(8977249030835467597L ^ var6_6))));
                                        v11 = var14_14;
                                        if (var3_3 <= 0) continue block14;
                                        if (v11 != null) break block16;
                                    }
                                    catch (NumberFormatException v12) {
                                        throw cQ.a(v12);
                                    }
                                }
                                v6 = var17_16.has((String)cQ.a("t", (int)25945, (long)(4003531198756464482L ^ var6_6)));
                            }
                            catch (NumberFormatException v13) {
                                throw cQ.a(v13);
                            }
                        }
                        try {
                            if (!v6) break block16;
                            this.a(var20_19, var8_7, (char)var9_8, var17_16.get((String)cQ.a("t", (int)25945, (long)(4003531198756464482L ^ var6_6))).getAsString(), (short)var10_9);
                            break block16;
                        }
                        catch (NumberFormatException v14) {
                            throw cQ.a(v14);
                        }
                    }
                    continue block15;
                }
                {
                    v11 = var14_14;
                    if (v11 != null) continue block14;
                    break;
                }
            }
            break;
        }
    }





    private void a(kt var1_1, int var2_2, char var3_3, String var4_4, short var5_5) {
        block31: {
            block35: {
                block33: {
                    block32: {
                        block30: {
                            block37: {
                                var6_6 = ((long)var2_2 << 32 | (long)var3_3 << 48 >>> 32 | (long)var5_5 << 48 >>> 48) ^ cQ.e;
                                v0 = var6_6 ^ 77280714127092L;
                                var8_7 = v0 >>> 32;
                                var10_8 = (int)(v0 << 32 >>> 32);
                                var12_9 = var1_1.i();
                                var11_10 = cQ.b();
                                v1 = var12_9 instanceof Boolean;
                                if (var11_10 == null) break block30;
                                if (!v1) ** GOTO lbl24
                                break block37;
                                catch (NumberFormatException v2) {
                                    throw cQ.a(v2);
                                }
                            }
                            try {
                                block38: {
                                    var1_1.a((Object)Boolean.parseBoolean(var4_4));
                                    if (var11_10 != null) break block31;
                                    break block38;
                                    catch (NumberFormatException v3) {
                                        throw cQ.a(v3);
                                    }
                                }
                                v1 = var12_9 instanceof Number;
                            }
                            catch (NumberFormatException v4) {
                                throw cQ.a(v4);
                            }
                        }
                        try {
                            v5 = var11_10;
                            if (var2_2 <= 0) ** GOTO lbl60
                            if (v5 == null) break block32;
                            if (v1) {
                            }
                            ** GOTO lbl49
                        }
                        catch (NumberFormatException v6) {
                            throw cQ.a(v6);
                        }
                        try {
                            var13_11 = cQ.e(var4_4);
                            var1_1.a((Object)((Number)var13_11));
                            break block31;
                        }
                        catch (NumberFormatException var13_12) {
                            try {
                                block39: {
                                    v7 = var11_10;
                                    if (var2_2 >= 0) {
                                        if (v7 != null) break block31;
                                    }
                                    break block39;
lbl49:


                                    v7 = var12_9;
                                }
                                v1 = v7 instanceof String;
                            }
                            catch (NumberFormatException v8) {
                                throw cQ.a(v8);
                            }
                        }
                    }
                    try {
                        block34: {
                            try {
                                try {
                                    v5 = var11_10;
lbl60:


                                    if (var2_2 >= 0) {
                                        if (v5 == null) break block33;
                                        if (!v1) break block34;
                                    }
                                    ** GOTO lbl83
                                }
                                catch (NumberFormatException v9) {
                                    throw cQ.a(v9);
                                }
                                var1_1.a((Object)var4_4);
                                if (var11_10 != null) break block31;
                            }
                            catch (NumberFormatException v10) {
                                throw cQ.a(v10);
                            }
                        }
                        v1 = var12_9 instanceof RB;
                    }
                    catch (NumberFormatException v11) {
                        throw cQ.a(v11);
                    }
                }
                try {
                    block36: {
                        try {
                            try {
                                if (var5_5 >= 0) break block35;
                                v5 = var11_10;
lbl83:


                                if (v5 == null) break block35;
                                if (!v1) break block36;
                            }
                            catch (NumberFormatException v12) {
                                throw cQ.a(v12);
                            }
                            ((RB)var12_9).a(var4_4);
                            if (var11_10 != null) break block31;
                        }
                        catch (NumberFormatException v13) {
                            throw cQ.a(v13);
                        }
                    }
                    v1 = var12_9 instanceof Kh;
                }
                catch (NumberFormatException v14) {
                    throw cQ.a(v14);
                }
            }
            try {
                if (v1) {
                    var1_1.a((Object)Kh.a((long)var8_7, (int)var10_8, (String)var4_4));
                }
            }
            catch (NumberFormatException v15) {
                throw cQ.a(v15);
            }
        }
    }

    public static Object e(String string) {
        int n;
        block4: {
            block5: {
                String string2 = cQ.b();
                try {
                    try {
                        n = string.contains(".");
                        if (string2 == null) break block4;
                        if (n == 0) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw cQ.a(numberFormatException);
                    }
                    return Float.valueOf(Float.parseFloat(string));
                }
                catch (NumberFormatException numberFormatException) {
                    throw cQ.a(numberFormatException);
                }
            }
            n = Integer.parseInt(string);
        }
        return n;
    }

    private static boolean lambda$listConfigs$0(File file, String string) {
        long l = e ^ 0x2BCFEB51DD12L;
        return string.endsWith((String)((Object)cQ.a("t", (int)4165, (long)(0x2ABD35001AC63541L ^ l))));
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }




    static {
        block11: {
            block10: {
                cQ.e = _c.a((long)6487891984240077706L, (long)-2003157898167965505L, MethodHandles.lookup().lookupClass()).a(279974663445370L);
                cQ.h = new HashMap<K, V>(13);
                cQ.b("p4XT1");
                var0 = cQ.e ^ 101896696191792L;
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
                var9_3 = new String[18];
                var7_4 = 0;
                var6_5 = "`7\u00e4e?\u00b1N\u00ca\u009e\u00cc\u0013\u00bf\u00d6\u008b\u0083\u0082\u0015\u00ebS3\u00d4+\u00a9@m\u00ad\u00ea`9?Y\u0016\u0010D%4!Q\u00b8-\u00f0Z9\u00f3\u00e0\u00ae\u0019\u00f4\u0007\u0010\u0004\u00ad?\u0000,\\\r\u00e7%\u00c7c\u00f0e\u0017\u00aa\u00cd\u0010i\u00e7\u0086\u00e4v\u00f0\u00be\u0098\u00e4/t\u00a4\u009f\u00e3\u009b\u00c9\u0010M\u00d7O\u00d3r\u00b1\u0003z\u00ec4\u009c\u00d1\u00e8\r\u001b\u00b3 r=\u00efz\u00db0Y\u001e4\u0014\u00edj\u00b9R$\u0006\u00d4\u00d7Y\u00bbQ\u00e1+b8+\u00a9\u00be\u00a4\u00d4\u00e6\u0013\u0010\u0094\u00fdXT\u00ad\r\u00cb\u0001z\u00c3Eh]\u0090\u0089\u00cf\u0010\u00d4V\u00bd\u00d4uP23;8\u0090K/*|:\u0010\u00ea_\u00a18\u0092\u00b1\u00b1A1\u009c|\u0010A\u00f6[  \u008d\u00b5\u008a\u00f9\t\u00ae\u0080V\u00e9\u00c0\u008c\u0019\u0097U!\u0012\u00a2/z\u00e7\u008d\u001e\u0086b\u001ex$N\u001c\u00f6\u008eQ c\u00e9\u00d0>\u00b3\u00d0K\u00bd\u009f\u00d2\"\u00feb8\n\u00e9\u00fd\u0011|1<\u00d8Gm\u00ec\u00ed\u00f1\u0091lgVR\u0010\u0086\u00f1\u00ed\\\u00aa\u0082\u00e1\u00ef\n\u00f0\u0088K\u00dd\u0084\u009cu \u00ca\u009c\u00b0:3\u008e\u00e3\u0018P\u00da\u00a2\u000e\u008d\u009a\u00e0\u0096B\u00efs\u00cf\u00ad\u00cf\u00a1p\u00c2T\u00f1[q$\u00c5\u008f\u0010H\u0096\u00c5j\u00a9\u0082u:\u0093\u00b6p\u00d6\u0095\u00f8\u00fb\u00a4\u0010\u00a6zG\u000bN\u0014\u00bd\u00b0\u00a1^Y\u0001\u00a3\u00a1\u0014\u0094\u0010T\f\\\u00fddO\u00ca\u0012\u00ea\u00b9B\u001a\u001ds#/";
                var8_6 = "`7\u00e4e?\u00b1N\u00ca\u009e\u00cc\u0013\u00bf\u00d6\u008b\u0083\u0082\u0015\u00ebS3\u00d4+\u00a9@m\u00ad\u00ea`9?Y\u0016\u0010D%4!Q\u00b8-\u00f0Z9\u00f3\u00e0\u00ae\u0019\u00f4\u0007\u0010\u0004\u00ad?\u0000,\\\r\u00e7%\u00c7c\u00f0e\u0017\u00aa\u00cd\u0010i\u00e7\u0086\u00e4v\u00f0\u00be\u0098\u00e4/t\u00a4\u009f\u00e3\u009b\u00c9\u0010M\u00d7O\u00d3r\u00b1\u0003z\u00ec4\u009c\u00d1\u00e8\r\u001b\u00b3 r=\u00efz\u00db0Y\u001e4\u0014\u00edj\u00b9R$\u0006\u00d4\u00d7Y\u00bbQ\u00e1+b8+\u00a9\u00be\u00a4\u00d4\u00e6\u0013\u0010\u0094\u00fdXT\u00ad\r\u00cb\u0001z\u00c3Eh]\u0090\u0089\u00cf\u0010\u00d4V\u00bd\u00d4uP23;8\u0090K/*|:\u0010\u00ea_\u00a18\u0092\u00b1\u00b1A1\u009c|\u0010A\u00f6[  \u008d\u00b5\u008a\u00f9\t\u00ae\u0080V\u00e9\u00c0\u008c\u0019\u0097U!\u0012\u00a2/z\u00e7\u008d\u001e\u0086b\u001ex$N\u001c\u00f6\u008eQ c\u00e9\u00d0>\u00b3\u00d0K\u00bd\u009f\u00d2\"\u00feb8\n\u00e9\u00fd\u0011|1<\u00d8Gm\u00ec\u00ed\u00f1\u0091lgVR\u0010\u0086\u00f1\u00ed\\\u00aa\u0082\u00e1\u00ef\n\u00f0\u0088K\u00dd\u0084\u009cu \u00ca\u009c\u00b0:3\u008e\u00e3\u0018P\u00da\u00a2\u000e\u008d\u009a\u00e0\u0096B\u00efs\u00cf\u00ad\u00cf\u00a1p\u00c2T\u00f1[q$\u00c5\u008f\u0010H\u0096\u00c5j\u00a9\u0082u:\u0093\u00b6p\u00d6\u0095\u00f8\u00fb\u00a4\u0010\u00a6zG\u000bN\u0014\u00bd\u00b0\u00a1^Y\u0001\u00a3\u00a1\u0014\u0094\u0010T\f\\\u00fddO\u00ca\u0012\u00ea\u00b9B\u001a\u001ds#/".length();
                var5_7 = 32;
                var4_8 = -1;
lbl21:


                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:


                while (true) {
                    var9_3[var7_4++] = cQ.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "l\te\u00a1\u00db\u008c\u008e\u00c3\u00cc\u00bd\u008c\u00ec\u00d0\u0082\u00e2\u00ac\u00b4\u0000\u00de\u00a9\u001a\u0091myq\u0001\u00e7\u00e3IR\u00d9\u0081\u0010D'\u00dc\u0014\b\u00b9\u00efiM\u00b7Z\u00b2\u00be\u00f0\u00d4\u0086";
                    var8_6 = "l\te\u00a1\u00db\u008c\u008e\u00c3\u00cc\u00bd\u008c\u00ec\u00d0\u0082\u00e2\u00ac\u00b4\u0000\u00de\u00a9\u001a\u0091myq\u0001\u00e7\u00e3IR\u00d9\u0081\u0010D'\u00dc\u0014\b\u00b9\u00efiM\u00b7Z\u00b2\u00be\u00f0\u00d4\u0086".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl35:


                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:


                while (true) {
                    var9_3[var7_4++] = cQ.a(var10_9).intern();
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
lbl52:


                ** continue;
            }
        }
        cQ.f = var9_3;
        cQ.g = new String[18];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE78;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("cQ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            cQ.g[n2] = cQ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cQ.a(n, l);
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
            throw new RuntimeException("cQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cQ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
