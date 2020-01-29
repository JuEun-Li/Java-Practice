package chapter04_11;

import java.util.Scanner;

class Add {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a + b;
	}
}

class Sub {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a - b;
	}
}

class Mul {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a * b;
	}
}

class Div {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {
		return a / b;
	}
}

public class Chapter04_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);

		switch (c) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			break;
		}
		System.out.println(result);
		scanner.close();
	}

}
