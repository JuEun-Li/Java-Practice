import java.util.Scanner;

public class Baekjoon_pb_5543 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min_burger = 0;
		int min_drink = 0;

		for (int i = 0; i < 3; i++) {
			int burger = scanner.nextInt();

			if (burger < 100 && burger > 2000)
				break;

			if (i == 0)
				min_burger = burger;

			if (min_burger > burger)
				min_burger = burger;
		}

		int cola = scanner.nextInt();
		int sprite = scanner.nextInt();
		if (cola > sprite)
			min_drink = sprite;
		else
			min_drink = cola;

		int min_set = min_burger + min_drink;
		System.out.println(min_set - 50);

		scanner.close();
	}

}
