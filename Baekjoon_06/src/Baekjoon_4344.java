import java.util.Scanner;

// �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ�
// �Ҽ��� ��° �ڸ����� ����Ѵ�.

public class Baekjoon_4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt(); // ��

		int score = 0;
		int ave = 0;
		float count = 0;
		float per = 0;

		for (int i = 0; i < c; i++) {
			int n = scanner.nextInt(); // ��
			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				score = score + a[j];
			}
			ave = score / n;
			
			for (int j = 0; j < n; j++) {
				if (a[j] > ave)
					count = count + 1;
			}
			per = count / n * 100;
			System.out.println(per + "%");
		}

		scanner.close();
	}

}

// [�� �� �Ǿ��� �κ�]
// 1. j �ݺ����� ���� ������ ���� �������� �ʵ��� �ʱ�ȭ�� ��������
// 2. ������ �̻��ϰ� ���Ǵ� ����
// 3. �Ҽ� ��° ¥�������� ����ϴ� ���
// 4. �ݿø� �ϴ� ���