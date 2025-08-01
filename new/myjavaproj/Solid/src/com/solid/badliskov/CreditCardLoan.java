package com.solid.badliskov;

public class CreditCardLoan implements Loanpayment {

	@Override
	public void doPayment(int amount) {
		System.out.println(amount + "is paid for creditcard");
	}

	@Override
	public void forceCloseLoan() {
		throw new UnsupportedOperationException("Force close loan for the creditcard is not accepted");
	}

}
