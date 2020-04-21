import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public void print_math() {
		System.out.println(math);
	}

	public void print_science() {
		System.out.println(science);
	}

	public void print_english() {
		System.out.println(english);
	}

	public int average() {
		return (math + science + english) / 3;
	}
}

public class Chapter04_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����: " + me.average());
		
		scanner.close();
	}

}
