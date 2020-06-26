import java.util.Scanner;

// 배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로 저장해서 반환하는 arraySrchIdx메소드를 작성하자.
public class Problem07_23 {
	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				count++;
		}

		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i++) {
			if (a[i] == x)
				c[count--] = i;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요소 수: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scanner.nextInt();
		}

		System.out.print("탐색할 값: ");
		int x = scanner.nextInt();

		int[] b = arraySrchIdx(a, x);
		System.out.println("일치하는 요소의 인덱스는");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		scanner.close();
	}

}
