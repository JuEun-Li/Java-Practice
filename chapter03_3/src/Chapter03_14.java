import java.util.Scanner;
//문자열의 내용을 비교할 땐 equals() 메소드를 사용. equals는 주소값을 비교하는 것이 아님에 유의
public class Chapter03_14 {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		String name = "";

		Scanner scanner = new Scanner(System.in);
		while (true) {
			if (name.equals("그만"))
				break;
			System.out.println("과목이름>>");
			name = scanner.next();

			for (int j = 0; j < course.length; j++) {
				if (course[j].equals(name)) {
					System.out.println(course[j] + "의 점수는" + score[j]);
				} else {
					System.out.println("없는 과목입니다");
				}
				break;
			}

		}
		scanner.close();

	}
}
