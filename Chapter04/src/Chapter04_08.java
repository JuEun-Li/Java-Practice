// 이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고, 
// 실행 예시와 같이 작동하는 PhonBook 클래스를 작성하라.

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
		Scanner sc = new Scanner(System.in);
		Phone phone[];
		int i;
		
		System.out.print("인원수 >> ");
		int num = sc.nextInt();
		phone = new Phone[num];
		
		for (i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다...");
		
		while (true) {
			System.out.print("검색할 이름 >>");
			String name = sc.next();
			
			for (i = 0; i < num; i++) {
				if (name.equals(phone[i].getName())) {
					System.out.println(name + "의 번호는 " + phone[i].getTel() + " 입니다.");
					i--;
					break;
				}
			}
			if (name.equals("그만"))
				break;
			if (i == num)
				System.out.println(name + "이 없습니다.");
		}

		sc.close();
	}

}