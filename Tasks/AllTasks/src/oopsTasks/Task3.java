package oopsTasks;

class BankAccount {
	private String accountnumber;
	private double balance;
	
	public BankAccount(String accountnumber,double initialbalance ) {
		this.accountnumber = accountnumber;
		this.balance = initialbalance;
				
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("After Deposit amount :  " + balance);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("After withdrwn remaining amount : " + balance);
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
}

public class Task3 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("1245678",1000.0);
		
		System.out.println("Account Number: " + account.getAccountnumber());
        System.out.println("Initial Balance: " + account.getBalance());
        
	account.deposit(500);
		account.withdraw(300);

		System.out.println("Total Account balance : " + account.getBalance());
	}

}
