/**
 * Examples of conditional statements
 */
public class ConditionalExample {

	/**
	 * Calculates the reciprocal of the argument.
	 * If argument is 0 the reciprocal will not be calculated.
	 * @param number
	 */
	public void calculateReciprocal(double number) {
		if (number != 0) {
			System.out.println("The reciprocal of " + number + " is " + 1 / number);
		} else {
			System.out.println("Division by 0 is undefined. Cannot calculate reciprocal of 0.");
		}
	}

	/**
	 * Determines if the argument is positive, negative, or zero.
	 * @param number
	 */
	public void isNumberNegPos(double number) {
		if (number > 0) {
			System.out.println(number + " is positive");
		} else if (number < 0) {
			System.out.println(number + " is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

	/**
	 * Uses switch statement to print name of the weekday for the
	 * provided argument. First day of the week is Sunday.
	 * @param dayOfWeek
	 */
	public void dayOfTheWeek(int dayOfWeek) {
		switch (dayOfWeek) {
			case 1:
				System.out.println("The day is Sunday");
				break;
			case 2:
				System.out.println("The day is Monday");
				break;
			case 3:
				System.out.println("The day is Tuesday");
				break;
			case 4:
				System.out.println("The day is Wednesday");
				break;
			case 5:
				System.out.println("The day is Thursday");
				break;
			case 6:
				System.out.println("The day is Friday");
				break;
			case 7:
				System.out.println("The day is Saturday");
				break;
			default:
				System.out.println("Sorry, " + dayOfWeek + " is not a valid day of the week.");
		}
	}

	/**
	 * Example of nested conditional statements
	 */
	public void nestedConditionalExample() {
		for (int i = 0; i < 100; i++) {
			if ((i % 2) == 0) {
				System.out.println("Integer " + i + " is divisible by 2.");
				if((i % 4) == 0) {
					System.out.println("Integer " + i + " is also divisible by 4");
				} else {
					System.out.println("Integer " + i + " is not divisible by 4");
				}
			} else {
				System.out.println("Integer " + i + " is not divisible by 2");
			}
		}
	}
}
