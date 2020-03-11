import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem07_07 {

	public static void main(String[] args) {
		HashMap<String, Double> manage = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String name = sc.next();
			double score = sc.nextDouble();
			manage.put(name, score);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cutline = sc.nextDouble();

		System.out.print("장학생 명단 : ");
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
