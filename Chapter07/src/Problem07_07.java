import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem07_07 {

	public static void main(String[] args) {
		HashMap<String, Double> manage = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�̷����бݰ����ý����Դϴ�.");

		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��� ���� >> ");
			String name = sc.next();
			double score = sc.nextDouble();
			manage.put(name, score);
		}
		System.out.print("���л� ���� ���� ���� �Է� >> ");
		double cutline = sc.nextDouble();

		System.out.print("���л� ��� : ");
		Set<String> nameSet = manage.keySet();
		Iterator<String> it = nameSet.iterator();

		while (it.hasNext()) {
			String name = it.next();
			double score = manage.get(name);
			if (score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
		sc.close();
	}

}
