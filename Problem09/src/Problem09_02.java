import java.util.Scanner;

// 사람 클래스의 인스턴스 배열
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

class HumanArrayTester {
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("No.%d %s %dcm %3dkg/n", i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
	} // Human형 1차원 배열의 모든 요소 표시
}

public class Problem09_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		// 1차원 배열을 생성과 동시에 초기화
		Human[] p = { new Human("철수", 170, 70), new Human("길동", 170, 70), };
	}

}
