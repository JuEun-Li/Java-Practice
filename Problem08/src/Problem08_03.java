// 자동차 클래스 Car을 생성하자.
class Car {
	private String name;
	private String num;
	private int width; // 폭
	private int height; // 높이
	private int length; // 길이
	private double x; // x 좌표
	private double y; // y 좌표
	private double tank; // 탱크 용량
	private double fuel; // 남은 연료
	private double sfc; // 연비

	Car(String name, String num, int width, int height, int length, double x, double y, double tank, double fuel,
			double sfc) {
		this.name = name;
		this.num = num;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0;
		this.y = 0;
		this.tank = tank;
		this.fuel = fuel;
		this.sfc = sfc;
	}
}

public class Problem08_03 {

	public static void main(String[] args) {

	}

}
