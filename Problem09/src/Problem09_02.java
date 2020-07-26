import java.util.Scanner;

// ��� Ŭ������ �ν��Ͻ� �迭
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

class HumanArrayTester {
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("No.%d %s %dcm %3dkg/n", i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
		}
	} // Human�� 1���� �迭�� ��� ��� ǥ��
}

public class Problem09_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;

		// 1���� �迭�� ������ ���ÿ� �ʱ�ȭ
		Human[] p = { new Human("ö��", 170, 70), new Human("�浿", 170, 70), };
	}

}
