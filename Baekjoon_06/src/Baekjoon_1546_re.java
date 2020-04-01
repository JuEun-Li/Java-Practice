import java.util.Scanner;

public class Baekjoon_1546_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 시험 본 과목의 갯수
		float[] a = new float[n]; // 과목 갯수만큼 배열 생성
		int m = 0; // 최댓값
		float avg = 0;

		for (int i = 0; i < n; i++) {
			int score = scanner.nextInt();
			a[i] = score; // 점수를 배열에 넣은 후
			if (score > m)
				m = score;
		} // 점수를 배열에 넣고, 최댓값 구하기
		scanner.close();

		for (int i = 0; i < n; i++) {
			a[i] = (a[i] / m) * 100;
			avg = avg + a[i];
		} // 점수를 score / m * 100으로 고친 후 고친 점수 총합 구하기
		System.out.println(avg / n);
	}

}


// [틀렸던 부분]
// 배열 값을 나누는 과정에서 (정수 / 정수) 라서 배열값이 모두 0이 되는 오류.

// [해결 방안]
// 1. 배열을 float형으로 선언,
// 2. 평균값을 저장할 변수를 float으로 선언.
// -> 무조건 int로 선언하는 습관을 버리자.