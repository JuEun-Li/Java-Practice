import java.util.Scanner;

public class Baekjoon_11654 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		scanner.close();
		
		int b = (int)a;
		System.out.println(b);
	}

}

// [����� ���ƾ��� ��]
// 1. ���� �ϳ��� �Է¹��� �� char���� ����ϱ�.
// 2. char���� ��ĳ�ʷ� �Է¹��� �� charAt(0)�� �߰����ֱ�.
// 3. char���� int�� ������ ���� ���� int�� ĳ���� �� �־��ֱ�.