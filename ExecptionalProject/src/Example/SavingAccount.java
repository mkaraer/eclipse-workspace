package Example;

public class SavingAccount extends BankAccount {
 
	
private int balance;
 double penalty;
 
 public SavingAccount(String cardName, long cardNum, int balance) {
		super(cardNum, cardName);
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}

@Override
public void deposit(int d) throws RuntimeException {
	// TODO Auto-generated method stub
	
}

@Override
public void withdraw(int w) throws RuntimeException {
	if(balance<0) {
		throw new RuntimeException();
	}
	
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	
	this.balance = balance;
}

public double getPenalty() {
	return penalty;
}

public void setPenalty(double penalty) {
	this.penalty = penalty;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "SavingAccount[balance="+balance+",penalty="+penalty+"]";
}
 
 
	
}
