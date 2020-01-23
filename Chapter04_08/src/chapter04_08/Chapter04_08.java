package chapter04_08;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class Chapter04_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone phone[];
		int i;

		System.out.println("인원수>>");
		int num = scanner.nextInt();
		phone = new Phone[num];

		for (i = 0; i < phone.length; i++) {
			System.out.println("이름과 전화번호(빈칸 없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel); //배열에 저장
		}
		System.out.println("저장되었습니다");

		while (true) {
			System.out.print("검색할 이름>>");
			String name = scanner.next();
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 번호는" + phone[i].getTel() + "입니다.");
					i--; // 무한루프를 위해 i값을 1 빼주기.
					break; // for문을 빠져나가기위함
				}
				//if (!name.equals(phone[i].getName())) {
					//System.out.println(name + "이 없습니다.");
					//i--; // 무한루프를 위해 i값을 1 빼주기.
					//break; // for문을 빠져나가기위함
				//}
			}
			if (name.equals("그만"))
				break;
			if (i == num)
				System.out.println(name + "이 없습니다.");
		}

	}

}
