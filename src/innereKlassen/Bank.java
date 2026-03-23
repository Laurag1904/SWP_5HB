package innereKlassen;

public class Bank {
	
	private double balance;
	
	public void showBalance() {
		System.out.println(balance);
	}

	public class Account{
		public void deposit(double amount) {
			balance = balance + amount;
			
		}
	}
}
