import java.util.ArrayList;
import java.util.Scanner;

// N�� �ڿ����� ����
// K�� ���������� ����ϴ� �ڿ���(2 �̻� N����)
public class problem_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();

		int N = scanner.nextInt(); // �ڿ����� ����
		int k = scanner.nextInt(); // ���������� �����ϴ� �ڿ���

		for (int i = 1; i <= N; i++) {
			int num = scanner.nextInt();
			ar.add(num);
		} // 1���� ũ�� N���� ���� �ڿ����� �Է¹޾� ��� ar�� ����.

		// int min = Collections.min(ar); // ar�� ����� ������ �ּҰ� ã��.
		int min = 0;
		int count = 0;

		for (int j = 1; j <= N; j = j + (k - 1)) { // N���� ���� �� ���� �ݺ�
			//System.out.println("j�� ��:"+j);

			for (int i = 1; i <= k; i++) { // k�� ������ŭ �������� ������ ��
				ar.get(i); // i��° �迭�� �� 1�� ��������
				if (ar.get(i) > min)
					min = i; // k���� ������ �� �ּҰ� ã��.

				ar.remove(i); // �ε��� i ��� ����
				ar.add(i, min); // i�ڸ��� min�� ����
				
				
				
			}
			count = count + 1;
			//System.out.println("count����: "+count);
		}
		System.out.println(count);
		scanner.close();
	}

}
