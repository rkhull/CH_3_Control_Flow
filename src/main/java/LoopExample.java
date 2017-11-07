/**
 * Examples of loop statements
 */
public class LoopExample {

	/**
	 * Example of for loop
	 * @return sum of values one through ten
	 */
	public int sumOneThroughTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * Example of while loop
	 * Sums random numbers until sum exceeds 1000
	 */
	public void randomSum() {
		int sum = 0;
		while (sum < 1000) {
			int randomNum = (int)(Math.random() * 10);
			sum += randomNum;
			System.out.println("Adding random number: " + randomNum + " to sum.");
		}
		System.out.println("The sum is: " + sum);
	}

	/**
	 * Example of do-while loop
	 * Sums random numbers until sum exceeds 1000
	 */
	public void doRandomSum() {
		int sum = 0;
		do {
			int randomNum = (int)(Math.random() * 10);
			sum += randomNum;
			System.out.println("Adding random number: " + randomNum + " to sum.");

		} while (sum < 1000);
		System.out.println("The sum is: " + sum);
	}

	/**
	 * Example of nested loops
	 * Iteration over a two dimensional array
	 */
	public void twoDimensionalArray() {
		int numRows = 5;
		int numColumns = 10;
		int[][] array = new int[numRows][numColumns];

		for(int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				array[i][j] = (int)(Math.random() * 10);
			}
		}

		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numColumns; j++) {
				System.out.println("Row: " + i + " Column: " + j + " Contains: " + array[i][j]);
			}
		}
	}

}
