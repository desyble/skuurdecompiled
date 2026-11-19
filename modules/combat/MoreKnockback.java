import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lr
extends lh {
    private static final Random s;
    public static int o;
    private final kt<RB> z;
    private final kt<Number> l;
    private final kt<Number> u;
    private final kt<Number> m;
    private final kt<Number> x;
    private boolean w;
    private boolean y;
    private int p;
    private int r;
    private long v;
    private long t;
    private long k;
    private long n;
    @A
    public final R8<bD> q;
    @A
    public final R8<b5> A;
    private static final long B;
    private static final String[] C;
    private static final String[] D;
    private static final Map E;

    public lr(EU eU, int n, int n2, char c) {
        long l = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ B;
        super(eU);
        this.z = new kt((String)((Object)lr.a("p", (int)31342, (long)(0x63FD9289D8BDBA08L ^ l))), (Object)new RB((String)((Object)lr.a("p", (int)18239, (long)(0x39C8104420038748L ^ l))), new String[]{lr.a("p", (int)32148, (long)(0x382E350B87B0BDF3L ^ l)), lr.a("p", (int)733, (long)(0x63EE0FA2B59142ACL ^ l)), lr.a("p", (int)9417, (long)(0x186FF70DECE7E4B2L ^ l)), lr.a("p", (int)31767, (long)(0x5317A6927065BC6DL ^ l))}), (String)((Object)lr.a("p", (int)11446, (long)(0x6DF1B4A0E7626CC2L ^ l))));
        this.l = new kt((String)((Object)lr.a("p", (int)15951, (long)(0x6FDBF27269F37E37L ^ l))), (Object)100, (String)((Object)lr.a("p", (int)27079, (long)(0x5FFFF96A896E29B1L ^ l))), 1.0, 0.0, 100.0, "%", this::lambda$new$0);
        this.u = new kt((String)((Object)lr.a("p", (int)23256, (long)(0x2813F24CB3721AA4L ^ l))), (Object)10, (String)((Object)lr.a("p", (int)14053, (long)(0x4CD7B00A7C567690L ^ l))), 1.0, 1.0, 10.0, (String)((Object)lr.a("p", (int)29246, (long)(0xEB142DF0179325BL ^ l))), this::lambda$new$1);
        this.m = new kt((String)((Object)lr.a("p", (int)20751, (long)(0x57C4E0631D18117CL ^ l))), (Object)50, (String)((Object)lr.a("p", (int)21996, (long)(0x5ED4A1D5DF251595L ^ l))), 10.0, 0.0, 500.0, (String)((Object)lr.a("p", (int)16380, (long)(0x27B14CB356997F83L ^ l))), this::lambda$new$2);
        this.x = new kt((String)((Object)lr.a("p", (int)13939, (long)(0x5D948658D09CF60EL ^ l))), (Object)100, (String)((Object)lr.a("p", (int)14371, (long)(0x7D2940ED0539F847L ^ l))), 10.0, 50.0, 300.0, (String)((Object)lr.a("p", (int)15365, (long)(0x1B208FCD0267FC77L ^ l))), this::lambda$new$3);
        this.w = false;
        this.y = false;
        this.p = 0;
        this.r = 0;
        this.v = 0L;
        this.t = 0L;
        this.k = 0L;
        this.n = 0L;
        this.q = this::lambda$new$4;
        this.A = this::lambda$new$5;
        this.a(new kt[]{this.z, this.l, this.u, this.m, this.x});
    }

    public void d(int n, int n2, int n3) {
        o = 0;
        this.p = 0;
        this.r = 0;
        this.y = false;
        this.w = false;
        this.v = 0L;
        this.t = 0L;
        this.k = 0L;
        this.n = 0L;
    }

    public void a(char c, long l) {
        o = 0;
        this.p = 0;
        this.r = 0;
        this.y = false;
        this.w = false;
        this.v = 0L;
        this.t = 0L;
        this.k = 0L;
        this.n = 0L;
    }




    private void lambda$new$5(b5 var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }




    private void lambda$new$4(bD var1_1) {
























        throw new IllegalStateException("Decompilation failed");
    }

    private boolean lambda$new$3() {
        long l = B ^ 0x5A8B850FFAB0L;
        return this.z.q().equals(lr.a("p", (int)19711, (long)(0x72F2274EE411191DL ^ l)));
    }

    private boolean lambda$new$2() {
        long l = B ^ 0xC7A65C60B34L;
        return this.z.q().equals(lr.a("p", (int)19711, (long)(0x72F271BF04D8E899L ^ l)));
    }

    private boolean lambda$new$1() {
        long l = B ^ 0x27A6FE656FA5L;
        return this.z.q().equals(lr.a("p", (int)32148, (long)(0x382E4CDF649BBD7AL ^ l)));
    }

    private boolean lambda$new$0() {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    long l = B ^ 0x590C0361BD93L;
                    nArray = lX.f();
                    try {
                        try {
                            bl = this.z.q().equals(lr.a("p", (int)32148, (long)(0x382E3275999F6F4CL ^ l)));
                            if (nArray != null) break block6;
                            if (bl) break block7;
                        }
                        catch (H h) {
                            throw lr.a(h);
                        }
                        bl = this.z.q().equals(lr.a("p", (int)11555, (long)(0x77B54980CCC6BFFFL ^ l)));
                    }
                    catch (H h) {
                        throw lr.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (bl) break block7;
                }
                catch (H h) {
                    throw lr.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }




    static {
        block11: {
            block10: {
                lr.B = _c.a((long)3006339945052420401L, (long)-2382786952794389657L, MethodHandles.lookup().lookupClass()).a(141786936411526L);
                lr.E = new HashMap<K, V>(13);
                var0 = lr.B ^ 46314549752292L;
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
                var9_3 = new String[21];
                var7_4 = 0;
                var6_5 = "J4\u00c1e\n|\u00bc\u00c4n\u0007\u00b1\u00efAq\u00dc\u00ca(g\u0013N\u00eb\u001e\u00c7\u0010Y\u00f3`\u00cf\u00d0\u00beV\u0089\u008a\u00cf\u00c3\u00f5yW\u00af\u0095`ji\u0019\u00d2\u00ee\u00d96\u00cc\u001d\u0094O\f\u00a7\u001f\u00ca\u008cP83\u00aa\u00dc\u00d5\u00bb\u00f2t\u00d6\u00c2\u00fd\u00a3\u00ff\u00c4D\u00aa=\u0003\u00c4S\u0014o\u00b4\u001c\u00a6i\u00eb\u0090{\u0005\u009d\u0090(\u00d0\u00ceI\u00ee'\u008a\u001f\u00adWn&\u00bc\u009c\t\u00f6\u0001\u00c3\u00d3\u00125l\u00afv\u00d9c/D\u001fy\u00e3\u00fb#>_\u00bc6j\u00aa\u001f\u009aD?D`L\u008cl(3=\u0006\u00fa\u00eb\u00f8\u00a19\\\u001cZ\u00b1l\u000b>\u0015\u00c6f\u00af[3\u00e0\u0088\u00d8p%\t]\u008a0\u00a4N\u00b2\u00de'>\u00f0|1^ ZV\u0016d\u0083\u00faSB\u00ca\u008e\u00c5\u0006\u0089\u00ff1e}\u0014\u00ef-J/\u00b1\u00cc\u00fePw\u000bB\u00df\u00d3\u00f7\u0010\u00dfP\u0094\u00cb\b\u00b0\"vZ\u00dc\u00a0=C 1 \u00181\u00d1\u00d4\u0094\u00e2\u00b8\u00f6\u00c0\u00a2\u00bd\u0015`\u00ea\u00f8\u0018d\u00e7\u00c2<\u00e3=O\u009d\u00e1\u0010'\u00a1\u00fb7F\u00c7f_\u00c5\u00ae\u009dc\u00f7\u0001\u00ee?\u0010\u00b5\"\u0099\u00c1\u0083\u00ef\u0088l\u008dw.\u00a0rv'L\u0010\u001a\u00c5fs\u008b\u009cKe0\u0017\rP\u009e?\u009aw \u00b6\u008c\u00c7\u00c2\u00af7q[\u00a6qoYyU\u0082\u00a7O\u00e7g\u00d5N\u00e26\u00992\u00ed|\u00c1\u0006\u00fc\u00bc\u00ba\u0010#k-\u009e\u001cZ4\u00b7\f\u00d8\u00fbs\u00bdQF\u0088\u00105\u0089\u0000\u00f6?P\u009d0\u0004z\u0005\u00b8\u00b2v\u00137\u0010\u0003\u001a\u00f7\t\"\u0017\u00e5\u0095\u0090\u00b1\u00b01s\u00aaI\u00df8E,\u0098T\u00dcv.S[Q\u0006\u0098\u00d5\u00b1w\u00d6\u00f4\u000f\u00e8!\u0019\u0014\u00c3\u00e6\u0082n\u00b7&\u0096kV\u00f3,\u00e3\u0080\u00fa\u009c\u001f8\u00f1.'\u0099{\u00038\u00d3\u00a4d\u00bc\u00fc|L\u0010\u00d6\u00dd\u0010\u0011U\u0088\u00d5\u0083\u00c27\u000f\u000e\u0091\u00fb\u0005\u0011\u00f7\u00d4\u00df\u0010\u00f0\u00bcZ9>x\u00b5\u00d9\u00df$\u000e\u00b7\u00b3\u00c6C\u00c6\u0010\u0080\u009b|\r\u00adq\u00c6\u00fan\u00d2\u00f9H\u0010\u00c4F\u00ec\u0010<\u00e3H\u00f6\fY\u00e0Q\u00c3\u0005\u0093\u00bd*1\u00ba\u009d";
                var8_6 = "J4\u00c1e\n|\u00bc\u00c4n\u0007\u00b1\u00efAq\u00dc\u00ca(g\u0013N\u00eb\u001e\u00c7\u0010Y\u00f3`\u00cf\u00d0\u00beV\u0089\u008a\u00cf\u00c3\u00f5yW\u00af\u0095`ji\u0019\u00d2\u00ee\u00d96\u00cc\u001d\u0094O\f\u00a7\u001f\u00ca\u008cP83\u00aa\u00dc\u00d5\u00bb\u00f2t\u00d6\u00c2\u00fd\u00a3\u00ff\u00c4D\u00aa=\u0003\u00c4S\u0014o\u00b4\u001c\u00a6i\u00eb\u0090{\u0005\u009d\u0090(\u00d0\u00ceI\u00ee'\u008a\u001f\u00adWn&\u00bc\u009c\t\u00f6\u0001\u00c3\u00d3\u00125l\u00afv\u00d9c/D\u001fy\u00e3\u00fb#>_\u00bc6j\u00aa\u001f\u009aD?D`L\u008cl(3=\u0006\u00fa\u00eb\u00f8\u00a19\\\u001cZ\u00b1l\u000b>\u0015\u00c6f\u00af[3\u00e0\u0088\u00d8p%\t]\u008a0\u00a4N\u00b2\u00de'>\u00f0|1^ ZV\u0016d\u0083\u00faSB\u00ca\u008e\u00c5\u0006\u0089\u00ff1e}\u0014\u00ef-J/\u00b1\u00cc\u00fePw\u000bB\u00df\u00d3\u00f7\u0010\u00dfP\u0094\u00cb\b\u00b0\"vZ\u00dc\u00a0=C 1 \u00181\u00d1\u00d4\u0094\u00e2\u00b8\u00f6\u00c0\u00a2\u00bd\u0015`\u00ea\u00f8\u0018d\u00e7\u00c2<\u00e3=O\u009d\u00e1\u0010'\u00a1\u00fb7F\u00c7f_\u00c5\u00ae\u009dc\u00f7\u0001\u00ee?\u0010\u00b5\"\u0099\u00c1\u0083\u00ef\u0088l\u008dw.\u00a0rv'L\u0010\u001a\u00c5fs\u008b\u009cKe0\u0017\rP\u009e?\u009aw \u00b6\u008c\u00c7\u00c2\u00af7q[\u00a6qoYyU\u0082\u00a7O\u00e7g\u00d5N\u00e26\u00992\u00ed|\u00c1\u0006\u00fc\u00bc\u00ba\u0010#k-\u009e\u001cZ4\u00b7\f\u00d8\u00fbs\u00bdQF\u0088\u00105\u0089\u0000\u00f6?P\u009d0\u0004z\u0005\u00b8\u00b2v\u00137\u0010\u0003\u001a\u00f7\t\"\u0017\u00e5\u0095\u0090\u00b1\u00b01s\u00aaI\u00df8E,\u0098T\u00dcv.S[Q\u0006\u0098\u00d5\u00b1w\u00d6\u00f4\u000f\u00e8!\u0019\u0014\u00c3\u00e6\u0082n\u00b7&\u0096kV\u00f3,\u00e3\u0080\u00fa\u009c\u001f8\u00f1.'\u0099{\u00038\u00d3\u00a4d\u00bc\u00fc|L\u0010\u00d6\u00dd\u0010\u0011U\u0088\u00d5\u0083\u00c27\u000f\u000e\u0091\u00fb\u0005\u0011\u00f7\u00d4\u00df\u0010\u00f0\u00bcZ9>x\u00b5\u00d9\u00df$\u000e\u00b7\u00b3\u00c6C\u00c6\u0010\u0080\u009b|\r\u00adq\u00c6\u00fan\u00d2\u00f9H\u0010\u00c4F\u00ec\u0010<\u00e3H\u00f6\fY\u00e0Q\u00c3\u0005\u0093\u00bd*1\u00ba\u009d".length();
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
                    var9_3[var7_4++] = lr.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "(\u00ad\u00fe\u00f4\u0091t\u00b17P\u007f\u00d4\u00ade3\u00bb\u0002\u00d5\u0000EO{\u00c9\u009c\u00d4J\u00fe\u0090\u00b8\u00d6\u00bc\u00abm\u009f0\u008c\u007f\u0097@awL3<\u00e5@Q\u0095\u0082\u00d86\u00dda\u00d3/\u0084\u00e4Pj\u0097\u0005\u0011y\u000f\f u\u0084\u00dc1\u00fb\u0001\u00b5\fU\u00fc\u00eb\u00cc\\8w\u00f0N\u00ec|@\u001b\u00c0s\u00e1\u00c7\u00cf\u0007:\u0003\u0089\u00ad\u00fc";
                    var8_6 = "(\u00ad\u00fe\u00f4\u0091t\u00b17P\u007f\u00d4\u00ade3\u00bb\u0002\u00d5\u0000EO{\u00c9\u009c\u00d4J\u00fe\u0090\u00b8\u00d6\u00bc\u00abm\u009f0\u008c\u007f\u0097@awL3<\u00e5@Q\u0095\u0082\u00d86\u00dda\u00d3/\u0084\u00e4Pj\u0097\u0005\u0011y\u000f\f u\u0084\u00dc1\u00fb\u0001\u00b5\fU\u00fc\u00eb\u00cc\\8w\u00f0N\u00ec|@\u001b\u00c0s\u00e1\u00c7\u00cf\u0007:\u0003\u0089\u00ad\u00fc".length();
                    var5_7 = 64;
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
                    var9_3[var7_4++] = lr.a(var10_9).intern();
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
        lr.C = var9_3;
        lr.D = new String[21];
        lr.s = new Random();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x706C;
        if (D[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])E.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    E.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lr", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = C[n2].getBytes("ISO-8859-1");
            lr.D[n2] = lr.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return D[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lr.a(n, l);
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
            throw new RuntimeException("lr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
