import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pC extends op {
   private final List<Ta> w = new ArrayList();
   private static final long x = _c.a(5641003896728098457L, 5028007820540064250L, MethodHandles.lookup().lookupClass()).a(1956283285771L);

   public pC() {
      this.a();
   }

   private void a() {
      String var10000 = Es.b();
      float var2 = 10.0F;
      String var1 = var10000;

      for (ta var6 : ta.a()) {
         this.w.add(new Ta(var6, var2, 10.0F));
         var2 += 103.0F;
         if (var1 != null) {
            break;
         }
      }
   }

   public void a(short var1, int var2, int var3, long var4, float var6) {
      long var7 = (long)var1 << 48 | var4 << 16 >>> 16;
      int var9 = (int)((var7 ^ 64499180058056L) >>> 32);
      int var10 = (int)((var7 ^ 64499180058056L) << 32 >>> 32);
      this.f(var9, var10);
      this.a(var2, var3);
      this.b(var2, var3);
   }

   private void a(int var1, int var2) {
      String var10000 = Es.b();
      Iterator var4 = this.w.iterator();
      String var3 = var10000;

      while (var4.hasNext()) {
         Ta var5 = (Ta)var4.next();
         var5.b(var1, var2);
         if (var3 != null) {
            break;
         }
      }
   }

   private void b(int var1, int var2) {
      long var3 = x ^ 23914698742017L;
      long var5 = var3 ^ 28325606843923L;
      String var10000 = Es.b();
      Iterator var8 = this.w.iterator();
      String var7 = var10000;

      while (var8.hasNext()) {
         Ta var9 = (Ta)var8.next();
         var9.d(var1, var5, var2);
         if (var7 != null) {
            break;
         }
      }
   }

   protected void a(int var1, long var2, int var4, int var5, char var6) {
      String var10000 = Es.b();
      Iterator var8 = this.w.iterator();
      String var7 = var10000;

      while (var8.hasNext()) {
         Ta var9 = (Ta)var8.next();
         var9.c(var1, var4, var5);
         if (var7 != null) {
            break;
         }
      }
   }

   protected void b(int var1, long var2, int var4, int var5, int var6) {
      String var10000 = Es.b();
      Iterator var8 = this.w.iterator();
      String var7 = var10000;

      while (var8.hasNext()) {
         Ta var9 = (Ta)var8.next();
         var9.a(var4, var5, var6);
         if (var7 != null) {
            break;
         }
      }
   }

   protected void a(char param1, char param2, char param3, int param4, int param5) {















































































































   }

   public boolean k() {
      return false;
   }

   private static H a(H var0) {
      return var0;
   }
}
