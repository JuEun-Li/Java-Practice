import java.util.ArrayList;
import java.util.Scanner;

// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라.
public class Chapter07_03 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		// 이름을 4개 입력받기
		for (int i = 0; i < 4; i++) {
			System.out.println("이름을 입력하시오>> ");
			String name = scanner.next();
			a.add(name);
		}

		// 이름을 모두 출력
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}

		// 가장 긴 이름 출력
		int longest = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(longest).length() < a.get(i).length())
				longest = i;
		}
		System.out.println("가장 긴 이름은" + a.get(longest));
	}
}
