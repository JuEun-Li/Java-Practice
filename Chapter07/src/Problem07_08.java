import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem07_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<String, Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = scanner.next();

			if (name.equals("�׸�"))
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