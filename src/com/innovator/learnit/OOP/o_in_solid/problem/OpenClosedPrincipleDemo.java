package com.innovator.learnit.OOP.o_in_solid.problem;

public class OpenClosedPrincipleDemo {

	public static void main(String[] args) {
		LoanHandler loanHandler = new LoanHandler();
		User user = new User();

		loanHandler.approvePersonalLoan(user);
		loanHandler.approveMortgage(user);

	}
}
