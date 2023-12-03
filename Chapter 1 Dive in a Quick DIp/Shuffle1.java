public class DateFormat {

   public static void main (String[] args) {
      String[] num = {"08", "12", "1996"};
      int index = 0;
      String date = "";
      while (index < num.length) {
         date += num[index];
	 date += "-";
	 index++;
      }
      System.out.print(date);
   }

}

      