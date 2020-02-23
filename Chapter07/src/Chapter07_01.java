import java.util.Vector;

public class Chapter07_01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // ���� ���� �ٷ�� ���׸� ���� ����

		v.add(5); // 5 ����
		v.add(4); // 4 ����
		v.add(-1); // -1 ����

		v.add(2, 100); // 2�� �ڸ��� 100����(4�� -1 ����)

		System.out.println("���� ���� ��� ��ü ��: " + v.size());
		System.out.println("���� ���� ���� �뷮: " + v.capacity());

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n); // ��� ���� ��� ���
		}

		int sum = 0;

		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		} // ���� �� ��� ���� ���ϱ�
		System.out.println("���Ϳ� �ִ� ���� ��: " + sum);
	}

}
// elementAt(int index) = �ε��� index�� ��Ҹ� �����ϴ� �޼ҵ�
// v.get(i) = �ε��� i�� ��Ҹ�  �����ϴ� �޼ҵ�