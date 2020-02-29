import java.util.*;

class Student {
	int id;
	String tel;

	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class Chapter07_07 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();

		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("이재문", new Student(2, "010-2222-2222"));
		map.put("김남윤", new Student(3, "010-3333-3333"));

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("검색할 이름?");
			String name = scanner.next();

			if (name.equals("exit"))
				break;

			Student student = map.get(name);
			if (student == null)
				System.out.println(name + "는 없는 사람입니다.");
			else
				System.out.println("id" + student.id + "전화" + student.tel);
		}
		scanner.close();
	}

}
