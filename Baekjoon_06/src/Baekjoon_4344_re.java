import java.util.Scanner;

public class Baekjoon_4344_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt(); // ��

		int score = 0; // ������
		double ave = 0; // ���
		float count = 0; // ��� �̻��� �л� ��
		float per = 0; // ����̻� ����

		for (int i = 0; i < c; i++) {
			int n = scanner.nextInt(); // ��
			int[] a = new int[n];
			score = 0;
			count = 0;

			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				score = score + a[j];
			}
			ave = (double) score / n;

			for (int j = 0; j < n; j++) {
				if (a[j] > ave)
					count = count + 1;
			}
			per = count / n * 100;
			System.out.printf("%.3f", per);
			System.out.println(" ");
		}

		scanner.close();
	}

}

// ** �Ҽ� ��°�ڸ� ���� ����Ϸ��� [ %.3f ] �� ����ϱ�.
// ���� �ʱ�ȭ�� ��� �ؾ��ϴ��� �����ϱ�.
// ����ȯ ���� �˾Ƶα�.