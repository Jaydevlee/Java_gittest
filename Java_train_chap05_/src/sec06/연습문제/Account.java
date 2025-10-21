package sec06.연습문제;

public class Account {
	//필드
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	//생성자
	
	//메소드
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >=0 && balance <= 1000000) {
			this.balance = balance;
			System.out.println("잔고: " + balance);
		} else {
			System.out.println("0부터 1000000사이의 값을 입력하세요");
		}
		
	}
}
