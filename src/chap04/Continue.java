package chap04;

public class Continue {
	public static void main(String[] args) {
		// continue : for, while의 남은 명령문을 실행하지 않고
		// 증감식이나 조건식으로 실행흐름 변경.
		
		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}
