public class NameOMatic {

   public static void main (String[] args) {
      String[] firstName = {"John", "Paul", "Thomas", "Jonathan"};
      String[] middleName = {"Joseph", "James", "Edward", "Guy"};
      String[] lastName = {"McGowan", "McCartney", "Yorke", "Greenwood"};

      int rand1 = (int) (Math.random() * firstName.length);
      int rand2 = (int) (Math.random() * middleName.length);
      int rand3 = (int) (Math.random() * lastName.length);

      String fullName = firstName[rand1] + " " + middleName[rand2] + " " + lastName[rand3];

      System.out.println("Fullname: " + fullName);
   }

}