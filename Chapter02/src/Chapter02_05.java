import java.util.Scanner;

public class Chapter02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�>> ");
		int a, b, c; // �ﰢ���� �� a,b,c

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a + b > c)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if (b + c > a)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if (a + c > b)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");

		scanner.close();
	}

	
	// �ﰢ�� ���� �ٽ�
}
