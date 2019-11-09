package chap07.pkg2;

import chap07.pkg1.A;

public class D extends A {

	public void method() {
		D a = new D();
//		System.out.println(a.privateField);
//		System.out.println(a.defaultField);
		System.out.println(a.protectedField);
		System.out.println(a.publicField);
	}
}
