package chapter03_1;

public class foreachEx {
	enum Week {
		��, ȭ, ��, ��, ��, ��, ��
	}

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };

		int sum = 0;

		for (int k : n) { //n[0] ~ [5]���� �ݺ�
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("����" + sum);

		for (String s : names) // names[0] ~ [5]���� �ݺ�
			System.out.print(s + " ");

		System.out.println(); // �� �ٲٱ��

		for (Week day : Week.values()) // week�� ����(�� ȭ �� ��,,)��ŭ �ݺ�
			System.out.print(day + "����");

		System.out.println();
	}

}
