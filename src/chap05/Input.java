package chap05;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요:");
		int num = scanner.nextInt();
		
		System.out.println("입력한 값은 " + num + "입니다.");
		scanner.close();
	}
}
