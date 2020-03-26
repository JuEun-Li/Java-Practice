import java.util.Scanner;

public class Baekjoon_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // ������ ����
		int[] a = new int[n];

		int max_a = 0;
		int min_a = 99999;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();

			if (a[i] > max_a) {
				max_a = a[i];
			}
			if (a[i] < min_a)
				min_a = a[i];
		}
		scanner.close();

		System.out.print(min_a + " " + max_a);
	}

}
// [Ʋ�ȴ� �κ�]
// max��, min���� ó������ �ʱ�ȭ ��Ű�� �ʾƼ� �ڵ尡 ���ʿ��ϰ� �������.
// min���� ���� ������ ���� ä a[n-1]���� min������ ����Ʈ �Ϸ��ߴ�.
// �ڵ尡 �������� ���� ������ �Ʒ��� ���� max, min�� ��� ���غ��� ���� ���� �� ���Ҵ�.

// [�ذ��ؾ�����]
// for������ �迭 �ϳ��ϳ� �Է¹ް� �˻��ϴٺ��� ����ð��� �ʹ��� �������.
// BufferedReader Ŭ������ �̿��ϴ� ������ �غ���.