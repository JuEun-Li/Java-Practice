import java.util.Scanner;

//3개의 값중 중앙값 찾기
public class Problem03_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 수 중 중간값을 찾으시오");
		int mid = 0;

		System.out.println("정수 1>> ");
		int a = scanner.nextInt();
		System.out.println("정수 2>> ");
		int b = scanner.nextInt();
		System.out.println("정수 3>> ");
		int c = scanner.nextInt();

		if (a > b && a < c)
			mid = a;

		else if (a > c && a < b)
			mid = a;

		else if (a < b && b < c)
			mid = b;

		else if (c < b && b < a)
			mid = b;

		else if (a < c && c < b)
			mid = c;

		else if (b < c && c < a)
			mid = c;

		System.out.println("중간 값은: " + mid);
	}

}
