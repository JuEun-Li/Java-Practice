package chapter06_09;

import java.util.*;

public class Chapter06_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int sel = scanner.nextInt();
			
			if (sel == 4) {
				System.out.println("종료합니다.");
				break;
			}
			int com = (int) (Math.random() * 3 + 1); // 1부터 3까지
			System.out.println("컴퓨터=" + com);

			if (sel == 1) {
				if (com == 1)
					System.out.println("비겼습니다.");
				else if (com == 2)
					System.out.println("컴퓨터가 이겼습니다.");
				else if (com == 3)
					System.out.println("철수가 이겼습니다.");
			}

			else if (sel == 2) {
				if (com == 1)
					System.out.println("철수가 이겼습니다.");
				else if (com == 2)
					System.out.println("비겼습니다.");
				else if (com == 3)
					System.out.println("컴퓨터가 이겼습니다.");
			}

			else if (sel == 3) {
				if (com == 1)
					System.out.println("컴퓨터가 이겼습니다.");
				else if (com == 2)
					System.out.println("철수가 이겼습니다.");
				else if (com == 3)
					System.out.println("비겼습니다.");
			}

		}
		scanner.close();
	}

}
