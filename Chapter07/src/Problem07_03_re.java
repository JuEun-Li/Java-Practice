import java.util.HashMap;
import java.util.Scanner;

// 해시맵 복습

public class Problem07_03_re {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 입력하세요");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			int people = scanner.nextInt();
			hs.put(country, people);
		}
		
		while(true) {
			System.out.print("인구 검색 >>");
			String country = scanner.next();
			if(country.equals("그만"))
				break;
			Integer n = hs.get(country);
			if(n == null)
				System.out.println(country + "나라는 없습니다.");
			else
				System.out.println(country + "의 인구는" + n);
		}
		scanner.close();
	}

}