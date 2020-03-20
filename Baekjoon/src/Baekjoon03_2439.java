import java.util.Scanner;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 오른쪽을 기준으로 정렬한 별을 출력하시오.

public class Baekjoon03_2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; i >= 1; i--) { // i는 5부터
			for (int j = 1; j <= N; j++) { // j는 1부터
				// j가 i보다 작을 때 공백처리
				if (j < i) 
					System.out.print(" ");
				
				// j가 i보다 클 때 *출력
				if (j >= i) 
					System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();
	}

}

// i값과 j값을 종이에 써봄으로서 반복문 작동 과정을 머릿속에서 돌려보면 더욱 쉽다.