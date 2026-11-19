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

public class mO
extends lh {
    private final kt<Boolean> k;
    private final kt<Number> m;
    private final kt<Boolean> l;
    private static final long n;
    private static final String[] o;
    private static final String[] p;
    private static final Map q;

    public mO(char c, int n, short s, EU eU) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ mO.n;
        super(eU);
        this.k = new kt((String)((Object)mO.a("p", (int)10467, (long)(0x3191FDBEBC45AF6AL ^ l))), (Object)false, (String)((Object)mO.a("p", (int)2864, (long)(0x71DEF998E8078CBAL ^ l))));
        this.m = new kt((String)((Object)mO.a("p", (int)15882, (long)(0x4F60A885482F3986L ^ l))), (Object)0, (String)((Object)mO.a("p", (int)27639, (long)(0x1AFD31287A33EC7FL ^ l))), 1.0, -200.0, 200.0, this::lambda$new$0);
        this.l = new kt((String)((Object)mO.a("p", (int)22599, (long)(0x10259A2D9CDA5FCCL ^ l))), (Object)false, (String)((Object)mO.a("p", (int)24481, (long)(0x4B994D267BDD82CL ^ l))), this::lambda$new$1);
        this.a(new kt[]{this.m, this.l, this.k});
    }

    public int a() {
        int n;
        block4: {
            block5: {
                boolean bl = mr.k();
                try {
                    try {
                        n = this.b();
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (H h) {
                        throw mO.a(h);
                    }
                    n = this.m.m();
                    break block4;
                }
                catch (H h) {
                    throw mO.a(h);
                }
            }
            n = 0;
        }
        return n;
    }

    public boolean c() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    bl2 = mr.e();
                    try {
                        try {
                            bl = this.b();
                            if (bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mO.a(h);
                        }
                        bl = this.k.g();
                    }
                    catch (H h) {
                        throw mO.a(h);
                    }
                }
                try {
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mO.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean e() {
        boolean bl;
        block8: {
            block7: {
                boolean bl2;
                block6: {
                    bl2 = mr.k();
                    try {
                        try {
                            bl = this.b();
                            if (!bl2) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mO.a(h);
                        }
                        bl = this.l.g();
                    }
                    catch (H h) {
                        throw mO.a(h);
                    }
                }
                try {
                    if (!bl2) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mO.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$1() {
        boolean bl;
        block2: {
            block3: {
                boolean bl2 = mr.e();
                try {
                    bl = this.k.g();
                    if (bl2) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw mO.a(h);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private boolean lambda$new$0() {
        boolean bl;
        block2: {
            block3: {
                boolean bl2 = mr.k();
                try {
                    bl = this.k.g();
                    if (!bl2) break block2;
                    if (bl) break block3;
                }
                catch (H h) {
                    throw mO.a(h);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }




    static {
        block11: {
            block10: {
                mO.n = _c.a((long)1727379138742817736L, (long)-7637902371921798014L, MethodHandles.lookup().lookupClass()).a(181699477927674L);
                mO.q = new HashMap<K, V>(13);
                var0 = mO.n ^ 61695210682491L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00ac<V\u0018'\u0000D\u00c0\u0011T{@\u0015\u00e7Q\u00d9\u00db\u00f1\u0098\u00a8N\u009c\u00aa\u00b3,\u00962\r\u00d3\u00d1\u00c6\u00a1\u0007\u001bOp\u000b\u00d8o\n \u00f6\u00c7l\u00fb+\u0011\u001bH\u0018y\u00c8\u0012\u00c4\u0016r\u00b0\u00cf\u008aT;\u00e6OJc\u0099^\u009fi\u00c0\u00ea\u0097\u0094(\r\u00a3&\u00cen\u0015|f6aO\u00e7)\u00c3((\u00fc\u00cf\u00cd\u00eaRi=\u0018\u00e3\u0011\u00e6u\u00c89\"\u00d6\u0012\u0097jco#\u008eB\u0018\\U9\u00d6g\u00c5\u00fd\u00ed\u00f6\u00d3\u0013b4\n\u00dc\u0002\u0081D{\u00a0\u00aa\u00c5\u00df\u00d0";
                var8_6 = "\u00ac<V\u0018'\u0000D\u00c0\u0011T{@\u0015\u00e7Q\u00d9\u00db\u00f1\u0098\u00a8N\u009c\u00aa\u00b3,\u00962\r\u00d3\u00d1\u00c6\u00a1\u0007\u001bOp\u000b\u00d8o\n \u00f6\u00c7l\u00fb+\u0011\u001bH\u0018y\u00c8\u0012\u00c4\u0016r\u00b0\u00cf\u008aT;\u00e6OJc\u0099^\u009fi\u00c0\u00ea\u0097\u0094(\r\u00a3&\u00cen\u0015|f6aO\u00e7)\u00c3((\u00fc\u00cf\u00cd\u00eaRi=\u0018\u00e3\u0011\u00e6u\u00c89\"\u00d6\u0012\u0097jco#\u008eB\u0018\\U9\u00d6g\u00c5\u00fd\u00ed\u00f6\u00d3\u0013b4\n\u00dc\u0002\u0081D{\u00a0\u00aa\u00c5\u00df\u00d0".length();
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
                    var9_3[var7_4++] = mO.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "1\u00a3]\u00031\u0095\u00eb\u00a9\u00f9\u000fx\u00d8\u008b\u0090\u0097\u00b1\u0002\u00d1;\u00f18{\u00d6R0+\u0010\n'`GGt\u0090L%v\u00b2\u00ae\u008e\u0013B\u0081\u00a6M\u00d1\u0007\u009d\u00142\u00e8\u00ac\u0087\u00f0Y|#a\u0080\u00f1J\u00c9'E\u009d\\\u0005Cso\u00e3K\u00af";
                    var8_6 = "1\u00a3]\u00031\u0095\u00eb\u00a9\u00f9\u000fx\u00d8\u008b\u0090\u0097\u00b1\u0002\u00d1;\u00f18{\u00d6R0+\u0010\n'`GGt\u0090L%v\u00b2\u00ae\u008e\u0013B\u0081\u00a6M\u00d1\u0007\u009d\u00142\u00e8\u00ac\u0087\u00f0Y|#a\u0080\u00f1J\u00c9'E\u009d\\\u0005Cso\u00e3K\u00af".length();
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
                    var9_3[var7_4++] = mO.a(var10_9).intern();
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
        mO.o = var9_3;
        mO.p = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x22F9;
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
                throw new RuntimeException("mO", exception);
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
            mO.p[n2] = mO.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return p[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mO.a(n, l);
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
            throw new RuntimeException("mO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
