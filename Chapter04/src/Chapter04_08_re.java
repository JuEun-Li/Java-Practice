import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String get_name() {
		return name;
	}

	public String get_tel() {
		return tel;
	}
}

public class Chapter04_08_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수 >> ");
		int person = scanner.nextInt();
		Phone[] phone = new Phone[person]; // 사람수만큼 배열 생성
		
		for(int i = 0; i < person; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >>");
			String name = scanner.next();
			String tel = scanner.next();
			
			phone[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다..");
		
		while(true) {
			System.out.println("검색할 이름 >> ");
			String name = scanner.next();
			
			for(int i = 0; i < person; i++) {
				if(name.equals(phone[i].get_name())) {
					System.out.println(name + "의 번호는" + phone[i].get_tel() + "입니다.");
					break;
				}
			}
			
			if(name.equals("그만"))
				break;
			scanner.close();
		}
	}

}
