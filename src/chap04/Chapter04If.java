package chap04;

public class Chapter04If {
	public static void main(String[] args) {
		// 조건문과 반복문
		
		// if, else if, else, switch case, for, while, do while
		
		// if
		
//		if (돼지고기가 있으면) {
//			돼지고기를 넣어라;
//		}
		
		int score = 40;
		
		if (score > 50) {
			System.out.println("참 잘했어요.");
		}
		
		boolean check = true;
		
		if (check) {
			System.out.println("확인 되었습니다.");
			System.out.println("체크는 true입니다.");
			System.out.println("0개 이상의 명령문이 올 수 있습니다.");
		}
		
		
		// if, else if 
		
		score = 20;
		
		if (score > 50) {
			System.out.println("참 잘 했어요.");
		} else if (score > 30) {
			System.out.println("나쁘지 않아요.");
		} else if (score > 0) {
			System.out.println("좀 더 노력하세요.");
		}
		
		// if, else
		
		score = 50;
		
		if (score > 50) {
			System.out.println("참 잘 했어요.");
		} else {
			System.out.println("좀 더 노력하세요.");
		}
		
		
		
		if (score > 50) {
			System.out.println("참 잘 했어요.");
		} else if (score > 30) {
			System.out.println("나쁘지 않아요.");
		} else {
			System.out.println("좀 더 노력하세요.");
		}
	
		
		
		
		
		
		
	}
}



















