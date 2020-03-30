import java.util.Scanner;

// �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�.
// �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Baekjoon_3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[10];
		int[] remainder = new int[42];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			remainder[a[j] % 42] = remainder[a[j] % 42] + 1;
		} // ������ �� ��ġ�� ������ ������ ����
		for (int j = 0; j < remainder.length; j++) {
			if (remainder[j] != 0)
				count = count + 1;
		} // �迭�� ���� �Ǿ��ִ� ���� ���� ��� ī����
		System.out.println(count);
		scanner.close();
	}

}
// [����� ��]
// ������ ������ ��� ī���� �� ���ΰ�?

// [�õ��ߴ����]
// 1. �������� ������ �迭�� ���̸�ŭ �ݺ����� ���� ��, �迭�� ���� �ٸ� ������ ī����.
// 2. remainder[] �迭�� ������ ����ġ�� ������ ���� ����. �迭���� 0�� �ƴ� ��� ī����
// 		** ������ �� ��ġ�� ������ ���� �����߱� ������ ���� �ߺ� �Ǹ� ī���� ���� �ʴ´�.

// [��������]
// 42�� ���� ���������� 42�����ӿ��� �ұ��ϰ� �迭�� 10���� �����߱⶧��.