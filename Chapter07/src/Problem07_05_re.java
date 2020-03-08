import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String major;
	private String num;
	private double score;

	public Student(String name, String major, String num, double score) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.score = score;
	}

	public String get_name() {
		return name;
	}

	public String get_major() {
		return major;
	}

	public String get_num() {
		return num;
	}

	public double get_score() {
		return score;
	}

	public void find_student() {
		if (name.equals(this.name))
			System.out.println(this.name + "," + this.major + "," + this.num + "," + this.score);
	}

	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name + ", " + this.major + ", " + this.num + ", " + this.score);
		}
	}
}

public class Problem07_05_re {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		Student[] student = new Student[4];

		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요 >>");
		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String info = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");

			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double score = Double.parseDouble(st.nextToken().trim());

			student[i] = new Student(name, major, num, score);
			list.add(student[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("----------------------------------");
			Student s = list.get(i);
			System.out.println("이름: " + s.get_name());
			System.out.println("학과: " + s.get_major());
			System.out.println("학번: " + s.get_num());
			System.out.println("학점평균: " + s.get_score());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.println("학생이름>> ");
			String name = scanner.next();

			if (name.equals("그만"))
				break;

			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				s.find_student(name);
			}
		}
		scanner.close();
	}
}

// scanner.next() = 단어를 입력받는다. 
// scanner.nextLine() = 문장 전체를 입력받는다.
// StringTokenizer( , ) = \n으로 문장을 쪼갠다.
// nextToken() = 다음 토큰을 반환한다. 
// trim() = 문장 앞뒤 공백을 제거해준다. 문장 사이 공백은 제거 하지 않는다.