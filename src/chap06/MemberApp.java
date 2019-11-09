package chap06;

public class MemberApp {
	public static void main(String[] args) {
		Member user1 = new Member();
		Member user2 = new Member();
		
		user1.name = "손흥민";
		user2.name = "박지성";
		user1.age = 78;
		user2.age = 99;
		
		System.out.println(user1.name + "의 나이는 " + user1.age + "세 입니다.");
		System.out.println(user2.name + "의 나이는 " + user2.age + "세 입니다.");
	}
}
