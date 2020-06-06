import java.util.Scanner;

// 위치 n에 삽입할 값을 넣는 메소드를 작성하자.
// 삽입할 위치 뒤쪽 인덱스 값들은 한 칸씩 뒤로 밀려나게된다. 
public class Problem07_20 {
	static void aryIns(int[] a, int del_n, int add_n) {
		for (int i = a.length - 1; i > del_n; i--) {
			a[i] = a[i - 1];
			a[del_n] = add_n;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("요소 수를 입력하시오: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = scanner.nextInt();
		} // 배열값 채워넣기( 배열의 크기보다 1 작게)

		System.out.print("삽입할 요소의 인덱스: ");
		int del_n = scanner.nextInt();

		System.out.print("삽입할 요소의 값: ");
		int add_n = scanner.nextInt();

		aryIns(a, del_n, add_n);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}

		scanner.close();
	}

}
