package chap10;

public class App1 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
			
			System.out.println("클래스를 찾아봅니다.");
			
			Class.forName("java.lang.String2");
			
			System.out.println("클래스를 찾았습니다.");
			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}
//		} catch (ClassNotFoundException e) {
//			System.out.println("클래스를 찾지 못했습니다.");
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			System.out.println("참조하는 객체가 없습니다.");
//			e.printStackTrace();
//		} 
		
		System.out.println("실행을 이어 갑니다.");
	}
}
