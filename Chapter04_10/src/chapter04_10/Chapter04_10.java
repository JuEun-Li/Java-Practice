package chapter04_10;

import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.print("��");
				else
					System.out.print("��");
				return eng[i];
			}
		}
		return "false";
	}
}

public class Chapter04_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		while (true) {
			System.out.println("�ѱ۴ܾ�?>>");
			String search = scanner.next();

			if (search.equals("�׸�"))
				break;
			String eng = Dictionary.kor2Eng(search);
			if (eng.equals("false"))
				System.out.print(search + "�� ���� ������ �����ϴ�.");
			else
				System.out.print(eng);
		}
		scanner.close();
	}
}
