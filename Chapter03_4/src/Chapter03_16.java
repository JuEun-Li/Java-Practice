import java.util.Scanner;

public class Chapter03_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sel[] = { "����", "����", "��" };
		String person = "", com = "";
		int n; // ��ǻ���� ���� ����

		do {
			System.out.println("���� ���� ��!>> ");
			person = scanner.next();
			System.out.println("����=" + person);
			if (person == "�׸�")
				break;

			n = (int) (Math.random() * 3);
			com = sel[n]; // ��ǻ�ʹ� sel�迭�� �ϳ��� ����.
			System.out.println("��ǻ��= " + com);

			if (person.equals("����")) {
				if (person.equals(com)) {
					System.out.println("�����ϴ�");
				} else if (com.equals("����")) {
					System.out.println("�����ϴ�");
				} else if (com.equals("��")) {
					System.out.println("�̰���ϴ�");
				}
				continue;
			} else if (person.equals("����")) {
				if (person.equals(com)) {
					System.out.println("�����ϴ�");
				} else if (com.equals("��")) {
					System.out.println("�����ϴ�");
				} else if (com.equals("����")) {
					System.out.println("�̰���ϴ�");
				}
				continue;
			} else if (person.equals("��")) {
				if (person.equals(com)) {
					System.out.println("�����ϴ�");
				} else if (com.equals("����")) {
					System.out.println("�����ϴ�");
				} else if (com.equals("����")) {
					System.out.println("�̰���ϴ�");
				}
				continue;
			}

		} while (true);
		System.out.println("������ �����մϴ�.");
		scanner.close();
	}
}
