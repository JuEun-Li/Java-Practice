import java.util.Scanner;

public class Chapter02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>> ");

		int bill = scanner.nextInt();

		int won50000 = bill / 50000;
		bill = bill % 50000;
		System.out.println("50000����: " + won50000 + "��");

		int won10000 = bill / 10000;
		bill = bill % 10000;
		System.out.println("10000����: " + won10000 + "��");

		int won5000 = bill / 5000;
		bill = bill % 5000;
		System.out.println("5000����: " + won5000 + "��");

		int won1000 = bill / 1000;
		bill = bill % 1000;
		System.out.println("1000����: " + won1000 + "��");

		int won500 = bill / 500;
		bill = bill % 500;
		System.out.println("500����: " + won500 + "��");

		int won100 = bill / 100;
		bill = bill % 100;
		System.out.println("100����: " + won100 + "��");
	}

}
