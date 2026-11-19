import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ta {
   public static ta b;
   public static ta d;
   public static ta c;
   public static ta e;
   public static ta f;
   String a;

   public ta(String var1) {
      this.a = var1;
   }

   public String b() {
      return this.a;
   }

   public static ta[] a() {
      return new ta[]{b, c, d, f, e};
   }

   static {
      long var10 = _c.a(4397504536168047214L, 3753945766950684775L, MethodHandles.lookup().lookupClass()).a(108451683430215L) ^ 30826742988218L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = "\u008ea\u008dÎ¯i\"\u000e\b\nÖ²ß¶Àù±\b95Ç¤\u008eÇ\"\u0013";
      int var7 = "\u008ea\u008dÎ¯i\"\u000e\b\nÖ²ß¶Àù±\b95Ç¤\u008eÇ\"\u0013".length();
      char var4 = '\b';
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var20;
                  if ((var13 += var4) >= var7) {
                     b = new ta(var8[1]);
                     d = new ta(var8[4]);
                     c = new ta(var8[2]);
                     e = new ta(var8[3]);
                     f = new ta(var8[0]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var20;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "<B\u000b\u0097\u0097oE÷\u009e\u0002x\u0099|è\u009cQ\u0010Vá\u008bu\u007fÜ¦@÷ø\u000b+ë\u008cn7";
                  var7 = "<B\u000b\u0097\u0097oE÷\u009e\u0002x\u0099|è\u009cQ\u0010Vá\u008bu\u007fÜ¦@÷ø\u000b+ë\u008cn7".length();
                  var4 = 16;
                  var13 = -1;
            }

            var14 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
