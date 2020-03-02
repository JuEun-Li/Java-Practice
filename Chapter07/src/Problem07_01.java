import java.util.Scanner;
import java.util.Vector;

public class Problem07_01 {

	public static void printBig(Vector<Integer> v) {
		//벡터 v의 정수중 가장 큰 수 판별하여 출력하기
		int big = v.get(0); // 맨처음에 들어오는 수가 가장 큰 수
		for (int i = 1; i < v.size(); i++) {
			if (big < v.get(i)) // i가 더 크면
				big = v.get(i); // i로 교체
		}

		System.out.println("가장 큰 수는" + big);
	}

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수(-1이 입력될 때까지)>>");
		while (true) {
			int number = scanner.nextInt();
			if (number == (-1))
				break;

			v.add(number); // 수를 저장
		}

		if (v.size() == 0) {
			System.out.println("수가 하나도 없음");
			scanner.close();
			return;
		}
		printBig(v); // 바로 선언 가능
		scanner.close();
	}
}
