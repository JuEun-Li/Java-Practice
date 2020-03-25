import java.util.Scanner;

public class Baekjoon_pb_2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 0; j < i; j++)
					System.out.print("*");
				System.out.println();
			} else {
				for (int j = 0; j < 2 * n - i; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}