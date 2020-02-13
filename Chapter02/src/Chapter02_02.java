import java.util.Scanner;

public class Chapter02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.println("2자리 정수 입력(10~99)>> ");
		num = scanner.nextInt();

		int num1 = num / 10;
		int num2 = num % 10;

		if (num1 == num2)
			System.out.println("YES! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("NO! 다릅니다.");

		scanner.close();
	}

}
