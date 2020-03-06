import java.util.Scanner;
import java.util.Vector;

public class Problem07_04 {

	public static void main(String[] args) {
		Vector<Integer> mm = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("강수량 입력 (0입력시 종료) >> ");
			int pre = scanner.nextInt();
			if (pre == 0)
				break;

			mm.add(pre); // mm에 강수량 추가
			int sum = 0;
			
			for (int i = 0; i < mm.size(); i++) {
				System.out.print(mm.get(i) + " "); // index i 출력
				sum += mm.get(i); // 합계는 i번째 값들을 더한 것.
			}

			System.out.println("현재 평균은: " + sum / mm.size());
		}
		scanner.close();
	}
}
// sum값은 while문 안쪽에다 선언하지 않으면 오류가 뜬다.
// 스택의 값들을 확인하고 싶을 땐 get() 메소드를 사용한다.