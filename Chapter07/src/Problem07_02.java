import java.util.ArrayList;
import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			String score = scanner.next();
			ar.add(score);
		} // arraylist에 학점 삽입 완료
		
		double sum = 0;

		for (int i = 0; i < ar.size(); i++) {
			String score = ar.get(i); // 인텍스 i번째 score값을 탐색한다.
			
			if (score.equals("A")) {
				sum = sum + 4.0;
			} else if (score.equals("B")) {
				sum = sum + 3.0;
			} else if (score.equals("C")) {
				sum = sum + 2.0;
			} else if (score.equals("D")) {
				sum = sum + 1.0;
			} else if (score.equals("F")) {
				sum = sum + 0;
			} 
		}
		double avr = sum / ar.size();
		System.out.println("평균은: " + avr);
		
		scanner.close();
	}
}