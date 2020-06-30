import java.util.Scanner;

// 배열 a에서 요소 a[idx]를 삭제한 배열을 반환하는 arrayRmvOf를 작성하자.
public class Problem07_24 {
	static void arrayRmvOf(int[] a, int del) {
		
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
	}

}
