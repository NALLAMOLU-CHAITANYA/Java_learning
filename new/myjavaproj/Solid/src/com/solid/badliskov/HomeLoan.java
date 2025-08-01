package com.solid.badliskov;

public class HomeLoan implements Loanpayment {

	@Override
	public void doPayment(int amount) {
		System.out.println(amount + "is paid for Home loan");
	}

	@Override
	public void forceCloseLoan() {
		System.out.println("Home loan is closed");
	}

}
