import java.util.Scanner;

// 3���� ���� ������������ ����(���� �������)
public class Problem03_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t;

		System.out.println("3���� ������ �Է��Ͻʽÿ�");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b) {
			t = a; // t�� ���� ū ��
			a = b; // a�� ���� ���� ��
			b = t; // b�� �ٽ� ���� ū ��
		}
		if (b > c) {
			t = b; // t�� �߰�
			b = c; // c�� ���� ū ��
			c = t; // a�� ���� ���� ��
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println("���� ���� ����>>" + a);
		System.out.println("2��°�� ���� ����>>" + b);
		System.out.println("���� ū ����>>" + c);
	}
}