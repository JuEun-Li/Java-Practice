package chapter04_10_02;

import java.util.Scanner;

class Dictonary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.println(word + "��");
				else
					System.out.println(word + "��");
				return eng[i];
			}
		}
		return "false";
	}
}

public class Chapter04_10_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

		while (true) {
			System.out.println("�ѱ۴ܾ�?>>");
			String search = scanner.next();
			if (search.equals("�׸�"))
				break;
			String eng = Dictonary.kor2Eng(Search);
			if (eng.equals("false"))
				System.out.println(search + "�� ���� ������ �����ϴ�.");
			else
				System.out.println(eng);
		}
		sc.close();
	}

}
