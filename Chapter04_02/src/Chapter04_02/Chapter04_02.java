package Chapter04_02;

import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int average() {
		return (math + science + english) / 3;
	}
}

public class Chapter04_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("����, ����,���� ������ ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("�����" + me.average());

		scanner.close();
	}

}
