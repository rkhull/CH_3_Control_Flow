public class ConditionalExample {

	public static void main(String[] args) {
		ConditionalExample myConditionalExample = new ConditionalExample();

		System.out.println("Calculate the reciprocal.");
		myConditionalExample.calculateReciprocal(8);
		myConditionalExample.calculateReciprocal(0);

		System.out.println("\nIs the number negative or positive?");
		myConditionalExample.isNumberNegPos(-134);
		myConditionalExample.isNumberNegPos(0);
		myConditionalExample.isNumberNegPos(12);

		System.out.println("\nWhat day of the week is it?");
		myConditionalExample.dayOfTheWeek(1);
		myConditionalExample.dayOfTheWeek(3);
		myConditionalExample.dayOfTheWeek(13);

		myConditionalExample.nestedConditionalExample();
	}

	public void calculateReciprocal(double number) {
		if (number != 0) {
			System.out.println("The reciprocal of " + number + " is " + 1 / number);
		} else {
			System.out.println("Division by 0 is undefined. Cannot calculate reciprocal of 0.");
		}
	}

	public void isNumberNegPos(double number) {
		if (number > 0) {
			System.out.println(number + " is positive");
		} else if (number < 0) {
			System.out.println(number + " is negative");
		} else {
			System.out.println("Number is zero");
		}
	}

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
