package task6;

public class Account {
	 private int accountNumber;
	    private String accountHolderName;
	    private double balance;

	    // No-argument constructor
	    public Account() {
	        this.accountNumber = 0;
	        this.accountHolderName = "Default Name";
	        this.balance = 0.0;
	    }

	    // Two-argument constructor
	    public Account(int accountNumber, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = 0.0;
	    }

	    // Method to withdraw balance
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= this.balance) {
	            this.balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: " + this.balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance.");
	        }
	    }

	    // Method to deposit balance
	    public void deposit(double amount) {
	        if (amount > 0) {
	            this.balance += amount;
	            System.out.println("Deposit successful. New balance: " + this.balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to check balance
	    public void checkBalance() {
	        System.out.println("Account Number: " + this.accountNumber);
	        System.out.println("Account Holder Name: " + this.accountHolderName);
	        System.out.println("Current Balance: " + this.balance);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating objects using different constructors
        Account account1 = new Account();
        Account account2 = new Account(123456789, "Edgar");

        // Performing operations on account1
        System.out.println("Operations on account1:");
        account1.checkBalance();
        account1.deposit(1200);
        account1.withdraw(500);
        account1.checkBalance();

        // Performing operations on account2
        System.out.println("\nOperations on account2:");
        account2.checkBalance();
        account2.deposit(2500);
        account2.withdraw(1500);
        account2.checkBalance();

	}

}
