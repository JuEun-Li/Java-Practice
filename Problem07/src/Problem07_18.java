import java.util.Scanner;

// 배열 a로부터 요소 a[idx]를 삭제하는 aryRmv메소드를 작성하자.
// 요소 삭제 후 뒤에 있는 요소를 한칸씩 당기며 마지막 인덱스에는 당겨진 인덱스 값이 그대로 있어야한다.
public class Problem07_18 {
	static void aryRmv(int[] a, int del_num) {
		for (int i = del_num; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요소 수를 입력하시오: ");
		int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = scanner.nextInt();
		}

		System.out.println("삭제할 요소의 인덱스를 입력하시오: ");
		int del_num = scanner.nextInt();
		aryRmv(a, del_num);

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

		scanner.close();
	}

}

// 배열 a[i]에 a[i + 1]값을 넣어주게되면 자동적으로 a[i]의 값은 대체된다.(삭제된다)
