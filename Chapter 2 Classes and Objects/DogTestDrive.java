class Calculator {

   int base;
   int exponent;
   int result;

   void power() {
      for (int i = 0; i < exponent; i++) {
         result *= base;
      }
      System.out.print(result);
   }
}

class TestCalculator {

   public static void main (String [] args) {
      Calculator c = new Calculator();
      c.base = 5;
      c.exponent = 2;
      c.result = 1;
      c.power();
   }
} 