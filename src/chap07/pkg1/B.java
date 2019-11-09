package chap07.pkg1;

public class B {
	public void method() {
		A a = new A();
//		System.out.println(a.privateField);
		System.out.println(a.defaultField);
		System.out.println(a.protectedField);
		System.out.println(a.publicField);
	}
}
