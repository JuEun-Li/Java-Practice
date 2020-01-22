package chapter04_07;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�");
	}
}


class MonthSchedule {
	private Scanner sc;
	private Day days[];

	MonthSchedule(int Day) {
		this.days = new Day[Day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		sc = new Scanner(System.in);
	}

	private void input() {
		System.out.println("��¥(1~30)?");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		System.out.println("������?(��ĭ ���� �Է�)>>");
		String work = scanner.next();
		day--;
		if (day < 0 || day > 30) {
			System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		days[day].set(work);
	}

	public void view() {
		System.out.println("��¥(1~30)?>>");
		int day = sc.nextInt();
		day--;
		if (day < 0 || day > 30) {
			System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		System.out.println((day + 1) + "���� ������");
		days[day].show();
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		System.out.println("�̹� �� ������ ���� ���α׷�");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("����(�Է�: 1, ����: 2, ������: 3>>)");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				return;

			}
		}
	}
}

public class Chapter04_07 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
