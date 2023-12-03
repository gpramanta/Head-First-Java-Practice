public class DateFormat {

   public static void main (String[] args) {
      String[] num = {"08", "12", "1996"};
      String date = "";
      for (int i = 0; i <= num.length; i++) {
         date += num[i];
	 date += "-";
      }
      System.out.print(date);
   }

}

      