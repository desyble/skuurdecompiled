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

public class mv
extends lh {
    private final kt<qK> o;
    private final kt<Boolean> l;
    private final kt<Boolean> n;
    private final kt<Boolean> m;
    private static int[] k;
    private static final long p;
    private static final String[] q;
    private static final String[] r;
    private static final Map s;

    public mv(char c, long l, EU eU) {
        long l2 = ((long)c << 48 | l << 16 >>> 16) ^ p;
        super(eU);
        this.o = new kt((String)((Object)mv.a("b", (int)1745, (long)(0x32073A398014CF8CL ^ l2))), (Object)new qK((String)((Object)mv.a("b", (int)17346, (long)(0x714A3990649C8A9CL ^ l2))), new kt[]{new kt((String)((Object)mv.a("b", (int)4533, (long)(0x2B801B9D6C2DD8ECL ^ l2))), (Object)true), new kt((String)((Object)mv.a("b", (int)24824, (long)(0x124A5265D27829AEL ^ l2))), (Object)true), new kt((String)((Object)mv.a("b", (int)20119, (long)(0xA2F4D897B0807CBL ^ l2))), (Object)true), new kt((String)((Object)mv.a("b", (int)1411, (long)(0x783F6D5DD0124CDBL ^ l2))), (Object)true), new kt((String)((Object)mv.a("b", (int)14087, (long)(0x5CA17D04376AFE55L ^ l2))), (Object)true)}));
        this.l = new kt((String)((Object)mv.a("b", (int)7696, (long)(0x1A0B13E81BF5574BL ^ l2))), (Object)true, (String)((Object)mv.a("b", (int)30547, (long)(0x6D5D1B60C76BE06L ^ l2))));
        this.n = new kt((String)((Object)mv.a("b", (int)12795, (long)(0x7CC6E4F2AC1178A4L ^ l2))), (Object)false, (String)((Object)mv.a("b", (int)23881, (long)(0x2D5F76DC27A29408L ^ l2))));
        this.m = new kt((String)((Object)mv.a("b", (int)20171, (long)(0x6497F336FE8B079BL ^ l2))), (Object)true, (String)((Object)mv.a("b", (int)6524, (long)(0x11122F841CFBD026L ^ l2))), () -> this.n.g());
        int[] nArray = mv.d();
        kt kt2 = new kt((String)((Object)mv.a("b", (int)15530, (long)(0x45DCCD6E5EA3F5FEL ^ l2))), new kt[]{this.n, this.m});
        this.a(new kt[]{this.o, kt2, this.l});
        int[] nArray2 = nArray;
        try {
            if (nArray2 != null) {
                LQ.b((LQ[])new LQ[2]);
            }
        }
        catch (H h) {
            throw mv.a(h);
        }
    }

    public boolean a(String string) {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    nArray = mv.d();
                    try {
                        try {
                            bl = this.b();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        bl = ((qK)this.o.i()).a(string);
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mv.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean g() {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    nArray = mv.d();
                    try {
                        try {
                            bl = this.b();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        bl = this.l.g();
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mv.a(h);
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
                int[] nArray;
                block6: {
                    nArray = mv.d();
                    try {
                        try {
                            bl = this.b();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        bl = this.n.g();
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mv.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean c() {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    nArray = mv.d();
                    try {
                        try {
                            bl = this.e();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        bl = Keyboard.isKeyDown((int)44);
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mv.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean a() {
        boolean bl;
        block8: {
            block7: {
                int[] nArray;
                block6: {
                    nArray = mv.d();
                    try {
                        try {
                            bl = this.c();
                            if (nArray != null) break block6;
                            if (!bl) break block7;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        bl = this.m.g();
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                try {
                    if (nArray != null) break block8;
                    if (!bl) break block7;
                }
                catch (H h) {
                    throw mv.a(h);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean f(short s, int n, short s2) {
        boolean bl;
        block16: {
            block15: {
                block17: {
                    int[] nArray;
                    long l;
                    block14: {
                        l = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s2 << 48 >>> 48) ^ p;
                        nArray = mv.d();
                        try {
                            try {
                                bl = this.b();
                                if (nArray != null) break block14;
                                if (!bl) break block15;
                            }
                            catch (H h) {
                                throw mv.a(h);
                            }
                            bl = ((qK)this.o.i()).a((String)((Object)mv.a("b", (int)10058, (long)(0x631FA35F97E7FDBCL ^ l))));
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (nArray != null) break block16;
                                        if (bl) break block17;
                                    }
                                    catch (H h) {
                                        throw mv.a(h);
                                    }
                                    bl = ((qK)this.o.i()).a((String)((Object)mv.a("b", (int)20042, (long)(0x77941B7011DD14BEL ^ l))));
                                    if (nArray != null) break block16;
                                }
                                catch (H h) {
                                    throw mv.a(h);
                                }
                                if (bl) break block17;
                            }
                            catch (H h) {
                                throw mv.a(h);
                            }
                            bl = ((qK)this.o.i()).a((String)((Object)mv.a("b", (int)5343, (long)(0xF984BBA34DB4E2FL ^ l))));
                            if (nArray != null) break block16;
                        }
                        catch (H h) {
                            throw mv.a(h);
                        }
                        if (!bl) break block15;
                    }
                    catch (H h) {
                        throw mv.a(h);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
    }

    public static void a(int[] nArray) {
        k = nArray;
    }

    public static int[] d() {
        return k;
    }




    static {
        block11: {
            block10: {
                mv.p = _c.a((long)-3339593376898337571L, (long)-2045161278489730395L, MethodHandles.lookup().lookupClass()).a(114849602028595L);
                mv.s = new HashMap<K, V>(13);
                mv.a(null);
                var0 = mv.p ^ 120002720071211L;
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
                var9_3 = new String[17];
                var7_4 = 0;
                var6_5 = "F\u0095(\u00ea\u00b9>b\u00da\u00b4\u00d5\u00a4lX\u0084\u0007k\u009cJ\u009f\u00a7\u00b9\u008f\u0010\u00ba\u00182n7'\u0093\u00a4h\u00034\u0082=\u00f0\u00d2\u00f8\u00e2T\u00f2U\u0097\u0097\u0010o\u00c5d(Ig\u00b7A\u00e5\u008ah-\u0089\u0092\u0005\u00c6D\u00b1\u00ba$\u00db\u00a1\u00f8\u00100_\u0012B/\u00d1\r5\u00ddL\u0015\u0014}\u00c0\u0000\u00cax?\u00dcV \u008aJa%\u00d3.1\u00cb/\"^W\u00e3yj\u00d7-AQ\u00c9w\u0097\u00dfT^\u009b\u00b6\u0007\u009f\u00a3\u00b2\u00bbX\u00abG\u00d1V\u000e(]\u00a5\f\u00f4\u0015\u00ec\u00a4\u00cf\u00e6\u008b\u00e4\u00bd\u0082!bi_g\u00fe(\u0093h\u008c\u00d05N\u00bc\u00b4\u00f8D5\u00d0k\u0089\u0095\u00e0L\u0088\u00b9`\rU\u00a1\\\u0099\u00dd+A\u00e7\u00b9\u00fd\u0081d\u00b2a\u000f\u0005\u0001\u00fa\u0007\f\u009e\u001e\u00d8Z\u00ff\u0011\u00f1\u009dr\u0096\u009b\u0011\u0003G\u00d8\u00fe\u00ef1\u0081\u00d5d \u00e8#\u0096\u00e2\u0012\u00a1\u0095Z\u00f9\u00bd\u00b4\u0083\u0088X\u00e8cB\u00e8S\u0016<8\u008b\u00d0\u00b9S\u00d7\u00eeO\u00d8;\u00ef \u00be\u00a4\u00ca\u0011\u00c9&\u00da\u00c4\u0000-q\u00af\u00e3XF\u0096]\u0098\u0081\u00a1\u0016\u00adN\u00f5\u00f8\u00c3\u00df\u0092E\u0095t\u0010\u0018^\u00efP\u00ce\u00d83\u00c8\u00e6\"\u00d3\"6Mi,u\u0086\t\u00c4`Y\u0007R\u00d7\u0018\u00ae~T\u00b9\u00d9\u00f2:\u00d0\u00d0,\u00be\u001d\u0010\u00ee\fG\u00b8\u00bc\u00cf\u001d6e\u001d\u0006(\u0084\u00dd\u00b3z\u00f6\u00ae6kyC8\t\u001c\u00cdI#\u00af\u00045\u0094\u00ef\u00f0\u00cd\u00d1?\u0007\u00a0\u00a8\u008b\u0000\u00ff\u0019\u00af\u007f\u0007\u00c0c\u00ddl6(=#\u00e6\u00b7\u00b3\u008e0\u00eaO\u00fd\u0012\u0098\u00ca\u00cfs\u0096\u0099aZBS\u001d\u00a7\u00ef6\u0007Xa\u00a4d\u000e\u00b7\u001d\u00f6\u0018\u00b41C\u00db\u00ea06\u00d4\u00b9H\\\u00c6\u0006\u0089{\t\u00e8 \u00e3\u00ce\u0003\u00f96\u000b\u00bd\u00eeBz\b\u00b7\u0086q1\u00f8\u00d6\u00e7\u001c\u008f\u001f\u0087\u00e4\u00f2\u00e2\u009dw\u0081EwZ4\u00b1\u00cdU\u00ed\u0010H\u0085R\u0007\u00ba\u00133 \u0082As\u00c9\u00ae\u00f5\u00bce {\u00d7\u0013\u00edX\u00e6\u00eb%\u00e6\u00e8\u0016T\u00c9\u0092\u00f2 \u00ea,\u00ce\u00f1\u00e4\u00f2\u0099\u008b3+\u00c3\u008b+\u00c6\u00bbe\u0010\u00e7\u009c\u001d\u0013\u00af\u00e0\u0083\u00c7f#*\u00f3H\u00cd\u00ce\u00fd";
                var8_6 = "F\u0095(\u00ea\u00b9>b\u00da\u00b4\u00d5\u00a4lX\u0084\u0007k\u009cJ\u009f\u00a7\u00b9\u008f\u0010\u00ba\u00182n7'\u0093\u00a4h\u00034\u0082=\u00f0\u00d2\u00f8\u00e2T\u00f2U\u0097\u0097\u0010o\u00c5d(Ig\u00b7A\u00e5\u008ah-\u0089\u0092\u0005\u00c6D\u00b1\u00ba$\u00db\u00a1\u00f8\u00100_\u0012B/\u00d1\r5\u00ddL\u0015\u0014}\u00c0\u0000\u00cax?\u00dcV \u008aJa%\u00d3.1\u00cb/\"^W\u00e3yj\u00d7-AQ\u00c9w\u0097\u00dfT^\u009b\u00b6\u0007\u009f\u00a3\u00b2\u00bbX\u00abG\u00d1V\u000e(]\u00a5\f\u00f4\u0015\u00ec\u00a4\u00cf\u00e6\u008b\u00e4\u00bd\u0082!bi_g\u00fe(\u0093h\u008c\u00d05N\u00bc\u00b4\u00f8D5\u00d0k\u0089\u0095\u00e0L\u0088\u00b9`\rU\u00a1\\\u0099\u00dd+A\u00e7\u00b9\u00fd\u0081d\u00b2a\u000f\u0005\u0001\u00fa\u0007\f\u009e\u001e\u00d8Z\u00ff\u0011\u00f1\u009dr\u0096\u009b\u0011\u0003G\u00d8\u00fe\u00ef1\u0081\u00d5d \u00e8#\u0096\u00e2\u0012\u00a1\u0095Z\u00f9\u00bd\u00b4\u0083\u0088X\u00e8cB\u00e8S\u0016<8\u008b\u00d0\u00b9S\u00d7\u00eeO\u00d8;\u00ef \u00be\u00a4\u00ca\u0011\u00c9&\u00da\u00c4\u0000-q\u00af\u00e3XF\u0096]\u0098\u0081\u00a1\u0016\u00adN\u00f5\u00f8\u00c3\u00df\u0092E\u0095t\u0010\u0018^\u00efP\u00ce\u00d83\u00c8\u00e6\"\u00d3\"6Mi,u\u0086\t\u00c4`Y\u0007R\u00d7\u0018\u00ae~T\u00b9\u00d9\u00f2:\u00d0\u00d0,\u00be\u001d\u0010\u00ee\fG\u00b8\u00bc\u00cf\u001d6e\u001d\u0006(\u0084\u00dd\u00b3z\u00f6\u00ae6kyC8\t\u001c\u00cdI#\u00af\u00045\u0094\u00ef\u00f0\u00cd\u00d1?\u0007\u00a0\u00a8\u008b\u0000\u00ff\u0019\u00af\u007f\u0007\u00c0c\u00ddl6(=#\u00e6\u00b7\u00b3\u008e0\u00eaO\u00fd\u0012\u0098\u00ca\u00cfs\u0096\u0099aZBS\u001d\u00a7\u00ef6\u0007Xa\u00a4d\u000e\u00b7\u001d\u00f6\u0018\u00b41C\u00db\u00ea06\u00d4\u00b9H\\\u00c6\u0006\u0089{\t\u00e8 \u00e3\u00ce\u0003\u00f96\u000b\u00bd\u00eeBz\b\u00b7\u0086q1\u00f8\u00d6\u00e7\u001c\u008f\u001f\u0087\u00e4\u00f2\u00e2\u009dw\u0081EwZ4\u00b1\u00cdU\u00ed\u0010H\u0085R\u0007\u00ba\u00133 \u0082As\u00c9\u00ae\u00f5\u00bce {\u00d7\u0013\u00edX\u00e6\u00eb%\u00e6\u00e8\u0016T\u00c9\u0092\u00f2 \u00ea,\u00ce\u00f1\u00e4\u00f2\u0099\u008b3+\u00c3\u008b+\u00c6\u00bbe\u0010\u00e7\u009c\u001d\u0013\u00af\u00e0\u0083\u00c7f#*\u00f3H\u00cd\u00ce\u00fd".length();
                var5_7 = 24;
                var4_8 = -1;
lbl21:


                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:


                while (true) {
                    var9_3[var7_4++] = mv.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f2\u00cc\u00d1M\u0085 i3\u0084\u001f\b\u00c24z\u001d\u00030@\u00a4\u00f4Y\u0084\u00ba\u001c\u001f1\u0086\u00ed\u0016\u0011\u00a1\u0011\u0097\u009b\u00a4\u00d8\u00ff\u00ff\u0010}.TM\u0089Gi'E\u00d8\u0019\u00a9\u00c9,p\u00d6\u0090\u0089\u00derd\u00b3\u0087\u00d9\u00f9\u0091";
                    var8_6 = "\u00f2\u00cc\u00d1M\u0085 i3\u0084\u001f\b\u00c24z\u001d\u00030@\u00a4\u00f4Y\u0084\u00ba\u001c\u001f1\u0086\u00ed\u0016\u0011\u00a1\u0011\u0097\u009b\u00a4\u00d8\u00ff\u00ff\u0010}.TM\u0089Gi'E\u00d8\u0019\u00a9\u00c9,p\u00d6\u0090\u0089\u00derd\u00b3\u0087\u00d9\u00f9\u0091".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:


                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:


                while (true) {
                    var9_3[var7_4++] = mv.a(var10_9).intern();
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
lbl52:


                ** continue;
            }
        }
        mv.q = var9_3;
        mv.r = new String[17];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2CCF;
        if (r[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("mv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = q[n2].getBytes("ISO-8859-1");
            mv.r[n2] = mv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = mv.a(n, l);
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
            throw new RuntimeException("mv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(mv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
