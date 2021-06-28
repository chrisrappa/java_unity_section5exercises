public class PalindromeFinder {

  public static Boolean isPalindrome(int number) {
    String intToString = Integer.toString(number);

    String reverseStringInt = new StringBuilder(intToString).reverse().toString();

    Boolean isPalindrome = intToString.equals(reverseStringInt);


//    int num = number;
//    int numberReverse = 0;
//
//    while (num > 0) {
//      int lastDigit = num % 10;
//      numberReverse *= 10;
//      numberReverse += lastDigit;
//      num /= 10;
//    }

    if(isPalindrome){
      return true;
    } else {
      System.out.println(reverseStringInt);
      System.out.println(intToString);
      return false;
    }
  }
}