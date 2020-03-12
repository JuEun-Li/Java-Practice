import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*class Information {
	private String name;
	private int score;

	public Information(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String find_name() {
		return name;
	}

	public int find_score() {
		return score;
	}
}*/

public class Problem07_07 {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̷� ���б� �����ý��� �Դϴ�.");

		for (int i = 0; i < 5; i++) {
			System.out.println("�̸��� ����");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			double score = scanner.nextDouble();
			hm.put(name, score);
		} // �ؽøʿ� key, value ���� �Ϸ�.

		System.out.println("���л� ���� ���� ���� �Է�>> ");
		Double cutLine = scanner.nextDouble(); // ���б� ���� ���� ����

		Set<String> keys = hm.keySet(); // string�� Ű��.
		Iterator<String> it = keys.iterator(); // keys(set)�� ����� ��ü�� �����´�.

		System.out.println("���л� ���� ���");
		while (it.hasNext()) {
			String name = it.next();
			double score = hm.get(name);
			if (score >= cutLine) {
				System.out.print(name + " ");
			}
			scanner.close();
		}
	}
}

/*
 * �ؽøʿ��� key��, value�� �ΰ��� ������ �� �ִ�. key���� value���� 2���� �����θ� �޴´ٸ� ���� Ŭ������ ������ �ʿ�
 * ����. ������ �������� value���� �޾ƾ��� ���� Ŭ������ ������ ��, �Ѳ����� ���� �Է� �޾� value���� Ŭ���� �̸��� �����ָ�
 * �ȴ�. ������ ���� �� ���� �Է��ϰ� �����ϱ� ���Ͽ� StringTokenizer()�޼ҵ尡 ���̴� ��. �� ���������� �̸��� ���� ��
 * ���� �޾�ì��� �ǹǷ�, ���� �Է¹��� �� �ٷ� �ؽøʿ� �����ϸ� �ȴ�.
 */