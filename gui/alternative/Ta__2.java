import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class Ta {
    private final ta g;
    private final List<Es> b;
    public static final Di e;
    private float c;
    private float f;
    private float d;
    private float i;
    private boolean h;
    private boolean a;
    private static final long j;
    private static final String[] k;
    private static final String[] l;
    private static final Map m;

    public Ta(ta ta2, float f, float f2) {
        this.g = ta2;
        this.c = f;
        this.f = f2;
        this.h = true;
        String string = Es.b();
        try {
            this.a = false;
            this.b = new ArrayList<Es>();
            this.a();
            if (LQ.J() != null) {
                Es.b((String)"Q4whVc");
            }
        }
        catch (H h) {
            throw Ta.a((Exception)((Object)h));
        }
    }

    private void a() {
        lh[] lhArray = tf.m().a();
        int n = lhArray.length;
        String string = Es.b();
        int n2 = 0;
        while (n2 < n) {
            block5: {
                block6: {
                    lh lh2 = lhArray[n2];
                    try {
                        try {
                            if (string != null) break block5;
                            if (lh2.e() != this.g) break block6;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                        this.b.add(new Es(lh2));
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                }
                ++n2;
            }
            if (string == null) continue;
        }
    }

    public void d(int n, long l, int n2) {
        block5: {
            Ta ta2;
            block4: {
                long l2 = (l = j ^ l) ^ 0x3001B78452F9L;
                int n3 = (int)(l2 >>> 32);
                int n4 = (int)(l2 << 32 >>> 48);
                int n5 = (int)(l2 << 48 >>> 48);
                String string = Es.b();
                this.b(n3, (char)n4, (char)n5);
                String string2 = string;
                try {
                    try {
                        ta2 = this;
                        if (string2 != null) break block4;
                        if (!ta2.h) break block5;
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                    ta2 = this;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
            }
            ta2.e(n, n2);
        }
    }





    private void b(int var1_1, char var2_2, char var3_3) {
        block9: {
            v0 = var4_4 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var3_3 << 48 >>> 48) ^ Ta.j;
            v1 = v0 ^ 19275042905165L;
            var6_5 = (int)(v1 >>> 32);
            var7_6 = (int)(v1 << 32 >>> 48);
            var8_7 = (int)(v1 << 48 >>> 48);
            v2 = v0 ^ 135256007918433L;
            var9_8 = (int)(v2 >>> 32);
            var10_9 = (int)(v2 << 32 >>> 48);
            var11_10 = (int)(v2 << 48 >>> 48);
            v3 = v0 ^ 139032162160573L;
            var12_11 = (int)(v3 >>> 56);
            var13_12 = (int)(v3 << 8 >>> 32);
            var14_13 = (int)(v3 << 40 >>> 40);
            v4 = v0 ^ 53946753850389L;
            var15_14 = (int)(v4 >>> 48);
            var16_15 = (int)(v4 << 16 >>> 32);
            var17_16 = (int)(v4 << 48 >>> 48);
            v5 = Es.b();
            cp.a((double)this.c, (double)this.f, (double)(this.c + 100.0f), (double)(this.f + 15.0f), (int)r_.a((int)26, (int)26, (int)26));
            var18_17 = v5;
            Ta.e.a(var6_5, this.g.b(), this.c + 3.0f, (short)var7_6, this.f + 7.5f - (float)Ta.e.c() / 2.0f, (short)var8_7, -1);
            try {
                block8: {
                    var19_18 = new FO(var9_8, var10_9, (String)Ta.a("b", (int)25476, (long)(2654903767063345213L ^ var4_4)) + this.g.b().toLowerCase() + (String)Ta.a("b", (int)31499, (long)(8053116447720546483L ^ var4_4)), (char)var11_10);
                    Hk.b().aa().c((char)var15_14, var16_15, (short)var17_16, var19_18);
                    GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                    GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                    ri.G();
                    ri.g();
                    ri.q();
                    var20_20 = eP.c();
                    try {
                        v6 = this.h;
                        if (var18_17 != null) break block8;
                        if (v6 != 0) {
                        }
                        ** GOTO lbl51
                    }
                    catch (Exception v7) {
                        throw Ta.a(v7);
                    }
                    v6 = var20_20;
                }
                try {
                    cN.a((int)v6);
                    if (var1_1 >= 0) {
                        if (var18_17 == null) ** GOTO lbl55
                    }
                    break block9;
lbl51:


                    ri.c((float)0.21568628f, (float)0.21568628f, (float)0.21568628f, (float)1.0f);
                }
                catch (Exception v8) {
                    throw Ta.a(v8);
                }
lbl55:


                cp.a((byte)((byte)var12_11), (double)(this.c + 100.0f - 11.0f), (int)var13_12, (double)(this.f + 4.0f), (float)0.0f, (float)0.0f, (double)8.0, (int)var14_13, (double)8.0, (float)8.0f, (float)8.0f);
                ri.c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                ri.a();
                ri.I();
                ri.t();
            }
            catch (Exception var19_19) {

            }
        }
    }

    private void e(int n, int n2) {
        String string;
        float f;
        block5: {
            f = 15.0f;
            string = Es.b();
            float f2 = 0.0f;
            for (Es es : this.b) {
                f2 += (float)es.e();
                try {
                    if (string == null) {
                        if (string == null) continue;
                        break;
                    }
                    break block5;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
            }
            cp.a((double)this.c, (double)(this.f + f), (double)(this.c + 100.0f), (double)(this.f + f + f2 + 2.0f), (int)r_.a((int)26, (int)26, (int)26));
        }
        for (Es es : this.b) {
            es.b(this.c + 2.0f, this.f + f, 96, n, n2);
            f += (float)es.e();
            if (string == null) continue;
        }
    }

    public void c(int n, int n2, int n3) {
        block11: {
            Ta ta2;
            block10: {
                boolean bl;
                block8: {
                    String string;
                    block9: {
                        string = Es.b();
                        try {
                            try {
                                bl = this.c(n, n2);
                                if (string != null) break block8;
                                if (!bl) break block9;
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                            this.b(n, n2, n3);
                            return;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                    }
                    try {
                        ta2 = this;
                        if (string != null) break block10;
                        bl = ta2.h;
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                }
                if (!bl) break block11;
                ta2 = this;
            }
            ta2.d(n, n2, n3);
        }
    }

    private boolean c(int n, int n2) {
        float f;
        block18: {
            block15: {
                String string;
                block17: {
                    block16: {
                        block14: {
                            string = Es.b();
                            try {
                                try {
                                    float f2 = (float)n - this.c;
                                    f = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                    if (string != null) break block14;
                                    if (f < 0) break block15;
                                }
                                catch (H h) {
                                    throw Ta.a((Exception)((Object)h));
                                }
                                float f3 = (float)n - (this.c + 100.0f);
                                f = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                        }
                        try {
                            try {
                                if (string != null) break block16;
                                if (f > 0) break block15;
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                            float f4 = (float)n2 - this.f;
                            f = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                    }
                    try {
                        try {
                            if (string != null) break block17;
                            if (f < 0) break block15;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                        float f5 = (float)n2 - (this.f + 15.0f);
                        f = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                }
                try {
                    if (string != null) break block18;
                    if (f > 0) break block15;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
                f = 1.0f;
                break block18;
            }
            f = 0.0f;
        }
        return (boolean)f;
    }

    private void b(int n, int n2, int n3) {
        block11: {
            int n4;
            block9: {
                String string = Es.b();
                try {
                    block10: {
                        try {
                            try {
                                n4 = n3;
                                if (string != null) break block9;
                                if (n4 != 0) break block10;
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                            this.a(n, n2);
                            if (string == null) break block11;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                    }
                    n4 = n3;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
            }
            try {
                if (n4 == 1) {
                    this.c();
                }
            }
            catch (H h) {
                throw Ta.a((Exception)((Object)h));
            }
        }
    }

    private void a(int n, int n2) {
        this.a = true;
        this.d = (float)n - this.c;
        this.i = (float)n2 - this.f;
    }

    private void c() {
        boolean bl;
        block2: {
            block3: {
                String string = Es.b();
                try {
                    Ta ta2 = this;
                    bl = this.h;
                    if (string != null) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        ta2.h = bl;
    }

    private void d(int n, int n2, int n3) {
        float f = 15.0f;
        Iterator<Es> iterator = this.b.iterator();
        String string = Es.b();
        while (iterator.hasNext()) {
            block5: {
                Es es;
                block6: {
                    es = iterator.next();
                    try {
                        try {
                            if (string != null) break block5;
                            if (!es.a(this.c + 2.0f, this.f + f, 96, n, n2, n3)) break block6;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                        if (string == null) break;
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                }
                f += (float)es.e();
            }
            if (string == null) continue;
        }
    }

    public void a(int n, int n2, int n3) {
        block12: {
            Ta ta2;
            String string;
            block11: {
                int n4;
                block9: {
                    block10: {
                        string = Es.b();
                        try {
                            try {
                                n4 = n3;
                                if (string != null) break block9;
                                if (n4 != 0) break block10;
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                            this.a = false;
                        }
                        catch (H h) {
                            throw Ta.a((Exception)((Object)h));
                        }
                    }
                    try {
                        ta2 = this;
                        if (string != null) break block11;
                        n4 = ta2.h ? 1 : 0;
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                }
                if (n4 == 0) break block12;
                ta2 = this;
            }
            for (Es es : ta2.b) {
                es.a(n, n2, n3);
                if (string == null) continue;
            }
        }
    }

    public void b(int n, int n2) {
        block5: {
            block4: {
                String string = Es.b();
                try {
                    Ta ta2;
                    try {
                        ta2 = this;
                        if (string != null) break block4;
                        if (!ta2.a) break block5;
                    }
                    catch (H h) {
                        throw Ta.a((Exception)((Object)h));
                    }
                    this.c = (float)n - this.d;
                    ta2 = this;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
            }
            ta2.f = (float)n2 - this.i;
        }
    }

    public boolean a(char c, int n) {
        boolean bl;
        block7: {
            block8: {
                String string = Es.b();
                try {
                    bl = this.h;
                    if (string != null) break block7;
                    if (!bl) break block8;
                }
                catch (H h) {
                    throw Ta.a((Exception)((Object)h));
                }
                for (Es es : this.b) {
                    block10: {
                        boolean bl2;
                        block9: {
                            try {
                                try {
                                    bl = es.a(c, n);
                                    if (string != null) break block7;
                                    if (string != null) break block9;
                                }
                                catch (H h) {
                                    throw Ta.a((Exception)((Object)h));
                                }
                                if (!bl) break block10;
                            }
                            catch (H h) {
                                throw Ta.a((Exception)((Object)h));
                            }
                            bl2 = true;
                        }
                        return bl2;
                    }
                    if (string == null) continue;
                }
            }
            bl = false;
        }
        return bl;
    }




    static {
        j = _c.a((long)-878211924997294570L, (long)-8745529877179797408L, MethodHandles.lookup().lookupClass()).a(260970561650255L);
        m = new HashMap(13);
        long l = j ^ 0x3C16E01D787CL;
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
        String string = "\u00e5m\u00aa\u00fdS\f\u008d\u00d8T\u0003\u00f0\u00a3f\u000b\u001c\u008f6\u00ad\u00d1\u00eb\u0088h\u00fd\u00fa\u00b6\u008cUC\u000f\u0004\u00a6\n\u00d2\u00ce<0\u00e2Ir\u0082\u0010\u00b6\u000e#\u00e2\u0097\u000emm\u00aa(Z\u00d1\u00bc\u00d4\u00a5\u0013";
        int n2 = "\u00e5m\u00aa\u00fdS\f\u008d\u00d8T\u0003\u00f0\u00a3f\u000b\u001c\u008f6\u00ad\u00d1\u00eb\u0088h\u00fd\u00fa\u00b6\u008cUC\u000f\u0004\u00a6\n\u00d2\u00ce<0\u00e2Ir\u0082\u0010\u00b6\u000e#\u00e2\u0097\u000emm\u00aa(Z\u00d1\u00bc\u00d4\u00a5\u0013".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = Ta.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                k = stringArray;
                Ta.l = new String[2];
                e = gh.c.a(18.0f);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x49F8;
        if (Ta.l[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("Ta", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = k[n2].getBytes("ISO-8859-1");
            Ta.l[n2] = Ta.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return Ta.l[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = Ta.a(n, l);
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
            throw new RuntimeException("Ta" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ta.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
