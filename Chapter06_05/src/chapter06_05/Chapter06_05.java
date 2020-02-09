package chapter06_05;

import java.util.Calendar;

public class Chapter06_05 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //Calendar �ν��Ͻ� ����

		int hour = now.get(Calendar.HOUR_OF_DAY); // ���� �ð��� �޾ƿ´�.
		int minute = now.get(Calendar.MINUTE); // ���� ���� �޾ƿ´�.
		System.out.println("����ð���" + hour + "��" + minute + "���Դϴ�.");

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

/* getInstance()�� �̱�����������, �ϳ��� �ν��Ͻ��� ������ �����ؼ� ����.
 * �̱�������- �����ڸ� private���� �����Ͽ� �ٸ� Ŭ�������� �ش� Ŭ������ �ν��Ͻ���getInstance()�Լ��� ���Ͽ� �������Ѵ�.
 * �� ���� ���ο� ��ü�� �����ϰ� ���Ŀ��� ��� Ŭ�������� ������ ��ü�� ����ؾ��ϴ� ��� ����.(ex. ����)
 * 
*/
