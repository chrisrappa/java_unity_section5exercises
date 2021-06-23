import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByThreeAndFiveTest {

  @Test
  void FiveNumbersAreDivisibleByThreeAndFive() {
    int expected = 225;
    assertEquals(expected, DivisibleByThreeAndFive.DivsibilityChecker(1000));
  }

}