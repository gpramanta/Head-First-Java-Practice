class Number {

   int base;
   int exponent;

   void power() {
      int result = 1;
      for (int i = 0; i < exponent; i++) {
         result *= base;
      }
      System.out.print(base + "^" + exponent + " = " + result);
   }

}

class NumberTest {

   public static void main(String[] args) {
      Number n = new Number();
      n.base = 10;
      n.exponent = 2;
      n.power();
   }

}
