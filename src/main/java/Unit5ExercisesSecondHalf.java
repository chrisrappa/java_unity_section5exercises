public class Unit5ExercisesSecondHalf {

  public static void unit5ExercisesSecond() {

//    VIP Bank Customer Exercise

    VIPCustomer defaultCustomer = new VIPCustomer();
    System.out.println(defaultCustomer.getName() + " " + defaultCustomer.getEmailAddress() + " " + defaultCustomer.getCreditLimit());

    VIPCustomer jane = new VIPCustomer("jane", "jane@gmail.com", 5000);
    System.out.println(jane.getName() + " " + jane.getEmailAddress() + " " + jane.getCreditLimit());


//    Wall Exercise

    Wall firstWall = new Wall(5, 10);
    System.out.println(firstWall.getArea(firstWall.getWidth(), firstWall.getHeight()));

    Wall secondWall = new Wall(-1, 10);
    System.out.println(secondWall.getArea(secondWall.getWidth(), secondWall.getHeight()));

    Wall thirdWall = new Wall(40, 50);
    System.out.println(thirdWall.getArea(thirdWall.getWidth(), thirdWall.getHeight()));

//    Vehicle Constructors Challenge

    Honda newHonda = new Honda(3);
    newHonda.accelerateCar(30);


  }
}