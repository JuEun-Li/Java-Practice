import java.util.Scanner;

//�� ���� �������� �о� �� ���� ���̿� �ִ� �������� ���� ������ ū ������ �����ϴ� ���α׷�
public class Problem04_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("2���� ������ �Է��Ͻÿ�>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a < b) {
			for (int i = 0; i < b; i++) {
				if (i > a)
					System.out.println(i);
			}
		} else if (b < a) {
			for (int j = 0; j < a; j++) {
				if (j > b)
					System.out.println(j);
			}
		}
		scanner.close();
	}

}
