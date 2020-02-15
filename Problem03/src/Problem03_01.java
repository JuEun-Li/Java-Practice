import java.util.Scanner;

//키보드로  입력한 정숫값이 음이면 "이 값은 음의 값입니다." 라고 표시하는 프로그램

public class Problem03_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 값은?");
		int num = scanner.nextInt();

		if (num < 0)
			System.out.println("이 값은 음의 값입니다.");
		else
			System.out.println("양수 입니다.");

		scanner.close();
	}

}
