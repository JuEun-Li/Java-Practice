import java.util.Scanner;

// �迭 a���� ��� a[n]���� n���� ��Ҹ� �����ϴ� �޼ҵ带 �ۼ�����. 
public class Problem07_25 {
	static int[] arrayRmvOfN(int[]a, int del_st, int del_end) {
		for(int i = 0; i < a.length; i++) {
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ��: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}

		System.out.print("������ ������ �ε���: ");
		int del_st = scanner.nextInt();

		System.out.print("������ ����� �Լ�: ");
		int del_end = scanner.nextInt();
	}

}
