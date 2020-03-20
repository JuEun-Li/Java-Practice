import java.util.Scanner;

class Num {

	public int find_min(int a, int b, int c) {
		int min = a;

		if (b < a)
			min = b;
		if (c < b)
			min = c;

		return min;
	}
}

public class Homework_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Num num = new Num();

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("가장 작은 수: " + num.find_min(a, b, c));

		scanner.close();
	}
}