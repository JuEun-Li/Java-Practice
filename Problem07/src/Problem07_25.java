import java.util.Scanner;

// 배열 a에서 요소 a[n]부터 n개의 요소를 삭제하는 메소드를 작성하자. 
public class Problem07_25 {
	static int[] arrayRmvOfN(int[]a, int del_st, int del_end) {
		for(int i = 0; i < a.length; i++) {
			
		}
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

		System.out.print("삭제를 시작할 인덱스: ");
		int del_st = scanner.nextInt();

		System.out.print("삭제할 요소의 게수: ");
		int del_end = scanner.nextInt();
	}

}
