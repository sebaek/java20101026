package chap03;

public class Chapter03 {

	public static void main(String[] args) {
		// 1. ���� ������

		// -
		int var1;
		int var2;
		var1 = 3;
		var2 = -var1;
		System.out.println(var2);

		// ++, --
		var1++;
		System.out.println(var1);

		var1 = var1 + 1;
		System.out.println(var1);

		System.out.println("---------");
		var2 = ++var1;
		System.out.println(var1);
		System.out.println(var2);

		System.out.println("---------");
		var2 = var1++;
		System.out.println(var1);
		System.out.println(var2);

		// ! (not)
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(!b1);
		System.out.println(!b2);

		// ���� ������
		// ? :

		// ���� ������

		// ��� ������ +, - , *, /, %
		int var3 = 3 + 4;
		int var4 = 4 - 5;
		int var5 = 5 * 2;
		int var6 = 7 / 2;
		int var7 = 10 % 3;

		System.out.println(var6);
		System.out.println(var7);

		double d1 = 7.0 / 2.0;
		System.out.println(d1);

		double d2 = 0.1;
		double d3 = 0.2;
		double d4 = d2 + d3;
		System.out.println(d4);

		// ���ڿ� ���� ������ +
		String s1;
		String s2;
		s1 = "";
		s1 = "������";
		s1 = " abc ";

		s2 = s1 + "�󸶹�";
		System.out.println(s2);

		s1 = "3";
		s2 = s1 + s1;

		System.out.println(s2);

		s2 = s1 + 3;
		s2 = 3 + s1;

		s2 = 3 + 3 + s1;
		System.out.println(s2);

		s2 = 3 + s1 + 3;
		System.out.println(s2);

		// ��ȣ
		double d5 = (3 + 2 - (1 - 10)) * 20 - (2 + 4);

		// �� ������ (����� �׻� boolean)
		// >, <, >=, <=, ==, !=

		System.out.println(3 < 5);
		System.out.println(3 > 5);
		System.out.println(3 >= 5);
		System.out.println(3 <= 5);
		System.out.println(3 == 5);
		System.out.println(3 != 5);

		System.out.println();
		// �� ������
		// &&(and), ||(or)

		// && �纯�� ��� true�� ���� ����� true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println();
		// || �纯�� ��� false�� ���� ����� false
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

	}
}






