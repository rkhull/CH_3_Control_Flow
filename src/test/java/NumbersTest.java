import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumbersTest {

	@Test
	public void numberIsPositive() {
		assertEquals("Positive", Numbers.isNumberNegPos(10));
	}

	@Test
	public void numberIsNegative() {
		assertEquals("Negative", Numbers.isNumberNegPos(-23));
	}

	@Test
	public void numberIsZero() {
		assertEquals("Zero", Numbers.isNumberNegPos(0));
	}
}
