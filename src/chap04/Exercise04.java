package chap04;

public class Exercise04 {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 6) + 1;
		int j = (int) (Math.random() * 6) + 1;
		System.out.println("(" + i + ", " + j + ")");
		
		while ((i + j) != 5) {
			i = (int) (Math.random() * 6) + 1;
			j = (int) (Math.random() * 6) + 1;
			System.out.println("(" + i + ", " + j + ")");
		}
		

		// 로또: 1 ~ 45 중에 6개의 값.
		// 문제:  1 ~ 45 중에 6개의 값 출력 (중복 가능)
		
		System.out.println();
		
		int k = (int) (Math.random() * 45) + 1;
		int l = 0;
		while (l < 6) {
			System.out.println(k);
			k = (int) (Math.random() * 45) + 1;
			l++;
		}
	}
}




















