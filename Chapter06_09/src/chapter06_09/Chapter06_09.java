package chapter06_09;

import java.util.*;

public class Chapter06_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			int sel = scanner.nextInt();
			
			if (sel == 4) {
				System.out.println("�����մϴ�.");
				break;
			}
			int com = (int) (Math.random() * 3 + 1); // 1���� 3����
			System.out.println("��ǻ��=" + com);

			if (sel == 1) {
				if (com == 1)
					System.out.println("�����ϴ�.");
				else if (com == 2)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (com == 3)
					System.out.println("ö���� �̰���ϴ�.");
			}

			else if (sel == 2) {
				if (com == 1)
					System.out.println("ö���� �̰���ϴ�.");
				else if (com == 2)
					System.out.println("�����ϴ�.");
				else if (com == 3)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}

			else if (sel == 3) {
				if (com == 1)
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (com == 2)
					System.out.println("ö���� �̰���ϴ�.");
				else if (com == 3)
					System.out.println("�����ϴ�.");
			}

		}
		scanner.close();
	}

}
