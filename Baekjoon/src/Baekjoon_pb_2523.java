import java.util.Scanner;

public class Baekjoon_pb_2523 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = 0; k < 2 * n - i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}

//[�� ���� �ʾҴ� ��]
// ���� ������ �þ�� �κ�(n��° ��)������ ����� ��������,
// ���� ������ �پ��� �κ��� ������ �� �ִ� ��Ģ�� ������ �ִ��� ���� ã�� ���ߴ�.

//[�ذ��� ����]
// i���� k���� ��� ���� ��, i�� k���� ��ȭ�� ���� ��� ���� ���̿� � ��Ģ�� �ִ��� �����غ��Ҵ�.
// ������ ����ϱ� ���� 2�� �ݺ����� ���������, �̳� ������ ���� ����� �ʿ䰡 ���ٴ� ���� ���޾Ҵ�.
// �ݺ����� �̿��� ���� ���, �����ϰ� �ڵ带 ������ �� �־���.