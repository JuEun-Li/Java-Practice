class Human {
	private static int counter = 0; // 몇 번까지 식별 번호를 부여했는지
	private String name;
	private int height;
	private int weight;
	private int id; // 식별 번호

	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}

	public String getName() {
		return name;
	} // 이름 불러오기

	public int getHeight() {
		return height;
	} // 키 불러오기

	public int getWeight() {
		return weight;
	} // 몸무게 불러오기

	public void gainWeight(int w) {
		weight = weight + w; // 살이 찐다
	}

	public void reduceWeight(int w) {
		weight = weight - w;
	} // 살이 빠진다.

	public int getId() {
		return id;
	} // 식별 번호 가져오기
	
	public void putData() {
		System.out.println("이름: " + name);
		System.out.println("키: " + height + "cm");
		System.out.println("몸무게 " + weight + "kg");
	}
}

public class Problem10_01 {

	public static void main(String[] args) {
		Human gildong = new Human("홍길동", 170, 60);
		Human chulsu = new Human("김철수", 166, 72);
		
		gildong.putData(); // 길동의 데이터 표시
		System.out.println("번호:" + gildong.getId()); // 길동의 식별번호
		
		chulsu.putData();
		System.out.println("번호:" + chulsu.getId()); // 철수의 식별번호
	}

}

// static으로 선언된 클래스 변수는 정적필드라고 불린다.
// 클래스 변수는 인스턴스와 관계없이 1개만 존재하며, 모두가 공유하는 데이터이다.