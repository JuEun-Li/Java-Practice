package chapter03_1;
//[3�� 5��]
//���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, 
//�迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;

public class chap03_05 {

	public static void main(String[] args) {
		System.out.println("���� ���� 10���� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		int unit[] = new int[10];

		for (int i = 0; i < unit.length; i++) {
			unit[i] = scanner.nextInt();
		}

		for (int i = 0; i < unit.length; i++) {
			if (unit[i] % 3 == 0) {
				System.out.println("3�� �����: "+unit[i]);
			}
		}
	}

}
