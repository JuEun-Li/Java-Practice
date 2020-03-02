import java.util.Scanner;
import java.util.Vector;

public class Problem07_01 {

	public static void printBig(Vector<Integer> v) {
		//���� v�� ������ ���� ū �� �Ǻ��Ͽ� ����ϱ�
		int big = v.get(0); // ��ó���� ������ ���� ���� ū ��
		for (int i = 1; i < v.size(); i++) {
			if (big < v.get(i)) // i�� �� ũ��
				big = v.get(i); // i�� ��ü
		}

		System.out.println("���� ū ����" + big);
	}

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("����(-1�� �Էµ� ������)>>");
		while (true) {
			int number = scanner.nextInt();
			if (number == (-1))
				break;

			v.add(number); // ���� ����
		}

		if (v.size() == 0) {
			System.out.println("���� �ϳ��� ����");
			scanner.close();
			return;
		}
		printBig(v); // �ٷ� ���� ����
		scanner.close();
	}
}
