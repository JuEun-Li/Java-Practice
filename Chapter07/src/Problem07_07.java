import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*class Information {
	private String name;
	private int score;

	public Information(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String find_name() {
		return name;
	}

	public int find_score() {
		return score;
	}
}*/

public class Problem07_07 {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("미래 장학금 관리시스템 입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.println("이름과 학점");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			double score = scanner.nextDouble();
			hm.put(name, score);
		} // 해시맵에 key, value 저장 완료.

		System.out.println("장학생 선발 학점 기준 입력>> ");
		Double cutLine = scanner.nextDouble(); // 장학금 선발 학점 기준

		Set<String> keys = hm.keySet(); // string이 키값.
		Iterator<String> it = keys.iterator(); // keys(set)에 저장된 객체를 꺼내온다.

		System.out.println("장학생 선발 명단");
		while (it.hasNext()) {
			String name = it.next();
			double score = hm.get(name);
			if (score >= cutLine) {
				System.out.print(name + " ");
			}
			scanner.close();
		}
	}
}

/*
 * 해시맵에는 key값, value값 두개를 저장할 수 있다. key값과 value값을 2개의 변수로만 받는다면 따로 클래스를 선언할 필요
 * 없다. 하지만 여러개의 value값을 받아야할 때는 클래스를 선언한 후, 한꺼번에 값을 입력 받아 value값에 클래스 이름을 적어주면
 * 된다. 여러개 값을 한 번에 입력하고 저장하기 위하여 StringTokenizer()메소드가 쓰이는 것. 이 문제에서는 이름과 학점 두
 * 개만 받아챙기면 되므로, 각각 입력받은 후 바로 해시맵에 저장하면 된다.
 */