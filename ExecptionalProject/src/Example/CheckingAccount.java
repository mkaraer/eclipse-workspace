package Example;

public class CheckingAccount extends BankAccount{

	private int balance;

	public CheckingAccount(String cardName, long cardNum, int balance) {
		super(cardNum, cardName);
		this.balance=balance;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CheckingAccount [balance="+balance +"]";
	}

	@Override
	public void deposit(int num1) throws RuntimeException {
		// TODO Auto-generated method stub
		this.balance=(int)(num1*1.1)+this.balance;
	}

	@Override
	public void withdraw(int num2) throws RuntimeException {
		
		// TODO Auto-generated method stub
		this.balance-=num2;
		if(this.balance<0) {
			throw new RuntimeException();
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
}
