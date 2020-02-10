package chapter06_06;

import java.util.Scanner;
import java.util.Calendar;

//누가 더 10초에 근접한 타이밍에 enter키를 입력하였는지 판별하는 코드.

class Person {
	Scanner scanner = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	private String name, next;
	private int sec1, sec2;

	public Person(String name) {
		this.name = name;
	}

	public int enter() { //다음 줄에 현재 초를 출력하는 메소드
		next = scanner.nextLine();
		now = Calendar.getInstance();
		System.out.println("현재 초 시간=" + now.get(Calendar.SECOND));
		return now.get(Calendar.SECOND);
	}

	public int game() { //초 차이를 반환하는 메소드
		System.out.println(name + "시작 키>>");
		sec1 = enter();	//현재 초
		System.out.println("10초 예상 후 키>>");
		sec2 = enter();	//10초 후 초
		if (sec1 < sec2) // 만약 현재 초가 10초 후 초보다 크면
			return sec2 - sec1; // 그냥 빼주기
		else
			return (60 - sec1) + sec2;
	}
}

public class Chapter06_06 {

	public static void main(String[] args) {
		Person person1 = new Person("황기태");
		Person person2 = new Person("이재문");

		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		int result1 = person1.game();
		int result2 = person2.game();
		if (Math.abs(10 - result1) < Math.abs(10 - result2))
			System.out.println(result1 + "의 승리");
		else
			System.out.println(result2 + "의 승리");
	}

}

// Math.abs()를 이용하여 절댓값을 반환한다.
