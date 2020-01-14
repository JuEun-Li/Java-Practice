import java.util.InputMismatchException;
import java.util.Scanner;

//try,catch를 이용한 예외처리
public class Multiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int mul;
		System.out.println("곱하고자하는 두 수 입력");
		while (true) {
			try {
				num1 = scanner.nextInt();
				num2 = scanner.nextInt();
				mul = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + mul);
				break;
			} catch (InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();//scanner로 입력받은 내용들 초기화
			}

		}
		scanner.close();
	}
}