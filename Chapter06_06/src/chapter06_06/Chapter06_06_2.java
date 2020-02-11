package chapter06_06;

import java.util.Calendar;

class Person {
	private String name;
	private int sec1, sec2;

	Calendar now = Calendar.getInstance();

	public Person(String name) {
		this.name = name;
	}

	public int enter() {
		now = Calendar.getInstance();
		System.out.println("현재 초 시간" + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}

	public int game() {
		System.out.println("현재 초 시간>>");
		sec1 = enter();
		System.out.println("10초 후 예상 후 키");
		sec2 = enter();
		if (sec1 > sec2)
			return sec1 - sec2;
		else
			return (60 - sec1) + sec2;
	}
}

public class Chapter06_06_2 {

	public static void main(String[] args) {
		Person person1 = new Person("황기태");
		Person person2 = new Person("이재문");
		int result1 = person1.game();
		int result2 = person2.game();

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		if (Math.abs(10 - result1) < Math.abs(10 - result2))
			System.out.println("승자는" + person1);
		else
			System.out.println("승자는" + person2);
	}

}
