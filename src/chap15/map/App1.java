package chap15.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App1 {
	public static void main(String[] args) {
		// Map : (key, value) 쌍으로 들어감, key는 중복이 안되고 순서가 없음.
		Map<String, String> map = new HashMap<>();
		
		map.put("korea", "seoul");
		map.put("usa", "washington");
		map.put("japan", "tokyo");
		map.put("russia", "moscow");
		map.put("korea", "busan");
		
		System.out.println(map.get("korea"));
		System.out.println(map.get("russia"));
		System.out.println(map.get("canada"));
		
		System.out.println();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		
		
		
		
	}
}
