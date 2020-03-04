import java.util.HashMap;
import java.util.Scanner;
//"그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라.

/*class Country{
	String name;
	int people;
	public Country(String name, int people) {
		this.name = name;
		this.people = people;
	}
}*/

public class Problem07_03 {

	public static void main(String[] args) {
		HashMap<String, Integer> country = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("나라 이름과 인구를 입력하세요. >>");
			String name = scanner.next();
			if (name.equals("그만"))
				break;
			
			int people = scanner.nextInt();
			country.put(name, people);
		}

		while (true) {
			System.out.println("인구 검색 >> ");
			String search = scanner.next();

			if (search.equals("그만"))
				break;

			Integer n = country.get(search); // get()메소드를 통해 지정된 키의 값을 리턴한다.
			if (n == null) // 해시맵에 키가 없으면 null을 반환하므로 
				System.out.println(search + "의 나라는 없습니다.");
			else
				System.out.println(search + "의 인구는" + n);
		}
		scanner.close();
	}

}
