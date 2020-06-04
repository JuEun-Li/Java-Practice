import java.util.Scanner;

// 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 메소드 linearsearch, linearSearchR
// 단 키와 같은 값을 가지는 요소가 여러개일 경우 linearsearch는 가장 앞에 위치한 원소를, linearSearchR은 가장 뒤에 위치한 요소를 찾을 것.
public class Problem07_17 {
	static int linearSearch(int[] a, int num) {
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				n = i;
				return n;
			}
		}
		return -1; // 탐색실패
	}

	static int linearSearchR(int[] a, int num) {
		int n = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (num == a[i]) {
				n = i;
				return n;
			}
		}
		return -1;
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

		System.out.println("찾는 값");
		int num = scanner.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (num == a[i])
				count++;
		}
		if (count >= 2) {// 동일한 값이 2개 이상일 경우
			System.out.println("여러 개의 값이 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 a[" + linearSearch(a, num) + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 a[" + linearSearchR(a, num) + "]에 있습니다.");
		} else
			System.out.println("찾는 값: " + linearSearch(a, num));

		scanner.close();
	}
}
