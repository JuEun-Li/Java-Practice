import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// (2) 1�� ������ ArrayList<Student> ���, HashMap<String, Studnet> �ؽø��� �̿��Ͽ� �ٽ� �ۼ��϶�. 
// �ؽøʿ��� Ű�� �л� �̸�����.

class Student {
	String name;
	String major;
	String num;
	double score;

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

	public void find_student(String name) {
		if (name.equals(this.name))
			System.out.println(this.name + this.major + this.num + this.score);
	}

}

public class Problem07_05_2 {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Scanner scanner = new Scanner(System.in);
		Student[] student = new Student[4];

		System.out.println("�л��̸�, �а�, �й�, ��������� �Է��Ͻÿ�");

		for (int i = 0; i < student.length; i++) {
			System.out.println(">>");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double score = Double.parseDouble(st.nextToken().trim());
			student[i] = new Student(name, major, num, score);
			hm.put(name, student[i]);
		}
		Set<String> key = hm.keySet();
		Iterator<String> it = key.iterator();

		while (it.hasNext()) {
			String name = it.next();
			System.out.println("----------------------------------");
			Student s = hm.get(name);
			System.out.println("�̸�: " + s.get_name());
			System.out.println("�а�: " + s.get_major());
			System.out.println("�й�: " + s.get_num());
			System.out.println("�������: " + s.get_score());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.println("�л� �̸�>> ");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			Student s = hm.get(name);
			s.find_student(name);
		}
		scanner.close();
	}

}
