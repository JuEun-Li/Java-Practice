package chapter04_10_02;

import java.util.Scanner;

class Dictonary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				if (i % 2 == 0)
					System.out.println(word + "은");
				else
					System.out.println(word + "는");
				return eng[i];
			}
		}
		return "false";
	}
}

public class Chapter04_10_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.println("한글단어?>>");
			String search = scanner.next();
			if (search.equals("그만"))
				break;
			String eng = Dictonary.kor2Eng(Search);
			if (eng.equals("false"))
				System.out.println(search + "는 저의 사전에 없습니다.");
			else
				System.out.println(eng);
		}
		sc.close();
	}

}
