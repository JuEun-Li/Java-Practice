import java.util.Scanner;

public class Chapter02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3�� �Է�>> ");
		int a, b, c;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a <= b && b <= c)
			System.out.println("�߰� ����:" + b);

		else if (b <= a && a <= c)
			System.out.println("�߰� ����" + a);

		else
			System.out.println("�߰� ����" + c);

		scanner.close();
	}

}
