import java.util.Scanner;

public class Chapter03_16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		String person, com;
		int n;

		System.out.println("���� ���� �� ������ �մϴ�.");
		do {
			System.out.println("���� ���� ��!>>");
			person = scanner.next();
			if (person.equals("�׸�"))
				break;
			n = (int) (Math.random() * 3);
			com = str[n];
			if (person.equals("����")) {
				if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				} else if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				} else if (com.equals("��")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�̰���ϴ�.");
					continue;
				}
			}

			else if (person.equals("����")) {
				if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				} else if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�̰���ϴ�.");
					continue;
				} else if (com.equals("��")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				}
			}

			else if (person.equals("��")) {
				if (com.equals("��")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				} else if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�̰���ϴ�.");
					continue;
				} else if (com.equals("����")) {
					System.out.println("�����=" + person + ",��ǻ��=" + com + "�����ϴ�.");
					continue;
				}
			}

		} while (true);
		System.out.println("������ �����մϴ�.");
		scanner.close();
	}

}
