public class LoopExample {

	public static void main(String[] args) {
		LoopExample myLoopExample = new LoopExample();

//		System.out.println("The sum of one through ten is: " + myLoopExample.sumOneThroughTen());
//		myLoopExample.randomSum();
//		myLoopExample.doRandomSum();
		myLoopExample.twoDimensionalArray();
	}

	public int sumOneThroughTen() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public void randomSum() {
		int sum = 0;
		while (sum < 1000) {
			int randomNum = (int)(Math.random() * 10);
			sum += randomNum;
			System.out.println("Adding random number: " + randomNum + " to sum.");
		}
		System.out.println("The sum is: " + sum);
	}

	public void doRandomSum() {
		int sum = 0;
		do {
			int randomNum = (int)(Math.random() * 10);
			sum += randomNum;
			System.out.println("Adding random number: " + randomNum + " to sum.");

		} while (sum < 1000);
		System.out.println("The sum is: " + sum);
	}

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
