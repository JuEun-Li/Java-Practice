import java.util.Scanner;

public class Chapter02_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.println("2�ڸ� ���� �Է�(10~99)>> ");
		num = scanner.nextInt();

		int num1 = num / 10;
		int num2 = num % 10;

		if (num1 == num2)
			System.out.println("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("NO! �ٸ��ϴ�.");

		scanner.close();
	}

}
