import java.util.Scanner;

//정수값을 읽어 절대값 구하기

public class Problem03_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = scanner.nextInt();

		if (num < 0) {
			System.out.println(num + "의 절댓값은" + -num + "입니다.");
		} else
			System.out.println(num + "의 절댓값은" + num + "입니다.");
	}

}
