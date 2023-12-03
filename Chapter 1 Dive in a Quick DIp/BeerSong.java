public class BeerSong {

   public static void main (String[] args) {
      int beerNum = 1;
      int startNum = 0;
      String word = "bottles";
      if (beerNum == 1) {
         word = "bottle";
      }
      while (beerNum > 0) {
         System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer.");
	 beerNum--;
	 startNum++;
	 if (beerNum == 1) {
	    word = "bottle";
	 } else {
	    word = "bottles";
	 }
	 if (beerNum == 0) {
	    System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
	 } else {
	    System.out.println("Take one down and pass it around, " + beerNum + " " + word + " of beer on the wall.\n");
	 }
      }
      System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
      if (startNum == 1) {
         word = "bottle";
      } else {
         word = "bottles";
      }
      if (startNum == 0) {
         System.out.println("Go to the store and buy some more, no more " + word + " of beer on the wall.");
      } else {
	 System.out.println("Go to the store and buy some more, " + startNum + " " + word + " of beer on the wall.");
      }
   }

}
