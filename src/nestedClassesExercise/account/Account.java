package nestedClassesExercise.account;

public class Account {
	
	int id;
	Transaction[] transactions;
	
	public Account(int id, Transaction[] transactions) {
		this.id = id;
		this.transactions = transactions;
	}
	
	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
		/*
		 * Let's use this method in getTransactions() method.
		 */
		moneyAmount = 10;
		accountTo.id = 1;
		
	}
	
	public void withdrawMoney(double moneyAmount) {
		double account = 1000;
		
		account = account-moneyAmount;
		
	}
	
	public Transaction[] getTransactions() {
		
		//A trial to put the Account class credentials accountFrom and accountTo into the Transaction array,
		//this array will have a new object, which will have values from Transaction class inside the curly brackets.
		return transactions;
	}
	
	public static class Transaction {
		Account accountFrom;
		Account accountTo;
		double moneyAmount;
		StandardAccountOperations operation;
		/*
		 * We are going to use both accountFrom and accountTo and the amount of money that is either
		 * going to be either in sending process or receiving process, which based on them we are going 
		 */
		
		public Transaction(Account accountFrom, Account accountTo, double moneyAmount) {
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmount = moneyAmount;
		}
		
	}
}
