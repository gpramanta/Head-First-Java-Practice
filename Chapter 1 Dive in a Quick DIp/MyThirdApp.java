public class power {

  public static void main (String[] args) {
   int base = 5;
   int exponent = 2;
   int result = 1;
   for (int i = 0; i < base; i = i + 1) {
      result = result * base;
   }
   System.out.println(result);
  }

}