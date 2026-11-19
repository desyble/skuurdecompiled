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

public class le
extends lh {
    private final kt<RB> o;
    private final kt<Number> n;
    private final kt<Boolean> q;
    private int m;
    @A
    public final R8<b5> l;
    @A
    public final R8<cn> k;
    @A
    public final R8<bD> p;
    private static final long r;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;

    public le(int n, EU eU, char c, char c2) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ r;
        super(eU);
        this.o = new kt((String)((Object)le.a("s", (int)20785, (long)(0x16304A93541F49BCL ^ l))), (Object)new RB((String)((Object)le.a("s", (int)32668, (long)(0x2368431DBD59E719L ^ l))), new String[]{le.a("s", (int)32668, (long)(0x2368431DBD59E719L ^ l))}), (String)((Object)le.a("s", (int)28722, (long)(0x5754EEB10F4168B6L ^ l))));
        this.n = new kt((String)((Object)le.a("s", (int)8661, (long)(0x28972D094EAE3959L ^ l))), (Object)15, (String)((Object)le.a("s", (int)14964, (long)(0x7ABAFE846297A2F3L ^ l))), 1.0, 0.0, 20.0, (String)((Object)le.a("s", (int)2466, (long)(0x67867DA66CE59124L ^ l))));
        this.q = new kt((String)((Object)le.a("s", (int)27702, (long)(0x7A21BE6AC69774B5L ^ l))), (Object)false, (String)((Object)le.a("s", (int)9319, (long)(0x411F6AE5FBC4BCE5L ^ l))));
        this.m = 0;
        this.l = this::lambda$new$0;
        this.k = this::lambda$new$1;
        this.p = this::lambda$new$2;
        this.a(new kt[]{this.o, this.n, this.q});
    }

    public void d(int n, int n2, int n3) {
        Object object;
        StringBuilder stringBuilder;
        le le2;
        block6: {
            int n4;
            block4: {
                block5: {
                    long l = (long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48;
                    int[] nArray = lX.f();
                    try {
                        try {
                            le2 = this;
                            stringBuilder = new StringBuilder().append(this.o.q()).append(" ");
                            n4 = ((Boolean)this.q.i()).booleanValue();
                            if (nArray != null) break block4;
                            if (n4 == 0) break block5;
                        }
                        catch (H h) {
                            throw le.a(h);
                        }
                        object = le.a("s", (int)17030, (long)(0x5654707E73718718L ^ l));
                        break block6;
                    }
                    catch (H h) {
                        throw le.a(h);
                    }
                }
                n4 = this.n.m();
            }
            object = n4;
        }
        le2.b(stringBuilder.append(object).toString());
    }

    public void a(char c, long l) {
        this.m = 0;
    }




    private void lambda$new$2(bD var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }

    private void lambda$new$1(cn cn2) {
        try {
            if (cn2.b()) {
                return;
            }
        }
        catch (H h) {
            throw le.a(h);
        }
        try {
            if (Hk.j() == null) {
                return;
            }
        }
        catch (H h) {
            throw le.a(h);
        }
        --this.m;
    }

    private void lambda$new$0(b5 b52) {
        Object object;
        StringBuilder stringBuilder;
        le le2;
        block6: {
            int n;
            block4: {
                block5: {
                    long l = r ^ 0x7EC82290FE9EL;
                    int[] nArray = lX.f();
                    try {
                        try {
                            le2 = this;
                            stringBuilder = new StringBuilder().append(this.o.q()).append(" ");
                            n = ((Boolean)this.q.i()).booleanValue();
                            if (nArray != null) break block4;
                            if (n == 0) break block5;
                        }
                        catch (H h) {
                            throw le.a(h);
                        }
                        object = le.a("s", (int)17030, (long)(0x565422CC3F63E07EL ^ l));
                        break block6;
                    }
                    catch (H h) {
                        throw le.a(h);
                    }
                }
                n = this.n.m();
            }
            object = n;
        }
        le2.b(stringBuilder.append(object).toString());
    }




    static {
        block11: {
            block10: {
                le.r = _c.a((long)7924474317729740689L, (long)-312583030874931970L, MethodHandles.lookup().lookupClass()).a(129280332733507L);
                le.u = new HashMap<K, V>(13);
                var0 = le.r ^ 71288116348362L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u0090N\r\u00b3F\u00a6!\u00ccjQ'<\u00e4\u00d47\u00fe\u009b\u00dcL\u00caQ\u00bc\u0088PfQ\u0083\u00b3\u00fa;\u00bbiA\u0090Y\u001b$\u00f5\u00fa\u00e1 \u0096\u00c8&\u0080\u001d\u00b7\u00c1!\u0086\u0006\u00bb\u00c0\u0090\u00cd \u000b\u0019K\r\u0016w\u00d7\u00cd\u00c7e\u00e8\u0084i\u00a5\u00eex\u00b0\u0010\u00f7\u00ec'\u00e7\u00cbV\u0087\u00d7%\u008a\u00c4\u008f\u00b2=\u00e6\u00a70K\u00e0\u00cf\u00a9\u00d8\u00afc\u00ea|\u000e\u00fd}D\u00f4K\u001f\u00ed1\u00d3\u00f7S\u00ee\u00c1\u00c3\u001b%w\u00fff\u00e0\u0081;\u0011o|\u00ee\u00b5H\u0087\u008cU\u0012\u00e9:\u001cn\u0007\u00f3\u0010/*\u00d9P\u000bE\u00bb$\u0086yH\u00d9\u001e\u009b\u0081n f`#\u00f4u\u00b5\u00e6\u00e9\u00c6\u008d\u0011?v\u00a1!\u00ed\u00ed\u00ba\u00bb\u00e6\\\u00baUIf@\u000b\u00d8\u001f\u0087\u00c9\u00f1Pn\u00a9\u00cf&\u00f5\u0000gL\u00ca^P\u00af\u00cd\u00cf_\u00ba\u009b\u00af\u00b4\u009e\u0005\u0083\u00bb\u0016\u00e6P3\u00c5\u00831`]P?Uir\u001aL\u001f\u00f0=\u00b8\u00c8\u00f6\u008a\u00fe\u00d6\u00c5\u00a8mP\u00ec\u00d2\u00fc\u001d\u0005\u0082`\u00ef\u00c1hd[\u00e09\u0098.}\u0016\u0018MPx,\u00be\u00a8\u00c8\u00caW\u0010\u0012_\u0004\u0010\u008c\u001bkX\u0081\u00b31)\u00ef\u00f0\u0003\u00a6";
                var8_6 = "\u0090N\r\u00b3F\u00a6!\u00ccjQ'<\u00e4\u00d47\u00fe\u009b\u00dcL\u00caQ\u00bc\u0088PfQ\u0083\u00b3\u00fa;\u00bbiA\u0090Y\u001b$\u00f5\u00fa\u00e1 \u0096\u00c8&\u0080\u001d\u00b7\u00c1!\u0086\u0006\u00bb\u00c0\u0090\u00cd \u000b\u0019K\r\u0016w\u00d7\u00cd\u00c7e\u00e8\u0084i\u00a5\u00eex\u00b0\u0010\u00f7\u00ec'\u00e7\u00cbV\u0087\u00d7%\u008a\u00c4\u008f\u00b2=\u00e6\u00a70K\u00e0\u00cf\u00a9\u00d8\u00afc\u00ea|\u000e\u00fd}D\u00f4K\u001f\u00ed1\u00d3\u00f7S\u00ee\u00c1\u00c3\u001b%w\u00fff\u00e0\u0081;\u0011o|\u00ee\u00b5H\u0087\u008cU\u0012\u00e9:\u001cn\u0007\u00f3\u0010/*\u00d9P\u000bE\u00bb$\u0086yH\u00d9\u001e\u009b\u0081n f`#\u00f4u\u00b5\u00e6\u00e9\u00c6\u008d\u0011?v\u00a1!\u00ed\u00ed\u00ba\u00bb\u00e6\\\u00baUIf@\u000b\u00d8\u001f\u0087\u00c9\u00f1Pn\u00a9\u00cf&\u00f5\u0000gL\u00ca^P\u00af\u00cd\u00cf_\u00ba\u009b\u00af\u00b4\u009e\u0005\u0083\u00bb\u0016\u00e6P3\u00c5\u00831`]P?Uir\u001aL\u001f\u00f0=\u00b8\u00c8\u00f6\u008a\u00fe\u00d6\u00c5\u00a8mP\u00ec\u00d2\u00fc\u001d\u0005\u0082`\u00ef\u00c1hd[\u00e09\u0098.}\u0016\u0018MPx,\u00be\u00a8\u00c8\u00caW\u0010\u0012_\u0004\u0010\u008c\u001bkX\u0081\u00b31)\u00ef\u00f0\u0003\u00a6".length();
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
                    var9_3[var7_4++] = le.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "7i\u00a9\u00b9\u001c\u0084`\u00cf\\-\u0091\u00cc\u00cae\u008c:\u0010)E\u0090dJ\u00e41b\u0099\u00e8-\u008en\u00e2<~";
                    var8_6 = "7i\u00a9\u00b9\u001c\u0084`\u00cf\\-\u0091\u00cc\u00cae\u008c:\u0010)E\u0090dJ\u00e41b\u0099\u00e8-\u008en\u00e2<~".length();
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
                    var9_3[var7_4++] = le.a(var10_9).intern();
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
        le.s = var9_3;
        le.t = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x551C;
        if (t[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])u.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("le", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = s[n2].getBytes("ISO-8859-1");
            le.t[n2] = le.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = le.a(n, l);
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
            throw new RuntimeException("le" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(le.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
