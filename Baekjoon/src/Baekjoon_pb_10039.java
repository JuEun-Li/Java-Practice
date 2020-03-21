// 학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
// 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.
// 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.

import java.util.Scanner;

public class Baekjoon_pb_10039 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			int student = scanner.nextInt();
			if (student < 0 && student % 5 != 0)
				break;

			if (student < 40)
				student = 40;

			sum = sum + student;

		}
		int avr = sum / 5;
		System.out.println(avr);
	}

}
