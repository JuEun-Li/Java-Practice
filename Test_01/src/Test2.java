
public class Test2 {

	public static void main(String[] args) {
		double a = 0.1;
		a = Math.sqrt(a);
		
		System.out.println((1 / a) * 365);
		System.out.println(365 + 365 * 2.3);
		
		System.out.println("--------------");
		
		double t = 0.6; // ������ �ð�(9���� 5)
		//double tp = (3 * 100000000) * 86400 * 1000; // ���� �̵��� �ð�
		
		t = Math.sqrt(t);
		
		System.out.println("���� ���� ��: " + (1 / t) * (4000 / 3));
	}

}
