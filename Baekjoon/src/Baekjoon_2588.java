import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int num1 = A * (B % 10);
		System.out.println(num1);

		int num10 = A * (B % 100 / 10);
		System.out.println(num10);

		int num100 = A * (B / 100);
		System.out.println(num100);

		int result = (num1 + num10 * 10 + num100 * 100);
		System.out.println(result);
	}

}
