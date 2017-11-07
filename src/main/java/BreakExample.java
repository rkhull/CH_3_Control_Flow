/**
 * Examples of the Break statement
 */
public class BreakExample {

	/**
	 * Example of breaking out of a loop
	 */
	public void breakOutOfLoop() {
		for (int i = 0; i < 50; i++) {
			if (i == 40) {
				System.out.println("i = 40, breaking out of loop");
				break;
			} else {
				System.out.println("i equals: " + i);
			}
		}
	}

	/**
	 * Example of break statement as a goto
	 */
	public void breakAsGoTo() {
		int i = 0;
		characterLoop:
		{
			numberLoop:
			{
				for (; i < 50; i++) {
					if (i == 25) {
						break characterLoop;
					}
					System.out.println("i is: " + i);
				}
			}
		}
		for (; i < 50; i++) {
			char c = (char) i;
			System.out.println("i cast to a character is: " + c);
		}
	}
}
