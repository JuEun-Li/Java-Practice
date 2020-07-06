import java.util.Scanner;

// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

public class Baekjoon_8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] result = new int[n];
		
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			String a = scanner.nextLine();
			int score = 0;
			
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == 'O') {
					score = score + 1;
					result[i] = result[i] + score;
				} else
					score = 0;
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(result[i]);

		scanner.close();
	}

}

// [어려웠던 부분]
// 답이 연속으로 O일 때 어떻게 점수를 누적 시킬 것인가?
// a[i] 와 a[i-1]을 비교하여 값이 같으면 점수를 누적 시켰으나, 오류

// [오류 이유]
// 1. a[i]에 퀴즈의 결과 한 줄을 통째로 저장했기 때문.
// 2. charAt을 사용하여 비교할 때는 " " 대신 ' '을 사용해야한다.

// [해결방법]
// charAt()을 사용하여 문자 하나하나에 접근한다.