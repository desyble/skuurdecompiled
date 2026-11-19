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

public class mP
extends lh {
    private final kt<Boolean> o;
    private final kt<Number> q;
    private final kt<Boolean> n;
    private int p;
    private final Pd l;
    @A
    public final R8<b5> k;
    @A
    public final R8<c3> m;
    private static final long r;
    private static final String[] s;
    private static final String[] t;
    private static final Map u;

    public mP(char c, EU eU, int n, char c2) {
        long l = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ r;
        super(eU);
        this.o = new kt((String)((Object)mP.a("l", (int)28478, (long)(0x4C2D64AD8AACD9D5L ^ l))), (Object)false, (String)((Object)mP.a("l", (int)19164, (long)(0x7E2221EB18B17C34L ^ l))));
        this.q = new kt((String)((Object)mP.a("l", (int)32055, (long)(0x1CBEFB2C58274BDEL ^ l))), (Object)3, (String)((Object)mP.a("l", (int)5316, (long)(0x4648CA991A07A228L ^ l))), 1.0, 1.0, 9.0);
        this.n = new kt((String)((Object)mP.a("l", (int)6158, (long)(0x6ED3809BEEA1AEE3L ^ l))), (Object)false, (String)((Object)mP.a("l", (int)23646, (long)(0x4C8561617B68EAB4L ^ l))));
        this.p = -1;
        this.l = new Pd();
        this.k = this::lambda$new$0;
        this.m = this::lambda$new$1;
        this.a(new kt[]{this.o, this.q, this.n});
    }

    private void lambda$new$1(c3 c32) {
        block45: {
            mP mP2;
            int n;
            int n2;
            int n3;
            int n4;
            block46: {
                block47: {
                    Object object;
                    block37: {
                        int n5;
                        int n6;
                        String[] stringArray;
                        block44: {
                            block42: {
                                block43: {
                                    xc xc2;
                                    int n7;
                                    long l;
                                    block36: {
                                        boolean bl;
                                        block35: {
                                            Object object2;
                                            block33: {
                                                block34: {
                                                    long l2;
                                                    long l3 = l2 = r ^ 0x4C6B33F9F1E1L;
                                                    long l4 = l3 ^ 0x269B1819B5C2L;
                                                    l = l4 >>> 16;
                                                    n7 = (int)(l4 << 48 >>> 48);
                                                    long l5 = l3 ^ 0x173F8873CC59L;
                                                    n4 = (int)(l5 >>> 32);
                                                    n3 = (int)(l5 << 32 >>> 48);
                                                    n2 = (int)(l5 << 48 >>> 48);
                                                    xc2 = c32.c();
                                                    stringArray = m6.a();
                                                    try {
                                                        object2 = xc2;
                                                        if (stringArray != null) break block33;
                                                        if (object2 != null) break block34;
                                                    }
                                                    catch (H h) {
                                                        throw mP.a(h);
                                                    }
                                                    return;
                                                }
                                                object2 = this.n.i();
                                            }
                                            try {
                                                try {
                                                    bl = (Boolean)object2;
                                                    if (stringArray != null) break block35;
                                                    if (!bl) break block36;
                                                }
                                                catch (H h) {
                                                    throw mP.a(h);
                                                }
                                                bl = Hk.j().aD();
                                            }
                                            catch (H h) {
                                                throw mP.a(h);
                                            }
                                        }
                                        if (!bl) {
                                            return;
                                        }
                                    }
                                    A6 a6 = Hk.a().b(xc2, l, (short)n7).a();
                                    float f = 1.0f;
                                    n = -1;
                                    int n8 = 0;
                                    while (n8 < 36) {
                                        block41: {
                                            block40: {
                                                qP qP2;
                                                block38: {
                                                    qP qP3 = Hk.j().bU.a[n8];
                                                    try {
                                                        block39: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        object = qP3;
                                                                        if (stringArray != null) break block37;
                                                                        if (stringArray != null) break block38;
                                                                    }
                                                                    catch (H h) {
                                                                        throw mP.a(h);
                                                                    }
                                                                    if (object != null) break block39;
                                                                }
                                                                catch (H h) {
                                                                    throw mP.a(h);
                                                                }
                                                                if (stringArray == null) break block40;
                                                            }
                                                            catch (H h) {
                                                                throw mP.a(h);
                                                            }
                                                        }
                                                        qP2 = qP3;
                                                    }
                                                    catch (H h) {
                                                        throw mP.a(h);
                                                    }
                                                }
                                                float f2 = qP2.c(a6);
                                                try {
                                                    if (stringArray != null) break block41;
                                                    if (!(f2 > f)) break block40;
                                                }
                                                catch (H h) {
                                                    throw mP.a(h);
                                                }
                                                f = f2;
                                                n = n8;
                                            }
                                            ++n8;
                                        }
                                        if (stringArray == null) continue;
                                    }
                                    try {
                                        n6 = n;
                                        n5 = 8;
                                        if (stringArray != null) break block42;
                                        if (n6 <= n5) break block43;
                                    }
                                    catch (H h) {
                                        throw mP.a(h);
                                    }
                                    n8 = this.q.m() - 1;
                                    cf.a((int)n, (int)n8);
                                    return;
                                }
                                n6 = n;
                                n5 = -1;
                            }
                            try {
                                try {
                                    try {
                                        if (stringArray != null) break block44;
                                        if (n6 == n5) break block45;
                                    }
                                    catch (H h) {
                                        throw mP.a(h);
                                    }
                                    mP2 = this;
                                    if (stringArray != null) break block46;
                                }
                                catch (H h) {
                                    throw mP.a(h);
                                }
                                n6 = mP2.p;
                                n5 = -1;
                            }
                            catch (H h) {
                                throw mP.a(h);
                            }
                        }
                        try {
                            try {
                                if (n6 != n5) break block47;
                                mP2 = this;
                                if (stringArray != null) break block46;
                            }
                            catch (H h) {
                                throw mP.a(h);
                            }
                            object = mP2.o.i();
                        }
                        catch (H h) {
                            throw mP.a(h);
                        }
                    }
                    try {
                        if (((Boolean)object).booleanValue()) {
                            this.p = Hk.j().bU.g;
                        }
                    }
                    catch (H h) {
                        throw mP.a(h);
                    }
                }
                mP2 = this;
            }
            mP2.l.e();
            Hk.j().bU.g = n;
            Hk.b().R.i(n4, (char)n3, (char)n2);
        }
    }

    private void lambda$new$0(b5 b52) {
        block60: {
            block61: {
                mP mP2;
                block62: {
                    uC uC2;
                    String[] stringArray;
                    int n;
                    int n2;
                    int n3;
                    block56: {
                        block57: {
                            block58: {
                                mP mP3;
                                block59: {
                                    int n4;
                                    block54: {
                                        block50: {
                                            block51: {
                                                block52: {
                                                    mP mP4;
                                                    block53: {
                                                        block48: {
                                                            block49: {
                                                                block46: {
                                                                    block47: {
                                                                        long l = r ^ 0x1FC358B3D537L;
                                                                        long l2 = l ^ 0x4497E339E88FL;
                                                                        n3 = (int)(l2 >>> 32);
                                                                        n2 = (int)(l2 << 32 >>> 48);
                                                                        n = (int)(l2 << 48 >>> 48);
                                                                        stringArray = m6.a();
                                                                        try {
                                                                            n4 = b52.j();
                                                                            if (stringArray != null) break block46;
                                                                            if (n4 != 0) break block47;
                                                                        }
                                                                        catch (H h) {
                                                                            throw mP.a(h);
                                                                        }
                                                                        return;
                                                                    }
                                                                    n4 = this.l.a(50L);
                                                                }
                                                                try {
                                                                    if (stringArray != null) break block48;
                                                                    if (n4 != 0) break block49;
                                                                }
                                                                catch (H h) {
                                                                    throw mP.a(h);
                                                                }
                                                                return;
                                                            }
                                                            n4 = ((Boolean)this.n.i()).booleanValue();
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (stringArray != null) break block50;
                                                                                        if (n4 == 0) break block51;
                                                                                    }
                                                                                    catch (H h) {
                                                                                        throw mP.a(h);
                                                                                    }
                                                                                    n4 = Hk.j().aD();
                                                                                    if (stringArray != null) break block50;
                                                                                }
                                                                                catch (H h) {
                                                                                    throw mP.a(h);
                                                                                }
                                                                                if (n4 != 0) break block51;
                                                                            }
                                                                            catch (H h) {
                                                                                throw mP.a(h);
                                                                            }
                                                                            mP4 = this;
                                                                            if (stringArray != null) break block52;
                                                                        }
                                                                        catch (H h) {
                                                                            throw mP.a(h);
                                                                        }
                                                                        if (mP4.p == -1) break block53;
                                                                    }
                                                                    catch (H h) {
                                                                        throw mP.a(h);
                                                                    }
                                                                    mP4 = this;
                                                                    if (stringArray != null) break block52;
                                                                }
                                                                catch (H h) {
                                                                    throw mP.a(h);
                                                                }
                                                                if (!((Boolean)mP4.o.i()).booleanValue()) break block53;
                                                            }
                                                            catch (H h) {
                                                                throw mP.a(h);
                                                            }
                                                            Hk.j().bU.g = this.p;
                                                            Hk.b().R.i(n3, (char)n2, (char)n);
                                                        }
                                                        catch (H h) {
                                                            throw mP.a(h);
                                                        }
                                                    }
                                                    mP4 = this;
                                                }
                                                mP4.p = -1;
                                                return;
                                            }
                                            n4 = Hk.i().aF.i();
                                        }
                                        try {
                                            try {
                                                block55: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (stringArray != null) break block54;
                                                                if (n4 == 0) break block55;
                                                            }
                                                            catch (H h) {
                                                                throw mP.a(h);
                                                            }
                                                            uC2 = Hk.b().U;
                                                            if (stringArray != null) break block56;
                                                        }
                                                        catch (H h) {
                                                            throw mP.a(h);
                                                        }
                                                        if (uC2 != null) break block57;
                                                    }
                                                    catch (H h) {
                                                        throw mP.a(h);
                                                    }
                                                }
                                                mP3 = this;
                                                if (stringArray != null) break block58;
                                            }
                                            catch (H h) {
                                                throw mP.a(h);
                                            }
                                            n4 = mP3.p;
                                        }
                                        catch (H h) {
                                            throw mP.a(h);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (n4 == -1) break block59;
                                                mP3 = this;
                                                if (stringArray != null) break block58;
                                            }
                                            catch (H h) {
                                                throw mP.a(h);
                                            }
                                            if (!((Boolean)mP3.o.i()).booleanValue()) break block59;
                                        }
                                        catch (H h) {
                                            throw mP.a(h);
                                        }
                                        Hk.j().bU.g = this.p;
                                        Hk.b().R.i(n3, (char)n2, (char)n);
                                    }
                                    catch (H h) {
                                        throw mP.a(h);
                                    }
                                }
                                mP3 = this;
                            }
                            mP3.p = -1;
                            return;
                        }
                        uC2 = Hk.b().U;
                    }
                    xc xc2 = uC2.a();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (xc2 != null) break block60;
                                        mP2 = this;
                                        if (stringArray != null) break block61;
                                    }
                                    catch (H h) {
                                        throw mP.a(h);
                                    }
                                    if (mP2.p == -1) break block62;
                                }
                                catch (H h) {
                                    throw mP.a(h);
                                }
                                mP2 = this;
                                if (stringArray != null) break block61;
                            }
                            catch (H h) {
                                throw mP.a(h);
                            }
                            if (!((Boolean)mP2.o.i()).booleanValue()) break block62;
                        }
                        catch (H h) {
                            throw mP.a(h);
                        }
                        Hk.j().bU.g = this.p;
                        Hk.b().R.i(n3, (char)n2, (char)n);
                    }
                    catch (H h) {
                        throw mP.a(h);
                    }
                }
                mP2 = this;
            }
            mP2.p = -1;
        }
    }




    static {
        block11: {
            block10: {
                mP.r = _c.a((long)8152866157187410450L, (long)4222911122178784925L, MethodHandles.lookup().lookupClass()).a(21707524163026L);
                mP.u = new HashMap<K, V>(13);
                var0 = mP.r ^ 59773802358411L;
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
                var6_5 = "i\u001e\u00cd\u0004\u00a7\u007f\u00c3\u00dctx\u00a0\u00f6\u00bdT\u00f6Y\u00b6\u00ff\u00fd\u00c8\u0092\u00a1\u00ba\u0004\u00f8u\u0002\u0007\u0098u\u001d\u00e4\u00fd\u0088>\u0082\u00a4+\u008f\u00e8\u00fe\u0014r2r\u001c\u00ceC'ew\u009a\u001a\u00d3\u00eb\u00d7/\u00a2\u0012M\u00f4\u009fD,\u0010\u00e0\u009d\u0090C\u00d8\u00ddmQ\u0089\u0005\u00bc\u0083\u00b4\u008a|\u00818\u00f4.\u00b5\u0095\u00b4h\u00b5 @]\u00f7B\u00ea\u00a8tQ;s\u0012\u001a\b\u0087x\u00c7\u00fa\u009f\u00ebH\u00fe\u00fa@\u009e\u00b2M\u009c!o/e\u008a\u0004\u0095\u0091A$k\u00a2&\u0092Y\u0091\u0007\u000b\u00aff\u00b6 FY\u0094\u0011\u00cd\u008a\u00e2\u00ba\u00c7\u0095\u00d6\u0004M5m\u00f7\u0001\u00bb\u00e3I\n,\u009f\u00cf=\u00b4A\u00baI\u0018J1";
                var8_6 = "i\u001e\u00cd\u0004\u00a7\u007f\u00c3\u00dctx\u00a0\u00f6\u00bdT\u00f6Y\u00b6\u00ff\u00fd\u00c8\u0092\u00a1\u00ba\u0004\u00f8u\u0002\u0007\u0098u\u001d\u00e4\u00fd\u0088>\u0082\u00a4+\u008f\u00e8\u00fe\u0014r2r\u001c\u00ceC'ew\u009a\u001a\u00d3\u00eb\u00d7/\u00a2\u0012M\u00f4\u009fD,\u0010\u00e0\u009d\u0090C\u00d8\u00ddmQ\u0089\u0005\u00bc\u0083\u00b4\u008a|\u00818\u00f4.\u00b5\u0095\u00b4h\u00b5 @]\u00f7B\u00ea\u00a8tQ;s\u0012\u001a\b\u0087x\u00c7\u00fa\u009f\u00ebH\u00fe\u00fa@\u009e\u00b2M\u009c!o/e\u008a\u0004\u0095\u0091A$k\u00a2&\u0092Y\u0091\u0007\u000b\u00aff\u00b6 FY\u0094\u0011\u00cd\u008a\u00e2\u00ba\u00c7\u0095\u00d6\u0004M5m\u00f7\u0001\u00bb\u00e3I\n,\u009f\u00cf=\u00b4A\u00baI\u0018J1".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = mP.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ca\u0083\u00e1R\u008d\u00c10\u00d2\u00ae8\u00cah${\u00c8r\u00cd\u009cb\u009dT\u00d2\u00ef\u00e1\u00cb\u009c!\u00b9W\u00bd\u00b3a\u00f5\u00d6\u007f\u00d3\u00c5\u0097-\u0000?\u00e4\u008e`\u00c5\u00a4\u00ce\u00b4\u0098\u00e0^^1\u0094L\u0094\u0018T\u001b\u00fd\u0090K\u0012\u001f\u00bb\u0017U\u00d2\u0019\u001cW7=\u0010\u00f1\u0005@\u00c9\u009a\u0094\u007f";
                    var8_6 = "\u00ca\u0083\u00e1R\u008d\u00c10\u00d2\u00ae8\u00cah${\u00c8r\u00cd\u009cb\u009dT\u00d2\u00ef\u00e1\u00cb\u009c!\u00b9W\u00bd\u00b3a\u00f5\u00d6\u007f\u00d3\u00c5\u0097-\u0000?\u00e4\u008e`\u00c5\u00a4\u00ce\u00b4\u0098\u00e0^^1\u0094L\u0094\u0018T\u001b\u00fd\u0090K\u0012\u001f\u00bb\u0017U\u00d2\u0019\u001cW7=\u0010\u00f1\u0005@\u00c9\u009a\u0094\u007f".length();
                    var5_7 = 56;
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
                    var9_3[var7_4++] = mP.a(var10_9).intern();
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
        mP.s = var9_3;
        mP.t = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3735;
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
                throw new RuntimeException("mP", exception);
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
            mP.t[n2] = mP.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return t[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mP.a(n, l);
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
            throw new RuntimeException("mP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
