import java.util.Scanner;

// �迭 a�� ��� �߿��� ���� x�� ��� ����� �ε����� �տ������� ������� �����ؼ� ��ȯ�ϴ� arraySrchIdx�޼ҵ带 �ۼ�����.
public class Problem07_23 {
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				count++;
		}

		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i++) {
			if (a[i] == x)
				c[count--] = i;
		}
		return c;
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

		int[] b = arraySrchIdx(a, x);
		System.out.println("��ġ�ϴ� ����� �ε�����");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		scanner.close();
	}

}
