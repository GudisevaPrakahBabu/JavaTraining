//Main class
public class Encapsulation {
	
	// Main method
	public static void main(String[] args) {
		
		// Creating Reference object(BA1) to initialize BankAccount class
		BankAccount BA1 = new BankAccount();
		
		// Setting the value to the private attributes using setter method.
		BA1.setAccountNumber("A1233R2341");
		BA1.setBalance(232.21324677121425);
		BA1.setAccountHolderName("Prakash");
		
		// Retrieving (or) Getting the values(stored or set using setter method) using getter method.
		System.out.println("\nAccount Holder Name: " + BA1.getAccountHolderName());
		System.out.println("Account Number: " + BA1.getAccountNumber());
		System.out.println("Balance: INR " + BA1.getBalance() + " /-");
		

		// Setting new values to the attributes using setters
		BA1.setAccountNumber("B1233R22A423");
		BA1.setBalance(1231232.2132467725);
		BA1.setAccountHolderName("ash");
		
		// Retrieving values in attributes using getters
		System.out.println("\nAccount Holder Name: " + BA1.getAccountHolderName());
		System.out.println("Account Number: " + BA1.getAccountNumber());
		System.out.println("Balance: INR " + BA1.getBalance() + " /-");
	}

}


// Base Class -- BankAccount
class BankAccount
{
	// Private Attributes
	private String accountNumber;
	private double balance;
	private String accountHolderName;
	
	//Generating getter and setter method for the private attributes -- accountNumber, balance, accountHolderName
	
	// Public getter method for accountNumber attribute
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	// Public setter method for accountNumber attribute
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	
	// Public getter method for balance attribute
	public double getBalance()
	{
		return balance;
	}
	// Public setter method for balance attribute
	public void setBalance(double balance) 
	{
		// Making sure that bank balance is not Negative
		if (balance >= 0) 
		{
			this.balance = balance;
		}
		else {
			
			System.out.println("Your Account Balance is in Negative");
		}
	}
	
	
	// Public getter method for accountHolderName attribute
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	// Public setter method for accountHolderName attribute
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}

}
