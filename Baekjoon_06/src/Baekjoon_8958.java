import java.util.Scanner;

// "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
// ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
// OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Baekjoon_8958 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] result = new int[n];
		
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			String a = scanner.nextLine();
			int score = 0;
			
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == 'O') {
					score = score + 1;
					result[i] = result[i] + score;
				} else
					score = 0;
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(result[i]);

		scanner.close();
	}

}

// [������� �κ�]
// ���� �������� O�� �� ��� ������ ���� ��ų ���ΰ�?
// a[i] �� a[i-1]�� ���Ͽ� ���� ������ ������ ���� ��������, ����

// [���� ����]
// 1. a[i]�� ������ ��� �� ���� ��°�� �����߱� ����.
// 2. charAt�� ����Ͽ� ���� ���� " " ��� ' '�� ����ؾ��Ѵ�.

// [�ذ���]
// charAt()�� ����Ͽ� ���� �ϳ��ϳ��� �����Ѵ�.