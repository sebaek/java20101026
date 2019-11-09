package chap07.pkg2;

import chap07.pkg1.A;

public class C {
	public void method() {
		A a = new A();
//		System.out.println(a.privateField);
//		System.out.println(a.defaultField);
//		System.out.println(a.protectedField);
		System.out.println(a.publicField);
	}

}
