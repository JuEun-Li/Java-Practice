import java.util.Scanner;

// ����ڷκ��� �Է¹��� ���� ������ ����ϴ� �޼ҵ� �����ϱ�.

class Season {
	static void PrintSeason(int n) {
		/*
		 * if (n == 3 || n == 4 || n == 5) return 1; // ��
		 * 
		 * if (n == 6 || n == 7 || n == 8) return 2; // ����
		 * 
		 * if (n == 9 || n == 10 || n == 11) return 3; // ����
		 * 
		 * if (n == 1 || n == 2 || n == 12) return 4; // �ܿ�
		 */

		switch (n) {

		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;// ��
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break; // ����
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");
			break; // ����
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break; // �ܿ�
		}
	}
}

public class Problem07_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� �� �Դϱ�? >>");
		int month = scanner.nextInt();
		Season.PrintSeason(month);
		System.out.println("�Դϴ�.");

		scanner.close();
	}

}
