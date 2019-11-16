package chap15.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountLetter {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("into_the_unknown.txt"));
			Map<Character, Integer> map = new HashMap<>();
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine().toLowerCase();
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					
					if (map.containsKey(c)) {
						int count = map.get(c);
						map.put(c, count+1);
					} else {
						map.put(c, 1);
					}
				}
			}
			
			Set<Character> keys = map.keySet();
			
			for (Character key : keys) {
				System.out.println(key + " : " + map.get(key));
			}
			
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
