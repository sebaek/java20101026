package chap05;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(i + ", " + j);
				sum = sum + array[i][j];
				total = total + 1;
			}
		}
		avg = sum / total;
		
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
