public class calculator {

   static void power(int base, int exponent) {
      int result = 1;
      for (int i = 0; i < exponent; i++) {
         result *= base;
      }
      System.out.print(result);
   }

   public static void main (String[] args) {
      power(5, 2);
   }

}