import java.util.Scanner;

// 배열 a와 같은 배열을 생성해서 반환하는 arrayClone 메소드를 작성하자.
// 배열의 요소 수가 같고 모든 요소의 값이 같아야한다.

public class Problem07_22 {
	static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
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

		int[] b = arrayClone(a);
		System.out.println("배열 a를 복사해서 배열 b를 생성하였습니다.");

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
