import java.util.ArrayList;
import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			String score = scanner.next();
			ar.add(score);
		} // arraylist�� ���� ���� �Ϸ�
		
		double sum = 0;

		for (int i = 0; i < ar.size(); i++) {
			String score = ar.get(i); // ���ؽ� i��° score���� Ž���Ѵ�.
			
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
		System.out.println("�����: " + avr);
		
		scanner.close();
	}
}