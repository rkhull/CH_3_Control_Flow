/**
 * Example of continue statement
 */
public class ContinueExample {

	/**
	 * Prints even numbers to console.
	 */
	public void printEven() {
		for(int i = 0; i <= 100; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
	}
}
