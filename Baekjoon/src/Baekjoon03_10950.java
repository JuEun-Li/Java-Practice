
/*�Է�
	ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
	�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

 	���
	�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.*/

import java.util.Scanner;

public class Baekjoon03_10950 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();

			if ((0 > A) && (A > 10))
				break;

			int B = scanner.nextInt();

			if ((0 > B) && (B > 10))
				break;

			sum = A + B;
			System.out.println(sum);
		}
		scanner.close();
	}
}