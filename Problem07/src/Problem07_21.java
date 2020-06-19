import java.util.Scanner;

// 배열 a와 b의 전체 요솟값을 교환하는 aryExchng메소드를 작성하자.
// 두 배열의 요소 수가 같지 않다면 작은 쪽의 배열 수에 맞추어 교환할 것.

public class Problem07_21 {
	static void aryExchng(int[] a, int[] b) {
		int[] t = new int[a.length + b.length];

		if (a.length < b.length) { // a배열의 길이가 더 짧을 때
			for (int i = 0; i < a.length; i++) {
				t[i] = a[i];
				a[i] = b[i];
				b[i] = t[i];
			}

			System.out.println("배열 a와 b의 전체 요소를 변경하였습니다.");

			for (int i = 0; i < a.length; i++) {
				System.out.println("a[" + i + "] = " + a[i]);
			}

			for (int i = 0; i < b.length; i++) {
				System.out.println("b[" + i + "] = " + b[i]);
			}
		}

		else
			for (int i = 0; i < b.length; i++) {
				t[i] = a[i];
				a[i] = b[i];
				b[i] = t[i];
			}

		System.out.println("배열 a와 b의 전체 요소를 변경하였습니다.");

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열 a의 요소 수: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = scanner.nextInt();
		} // 배열 a에 값 채움

		System.out.println("배열 b의 요소 수: ");
		int m = scanner.nextInt();
		int[] b = new int[m];

		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] =");
			b[i] = scanner.nextInt();
		} // 배열 b에 값 채움

		aryExchng(a, b);
	}

}
