import java.util.Scanner;

// 3개의 수를 오름차순으로 정렬(작은 순서대로)
public class Problem03_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t;

		System.out.println("3개의 정수를 입력하십시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a > b) {
			t = a; // t는 가장 큰 수
			a = b; // a가 가장 작은 수
			b = t; // b는 다시 가장 큰 수
		}
		if (b > c) {
			t = b; // t가 중간
			b = c; // c는 가장 큰 수
			c = t; // a는 가장 작은 수
		}
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		System.out.println("가장 작은 수는>>" + a);
		System.out.println("2번째로 작은 수는>>" + b);
		System.out.println("가장 큰 수는>>" + c);
	}
}