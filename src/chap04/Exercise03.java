package chap04;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 3; i < 100; i = i + 3 ) {
			sum = sum + i;
		}

		System.out.println("3�� ����� �� : " + sum);
		
		// 0�� 1000������ Ȧ���� ���� ���� ����� ����Ͻÿ�.
		int sum2 = 0;
		
		for (int i = 1; i < 1000; i = i + 2) {
			sum2 = sum2 + i;
		}
		
		System.out.println("Ȧ���� �� : " + sum2);
	}
}
