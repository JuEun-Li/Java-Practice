import java.util.Scanner;

public class Study_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.println("������ �Է��Ͻʽÿ�");
		num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
