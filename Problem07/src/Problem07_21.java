import java.util.Scanner;

// �迭 a�� b�� ��ü ��ڰ��� ��ȯ�ϴ� aryExchng�޼ҵ带 �ۼ�����.
// �� �迭�� ��� ���� ���� �ʴٸ� ���� ���� �迭 ���� ���߾� ��ȯ�� ��.

public class Problem07_21 {
	static void aryExchng(int[] a, int[] b) {
		int[] t = new int[a.length + b.length];

		if (a.length < b.length) { // a�迭�� ���̰� �� ª�� ��
			for (int i = 0; i < a.length; i++) {
				t[i] = a[i];
				a[i] = b[i];
				b[i] = t[i];
			}

			System.out.println("�迭 a�� b�� ��ü ��Ҹ� �����Ͽ����ϴ�.");

			for (int i = 0; i < a.length; i++) {
				System.out.println("a[" + i + "] = " + a[i]);
			}

			for (int i = 0; i < b.length; i++) {
				System.out.println("b[" + i + "] = " + b[i]);
			}
		}

		else
			for (int i = 0; i < b.length; i++) {
				t[i] = a[i];
				a[i] = b[i];
				b[i] = t[i];
			}

		System.out.println("�迭 a�� b�� ��ü ��Ҹ� �����Ͽ����ϴ�.");

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�迭 a�� ��� ��: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = scanner.nextInt();
		} // �迭 a�� �� ä��

		System.out.println("�迭 b�� ��� ��: ");
		int m = scanner.nextInt();
		int[] b = new int[m];

		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] =");
			b[i] = scanner.nextInt();
		} // �迭 b�� �� ä��

		aryExchng(a, b);
	}

}
