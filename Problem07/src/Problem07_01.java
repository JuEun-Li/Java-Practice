// x�� �����̸� -1 ��ȯ, ������ �� 1��ȯ

import java.util.Scanner;

class A1 {
	public static int A2(int n) {
		if (n < 0)
			return -1;
		else
			return 1;
	}
}

public class Problem07_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println("x�� " + A1.A2(x) + "�Դϴ�.");
		scanner.close();
	}

}
