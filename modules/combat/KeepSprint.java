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
import org.lwjgl.input.Keyboard;

public class lH
extends lh {
    private final kt<Number> l;
    private final kt<Boolean> n;
    private final kt<Number> q;
    private final Pd m;
    private boolean k;
    private long r;
    @A
    public final R8<b1> p;
    @A
    public final R8<ck> o;
    private static final long s;
    private static final String[] t;
    private static final String[] u;
    private static final Map v;

    public lH(byte by, int n, int n2, EU eU) {
        long l = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ s;
        super(eU);
        this.l = new kt((String)((Object)lH.a("e", (int)21556, (long)(0x48D42ECD5969D830L ^ l))), (Object)0.6, (String)((Object)lH.a("e", (int)26831, (long)(0x1F1D037D8C464CFL ^ l))), 0.01, 0.6, 1.0);
        this.n = new kt((String)((Object)lH.a("e", (int)12813, (long)(0x15B520E609F4BE0AL ^ l))), (Object)false, (String)((Object)lH.a("e", (int)21524, (long)(0x1A6222D341AD817L ^ l))));
        this.q = new kt((String)((Object)lH.a("e", (int)8228, (long)(0x1F0E458FAB982C26L ^ l))), (Object)8, (String)((Object)lH.a("e", (int)18596, (long)(0x64736469542044A1L ^ l))), 1.0, 0.0, 20.0, (String)((Object)lH.a("e", (int)25009, (long)(0xD70F36811756DB7L ^ l))), () -> this.n.g());
        this.m = new Pd();
        this.k = false;
        this.r = 0L;
        this.p = this::lambda$new$0;
        this.o = this::lambda$new$1;
        kt kt2 = new kt((String)((Object)lH.a("e", (int)9767, (long)(0x478173CE92592A26L ^ l))), new kt[]{this.n, this.q});
        this.a(new kt[]{this.l, kt2});
    }

    private void lambda$new$1(ck ck2) {
        block31: {
            int n;
            block33: {
                int[] nArray;
                block32: {
                    block30: {
                        block28: {
                            block29: {
                                block26: {
                                    block27: {
                                        block24: {
                                            long l = System.currentTimeMillis();
                                            nArray = lX.f();
                                            int n2 = this.q.m() * 50;
                                            try {
                                                block25: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (nArray != null) break block24;
                                                                if (l - this.r <= (long)n2) break block25;
                                                            }
                                                            catch (H h) {
                                                                throw lH.a(h);
                                                            }
                                                            n = this.n.g();
                                                            if (nArray != null) break block26;
                                                        }
                                                        catch (H h) {
                                                            throw lH.a(h);
                                                        }
                                                        if (n != 0) break block27;
                                                    }
                                                    catch (H h) {
                                                        throw lH.a(h);
                                                    }
                                                }
                                                this.k = false;
                                            }
                                            catch (H h) {
                                                throw lH.a(h);
                                            }
                                        }
                                        return;
                                    }
                                    n = this.k;
                                }
                                try {
                                    try {
                                        if (nArray != null) break block28;
                                        if (n == 0) break block29;
                                    }
                                    catch (H h) {
                                        throw lH.a(h);
                                    }
                                    bU.a((int)Hk.i().R.d(), (boolean)false);
                                }
                                catch (H h) {
                                    throw lH.a(h);
                                }
                            }
                            n = this.m.a(20L);
                        }
                        try {
                            try {
                                if (nArray != null) break block30;
                                if (n == 0) break block31;
                            }
                            catch (H h) {
                                throw lH.a(h);
                            }
                            n = this.k;
                        }
                        catch (H h) {
                            throw lH.a(h);
                        }
                    }
                    try {
                        try {
                            if (nArray != null) break block32;
                            if (n == 0) break block31;
                        }
                        catch (H h) {
                            throw lH.a(h);
                        }
                        n = Keyboard.isKeyDown((int)Hk.i().b4.d());
                    }
                    catch (H h) {
                        throw lH.a(h);
                    }
                }
                try {
                    try {
                        if (nArray != null) break block33;
                        if (n == 0) break block31;
                    }
                    catch (H h) {
                        throw lH.a(h);
                    }
                    n = Hk.i().R.d();
                }
                catch (H h) {
                    throw lH.a(h);
                }
            }
            bU.a((int)n, (boolean)true);
            Hk.j().cP = false;
            this.k = false;
            this.r = System.currentTimeMillis();
        }
    }

    private void lambda$new$0(b1 b12) {
        block9: {
            block10: {
                lH lH2;
                boolean bl;
                block8: {
                    long l = s ^ 0xF5FD3E83FBL;
                    long l2 = l ^ 0xC3C0CB174CBL;
                    int n = (int)(l2 >>> 56);
                    long l3 = l2 << 8 >>> 8;
                    int[] nArray = lX.f();
                    b12.a();
                    int[] nArray2 = nArray;
                    MI mI = Hk.j();
                    try {
                        try {
                            try {
                                mI.D *= (double)this.l.k();
                                mI.ac *= (double)this.l.k();
                                mI.g(false, (byte)n, l3);
                                bl = this.n.g();
                                if (nArray2 != null) break block8;
                                if (!bl) break block9;
                            }
                            catch (H h) {
                                throw lH.a(h);
                            }
                            lH2 = this;
                            if (nArray2 != null) break block10;
                        }
                        catch (H h) {
                            throw lH.a(h);
                        }
                        bl = lH2.k;
                    }
                    catch (H h) {
                        throw lH.a(h);
                    }
                }
                try {
                    if (bl) break block9;
                    this.m.e();
                    lH2 = this;
                }
                catch (H h) {
                    throw lH.a(h);
                }
            }
            lH2.k = true;
        }
    }




    static {
        block11: {
            block10: {
                lH.s = _c.a((long)7173831030613958514L, (long)-7031198364710996257L, MethodHandles.lookup().lookupClass()).a(257883332674351L);
                lH.v = new HashMap<K, V>(13);
                var0 = lH.s ^ 43003007338725L;
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
                var6_5 = "3\u007f\u0096.Hq\u001f\u008b\u001f\u008d\u001c\u00cb\u00ef\u0006\u0093\u00e6\u00deQeW/\u00d2\u00de\u001c\u001e\u00f4\rc}\u00ca\u00f0kU\u00e3[\u009f;O2\u00bc\u00d2\u001cmuNG'+U\u00f4\u00e5R`\r\u00f2En\u00d5\u00a5\u00dae!\u00a1\u00d2\u00b7\u00ebL\u009fX<\u00a0\\Cgn\u00f8\u0094\u00fb\u008d\u00e7\u0080\u00ca}\u00c7X:E\u00f4 \u00beH\u0099\u00ba\u00c5\u00ce\u00b5\u007f8d\u00c0v\u0097\u00ec\u00a7\u0010\u009e\u00a6\u0099\u00fbY'K76\u00ec^\u00d3\u00bf\u00be\u00fai me\u00e3x\"\u0010\u00f1\u00bc\u0093\u001d\u001b\u00a0\u00cd\u00c5\u00d8\u00c2\u007f\u00e4\u00edU\u00efM\u0017\u00c0\u00a8\u0094\u00b7tDd\u0015\u00d9Xa\u00b3\u00d7yM(v\u008b\u00bd\u00e8U\u0086\u00e9b\u00e3)\u009f\u009c\u00e2\u00adc\u00fd\t\u00c3\u0003Z_\u0001\u0098\u0019\u0004+\r\u0091\u00bc\u0082h@\u00daa\u00f7\u0018\u00a5\u00e8\u00fb\u008d\u00f0\u00c8q\u00a7t\u00fc\u00fa\u007f.\u00d1r>\u00d8s\u00f3\u0097\u0089!{\u0089\u0090\u00fcw\u00b5\u00d1\u0082\u00e4\u00a4\u00fb\u00e0\u00a8\rBYn\u0084!\u00c7\u00f3@U\u00cc\u0010B\u00f2\u0010`[J5Z\u00b9\u00bbI\u00c8\u00a8\u00e5\u0007\u00b4\u0010\u0083\u0099.\u00d0\u00e8\u00a0\u0089\u008e\u001f\u0092M\u00a9\u00fdP\u00e7\u00c9";
                var8_6 = "3\u007f\u0096.Hq\u001f\u008b\u001f\u008d\u001c\u00cb\u00ef\u0006\u0093\u00e6\u00deQeW/\u00d2\u00de\u001c\u001e\u00f4\rc}\u00ca\u00f0kU\u00e3[\u009f;O2\u00bc\u00d2\u001cmuNG'+U\u00f4\u00e5R`\r\u00f2En\u00d5\u00a5\u00dae!\u00a1\u00d2\u00b7\u00ebL\u009fX<\u00a0\\Cgn\u00f8\u0094\u00fb\u008d\u00e7\u0080\u00ca}\u00c7X:E\u00f4 \u00beH\u0099\u00ba\u00c5\u00ce\u00b5\u007f8d\u00c0v\u0097\u00ec\u00a7\u0010\u009e\u00a6\u0099\u00fbY'K76\u00ec^\u00d3\u00bf\u00be\u00fai me\u00e3x\"\u0010\u00f1\u00bc\u0093\u001d\u001b\u00a0\u00cd\u00c5\u00d8\u00c2\u007f\u00e4\u00edU\u00efM\u0017\u00c0\u00a8\u0094\u00b7tDd\u0015\u00d9Xa\u00b3\u00d7yM(v\u008b\u00bd\u00e8U\u0086\u00e9b\u00e3)\u009f\u009c\u00e2\u00adc\u00fd\t\u00c3\u0003Z_\u0001\u0098\u0019\u0004+\r\u0091\u00bc\u0082h@\u00daa\u00f7\u0018\u00a5\u00e8\u00fb\u008d\u00f0\u00c8q\u00a7t\u00fc\u00fa\u007f.\u00d1r>\u00d8s\u00f3\u0097\u0089!{\u0089\u0090\u00fcw\u00b5\u00d1\u0082\u00e4\u00a4\u00fb\u00e0\u00a8\rBYn\u0084!\u00c7\u00f3@U\u00cc\u0010B\u00f2\u0010`[J5Z\u00b9\u00bbI\u00c8\u00a8\u00e5\u0007\u00b4\u0010\u0083\u0099.\u00d0\u00e8\u00a0\u0089\u008e\u001f\u0092M\u00a9\u00fdP\u00e7\u00c9".length();
                var5_7 = 88;
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
                    var9_3[var7_4++] = lH.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\r\u0089\u0016\u0088R\u0006\u00c1\u0004\u000e7\u0016\u008b@T\u00a7&%\u00d1\u00a23z|\u009a}\u008b&\b\u008a\u0013\u00a1\u00c2\u008fU\u00c7p\u009de\u00cd3\u00fc\u008aE\u00cfz\t\u0016\u00d4\u00d6\b5\u00ae\u00b3\u00da\u0006\u0007HW>mV\u0002}\u00d1\u00b9\u0095\u00c8\u00e6rW=X\u00a6\u00da\u00fb\f\u008d\u00e4\u00d6\u007f\u00f4\u0010\u0084@\u00dd\u00b0-\u0004a\u00c8\u009c\u0016\u00ca\u0005\u00b4\u008a\t\u00cd";
                    var8_6 = "\r\u0089\u0016\u0088R\u0006\u00c1\u0004\u000e7\u0016\u008b@T\u00a7&%\u00d1\u00a23z|\u009a}\u008b&\b\u008a\u0013\u00a1\u00c2\u008fU\u00c7p\u009de\u00cd3\u00fc\u008aE\u00cfz\t\u0016\u00d4\u00d6\b5\u00ae\u00b3\u00da\u0006\u0007HW>mV\u0002}\u00d1\u00b9\u0095\u00c8\u00e6rW=X\u00a6\u00da\u00fb\f\u008d\u00e4\u00d6\u007f\u00f4\u0010\u0084@\u00dd\u00b0-\u0004a\u00c8\u009c\u0016\u00ca\u0005\u00b4\u008a\t\u00cd".length();
                    var5_7 = 80;
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
                    var9_3[var7_4++] = lH.a(var10_9).intern();
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
        lH.t = var9_3;
        lH.u = new String[8];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2551;
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
                throw new RuntimeException("lH", exception);
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
            lH.u[n2] = lH.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lH.a(n, l);
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
            throw new RuntimeException("lH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
