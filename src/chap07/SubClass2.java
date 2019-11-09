package chap07;

public class SubClass2 extends SuperClass {
	
	public SubClass2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void desc() {
		System.out.println("저는 " + name + "입니다. 나이는 없습니다.");
	}
}
