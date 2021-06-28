
public class Unit5FirstHalf {

public static void unit5ExercisesFirst(){
  //    Char Checker Challenge
  FirstSwitch.whichChar('a');

//    Day Of The Week Challenge;
  DayOfTheWeek.returnDayOfTheWeek(3);


//      Number To Word Challenge
  NumberToWord.IntToWord(3);

//    Interest Calculator Challenge
  CalculateInterest.CalculateTwoThroughEightPercentInterest(10000);

//    Divisible by 3 & 5 Exercise
  DivisibleByThreeAndFive.DivsibilityChecker(1000);

  //    Sum Odd Exercise
  boolean isSumOdd = CheckIfOdd.sumOdd(100, 1000);
  System.out.println(isSumOdd);

//    Sum Digits Challenge
  SumOfDigits.sumDigits(456);

//    Is Palindrome Exercise
  PalindromeFinder.isPalindrome(1221);

//    First and Last Digit Exercise
  FirstAndLastDigit.sumFirstAndLastDigit(257);


//    Sum Of Even Digits Challenge
  SumOfDigits.sumEvenDigits(123456789);

//    Reading User Input Challenge
  UserInputNumbers.SumInputNumbers();

//  Simple Calculator Exercise

  SimpleCalculator simpleCalculator = new SimpleCalculator();
  simpleCalculator.setFirstNumber(5);
  simpleCalculator.setSecondNumber(4);

  double additionResult = simpleCalculator.getAdditionResult();
  double subtractionResult = simpleCalculator.getSubtractionResult();
  System.out.println(additionResult);
  System.out.println(subtractionResult);

  simpleCalculator.setFirstNumber(5.0);
  simpleCalculator.setSecondNumber(0);
  double multiplicationResult = simpleCalculator.getMultiplicationResult();
  double divisionResult = simpleCalculator.getDivisionResult();
  System.out.println(multiplicationResult);
  System.out.println(divisionResult);

//    Bank Account Exercise

  BankAccount account = new BankAccount(
          12345,
          5000,
          "Chris",
          "chris@gmail.com",
          "310.663.6597");

  account.depositMoney(500);

  System.out.println(account.getAccountBalance());
}

}
