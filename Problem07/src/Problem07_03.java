import java.util.Scanner;

// �߰� ���� ���ϴ� �޼ҵ�
class B {
	static int mid(int a, int b, int c) {
		int[] arr = { a, b, c };

		if (a >= b && a <= c)
			arr[1] = a; // b a c

		if (b >= a && b <= c)
			arr[1] = b; // a b c

		if (c >= a && c <= b)
			arr[1] = c; // a c b

		return arr[1]; // �迭�� �߰�
	}
}

public class Problem07_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ������ �Է��Ͻÿ� >>");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("�� ���� �߰� ���� : " + B.mid(a, b, c) + "�Դϴ�.");
		scanner.close();
	}

}
