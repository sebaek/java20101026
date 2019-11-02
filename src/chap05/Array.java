package chap05;

public class Array {
	public static void main(String[] args) {
		int i = 0;
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		
		System.out.println(arr[0]);
		
		int[] arr2 = arr;
		
		System.out.println(arr2[0]);
		
		arr2[4] = 99;
		
		System.out.println(arr[4]);
		
		
		// 배열을 선언하고 값을 넣는 방법
		int[] arr3; // 배열 선언
		arr3 = new int[] {2, 3, 4};
		arr3[0] = 2;
		arr3[1] = 3;
		arr3[2] = 4;
		
		// 배열의 크기를 정하는 방법
		int[] arr4;
		arr4 = new int[5];
		
		// 배열의 선언과 동시에 값을 넣는 방법
		int[] arr6 = {6, 7, 8, 9};
		
		// 배열의 길이를 확인하는 방법
		System.out.println(arr6.length);
		
		System.out.println(arr6[arr6.length - 1]);
		
		
		System.out.println();
		
		// 배열의 모든 값 출력
		for (int j = 0; j < arr6.length; j++) {
			System.out.println(arr6[j]);
		}
		
		System.out.println();
		// for each
		for (int j : arr6) {
			System.out.println(j);
		}
		
		
	}
}



















