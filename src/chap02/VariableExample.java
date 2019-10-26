package chap02;

public class VariableExample {
	public static void main(String[] args) {
		// statement 실행문 
		// { block 코드 블럭 } 
		// 주석
		// 
		/* 주석 여러줄
		 * 주석 여러줄2
		 * 
		 * 
		 */
		
		System.out.println("*********");
		System.out.println("---------");
		System.out.println("+++++++++");
		System.out.println("=========");
		
		
		// 변수 : 값이 저장되는 공간의 이름
		// 변수명 작성 규칙 : 
		// 숫자, 영문자, _, $ 조합, 단 숫자가 먼저올수 없다.
		int var3;
		int var_3;
		int var$3;
		int var$$$3;
//		int var 3;
		int _var;
		int $var;
		int numberOfTable; // lower camel case;
		
		// 변수의 타입 8개 (기본타입 primitive type) + (class, interface 등)
		// 정수 byte, short, int, long
		// 문자 char
		// 실수 float, double
		// 논리 boolean
		
		// 1byte : 8개의 bit 
		// 1bit : 0, 1
		byte b1;
		b1 = -128;
//		b1 = -129;
//		b1 = 128;
		
		short s1;
		s1 = -32768;
		s1 = 32767;
		
		int i1;
		i1 = -2100000000;
		i1 = 2100000000;
		
		long l1;
		l1 = 2893749273423427334L;
		l1 = -8787519875912351L;
		
		char c1;
		c1 = 'a';
		c1 = '가';
		c1 = '1';
		c1 = ' ';
		c1 = '+';
		//c1 = 'ab';
		//c1 = '';
		
		double d1 = 0.1;
		d1 = 0.2;
		d1 = 3;
		
		float f1 = 0.1F;
		f1 = 0.2F;
		
		boolean bool1;
		bool1 = true;
		bool1 = false;
		
		// type 변환
		int i2 = 3;
		long l2  = 34;
		
		l2 = i2;       // 자동 타입 변환
		i2 = (int) l2; // 강제 타입 변환 casting
		
		
		
		
		
		
		int var;
		
		var = 10;
		// System.out.println(var);
		var = -10;
		System.out.println(var);
		
		
		//10을 변수 value의 초기값으로 저장
		int value = 10;
		
		
		// 변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}






