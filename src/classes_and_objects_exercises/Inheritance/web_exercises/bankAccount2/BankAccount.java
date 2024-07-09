package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount2;

public class BankAccount {

	public double cashInAccount;
	public String accountName;
	
	BankAccount(String accountName, double cashInAccount){
		this.accountName = accountName;
		this.cashInAccount = cashInAccount;
	}
	
	public double deposit(double depositAmount){
		this.cashInAccount += depositAmount;

		return this.cashInAccount;
	}
	
	public double withdraw(double withdrawAmount){
		if(this.cashInAccount < withdrawAmount) {
			System.out.println("Invalid cash to withdraw from account");
		}else {
			this.cashInAccount -= withdrawAmount;
		}
		return this.cashInAccount;
	}
	
	public double getCash() {
		return this.cashInAccount;
	}
}
