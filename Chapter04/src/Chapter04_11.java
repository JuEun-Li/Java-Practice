import java.util.Scanner;

// 다수의 클래스 만들기 연습

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
		System.out.println("두 정수와 연산자를 입력하시오 >>");
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

// 객체 생성, 생성자 만들고, 호출하는 과정 다시 공부하기.
// 왜 생성자를 void로 선언하고, 어떤 때에 생략가능한지에 대해서 공부.
