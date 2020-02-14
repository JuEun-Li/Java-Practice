import java.util.Scanner;

public class Chapter02_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오>> ");
		int a, b, c; // 삼각형의 변 a,b,c

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a + b > c)
			System.out.println("삼각형이 됩니다.");
		else if (b + c > a)
			System.out.println("삼각형이 됩니다.");
		else if (a + c > b)
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 되지 않습니다.");

		scanner.close();
	}

	
	// 삼각형 조건 다시
}
