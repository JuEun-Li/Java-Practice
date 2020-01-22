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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다");
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
		System.out.println("날짜(1~30)?");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		System.out.println("할일은?(빈칸 없이 입력)>>");
		String work = scanner.next();
		day--;
		if (day < 0 || day > 30) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		days[day].set(work);
	}

	public void view() {
		System.out.println("날짜(1~30)?>>");
		int day = sc.nextInt();
		day--;
		if (day < 0 || day > 30) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			return;
		}
		System.out.println((day + 1) + "일의 할일은");
		days[day].show();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("이번 달 스케쥴 관리 프로그램");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("할일(입력: 1, 보기: 2, 끝내기: 3>>)");
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
