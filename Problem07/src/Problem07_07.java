import java.util.Scanner;
// ���� c�� n�� ǥ���ϴ� putChar �޼ҵ�� �� �޼ҵ带 ���ο��� ȣ���ؼ� ����"*"�� n�� �������� ǥ���ϴ� putStart�޼ҵ� �ۼ�

class Star {
	static void putChar(char c, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		} // ������ ��� ����
	}

	static void putStart(int n) {
		putChar('*', n);
	} // ������ ��� ����

}

public class Problem07_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ������ ����Ͻðڽ��ϱ�");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			Star.putStart(i);
			System.out.println();
		}

		scanner.close();

	}

}
