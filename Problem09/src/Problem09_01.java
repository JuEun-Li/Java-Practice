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
}

public class Problem09_01 {

	public static void main(String[] args) {

	}
//
}

// get은 필드 값을 가져오는 메소드이다.
// set은 필드에 값을 설정하는 메소드이다.
// 이 둘은 접근자라 칭한다.
