import java.util.Scanner;

public class UserInputNumbers {

  public static int SumInputNumbers() {

    int sum = 0;
    int counter = 0;
    int numInputs = 10;

    Scanner scanner = new Scanner(System.in);


    while(numInputs > 0){
      counter += 1;
      System.out.println(MessagePrompt(counter));
      int inputNumber = scanner.nextInt();
      sum += inputNumber;
      scanner.nextLine();
      numInputs -= 1;
    }

    System.out.println(sum);
    return(sum);
  }

  public static String MessagePrompt(int counter){
    String message =  "Please type integer #" + counter;
    return(message);
  }
}
