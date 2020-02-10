package chapter06_06;

import java.util.Scanner;
import java.util.Calendar;

//���� �� 10�ʿ� ������ Ÿ�ֿ̹� enterŰ�� �Է��Ͽ����� �Ǻ��ϴ� �ڵ�.

class Person {
	Scanner scanner = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	private String name, next;
	private int sec1, sec2;

	public Person(String name) {
		this.name = name;
	}

	public int enter() { //���� �ٿ� ���� �ʸ� ����ϴ� �޼ҵ�
		next = scanner.nextLine();
		now = Calendar.getInstance();
		System.out.println("���� �� �ð�=" + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}

	public int game() { //�� ���̸� ��ȯ�ϴ� �޼ҵ�
		System.out.println(name + "���� Ű>>");
		sec1 = enter();	//���� ��
		System.out.println("10�� ���� �� Ű>>");
		sec2 = enter();	//10�� �� ��
		if (sec1 < sec2) // ���� ���� �ʰ� 10�� �� �ʺ��� ũ��
			return sec2 - sec1; // �׳� ���ֱ�
		else
			return (60 - sec1) + sec2;
	}
}

public class Chapter06_06 {

	public static void main(String[] args) {
		Person person1 = new Person("Ȳ����");
		Person person2 = new Person("���繮");

		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		int result1 = person1.game();
		int result2 = person2.game();
		if (Math.abs(10 - result1) < Math.abs(10 - result2))
			System.out.println(result1 + "�� �¸�");
		else
			System.out.println(result2 + "�� �¸�");
	}

}

// Math.abs()�� �̿��Ͽ� ������ ��ȯ�Ѵ�.
