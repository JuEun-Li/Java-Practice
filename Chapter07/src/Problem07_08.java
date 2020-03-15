import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem07_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<String, Integer>();
		System.out.println("** 포인트 관리 프로그램입니다 **");

		while (true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();

			if (name.equals("그만"))
				break;

			int point = scanner.nextInt();

			if (manage.get(name) == null) {
				manage.put(name, point);
			} else {
				manage.put(name, manage.get(name) + point);
			}
			Set<String> key = manage.keySet();
			Iterator<String> it = key.iterator();

			while (it.hasNext()) {
				String people = it.next();
				Integer sum = manage.get(people);
				System.out.print("(" + people + "," + sum + ")");
			}
			System.out.println();
		}
		scanner.close();
	}
}