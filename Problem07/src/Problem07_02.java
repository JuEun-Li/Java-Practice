import java.util.Scanner;

// abc�� ���� ���� �� ���ϱ�
class A {
	static int Mini(int a, int b, int c) {
		int min = 999;

		if (a < min)
			min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		return min;
	}
}

public class Problem07_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �Է��Ͻÿ�");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int m = A.Mini(a, b, c);
		System.out.println("���� ���� ���� = " + m);

		scanner.close();
	}

}
