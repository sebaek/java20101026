package chap15.list;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List<String> list2 = new ArrayList<String>();
		
		list1.add(1);
		list1.add("java");
		list1.add(3.14);
		
		Object i = list1.get(0);
		Object s = list1.get(1);
		Object d = list1.get(2);
		
		Integer e = (Integer) i;
		System.out.println(e);
		
		String t = (String) s;
		System.out.println(t);
		
		Double f = (Double) d;
		System.out.println(f);
		
		// 8개의 기본데이터 타입에 매칭되는 참조타입 8개
		// int		Integer
		// double	Double
		// float	Float
		// char		Character
		// boolean	Boolean
		// byte		Byte
		// short	Short
		// Long		Long
		
		int a = 1;
		Integer b = a; // Wrapping, (Auto) Boxing 
		int c = b;     // UnWrapping, (Auto) UnBoxing
		
		
		
		
		
		
		
	}
}
