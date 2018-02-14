/**
 * Examples of loop statements
 */
public class Summation {

	/**
	 * Write a method called sum. It will take two integers the starting
	 * number and the ending number. It will sum the numbers between these two values
	 * inclusively. Your method should handle one or both of the values being negative.
	 */

	public static int sumNumbers (int startInt, int endInt){
		int sum = 0;

		if(startInt >= 0 && endInt >= 0){
			for(int i = startInt; i <= endInt; i++){
				sum += i;
			}
		}
		else if(startInt <= 0 && endInt <= 0){
			for(int i = startInt; i >= endInt; i--){
				sum += i;
			}
		}
		else if( startInt >= 0 && endInt <= 0){
			for(int i = startInt; i >= endInt; i--){
				sum += i;
			}
		}
		else{
			for(int i = startInt; i <= endInt; i++){
				sum += i;
			}
		}

		return sum;

	}


}
