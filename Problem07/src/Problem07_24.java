import java.util.Scanner;

// �迭 a���� ��� a[idx]�� ������ �迭�� ��ȯ�ϴ� arrayRmvOf�� �ۼ�����.
public class Problem07_24 {
	static int[] arrayRmvOf(int[] a, int del) {
		for (int i = del; i < a.length; i++) {
			a[i - 1] = a[i];
		}

		int[] c = new int[a.length - 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		return c;
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

		System.out.print("������ ����� �ε���: ");
		int del = scanner.nextInt();
		int[] b = arrayRmvOf(a, del);

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		scanner.close();
	}

}
