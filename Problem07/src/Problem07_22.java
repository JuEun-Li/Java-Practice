import java.util.Scanner;

// �迭 a�� ���� �迭�� �����ؼ� ��ȯ�ϴ� arrayClone �޼ҵ带 �ۼ�����.
// �迭�� ��� ���� ���� ��� ����� ���� ���ƾ��Ѵ�.

public class Problem07_22 {
	static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ��: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}

		int[] b = arrayClone(a);
		System.out.println("�迭 a�� �����ؼ� �迭 b�� �����Ͽ����ϴ�.");

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
