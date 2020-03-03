import java.util.ArrayList;
import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		ArrayList<Character> stack = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);
			stack.add(c);
		}
		int sum = 0;
		for (int i = 0; i < stack.size(); i++) {
			char c = stack.get(i);
			switch (c) {
			case 'A':
				sum += 4;
				break;
			case 'B':
				sum += 3;
				break;
			case 'C':
				sum += 2;
				break;
			case 'D':
				sum += 1;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
		double avr = (double) sum / stack.size();
		System.out.println(avr);
		sc.close();
	}

}
