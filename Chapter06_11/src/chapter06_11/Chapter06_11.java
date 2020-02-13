package chapter06_11;

import java.util.Scanner;

public class Chapter06_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		StringBuffer sb = new StringBuffer(word);

		while (true) {
			System.out.println("우리는 love Java Programming");
			System.out.print("명령: ");
			String cmd = scanner.nextLine();

			if (word.equals("그만")) {
				System.out.println("그만합니다.");
				break;
			}

			String[] tokens = cmd.split("!");
			int index = sb.indexOf(tokens[0]);
			
			sb.replace(index, index + tokens[0].length(), tokens[1]);
			System.out.print(sb.toString());
			
		}
		scanner.close();
	}
}
