package chap05;

public class Exercise06 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		int[] arr1 = array[1];
		array[1][0] = 9999;
		
		arr1[2] = 8888;
		
		System.out.println(arr1[0]);
		
		System.out.println(array[1][2]);
	}
}









