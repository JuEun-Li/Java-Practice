import java.util.Scanner;

// �迭 a�� ����߿��� �ּڰ��� ���ϴ� minOf�޼ҵ带 �����ϱ�
public class Problem07_16 {
	static int minOf(int[] a) {
		int min = 99999;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ ������ �Է��Ͻÿ�>> ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + "��° ������ �Է��Ͻÿ�: ");
			a[i] = scanner.nextInt();
		}

		System.out.println("�ּҰ��� = " + minOf(a));
		scanner.close();
	}

}
