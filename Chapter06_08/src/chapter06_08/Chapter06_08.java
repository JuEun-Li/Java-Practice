package chapter06_08;

import java.util.*;

public class Chapter06_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");

		String str = scanner.nextLine();

		for (int i = 1; i <= str.length(); i++) {
			System.out.print(str.substring(i));
			System.out.println(str.substring(0, i));
		}
		scanner.close();
	}

}

// substring(start) = start ��ġ���� ������ ���ڿ� �ڸ��� 
// substring(start, end) = start ��ġ���� end���� ���ڿ� ����