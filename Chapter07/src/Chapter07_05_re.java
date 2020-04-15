import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

// �ؽø� ����, * Ű�� �л� �̸����� �Ѵ�.
class Student {
	private String name; // �̸�
	private String major; // �а�
	private int num; // �й�
	private double score_avg; // ���� ���

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
		} // �̸� ���� �����ϸ� ������ value ���� ���
	}
}

public class Chapter07_05_re {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		Scanner scanner = new Scanner(System.in);

		Student[] student = new Student[4];
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���. ");

		for (int i = 0; i < 4; i++) {
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken();
			String major = st.nextToken();
			int num = Integer.parseInt(st.nextToken().trim());
			double score_avg = Double.parseDouble(st.nextToken().trim());

			student[i] = new Student(name, major, num, score_avg);
			hm.put(name, student[i]); // Ű ���� value ���� ���� �����ؾ��Ѵ�.
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
			System.out.println("�������: " + s.get_score_avg());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			Student s = hm.get(name);
			s.find_student(name);
		}
		scanner.close();

	}

}
