// 세 수 중에서 두 번째로 큰 수 출력하기.

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_pb_10817 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] a = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = scanner.nextInt();
		}

		Arrays.sort(a);

		System.out.println(a[1]);
		scanner.close();
	}

}
/*
 * import java.util.Scanner;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); int sec_num = 0;
 * 
 * int a = scanner.nextInt(); int b = scanner.nextInt(); int c =
 * scanner.nextInt();
 * 
 * if (a <= b && a >= c) sec_num = a; if (b <= a && b >= c) sec_num = b; if (c
 * <= b && c >= a) sec_num = c;
 * 
 * System.out.println(sec_num); scanner.close(); }
 * 
 * }
 */
