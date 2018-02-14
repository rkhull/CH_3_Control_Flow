public class DaysOfWeeks {
	/*
	 * Write a method called dayOfTheWeek that takes in an integer representing the day of the week
	 * and returns a String with the name of that day. Uses switch statement in your method.
	 * The first day of the week is Sunday. There should be a default case that handles integers
	 * outside the range of 1 - 7.
	 */

	public static String dayOfTheWeek(int dayOfTheWeek){

		String dayString;
		switch (dayOfTheWeek){
			case 1: dayString = "Sunday";
			break;
			case 2: dayString = "Monday";
			break;
			case 3: dayString = "Tuesday";
			break;
			case 4: dayString = "Wednesday";
			break;
			case 5: dayString = "Thursday";
			break;
			case 6: dayString = "Friday";
			break;
			case 7: dayString = "Saturday";
			break;
			default: dayString = "Invalid Entry";
			break;
		}

		return dayString;

	}

}
