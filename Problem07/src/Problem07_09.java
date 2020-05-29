import java.util.Scanner;
//정숫값 입력시 그 값을 거꾸로 출력하는 readPlusInt메소드 작성하기.

public class Problem07_09 {

	public static void readPlusInt(int n) {
		while (n > 0) {
			n = n % 10;
			System.out.print(n);
			n = n / 10;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하시오>> ");
		int n = scanner.nextInt();
		/*
		 * while (true) {
		 * 
		 * if (n == 0 || n < 0) { System.out.println("다시 입력하시오"); break; } }
		 */
		readPlusInt(n);
		
	}

}
