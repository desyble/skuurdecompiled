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

public class lJ
extends lh {
    private final kt<Boolean> s;
    private final kt<Boolean> q;
    private final kt<Number> p;
    private final kt<Number> r;
    private final kt<Number> l;
    private boolean o;
    private final Pd n;
    private long k;
    @A
    public final R8<ck> m;
    private static final long t;
    private static final String[] u;
    private static final String[] v;
    private static final Map w;

    public lJ(long l, EU eU, short s) {
        long l2 = (l << 16 | (long)s << 48 >>> 48) ^ t;
        super(eU);
        this.s = new kt((String)((Object)lJ.a("u", (int)5286, (long)(0x6ED9A0C735AE8378L ^ l2))), (Object)true, (String)((Object)lJ.a("u", (int)20285, (long)(0x7FBB747EDC1358EDL ^ l2))));
        this.q = new kt((String)((Object)lJ.a("u", (int)3981, (long)(0x1D28C69EE3489856L ^ l2))), (Object)true, (String)((Object)lJ.a("u", (int)15470, (long)(0x482BE0D085DDABB1L ^ l2))));
        this.p = new kt((String)((Object)lJ.a("u", (int)22372, (long)(0x4B6B5F66F38AC0BDL ^ l2))), (Object)75, (String)((Object)lJ.a("u", (int)6462, (long)(0x7559A202D3BA0EEFL ^ l2))), 1.0, 10.0, 75.0, "\u00b0", () -> this.q.i());
        this.r = new kt((String)((Object)lJ.a("u", (int)40, (long)(0x1BF4B669A4ED17F2L ^ l2))), (Object)50, (String)((Object)lJ.a("u", (int)12737, (long)(0x4302AE5D796A613L ^ l2))), 1.0, 0.0, 350.0, (String)((Object)lJ.a("u", (int)26118, (long)(0x334A9DA35584F1DBL ^ l2))));
        this.l = new kt((String)((Object)lJ.a("u", (int)14890, (long)(0x546B89D6C431ADF9L ^ l2))), (Object)150, (String)((Object)lJ.a("u", (int)22640, (long)(0x658EA33BB04D4FA8L ^ l2))), 1.0, 0.0, 350.0, (String)((Object)lJ.a("u", (int)23397, (long)(0x5932D274FD4CCCB9L ^ l2))));
        this.o = false;
        this.n = new Pd();
        this.k = 0L;
        this.m = this::lambda$new$0;
        this.a(new kt[]{this.r, this.l, this.p, this.s, this.q});
    }

    public void d(int n, int n2, int n3) {
        this.o = false;
        this.b();
        this.n.e();
    }

    public void a(char c, long l) {
        this.c(false);
    }

    private void c(boolean bl) {
        block12: {
            int n;
            bU bU2;
            block13: {
                boolean bl2;
                block10: {
                    bU2 = Hk.i().ah;
                    bl2 = lj.k();
                    try {
                        block11: {
                            try {
                                try {
                                    n = bl;
                                    if (bl2) break block10;
                                    if (n == 0) break block11;
                                }
                                catch (H h) {
                                    throw lJ.a(h);
                                }
                                bU.a((int)bU2.d(), (boolean)true);
                                this.o = true;
                                if (!bl2) break block12;
                            }
                            catch (H h) {
                                throw lJ.a(h);
                            }
                        }
                        n = this.o;
                    }
                    catch (H h) {
                        throw lJ.a(h);
                    }
                }
                try {
                    try {
                        if (bl2) break block13;
                        if (n == 0) break block12;
                    }
                    catch (H h) {
                        throw lJ.a(h);
                    }
                    n = bU2.d();
                }
                catch (H h) {
                    throw lJ.a(h);
                }
            }
            bU.a((int)n, (boolean)uA.a((bU)bU2));
            this.o = false;
        }
    }




    private void b() {
        block9: {
            block8: {
                var2_1 = this.r.m();
                var1_2 = lj.i();
                var3_3 = this.l.m();
                try {
                    try {
                        if (!var1_2) break block8;
                        if (var2_1 >= var3_3) {
                        }
                        ** GOTO lbl19
                    }
                    catch (H v0) {
                        throw lJ.a(v0);
                    }
                    this.k = var2_1;
                }
                catch (H v1) {
                    throw lJ.a(v1);
                }
            }
            try {
                if (var1_2) break block9;
lbl19:


                this.k = (long)var2_1 + (long)(Math.random() * (double)(var3_3 - var2_1 + 1));
            }
            catch (H v2) {
                throw lJ.a(v2);
            }
        }
    }





    private void lambda$new$0(ck var1_1) {
        block68: {
            block69: {
                block70: {
                    block65: {
                        block66: {
                            block67: {
                                block64: {
                                    block62: {
                                        block63: {
                                            block61: {
                                                block58: {
                                                    block60: {
                                                        block59: {
                                                            block57: {
                                                                block53: {
                                                                    block54: {
                                                                        block52: {
                                                                            block51: {
                                                                                var2_2 = lJ.t ^ 43764473322797L;
                                                                                v0 = var2_2 ^ 90154138624717L;
                                                                                var4_3 = v0 >>> 16;
                                                                                var6_4 = (int)(v0 << 48 >>> 48);
                                                                                var7_5 = lj.k();
                                                                                try {
                                                                                    try {
                                                                                        if (var7_5) break block51;
                                                                                        if (!tf.m().b(m6.class)) break block52;
                                                                                    }
                                                                                    catch (H v1) {
                                                                                        throw lJ.a(v1);
                                                                                    }
                                                                                    this.c(false);
                                                                                    this.n.e();
                                                                                }
                                                                                catch (H v2) {
                                                                                    throw lJ.a(v2);
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v3    = Hk.e();
                                                                                if (var7_5) break block53;
                                                                                if (v3    == null) break block54;
                                                                            }
                                                                            catch (H v4) {
                                                                                throw lJ.a(v4);
                                                                            }
                                                                            this.c(false);
                                                                            return;
                                                                        }
                                                                        catch (H v5) {
                                                                            throw lJ.a(v5);
                                                                        }
                                                                    }
                                                                    v3    = this.s.i();
                                                                }
                                                                if (((Boolean)v3   ).booleanValue()) {
                                                                    block55: {
                                                                        var8_6 = Hk.j().Z();
                                                                        try {
                                                                            block56: {
                                                                                try {
                                                                                    try {
                                                                                        if (var7_5) break block55;
                                                                                        if (var8_6 == null) break block56;
                                                                                    }
                                                                                    catch (H v6) {
                                                                                        throw lJ.a(v6);
                                                                                    }
                                                                                    if (var8_6.v() instanceof aF) break block57;
                                                                                }
                                                                                catch (H v7) {
                                                                                    throw lJ.a(v7);
                                                                                }
                                                                            }
                                                                            this.c(false);
                                                                        }
                                                                        catch (H v8) {
                                                                            throw lJ.a(v8);
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                            var8_6 = new xc(Hk.j().ax, Hk.j().e - 1.0, Hk.j().av);
                                                            try {
                                                                v9 = Hk.a().b((xc)var8_6, var4_3, (short)var6_4).a() == PE.b0 ? 1 : 0;
                                                            }
                                                            catch (H v10) {
                                                                throw lJ.a(v10);
                                                            }
                                                            var9_7 = v9;
                                                            try {
                                                                try {
                                                                    try {
                                                                        v11 = ((Boolean)this.q.i()).booleanValue();
                                                                        if (var7_5) break block58;
                                                                        if (v11 == 0) break block59;
                                                                    }
                                                                    catch (H v12) {
                                                                        throw lJ.a(v12);
                                                                    }
                                                                    cfr_temp_0 = Hk.j().m - this.p.k();
                                                                    v11 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                                    if (var7_5) break block58;
                                                                }
                                                                catch (H v13) {
                                                                    throw lJ.a(v13);
                                                                }
                                                                if (v11 < 0) break block60;
                                                            }
                                                            catch (H v14) {
                                                                throw lJ.a(v14);
                                                            }
                                                        }
                                                        v11 = 1;
                                                        break block58;
                                                    }
                                                    v11 = 0;
                                                }
                                                var10_8 = v11;
                                                try {
                                                    v15 = Hk.j().al;
                                                    if (var7_5) break block61;
                                                    if (v15 == 0) break block62;
                                                }
                                                catch (H v16) {
                                                    throw lJ.a(v16);
                                                }
                                                v15 = var9_7;
                                            }
                                            try {
                                                if (var7_5) break block63;
                                                if (v15 == 0) break block62;
                                            }
                                            catch (H v17) {
                                                throw lJ.a(v17);
                                            }
                                            v15 = var10_8;
                                        }
                                        try {
                                            if (var7_5) break block64;
                                            if (v15 == 0) break block62;
                                        }
                                        catch (H v18) {
                                            throw lJ.a(v18);
                                        }
                                        v15 = 1;
                                        break block64;
                                    }
                                    v15 = 0;
                                }
                                var11_9 = v15;
                                try {
                                    try {
                                        try {
                                            try {
                                                v19 = var11_9;
                                                if (var7_5) break block65;
                                                if (v19 != 0) {
                                                }
                                                ** GOTO lbl152
                                            }
                                            catch (H v20) {
                                                throw lJ.a(v20);
                                            }
                                            v21 = this;
                                            if (var7_5) break block66;
                                        }
                                        catch (H v22) {
                                            throw lJ.a(v22);
                                        }
                                        if (v21.o) break block67;
                                    }
                                    catch (H v23) {
                                        throw lJ.a(v23);
                                    }
                                    this.c(true);
                                }
                                catch (H v24) {
                                    throw lJ.a(v24);
                                }
                            }
                            v21 = this;
                        }
                        try {
                            try {
                                v21.n.e();
                                if (!var7_5) break block68;
lbl152:


                                v25 = this;
                                if (var7_5) break block69;
                            }
                            catch (H v26) {
                                throw lJ.a(v26);
                            }
                            v19 = (int)v25.o;
                        }
                        catch (H v27) {
                            throw lJ.a(v27);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v19 != 0) {
                                    v28 = this;
                                    if (var7_5) break block70;
                                }
                                ** GOTO lbl185
                            }
                            catch (H v29) {
                                throw lJ.a(v29);
                            }
                            if (!v28.n.a(this.k)) break block68;
                        }
                        catch (H v30) {
                            throw lJ.a(v30);
                        }
                        this.c(false);
                        v28 = this;
                    }
                    catch (H v31) {
                        throw lJ.a(v31);
                    }
                }
                try {
                    v28.b();
                    if (!var7_5) break block68;
lbl185:


                    v25 = this;
                }
                catch (H v32) {
                    throw lJ.a(v32);
                }
            }
            v25.c(false);
        }
    }




    static {
        block11: {
            block10: {
                lJ.t = _c.a((long)2494972214922482745L, (long)1810593425093850299L, MethodHandles.lookup().lookupClass()).a(139486188229988L);
                lJ.w = new HashMap<K, V>(13);
                var0 = lJ.t ^ 120666151435827L;
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
                var6_5 = "\u00a6\"\u00a0\u00b6v\u00f3qE\u0017\u00df\u0010`\u00cb\u00be^\u00ff\u00e1\u00cb\u00e9l\u00bei\u00e4L \\\u0014Bt~\u00de0\u00c1_\u00bc)\u00ce\u00c0{JbQ\u00d2U##\n\u0013\u00fc\u009e\u0089\u001c/\u00fd\u0014\u0011\u00d1 -L\u00f8\u0014\u0010x\u00baVV\u008be\u00ba\n\u0090\u0086\u0098\u0097\u0088\u00cdO\u0006\u001a1a\u0095\u0006U\bD\u00c5\u00df\u00df8Ut\u00e8\u00d5[\u00b5\u00bb\u00e9a\u00c1&\u00d2\u00be\u00a9*1e\u00be\u0080\u00ad\u0099\u00ce\u00f6\u0094W\u00da\"\t\u009c\u00e4nrQ\u00e8\u001b\u008e+\u00c3H#\u00b9\u00e8G\u009djD\u00d2x\u00f4\u00d0\u00c3\u00fb\u00ad\u00ba\u00ac\u00100\u0002\u00007e%\u00ee\u00d6 o\u00b4\u00ed\f\u00c6z{\u0097=V\u00c3N\u00b5\u00c2\u00cd;k\u00c7\u001e\u0013`\u0098\u00b6,\u00b4\u00948\u0011\u00c5\u00c6c)\u0013\u0099\u001ct\u00bb\u00bf\u00a7\u008b \u00e4g\u0081z\u00b7\u008d\u00c2&\u0013\u009eX\u00d1\u00d7*\u0018\u00ec#(\u00ea\u00aeN\u00deu\u00e8c\u00ffYjc\u00ebq\u008f\u0010>2\u00deZm\n\u00ae\u00c64\u00f0\u00ad\u00c6;%\u00b3\u00a7\u0010:#\u00cb\b\u000e\u0094<\f:\u00fe\u00c7\u00e3z\u00d9\u00d3S #\u00d4\u009e$\u0007\u00dc\u0011\u00c0oa=\u001a\u00fd'`RLx\u0081\u0086\u0013\u00b8\u00faW\u00e4\u00caT\u00c4(\u00d21S0a\u0086!\u00ab\u009d\u0083@\u00cb\u00e1^\u009e\u007fy\u0014,\u00f0e|\u00d1\u00d5\u00ce\u001c\u00ea\u00af\u000f#\u0091M\u008aH\u00add\u00f8\u008a\u00fb\u00c2\u00a1$\u00a9\u00d9\u00bfs\u00d6\u009f.IiR";
                var8_6 = "\u00a6\"\u00a0\u00b6v\u00f3qE\u0017\u00df\u0010`\u00cb\u00be^\u00ff\u00e1\u00cb\u00e9l\u00bei\u00e4L \\\u0014Bt~\u00de0\u00c1_\u00bc)\u00ce\u00c0{JbQ\u00d2U##\n\u0013\u00fc\u009e\u0089\u001c/\u00fd\u0014\u0011\u00d1 -L\u00f8\u0014\u0010x\u00baVV\u008be\u00ba\n\u0090\u0086\u0098\u0097\u0088\u00cdO\u0006\u001a1a\u0095\u0006U\bD\u00c5\u00df\u00df8Ut\u00e8\u00d5[\u00b5\u00bb\u00e9a\u00c1&\u00d2\u00be\u00a9*1e\u00be\u0080\u00ad\u0099\u00ce\u00f6\u0094W\u00da\"\t\u009c\u00e4nrQ\u00e8\u001b\u008e+\u00c3H#\u00b9\u00e8G\u009djD\u00d2x\u00f4\u00d0\u00c3\u00fb\u00ad\u00ba\u00ac\u00100\u0002\u00007e%\u00ee\u00d6 o\u00b4\u00ed\f\u00c6z{\u0097=V\u00c3N\u00b5\u00c2\u00cd;k\u00c7\u001e\u0013`\u0098\u00b6,\u00b4\u00948\u0011\u00c5\u00c6c)\u0013\u0099\u001ct\u00bb\u00bf\u00a7\u008b \u00e4g\u0081z\u00b7\u008d\u00c2&\u0013\u009eX\u00d1\u00d7*\u0018\u00ec#(\u00ea\u00aeN\u00deu\u00e8c\u00ffYjc\u00ebq\u008f\u0010>2\u00deZm\n\u00ae\u00c64\u00f0\u00ad\u00c6;%\u00b3\u00a7\u0010:#\u00cb\b\u000e\u0094<\f:\u00fe\u00c7\u00e3z\u00d9\u00d3S #\u00d4\u009e$\u0007\u00dc\u0011\u00c0oa=\u001a\u00fd'`RLx\u0081\u0086\u0013\u00b8\u00faW\u00e4\u00caT\u00c4(\u00d21S0a\u0086!\u00ab\u009d\u0083@\u00cb\u00e1^\u009e\u007fy\u0014,\u00f0e|\u00d1\u00d5\u00ce\u001c\u00ea\u00af\u000f#\u0091M\u008aH\u00add\u00f8\u008a\u00fb\u00c2\u00a1$\u00a9\u00d9\u00bfs\u00d6\u009f.IiR".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = lJ.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\b\u00b0\u00a4\u00dd\u0015\\,m\u008a\u0085Jn\u0000\u00d6Ku\u008f5\u008c\u001b|\u001b\u00be\u00e1\u00a9\u0015Hp\u00ed\u00b0=\u008a\u00c6\u00a4\u00fc\u00f8Z\u0012\u00afd8\u00d7\u0002\u0099M\u00ca\u00fe\u0019\u0091\u0095\u00f8\u0010\u00c5\u00c0\u00c4RV=jj\u00ce\u000f\u00d3M\u00bc\u00bf\u008d\u00ac\u00bf\u00d3\u00d5\u00cc8\u0002sw^)\u00f0\u00d6\u00ac\u00fak@t(\u00f5z\u00b4\u00a7\u0084<\b\u008d\ff\u00c6";
                    var8_6 = "\b\u00b0\u00a4\u00dd\u0015\\,m\u008a\u0085Jn\u0000\u00d6Ku\u008f5\u008c\u001b|\u001b\u00be\u00e1\u00a9\u0015Hp\u00ed\u00b0=\u008a\u00c6\u00a4\u00fc\u00f8Z\u0012\u00afd8\u00d7\u0002\u0099M\u00ca\u00fe\u0019\u0091\u0095\u00f8\u0010\u00c5\u00c0\u00c4RV=jj\u00ce\u000f\u00d3M\u00bc\u00bf\u008d\u00ac\u00bf\u00d3\u00d5\u00cc8\u0002sw^)\u00f0\u00d6\u00ac\u00fak@t(\u00f5z\u00b4\u00a7\u0084<\b\u008d\ff\u00c6".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = lJ.a(var10_9).intern();
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
        lJ.u = var9_3;
        lJ.v = new String[12];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6573;
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
                throw new RuntimeException("lJ", exception);
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
            lJ.v[n2] = lJ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return v[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = lJ.a(n, l);
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
            throw new RuntimeException("lJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }




    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(lJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
