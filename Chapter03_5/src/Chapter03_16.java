import java.util.Scanner;

public class Chapter03_16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		String person, com;
		int n;

		System.out.println("가위 바위 보 게임을 합니다.");
		do {
			System.out.println("가위 바위 보!>>");
			person = scanner.next();
			if (person.equals("그만"))
				break;
			n = (int) (Math.random() * 3);
			com = str[n];
			if (person.equals("가위")) {
				if (com.equals("가위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "비겼습니다.");
					continue;
				} else if (com.equals("바위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "졌습니다.");
					continue;
				} else if (com.equals("보")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "이겼습니다.");
					continue;
				}
			}

			else if (person.equals("바위")) {
				if (com.equals("바위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "비겼습니다.");
					continue;
				} else if (com.equals("가위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "이겼습니다.");
					continue;
				} else if (com.equals("보")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "졌습니다.");
					continue;
				}
			}

			else if (person.equals("보")) {
				if (com.equals("보")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "비겼습니다.");
					continue;
				} else if (com.equals("바위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "이겼습니다.");
					continue;
				} else if (com.equals("가위")) {
					System.out.println("사용자=" + person + ",컴퓨터=" + com + "졌습니다.");
					continue;
				}
			}

		} while (true);
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}

}
