public class mh extends lh {
   @A
   public final R8<cn> k = mh::lambda$new$0;

   public mh(EU var1) {
      super(var1);
   }

   private static void lambda$new$0(cn var0) {
      String[] var1 = m6.a();

      try {
         if (var0.b()) {
            return;
         }
      } catch (H var2) {
         throw a(var2);
      }

      MI var10000;
      label27: {
         try {
            var10000 = Hk.j();
            if (var1 != null) {
               break label27;
            }

            if (var10000 == null) {
               return;
            }
         } catch (H var3) {
            throw a(var3);
         }

         var10000 = Hk.j();
      }

      var10000.o(0);
   }

   private static H a(H var0) {
      return var0;
   }
}
