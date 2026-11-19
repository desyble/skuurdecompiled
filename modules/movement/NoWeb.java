import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class lM extends lh {
   private final kt<RB> k;
   private final kt<RB> n;
   private final kt<Number> l;
   private boolean m;
   @A
   public final R8<b5> o;
   private static final long p = _c.a(-3131442751668013629L, -1556636873994206353L, MethodHandles.lookup().lookupClass()).a(242050614209940L);
   private static final String[] q;
   private static final String[] r;
   private static final Map s = new HashMap(13);

   public lM(short var1, EU var2, char var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ p;
      super(var2);
      this.k = new kt(
         a<"g">(25799, 163713325212539314L ^ var5),
         new RB(
            a<"g">(1756, 6541229459979926442L ^ var5),
            new String[]{
               a<"g">(1756, 6541229459979926442L ^ var5),
               a<"g">(31546, 1791399282554865236L ^ var5),
               a<"g">(14826, 3246440801575421083L ^ var5),
               a<"g">(11122, 5713638000544339461L ^ var5),
               a<"g">(25279, 4825818169141632980L ^ var5),
               a<"g">(4125, 1309346264323485031L ^ var5)
            }
         ),
         a<"g">(26738, 6549798250200503554L ^ var5)
      );
      this.n = new kt(
         a<"g">(4851, 313061924982321032L ^ var5),
         new RB(a<"g">(27037, 4704555138118685935L ^ var5), new String[]{a<"g">(27037, 4704555138118685935L ^ var5), a<"g">(8458, 9094902667536850023L ^ var5)}),
         a<"g">(6037, 6981900972873575149L ^ var5),
         this::lambda$new$0
      );
      this.l = new kt(a<"g">(11806, 7049088038842127200L ^ var5), 0.1, a<"g">(29428, 1346869225736310664L ^ var5), 0.01, 0.01, 0.8, this::lambda$new$1);
      this.m = false;
      this.o = this::lambda$new$2;
      this.a(new kt[]{this.k, this.n, this.l});
   }

   public void d(int var1, int var2, int var3) {
      this.m = false;
   }

   public void a(char var1, long var2) {
      Hk.b().ay.h = 1.0F;
   }

   private void lambda$new$2(b5 param1) {




















































































































































































































































































































































































































































































































































































































   }

   private boolean lambda$new$1() {
      long var1 = p ^ 31624481749417L;
      return this.k.q().equals(a<"g">(11122, 5713595957076537007L ^ var1));
   }

   private boolean lambda$new$0() {
      long var1 = p ^ 26096634576995L;
      return this.k.q().equals(a<"g">(2089, 7433012014051947574L ^ var1));
   }

   static {
      long var0 = p ^ 69645990887769L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = "\u0012lÿÇ¹ªf\u0001#ÉQâÒ®\u0085¢\u0018´\u001e\u0005\u0016´ãÑ!\"\u0092b\u0007\u008a«ô\u0000xw\u0011\u007f/NA\r\u0010Ú\u0095·\u0096(\u0006f\u000b\u001f°å\u0098\u00915°¹([Ç\u008b÷¬ßÅ-\u0093ªî\u000f\u008fRð\u008c\u0004r5øYå\u009dbkÏÅ0ð\u001b\u0090Å\u009e\u0090\u0007¾v\u000f|c\u00185épìKÈv¬b*z®%\u009fI¥\u0014W\u0080ÇSÛ.\u0097 í`\u0099\u0095±\u0007þª*e\u0099Nõxd³\u0019æ\u0084ÄÌRJ\u0003ÜÓ\fcm\u0095\u001d\u0089 ¥íKÉzÃ43×C\u001dé\u0092©æ04x\u0011ñ¹,Ê8;ØÒFÑfºw\u0018^\u0094WÎÚG\u000e\" ßÄ¬hó|5>f¢m*lÔ\u0016\u0010Åµ^þn\u008a-²\u0085\r»Ì§9j¢\u0010Àl\u0082¤$êmô+ï:ÄÔQÀÀ\u0010\u0085HÛq ß\u0086ÐöJÚ\u0081l¶ïÔ\u0010\u008f\"ÄÝZcF\rÔg6>«ØB\u008d\u0010Á#×3ç\u0088\u009b\u0096Â\ttóòæ?\u001f\u0010·Õ\u0093÷\u0006\u0080æu\u0080MÙÔ\u009a\u0082ê>\u0010ç\u0018\u0000(¦'Q\u0005\u009cëÌV*_G9\u0018\u0004dÒ¸\u0007Ä&CW\u0081¢\u0090\u0088ÐöHf\u0014@ú\u009ex/±\u0010\u0091\u0084G»»6~\u009d¹\u008e\u0012MgÈÇ\u0011\u0010Xç·YDqÿNsþß^åÜ[w\u00105P\u001cÌÚæ\u0095©« ÐaA÷J\u001e\u0010ª \u0090Ù¡Ù\u0015ª\u0091\u001cÐ\\\u001bÐ}¨";
      int var8 = "\u0012lÿÇ¹ªf\u0001#ÉQâÒ®\u0085¢\u0018´\u001e\u0005\u0016´ãÑ!\"\u0092b\u0007\u008a«ô\u0000xw\u0011\u007f/NA\r\u0010Ú\u0095·\u0096(\u0006f\u000b\u001f°å\u0098\u00915°¹([Ç\u008b÷¬ßÅ-\u0093ªî\u000f\u008fRð\u008c\u0004r5øYå\u009dbkÏÅ0ð\u001b\u0090Å\u009e\u0090\u0007¾v\u000f|c\u00185épìKÈv¬b*z®%\u009fI¥\u0014W\u0080ÇSÛ.\u0097 í`\u0099\u0095±\u0007þª*e\u0099Nõxd³\u0019æ\u0084ÄÌRJ\u0003ÜÓ\fcm\u0095\u001d\u0089 ¥íKÉzÃ43×C\u001dé\u0092©æ04x\u0011ñ¹,Ê8;ØÒFÑfºw\u0018^\u0094WÎÚG\u000e\" ßÄ¬hó|5>f¢m*lÔ\u0016\u0010Åµ^þn\u008a-²\u0085\r»Ì§9j¢\u0010Àl\u0082¤$êmô+ï:ÄÔQÀÀ\u0010\u0085HÛq ß\u0086ÐöJÚ\u0081l¶ïÔ\u0010\u008f\"ÄÝZcF\rÔg6>«ØB\u008d\u0010Á#×3ç\u0088\u009b\u0096Â\ttóòæ?\u001f\u0010·Õ\u0093÷\u0006\u0080æu\u0080MÙÔ\u009a\u0082ê>\u0010ç\u0018\u0000(¦'Q\u0005\u009cëÌV*_G9\u0018\u0004dÒ¸\u0007Ä&CW\u0081¢\u0090\u0088ÐöHf\u0014@ú\u009ex/±\u0010\u0091\u0084G»»6~\u009d¹\u008e\u0012MgÈÇ\u0011\u0010Xç·YDqÿNsþß^åÜ[w\u00105P\u001cÌÚæ\u0095©« ÐaA÷J\u001e\u0010ª \u0090Ù¡Ù\u0015ª\u0091\u001cÐ\\\u001bÐ}¨"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     q = var9;
                     r = new String[22];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "¾\u001eË§¾éËRýÒu\t8á»;\u0010\u0001\u007f ú½à\u0000\u0019%Â&4\u0006íÌÔ";
                  var8 = "¾\u001eË§¾éËRýÒu\t8á»;\u0010\u0001\u007f ú½à\u0000\u0019%Â&4\u0006íÌÔ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static H a(H var0) {
      return var0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29635;
      if (r[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("lM", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = q[var5].getBytes("ISO-8859-1");
         r[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return r[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{int.class, long.class}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("lM" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
