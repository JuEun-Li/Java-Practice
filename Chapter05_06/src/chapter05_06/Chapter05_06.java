package chapter05_06;

class Point { // 2차원 상의 헌 점을 표현.
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
		String tmp = color + "색의(" + getX() + "," + getY() + ")의 점";
		return tmp;
	}
}

public class Chapter05_06 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3); // 1,2,3은 각각 x, y, z축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.println(p.toString() + "입니다.");
	}

}
