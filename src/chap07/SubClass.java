package chap07;

public class SubClass extends SuperClass {
	public int age;
	
	public SubClass() {
		this("홍길동", 99);
	}
	
	public SubClass(String name, int age) {
		super(name);
		this.age = 99;
	}
	
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	
	// 오버라이드 (Override)
	public void desc() {
		System.out.println("저는 " + name + "입니다. 나이는 " + age + "세 입니다.");
	}
}
