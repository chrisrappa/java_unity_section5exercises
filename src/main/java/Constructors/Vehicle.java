package Constructors;

public class Vehicle {

  String name;
  String size;

  private int currentVelocity;
  private int currentDirection;

  public Vehicle(String name, String size) {
    this.name = name;
    this.size = size;

    this.currentVelocity = 0;
    this.currentDirection = 0;
  }

  public void steer(int direction){
    this.currentDirection += direction;
    System.out.println("Vehicle is steering at " + currentDirection + " degrees.");
  }

  public void move(int velocity, int direction){
    this.currentVelocity += velocity;
    this.currentDirection += direction;

    System.out.println("The vehicle is moving at " + currentVelocity + " in " + currentDirection + " direction.");
  }

  public String getName() {
    return name;
  }

  public String getSize() {
    return size;
  }

  public int getCurrentVelocity() {
    return currentVelocity;
  }

  public int getCurrentDirection() {
    return currentDirection;
  }

  public void stop(){
    this.currentVelocity = 0;
  }
}