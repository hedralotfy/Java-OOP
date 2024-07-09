package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount2;

public class BankAccountDemo {

	public static void main(String[] args) {
		BankAccount bnk = new BankAccount("BA1933", 200000);
		
		//Creating a bank account BA1933: 
		System.out.println("Creating a bank account BA1933 with cash: " + bnk.getCash());
		
		//Deposit 100$ into the account.
		System.out.println("Deposit $100 into the account ");
		System.out.println("Your cash after depositing $100 " + bnk.deposit(100));
		
		System.out.println("Withdraw $200101 from the account ");
		System.out.println("Your cash after withdrawing $200101 is " + bnk.withdraw(200101));
		
		System.out.println("\n=============================\n");
		
		SavingsAccount sacc = new SavingsAccount("SA1945", 200000);
		//Creating a savings account SA1945:
		System.out.println("Creating a savings account BA1933 with cash: " + sacc.getCash());
		
		//Deposit 100$ into the account.
		System.out.println("Deposit $100 into the account ");
		System.out.println("Your cash after depositing $100 is " + sacc.deposit(100));
		
		System.out.println("Withdraw $200101 from the account ");
		System.out.println("Your cash after withdrawing $200101 is " + sacc.withdraw(200101));
		

	}

}
