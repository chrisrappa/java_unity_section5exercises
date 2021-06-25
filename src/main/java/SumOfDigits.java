public class SumOfDigits {

  public static int sumDigits(int number){

    int sum = 0;

    if(number > 9){
      while(number > 0){
        sum = sum + number % 10;
        number = number / 10;
      }
      return(sum);
    } else if(number < 0){
      return(-1);
    } else {
      return(number);
    }

  }

  public static int sumEvenDigits(int num) {

    int sum = 0;
    if(num > 0 ){
      while(num > 0){
        if(num % 2 == 0){
          sum += num % 10;
        }
        num /= 10;
      }
      return (sum);
    } else {
      return(-1);
    }

  }
}
