import java.util.Scanner;

// �迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž���ϴ� �޼ҵ� linearsearch, linearSearchR
// �� Ű�� ���� ���� ������ ��Ұ� �������� ��� linearsearch�� ���� �տ� ��ġ�� ���Ҹ�, linearSearchR�� ���� �ڿ� ��ġ�� ��Ҹ� ã�� ��.
public class Problem07_17 {
	static void linearSearch(int[] a) {

	}

	static void linerSearchR(int[] a) {

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
	}

}
