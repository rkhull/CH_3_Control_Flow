public class Numbers {

	/*
	 * Write a method called isNumberNegPos that returns a String specifying
	 * if a number is positive, negative, or zero.
	 */

	public static String isNumberNegPos(int number){

		if(number > 0){
			return "Positive";
		}
		else if (number == 0){
			return "Zero";
		}
		else{
			return "Negative";
		}

	}

}
