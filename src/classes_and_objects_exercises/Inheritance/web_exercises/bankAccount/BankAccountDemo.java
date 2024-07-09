package classes_and_objects_exercises.Inheritance.web_exercises.bankAccount;

import java.util.Scanner;

public class BankAccountDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the cash amount ");
		double cash = in.nextDouble();
		
		//Here, SavingsAccount object will be instantiated. 
		SavingsAccount sacc = new SavingsAccount(cash);
		
		System.out.println("Would you like to deposit or withdraw"
				+ "\nFor deposit press \"D\" "
				+ "\nFor withdraw press \"W\" ");
		String choice = in.next();
		
		switch(choice) {
		case "D":
			System.out.println("Enter the amount you want ");
			double deposit = in.nextDouble();
			//Here, the deposit() method body in the SavingsAccount class
			// will be executed, the method inherited from BankAccount class
			// and the body of the original method will be skipped.
			System.out.println(sacc.deposit(deposit));
			break;
		case "W":
			System.out.println("Enter the amount you want ");
			double withdraw = in.nextDouble();
			System.out.println(sacc.withdraw(withdraw)); 
			break;
		default:
			System.out.println("You have entered incorrect choice.");
		}

	}
	//Code is tiny compared to that of w3reresource.

}
