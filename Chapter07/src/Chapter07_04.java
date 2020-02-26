import java.util.Iterator;
import java.util.Vector;

// 예제 07-1의 코드를 Iterator<Integer>를 이용하여 수정하기.
public class Chapter07_04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		System.out.println("현재 요소 객체 수>> " + v.size());
		System.out.println("현재 용량>> " + v.capacity());

		Iterator<Integer> it = v.iterator();

		while (it.hasNext()) {
			int n = it.next();
			System.out.println("현재 요소>> " + n);
		}

		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum = sum + n;
		}
		System.out.println("벡터에 있는 정수의 합 " + sum);
	}

}
