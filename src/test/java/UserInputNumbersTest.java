import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputNumbersTest {

//  How do you test Scanner Methods with JUnit?

  @Test
  void AsksUserToInputTenNumbersWhichAreThenConvertedToIntAndSummed() {

      int expected = 55;
      assertEquals(expected, UserInputNumbers.SumInputNumbers());
  }
}