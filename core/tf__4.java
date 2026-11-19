import de.florianmichael.c;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class tf
extends tn {
    public static final tf l;
    private qy<R_> g;
    private qT<lh> m;
    private cQ o;
    private ep f;
    private Fw e;
    private t6 p;
    private nV c;
    private static pC d;
    private static pJ n;
    private static int j;
    private static tQ i;
    private EN a;
    @A
    public final R8<cn> k;
    @A
    public final R8<d3> h;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;

    private tf() {
        long l = q ^ 0x315D89D6D481L;
        long l2 = l ^ 0x53D2633E8FE0L;
        int n = (int)(l2 >>> 32);
        int n2 = (int)(l2 << 32 >>> 48);
        int n3 = (int)(l2 << 48 >>> 48);
        this.k = tf::lambda$new$0;
        this.h = this::lambda$new$1;
        this.g().c((Object)this);
        try {
            de.florianmichael.c.f((int)n, (int)n2, (char)((char)n3));
            de.florianmichael.c.b.g();
        }
        catch (Exception exception) {

        }
        this.g().c((Object)new dL());
        this.m = new qT(lh.class);
    }

    public void b() {
        tf tf2;
        int n;
        int n2;
        long l;
        block7: {
            block8: {
                long l2;
                long l3 = l2 = q ^ 0xAD3996ADF2FL;
                long l4 = l3 ^ 0x53542EC2F1FDL;
                l = l4 >>> 32;
                n2 = (int)(l4 << 32 >>> 32);
                long l5 = l3 ^ 0x60B848B02A9EL;
                int n3 = (int)(l5 >>> 48);
                int n4 = (int)(l5 << 16 >>> 32);
                int n5 = (int)(l5 << 48 >>> 48);
                long l6 = l3 ^ 0x45D231B8CDDFL;
                int n6 = (int)(l6 >>> 32);
                long l7 = l6 << 32 >>> 32;
                long l8 = l3 ^ 0x78373554DC46L;
                int n7 = (int)(l8 >>> 32);
                int n8 = (int)(l8 << 32 >>> 48);
                int n9 = (int)(l8 << 48 >>> 48);
                long l9 = l3 ^ 0x45A4F080F5BFL;
                int n10 = (int)(l9 >>> 32);
                int n11 = (int)(l9 << 32 >>> 48);
                int n12 = (int)(l9 << 48 >>> 48);
                long l10 = l3 ^ 0x38C0B9D9678FL;
                int n13 = (int)(l10 >>> 48);
                long l11 = l10 << 16 >>> 16;
                long l12 = l3 ^ 0x19D6E38F5511L;
                int n14 = (int)(l12 >>> 32);
                long l13 = l12 << 32 >>> 32;
                long l14 = l3 ^ 0x76E8BE12BE6CL;
                long l15 = l14 >>> 16;
                int n15 = (int)(l14 << 48 >>> 48);
                this.m.d((char)n3, n4, n5);
                this.p = new t6();
                this.p.a((char)n13, l11);
                this.f = new ep(n14, l13);
                this.e = new Fw();
                n = eF.b();
                this.c = new nV();
                d = new pC();
                tf.n = new pJ();
                pj.a();
                jZ jZ2 = new jZ(n6, l7);
                try {
                    try {
                        jZ2.a(l15, (short)n15);
                        tf2 = this;
                        if (n != 0) break block7;
                        if (tf2.o.c(n7, (short)n8, (String)((Object)tf.a("f", (int)13352, (long)(0x74547AD61DD31B6DL ^ l2))), n9)) break block8;
                    }
                    catch (H h) {
                        throw tf.a((Exception)((Object)h));
                    }
                    this.o.d(n10, (String)((Object)tf.a("f", (int)22290, (long)(0x7520C3C29EB77855L ^ l2))), (short)n11, (short)n12);
                    this.o.c(n7, (short)n8, (String)((Object)tf.a("f", (int)22290, (long)(0x7520C3C29EB77855L ^ l2))), n9);
                }
                catch (H h) {
                    throw tf.a((Exception)((Object)h));
                }
            }
            this.a = new EN();
            tf.l.g().c((Object)this.a);
            tf2 = this;
        }
        try {
            tf2.a.d(l, n2);
            if (n != 0) {
                LQ.b((LQ[])new LQ[3]);
            }
        }
        catch (H h) {
            throw tf.a((Exception)((Object)h));
        }
    }

    public static ep c() {
        return tf.l.f;
    }

    public static Fw e() {
        return tf.l.e;
    }

    public static nV n() {
        return tf.l.c;
    }

    public qy<R_> g() {
        try {
            if (this.g == null) {
                this.g = new qy();
            }
        }
        catch (H h) {
            throw tf.a((Exception)((Object)h));
        }
        return this.g;
    }

    public static pC k() {
        return d;
    }

    public static pJ o() {
        return n;
    }

    public static tf l() {
        return l;
    }

    public static qT<lh> m() {
        return tf.l.m;
    }

    public static cQ f() {
        return tf.l.o;
    }

    public t6 d() {
        return this.p;
    }

    public EN h() {
        return this.a;
    }

    public static void b(String string) {
        int n = eF.a();
        new Thread(() -> tf.lambda$sendMessage$2(string)).start();
        int n2 = n;
        try {
            if (LQ.J() != null) {
                eF.b((int)(++n2));
            }
        }
        catch (H h) {
            throw tf.a((Exception)((Object)h));
        }
    }

    public static CompletableFuture<Boolean> a(String string) {
        return CompletableFuture.supplyAsync(() -> tf.lambda$sendMessageAsync$3(string));
    }

    public static void j(int n, int n2, short s) {
    }

    public static void a() {
    }

    public static tQ i() {
        return i;
    }

    public static void a(Object object) {
        i = (tQ)((tn)object).b();
    }

    private static Boolean lambda$sendMessageAsync$3(String string) {
        return Boolean.TRUE;
    }

    private static void lambda$sendMessage$2(String string) {
    }

    private void lambda$new$1(d3 d32) {
        long l;
        long l2 = l = q ^ 0x354B7837C387L;
        long l3 = l2 ^ 0x7C1F7A60CAA2L;
        long l4 = l3 >>> 32;
        int n = (int)(l3 << 32 >>> 32);
        long l5 = l2 ^ 0x7EEFF6FAC330L;
        int n2 = (int)(l5 >>> 48);
        int n3 = (int)(l5 << 16 >>> 32);
        int n4 = (int)(l5 << 48 >>> 48);
        this.o = new cQ((short)n2, n3, (short)n4);
        hV.d().b(l4, n);
    }

    private static void lambda$new$0(cn cn2) {
        block10: {
            boolean bl;
            int n;
            long l;
            long l2;
            int n2;
            block8: {
                int n3;
                int n4;
                int n5;
                block9: {
                    long l3;
                    long l4 = l3 = q ^ 0x752E0F26EB78L;
                    long l5 = l4 ^ 0x3A2FA7F4F988L;
                    n2 = (int)(l5 >>> 32);
                    l2 = l5 << 32 >>> 32;
                    long l6 = l4 ^ 0x72F77AD4CF7FL;
                    n5 = (int)(l6 >>> 48);
                    n4 = (int)(l6 << 16 >>> 32);
                    n3 = (int)(l6 << 48 >>> 48);
                    long l7 = l4 ^ 0x1B84CAF9988DL;
                    l = l7 >>> 16;
                    n = (int)(l7 << 48 >>> 48);
                    int n6 = eF.b();
                    try {
                        bl = cn2.b();
                        if (n6 != 0) break block8;
                        if (!bl) break block9;
                    }
                    catch (H h) {
                        throw tf.a((Exception)((Object)h));
                    }
                    return;
                }
                bl = h4.d((char)((char)n5), (int)n4, (int)n3);
            }
            try {
                try {
                    try {
                        if (!bl || Fv.l == null) break block10;
                    }
                    catch (H h) {
                        throw tf.a((Exception)((Object)h));
                    }
                    if (Boolean.FALSE.equals(Fv.l.m())) break block10;
                }
                catch (H h) {
                    throw tf.a((Exception)((Object)h));
                }
                Fv.l.a(Boolean.valueOf(false));
                Fv.l.b(-1L);
                new jZ(n2, l2).b(l, (char)n);
            }
            catch (H h) {
                throw tf.a((Exception)((Object)h));
            }
        }
    }




    static {
        block11: {
            block10: {
                tf.q = _c.a((long)-3549440919217771889L, (long)-2306012709083324354L, MethodHandles.lookup().lookupClass()).a(278459296037630L);
                tf.t = new HashMap<K, V>(13);
                var0 = tf.q ^ 71197449388714L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "m\u009fd]\u00f6\u00a0b[\u00d0\u00bc\u00a0,\u00fc.\u0093_\u0099Xb\u00d4\u00f3Vff\u00ec\u00f0\u0088\u001d%{\u00fc*\u00c6\u00bd\u00ddO\u00feg\u00e3\u001b\u00104G]\u00e4B\u0080\u0095\u009a\u0014\u00fa\u00bf\u00de\u00b3t\u00a0l\u0018v%\u000f\u00b0i~m5\u00a9\u0094c\u00f3\u0083\u00aa\u00d3\u00fe\u00fa\u00cf\u0091\u00fc\u008a2,8\u0018\u001d\r\u00b2\u0099hV\u00e1(\u00fdk\u00e6\u009e\u00edbZO\u00e8\u00e3}\u00cf\u00c9D\u0083\u00bc \u0018\"&\u00900,s\u00e5;\u0016u; \u00e6\u00f2\u00e6\u008a\u00af\u00a0\u00d0\u00fcO\u00b1+\u009e\u00c8[\u0005\u00b4\u00f8i\u00ac\u0010\u0010j\u0088x\u00cb\u0082\u00a8\u0084:\u001b\u00da\u000b\u00c1\u00f7\u00d25\u0010\u008a\u00b3\u00c9\u0002\u00edN\u000eU~}\u00c7:\u00be\u00cacl";
                var8_6 = "m\u009fd]\u00f6\u00a0b[\u00d0\u00bc\u00a0,\u00fc.\u0093_\u0099Xb\u00d4\u00f3Vff\u00ec\u00f0\u0088\u001d%{\u00fc*\u00c6\u00bd\u00ddO\u00feg\u00e3\u001b\u00104G]\u00e4B\u0080\u0095\u009a\u0014\u00fa\u00bf\u00de\u00b3t\u00a0l\u0018v%\u000f\u00b0i~m5\u00a9\u0094c\u00f3\u0083\u00aa\u00d3\u00fe\u00fa\u00cf\u0091\u00fc\u008a2,8\u0018\u001d\r\u00b2\u0099hV\u00e1(\u00fdk\u00e6\u009e\u00edbZO\u00e8\u00e3}\u00cf\u00c9D\u0083\u00bc \u0018\"&\u00900,s\u00e5;\u0016u; \u00e6\u00f2\u00e6\u008a\u00af\u00a0\u00d0\u00fcO\u00b1+\u009e\u00c8[\u0005\u00b4\u00f8i\u00ac\u0010\u0010j\u0088x\u00cb\u0082\u00a8\u0084:\u001b\u00da\u000b\u00c1\u00f7\u00d25\u0010\u008a\u00b3\u00c9\u0002\u00edN\u000eU~}\u00c7:\u00be\u00cacl".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = tf.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00aa\u00a7\u0007l\u0094\u00fe\n\u0004G\u00fd`\u00cdT\u0015\u00a7\u008f(\u00c281\u0013\u000b@\u00f6f\u00c8\u00b00w.\u0005m(C\u0085\u00b9[\u00b5 \u009e\u008f\u00fb\u009e\t\u00ac9|\u00f1\u00b8\u00ae\u00e4\u00cd\u00c8D\u0093\u00b1\u00f4";
                    var8_6 = "\u00aa\u00a7\u0007l\u0094\u00fe\n\u0004G\u00fd`\u00cdT\u0015\u00a7\u008f(\u00c281\u0013\u000b@\u00f6f\u00c8\u00b00w.\u0005m(C\u0085\u00b9[\u00b5 \u009e\u008f\u00fb\u009e\t\u00ac9|\u00f1\u00b8\u00ae\u00e4\u00cd\u00c8D\u0093\u00b1\u00f4".length();
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
                    var9_3[var7_4++] = tf.a(var10_9).intern();
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
        tf.r = var9_3;
        tf.s = new String[9];
        tf.l = new tf();
        tf.j = 0;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E22;
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
                throw new RuntimeException("tf", exception);
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
            tf.s[n2] = tf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = tf.a(n, l);
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
            throw new RuntimeException("tf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(tf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
