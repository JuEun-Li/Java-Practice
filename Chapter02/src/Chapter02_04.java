import java.util.Scanner;

public class Chapter02_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력>> ");
		int a, b, c;

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a <= b && b <= c)
			System.out.println("중간 값은:" + b);

		else if (b <= a && a <= c)
			System.out.println("중간 값은" + a);

		else
			System.out.println("중간 값은" + c);

		scanner.close();
	}

}
