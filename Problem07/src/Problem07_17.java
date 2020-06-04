import java.util.Scanner;

// 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 메소드 linearsearch, linearSearchR
// 단 키와 같은 값을 가지는 요소가 여러개일 경우 linearsearch는 가장 앞에 위치한 원소를, linearSearchR은 가장 뒤에 위치한 요소를 찾을 것.
public class Problem07_17 {
	static void linearSearch(int[] a) {

	}

	static void linerSearchR(int[] a) {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("요소를 입력하시오>> ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]번째 요소의 값: ");
			a[i] = scanner.nextInt();
		}
	}

}
