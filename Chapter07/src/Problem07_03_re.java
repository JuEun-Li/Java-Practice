import java.util.HashMap;
import java.util.Scanner;

// �ؽø� ����

public class Problem07_03_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			int people = scanner.nextInt();
			hs.put(country, people);
		}
		
		while(true) {
			System.out.print("�α� �˻� >>");
			String country = scanner.next();
			if(country.equals("�׸�"))
				break;
			Integer n = hs.get(country);
			if(n == null)
				System.out.println(country + "����� �����ϴ�.");
			else
				System.out.println(country + "�� �α���" + n);
		}
		scanner.close();
	}

}