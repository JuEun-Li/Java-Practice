import java.util.Scanner;

public class Baekjoon03_2739 {

	/*
	 * 2 * 1 = 2 2 * 2 = 4 2 * 3 = 6 2 * 4 = 8 2 * 5 = 10 2 * 6 = 12 2 * 7 = 14 2 *
	 * 8 = 16 2 * 9 = 18 N이 2일 때, 이렇게 출력하자.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int mul = 0;

		for (int i = 1; i <= 9; i++) {
			mul = N * i;
			System.out.println(N + " * " + i + " = " + mul);
		}
		scanner.close();
	}
}