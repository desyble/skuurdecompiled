import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mQ
extends lh {
    private final kt<RB> k;
    @A
    public final R8<ck> m;
    @A
    public final R8<bN> l;
    private static final long n;
    private static final String[] o;
    private static final String[] p;
    private static final Map q;

    public mQ(int n, char c, EU eU, char c2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ mQ.n;
        super(eU);
        this.k = new kt((String)((Object)mQ.a("p", (int)29964, (long)(0x2BBD652AC191B8D8L ^ l))), (Object)new RB((String)((Object)mQ.a("p", (int)1088, (long)(0x7D8F0E83BF51C997L ^ l))), new String[]{mQ.a("p", (int)1088, (long)(0x7D8F0E83BF51C997L ^ l)), mQ.a("p", (int)5959, (long)(0x365EAB08530FDA92L ^ l))}));
        this.m = this::lambda$new$0;
        this.l = mQ::lambda$new$1;
        this.a(this.k);
    }

    public void d(int n, int n2, int n3) {
        oa.x = false;
        oa.C = "";
    }

    private static void lambda$new$1(bN bN2) {
        block8: {
            boolean bl;
            block7: {
                String[] stringArray = m6.a();
                try {
                    try {
                        bl = bN2.a() instanceof Q6;
                        if (stringArray != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (H h) {
                        throw mQ.a(h);
                    }
                    bl = Hk.e() instanceof oa;
                }
                catch (H h) {
                    throw mQ.a(h);
                }
            }
            try {
                if (bl) {
                    bN2.a();
                }
            }
            catch (H h) {
                throw mQ.a(h);
            }
        }
    }




    private void lambda$new$0(ck var1_1) {
        block11: {
            block12: {
                var2_2 = mQ.n ^ 80995414724495L;
                v0 = var2_2 ^ 74380910577285L;
                var4_3 = (int)(v0 >>> 32);
                var5_4 = v0 << 32 >>> 32;
                var7_5 = m6.a();
                try {
                    if (this.k.q().equals(mQ.a("p", (int)12937, (long)(3118059843441289208L ^ var2_2)))) {
                        return;
                    }
                }
                catch (H v1) {
                    throw mQ.a(v1);
                }
                var8_6 = Hk.e();
                try {
                    try {
                        if (!oa.x) break block11;
                        v2 = var8_6;
                        if (var7_5 != null) break block12;
                    }
                    catch (H v3) {
                        throw mQ.a(v3);
                    }
                    if (v2 != null) {
                    }
                    ** GOTO lbl32
                }
                catch (H v4) {
                    throw mQ.a(v4);
                }
                v2 = var8_6;
            }
            try {
                if (!(v2 instanceof oJ)) break block11;
lbl32:


                Hk.b().a((op)new oa(oa.C), var4_3, var5_4);
            }
            catch (H v5) {
                throw mQ.a(v5);
            }
        }
    }




    static {
        block11: {
            block10: {
                mQ.n = _c.a((long)8044098355954883855L, (long)-2420577653059922992L, MethodHandles.lookup().lookupClass()).a(159047964245292L);
                mQ.q = new HashMap<K, V>(13);
                var0 = mQ.n ^ 109049078035254L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00d1'&+\u00cfq\u00e4l=\u00ce\u00d7\u0093\u00b9\u00da\u00f3\u00df\u0010L-Ht\u00b1\u00b1\u0094\u001a\u00f9=V=\u0095\u00f7\u009cl";
                var8_6 = "\u00d1'&+\u00cfq\u00e4l=\u00ce\u00d7\u0093\u00b9\u00da\u00f3\u00df\u0010L-Ht\u00b1\u00b1\u0094\u001a\u00f9=V=\u0095\u00f7\u009cl".length();
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
                    var9_3[var7_4++] = mQ.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "os\u00f4g\u008c\u00c0H\u00ef;\u0085\u00edZ\u00f53\u001bh\u0010J\u00c9\u0090>2\u009c\u00f1\u00c4<\u0013\u0088(\u00a5\u008c\u00db~";
                    var8_6 = "os\u00f4g\u008c\u00c0H\u00ef;\u0085\u00edZ\u00f53\u001bh\u0010J\u00c9\u0090>2\u009c\u00f1\u00c4<\u0013\u0088(\u00a5\u008c\u00db~".length();
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
                    var9_3[var7_4++] = mQ.a(var10_9).intern();
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
        mQ.o = var9_3;
        mQ.p = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x326C;
        if (p[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])q.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mQ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = o[n2].getBytes("ISO-8859-1");
            mQ.p[n2] = mQ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return p[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mQ.a(n, l);
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
            throw new RuntimeException("mQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mQ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
