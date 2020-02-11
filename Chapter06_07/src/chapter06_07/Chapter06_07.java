package chapter06_07;

import java.util.*;

public class Chapter06_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;

		while (true) {
			System.out.println("문장을 입력하십시오");
			word = scanner.nextLine();
			if (word.equals("그만"))
				break;
			StringTokenizer st = new StringTokenizer(word, " ");
			System.out.println("어절 갯수는" + st.countTokens());
		}
		scanner.close();
	}
}

//자바에서는 String을 token단위로 끊을 수 있는 StringTokenizer클래스가 제공된다.
// countTokens()는 남아있는 토큰의 갯수를 반환한다.