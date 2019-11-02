package chap05;

public class ReferType {
	public static void main(String[] args) {
		int i;
		double d;
		
		String str;
		ReferType s;
		int[] arr;

		String str1 = "hello";
		String str2 = "hello";
		String str3 = "world";
		
		System.out.println(str1 == str2); // true;
		System.out.println(str1 == str3); // false;
		
		
		String str4 = new String("hello");
		String str5 = new String("hello");
		
		System.out.println(str4 == str5);
		
		str5 = str4;
		
		System.out.println(str4 == str5);
		
		
	}
}













