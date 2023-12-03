public class Calculator {
   int base;
   int exponent;

   public void power() {
      int result = 1;
      for (int i = 0; i < exponent; i++) {
         result *= base;
      }
      System.out.println(base + " ^ " + exponent + " = " + result);
   }
}
