import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class RI {
    private static final ExecutorService b;
    private final t e;
    private final File d;
    private final MinecraftSessionService c;
    private final LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> a;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;

    public RI(t t2, File file, MinecraftSessionService minecraftSessionService) {
        this.e = t2;
        this.d = file;
        this.c = minecraftSessionService;
        this.a = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build((CacheLoader)new zw(this));
    }

    public FO a(short s, MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, int n, int n2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ f;
        long l2 = l ^ 0x7C74618517A2L;
        int n3 = (int)(l2 >>> 48);
        int n4 = (int)(l2 << 16 >>> 32);
        int n5 = (int)(l2 << 48 >>> 48);
        return this.a(minecraftProfileTexture, (short)n3, n4, (char)n5, type, null);
    }




    public FO a(MinecraftProfileTexture var1_1, short var2_2, int var3_3, char var4_4, MinecraftProfileTexture.Type var5_5, Hq var6_6) {
        block12: {
            block14: {
                block13: {
                    block11: {
                        v0 = var7_7 = ((long)var2_2 << 48 | (long)var3_3 << 32 >>> 16 | (long)var4_4 << 48 >>> 48) ^ RI.f;
                        v1 = v0 ^ 34039752389618L;
                        var9_8 = (int)(v1 >>> 48);
                        var10_9 = v1 << 16 >>> 16;
                        v2 = v0 ^ 120763643037429L;
                        var12_10 = (int)(v2 >>> 32);
                        var13_11 = (int)(v2 << 32 >>> 48);
                        var14_12 = (int)(v2 << 48 >>> 48);
                        var16_13 = new FO(var12_10, var13_11, (String)RI.a("i", (int)25959, (long)(5578651624741084875L ^ var7_7)) + var1_1.getHash(), (char)var14_12);
                        var17_14 = this.e.a(var16_13);
                        var15_15 = EG.b();
                        try {
                            try {
                                if (var17_14 != null) {
                                    v3 = var6_6;
                                    if (var2_2 < 0 || var15_15 == null) break block11;
                                }
                                ** GOTO lbl34
                            }
                            catch (H v4) {
                                throw RI.a(v4);
                            }
                            if (v3 == null) break block12;
                        }
                        catch (H v5) {
                            throw RI.a(v5);
                        }
                        v3 = var6_6;
                    }
                    try {
                        try {
                            v3.a(var5_5, var16_13, var1_1);
                            if (var3_3 >= 0 && var15_15 != null) break block12;
lbl34:


                            v6 = v7;
                            v8 = v7;
                            v9 = this.d;
                            if (var1_1.getHash().length() <= 2) break block13;
                        }
                        catch (H v10) {
                            throw RI.a(v10);
                        }
                        v11 = var1_1.getHash().substring(0, 2);
                        break block14;
                    }
                    catch (H v12) {
                        throw RI.a(v12);
                    }
                }
                v11 = RI.a("i", (int)11591, (long)(8430818806872889066L ^ var7_7));
            }
            v6(v9, (String)v11);
            var18_16 = v8;
            var19_17 = new File(var18_16, var1_1.getHash());
            try {
                v13 = var5_5 == MinecraftProfileTexture.Type.SKIN ? new gY() : null;
            }
            catch (H v14) {
                throw RI.a(v14);
            }
            var20_18 = v13;
            var21_19 = new j(var19_17, var1_1.getUrl(), hh.a(), (sD)new r9(this, (sD)var20_18, var6_6, var5_5, var16_13, var1_1));
            this.e.a(var16_13, (char)var9_8, (K5)var21_19, var10_9);
        }
        return var16_13;
    }

    public void a(GameProfile gameProfile, Hq hq, boolean bl) {
        b.submit((Runnable)new Hb(this, gameProfile, bl, hq));
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile gameProfile) {
        return (Map)this.a.getUnchecked((Object)gameProfile);
    }

    static MinecraftSessionService a(RI rI) {
        return rI.c;
    }




    static {
        f = _c.a((long)-2751648611683194024L, (long)-6810186597775062445L, MethodHandles.lookup().lookupClass()).a(148763473802076L);
        i = new HashMap(13);
        long l = f ^ 0x1E882B54C0E0L;
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
        String string = "\u00cd\u00dat_!\u0015Z\u008e\u00b6\u00ad\u00e9\u00b2b\u000f\u0088\u00ab\u0010\u00d2\u00d7g[\u00ed\u0097@\u00f3\u00c4\u0010\u00c3C3\u0081\u00e1n";
        int n2 = "\u00cd\u00dat_!\u0015Z\u008e\u00b6\u00ad\u00e9\u00b2b\u000f\u0088\u00ab\u0010\u00d2\u00d7g[\u00ed\u0097@\u00f3\u00c4\u0010\u00c3C3\u0081\u00e1n".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = RI.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                g = stringArray;
                h = new String[2];
                b = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C78;
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
                throw new RuntimeException("RI", exception);
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
            RI.h[n2] = RI.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = RI.a(n, l);
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
            throw new RuntimeException("RI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
