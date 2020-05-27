import java.util.Scanner;
// 문자 c를 n개 표시하는 putChar 메소드와 이 메소드를 내부에서 호출해서 문자"*"를 n개 연속으로 표시하는 putStart메소드 작성

class Star {
	static void putChar(char c, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		} // 가로행 출력 갯수
	}

	static void putStart(int n) {
		putChar('*', n);
	} // 세로행 출력 조절

}

public class Problem07_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 개행을 출력하시겠습니까");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			Star.putStart(i);
			System.out.println();
		}

		scanner.close();

	}

}
