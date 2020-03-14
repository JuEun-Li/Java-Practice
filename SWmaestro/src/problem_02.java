import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 7 segment display������ 10���� ���ڰ� ǥ�� �����ϴ�.
// ���� ȹ�� ���� ȹ 2�� ����.
// ���� ȹ + ���� ȹ �ִ� ���� 7.
// ö���� ����� ���ÿ� N�� ������ ȹ�� ������ �� �� �ִ�.
//ö���� ����� ǥ���� �� �ִ� ���� ū 10������?
*/

// N�� �Է����� �־��� ��
// ����� ǥ���� �� �ִ� ���� ū ������ ����غ���.
// N�� 2�̻� 1000������ ������.

// ����� ǥ���� �� �ִ� ���� ū ������ ������ ������ ǥ���� �� �ִ� �������� �ξ� Ŀ�� �� �ִ�.

public class problem_02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			n = Integer.parseInt(st.nextToken());

			if (n >= 2 && n <= 1000) {
				break;
			}
		}
		// N�� �Է� ����.

		String num = "";

		// ���� n�� Ȧ�����
		if (n % 2 == 1) {
			num = num + "7";

			for (int i = 0; i < ((n - 3) / 2); i++) {
				num = num + "1";
			}
		}
		// n�� ¦�� ���
		else {
			for (int i = 0; i < (n / 2); i++) {
				num = num + "1";
			}

		}
		System.out.println(Long.parseLong(num));
	}
}