package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount;

public class SavingsAccount extends BankAccount {

	/*
	 * Here, we will pass the parameter of current constructor as a parameter to the
	 * parent constructor.
	 */

	SavingsAccount(double cashInAccount) {
		super(cashInAccount);
	}

	/*
	 * Here, this method will operate on the variable depositAmount in the parent
	 * class and assign to it its parameter, then it will add to cashInAccount the
	 * value of depositAmount.
	 * 
	 * Then value of cashInAccount will be returned.
	 */

	public double deposit(double depositAmount) {
		this.depositAmount = depositAmount;

		System.out.print("Your cash after deposit is ");
		this.cashInAccount += this.depositAmount;
		return this.cashInAccount;
	}

	/*
	 * What we did with deposit() will the same with the withdraw() method in
	 * addition that we will check if the value of withdrawAmount is less than 100,
	 * in this case we will show user that his withdrawal amount is invalid, then
	 * return cashInAccount variable in BankAccount.
	 */
	
	public double withdraw(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		if (this.withdrawAmount < 100) {
			System.out.print("Withdrawal amount is invalid, your cash is ");
			return this.cashInAccount;
		} else {
			System.out.print("Cash after withdrawal is ");
			this.cashInAccount -= this.withdrawAmount;
		}
		return this.cashInAccount;
	}
}
