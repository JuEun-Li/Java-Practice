// 다른 사람이 변경할 수 있는 상태로 공개되지 않도록 클래스를 수정 
class Human {
	private String name;
	private int height;
	private int weight;

	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	} // 생성자 - private으로 선언된 변수에 접근, 필드를 초기화.

	String getName() {
		return name;
	}

	int getHeight() {
		return height;
	}

	int getWeight() {
		return weight;
	} // 이름, 체중, 신장 가져오기

	void gainWeight(int weight) {
		weight += weight;
	} // 살이 찐다.

	void reduceWeight(int weight) {
		weight += weight;
	} // 살이 빠진다.
}

public class Problem08_02 {

	public static void main(String[] args) {
		Human gildong = new Human("길동", 170, 60);
		Human chulsu = new Human("철수", 180, 70);

		gildong.gainWeight(3); // 길동이 2키로 찜
		chulsu.gainWeight(2); // 철수가 2키로 찜

		System.out.println("이름: " + gildong.getName());
		System.out.println("키: " + gildong.getHeight() + "cm");
		System.out.println("몸무게: " + gildong.getWeight() + "kg");

		System.out.println("이름: " + chulsu.getName());
		System.out.println("키: " + chulsu.getHeight() + "cm");
		System.out.println("몸무게: " + chulsu.getWeight() + "kg");
	}

}
