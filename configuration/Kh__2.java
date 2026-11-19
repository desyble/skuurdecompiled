import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Kh {
    private int d;
    private int e;
    private int c;
    private int b;
    private static final long a = _c.a((long)-2166004137140128277L, (long)-3641718210454354044L, MethodHandles.lookup().lookupClass()).a(127904193537458L);
    private static final String f;

    public Kh(int n, int n2, int n3, int n4) {
        this.d = this.a(n);
        LQ[] lQArray = RB.d();
        try {
            this.e = this.a(n2);
            this.c = this.a(n3);
            this.b = this.a(n4);
            if (lQArray == null) {
                LQ.b((LQ[])new LQ[3]);
            }
        }
        catch (H h) {
            throw Kh.a(h);
        }
    }

    private int a(int n) {
        return Math.max(0, Math.min(255, n));
    }

    public int e() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int c() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int a() {
        return this.b << 24 | this.d << 16 | this.e << 8 | this.c;
    }

    public static Kh a(long l, int n, String string) {
        Kh kh;
        block13: {
            int n2;
            int n3;
            String[] stringArray;
            block11: {
                block12: {
                    long l2 = (l << 32 | (long)n << 32 >>> 32) ^ a;
                    stringArray = string.trim().split(f);
                    LQ[] lQArray = RB.d();
                    try {
                        try {
                            n3 = stringArray.length;
                            n2 = 4;
                            if (lQArray == null) break block11;
                            if (n3 != n2) break block12;
                        }
                        catch (H h) {
                            throw Kh.a(h);
                        }
                        return new Kh(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]), Integer.parseInt(stringArray[3]));
                    }
                    catch (H h) {
                        throw Kh.a(h);
                    }
                }
                n3 = stringArray.length;
                n2 = 3;
            }
            try {
                if (n3 == n2) {
                    return new Kh(Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]), Integer.parseInt(stringArray[2]), 255);
                }
            }
            catch (H h) {
                throw Kh.a(h);
            }
            try {
                kh = new Kh(255, 255, 255, 255);
                LQ[] lQArray = LQ.J();
                if (n <= 0) {
                    if (lQArray == null) break block13;
                    lQArray = new LQ[1];
                }
                RB.b((LQ[])lQArray);
            }
            catch (H h) {
                throw Kh.a(h);
            }
        }
        return kh;
    }

    public String toString() {
        return this.d + " " + this.e + " " + this.c + " " + this.b;
    }





    public boolean equals(Object object) {
        int n;
        int n2;
        block28: {
            Kh kh;
            LQ[] lQArray;
            block27: {
                block26: {
                    Object object2;
                    block24: {
                        block25: {
                            block22: {
                                block23: {
                                    lQArray = RB.d();
                                    try {
                                        try {
                                            object2 = this;
                                            if (lQArray == null) break block22;
                                            if (object2 != object) break block23;
                                            return true;
                                        }
                                        catch (H h) {
                                            throw Kh.a(h);
                                        }
                                    }
                                    catch (H h) {
                                        throw Kh.a(h);
                                    }
                                }
                                object2 = object;
                            }
                            try {
                                try {
                                    if (lQArray == null) break block24;
                                    if (object2 instanceof Kh) break block25;
                                    return false;
                                }
                                catch (H h) {
                                    throw Kh.a(h);
                                }
                            }
                            catch (H h) {
                                throw Kh.a(h);
                            }
                        }
                        object2 = object;
                    }
                    kh = (Kh)object2;
                    try {
                        try {
                            n2 = this.d;
                            n = kh.d;
                            if (lQArray == null) break block26;
                            if (n2 != n) return 0 != 0;
                        }
                        catch (H h) {
                            throw Kh.a(h);
                        }
                        n2 = this.e;
                        n = kh.e;
                    }
                    catch (H h) {
                        throw Kh.a(h);
                    }
                }
                try {
                    try {
                        if (lQArray == null) break block27;
                        if (n2 != n) return 0 != 0;
                    }
                    catch (H h) {
                        throw Kh.a(h);
                    }
                    n2 = this.c;
                    n = kh.c;
                }
                catch (H h) {
                    throw Kh.a(h);
                }
            }
            try {
                try {
                    try {
                        if (lQArray == null) break block28;
                        if (n2 != n) return 0 != 0;
                    }
                    catch (H h) {
                        throw Kh.a(h);
                    }
                    n2 = this.b;
                    if (lQArray == null) return n2 != 0;
                }
                catch (H h) {
                    throw Kh.a(h);
                }
                n = kh.b;
            }
            catch (H h) {
                throw Kh.a(h);
            }
        }
        if (n2 != n) return 0 != 0;
        return 1 != 0;
    }

    public int hashCode() {
        return this.a();
    }




    static {
        long l = a ^ 0x6E2CAF7164A9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0099\u00eb\u00f2N\u0087\\\u00b9D".getBytes("ISO-8859-1"));
                f = Kh.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
}
