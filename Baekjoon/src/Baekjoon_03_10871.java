// ���� N���� �̷���� ���� A�� ���� X�� �־�����. 
// �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �������� �����Ͽ� ����Ѵ�.

import java.util.Scanner;

public class Baekjoon_03_10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // ���� ����
		int X = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			if(num < 1 && num > 10000)
				break;
			
			if (num < X)
				System.out.print(num + " ");
		}
		scanner.close();

	}

}
