import java.util.Scanner;

// �迭�� �̿��Ͽ� �ݾױ� ���� ī��Ʈ �ϱ�

public class Study_03_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100 };
		int price;

		System.out.println("�ݾ��� �Է��Ͻʽÿ�");
		price = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d�� ¥��: %d��", unit[i], price / unit[i]);
			price = price - (unit[i] * (price / unit[i]));
		}
		scanner.close();
	}

}
