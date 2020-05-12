import java.util.Scanner;

// 한영 사전 만들기

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				System.out.println(word + "는");
				return eng[i];
			}

		}
		return "false"; // 단어가 알맞지 않으면 false를 리턴.
	}
}

public class Chapter04_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");

		while (true) {
			System.out.println("한글 단어?");
			String word = scanner.next();
			if (word.equals("그만"))
				break;

			String eng = Dictionary.kor2Eng(word);

			if (eng.equals("false"))
				System.out.println(word + "는 저의 사전에 없습니다.");
			else
				System.out.println(eng);
		}

		scanner.close();
	}

}


// 클래스에 어떤 매개변수가 있는지, 반환형은 무엇인지 확인하고 코드를 짤 것.
// for문에서 리턴문을 선언한 후 for문이 끝난 이후 return을 선언하면 for문에서 리턴을 하지 않은 것으로 간주되는 점 유의하자.
// 그 리턴문을 활용하여 어떤 값이 return 되었느냐에따라 간편하게 코드를 작성할 수 있다.