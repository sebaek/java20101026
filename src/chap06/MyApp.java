package chap06;

public class MyApp {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		MyClass c2 = new MyClass();
				
		c.method1();
		c2.method1();
		
		c.method2("뉴욕타임즈");
		c2.method2("CNN");
		c2.method2("BBC");
		
		c.method3("뉴욕");
		c.method3("뉴욕", "서울");
		
	}
}
