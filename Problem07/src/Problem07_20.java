import java.util.Scanner;

// ��ġ n�� ������ ���� �ִ� �޼ҵ带 �ۼ�����.
// ������ ��ġ ���� �ε��� ������ �� ĭ�� �ڷ� �з����Եȴ�. 
public class Problem07_20 {
	static void aryIns(int[] a, int del_n, int add_n) {
		for (int i = a.length - 1; i > del_n; i--) {
			a[i] = a[i - 1];
			a[del_n] = add_n;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��� ���� �Է��Ͻÿ�: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scanner.nextInt();
		} // �迭�� ä���ֱ�( �迭�� ũ�⺸�� 1 �۰�)

		System.out.print("������ ����� �ε���: ");
		int del_n = scanner.nextInt();

		System.out.print("������ ����� ��: ");
		int add_n = scanner.nextInt();

		aryIns(a, del_n, add_n);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}

		scanner.close();
	}

}
