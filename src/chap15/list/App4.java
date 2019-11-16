package chap15.list;

import java.util.ArrayList;
import java.util.List;

public class App4 {
	public static void main(String[] args) {
		// type parameter, generic
		List<String> list = new ArrayList<>();
		
		list.add("java");
//		list.add(3);
		list.add("python");
		list.add("c++");
		list.add("10");
		
		String a = list.get(0);
		String b = list.get(1);
		String c = list.get(2);
		String d = list.get(3);
		
		
		
		
	}
}
