import java.util.Scanner;

public class Baekjoon_11720 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String sum = scanner.next();
		int result = 0;
		if (!((1 <= a) && (a <= 100))) {
			System.exit(0);
		}
		for (int i = 0; i < a; i++) {
			result += (sum.charAt(i) - '0');
		}
		System.out.println(result);
	}
}