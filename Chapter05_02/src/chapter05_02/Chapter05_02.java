package chapter05_02;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int resolution;

	ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}

	public void printProperty() {
		System.out.println(getSize() + "��ġ" + resolution + "�÷�");
	}
}

class IPTV extends ColorTV {
	private String address;

	IPTV(String address, int size, int resolution) {
		super(size, resolution); //super�� �޼ҵ� �� ������ ����
		this.address = address;
	}

	public void printAddress() {
		System.out.println("����IPTV��" + address + "�ּ���");
		super.printProperty();
	}
}

public class Chapter05_02 {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
