package account;

public class Account {
	String owner, accountNo;
	int balance;
	
	public Account(String owner, String accountNo) {
		this.owner = owner;
		this.accountNo = accountNo;
	}
	public Account(String owner, String accountNo, int balance) {
		this(owner, accountNo);
		this.balance = balance;
	}
	public void output(int i) {
		// TODO Auto-generated method stub
		
	}
	public void input(int i) {
		// TODO Auto-generated method stub
		
	}

}
