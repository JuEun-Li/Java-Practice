import java.util.Scanner;

//두 개의 정수값을 읽어 두 정수 사이에 있는 정수들을 작은 수부터 큰 수까지 나열하는 프로그램
public class Problem04_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("2개의 정수를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a < b) {
			for (int i = 0; i < b; i++) {
				if (i > a)
					System.out.println(i);
			}
		} else if (b < a) {
			for (int j = 0; j < a; j++) {
				if (j > b)
					System.out.println(j);
			}
		}
		scanner.close();
	}

}
