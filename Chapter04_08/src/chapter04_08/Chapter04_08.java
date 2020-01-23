package chapter04_08;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class Chapter04_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone[];
		int i;

		System.out.println("�ο���>>");
		int num = scanner.nextInt();
		phone = new Phone[num];

		for (i = 0; i < phone.length; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(��ĭ ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel); //�迭�� ����
		}
		System.out.println("����Ǿ����ϴ�");

		while (true) {
			System.out.print("�˻��� �̸�>>");
			String name = scanner.next();
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "�� ��ȣ��" + phone[i].getTel() + "�Դϴ�.");
					i--; // ���ѷ����� ���� i���� 1 ���ֱ�.
					break; // for���� ��������������
				}
				//if (!name.equals(phone[i].getName())) {
					//System.out.println(name + "�� �����ϴ�.");
					//i--; // ���ѷ����� ���� i���� 1 ���ֱ�.
					//break; // for���� ��������������
				//}
			}
			if (name.equals("�׸�"))
				break;
			if (i == num)
				System.out.println(name + "�� �����ϴ�.");
		}

	}

}
