import java.util.Scanner;

// ���ڿ��� �Է¹޾� �� ���ھ� ȸ������ ��� ����ϴ� ���α׷�
public class Chapter06_08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�. >>");
		String line = scanner.nextLine();

		for (int i = 1; i <= line.length(); i++) {
			System.out.print(line.substring(i));
			System.out.println(line.substring(0, i));
		}

	}

}

// [substring �Լ�]
// line.substring(i) = i�� ������ġ. i���� ���ڿ� �������� ��ȯ�Ѵ�.
// line.substring(0, i) = 0���� i��° ������ ��ȯ�Ѵ�.
// �ݺ������� ����� �� i������ ����(��)��ġ�� �����ص� ������, 
// �� �ܿ��� ������ ����ϴ� ���� �Ϲ���.