import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NumberToWordTest {

  @Test
  void returnsStringZeroAfterInputingInteger0() {
    String expected = "zero";
    assertEquals(expected, NumberToWord.IntToWord(0));

  }

  @Test
  void intInInvalidRangeSoReturnStringOther() {
      String expected = "other";
      assertEquals(expected, NumberToWord.IntToWord(10));
  }

  @Test
  void intIsNegativeButStillReturnsStringOther() {
      String expected = "other";
      assertEquals(expected, NumberToWord.IntToWord(-1));
  }
}