import java.util.Scanner;

public class Chapter02_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scanner.nextInt();
		float dollar = won / 1200;

		System.out.println(won + "����" + dollar + "$�Դϴ�.");
		scanner.close();
	}

}
