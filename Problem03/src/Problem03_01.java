import java.util.Scanner;

//Ű�����  �Է��� �������� ���̸� "�� ���� ���� ���Դϴ�." ��� ǥ���ϴ� ���α׷�

public class Problem03_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ����?");
		int num = scanner.nextInt();

		if (num < 0)
			System.out.println("�� ���� ���� ���Դϴ�.");
		else
			System.out.println("��� �Դϴ�.");

		scanner.close();
	}

}
