// Ŭ���� ���� ����
class Human {
	String name;
	int height;
	int weight;
}

public class Problem08_01 {

	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();

		gildong.name = "�浿";
		gildong.height = 180;
		gildong.weight = 70;

		chulsu.name = "ö��";
		chulsu.height = 180;
		chulsu.weight = 72;

		System.out.println("�̸�: " + gildong.name);
		System.out.println("Ű: " + gildong.height + "cm");
		System.out.println("������: " + gildong.weight + "kg");

		System.out.println("�̸�: " + chulsu.name);
		System.out.println("Ű: " + chulsu.height + "cm");
		System.out.println("������: " + chulsu.weight + "kg");

	}

}
