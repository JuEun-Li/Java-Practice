import java.util.Scanner;

// 배열 a의 요소 중에서 값이 x인 모든 요소의 인덱스를 앞에서부터 순서대로 저장해서 반환하는 arraySrchIdx메소드를 작성하자.
public class Problem07_23 {

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
	}

}
