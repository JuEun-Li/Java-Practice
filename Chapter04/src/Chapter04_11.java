import java.util.Scanner;

// �ټ��� Ŭ���� ����� ����

class Add {
	private int a;
	private int b;

	public void Set_Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int Calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	public void Set_Sub(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int Calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	public void Set_Mul(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int Calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	public void Set_Div(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int Calculate() {
		return a / b;
	}
}

public class Chapter04_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ� >>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int result = 0;

		if (c == '+') {
			Add add = new Add();
			add.Set_Add(num1, num2);
			result = add.Calculate();
		}

		else if (c == '-') {
			Div div = new Div();
			div.Set_Div(num1, num2);
			result = div.Calculate();
		}

		else if (c == '*') {
			Mul mul = new Mul();
			mul.Set_Mul(num1, num2);
			result = mul.Calculate();
		}

		else if (c == '/') {
			Div div = new Div();
			div.Set_Div(num1, num2);
			result = div.Calculate();
		}

		System.out.println(result);
		scanner.close();
	}

}

// ��ü ����, ������ �����, ȣ���ϴ� ���� �ٽ� �����ϱ�.
// �� �����ڸ� void�� �����ϰ�, � ���� �������������� ���ؼ� ����.
