import java.util.Scanner;

// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여
// 소수점 셋째 자리까지 출력한다.

public class Baekjoon_4344 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt(); // 행

		int score = 0;
		int ave = 0;
		float count = 0;
		float per = 0;

		for (int i = 0; i < c; i++) {
			int n = scanner.nextInt(); // 열
			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = scanner.nextInt();
				score = score + a[j];
			}
			ave = score / n;
			
			for (int j = 0; j < n; j++) {
				if (a[j] > ave)
					count = count + 1;
			}
			per = count / n * 100;
			System.out.println(per + "%");
		}

		scanner.close();
	}

}

// [잘 안 되었던 부분]
// 1. j 반복문이 끝날 때마다 값이 누적되지 않도록 초기화를 시켜주자
// 2. 비율이 이상하게 계산되는 원인
// 3. 소수 셋째 짜리까지만 출력하는 방법
// 4. 반올림 하는 방법