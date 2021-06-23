import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

  @Test
  void returnTuesday() {
      String expected = "Tuesday";
      assertEquals(expected, DayOfTheWeek.returnDayOfTheWeek(2));
  }

  @Test
  void returnInvalidDay() {
    String expected = "Invalid Day";
    assertEquals(expected, DayOfTheWeek.returnDayOfTheWeek(7));

  }
}