package chapter06_07;

import java.util.*;

public class Chapter06_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;

		while (true) {
			System.out.println("������ �Է��Ͻʽÿ�");
			word = scanner.nextLine();
			if (word.equals("�׸�"))
				break;
			StringTokenizer st = new StringTokenizer(word, " ");
			System.out.println("���� ������" + st.countTokens());
		}
		scanner.close();
	}
}

//�ڹٿ����� String�� token������ ���� �� �ִ� StringTokenizerŬ������ �����ȴ�.
// countTokens()�� �����ִ� ��ū�� ������ ��ȯ�Ѵ�.