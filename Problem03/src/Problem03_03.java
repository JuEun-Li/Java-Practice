import java.util.Scanner;

// ��� ���ϱ�
public class Problem03_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�>> ");
		int num = scanner.nextInt();

		System.out.println("�����? >>");
		int a = scanner.nextInt();
		if (num % a == 0)
			System.out.println("����Դϴ�.");
		else
			System.out.println("����� �ƴմϴ�.");

	}

}
