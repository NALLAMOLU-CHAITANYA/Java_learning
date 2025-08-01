package com.solid.badliskov;

public interface Loanpayment {
	public void doPayment(int amount);
	public void forceCloseLoan();
}
