 // Human Ŭ�������� �ĺ� ��ȣ�� ���õ� ó���� �����ؼ�, �Ϸ� ��ȣ�� �����ϴ� idŬ���� �ۼ�
class ID {
	static int counter = 0; // �� ������ �ĺ���ȣ�� �ο��ߴ°�.
	private int id; // �ĺ� ��ȣ
	
	public ID() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}
public class Problem10_02 {

	public static void main(String[] args) {
		ID a = new ID();
		ID b = new ID();
		
		System.out.println("a�� �Ϸù�ȣ: " + a.getId());
		System.out.println("b�� �Ϸù�ȣ: " + b.getId());
		
		System.out.println("ID.counter: " + ID.counter);
		System.out.println("a.counter: " + a.counter);
		System.out.println("b.counter: " + b.counter);
	}

}
