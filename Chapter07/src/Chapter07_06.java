import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// 해시맵  키와 값 모두 출력하기
public class Chapter07_06 {

	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("김성동", 97);
		score.put("황기태", 88);
		score.put("김남윤", 98);

		System.out.println("HashMap의 요소 개수: " + score.size());

		// key 문자열을 가진 집합 set 컬렉션 리턴
		Set<String> keys = score.keySet();
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			int javaScore = score.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
