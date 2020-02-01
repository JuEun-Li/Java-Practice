package chapter05_03;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); //�߻�޼ҵ�

	abstract protected String getSrcString(); //�� �߻�޼ҵ�

	abstract protected String getDestString(); //�޷� �߻�޼ҵ�

	protected double ratio; //(��ȯ)����

	public void run() { //��ȯ����
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.println(getSrcString() + "�� �Է��Ͻÿ�>>");
		double val = scanner.nextDouble(); //��ȯ�� �� �Է¹ޱ�
		double res = convert(val); //��ȯ �� ���� ������ ����
		System.out.println("��ȯ���:" + res + getDestString() + "�Դϴ�.");
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
		return "��";
	}

	protected String getDestString() {
		return "�޷�";
	}
}

public class Chapter05_03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}
