// 클래스 생성 기초
class Human_1 {
	String name;
	int height;
	int weight;
}

public class Problem08_01 {

	public static void main(String[] args) {
		Human_1 gildong = new Human_1();
		Human_1 chulsu = new Human_1();

		gildong.name = "길동";
		gildong.height = 180;
		gildong.weight = 70;

		chulsu.name = "철수";
		chulsu.height = 180;
		chulsu.weight = 72;

		System.out.println("이름: " + gildong.name);
		System.out.println("키: " + gildong.height + "cm");
		System.out.println("몸무게: " + gildong.weight + "kg");

		System.out.println("이름: " + chulsu.name);
		System.out.println("키: " + chulsu.height + "cm");
		System.out.println("몸무게: " + chulsu.weight + "kg");

	}

}
