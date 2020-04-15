import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// 해시맵 복습, * 키는 학생 이름으로 한다.
class Student {
	private String name; // 이름
	private String major; // 학과
	private int num; // 학번
	private double score_avg; // 학점 평균

	public Student(String name, String major, int num, double score_avg) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.score_avg = score_avg;
	}

	public String get_name() {
		return name;
	}

	public String get_major() {
		return major;
	}

	public int get_num() {
		return num;
	}

	public double get_score_avg() {
		return score_avg;
	}

	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name + ", " + this.major + ", " + this.num + ", " + this.score_avg);
		} // 이름 값이 존재하면 나머지 value 들을 출력
	}
}

public class Chapter07_05_re {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Scanner scanner = new Scanner(System.in);

		Student[] student = new Student[4];
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요. ");

		for (int i = 0; i < 4; i++) {
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken();
			String major = st.nextToken();
			int num = Integer.parseInt(st.nextToken().trim());
			double score_avg = Double.parseDouble(st.nextToken().trim());

			student[i] = new Student(name, major, num, score_avg);
			hm.put(name, student[i]); // 키 값과 value 값을 같이 저장해야한다.
		}

		Set<String> key = hm.keySet();
		Iterator<String> it = key.iterator();

		while (it.hasNext()) {
			String name = it.next();
			System.out.println("----------------------------------");
			Student s = hm.get(name);
			System.out.println("이름: " + s.get_name());
			System.out.println("학과: " + s.get_major());
			System.out.println("학번: " + s.get_num());
			System.out.println("학점평균: " + s.get_score_avg());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			Student s = hm.get(name);
			s.find_student(name);
		}
		scanner.close();

	}

}
