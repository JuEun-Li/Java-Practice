import java.util.Scanner;

// 중간 값을 구하는 메소드
class B {
	static int mid(int a, int b, int c) {
		int[] arr = { a, b, c };

		if (a >= b && a <= c)
			arr[1] = a; // b a c

		if (b >= a && b <= c)
			arr[1] = b; // a b c

		if (c >= a && c <= b)
			arr[1] = c; // a c b

		return arr[1]; // 배열의 중간
	}
}

public class Problem07_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("세 정수를 입력하시오 >>");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("세 수중 중간 값은 : " + B.mid(a, b, c) + "입니다.");
		scanner.close();
	}

}
