import java.util.Scanner;

// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
// �������� �������� ������ ���� ����Ͻÿ�.

public class Baekjoon03_2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = N; i >= 1; i--) { // i�� 5����
			for (int j = 1; j <= N; j++) { // j�� 1����
				// j�� i���� ���� �� ����ó��
				if (j < i) 
					System.out.print(" ");
				
				// j�� i���� Ŭ �� *���
				if (j >= i) 
					System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();
	}

}

// i���� j���� ���̿� �ẽ���μ� �ݺ��� �۵� ������ �Ӹ��ӿ��� �������� ���� ����.