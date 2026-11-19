import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Id {
    private static final Logger b;
    private final Map<String, File> a;
    private static final long c;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;







    public Id(byte var1_1, int var2_2, File var3_3, int var4_4, String var5_5) {
        v0 = var6_6 = ((long)var1_1 << 56 | (long)var2_2 << 32 >>> 8 | (long)var4_4 << 40 >>> 40) ^ Id.c;
        v1 = v0 ^ 132670694519497L;
        var8_7 = (int)(v1 >>> 48);
        var9_8 = (int)(v1 << 16 >>> 48);
        var10_9 = (int)(v1 << 32 >>> 32);
        v2 = v0 ^ 53910182830777L;
        var11_10 = v2 >>> 16;
        var13_11 = (int)(v2 << 48 >>> 48);
        v3 = EG.b();
        super();
        var14_12 = v3;
        this.a = Maps.newHashMap();
        if (var5_5 == null) return;
        var15_13 = new File(var3_3, (String)Id.a("o", (int)14963, (long)(1714207098470103704L ^ var6_6)));
        var16_14 = new File(var3_3, (String)Id.a("o", (int)21785, (long)(4793277737381434867L ^ var6_6)) + var5_5 + (String)Id.a("o", (int)29737, (long)(8803598249793402053L ^ var6_6)));
        var17_15 = null;
        try {
            block16: {
                var17_15 = Files.newReader((File)var16_14, (Charset)Charsets.UTF_8);
                var18_16 = new JsonParser().parse((Reader)var17_15).getAsJsonObject();
                var19_19 = Jq.a((JsonObject)var18_16, (short)((short)var8_7), (char)((char)var9_8), (int)var10_9, (String)Id.a("o", (int)17725, (long)(4980768161763722704L ^ var6_6)), (JsonObject)null);
                try {
                    if (var14_12 == null) return;
                    if (var19_19 == null) break block16;
                }
                catch (JsonParseException v4) {
                    throw Id.a(v4);
                }
                for (Map.Entry var21_21 : var19_19.entrySet()) {
                    block21: {
                        block18: {
                            block17: {
                                block19: {
                                    var22_22 = (JsonObject)var21_21.getValue();
                                    var23_23 = (String)var21_21.getKey();
                                    var24_24 = var23_23.split("/", 2);
                                    v5 = var14_12;
                                    if (var1_1 < 0) ** GOTO lbl40
                                    if (v5 == null) return;
                                    v5 = var24_24;
lbl40:


                                    if (var14_12 == null) break block17;
                                    break block19;
                                    catch (JsonParseException v6) {
                                        throw Id.a(v6);
                                    }
                                }
                                try {
                                    block20: {
                                        if (v5.length != 1) break block18;
                                        break block20;
                                        catch (JsonParseException v7) {
                                            throw Id.a(v7);
                                        }
                                    }
                                    v5 = var24_24;
                                }
                                catch (JsonParseException v8) {
                                    throw Id.a(v8);
                                }
                            }
                            v9 = v5[0];
                            break block21;
                        }
                        v9 = var24_24[0] + ":" + var24_24[1];
                    }
                    var25_25 = v9;
                    var26_26 = Jq.a((JsonObject)var22_22, (long)var11_10, (String)Id.a("o", (int)3039, (long)(1463820048218180407L ^ var6_6)), (char)((char)var13_11));
                    var27_27 = new File(var15_13, var26_26.substring(0, 2) + "/" + var26_26);
                    this.a.put(var25_25, var27_27);
                    if (var14_12 != null) continue;
                    break;
                }
            }
            if (var1_1 < 0) return;
        }
        catch (JsonParseException var18_17) {
            Id.b.error((String)Id.a("o", (int)29409, (long)(776941071643193871L ^ var6_6)) + var16_14);
            return;
        }
        catch (FileNotFoundException var18_18) {
            Id.b.error((String)Id.a("o", (int)28349, (long)(2490927258695741012L ^ var6_6)) + var16_14);
            return;
        }
        finally {
            IOUtils.closeQuietly((Reader)var17_15);
        }
    }

    public Map<String, File> a() {
        return this.a;
    }




    static {
        block11: {
            block10: {
                Id.c = _c.a((long)5899822046892611281L, (long)-2946706488652249333L, MethodHandles.lookup().lookupClass()).a(260011513362938L);
                Id.f = new HashMap<K, V>(13);
                var0 = Id.c ^ 110216063891370L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u00da\u00d6\u00c4+\u00fcX\u00b6\n\u00b7\u00ecl~\u00a6\u00dc\u00df\u0005@\u00bb\u0086\u00a9\u00d1\u001a\u00d8\u00dc=v\b\u00dey\u00fa\u00f9\u00dc\u00e49\u00ce\r\u00f6\u009ac-\u0088\u00bco\u00a7\\U\u00b0\u00e6\u00ba\u0000\u008e\u00c5\u0091\u00f1\f\u00ec Wa02N\u000e_:\u0011\u0002\u0094\u00de\u00a2\u0081#\u000f\u008ey\u00c7[cp\u00b4\u009e\u0018} Z\r\u009b\u00d3\u001fl.o\u00b8\u0091j\u00ffP\u00e7\u00efB8*\u009c\u00ab[\u0016\u0010}<|\u00d4U\n\u001d=\u00a8j\u00e2\u0010\u0005\u0082\u00f2\u00f3\u0010\r\u0081\u00ac\u0015\u0096\u00e06\u00cbr\u00d58e\u00d79\t(";
                var8_6 = "\u00da\u00d6\u00c4+\u00fcX\u00b6\n\u00b7\u00ecl~\u00a6\u00dc\u00df\u0005@\u00bb\u0086\u00a9\u00d1\u001a\u00d8\u00dc=v\b\u00dey\u00fa\u00f9\u00dc\u00e49\u00ce\r\u00f6\u009ac-\u0088\u00bco\u00a7\\U\u00b0\u00e6\u00ba\u0000\u008e\u00c5\u0091\u00f1\f\u00ec Wa02N\u000e_:\u0011\u0002\u0094\u00de\u00a2\u0081#\u000f\u008ey\u00c7[cp\u00b4\u009e\u0018} Z\r\u009b\u00d3\u001fl.o\u00b8\u0091j\u00ffP\u00e7\u00efB8*\u009c\u00ab[\u0016\u0010}<|\u00d4U\n\u001d=\u00a8j\u00e2\u0010\u0005\u0082\u00f2\u00f3\u0010\r\u0081\u00ac\u0015\u0096\u00e06\u00cbr\u00d58e\u00d79\t(".length();
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
                    var9_3[var7_4++] = Id.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e3\u0096>\u00f1\f\u0005\u001el\u0085\u0015x[\u00f3!\u0010H@\u00f7#\u00da\u00e4\u00de\u00a8\u00de\u00e2C\u0085\u00c9\u00b0\u00c1\u00f6FG\u000b\u00c4c?\u00e8\u00b2\t\u0090\u0015\u001fF\u000ez\u0002Tb\u00b33#^A\u00f8P\n?\u00e2\u0099\u00e4<\u00acG\u0080\u009a\u00a4\u00ef&rX\u0091>\u0017i\u00b3v. Y\u00ca";
                    var8_6 = "\u00e3\u0096>\u00f1\f\u0005\u001el\u0085\u0015x[\u00f3!\u0010H@\u00f7#\u00da\u00e4\u00de\u00a8\u00de\u00e2C\u0085\u00c9\u00b0\u00c1\u00f6FG\u000b\u00c4c?\u00e8\u00b2\t\u0090\u0015\u001fF\u000ez\u0002Tb\u00b33#^A\u00f8P\n?\u00e2\u0099\u00e4<\u00acG\u0080\u009a\u00a4\u00ef&rX\u0091>\u0017i\u00b3v. Y\u00ca".length();
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
                    var9_3[var7_4++] = Id.a(var10_9).intern();
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
        Id.d = var9_3;
        Id.e = new String[7];
        Id.b = LogManager.getLogger();
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x29AC;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("Id", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            Id.e[n2] = Id.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Id.a(n, l);
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
            throw new RuntimeException("Id" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Id.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
