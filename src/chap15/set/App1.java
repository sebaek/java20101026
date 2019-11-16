package chap15.set;

import java.util.HashSet;
import java.util.Set;

public class App1 {
	public static void main(String[] args) {
		// Set : 순서가 없고 중복이 안됨.
		Set<Integer> set = new HashSet<>();
		
		set.add(3);
		set.add(4);
		set.add(-1);
		set.add(3);
		
		for (Integer n : set) {
			System.out.println(n);
		}
		
		
		
		
	}
}
