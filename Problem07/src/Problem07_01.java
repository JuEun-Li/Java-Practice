// x가 음수이면 -1 반환, 정수일 때 1반환

import java.util.Scanner;

class A1 {
	public static int A2(int n) {
		if (n < 0)
			return -1;
		else
			return 1;
	}
}

public class Problem07_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		System.out.println("x는 " + A1.A2(x) + "입니다.");
		scanner.close();
	}

}
