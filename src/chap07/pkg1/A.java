package chap07.pkg1;

public class A {
	private int privateField; // 같은 클래스 안에서만
	int defaultField; // default, packagePrivate - 같은 패키지 안에서만
	protected int protectedField; // 다른 패키지의 상속받은 클래스에서
	public int publicField; // 모든 클래스에서 
	
	public void method() {
		System.out.println(privateField);
		System.out.println(defaultField);
		System.out.println(protectedField);
		System.out.println(publicField);
	}
}
