package chapter06_05;

import java.util.Calendar;

public class Chapter06_05 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //Calendar 인스턴스 생성

		int hour = now.get(Calendar.HOUR_OF_DAY); // 현재 시간을 받아온다.
		int minute = now.get(Calendar.MINUTE); // 현재 분을 받아온다.
		System.out.println("현재시간은" + hour + "시" + minute + "분입니다.");

		if (hour > 4 && hour < 12) {
			System.out.println("Good Morning");
		} else if (hour < 18) {
			System.out.println("Good Afternoon");
		} else if (hour < 22) {
			System.out.println("Good Evening");
		} else
			System.out.println("Good Night");
	}

}

/* getInstance()는 싱글턴패턴으로, 하나의 인스턴스만 가지고 공유해서 쓴다.
 * 싱글턴패턴- 생성자를 private으로 선언하여 다른 클래스에서 해당 클래스의 인스턴스를getInstance()함수를 통하여 갖도록한다.
 * 한 번만 새로운 객체를 생성하고 이후에는 모든 클래스들이 동일한 객체를 사용해야하는 경우 유용.(ex. 게임)
 * 
*/
