package chap06;

public class MyClass {
	// (인스턴스) 필드 = 인스턴스 변수
	String name = "손흥민";
	int age;
	
	// 스태틱 필드, 정적 필드, 클래스 필드, 클래스 변수
	static String city;
	
	
	// 생성자
	MyClass() {
//		this.name = "홍길동";
//		this.age = 0;
//		this.method1();
		this("홍길동", 0);
	}
	
	MyClass(int age) {
//		this.name = "홍길동";
//		this.age = age;
//		this.method1();
		this("홍길동", age);
	}
	
	MyClass(String name) {
//		this.name = name;
//		this.age = 0;
//		this.method1();
		this(name, 0);
	}
	
	MyClass(String name, int age) {
//		System.out.println("객체 생성 중....");
		this.name = name;
		this.age = age;
		this.method1();
	}
	
	

	
	// 메소드들
	public static void method4() {
		System.out.println("스태틱 메소드 실행");
	}
	public static int staticAdd(int i, int j) {
		int k = i + j;
		return k;
	}
	
	public void method1() {
		System.out.println(this.name + ":" + this.age);
//		System.out.println(name + ":" + age);
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









































