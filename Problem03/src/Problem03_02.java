import java.util.Scanner;

//�������� �о� ���밪 ���ϱ�

public class Problem03_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		int num = scanner.nextInt();

		if (num < 0) {
			System.out.println(num + "�� ������" + -num + "�Դϴ�.");
		} else
			System.out.println(num + "�� ������" + num + "�Դϴ�.");
	}

}
