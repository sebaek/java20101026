package chap04;

public class Continue {
	public static void main(String[] args) {
		// continue : for, while�� ���� ��ɹ��� �������� �ʰ�
		// �������̳� ���ǽ����� �����帧 ����.
		
		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}
