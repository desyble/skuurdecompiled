public final class v7 implements R_ {
   private final K8 a;
   private static LQ[] b;

   public v7(K8 var1) {
      this.a = var1;
   }

   public K8 c() {
      return this.a;
   }

   public static void b(LQ[] var0) {
      b = var0;
   }

   public static LQ[] b() {
      return b;
   }

   static {
      if (b() != null) {
         b(new LQ[2]);
      }
   }
}
