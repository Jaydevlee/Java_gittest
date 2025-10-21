package sec06.연습문제;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(100);
		account.getBalance();
		
		account.setBalance(100000000);
		account.getBalance();
	}

}
