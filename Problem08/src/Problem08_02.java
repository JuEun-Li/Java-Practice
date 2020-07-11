// �ٸ� ����� ������ �� �ִ� ���·� �������� �ʵ��� Ŭ������ ���� 
class Human {
	private String name;
	private int height;
	private int weight;

	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	} // ������ - private���� ����� ������ ����, �ʵ带 �ʱ�ȭ.

	String getName() {
		return name;
	}

	int getHeight() {
		return height;
	}

	int getWeight() {
		return weight;
	} // �̸�, ü��, ���� ��������

	void gainWeight(int weight) {
		weight += weight;
	} // ���� ���.

	void reduceWeight(int weight) {
		weight += weight;
	} // ���� ������.
}

public class Problem08_02 {

	public static void main(String[] args) {
		Human gildong = new Human("�浿", 170, 60);
		Human chulsu = new Human("ö��", 180, 70);

		gildong.gainWeight(3); // �浿�� 2Ű�� ��
		chulsu.gainWeight(2); // ö���� 2Ű�� ��

		System.out.println("�̸�: " + gildong.getName());
		System.out.println("Ű: " + gildong.getHeight() + "cm");
		System.out.println("������: " + gildong.getWeight() + "kg");

		System.out.println("�̸�: " + chulsu.getName());
		System.out.println("Ű: " + chulsu.getHeight() + "cm");
		System.out.println("������: " + chulsu.getWeight() + "kg");
	}

}
