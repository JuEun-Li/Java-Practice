import java.util.Scanner;

public class Baekjoon_pb_2523 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				for (int k = 0; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = 0; k < 2 * n - i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}

//[잘 되지 않았던 점]
// 별의 갯수가 늘어나는 부분(n번째 행)까지는 출력이 쉬웠으나,
// 별의 갯수가 줄어드는 부분을 제어할 수 있는 규칙이 무엇이 있는지 쉽게 찾지 못했다.

//[해결을 위해]
// i값과 k값을 모두 적은 후, i와 k값의 변화와 별의 출력 갯수 사이에 어떤 규칙이 있는지 생각해보았다.
// 공백을 출력하기 위해 2중 반복문을 사용했으나, 이내 공백은 굳이 출력할 필요가 없다는 것을 깨달았다.
// 반복문을 이용해 별만 출력, 간단하게 코드를 구현할 수 있었다.