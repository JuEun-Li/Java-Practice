import java.util.Scanner;

public class Baekjoon_4344_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt(); // 행

		int score = 0; // 점수들
		double ave = 0; // 평균
		float count = 0; // 평균 이상인 학생 수
		float per = 0; // 평균이상 비율

		for (int i = 0; i < c; i++) {
			int n = scanner.nextInt(); // 열
			int[] a = new int[n];
			score = 0;
			count = 0;

			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				score = score + a[j];
			}
			ave = (double) score / n;

			for (int j = 0; j < n; j++) {
				if (a[j] > ave)
					count = count + 1;
			}
			per = count / n * 100;
			System.out.printf("%.3f", per);
			System.out.println(" ");
		}

		scanner.close();
	}

}

// ** 소수 셋째자리 까지 출력하려면 [ %.3f ] 를 사용하기.
// 변수 초기화를 어디서 해야하는지 연습하기.
// 형변환 형식 알아두기.