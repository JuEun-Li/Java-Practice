import java.util.*;

public class chapter07_08 {
	// collections 클래스 활용하기.
	static void printList(LinkedList<String> l) {

		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;

			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";

			System.out.print(e + separator);// e와 separator를 연결해서 출력
		}

	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");

		Collections.sort(myList); // static 메소드이므로 클래스 이름으로 바로 호출한다.
		printList(myList); // 소팅된 순서대로 출력

		Collections.reverse(myList);
		printList(myList); // 거꾸로 출력

		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는" + index + "번째 요소입니다.");

	}

}
/* Collections 클래스의 주요 메소드:
 * 컬렉션에 포함된 요소들을 소팅하는 sort()
 * 요소의 순서를 반대로 하는 reverse()
 * 요소들의 최대, 최솟값을 찾아내는 max(), min()
 * 특정 값을 검색하는 binarySearch()
*/
