import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String get_name() {
		return name;
	}

	public String get_tel() {
		return tel;
	}
}

public class Chapter04_08_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ο��� >> ");
		int person = scanner.nextInt();
		Phone[] phone = new Phone[person]; // �������ŭ �迭 ����
		
		for(int i = 0; i < person; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�) >>");
			String name = scanner.next();
			String tel = scanner.next();
			
			phone[i] = new Phone(name, tel);
		}
		
		System.out.println("����Ǿ����ϴ�..");
		
		while(true) {
			System.out.println("�˻��� �̸� >> ");
			String name = scanner.next();
			
			for(int i = 0; i < person; i++) {
				if(name.equals(phone[i].get_name())) {
					System.out.println(name + "�� ��ȣ��" + phone[i].get_tel() + "�Դϴ�.");
					break;
				}
			}
			
			if(name.equals("�׸�"))
				break;
			scanner.close();
		}
	}

}
