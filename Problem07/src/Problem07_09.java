import java.util.Scanner;
//������ �Է½� �� ���� �Ųٷ� ����ϴ� readPlusInt�޼ҵ� �ۼ��ϱ�.

public class Problem07_09 {

	public static void readPlusInt(int n) {
		while (n > 0) {
			n = n % 10;
			System.out.print(n);
			n = n / 10;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��Ͻÿ�>> ");
		int n = scanner.nextInt();
		/*
		 * while (true) {
		 * 
		 * if (n == 0 || n < 0) { System.out.println("�ٽ� �Է��Ͻÿ�"); break; } }
		 */
		readPlusInt(n);
		
	}

}
