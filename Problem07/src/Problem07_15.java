import java.util.Scanner;

// �迭 a�� ���� ��� ����� ���� ���ϴ� sumof() �޼ҵ带 �ۼ�����.
public class Problem07_15 {

	static int SumOf(int[] n) {
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��� ��>> ");
		int n = scanner.nextInt();
		int[] num = new int[n]; // n�� ��ŭ �迭 ����

		for (int i = 0; i < n; i++) {
			System.out.println("num[" + i + "] ��: ");
			num[i] = scanner.nextInt();
		}

		System.out.println("������ : " + SumOf(num));
		scanner.close();
	}

}

// �迭�� ��°�� �Ķ���ͷ� ���� �����ϴ�.
// �޼ҵ忡���� sum���� ����ϴ� ����, sum�� return���ִ� ���� �ʿ�
// ���ο����� �迭�� ����, �迭 ���� �ִ� ������ �־��ָ� �ȴ�.
