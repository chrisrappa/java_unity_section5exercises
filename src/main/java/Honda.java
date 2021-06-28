import Constructors.Car;

public class Honda extends Car {

  private int roadServiceMonths;

  public Honda(int roadServiceMonths) {
    super("Honda", "2WD", 4, 4, 6, false);
    this.roadServiceMonths = roadServiceMonths;
  }

  public void accelerateCar(int rate){
    int newVelocity = getCurrentVelocity() + rate;
    if(newVelocity == 0){
      stop();
    } else if (newVelocity > 0 && newVelocity <= 10){
      changeGear(1);
    } else if(newVelocity > 10 && newVelocity <= 20){
      changeGear(2);
    }

    if(newVelocity > 0){
      changeVelocity(newVelocity, getCurrentDirection());
    }
  }

}
