package chap04;

public class Break {
	public static void main(String[] args) {
		// break �� for�� while�� �ߴ� ��Ų��.

		int i = 0;

		while (true) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		}

		System.out.println();

		while (true) {

			int k = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			System.out.println("(" + k + ", " + j + ")");
			
			if ((k+j) == 5) {
				break;
			}

		}
	}

}
