import java.util.Scanner;

// �ѿ� ���� �����

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				System.out.println(word + "��");
				return eng[i];
			}

		}
		return "false"; // �ܾ �˸��� ������ false�� ����.
	}
}

public class Chapter04_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		while (true) {
			System.out.println("�ѱ� �ܾ�?");
			String word = scanner.next();
			if (word.equals("�׸�"))
				break;

			String eng = Dictionary.kor2Eng(word);

			if (eng.equals("false"))
				System.out.println(word + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(eng);
		}

		scanner.close();
	}

}


// Ŭ������ � �Ű������� �ִ���, ��ȯ���� �������� Ȯ���ϰ� �ڵ带 © ��.
// for������ ���Ϲ��� ������ �� for���� ���� ���� return�� �����ϸ� for������ ������ ���� ���� ������ ���ֵǴ� �� ��������.
// �� ���Ϲ��� Ȱ���Ͽ� � ���� return �Ǿ����Ŀ����� �����ϰ� �ڵ带 �ۼ��� �� �ִ�.