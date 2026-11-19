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

public class mz extends lh {
   private final kt<Boolean> n;
   private final kt<Boolean> l;
   private final kt<Kh> k;
   private final kt<Boolean> m;
   private static final long o = _c.a(-1165780700772198499L, -2415666506200138629L, MethodHandles.lookup().lookupClass()).a(169588017613930L);
   private static final String[] p;
   private static final String[] q;
   private static final Map r = new HashMap(13);

   public mz(short var1, EU var2, int var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ o;
      super(var2);
      this.n = new kt(a<"f">(6582, 7440112967927076739L ^ var5), true, a<"f">(21475, 6201714394429251025L ^ var5));
      this.l = new kt(a<"f">(2068, 4402405283949676071L ^ var5), false, a<"f">(21322, 1110265157953871229L ^ var5));
      this.k = new kt(a<"f">(2158, 622968519511836246L ^ var5), 255, 255, 255, true, a<"f">(24863, 37011876807175977L ^ var5));
      this.m = new kt(a<"f">(4405, 7068191391305342724L ^ var5), true, a<"f">(29781, 7069434015808518757L ^ var5));
      kt var7 = new kt(a<"f">(20251, 8094559140330520866L ^ var5), this.n);
      kt var8 = new kt(a<"f">(6369, 1241388553014318805L ^ var5), new kt[]{this.l, this.k});
      this.a(new kt[]{var7, var8, this.m});
   }

   public Kh d() {
      return this.k.s();
   }

   public boolean c() {
      return this.m.g();
   }

   public boolean a() {
      return this.l.g();
   }

   public boolean e() {
      return this.n.g();
   }

   static {
      long var0 = o ^ 19485632316709L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u001bt\u0019á\u000fõ\u0084¶\feÉú6*È\u0081,\u0006ü\u008d\u000b\u0087wåZ$O|\u0086Ð\u0004\u0018¦\fç¥¢2ZÃ¹\u0091èùäÆÑ\u0098Z¨(*¡>¾z|\u009f1í)PóIÊKPóì{ô«\u0010^WÑ\u0003T)ã=\u001cþÏ¼c0÷²0.ÄÊØ\u008e<»¯òS××Gu:HQ«j\u0092þ\u0015¦jrz`´\u00877¹\u001bF/¯\u009bqXWY\u0095\u009a\\\u000f\u0094ÕÉ\u0091\u0010|¦E\u008cY,¼&Â\u0001\u001eË\u0095É\u008e½ Ë¾\u009aë\u0092\u0001û¦\u001ev\u0007à¬ïÛOo\u0002xç§íN\u0006ÿ(ã\\\u000eûí1\u0018\u0093QÔH0F¢ñ'pJÿ\u001cØ\u0007Xè¾×iÿ\u0086I8\u00188}\u009a}÷}#OÊö\u0007îuë®\\°\u0087w{£\u0086;\u0094(\u0092\u008bC\t\u00ad\u0083ö\u0004_Ñc\u008b¼\u0007b¤[\u001d×\u0094 yÁí\u001f\u0089\u0006@÷ÁX9\u0083çzkJZãË";
      int var8 = "\u001bt\u0019á\u000fõ\u0084¶\feÉú6*È\u0081,\u0006ü\u008d\u000b\u0087wåZ$O|\u0086Ð\u0004\u0018¦\fç¥¢2ZÃ¹\u0091èùäÆÑ\u0098Z¨(*¡>¾z|\u009f1í)PóIÊKPóì{ô«\u0010^WÑ\u0003T)ã=\u001cþÏ¼c0÷²0.ÄÊØ\u008e<»¯òS××Gu:HQ«j\u0092þ\u0015¦jrz`´\u00877¹\u001bF/¯\u009bqXWY\u0095\u009a\\\u000f\u0094ÕÉ\u0091\u0010|¦E\u008cY,¼&Â\u0001\u001eË\u0095É\u008e½ Ë¾\u009aë\u0092\u0001û¦\u001ev\u0007à¬ïÛOo\u0002xç§íN\u0006ÿ(ã\\\u000eûí1\u0018\u0093QÔH0F¢ñ'pJÿ\u001cØ\u0007Xè¾×iÿ\u0086I8\u00188}\u009a}÷}#OÊö\u0007îuë®\\°\u0087w{£\u0086;\u0094(\u0092\u008bC\t\u00ad\u0083ö\u0004_Ñc\u008b¼\u0007b¤[\u001d×\u0094 yÁí\u001f\u0089\u0006@÷ÁX9\u0083çzkJZãË"
         .length();
      char var5 = 'H';
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
                     p = var9;
                     q = new String[10];
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

                  var6 = "V;î²¸%a,ÄÀ\u0093e\u008dõ\u0096/\u0010!\u0087\u009a>ýËxÞFDi¾\u0088ôãý";
                  var8 = "V;î²¸%a,ÄÀ\u0093e\u008dõ\u0096/\u0010!\u0087\u009a>ýËxÞFDi¾\u0088ôãý".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12460;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("mz", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = p[var5].getBytes("ISO-8859-1");
         q[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
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
         throw new RuntimeException("mz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
