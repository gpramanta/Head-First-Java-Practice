class Player {
   int number;

   guess() {
      number = (int) (Math.random() * 10);
   }
}

class GuessGame {
   int p1;
   int p2;
   int p3;

   void startGame() {
      Player p1 = new Player();
      p1.number = p1.guess();
      Player p2 = new Player();
      p2.number = p2.guess();
      Player p3 = new Player();
      p3.number = p3.guess();
      System.out.println(p1.number);
      System.out.println(p2.number);
      System.out.println(p3.number);
   }
}

public class Test {
   public static void main(String[] args) {
      GuessGame g = new GuessGame();
      g.startGame();
   }
}

