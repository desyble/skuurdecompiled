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

public class mL
extends lh {
    private final kt<RB> o;
    private float n;
    private float p;
    private boolean k;
    @A
    public final R8<bN> l;
    @A
    public final R8<b5> m;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;

    public mL(long l, EU eU, char c) {
        long l2 = (l << 16 | (long)c << 48 >>> 48) ^ q;
        super(eU);
        this.o = new kt((String)((Object)mL.a("n", (int)28439, (long)(0x7AFE327DE0B8D868L ^ l2))), (Object)new RB((String)((Object)mL.a("n", (int)26253, (long)(0x11E29ABF9E17D1F1L ^ l2))), new String[]{mL.a("n", (int)31867, (long)(0x2AC954E0C660CB00L ^ l2)), mL.a("n", (int)18465, (long)(0x1584F6983FCAFF59L ^ l2)), mL.a("n", (int)23078, (long)(0x5017A50E7165ED5CL ^ l2))}), (String)((Object)mL.a("n", (int)13635, (long)(0x3CF5064D666E023AL ^ l2))));
        this.n = 0.0f;
        this.p = 0.0f;
        this.k = false;
        this.l = this::lambda$new$0;
        this.m = this::lambda$new$1;
        this.a(new kt[]{this.o});
    }

    public void a(char c, long l) {
        this.k = false;
        this.n = 0.0f;
        this.p = 0.0f;
    }

    private void lambda$new$1(b5 b52) {
        block13: {
            int n;
            block14: {
                String[] stringArray;
                block12: {
                    long l = q ^ 0x2D7EEEF102B5L;
                    stringArray = m6.a();
                    try {
                        if (!b52.j()) {
                            return;
                        }
                    }
                    catch (H h) {
                        throw mL.a(h);
                    }
                    try {
                        if (Hk.j() == null) {
                            return;
                        }
                    }
                    catch (H h) {
                        throw mL.a(h);
                    }
                    try {
                        try {
                            n = this.k;
                            if (stringArray != null) break block12;
                            if (n == 0) break block13;
                        }
                        catch (H h) {
                            throw mL.a(h);
                        }
                        n = this.o.q().equals(mL.a("n", (int)19653, (long)(0x53DCF1E107B93B41L ^ l))) ? 1 : 0;
                    }
                    catch (H h) {
                        throw mL.a(h);
                    }
                }
                try {
                    if (stringArray != null) break block14;
                    if (n == 0) break block13;
                }
                catch (H h) {
                    throw mL.a(h);
                }
                n = 2;
            }
            float[] fArray = new float[n];
            fArray[0] = this.n;
            fArray[1] = this.p;
            dL.b((float[])fArray);
            this.k = false;
        }
    }




    private void lambda$new$0(bN var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }




    static {
        block11: {
            block10: {
                mL.q = _c.a((long)7808104241218896594L, (long)-6342210107416179861L, MethodHandles.lookup().lookupClass()).a(213591445324585L);
                mL.t = new HashMap<K, V>(13);
                var0 = mL.q ^ 124580013573116L;
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
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u00c7\u00f7/\u00fd{\u00bd\u009c:o\u0090\u000b\r\u00b9\u00f4\u00c9\r\u0010E\u00f1\u009b\u00e5\u00bc\u0012\u00c5\u008cC\u00ae\u00df\u008a\u00dd\u001e\u0004\u000b\u0010\u0016\u00be)\u0092\u00a5\u00b8\u00f5F\u00d4\u00fa~\u0004\u00b4\u001a\u00d2\u00b3\u0010\u00a7\u00cc\u007f\u0093\u00d1n\u009e?\u00d4(p\u00a4\"u\u00fd\u00f1(\u00d10G\u009d\u00e27PT]\u00b3\u00fc\u00a7jl\u009d\u008e\u00af\u00f8\u00f7\u00d8}\u00df\u00fc\u00ac\u00ac!\u00f2\u00ee\u00be \u0094\u0005z\u0012\u009c`\u00cb \u0081q\u0010\u00fa\u00cf\u0010\u0000\u0016\u00d2%\\^\u00a8!\u0088+\u0090\u001aj";
                var8_6 = "\u00c7\u00f7/\u00fd{\u00bd\u009c:o\u0090\u000b\r\u00b9\u00f4\u00c9\r\u0010E\u00f1\u009b\u00e5\u00bc\u0012\u00c5\u008cC\u00ae\u00df\u008a\u00dd\u001e\u0004\u000b\u0010\u0016\u00be)\u0092\u00a5\u00b8\u00f5F\u00d4\u00fa~\u0004\u00b4\u001a\u00d2\u00b3\u0010\u00a7\u00cc\u007f\u0093\u00d1n\u009e?\u00d4(p\u00a4\"u\u00fd\u00f1(\u00d10G\u009d\u00e27PT]\u00b3\u00fc\u00a7jl\u009d\u008e\u00af\u00f8\u00f7\u00d8}\u00df\u00fc\u00ac\u00ac!\u00f2\u00ee\u00be \u0094\u0005z\u0012\u009c`\u00cb \u0081q\u0010\u00fa\u00cf\u0010\u0000\u0016\u00d2%\\^\u00a8!\u0088+\u0090\u001aj".length();
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
                    var9_3[var7_4++] = mL.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b4\u00bc?\u00b8\u00b3c\u00c1\u00a4\u00ee\u008b.\u0011\u00f5i\u00c2\u0001\u0010\u00be\u0091\u00b0\u00a6\u0003}GN\u00c3\u00e0Xc\u00a3\u00c0\u00f5\u00c2";
                    var8_6 = "\u00b4\u00bc?\u00b8\u00b3c\u00c1\u00a4\u00ee\u008b.\u0011\u00f5i\u00c2\u0001\u0010\u00be\u0091\u00b0\u00a6\u0003}GN\u00c3\u00e0Xc\u00a3\u00c0\u00f5\u00c2".length();
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
                    var9_3[var7_4++] = mL.a(var10_9).intern();
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
        mL.r = var9_3;
        mL.s = new String[8];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x11B2;
        if (s[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])t.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mL", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = r[n2].getBytes("ISO-8859-1");
            mL.s[n2] = mL.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mL.a(n, l);
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
            throw new RuntimeException("mL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
