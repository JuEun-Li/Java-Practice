class MyPoint {
	private int x;
	private int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	} // ��ǥ���� ������ֱ� ���� �޼ҵ�

	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}

public class Chaptet06_01 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}

}
