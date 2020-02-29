import java.util.*;

public class chapter07_08 {
	// collections Ŭ���� Ȱ���ϱ�.
	static void printList(LinkedList<String> l) {

		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;

			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";

			System.out.print(e + separator);// e�� separator�� �����ؼ� ���
		}

	}

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();

		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");

		Collections.sort(myList); // static �޼ҵ��̹Ƿ� Ŭ���� �̸����� �ٷ� ȣ���Ѵ�.
		printList(myList); // ���õ� ������� ���

		Collections.reverse(myList);
		printList(myList); // �Ųٷ� ���

		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ��" + index + "��° ����Դϴ�.");

	}

}
/* Collections Ŭ������ �ֿ� �޼ҵ�:
 * �÷��ǿ� ���Ե� ��ҵ��� �����ϴ� sort()
 * ����� ������ �ݴ�� �ϴ� reverse()
 * ��ҵ��� �ִ�, �ּڰ��� ã�Ƴ��� max(), min()
 * Ư�� ���� �˻��ϴ� binarySearch()
*/
