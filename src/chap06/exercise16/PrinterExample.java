package chap06.exercise16;

import chap06.Member;

public class PrinterExample {
	public static void main(String[] args) {
		Member m = new Member("홍길동", "hong");
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
