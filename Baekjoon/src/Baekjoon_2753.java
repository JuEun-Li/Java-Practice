
/* ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �� �̴�.
	�������, 2012���� 4�� ����� ����������, 1900���� 4�� ���������, 100�� ����̱� ������ ������ �ƴϴ�.
	������, 2000���� 400�� ����̱� ������ �����̴�.

	ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.

	ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.*/
import java.util.Scanner;

public class Baekjoon_2753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(1);
		else
			System.out.println(0);
	}
}
