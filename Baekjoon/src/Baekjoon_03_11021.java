// ������� �� �� ���ڰ� ����ϱ�
import java.util.Scanner;

public class Baekjoon_03_11021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int sum = 0;

		for (int i = 1; i <= T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();

			sum = A + B;

			System.out.println("Case #" + i + ": " + sum);
		}
		scanner.close();
	}

}
