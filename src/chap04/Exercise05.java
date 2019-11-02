package chap04;

public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60
		// 1 <= x <= 10, 1 <= y <= 10
		
		// x = 1, y = 1 : 
		// x = 1, y = 2 :
		// x = 1, y = 3 :
		// :
		// :
		// x = 10, y = 1 :
		// x = 10, y = 2 :
		// :
		// x = 10, y = 10 :
		

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		
	}
}

















