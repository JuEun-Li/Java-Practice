import java.util.InputMismatchException;
import java.util.Scanner;

//try,catch�� �̿��� ����ó��
public class Multiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int mul;
		System.out.println("���ϰ����ϴ� �� �� �Է�");
		while (true) {
			try {
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				mul = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + mul);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();//scanner�� �Է¹��� ����� �ʱ�ȭ
			}

		}
		scanner.close();
	}
}