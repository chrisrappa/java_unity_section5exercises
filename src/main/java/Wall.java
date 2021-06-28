public class Wall {


  double width;
  double height;

  public Wall(){
    this(0, 0);
  }
  public Wall(double width, double height) {
    setHeight(height);
    setWidth(width);
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double width) {
    if(width < 0){
      this.width = 0;
    } else {
      this.width = width;
    }
  }

  public void setHeight(double height) {
    if(height < 0){
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getArea(double width, double height){
    double area = this.width * this.height;
    return (area);
  }
}
