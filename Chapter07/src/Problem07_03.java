import java.util.HashMap;
import java.util.Scanner;
//"�׸�"�� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, �ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� ���α׷��� �ۼ��϶�.

/*class Country{
	String name;
	int people;
	public Country(String name, int people) {
		this.name = name;
		this.people = people;
	}
}*/

public class Problem07_03 {

	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("���� �̸��� �α��� �Է��ϼ���. >>");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			
			int people = scanner.nextInt();
			country.put(name, people);
		}

		while (true) {
			System.out.println("�α� �˻� >> ");
			String search = scanner.next();

			if (search.equals("�׸�"))
				break;

			Integer n = country.get(search); // get()�޼ҵ带 ���� ������ Ű�� ���� �����Ѵ�.
			if (n == null) // �ؽøʿ� Ű�� ������ null�� ��ȯ�ϹǷ� 
				System.out.println(search + "�� ����� �����ϴ�.");
			else
				System.out.println(search + "�� �α���" + n);
		}
		scanner.close();
	}

}
