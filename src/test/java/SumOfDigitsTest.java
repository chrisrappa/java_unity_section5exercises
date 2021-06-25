import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

  @Test
  void SumOfDigitsIn125() {
      int expected = 8;
      assertEquals(expected, SumOfDigits.sumDigits(125));
  }

  @Test
  void SumOfDigitsIn9() {
      int expected = 9;
      assertEquals(expected, SumOfDigits.sumDigits(9));
  }

  @Test
  void InvalidNumberShouldReturnNegativeOne() {
      int expected = -1;
      assertEquals(expected, SumOfDigits.sumDigits(-45));
  }

  @Test
  void SumEvenDigitsReturns20() {
    int expected = 20;
    assertEquals(expected, SumOfDigits.sumEvenDigits(123456789));

  }
  
  @Test
  void SumEvenDigitsReturns4() {
    int expected = 4;
    assertEquals(expected, SumOfDigits.sumEvenDigits(252));
  }
  
  @Test
  void SumEvenDigitsReturnsNegativeOneForAnythingLessThanZero() {
    int expected = -1;
    assertEquals(expected, SumOfDigits.sumEvenDigits(-1));
  }




}