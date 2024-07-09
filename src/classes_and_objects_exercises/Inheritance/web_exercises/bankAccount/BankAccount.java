package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount;

public class BankAccount {
	
	/*
	 * Here, some properties are just declared
	 * as they were put into consideration.
	 */
	public double cashInAccount;
	public double withdrawAmount;
	public double depositAmount;
	
	/*
	 * Here, this constructor sets the value of
	 * cashInAccount variable to the parameter passed
	 * to it. 
	 */
	BankAccount(double cashInAccount){
		this.cashInAccount = cashInAccount;
	}
	
	/*
	 * Here, the initial return values of both methods
	 * will be 0. 
	 */
	
	public double deposit(){
		return 0.0;
	}
	
	public double withdraw(){
		return 0.0;
	}

}
