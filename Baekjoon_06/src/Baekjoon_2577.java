import java.util.Scanner;

// �� ���� �ڿ��� A, B, C�� �־��� ��
//A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷�.
public class Baekjoon_2577 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int[] count = new int[10];
		int mul = 1;
		String s_mul;

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i] < 100 && a[i] >= 1000)
				break;
			mul = mul * a[i];
		} // �� �ڿ����� �Է¹ް�, ���Ѱ��� ���� mul�� ����
		
		s_mul = Integer.toString(mul); // ���Ѱ��� String���� ����ȯ
		
		for (int i = 0; i < s_mul.length(); ++i) {
            count[s_mul.charAt(i) - '0']++;
        } // String�� �ٽ� char�� ����ȯ ��  �ٽ� ������ ��ȯ�ϱ� ���� '0'�� ���ش�.

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		scanner.close();
	}

}
// [������� �κ�]
// ���� ����� ��� ���� �ϳ��ϳ��� �и��ؾ��ϴ°�?

// [�õ��ߴ� ���]
// ������� string���� ����ȯ �� ī������ �õ��Ͽ����� ����.

// [������ ����]
// String�� char�� ����ȯ �ϴ� ������ ������.

// [�ٸ� ���]
// 10~9 �ε����� ������ ��, ������� 10���� ���� �� ��� ��ġ�ϸ� �ش��ϴ� �ε������� 1 ���ϱ�. 