package chap02;

public class VariableExample {
	public static void main(String[] args) {
		// statement ���๮ 
		// { block �ڵ� �� } 
		// �ּ�
		// 
		/* �ּ� ������
		 * �ּ� ������2
		 * 
		 * 
		 */
		
		System.out.println("*********");
		System.out.println("---------");
		System.out.println("+++++++++");
		System.out.println("=========");
		
		
		// ���� : ���� ����Ǵ� ������ �̸�
		// ������ �ۼ� ��Ģ : 
		// ����, ������, _, $ ����, �� ���ڰ� �����ü� ����.
		int var3;
		int var_3;
		int var$3;
		int var$$$3;
//		int var 3;
		int _var;
		int $var;
		int numberOfTable; // lower camel case;
		
		// ������ Ÿ�� 8�� (�⺻Ÿ�� primitive type) + (class, interface ��)
		// ���� byte, short, int, long
		// ���� char
		// �Ǽ� float, double
		// �� boolean
		
		// 1byte : 8���� bit 
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
		c1 = '��';
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
		
		// type ��ȯ
		int i2 = 3;
		long l2  = 34;
		
		l2 = i2;       // �ڵ� Ÿ�� ��ȯ
		i2 = (int) l2; // ���� Ÿ�� ��ȯ casting
		
		
		
		
		
		
		int var;
		
		var = 10;
		// System.out.println(var);
		var = -10;
		System.out.println(var);
		
		
		//10�� ���� value�� �ʱⰪ���� ����
		int value = 10;
		
		
		// ���� value ���� �а� 10�� ���ϴ� ��� ������ ����
		// ������ ������� ���� result�� �ʱⰪ���� ����
		int result = value + 10;
		
		
		// ���� result ���� �а� �ֿܼ� ���
		System.out.println(result);
	}
}






