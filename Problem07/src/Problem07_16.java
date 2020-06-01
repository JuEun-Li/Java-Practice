import java.util.Scanner;

// 배열 a의 요소중에서 최솟값을 구하는 minOf메소드를 구현하기
public class Problem07_16 {
	static int minOf(int[] a) {
		int min = 99999;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수의 갯수를 입력하시오>> ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + "번째 정수를 입력하시오: ");
			a[i] = scanner.nextInt();
		}

		System.out.println("최소값은 = " + minOf(a));
		scanner.close();
	}

}
