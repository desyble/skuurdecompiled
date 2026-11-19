import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class mk
extends lh {
    private final Pd k;
    private final Pd l;
    public static boolean s;
    private final kt<Boolean> t;
    private final kt<Boolean> u;
    private final kt<Boolean> o;
    private final kt<Number> m;
    private int p;
    private int r;
    private final hW[] q;
    @A
    public final R8<b5> n;
    private static final long v;
    private static final String[] w;
    private static final String[] x;
    private static final Map y;

    public mk(int n, EU eU, int n2) {
        long l = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ v;
        super(eU);
        this.k = new Pd();
        this.l = new Pd();
        this.t = new kt((String)((Object)mk.a("d", (int)2024, (long)(0x63C78B8C4871A850L ^ l))), (Object)true, (String)((Object)mk.a("d", (int)26048, (long)(0x47E5F6AFF3ECA7EL ^ l))));
        this.u = new kt((String)((Object)mk.a("d", (int)6231, (long)(0x780D023E70DB7EEL ^ l))), (Object)true, (String)((Object)mk.a("d", (int)20379, (long)(0x24B057ED2E4E6026L ^ l))));
        this.o = new kt((String)((Object)mk.a("d", (int)6096, (long)(0x22C9482CB7C4B86BL ^ l))), (Object)true, (String)((Object)mk.a("d", (int)31671, (long)(0x12A5E8297BDC540DL ^ l))));
        this.m = new kt((String)((Object)mk.a("d", (int)22744, (long)(0x2CE1045078ECF767L ^ l))), (Object)10, (String)((Object)mk.a("d", (int)21788, (long)(0x25C6B2E328ED7AA0L ^ l))), 1.0, 1.0, 20.0);
        this.p = 0;
        this.r = 2;
        this.q = new hW[3];
        this.n = this::lambda$new$0;
        this.a(new kt[]{this.m, this.u, this.t, this.o});
    }

    public void a(char c, long l) {
        s = false;
    }

    private boolean a() {
        int n;
        List<Integer> list;
        List<Integer> list2;
        block37: {
            List<Integer> list3;
            block38: {
                int n2;
                block35: {
                    String[] stringArray;
                    block33: {
                        block34: {
                            boolean bl;
                            block31: {
                                block32: {
                                    block29: {
                                        boolean bl2;
                                        block30: {
                                            boolean bl3 = false;
                                            stringArray = m6.a();
                                            for (int i = 9; i < 45; ++i) {
                                                try {
                                                    if (stringArray != null) break block29;
                                                    if (Hk.j().b8.c(i).d() != null) continue;
                                                }
                                                catch (H h) {
                                                    throw mk.a(h);
                                                }
                                                bl3 = true;
                                                try {
                                                    if (stringArray == null) break;
                                                    if (stringArray == null) continue;
                                                    break;
                                                }
                                                catch (H h) {
                                                    throw mk.a(h);
                                                }
                                            }
                                            try {
                                                bl2 = bl3;
                                                if (stringArray != null) break block30;
                                                if (bl2) break block29;
                                            }
                                            catch (H h) {
                                                throw mk.a(h);
                                            }
                                            bl2 = false;
                                        }
                                        return bl2;
                                    }
                                    list3 = this.a(aQ.b((A6)PE.bc));
                                    list2 = this.a(aQ.b((A6)PE.ao));
                                    list = this.a(eF.cf);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        bl = list3.isEmpty();
                                                        if (stringArray != null) break block31;
                                                        if (bl) break block32;
                                                    }
                                                    catch (H h) {
                                                        throw mk.a(h);
                                                    }
                                                    bl = list2.isEmpty();
                                                    if (stringArray != null) break block31;
                                                }
                                                catch (H h) {
                                                    throw mk.a(h);
                                                }
                                                if (bl) break block32;
                                            }
                                            catch (H h) {
                                                throw mk.a(h);
                                            }
                                            n2 = list.isEmpty();
                                            if (stringArray != null) break block33;
                                        }
                                        catch (H h) {
                                            throw mk.a(h);
                                        }
                                        if (n2 == 0) break block34;
                                    }
                                    catch (H h) {
                                        throw mk.a(h);
                                    }
                                }
                                bl = false;
                            }
                            return bl;
                        }
                        n2 = this.b(list3);
                    }
                    try {
                        block36: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (stringArray != null) break block35;
                                                if (n2 < 2) break block36;
                                            }
                                            catch (H h) {
                                                throw mk.a(h);
                                            }
                                            n2 = this.b(list2);
                                            if (stringArray != null) break block35;
                                        }
                                        catch (H h) {
                                            throw mk.a(h);
                                        }
                                        if (n2 < 2) break block36;
                                    }
                                    catch (H h) {
                                        throw mk.a(h);
                                    }
                                    n = this.b(list);
                                    if (stringArray != null) break block37;
                                }
                                catch (H h) {
                                    throw mk.a(h);
                                }
                                if (n >= 2) break block38;
                            }
                            catch (H h) {
                                throw mk.a(h);
                            }
                        }
                        n2 = 0;
                    }
                    catch (H h) {
                        throw mk.a(h);
                    }
                }
                return n2 != 0;
            }
            n = this.a(list3);
        }
        int n3 = n;
        int n4 = this.a(list2);
        int n5 = this.a(list);
        qP qP2 = Hk.j().bU.c(n3);
        qP qP3 = Hk.j().bU.c(n4);
        qP qP4 = Hk.j().bU.c(n5);
        this.q[0] = new hW(this.a(n3), qP2.f);
        this.q[1] = new hW(this.a(n4), qP3.f);
        this.q[2] = new hW(this.a(n5), qP4.f);
        return true;
    }

    private List<Integer> a(aQ aQ2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = 0;
        String[] stringArray = m6.a();
        while (n < Hk.j().bU.a.length) {
            block7: {
                block8: {
                    qP qP2 = Hk.j().bU.a[n];
                    try {
                        try {
                            try {
                                if (stringArray != null) break block7;
                                if (qP2 == null) break block8;
                            }
                            catch (H h) {
                                throw mk.a(h);
                            }
                            if (qP2.v() != aQ2) break block8;
                        }
                        catch (H h) {
                            throw mk.a(h);
                        }
                        arrayList.add(n);
                    }
                    catch (H h) {
                        throw mk.a(h);
                    }
                }
                ++n;
            }
            if (stringArray == null) continue;
        }
        return arrayList;
    }

    private int b(List<Integer> list) {
        int n3;
        block3: {
            int n2 = 0;
            String[] stringArray = m6.a();
            for (int n3 : list) {
                if (stringArray == null) {
                    int n4 = n3;
                    qP qP2 = Hk.j().bU.a[n4];
                    if (qP2 != null) {
                        n2 += qP2.f;
                    }
                    if (stringArray == null) continue;
                }
                break block3;
            }
            n3 = n2;
        }
        return n3;
    }

    private int a(List<Integer> list) {
        int n;
        block5: {
            int n2 = list.get(0);
            String[] stringArray = m6.a();
            int n3 = Hk.j().bU.a[n2].f;
            for (int n4 : list) {
                block6: {
                    int n5 = Hk.j().bU.a[n4].f;
                    try {
                        try {
                            n = n5;
                            if (stringArray != null) break block5;
                            if (stringArray != null) break block6;
                        }
                        catch (H h) {
                            throw mk.a(h);
                        }
                        if (n <= n3) break block6;
                    }
                    catch (H h) {
                        throw mk.a(h);
                    }
                    n2 = n4;
                    int n6 = n3 = n5;
                }
                if (stringArray == null) continue;
            }
            n = n2;
        }
        return n;
    }




    private void b() {























        throw new IllegalStateException("Decompilation failed");
    }

    private void a(int n, int n2, int n3, int n4) {
        short s = Hk.j().bS.a(Hk.j().bU);
        qP qP2 = Hk.j().bS.c(n2).d();
        GY gY = new GY(n, n2, n3, n4, qP2, s);
        Hk.j().cs.a((I2)gY);
    }

    private int d() {
        int n = 0;
        String[] stringArray = m6.a();
        int n2 = 9;
        while (n2 < 45) {
            block9: {
                block10: {
                    int n3;
                    block11: {
                        qP qP2 = Hk.j().b8.c(n2).d();
                        try {
                            try {
                                try {
                                    try {
                                        if (stringArray != null) break block9;
                                        if (qP2 == null) break block10;
                                    }
                                    catch (H h) {
                                        throw mk.a(h);
                                    }
                                    n3 = qP2.v() instanceof ac;
                                    if (stringArray != null) break block11;
                                }
                                catch (H h) {
                                    throw mk.a(h);
                                }
                                if (n3 == 0) break block10;
                            }
                            catch (H h) {
                                throw mk.a(h);
                            }
                            n3 = n + qP2.f;
                        }
                        catch (H h) {
                            throw mk.a(h);
                        }
                    }
                    n = n3;
                }
                ++n2;
            }
            if (stringArray == null) continue;
        }
        return n;
    }

    private int a(int n) {
        int n2;
        block6: {
            block5: {
                int n3;
                int n4;
                block4: {
                    String[] stringArray = m6.a();
                    try {
                        try {
                            n4 = n;
                            n3 = 9;
                            if (stringArray != null) break block4;
                            if (n4 >= n3) break block5;
                        }
                        catch (H h) {
                            throw mk.a(h);
                        }
                        n4 = n;
                        n3 = 36;
                    }
                    catch (H h) {
                        throw mk.a(h);
                    }
                }
                n2 = n4 + n3;
                break block6;
            }
            n2 = n;
        }
        return n2;
    }




    private void lambda$new$0(b5 var1_1) {























        throw new IllegalStateException("Decompilation failed");
    }




    static {
        block11: {
            block10: {
                mk.v = _c.a((long)242259154534344839L, (long)1718829366426409437L, MethodHandles.lookup().lookupClass()).a(142920095591852L);
                mk.y = new HashMap<K, V>(13);
                var0 = mk.v ^ 87739322687666L;
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
                var6_5 = "Yo\u001c\u00dd\u00f0\u00b7\t\u0002\u00f4r\u0007\u0088F\u00d1\u0093\u00d2`\u00b3\b\u00aa\u0018')bO]p9\u00d7\u00e7\u00d4\u00bb\u00ed\u00ca\u00fag\u008a0\u008c\u00879\u00c64\u00bc\u00c9\u00fa\u001dWl\u00c6\u00c2\u00dd\u00f0\u0086\u0095\u0086\u0092\u00d7Z#\u009e\u00d9z\u00bcn\u0094B\u0084]f\u00ca\u00b53\u00b0\u00ba'y\u009e\u00cep$\u00ae\f\u00a2c\u00c4\u00c30p\u00b0\u00a4z\u00c2x\u00ab\u00f2\f\u00fd5(\u00ac@a\u00fa\u00f6\u0085\u001a\u00d8_d\u0097\u00ecd\u0010\u0012+\u0086Q\u008d&\u00d2\u00cd\u00a8a~7\\\u0082L\u0081\u0018c\u00df\u00af\u0012O\u00db\u0015\u001e\u0014\"B\u0012\u00d9\u0084\u0081}3\u0000\u0091JX\u0090E\u00e6\u0010\u001b\u00c5\u001e\u00a7u\u008fs\u0091\u00b2\u0019\u008f\u00b6h \u008f\u00a98\u00fd\u00d8\u00db\u001d\u00bay\u00d1)\u0096\u00f2\u00ff\u0010dX\u00d6\u00c7\u008a\u000bJ\u00d7\u00df\u00b9\u001e\u0086K[\u00f7\u00e6\u001b\u00a1x\u00c2\u001cn\\\u0087\u00f6iI\u00aa\u00b7\u00a2\u0004\u00f9\u009a0Gs\u0006\u0087b\u0084\u008d*\u0083i";
                var8_6 = "Yo\u001c\u00dd\u00f0\u00b7\t\u0002\u00f4r\u0007\u0088F\u00d1\u0093\u00d2`\u00b3\b\u00aa\u0018')bO]p9\u00d7\u00e7\u00d4\u00bb\u00ed\u00ca\u00fag\u008a0\u008c\u00879\u00c64\u00bc\u00c9\u00fa\u001dWl\u00c6\u00c2\u00dd\u00f0\u0086\u0095\u0086\u0092\u00d7Z#\u009e\u00d9z\u00bcn\u0094B\u0084]f\u00ca\u00b53\u00b0\u00ba'y\u009e\u00cep$\u00ae\f\u00a2c\u00c4\u00c30p\u00b0\u00a4z\u00c2x\u00ab\u00f2\f\u00fd5(\u00ac@a\u00fa\u00f6\u0085\u001a\u00d8_d\u0097\u00ecd\u0010\u0012+\u0086Q\u008d&\u00d2\u00cd\u00a8a~7\\\u0082L\u0081\u0018c\u00df\u00af\u0012O\u00db\u0015\u001e\u0014\"B\u0012\u00d9\u0084\u0081}3\u0000\u0091JX\u0090E\u00e6\u0010\u001b\u00c5\u001e\u00a7u\u008fs\u0091\u00b2\u0019\u008f\u00b6h \u008f\u00a98\u00fd\u00d8\u00db\u001d\u00bay\u00d1)\u0096\u00f2\u00ff\u0010dX\u00d6\u00c7\u008a\u000bJ\u00d7\u00df\u00b9\u001e\u0086K[\u00f7\u00e6\u001b\u00a1x\u00c2\u001cn\\\u0087\u00f6iI\u00aa\u00b7\u00a2\u0004\u00f9\u009a0Gs\u0006\u0087b\u0084\u008d*\u0083i".length();
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
                    var9_3[var7_4++] = mk.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "L\u001e\u001a\u001d_\u00e6\u0085\u00b12H\u0081^d\u00a7\u00b0W5\u00bbQ\u008d\u0016\u00aa\u00d0[\u009b\u00c1\u00f2\u00ef\u000f\u00cc\u00ca\u00ae\u00fa\u0014\u00f1(\u0000\u0011\u00c1:\u0017\u0019$\u00c5\u00f3A\u00e8\u00e3\u00cc\u00af\u0013nE\u0019O\u0088\u0004V\u00bf\u00fd\u00fb\\\u00bf\u009di\u00ff\u0013\u009dG|EY0\u00ec\u00fc\u0010\u009b\u001d:Q\u00ce\u00ae\u00a1\u0016\u00dc\u000e\u00d0\u000e\u00fd\u00fb}\u0083\u001f8\u00e6\u0084U\u00aa\r\u00bf\u009f\u0017\u00ec\u0093\u00c0(^\u00b5=y\u008a\u00a5\u0002\u00d1\u00a3\u0081.\u0088\u0016\f8";
                    var8_6 = "L\u001e\u001a\u001d_\u00e6\u0085\u00b12H\u0081^d\u00a7\u00b0W5\u00bbQ\u008d\u0016\u00aa\u00d0[\u009b\u00c1\u00f2\u00ef\u000f\u00cc\u00ca\u00ae\u00fa\u0014\u00f1(\u0000\u0011\u00c1:\u0017\u0019$\u00c5\u00f3A\u00e8\u00e3\u00cc\u00af\u0013nE\u0019O\u0088\u0004V\u00bf\u00fd\u00fb\\\u00bf\u009di\u00ff\u0013\u009dG|EY0\u00ec\u00fc\u0010\u009b\u001d:Q\u00ce\u00ae\u00a1\u0016\u00dc\u000e\u00d0\u000e\u00fd\u00fb}\u0083\u001f8\u00e6\u0084U\u00aa\r\u00bf\u009f\u0017\u00ec\u0093\u00c0(^\u00b5=y\u008a\u00a5\u0002\u00d1\u00a3\u0081.\u0088\u0016\f8".length();
                    var5_7 = 72;
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
                    var9_3[var7_4++] = mk.a(var10_9).intern();
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
        mk.w = var9_3;
        mk.x = new String[8];
        mk.s = false;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3324;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mk", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            mk.x[n2] = mk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mk.a(n, l);
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
            throw new RuntimeException("mk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
