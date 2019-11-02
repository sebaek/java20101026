package chap04;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * int i = (int) (Math.random() * 6) + 1; int j = (int) (Math.random() * 6) + 1;
		 * System.out.println("(" + i + ", " + j + ")");
		 * 
		 * while ((i + j) != 5) { i = (int) (Math.random() * 6) + 1; j = (int)
		 * (Math.random() * 6) + 1; System.out.println("(" + i + ", " + j + ")"); }
		 */

		// do while
		int i = 0;
		int j = 0;
		do {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;
			System.out.println("(" + i + ", " + j + ")");
		} while ((i + j) != 5);

	}
}









