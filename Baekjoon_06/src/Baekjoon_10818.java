import java.util.Scanner;

public class Baekjoon_10818 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 정수의 개수
		int[] a = new int[n];

		int max_a = 0;
		int min_a = 99999;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();

			if (a[i] > max_a) {
				max_a = a[i];
			}
			if (a[i] < min_a)
				min_a = a[i];
		}
		scanner.close();

		System.out.print(min_a + " " + max_a);
	}

}
// [틀렸던 부분]
// max값, min값을 처음부터 초기화 시키지 않아서 코드가 불필요하게 길어졌다.
// min값을 따로 구하지 않은 채 a[n-1]값을 min값으로 프린트 하려했다.
// 코드가 간락해질 수는 있으나 훈련을 위해 max, min값 모두 구해보는 것이 좋을 것 같았다.

// [해결해야할점]
// for문에서 배열 하나하나 입력받고 검사하다보니 수행시간이 너무나 길어졌다.
// BufferedReader 클래스를 이용하는 연습을 해보자.