import java.util.Scanner;

public class Baekjoon_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		int max = 0;
		int score;
		
		for (int i = 0; i < n; ++i) {
			score = sc.nextInt();
			total += score;
			if (score > max) {
				max = score;
			}
		}
		sc.close();

		double avg = 0;
		avg = 100.0 * total / max / n;
		System.out.printf("%.2f", avg);
	}
}
