// 은행 계좌 클래스

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
	}// 이름 확인

	String getNo() {
		return no;
	} // 계좌번호 확인

	long balance() {
		return balance;
	} // 잔고 확인

	void deposit(long k) {
		balance -= k;
	} // k원 입금
	
	void withdraw(long k) {
		balance += k;
	} // k원 출금
}

public class Problem09_03 {

	public static void main(String[] args) {

	}

}
