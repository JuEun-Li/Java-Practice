import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter06_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(">>");
			String s = scanner.nextLine();

			if (s.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}

			StringTokenizer st = new StringTokenizer(s, " ");
			System.out.println(st.countTokens());
		}
	}

}
