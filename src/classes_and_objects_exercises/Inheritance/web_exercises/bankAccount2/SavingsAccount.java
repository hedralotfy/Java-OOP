package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount2;

public class SavingsAccount extends BankAccount{

	SavingsAccount(String accountName, double cashInAccount){
		super(accountName, cashInAccount);
	}
	
	public double deposit(double depositAmount){
		super.deposit(depositAmount);

		return this.cashInAccount;
	}
	
	public double withdraw(double withdrawAmount){
		if(getCash() - withdrawAmount < 100) {
			System.out.println("Required cash should be more than $100");
		}
		else {
			super.withdraw(withdrawAmount);
		}
		return this.cashInAccount;
	}
}
