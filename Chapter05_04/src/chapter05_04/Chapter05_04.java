package chapter05_04;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // �߻�޼ҵ�

	abstract protected String getSrcString(); // km �߻�޼ҵ�

	abstract protected String getDestString(); // mile �߻�޼ҵ�

	protected double ratio; // (��ȯ)����

	public void run() { // ��ȯ����
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��Ͻÿ�>>");
		double val = scanner.nextDouble(); // ��ȯ�� �� �Է¹ޱ�
		double res = convert(val); // ��ȯ �� ���� ������ ����
		System.out.println("��ȯ���:" + res + getDestString() + "�Դϴ�.");
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
