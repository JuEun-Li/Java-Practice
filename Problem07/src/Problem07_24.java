import java.util.Scanner;

// 배열 a에서 요소 a[idx]를 삭제한 배열을 반환하는 arrayRmvOf를 작성하자.
public class Problem07_24 {
	static int[] arrayRmvOf(int[] a, int del) {
		for (int i = del; i < a.length; i++) {
			a[i - 1] = a[i];
		}

		int[] c = new int[a.length - 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = a[i];
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요소 수: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}

		System.out.print("삭제할 요소의 인덱스: ");
		int del = scanner.nextInt();
		int[] b = arrayRmvOf(a, del);

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		scanner.close();
	}

}
