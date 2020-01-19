package chapter04_04;

class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return (width * height); //사각형 넓이 리턴
	}

	public void show() {
		System.out.println("x,y에서 크기가" + width + "x" + height + "인 사각형");
	} //사각형의 좌표와 넓이를 화면에 출력

	boolean contains(Rectangle r) {
		if (x < r.x && y < r.y)
			if ((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height))
				return true; //매개변수로 받은 r이 현 사각형 안에 있으면 true
		return false; //없으면 false 리턴
	}
}

public class Chapter04_04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은" + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s을 포함합니다.");
	}

}
