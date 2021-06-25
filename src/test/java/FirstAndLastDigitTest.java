import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastDigitTest {
  
  @Test
  void sumFirstAndLastOf252() {
    int expected = 4;
    assertEquals(expected, FirstAndLastDigit.sumFirstAndLastDigit(252));
      
  }
  
  @Test
  void sumFirstAndLastOf257() {
    int expected = 9;
    assertEquals(expected, FirstAndLastDigit.sumFirstAndLastDigit(257));
      
  }

  @Test
  void sumFirstAndLastOfZero() {
    int expected = 0;
    assertEquals(expected, FirstAndLastDigit.sumFirstAndLastDigit(0));

  }

}