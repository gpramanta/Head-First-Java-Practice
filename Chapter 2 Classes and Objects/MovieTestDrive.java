class Movie {
   String title;
   String genre;
   int rating;

   void playIt() {
      System.out.println("Playing the movie");
      System.out.println("title " + title);
      System.out.println("genre " + genre);
      System.out.println("rating " + rating);
   }
}

public class MovieTestDrive {
   public static void main(String[] args) {
      Film one = new Film();
      one.title = "Gone with the Stock";
      one.genre = "Tragic";
      one.rating = -2;
      Film two = new Film();
      two.title = "Lost in Cubicle Space";
      two.genre = "Comedy";
      two.rating = 5;
      two.playIt();
      Film three = new Film();
      three.title = "Byta Club";
      three.genre = "Tragic but ultimately uplifting";
      three.rating = 127;
   }
}