// �̸�(name), ��ȭ��ȣ(tel) �ʵ�� ������ ���� ���� Phone Ŭ������ �ۼ��ϰ�, 
// ���� ���ÿ� ���� �۵��ϴ� PhonBook Ŭ������ �ۼ��϶�.

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
		Scanner sc = new Scanner(System.in);
		Phone phone[];
		int i;
		
		System.out.print("�ο��� >> ");
		int num = sc.nextInt();
		phone = new Phone[num];
		
		for (i = 0; i < phone.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while (true) {
			System.out.print("�˻��� �̸� >>");
			String name = sc.next();
			
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "�� ��ȣ�� " + phone[i].getTel() + " �Դϴ�.");
					i--;
					break;
				}
			}
			if (name.equals("�׸�"))
				break;
			if (i == num)
				System.out.println(name + "�� �����ϴ�.");
		}

		sc.close();
	}

}