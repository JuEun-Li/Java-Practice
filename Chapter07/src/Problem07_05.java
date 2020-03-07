import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String department;
	private String number;
	private double grade;

	public Student(String name, String department, String number, double grade) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.grade = grade;
	}

	public String get_name() {
		return name;
	}

	public String get_department() {
		return department;
	}

	public String get_number() {
		return number;
	}

	public double get_grade() {
		return grade;
	}

	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name + ", " + this.department + ", " + this.number + ", " + this.grade);
		}
	}
}

public class Problem07_05 {

	public static void main(String[] args) {
		Student[] student = new Student[4];
		ArrayList<Student> manage = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");

		for (int i = 0; i < student.length; i++) {
			System.out.print(">> ");
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String number = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			student[i] = new Student(name, department, number, grade);
			manage.add(student[i]); // ArrayList�� ����
		}
		for (int i = 0; i < manage.size(); i++) {
			System.out.println("----------------------------------");
			Student s = manage.get(i);
			System.out.println("�̸�: " + s.get_name());
			System.out.println("�а�: " + s.get_department());
			System.out.println("�й�: " + s.get_number());
			System.out.println("�������: " + s.get_grade());
		}
		System.out.println("----------------------------------");

		while (true) {
			System.out.print("�л� �̸� >> ");
			String name = sc.next();
			if (name.equals("�׸�"))
				break;
			for (int i = 0; i < manage.size(); i++) {
				Student s = manage.get(i);
				s.find_student(name);
			}
		}
		sc.close();
	}
}
