package chap15.list;

import java.util.ArrayList;
import java.util.List;

public class App1 {
	public static void main(String[] args) {
		// LIST: 순서 유지, 중복 가능
		List list = new ArrayList();
		
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.get(4));
		System.out.println(list.get(5));
	}
}
