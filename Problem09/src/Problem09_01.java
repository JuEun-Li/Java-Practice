import java.util.Scanner;

// X 좌표와 Y 좌료로 구성된 2차원 좌표 Coordiante 클래스 작성하기.
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

		System.out.print("좌표 p를 입력하세요: ");
		System.out.print("x좌표: ");
		double x = scanner.nextDouble();

		System.out.print("y좌표: ");
		double y = scanner.nextDouble();

		Coordinate p = new Coordinate(x, y); // 점 p의 x, y좌표값을 저장
		System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
		Coordinate q = p; // 점q의 좌표값으로 복사(얕은 복사)
		
		q.set(9.9, 9.9); // 점 q의 자표값을 변경
		
		System.out.println("p = (" + p.getX() + "," + p.getY() + ")");
		System.out.println("q = (" + q.getX() + "," + p.getY() + ")");
		

	}
}

// get은 필드 값을 가져오는 메소드이다.
// set은 필드에 값을 설정하는 메소드이다.
// 이 둘은 접근자라 칭한다.
