package Constructors;

import Constructors.Vehicle;

public class Car extends Vehicle{

  private int wheels;
  private int doors;
  private int gear;
  private boolean isManual;

  public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
    super(name, size);
    this.wheels = wheels;
    this.doors = doors;
    this.gear = gears;
    this.isManual = isManual;
  }

  public void changeGear(int gear){
    this.gear = gear;
    System.out.println("Changed gear to " + gear);
  }

  public void changeVelocity(int speed, int direction){
    move(50, 65);
    System.out.println("Car velocity changed " + speed + " and " + direction);
  }

}
