import java.util.Scanner;

// �迭 a�� ��� �߿��� ���� x�� ��� ����� �ε����� �տ������� ������� �����ؼ� ��ȯ�ϴ� arraySrchIdx�޼ҵ带 �ۼ�����.
public class Problem07_23 {
	static int arraySrchIdx(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				return i;
		}
		return;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ��: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scanner.nextInt();
		}

		System.out.print("Ž���� ��: ");
		int x = scanner.nextInt();
	}

}
