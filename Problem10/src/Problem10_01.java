class Human {
	private static int counter = 0; // �� ������ �ĺ� ��ȣ�� �ο��ߴ���
	private String name;
	private int height;
	private int weight;
	private int id; // �ĺ� ��ȣ

	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}

	public String getName() {
		return name;
	} // �̸� �ҷ�����

	public int getHeight() {
		return height;
	} // Ű �ҷ�����

	public int getWeight() {
		return weight;
	} // ������ �ҷ�����

	public void gainWeight(int w) {
		weight = weight + w; // ���� ���
	}

	public void reduceWeight(int w) {
		weight = weight - w;
	} // ���� ������.

	public int getId() {
		return id;
	} // �ĺ� ��ȣ ��������
	
	public void putData() {
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " + height + "cm");
		System.out.println("������ " + weight + "kg");
	}
}

public class Problem10_01 {

	public static void main(String[] args) {
		Human gildong = new Human("ȫ�浿", 170, 60);
		Human chulsu = new Human("��ö��", 166, 72);
		
		gildong.putData(); // �浿�� ������ ǥ��
		System.out.println("��ȣ:" + gildong.getId()); // �浿�� �ĺ���ȣ
		
		chulsu.putData();
		System.out.println("��ȣ:" + chulsu.getId()); // ö���� �ĺ���ȣ
	}

}

// static���� ����� Ŭ���� ������ �����ʵ��� �Ҹ���.
// Ŭ���� ������ �ν��Ͻ��� ������� 1���� �����ϸ�, ��ΰ� �����ϴ� �������̴�.