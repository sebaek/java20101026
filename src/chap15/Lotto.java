package chap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		boolean won = false;
		int game = 0;
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}

		Collections.shuffle(list);
		List<Integer> my = list.subList(0, 6);
		System.out.println(my);

		Set<Integer> set = new HashSet<>();

		while (!won) {
			game++;
			set.clear();
			while (set.size() < 6) {
				set.add(random.nextInt(45) + 1);
			}

			int match = 0;
			for (Integer i : my) {
				if (!set.contains(i)) {
					match = 0;
					break;
				} else {
					match++;
				}
			}
			if (match == 6) {
				won = true;
				break;
			}
		}
		System.out.println(game);
		System.out.println(game / 52 / 100);
	}
}
