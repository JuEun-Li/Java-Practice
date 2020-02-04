package chapter05_06;

class Point { // 2���� ���� �� ���� ǥ��.
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		super(0,0);
		this.color = "BLACK";

	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public void SetXY(int x, int y) {
		move(x, y);
	}

	public void SetColor(String color) {
		this.color = color;
	}

	public String toString() {
		String tmp = color + "����(" + getX() + "," + getY() + ")�� ��";
		return tmp;
	}
}

public class Chapter05_06 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3); // 1,2,3�� ���� x, y, z���� ��.
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveUp(); // z ������ ���� �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.moveDown(); // z ������ �Ʒ��� �̵�
		p.move(10, 10); // x, y ������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(100, 200, 300); // x, y, z������ �̵�
		System.out.println(p.toString() + "�Դϴ�.");
	}

}
