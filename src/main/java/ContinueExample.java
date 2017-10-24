public class ContinueExample {

	public static void main(String[] args) {
		ContinueExample myContinueExample = new ContinueExample();
		myContinueExample.printEven();
	}

	public void printEven() {
		for(int i = 0; i <= 100; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
	}
}
