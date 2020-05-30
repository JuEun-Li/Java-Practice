import java.util.Scanner;

// 배열 a이 가진 모든 요소의 합을 구하는 sumof() 메소드를 작성하자.
public class Problem07_15 {

	static int SumOf(int[] n) {
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("요소 수>> ");
		int n = scanner.nextInt();
		int[] num = new int[n]; // n개 만큼 배열 생성

		for (int i = 0; i < n; i++) {
			System.out.println("num[" + i + "] 은: ");
			num[i] = scanner.nextInt();
		}

		System.out.println("총합은 : " + SumOf(num));
		scanner.close();
	}

}

// 배열을 통째로 파라미터로 지정 가능하다.
// 메소드에서는 sum값을 계산하는 과정, sum을 return해주는 과정 필요
// 메인에서는 배열을 생성, 배열 값을 넣는 과정을 넣어주면 된다.
