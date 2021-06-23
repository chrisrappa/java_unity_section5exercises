import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculateInterest {

  public static void CalculateTwoThroughEightPercentInterest(int principle) {

    int i;


    for(i = 2; i <= 8; i++){
      double interest = i * 0.01;
      double result = interest * principle;
      System.out.println(result);
    }
  }
}
