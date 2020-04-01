import java.util.Scanner;

public class Baekjoon_1546_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // ���� �� ������ ����
		float[] a = new float[n]; // ���� ������ŭ �迭 ����
		int m = 0; // �ִ�
		float avg = 0;

		for (int i = 0; i < n; i++) {
			int score = scanner.nextInt();
			a[i] = score; // ������ �迭�� ���� ��
			if (score > m)
				m = score;
		} // ������ �迭�� �ְ�, �ִ� ���ϱ�
		scanner.close();

		for (int i = 0; i < n; i++) {
			a[i] = (a[i] / m) * 100;
			avg = avg + a[i];
		} // ������ score / m * 100���� ��ģ �� ��ģ ���� ���� ���ϱ�
		System.out.println(avg / n);
	}

}


// [Ʋ�ȴ� �κ�]
// �迭 ���� ������ �������� (���� / ����) �� �迭���� ��� 0�� �Ǵ� ����.

// [�ذ� ���]
// 1. �迭�� float������ ����,
// 2. ��հ��� ������ ������ float���� ����.
// -> ������ int�� �����ϴ� ������ ������.