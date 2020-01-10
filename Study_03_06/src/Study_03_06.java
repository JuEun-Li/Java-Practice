import java.util.Scanner;

// 배열을 이용하여 금액권 갯수 카운트 하기

public class Study_03_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100 };
		int price;

		System.out.println("금액을 입력하십시오");
		price = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d원 짜리: %d개", unit[i], price / unit[i]);
			price = price - (unit[i] * (price / unit[i]));
		}
		scanner.close();
	}

}
