public class PalindromeFinder {

  public static Boolean isPalindrome(int number) {

    int num = number;
    int numberReverse = 0;

    while (num > 0) {
      int lastDigit = num % 10;
      numberReverse *= 10;
      numberReverse += lastDigit;
      num /= 10;
    }

    if(numberReverse == number){
      return (true);
    } else {
      System.out.println(numberReverse);
      System.out.println(number);
      return (false);
    }
  }
}