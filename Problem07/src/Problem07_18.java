import java.util.Scanner;

// �迭 a�κ��� ��� a[idx]�� �����ϴ� aryRmv�޼ҵ带 �ۼ�����.
// ��� ���� �� �ڿ� �ִ� ��Ҹ� ��ĭ�� ���� ������ �ε������� ����� �ε��� ���� �״�� �־���Ѵ�.
public class Problem07_18 {
	static void aryRmv(int[] a, int del_num) {
		for (int i = del_num; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��� ���� �Է��Ͻÿ�: ");
		int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = scanner.nextInt();
		}

		System.out.println("������ ����� �ε����� �Է��Ͻÿ�: ");
		int del_num = scanner.nextInt();
		aryRmv(a, del_num);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		scanner.close();
	}

}

// �迭 a[i]�� a[i + 1]���� �־��ְԵǸ� �ڵ������� a[i]�� ���� ��ü�ȴ�.(�����ȴ�)
