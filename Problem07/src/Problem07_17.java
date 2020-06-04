import java.util.Scanner;

// �迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž���ϴ� �޼ҵ� linearsearch, linearSearchR
// �� Ű�� ���� ���� ������ ��Ұ� �������� ��� linearsearch�� ���� �տ� ��ġ�� ���Ҹ�, linearSearchR�� ���� �ڿ� ��ġ�� ��Ҹ� ã�� ��.
public class Problem07_17 {
	static int linearSearch(int[] a, int num) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				n = i;
				return n;
			}
		}
		return -1; // Ž������
	}

	static int linearSearchR(int[] a, int num) {
		int n = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (num == a[i]) {
				n = i;
				return n;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��Ҹ� �Է��Ͻÿ�>> ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]��° ����� ��: ");
			a[i] = scanner.nextInt();
		}

		System.out.println("ã�� ��");
		int num = scanner.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (num == a[i])
				count++;
		}
		if (count >= 2) {// ������ ���� 2�� �̻��� ���
			System.out.println("���� ���� ���� �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� a[" + linearSearch(a, num) + "]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ���� a[" + linearSearchR(a, num) + "]�� �ֽ��ϴ�.");
		} else
			System.out.println("ã�� ��: " + linearSearch(a, num));

		scanner.close();
	}
}
