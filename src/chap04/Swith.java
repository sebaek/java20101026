package chap04;

public class Swith {
	public static void main(String[] args) {
		// swith case
		// 어떤 명령문들을 선택해서 실행하고 싶을 때 사용.

		// key의 타입은 byte, char, short, long, int, String 
		int key = 2;
		switch (key) {
		case 1:
			System.out.println("키는 1입니다.");
		case 2:
			System.out.println("키는 2입니다.");
			break;

		case 3:
			System.out.println("키는 3입니다.");
			break;

		default:
			System.out.println("적절한 case가 없습니다.");
			break;
		}

	}
}
