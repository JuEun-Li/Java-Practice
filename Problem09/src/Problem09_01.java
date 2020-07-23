import java.util.Scanner;

// X ��ǥ�� Y �·�� ������ 2���� ��ǥ Coordiante Ŭ���� �ۼ��ϱ�.
class Coordinate {
	private double x;
	private double y;

	Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	} // getter

	void setX(double x) {
		this.x = x;
	}

	void setY(double y) {
		this.y = y;
	} // setter

	void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class Problem09_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("��ǥ p�� �Է��ϼ���: ");
		System.out.print("x��ǥ: ");
		double x = scanner.nextDouble();

		System.out.print("y��ǥ: ");
		double y = scanner.nextDouble();

		Coordinate p = new Coordinate(x, y); // �� p�� x, y��ǥ���� ����
		System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
		Coordinate q = p; // ��q�� ��ǥ������ ����(���� ����)
		
		q.set(9.9, 9.9); // �� q�� ��ǥ���� ����
		
		System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
		System.out.println("q = (" + q.getX() + "," + p.getY() + ")");
		

	}
}

// get�� �ʵ� ���� �������� �޼ҵ��̴�.
// set�� �ʵ忡 ���� �����ϴ� �޼ҵ��̴�.
// �� ���� �����ڶ� Ī�Ѵ�.
