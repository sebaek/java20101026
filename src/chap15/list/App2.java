package chap15.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++ ) {
			list.add(random.nextInt(100));
		}
		
		System.out.println(list);
		
		
	}
}
