package chap10;

public class App1 {
	public static void main(String[] args) {
//		String str = null;
//		System.out.println(str.toString());
		
		try {
			
			System.out.println("클래스를 찾아봅니다.");
			
			Class.forName("java.lang.String");
			
			System.out.println("클래스를 찾았습니다.");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("클래스를 찾지 못했습니다.");
			
		}
		
		System.out.println("실행을 이어 갑니다.");
	}
}
