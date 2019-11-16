package chap15.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		Random random = new Random();
		
		while (set.size() < 6) {
			set.add(random.nextInt(45) + 1);
		}
		
		System.out.println(set);
		
	}
}
