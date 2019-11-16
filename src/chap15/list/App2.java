package chap15.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < 10; i++ ) {
			list.add(random.nextInt(100));
		}
		
		System.out.println(list);
		
		int min = 101;
		int max = -1;
		
		for (int i = 0; i < list.size(); i++) {
			int item = list.get(i);
			
			if (min > item) {
				min = item;
			}
			
			if (max < item) {
				max = item;
			}
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
	}
}







