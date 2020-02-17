import java.util.Scanner;

// 약수 구하기
public class Problem03_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오>> ");
		int num = scanner.nextInt();

		System.out.println("약수는? >>");
		int a = scanner.nextInt();
		if (num % a == 0)
			System.out.println("약수입니다.");
		else
			System.out.println("약수가 아닙니다.");

	}

}
