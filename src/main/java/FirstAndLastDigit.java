public class FirstAndLastDigit {

  public static Integer sumFirstAndLastDigit(int number){

    int sum = 0;
    int num = number;

    int lastDigit = num % 10;

    System.out.println(num);
    while(num > 9){
      num /= 10;
    }

    sum = lastDigit + num;
    return(sum);
  }
}
