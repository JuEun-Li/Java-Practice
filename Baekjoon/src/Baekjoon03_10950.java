
/*입력
	첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

 	출력
	각 테스트 케이스마다 A+B를 출력한다.*/

import java.util.Scanner;

public class Baekjoon03_10950 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();

			if ((0 > A) && (A > 10))
				break;

			int B = scanner.nextInt();

			if ((0 > B) && (B > 10))
				break;

			sum = A + B;
			System.out.println(sum);
		}
		scanner.close();
	}
}