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

public class ly
extends lh {
    private final kt<Boolean> k;
    private final kt<Boolean> n;
    private final kt<Boolean> m;
    private final bU[] o;
    @A
    public final R8<ck> p;
    @A
    public final R8<bR> l;
    private static final long q;
    private static final String[] r;
    private static final String[] s;
    private static final Map t;

    public ly(int n, char c, int n2, EU eU) {
        long l = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ q;
        super(eU);
        this.k = new kt((String)((Object)ly.a("t", (int)1712, (long)(0x29238467BA337C0AL ^ l))), (Object)false, (String)((Object)ly.a("t", (int)16004, (long)(0x56B56D4D17164438L ^ l))));
        this.n = new kt((String)((Object)ly.a("t", (int)8262, (long)(0x1D7F82D4D19D5AFBL ^ l))), (Object)false, (String)((Object)ly.a("t", (int)18515, (long)(0x46A76863089032EDL ^ l))));
        this.m = new kt((String)((Object)ly.a("t", (int)398, (long)(0x5044E476A27B7B31L ^ l))), (Object)false, (String)((Object)ly.a("t", (int)5518, (long)(0x2C49819DB3C26F35L ^ l))));
        this.o = new bU[]{Hk.i().b4, Hk.i().bO, Hk.i().q, Hk.i().br, Hk.i().Y};
        this.p = this::lambda$new$0;
        this.l = this::lambda$new$1;
        this.a(new kt[]{this.k, this.n, this.m});
    }

    public void a(char c, long l) {
        bU[] bUArray = this.o;
        int n = bUArray.length;
        boolean bl = lj.k();
        for (int i = 0; i < n; ++i) {
            boolean bl2;
            int n2;
            block6: {
                block5: {
                    bU bU2 = bUArray[i];
                    try {
                        try {
                            n2 = bU2.d();
                            if (Hk.e() != null) break block5;
                            bl2 = bU2.i();
                            if (bl) break block6;
                        }
                        catch (H h) {
                            throw ly.a(h);
                        }
                        if (!bl2) break block5;
                    }
                    catch (H h) {
                        throw ly.a(h);
                    }
                    bl2 = true;
                    break block6;
                }
                bl2 = false;
            }
            bU.a((int)n2, (boolean)bl2);
            if (!bl) continue;
        }
    }

    private void lambda$new$1(bR bR2) {
        block19: {
            boolean bl;
            block18: {
                boolean bl2;
                block16: {
                    block17: {
                        bl2 = lj.k();
                        try {
                            try {
                                try {
                                    try {
                                        bl = bR2.a() instanceof KI;
                                        if (bl2) break block16;
                                        if (!bl) break block17;
                                    }
                                    catch (H h) {
                                        throw ly.a(h);
                                    }
                                    bl = (Boolean)this.k.i();
                                    if (bl2) break block16;
                                }
                                catch (H h) {
                                    throw ly.a(h);
                                }
                                if (!bl) break block17;
                            }
                            catch (H h) {
                                throw ly.a(h);
                            }
                            bR2.a();
                        }
                        catch (H h) {
                            throw ly.a(h);
                        }
                    }
                    bl = bR2.a() instanceof K;
                }
                try {
                    try {
                        if (bl2) break block18;
                        if (!bl) break block19;
                    }
                    catch (H h) {
                        throw ly.a(h);
                    }
                    bl = (Boolean)this.n.i();
                }
                catch (H h) {
                    throw ly.a(h);
                }
            }
            if (bl) {
                K k = (K)bR2.a();
                try {
                    if (k.a() == gF.OPEN_INVENTORY_ACHIEVEMENT) {
                        bR2.a();
                    }
                }
                catch (H h) {
                    throw ly.a(h);
                }
            }
        }
    }

    private void lambda$new$0(ck ck2) {
        block28: {
            boolean bl;
            block27: {
                int n;
                block26: {
                    block24: {
                        op op2;
                        block25: {
                            long l;
                            int n2;
                            block22: {
                                block23: {
                                    long l2 = q ^ 0x6360D1FA7BAL;
                                    long l3 = l2 ^ 0x135D9DDE9E06L;
                                    n2 = (int)(l3 >>> 56);
                                    l = l3 << 8 >>> 8;
                                    op2 = Hk.e();
                                    bl = lj.k();
                                    try {
                                        if (op2 == null) {
                                            return;
                                        }
                                    }
                                    catch (H h) {
                                        throw ly.a(h);
                                    }
                                    try {
                                        n = mG.n;
                                        if (bl) break block22;
                                        if (n <= 0) break block23;
                                    }
                                    catch (H h) {
                                        throw ly.a(h);
                                    }
                                    return;
                                }
                                n = this.m.g() ? 1 : 0;
                            }
                            try {
                                try {
                                    if (bl) break block24;
                                    if (n == 0) break block25;
                                }
                                catch (H h) {
                                    throw ly.a(h);
                                }
                                bU.a((int)Hk.i().R.d(), (boolean)false);
                                Hk.j().g(false, (byte)n2, l);
                            }
                            catch (H h) {
                                throw ly.a(h);
                            }
                        }
                        n = op2 instanceof oa;
                    }
                    try {
                        try {
                            if (bl) break block26;
                            if (n != 0) break block27;
                        }
                        catch (H h) {
                            throw ly.a(h);
                        }
                        long l = System.currentTimeMillis() - hV.d().a() - 50L;
                        n = l == 0L ? 0 : (l < 0L ? -1 : 1);
                    }
                    catch (H h) {
                        throw ly.a(h);
                    }
                }
                if (n <= 0) break block27;
                for (bU bU2 : this.o) {
                    try {
                        bU.a((int)bU2.d(), (boolean)uA.a((bU)bU2));
                        if (!bl) {
                            if (!bl) continue;
                            break;
                        }
                        break block28;
                    }
                    catch (H h) {
                        throw ly.a(h);
                    }
                }
                if (!bl) break block28;
            }
            for (bU bU2 : this.o) {
                bU.a((int)bU2.d(), (boolean)false);
                if (!bl) continue;
            }
        }
    }




    static {
        block11: {
            block10: {
                ly.q = _c.a((long)-365452488196309255L, (long)-9159127880750756884L, MethodHandles.lookup().lookupClass()).a(99593803929630L);
                ly.t = new HashMap<K, V>(13);
                var0 = ly.q ^ 24271520910896L;
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
                var6_5 = "\u0098\u00a3\u0086\u0080p\u00a4l\u00d0\u00b1\u00119\u001e*\u0093\u0099<\u00a98%\u0014Z\u0088X:\u00b0?'_G\u00cah\u0088\u00d7m\u00c3R.\u00a0\u0099w\u0092\u00cc\u0080\u00b5\u00c3e\u00ea\u00d3'\u00f5\u00d4\u00cb\u00a0\u009b\u00d0\u00f1v\u0080Wr\u00eb\u00e20\u00ecZ7\u00d9\u00feK\"\u00d2\u0098\u0018G\u00db\u0094\u000b\u00daE/\u000eA\u00c0+\u0095\u009e'\u00d1\u00b4\u00ce\u0012\u00d3\u00fa\u00e3\u0094\u00a4\u00b58\u0086\u00e9!:\u0089_\u00e1t\u0088\u00ff\u00f3|\u00cc\u000b*|R\u001a\u0088P\u00a0\u00b8\u0002\u00c9\u0084\u0003C\u001568\u00ce|!\u0011\u00afo+\u00a8l\u00b4\u0003\u0088\u00c5E_\u0095\u001e\u00b8\u00bfe?@}\u000e\u00b2\u00d6\u0010(1\u009d\t\u00bd\u00e4~\u00bd\u0098\u00c3\n~\u001b>z\u0092";
                var8_6 = "\u0098\u00a3\u0086\u0080p\u00a4l\u00d0\u00b1\u00119\u001e*\u0093\u0099<\u00a98%\u0014Z\u0088X:\u00b0?'_G\u00cah\u0088\u00d7m\u00c3R.\u00a0\u0099w\u0092\u00cc\u0080\u00b5\u00c3e\u00ea\u00d3'\u00f5\u00d4\u00cb\u00a0\u009b\u00d0\u00f1v\u0080Wr\u00eb\u00e20\u00ecZ7\u00d9\u00feK\"\u00d2\u0098\u0018G\u00db\u0094\u000b\u00daE/\u000eA\u00c0+\u0095\u009e'\u00d1\u00b4\u00ce\u0012\u00d3\u00fa\u00e3\u0094\u00a4\u00b58\u0086\u00e9!:\u0089_\u00e1t\u0088\u00ff\u00f3|\u00cc\u000b*|R\u001a\u0088P\u00a0\u00b8\u0002\u00c9\u0084\u0003C\u001568\u00ce|!\u0011\u00afo+\u00a8l\u00b4\u0003\u0088\u00c5E_\u0095\u001e\u00b8\u00bfe?@}\u000e\u00b2\u00d6\u0010(1\u009d\t\u00bd\u00e4~\u00bd\u0098\u00c3\n~\u001b>z\u0092".length();
                var5_7 = 72;
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
                    var9_3[var7_4++] = ly.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008a2\u0004\u000f\u00e8\u0002\u00aa\u0096%\n\b\u0087\u00a8\u0095\u00b0Z\u009c\u008dy\u001b\u00df\u0003\u00a4?\u00b3\u008b\u00f6\u0000\u00ea\u00d0\u00ff\u0016H\u00b5m\u00cf\u00c4\u00bf\u00d0\u00b1^\u0013\u0089\u00ec'\u00ccK\u007f\u001eL\u00e3\u00a0\u00c6~\u00b7\u0000\u00d5\u00a2\u00fe\u0094#]\u0001\u008d\u009e\u001e\\\u0097\u009b\u00e6d\u00f1c\rG\u00c6~\u00c5\u00b2\u00a0\u000b\u0099\u00fcE+s\u0084\u0014\u00b7\u001e2\u000b%\u00a9z\u0015\u000eo\u0001\u00dbJPpv\u00e8";
                    var8_6 = "\u008a2\u0004\u000f\u00e8\u0002\u00aa\u0096%\n\b\u0087\u00a8\u0095\u00b0Z\u009c\u008dy\u001b\u00df\u0003\u00a4?\u00b3\u008b\u00f6\u0000\u00ea\u00d0\u00ff\u0016H\u00b5m\u00cf\u00c4\u00bf\u00d0\u00b1^\u0013\u0089\u00ec'\u00ccK\u007f\u001eL\u00e3\u00a0\u00c6~\u00b7\u0000\u00d5\u00a2\u00fe\u0094#]\u0001\u008d\u009e\u001e\\\u0097\u009b\u00e6d\u00f1c\rG\u00c6~\u00c5\u00b2\u00a0\u000b\u0099\u00fcE+s\u0084\u0014\u00b7\u001e2\u000b%\u00a9z\u0015\u000eo\u0001\u00dbJPpv\u00e8".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = ly.a(var10_9).intern();
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
        ly.r = var9_3;
        ly.s = new String[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x724;
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
                throw new RuntimeException("ly", exception);
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
            ly.s[n2] = ly.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return s[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ly.a(n, l);
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
            throw new RuntimeException("ly" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ly.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
