package chapter03_1;
//[3장 5번]
//양의 정수를 10개 입력받아 배열에 저장하고, 
//배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.

import java.util.Scanner;

public class chap03_05 {

	public static void main(String[] args) {
		System.out.println("양의 정수 10개를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int unit[] = new int[10];

		for (int i = 0; i < unit.length; i++) {
			unit[i] = scanner.nextInt();
		}

		for (int i = 0; i < unit.length; i++) {
			if (unit[i] % 3 == 0) {
				System.out.println("3의 배수는: "+unit[i]);
			}
		}
	}

}
