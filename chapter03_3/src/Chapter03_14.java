import java.util.Scanner;
//���ڿ��� ������ ���� �� equals() �޼ҵ带 ���. equals�� �ּҰ��� ���ϴ� ���� �ƴԿ� ����
public class Chapter03_14 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�� ����", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		String name = "";

		Scanner scanner = new Scanner(System.in);
		while (true) {
			if (name.equals("�׸�"))
				break;
			System.out.println("�����̸�>>");
			name = scanner.next();

			for (int j = 0; j < course.length; j++) {
				if (course[j].equals(name)) {
					System.out.println(course[j] + "�� ������" + score[j]);
				} else {
					System.out.println("���� �����Դϴ�");
				}
				break;
			}

		}
		scanner.close();

	}
}
