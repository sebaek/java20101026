package chap04;

public class Chapter04 {
	public static void main(String[] args) {
		// ���ǹ��� �ݺ���
		
		// if, else if, else, switch case, for, while, do while
		
		// if
		
//		if (������Ⱑ ������) {
//			������⸦ �־��;
//		}
		
		int score = 40;
		
		if (score > 50) {
			System.out.println("�� ���߾��.");
		}
		
		boolean check = true;
		
		if (check) {
			System.out.println("Ȯ�� �Ǿ����ϴ�.");
			System.out.println("üũ�� true�Դϴ�.");
			System.out.println("0�� �̻��� ��ɹ��� �� �� �ֽ��ϴ�.");
		}
		
		
		// if, else if 
		
		score = 20;
		
		if (score > 50) {
			System.out.println("�� �� �߾��.");
		} else if (score > 30) {
			System.out.println("������ �ʾƿ�.");
		} else if (score > 0) {
			System.out.println("�� �� ����ϼ���.");
		}
		
		// if, else
		
		score = 50;
		
		if (score > 50) {
			System.out.println("�� �� �߾��.");
		} else {
			System.out.println("�� �� ����ϼ���.");
		}
		
		
		
		if (score > 50) {
			System.out.println("�� �� �߾��.");
		} else if (score > 30) {
			System.out.println("������ �ʾƿ�.");
		} else {
			System.out.println("�� �� ����ϼ���.");
		}
	
		
		
		
		
		
		
	}
}



















