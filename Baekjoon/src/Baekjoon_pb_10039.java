// �л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ������ ��� 0�� �̻�, 100�� ������ 5�� ����̴�. ����, ��� ������ �׻� �����̴�.
// �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.

import java.util.Scanner;

public class Baekjoon_pb_10039 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			int student = scanner.nextInt();
			if (student < 0 && student % 5 != 0)
				break;

			if (student < 40)
				student = 40;

			sum = sum + student;

		}
		int avr = sum / 5;
		System.out.println(avr);
	}

}
