import java.util.Vector;

public class Chapter07_01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // 정수 값만 다루는 제네릭 벡터 생성

		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입

		v.add(2, 100); // 2번 자리에 100삽입(4와 -1 사이)

		System.out.println("벡터 내의 요소 객체 수: " + v.size());
		System.out.println("벡터 내의 현재 용량: " + v.capacity());

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n); // 모든 정수 요소 출력
		}

		int sum = 0;

		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		} // 벡터 속 모든 정수 더하기
		System.out.println("벡터에 있는 정수 합: " + sum);
	}

}
// elementAt(int index) = 인덱스 index의 요소를 리턴하는 메소드
// v.get(i) = 인덱스 i의 요소를  리턴하는 메소드