public class DivisibleByThreeAndFive {


  public static Integer DivsibilityChecker(int numberRange) {

    int i, x;
    int sum = 0;
    int count = 0;

    for(i = 0; i < numberRange; i++){
      if(count < 6){
        if(i % 3 == 0 && i % 5 == 0){
          x = i;
          sum = sum + x;
          count++;
        }
      }
    }

    return(sum);

  }
}
