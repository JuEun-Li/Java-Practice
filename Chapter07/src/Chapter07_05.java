import java.util.HashMap;
import java.util.Scanner;

//�ؽø��� �̿��Ͽ� �ܾ� �� �˻�
public class Chapter07_05 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		// 3���� �� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("ã�� ���� �ܾ��?>> ");
			String eng = scanner.next();
			if (eng.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}

			String kor = dic.get(eng); //get�޼ҵ带 �̿��Ͽ� Ž��
			if (kor == null)
				System.out.println(eng + "�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}

}
