package chap08;

public class Dog implements Pet, Guard {
	@Override
	public void sit() {
		System.out.println("앉아서 웃습니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("낯선사람에게 짖습니다.");
		
	}
}
