public class SavingsAccount {
	
	// Properties
	private int balance; //the amount of money in the account
	// Constructors
	public SavingsAccount(){
		balance = 0;
	};
	public SavingsAccount(int initialBalance){
		balance = initialBalance;
	}
	// Methods
	public void greet(){
		System.out.println("Welcome to your Savings Account");
	}
	public void showBalance(){
		System.out.println(balance);
	}
	public void deposit(int howMuch) {
		if (howMuch >= 0) balance = balance + howMuch;
		else{
			System.out.println("Negative numbers are not allowed, try again");
		}
	}
	public void withdraw(int howMuch){
		if (howMuch >= 0) balance -= howMuch;
		else{
			System.out.println("Negative numbers are not allowed, try again");
		}
	}
	
	
	
	
}