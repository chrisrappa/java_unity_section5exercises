public class CheckIfOdd {

  public static Boolean isOdd(int number) {
    if(number > 0 && number % 2 != 0){
      return(true);
    }
    return(false);
  }

  public static Boolean sumOdd(int beginRange, int endRange){
    int i;
    int sum = 0;

    if(beginRange >= 0){
      for(i = beginRange; i <= endRange; i++){
        if(i % 2 != 0){
          sum = i + sum;
        }
      }
      System.out.println(sum);
      isOdd(sum);
      if(isOdd(sum) == true){
        return(true);
      }
      return (false);
    }
    return (null);
  }

}
