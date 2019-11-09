package chap07;

public class SuperClass {
	public String name;
	
	
	
	public SuperClass(String name) {
		this.name = name;
	}
	
	public void desc() {
		System.out.println("저는 " + name + "입니다.");
	}
}
