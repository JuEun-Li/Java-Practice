// ���� ���� Ŭ����

class Account {
	private String name;
	private String no;
	private long balance;

	Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	String getName() {
		return name;
	}// �̸� Ȯ��

	String getNo() {
		return no;
	} // ���¹�ȣ Ȯ��

	long balance() {
		return balance;
	} // �ܰ� Ȯ��

	void deposit(long k) {
		balance -= k;
	} // k�� �Ա�
	
	void withdraw(long k) {
		balance += k;
	} // k�� ���
}

public class Problem09_03 {

	public static void main(String[] args) {

	}

}
