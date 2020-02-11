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
		System.out.println("���� �� �ð�" + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}

	public int game() {
		System.out.println("���� �� �ð�>>");
		sec1 = enter();
		System.out.println("10�� �� ���� �� Ű");
		sec2 = enter();
		if (sec1 > sec2)
			return sec1 - sec2;
		else
			return (60 - sec1) + sec2;
	}
}

public class Chapter06_06_2 {

	public static void main(String[] args) {
		Person person1 = new Person("Ȳ����");
		Person person2 = new Person("���繮");
		int result1 = person1.game();
		int result2 = person2.game();

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		if (Math.abs(10 - result1) < Math.abs(10 - result2))
			System.out.println("���ڴ�" + person1);
		else
			System.out.println("���ڴ�" + person2);
	}

}
