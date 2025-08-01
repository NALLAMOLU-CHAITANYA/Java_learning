package com.solid.goodliskov;

public class LoanClosureService {
	private SecureLoan secureLoan;
	public LoanClosureService(SecureLoan secureLoan) {
		this.secureLoan = secureLoan;
	}
	public void forcecloseloan() {
		secureLoan.forceCloseLoan();
	}
	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan();
		LoanClosureService loanClosureService = new LoanClosureService(homeLoan);
		loanClosureService.forcecloseloan();
	}
}
