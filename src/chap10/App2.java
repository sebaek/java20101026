package chap10;

public class App2 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		try {
			method2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method2() throws ClassNotFoundException {
		method3();
	}
	
	public static void method3() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
