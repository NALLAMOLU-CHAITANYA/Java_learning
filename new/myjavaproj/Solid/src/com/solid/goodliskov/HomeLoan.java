package com.solid.goodliskov;

public class HomeLoan implements SecureLoan {

	@Override
	public void doPayment(int amount) {
		System.out.println(amount + "is paid for Home loan");
	}

	@Override
	public void forceCloseLoan() {
		System.out.println("Home loan is closed");
	}

}
