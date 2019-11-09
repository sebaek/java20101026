package chap06;

public class MyClass {
	
	public void method1() {
		System.out.println("기능 1을 실행합니다.");
	}
	
	public void method2(String paper) {
		
		System.out.println("기능 2을 실행합니다. : " + paper);
		
	}

	// 같은 이름의 메소드를 작성할 수 있다.
	// 같은 이름의 메소드는 파라미터의 타입, 순서, 갯수에 따라 달라진다.
	// "메소드 오버로딩"
	public void method3(int i) {
		System.out.println(i);
	}
	
	public void method3(int i, String s) {
		System.out.println(i + s);
	}
	
	public void method3(String s, int i) {
		System.out.println(i + s);
	}
	
	public void method3(String city1, String city2) {
		System.out.println(city1 + ":" + city2);
	}
	
	public void method3(String city1) {
		System.out.println(city1);
	}
	
	public void add(int i, int j) {
		System.out.println("더한 값은 : " + (i + j) + "입니다.");
	}
	
	public double add(double a, double b) {
		System.out.println("더하는 중....");
		
		return a + b;
	}
	
	public double diff(double i, double k) {
		return i - k;
	}
	
	public double div(double i, double k) {
		return i / k;
	}
	
	public double multi(double i, double k) {
		return i * k;
	}
	
	
	public void diff(int i, int k) {
		System.out.println("뺀 값은 : "  + (i - k) + "입니다.");
	}
	
	public void div(int i, int k) {
		System.out.println("나눈 값은 : "  + (i / k) + "입니다.");
	}
	
	public void multi(int i, int k) {
		System.out.println("곱한 값은 : "  + (i * k) + "입니다.");
	}
}









































