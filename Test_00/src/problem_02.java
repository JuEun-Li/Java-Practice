import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 7 segment display에서는 10가지 숫자가 표현 가능하다.
// 빨간 획과 검은 획 2개 존재.
// 빨간 획 + 검은 획 최대 수는 7.
// 철수의 계산기는 동시에 N개 이하의 획만 전원을 켤 수 있다.
//철수의 계산기로 표현할 수 있는 가장 큰 10진수는?
*/

// N이 입력으로 주어질 때
// 계산기로 표시할 수 있는 가장 큰 정수를 출력해보자.
// N은 2이상 1000이하의 정수다.

// 계산기로 표시할 수 있는 가장 큰 정수는 정수형 변수로 표현할 수 있는 범위보다 훨씬 커질 수 있다.

public class problem_02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			n = Integer.parseInt(st.nextToken());

			if (n >= 2 && n <= 1000) {
				break;
			}
		}
		// N을 입력 받음.

		String num = "";

		// 만약 n이 홀수라면
		if (n % 2 == 1) {
			num = num + "7";

			for (int i = 0; i < ((n - 3) / 2); i++) {
				num = num + "1";
			}
		}
		// n이 짝수 라면
		else {
			for (int i = 0; i < (n / 2); i++) {
				num = num + "1";
			}

		}
		System.out.println(Long.parseLong(num));
	}
}