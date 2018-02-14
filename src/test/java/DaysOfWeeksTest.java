import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DaysOfWeeksTest {

	@Test
	public void daysOfWeek() {
		assertEquals("Sunday", DaysOfWeeks.dayOfTheWeek(1));
		assertEquals("Monday", DaysOfWeeks.dayOfTheWeek(2));
		assertEquals("Tuesday", DaysOfWeeks.dayOfTheWeek(3));
		assertEquals("Wednesday", DaysOfWeeks.dayOfTheWeek(4));
		assertEquals("Thursday", DaysOfWeeks.dayOfTheWeek(5));
		assertEquals("Friday", DaysOfWeeks.dayOfTheWeek(6));
		assertEquals("Saturday", DaysOfWeeks.dayOfTheWeek(7));
	}

	@Test
	public void daysOfWeekInvalid() {
		assertEquals("Invalid Entry", DaysOfWeeks.dayOfTheWeek(0));
		assertEquals("Invalid Entry", DaysOfWeeks.dayOfTheWeek(-2));
		assertEquals("Invalid Entry", DaysOfWeeks.dayOfTheWeek(8));
	}
}
