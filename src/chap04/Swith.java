package chap04;

public class Swith {
	public static void main(String[] args) {
		// swith case
		// � ��ɹ����� �����ؼ� �����ϰ� ���� �� ���.

		// key�� Ÿ���� byte, char, short, long, int, String 
		int key = 2;
		switch (key) {
		case 1:
			System.out.println("Ű�� 1�Դϴ�.");
		case 2:
			System.out.println("Ű�� 2�Դϴ�.");
			break;

		case 3:
			System.out.println("Ű�� 3�Դϴ�.");
			break;

		default:
			System.out.println("������ case�� �����ϴ�.");
			break;
		}

	}
}
