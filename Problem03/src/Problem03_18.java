import java.util.Scanner;

//�� ���� ������ ��������(ū ����)���� �����ϱ�
public class Problem03_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�� ������ �Է��Ͻÿ�");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int max = 0, min = 0;

		if (a < b) {
			max = b;
			min = a;
		} else if (a > b) {
			max = a;
			min = b;
		} else
			System.out.println("���� �� �Դϴ�.");

		System.out.println("�������� ���>>" + max, min);
		
		scanner.close();
	}

	//������ ������� �ӽú��� temp�� ����غ� ��.
}
