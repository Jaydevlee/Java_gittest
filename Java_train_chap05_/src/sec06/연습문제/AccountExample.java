package sec06.연습문제;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(100);
		System.out.println(account.getBalance());
		
		account.setBalance(100000000);
		System.out.println(account.getBalance());
		
		account.setBalance(200000);
		System.out.println(account.getBalance());
	}

}
