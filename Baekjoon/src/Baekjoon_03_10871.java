// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
// 공백으로 구분하여 출력한다.

import java.util.Scanner;

public class Baekjoon_03_10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // 정수 갯수
		int X = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			if(num < 1 && num > 10000)
				break;
			
			if (num < X)
				System.out.print(num + " ");
		}
		scanner.close();

	}

}
