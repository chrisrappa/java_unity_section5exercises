import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstSwitchTest {

  @Test
  void whichCharA() {
    String expected = "It was a";
    assertEquals(expected, FirstSwitch.whichChar('a'));
  }

  @Test
  void whichCharD() {
    String expected = "It was d";
    assertEquals(expected, FirstSwitch.whichChar('d'));
  }

  @Test
  void whichCharInvalid() {
    String expected = "Invalid char";
    assertEquals(expected, FirstSwitch.whichChar('f'));
  }
}