package chapter05_04;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상메소드

	abstract protected String getSrcString(); // km 추상메소드

	abstract protected String getDestString(); // mile 추상메소드

	protected double ratio; // (변환)비율

	public void run() { // 변환실행
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.println(getSrcString() + "을 입력하시오>>");
		double val = scanner.nextDouble(); // 변환할 값 입력받기
		double res = convert(val); // 변환 후 값을 저장할 변수
		System.out.println("변환결과:" + res + getDestString() + "입니다.");
		scanner.close();
	}
}

class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	protected double convert(double src) {
		return src / ratio;
	}

	protected String getSrcString() {
		return "KM";
	}

	protected String getDestString() {
		return "mile";
	}
}

public class Chapter05_04 {

	public static void main(String[] args) {

		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
