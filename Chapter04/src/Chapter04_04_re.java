class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width; // ����
		this.height = height; // ����
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.print("(" + x + "," + y + ")����");
		System.out.println("ũ�Ⱑ" + width + "x" + height + "�� �簢��");
	}

	public boolean contains(Rectangle r) {
		if (x < r.x && y < r.y)
			if ((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height))
				return true;
		return false;
	}
}

public class Chapter04_04_re {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
	}
}
