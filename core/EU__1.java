import com.google.gson.annotations.Expose;

public class EU {
   public final ta c;
   public final String b;
   public final String d;
   @Expose
   public int a;

   public EU(ta var1, String var2, String var3, int var4) {
      this.c = var1;
      this.b = var2;
      this.d = var3;
      this.a = var4;
   }

   public EU(ta var1, String var2, String var3) {
      this(var1, var2, var3, 0);
   }
}
