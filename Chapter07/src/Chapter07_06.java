import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// �ؽø�  Ű�� �� ��� ����ϱ�
public class Chapter07_06 {

	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("�輺��", 97);
		score.put("Ȳ����", 88);
		score.put("�賲��", 98);

		System.out.println("HashMap�� ��� ����: " + score.size());

		// key ���ڿ��� ���� ���� set �÷��� ����
		Set<String> keys = score.keySet();
		// key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next();
			int javaScore = score.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
