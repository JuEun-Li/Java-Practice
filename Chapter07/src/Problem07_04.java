import java.util.Scanner;
import java.util.Vector;

public class Problem07_04 {

	public static void main(String[] args) {
		Vector<Integer> mm = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("������ �Է� (0�Է½� ����) >> ");
			int pre = scanner.nextInt();
			if (pre == 0)
				break;

			mm.add(pre); // mm�� ������ �߰�
			int sum = 0;
			
			for (int i = 0; i < mm.size(); i++) {
				System.out.print(mm.get(i) + " "); // index i ���
				sum += mm.get(i); // �հ�� i��° ������ ���� ��.
			}

			System.out.println("���� �����: " + sum / mm.size());
		}
		scanner.close();
	}
}
// sum���� while�� ���ʿ��� �������� ������ ������ ���.
// ������ ������ Ȯ���ϰ� ���� �� get() �޼ҵ带 ����Ѵ�.