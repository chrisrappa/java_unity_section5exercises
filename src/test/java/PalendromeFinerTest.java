import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeFinerTest {

  @Test
  void CaseWhereIntegerInputShouldBeAPalindromeAndReturnTrue() {
      Boolean expected = true;
      assertEquals(expected, PalindromeFinder.isPalindrome(1221));
  }

}