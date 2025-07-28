package ThreadTask;

class BankAcc {
	private int balance = 1000;
	public synchronized void withdraw(int amount,String user) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Remaining amount : " + balance);
		}else {
			System.out.println("Insufficient balance of the : " + user);
		}
	}
}

public class Task8 {

	public static void main(String[] args) {
		BankAcc acc = new BankAcc();
		
		Runnable user1 = () -> acc.withdraw(700, "Naveen");
		Runnable user2 = () -> acc.withdraw(500, "Bheem");
		
		new Thread(user1).start();
		new Thread(user2).start();
		

	}

}
