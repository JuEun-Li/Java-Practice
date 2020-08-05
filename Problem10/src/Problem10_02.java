 // Human 클래스에서 식별 번호와 관련된 처리만 추출해서, 일련 번호를 생성하는 id클래스 작성
class ID {
	static int counter = 0; // 몇 번까지 식별번호를 부여했는가.
	private int id; // 식별 번호
	
	public ID() {
		id = ++counter;
	}
	
	public int getId() {
		return id;
	}
}
public class Problem10_02 {

	public static void main(String[] args) {
		ID a = new ID();
		ID b = new ID();
		
		System.out.println("a의 일련번호: " + a.getId());
		System.out.println("b의 일련번호: " + b.getId());
		
		System.out.println("ID.counter: " + ID.counter);
		System.out.println("a.counter: " + a.counter);
		System.out.println("b.counter: " + b.counter);
	}

}
