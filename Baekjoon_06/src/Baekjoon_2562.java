import java.util.Scanner;

// 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã��
// �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Baekjoon_2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = -999;
		int count = 0;
		int[] a = new int[9];

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i] >= 100)
				break;
			if (max < a[i])
				max = a[i];
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == max)
				break;
			else
				count = count + 1;
		}
		System.out.println(max);
		System.out.println(count + 1); // �ִ��� ������ ī������ �� ��ä �ݺ����� ����ǹǷ� 1�� �����ش�.
		scanner.close();
	}

}

// [������� ��]
// �ִ��� �� ��°�� �ִ��� ��� �˾Ƴ� ���ΰ�?
// �ִ��� �ڸ����� 1��ŭ ���� ��µǴ� ����.

// [�ذ� ���]
// �ݺ����� 2�� ���. �ϳ��� �ִ� ���ϱ�. �ٸ� �ϳ��� �ִ� Ž���ϱ�.
// �ִ��� ã�� ���ϸ� ī����, �ִ��� ã���� �ݺ����� ���������� �Ѵ�.
// �ִ��� ã���� �� ī������ ä �Ǳ� ���� �ݺ����� �����Ƿ�, ����� �� +1�� ���־���Ѵ�.

// [�� �����غ� ��]
// �ִ��� ã�� �׶� �ٷ� �ڸ����� ����� �� �ִ� ����� ã�ƺ���.
// i���� ����ϸ� �� ���������� ������?