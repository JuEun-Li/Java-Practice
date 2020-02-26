import java.util.Iterator;
import java.util.Vector;

// ���� 07-1�� �ڵ带 Iterator<Integer>�� �̿��Ͽ� �����ϱ�.
public class Chapter07_04 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();

		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);

		System.out.println("���� ��� ��ü ��>> " + v.size());
		System.out.println("���� �뷮>> " + v.capacity());

		Iterator<Integer> it = v.iterator();

		while (it.hasNext()) {
			int n = it.next();
			System.out.println("���� ���>> " + n);
		}

		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum = sum + n;
		}
		System.out.println("���Ϳ� �ִ� ������ �� " + sum);
	}

}
