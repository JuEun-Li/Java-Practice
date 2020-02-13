import java.util.Scanner;

public class Chapter02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오>> ");

		int bill = scanner.nextInt();

		int won50000 = bill / 50000;
		bill = bill % 50000;
		System.out.println("50000원권: " + won50000 + "개");

		int won10000 = bill / 10000;
		bill = bill % 10000;
		System.out.println("10000원권: " + won10000 + "개");

		int won5000 = bill / 5000;
		bill = bill % 5000;
		System.out.println("5000원권: " + won5000 + "개");

		int won1000 = bill / 1000;
		bill = bill % 1000;
		System.out.println("1000원권: " + won1000 + "개");

		int won500 = bill / 500;
		bill = bill % 500;
		System.out.println("500원권: " + won500 + "개");

		int won100 = bill / 100;
		bill = bill % 100;
		System.out.println("100원권: " + won100 + "개");
	}

}
