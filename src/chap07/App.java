package chap07;

public class App {
	public static void main(String[] args) {
		SuperClass super1 = new SuperClass("박지성");
		super1.desc();
		
		SuperClass sub1 = new SubClass();
//		SubClass sub2 = new SubClass("차범근");
		sub1.desc();
//		System.out.println(sub1.name);
//		System.out.println(sub1.age);
		
		SuperClass sub2 = new SubClass2("이강인");
		sub2.desc();
	}
}
