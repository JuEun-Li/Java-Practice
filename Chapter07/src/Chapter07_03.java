import java.util.ArrayList;
import java.util.Scanner;

// �̸��� 4�� �Է¹޾� ArrayList�� �����ϰ� ��� ����� �� ���� �� �̸��� ����϶�.
public class Chapter07_03 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		// �̸��� 4�� �Է¹ޱ�
		for (int i = 0; i < 4; i++) {
			System.out.println("�̸��� �Է��Ͻÿ�>> ");
			String name = scanner.next();
			a.add(name);
		}

		// �̸��� ��� ���
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}

		// ���� �� �̸� ���
		int longest = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longest).length() < a.get(i).length())
				longest = i;
		}
		System.out.println("���� �� �̸���" + a.get(longest));
	}
}
