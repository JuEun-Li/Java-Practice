import java.util.Scanner;

// 사용자로부터 입력받은 달의 계절을 출력하는 메소드 생성하기.

class Season {
	static void PrintSeason(int n) {
		/*
		 * if (n == 3 || n == 4 || n == 5) return 1; // 봄
		 * 
		 * if (n == 6 || n == 7 || n == 8) return 2; // 여름
		 * 
		 * if (n == 9 || n == 10 || n == 11) return 3; // 가을
		 * 
		 * if (n == 1 || n == 2 || n == 12) return 4; // 겨울
		 */

		switch (n) {

		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;// 봄
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break; // 여름
		case 9:
		case 10:
		case 11:
			System.out.println("autumn");
			break; // 가을
		case 12:
		case 1:
		case 2:
			System.out.println("Winter");
			break; // 겨울
		}
	}
}

public class Problem07_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("몇 월 입니까? >>");
		int month = scanner.nextInt();
		Season.PrintSeason(month);
		System.out.println("입니다.");

		scanner.close();
	}

}
