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

public class lC
extends lh {
    private final kt<Boolean> q;
    private boolean r;
    private boolean m;
    private boolean o;
    private boolean p;
    private final Pd n;
    private int s;
    @A
    public final R8<ck> k;
    @A
    public final R8<c4> l;
    private static final long t = _c.a((long)9108510154081512796L, (long)-583850296962016576L, MethodHandles.lookup().lookupClass()).a(11314645219119L);
    private static final String[] u;
    private static final String[] v;
    private static final Map w;

    public lC(short s, int n, char c, EU eU) {
        long l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ t;
        super(eU);
        this.q = new kt((String)((Object)lC.a("s", (int)21546, (long)(0x2B1FBB70429D91FEL ^ l))), (Object)true, (String)((Object)lC.a("s", (int)28250, (long)(0x5A36069525952B8FL ^ l))));
        this.r = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.n = new Pd();
        this.s = 0;
        this.k = this::lambda$new$0;
        this.l = this::lambda$new$1;
        this.a(new kt[]{this.q});
    }

    public void a(char c, long l) {
        this.r = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.n.e();
        this.s = 0;
    }

    private void lambda$new$1(c4 c42) {
        block9: {
            block8: {
                int n;
                boolean bl;
                block6: {
                    block7: {
                        bl = lj.i();
                        try {
                            n = this.r;
                            if (!bl) break block6;
                            if (n != 0) break block7;
                        }
                        catch (H h) {
                            throw lC.a(h);
                        }
                        return;
                    }
                    n = c42.b().c();
                }
                double d = n;
                double d2 = c42.b().a();
                double d3 = c42.b().b();
                try {
                    try {
                        if (!bl) break block8;
                        if (!(d2 < Hk.j().e)) break block9;
                    }
                    catch (H h) {
                        throw lC.a(h);
                    }
                    c42.a(em.a((double)-15.0, (double)-1.0, (double)-15.0, (double)15.0, (double)1.0, (double)15.0).a(d, d2, d3));
                }
                catch (H h) {
                    throw lC.a(h);
                }
            }
            this.p = true;
        }
    }

    private void lambda$new$0(ck ck2) {
        boolean bl;
        block86: {
            lC lC2;
            block85: {
                double d;
                block87: {
                    int n;
                    boolean bl2;
                    MI mI;
                    block84: {
                        block82: {
                            block83: {
                                int n2;
                                int n3;
                                int n4;
                                block78: {
                                    block79: {
                                        block80: {
                                            lC lC3;
                                            block81: {
                                                block76: {
                                                    block77: {
                                                        int n5;
                                                        block73: {
                                                            block75: {
                                                                MI mI2;
                                                                block71: {
                                                                    block72: {
                                                                        long l = t ^ 0x5E7DE427A4FEL;
                                                                        long l2 = l ^ 0x5A5C743D8875L;
                                                                        n4 = (int)(l2 >>> 48);
                                                                        n3 = (int)(l2 << 16 >>> 32);
                                                                        n2 = (int)(l2 << 48 >>> 48);
                                                                        mI = Hk.j();
                                                                        bl2 = lj.k();
                                                                        try {
                                                                            mI2 = mI;
                                                                            if (bl2) break block71;
                                                                            if (mI2 != null) break block72;
                                                                        }
                                                                        catch (H h) {
                                                                            throw lC.a(h);
                                                                        }
                                                                        return;
                                                                    }
                                                                    mI2 = mI;
                                                                }
                                                                bl = mI2.al;
                                                                try {
                                                                    block74: {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    n5 = this.q.g();
                                                                                    if (bl2) break block73;
                                                                                    if (n5 != 0) break block74;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw lC.a(h);
                                                                                }
                                                                                n5 = this.s;
                                                                                if (bl2) break block73;
                                                                            }
                                                                            catch (H h) {
                                                                                throw lC.a(h);
                                                                            }
                                                                            if (n5 < 1) break block75;
                                                                        }
                                                                        catch (H h) {
                                                                            throw lC.a(h);
                                                                        }
                                                                    }
                                                                    n5 = 1;
                                                                    break block73;
                                                                }
                                                                catch (H h) {
                                                                    throw lC.a(h);
                                                                }
                                                            }
                                                            n5 = 0;
                                                        }
                                                        int n6 = n5;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                n = n6;
                                                                                                if (bl2) break block76;
                                                                                                if (n == 0) break block77;
                                                                                            }
                                                                                            catch (H h) {
                                                                                                throw lC.a(h);
                                                                                            }
                                                                                            n = this.n.a(50L) ? 1 : 0;
                                                                                            if (bl2) break block76;
                                                                                        }
                                                                                        catch (H h) {
                                                                                            throw lC.a(h);
                                                                                        }
                                                                                        if (n == 0) break block77;
                                                                                    }
                                                                                    catch (H h) {
                                                                                        throw lC.a(h);
                                                                                    }
                                                                                    n = this.o ? 1 : 0;
                                                                                    if (bl2) break block76;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw lC.a(h);
                                                                                }
                                                                                if (n != 0) break block77;
                                                                            }
                                                                            catch (H h) {
                                                                                throw lC.a(h);
                                                                            }
                                                                            n = bl ? 1 : 0;
                                                                            if (bl2) break block76;
                                                                        }
                                                                        catch (H h) {
                                                                            throw lC.a(h);
                                                                        }
                                                                        if (n == 0) break block77;
                                                                    }
                                                                    catch (H h) {
                                                                        throw lC.a(h);
                                                                    }
                                                                    mI.R();
                                                                    this.o = true;
                                                                    n = ++this.s;
                                                                    if (bl2) break block76;
                                                                }
                                                                catch (H h) {
                                                                    throw lC.a(h);
                                                                }
                                                                if (n < 2) break block77;
                                                            }
                                                            catch (H h) {
                                                                throw lC.a(h);
                                                            }
                                                            this.c((short)n4, n3, n2);
                                                        }
                                                        catch (H h) {
                                                            throw lC.a(h);
                                                        }
                                                    }
                                                    n = bl ? 1 : 0;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (bl2) break block78;
                                                                if (n == 0) break block79;
                                                            }
                                                            catch (H h) {
                                                                throw lC.a(h);
                                                            }
                                                            lC3 = this;
                                                            if (bl2) break block80;
                                                        }
                                                        catch (H h) {
                                                            throw lC.a(h);
                                                        }
                                                        if (lC3.p) break block81;
                                                    }
                                                    catch (H h) {
                                                        throw lC.a(h);
                                                    }
                                                    this.r = false;
                                                    this.o = false;
                                                    this.n.e();
                                                }
                                                catch (H h) {
                                                    throw lC.a(h);
                                                }
                                            }
                                            lC3 = this;
                                        }
                                        lC3.p = false;
                                    }
                                    n = this.o ? 1 : 0;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (bl2) break block82;
                                                        if (n == 0) break block83;
                                                    }
                                                    catch (H h) {
                                                        throw lC.a(h);
                                                    }
                                                    n = this.s;
                                                    if (bl2) break block82;
                                                }
                                                catch (H h) {
                                                    throw lC.a(h);
                                                }
                                                if (n != 1) break block83;
                                            }
                                            catch (H h) {
                                                throw lC.a(h);
                                            }
                                            n = this.n.a(300L) ? 1 : 0;
                                            if (bl2) break block82;
                                        }
                                        catch (H h) {
                                            throw lC.a(h);
                                        }
                                        if (n == 0) break block83;
                                    }
                                    catch (H h) {
                                        throw lC.a(h);
                                    }
                                    this.c((short)n4, n3, n2);
                                }
                                catch (H h) {
                                    throw lC.a(h);
                                }
                            }
                            n = bl ? 1 : 0;
                        }
                        try {
                            try {
                                try {
                                    if (bl2) break block84;
                                    if (n != 0) break block85;
                                }
                                catch (H h) {
                                    throw lC.a(h);
                                }
                                lC2 = this;
                                if (bl2) break block86;
                            }
                            catch (H h) {
                                throw lC.a(h);
                            }
                            n = lC2.r ? 1 : 0;
                        }
                        catch (H h) {
                            throw lC.a(h);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n != 0) break block85;
                                            lC2 = this;
                                            if (bl2) break block86;
                                        }
                                        catch (H h) {
                                            throw lC.a(h);
                                        }
                                        if (lC2.m) break block85;
                                    }
                                    catch (H h) {
                                        throw lC.a(h);
                                    }
                                    double d2 = Math.abs(mI.ay - -0.23052736) - 0.001;
                                    d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                    if (bl2) break block87;
                                }
                                catch (H h) {
                                    throw lC.a(h);
                                }
                                if (d > 0) break block85;
                            }
                            catch (H h) {
                                throw lC.a(h);
                            }
                            this.r = true;
                            lC2 = this;
                            if (bl2) break block86;
                        }
                        catch (H h) {
                            throw lC.a(h);
                        }
                        d = lC2.s;
                    }
                    catch (H h) {
                        throw lC.a(h);
                    }
                }
                try {
                    if (d == false) {
                        this.s = 1;
                    }
                }
                catch (H h) {
                    throw lC.a(h);
                }
            }
            lC2 = this;
        }
        lC2.m = bl;
    }




    static {
        w = new HashMap(13);
        long l = t ^ 0x3B168E13BD84L;
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
        String string = "\u00a2\u00af\\\u0013bL*\u00cb\u0095\u00c7\u0000l\u0016\u001cz\u009a\u00f1+\u00aa\\\u00d8\u00cb\u00c7fhw\u00ea\u00fb\u00eb\u0098\u0085\u0099@\u00e9\u00cb\u00be\u0013\u00aa\u00f5+\u0006\u00a3\u00c8J\u00ed#\u00ccH\u00a8H;6\u00ded\u00c7\u00fea\u0093$,\u008c\u00fc\u00d3\u00dd/\u0091*\u00e4\u00c5\u00fd\u00e9\"@\u00c8UD\u00e6\nr\u00ff /\u00f0u\u009a\u00bd\u00ee\u00e4\u0096%\u0097\u00cfVlp\u00ed\u00e1";
        int n2 = "\u00a2\u00af\\\u0013bL*\u00cb\u0095\u00c7\u0000l\u0016\u001cz\u009a\u00f1+\u00aa\\\u00d8\u00cb\u00c7fhw\u00ea\u00fb\u00eb\u0098\u0085\u0099@\u00e9\u00cb\u00be\u0013\u00aa\u00f5+\u0006\u00a3\u00c8J\u00ed#\u00ccH\u00a8H;6\u00ded\u00c7\u00fea\u0093$,\u008c\u00fc\u00d3\u00dd/\u0091*\u00e4\u00c5\u00fd\u00e9\"@\u00c8UD\u00e6\nr\u00ff /\u00f0u\u009a\u00bd\u00ee\u00e4\u0096%\u0097\u00cfVlp\u00ed\u00e1".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = lC.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                u = stringArray;
                v = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x314F;
        if (v[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])w.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("lC", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = u[n2].getBytes("ISO-8859-1");
            lC.v[n2] = lC.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lC.a(n, l);
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
            throw new RuntimeException("lC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
