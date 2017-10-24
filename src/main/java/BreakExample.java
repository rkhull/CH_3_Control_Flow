public class BreakExample {

	public static void main(String[] args) {
		BreakExample myBreakExample = new BreakExample();

		myBreakExample.breakOutOfLoop();
		myBreakExample.breakAsGoTo();
	}

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
