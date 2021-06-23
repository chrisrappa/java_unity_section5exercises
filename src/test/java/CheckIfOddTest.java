import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfOddTest {

  @Test
  void numberIsOdd() {
      Boolean expected = true;
      assertEquals(expected, CheckIfOdd.isOdd(5));
  }

  @Test
  void sumOfOddNumbersInRangeIsOdd() {
      Boolean expected = true;
      assertEquals(expected, CheckIfOdd.sumOdd(0, 1000));
  }

  @Test
  void sumOfOddNumbersInRangeIsNotOdd() {
      Boolean expected = false;
      assertEquals(expected, CheckIfOdd.sumOdd(0, 8));

  }
}