package chap07.exercise05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
//		this.name = name;
		this.studentNo = studentNo;
	}
}
