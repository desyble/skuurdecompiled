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

public class li
extends lh {
    private final Pd k;
    private final kt<RB> l;
    private final kt<Number> m;
    private final kt<Boolean> r;
    private final kt<Number> o;
    @A
    public final R8<H6> q;
    @A
    public final R8<b5> p;
    @A
    public final R8<bR> n;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;

    public li(short s, int n, EU eU, short s2) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ li.s;
        super(eU);
        this.k = new Pd();
        this.l = new kt((String)((Object)li.a("k", (int)20083, (long)(0xF3CAAA56F751A27L ^ l))), (Object)new RB((String)((Object)li.a("k", (int)13149, (long)(0x7489FD808FACE70BL ^ l))), new String[]{li.a("k", (int)13149, (long)(0x7489FD808FACE70BL ^ l)), li.a("k", (int)29195, (long)(0x6354DAB00191A657L ^ l))}), (String)((Object)li.a("k", (int)12179, (long)(0x68D1449EF0137BC3L ^ l))));
        this.m = new kt((String)((Object)li.a("k", (int)15523, (long)(0x65D49771F5B668FCL ^ l))), (Object)5.0, (String)((Object)li.a("k", (int)14456, (long)(0x60437EEC2E2D6C2FL ^ l))), 0.5, 3.0, 10.0);
        this.r = new kt((String)((Object)li.a("k", (int)26175, (long)(0x1B69B303D4BBB26CL ^ l))), (Object)false, (String)((Object)li.a("k", (int)14612, (long)(0x4876C8239B186D4AL ^ l))), this::lambda$new$0);
        this.o = new kt((String)((Object)li.a("k", (int)29996, (long)(0x16F94FED221E2171L ^ l))), (Object)20.0, (String)((Object)li.a("k", (int)8591, (long)(0x15E8815948FE75DDL ^ l))), 5.0, 10.0, 20.0, this::lambda$new$1);
        this.q = this::lambda$new$2;
        this.p = this::lambda$new$3;
        this.n = li::lambda$new$4;
        this.a(new kt[]{this.l, this.m, this.r, this.o});
    }

    public void d(int n, int n2, int n3) {
        this.k.e();
    }

    public void a(char c, long l) {
    }

    private void b() {
        qP qP2 = new qP(aQ.b((A6)PE.b2), 1);
        double d = Hk.j().ax;
        double d2 = Hk.j().e;
        double d3 = Hk.j().av;
        boolean bl = lj.i();
        for (int i = 1; i <= 5; ++i) {
            xc xc2 = new xc(d, d2 - (double)i, d3);
            Kg kg = new Kg(xc2, qu.UP.h(), qP2, 0.5f, 1.0f, 0.5f);
            Ab.b((I2)kg);
            if (bl) continue;
        }
    }

    private static void lambda$new$4(bR bR2) {
    }




    private void lambda$new$3(b5 var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }

    private void lambda$new$2(H6 h6) {
        this.k.e();
    }

    private boolean lambda$new$1() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    long l = s ^ 0x26FF5DC78B9BL;
                    bl2 = lj.k();
                    try {
                        try {
                            bl = this.l.q().equals(li.a("k", (int)14633, (long)(0x2AB375579295A80BL ^ l)));
                            if (bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw li.a(h);
                        }
                        bl = (Boolean)this.r.i();
                    }
                    catch (H h) {
                        throw li.a(h);
                    }
                }
                try {
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw li.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$0() {
        long l = s ^ 0x6A6263844A8FL;
        return this.l.q().equals(li.a("k", (int)29195, (long)(0x6354BE66BC342230L ^ l)));
    }




    static {
        block11: {
            block10: {
                li.s = _c.a((long)-1056842665489973556L, (long)-2531324621130041656L, MethodHandles.lookup().lookupClass()).a(249044160644815L);
                li.v = new HashMap<K, V>(13);
                var0 = li.s ^ 103131085155484L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00c4\u0082>\u00f8zq\u000b\u0001*\u00c6#\u00c2\u0088Y\u00e1N\u00ed\u00dc;{\u009f\u0019\u00ce\u00cbj^\u00ac\u0092\u00a7\b\u0083\u00ad.\b=\u00a7\u0011L\u00d9\u009b\u0010847\u00b9\u00a4/zS\u0013'\u0080l\u00de\u00c5\u008a,\u0010\u00fa\u00e4\u00ce:\u00d0[\u00ab\u00dan\u009a\u00bc\u0080\u00e7U\u00bf/\u0010M\u0006\u00e1\u00c8\u0005y8\u00f5\f\u009anq\u0014lk#\u0010os\u0090\u008b\u008a\u009a\u00cb\u009d\n$8\u001b%\u00f8T\u00ba(\u00b0,\b\u00f7\u008c\u00ac\t\u00bd\u009f\u00b0\u00eex\u00f6O\u00a9\u00c3I\u00a0%\u00ef\u00f0gHD\u00fc\u00d0\u008f\u009f\u0099\u0018\u00b3\u000b1\u000e\u009b\u00ca\u0095^\u00e2\u000b\u0010n\u00de\u00ec\u00aeH\u008c\u0091\u00ef\u0006\u0095\u0015\u00c4\u00a2\u0090\u000e\u00a3 :\r\u00cc\u009d\u0081\u00f5\u00d9\r\u00f0\u001c\u00f2\u0085\u0005Kh0\u00b3\u0086\u008c^\u00d0\u00ca\u0092\\\u0005\"\u00ef\u00d6D?Z@ -P,\u00b7_^3\u00ef\u00d9}\u009a\u008a\u00bc\u0018h\u0010\u00b5y\u00b7\u0017@^\u00b9\u0013\u000e\u00a5\u00b9+\u00a6\u0017 \u00f7(\u00b6\u00d5\u00c7o\u00e7u,\u008d\u008a9\u00d19Ni\u00aa\u009d\u0086\u009eI\u00a1TJ\u00ae\u0092\u00cc\u00be|\u0017\u00a9\u00a5\u00dc\u00df\u00d2\u001f\u0089/l\u00db\"\u0002";
                var8_6 = "\u00c4\u0082>\u00f8zq\u000b\u0001*\u00c6#\u00c2\u0088Y\u00e1N\u00ed\u00dc;{\u009f\u0019\u00ce\u00cbj^\u00ac\u0092\u00a7\b\u0083\u00ad.\b=\u00a7\u0011L\u00d9\u009b\u0010847\u00b9\u00a4/zS\u0013'\u0080l\u00de\u00c5\u008a,\u0010\u00fa\u00e4\u00ce:\u00d0[\u00ab\u00dan\u009a\u00bc\u0080\u00e7U\u00bf/\u0010M\u0006\u00e1\u00c8\u0005y8\u00f5\f\u009anq\u0014lk#\u0010os\u0090\u008b\u008a\u009a\u00cb\u009d\n$8\u001b%\u00f8T\u00ba(\u00b0,\b\u00f7\u008c\u00ac\t\u00bd\u009f\u00b0\u00eex\u00f6O\u00a9\u00c3I\u00a0%\u00ef\u00f0gHD\u00fc\u00d0\u008f\u009f\u0099\u0018\u00b3\u000b1\u000e\u009b\u00ca\u0095^\u00e2\u000b\u0010n\u00de\u00ec\u00aeH\u008c\u0091\u00ef\u0006\u0095\u0015\u00c4\u00a2\u0090\u000e\u00a3 :\r\u00cc\u009d\u0081\u00f5\u00d9\r\u00f0\u001c\u00f2\u0085\u0005Kh0\u00b3\u0086\u008c^\u00d0\u00ca\u0092\\\u0005\"\u00ef\u00d6D?Z@ -P,\u00b7_^3\u00ef\u00d9}\u009a\u008a\u00bc\u0018h\u0010\u00b5y\u00b7\u0017@^\u00b9\u0013\u000e\u00a5\u00b9+\u00a6\u0017 \u00f7(\u00b6\u00d5\u00c7o\u00e7u,\u008d\u008a9\u00d19Ni\u00aa\u009d\u0086\u009eI\u00a1TJ\u00ae\u0092\u00cc\u00be|\u0017\u00a9\u00a5\u00dc\u00df\u00d2\u001f\u0089/l\u00db\"\u0002".length();
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
                    var9_3[var7_4++] = li.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cc\u009b\u00bcO\u00e8\u0001\u00c4\u0083\u00e1\u00a1\u00a3\u00fcD^\u0007\u00f5\u00bc\u009a4\u00ff-\u00f7p9\u0010\u00b7\u0093\u00d1{KU\u0080\u001c\u00b3]G\u00aa5\u00fd\u00d6|";
                    var8_6 = "\u00cc\u009b\u00bcO\u00e8\u0001\u00c4\u0083\u00e1\u00a1\u00a3\u00fcD^\u0007\u00f5\u00bc\u009a4\u00ff-\u00f7p9\u0010\u00b7\u0093\u00d1{KU\u0080\u001c\u00b3]G\u00aa5\u00fd\u00d6|".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = li.a(var10_9).intern();
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
        li.t = var9_3;
        li.u = new String[12];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x701D;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("li", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = t[n2].getBytes("ISO-8859-1");
            li.u[n2] = li.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = li.a(n, l);
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
            throw new RuntimeException("li" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(li.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
