import java.util.Scanner;

public class Chapter03_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sel[] = { "가위", "바위", "보" };
		String person = "", com = "";
		int n; // 컴퓨터의 선택 변수

		do {
			System.out.println("가위 바위 보!>> ");
			person = scanner.next();
			System.out.println("유저=" + person);
			if (person == "그만")
				break;

			n = (int) (Math.random() * 3);
			com = sel[n]; // 컴퓨터는 sel배열중 하나를 고른다.
			System.out.println("컴퓨터= " + com);

			if (person.equals("가위")) {
				if (person.equals(com)) {
					System.out.println("비겼습니다");
				} else if (com.equals("바위")) {
					System.out.println("졌습니다");
				} else if (com.equals("보")) {
					System.out.println("이겼습니다");
				}
				continue;
			} else if (person.equals("바위")) {
				if (person.equals(com)) {
					System.out.println("비겼습니다");
				} else if (com.equals("보")) {
					System.out.println("졌습니다");
				} else if (com.equals("가위")) {
					System.out.println("이겼습니다");
				}
				continue;
			} else if (person.equals("보")) {
				if (person.equals(com)) {
					System.out.println("비겼습니다");
				} else if (com.equals("가위")) {
					System.out.println("졌습니다");
				} else if (com.equals("바위")) {
					System.out.println("이겼습니다");
				}
				continue;
			}

		} while (true);
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}
