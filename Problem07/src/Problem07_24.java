import java.util.Scanner;

// �迭 a���� ��� a[idx]�� ������ �迭�� ��ȯ�ϴ� arrayRmvOf�� �ۼ�����.
public class Problem07_24 {
	static void arrayRmvOf(int[] a, int del) {
		
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
	}

}
