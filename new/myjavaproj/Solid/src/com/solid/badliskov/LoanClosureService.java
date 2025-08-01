package com.solid.badliskov;

public class LoanClosureService {
	private Loanpayment loanpayment;
	public LoanClosureService(Loanpayment loanpayment) {
		this.loanpayment = loanpayment;
	}
	public void forcecloseloan() {
		loanpayment.forceCloseLoan();
	}
	public static void main(String[] args) {
		CreditCardLoan homeLoan = new CreditCardLoan();
		LoanClosureService loanClosureService = new LoanClosureService(homeLoan);
		loanClosureService.forcecloseloan();
	}
}
