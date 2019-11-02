package chap04;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 3; i < 100; i = i + 3 ) {
			sum = sum + i;
		}

		System.out.println("3의 배수의 합 : " + sum);
		
		// 0과 1000사이의 홀수의 값을 더한 결과를 출력하시오.
		int sum2 = 0;
		
		for (int i = 1; i < 1000; i = i + 2) {
			sum2 = sum2 + i;
		}
		
		System.out.println("홀수의 합 : " + sum2);
	}
}
