import java.util.Scanner;

//두 개의 정수를 내림차순(큰 순서)으로 정렬하기
public class Problem03_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("두 정수를 입력하시오");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int max = 0, min = 0;

		if (a < b) {
			max = b;
			min = a;
		} else if (a > b) {
			max = a;
			min = b;
		} else
			System.out.println("같은 수 입니다.");

		System.out.println("내림차순 결과>>" + max, min);
		
		scanner.close();
	}

	//오류를 잡기위해 임시변수 temp를 사용해볼 것.
}
