package chapter05_03;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); //추상메소드

	abstract protected String getSrcString(); //원 추상메소드

	abstract protected String getDestString(); //달러 추상메소드

	protected double ratio; //(변환)비율

	public void run() { //변환실행
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하시오>>");
		double val = scanner.nextDouble(); //변환할 값 입력받기
		double res = convert(val); //변환 후 값을 저장할 변수
		System.out.println("변환결과:" + res + getDestString() + "입니다.");
		scanner.close();
	}
}

class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	protected double convert(double src) {
		return src / ratio;
	}

	protected String getSrcString() {
		return "원";
	}

	protected String getDestString() {
		return "달러";
	}
}

public class Chapter05_03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
