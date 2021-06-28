public class SimpleCalculator {

  double firstNumber;
  double secondNumber;


  public double getFirstNumber(){
    return(firstNumber);
  }

  public void setFirstNumber(double firstNumber){
    this.firstNumber = firstNumber;
  }

  public double getSecondNumber(){
    return(secondNumber);
  }

  public void setSecondNumber(double secondNumber){
    this.secondNumber = secondNumber;
  }

  public double getAdditionResult(){
    firstNumber = getFirstNumber();
    secondNumber = getSecondNumber();

    double additionResult = firstNumber + secondNumber;
    return (additionResult);
  }

  public double getSubtractionResult(){
    firstNumber = getFirstNumber();
    secondNumber = getSecondNumber();

    double subtractionResult = firstNumber - secondNumber;
    return (subtractionResult);
  }

  public double getMultiplicationResult(){
    firstNumber = getFirstNumber();
    secondNumber = getSecondNumber();

    double multiplicationResult = firstNumber * secondNumber;
    return (multiplicationResult);
  }

  public double getDivisionResult(){
    firstNumber = getFirstNumber();
    secondNumber = getSecondNumber();

    if(secondNumber == 0){
      return 0;
    }

    double divisionResult = firstNumber / secondNumber;

    return (divisionResult);
  }
}
