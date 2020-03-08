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

		System.out.println("�л��̸�, �а�, �й�, ��������� �Է��ϼ��� >>");
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
			System.out.println("�̸�: " + s.get_name());
			System.out.println("�а�: " + s.get_major());
			System.out.println("�й�: " + s.get_num());
			System.out.println("�������: " + s.get_score());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.println("�л��̸�>> ");
			String name = scanner.next();

			if (name.equals("�׸�"))
				break;

			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				s.find_student(name);
			}
		}
		scanner.close();
	}
}

// scanner.next() = �ܾ �Է¹޴´�. 
// scanner.nextLine() = ���� ��ü�� �Է¹޴´�.
// StringTokenizer( , ) = \n���� ������ �ɰ���.
// nextToken() = ���� ��ū�� ��ȯ�Ѵ�. 
// trim() = ���� �յ� ������ �������ش�. ���� ���� ������ ���� ���� �ʴ´�.