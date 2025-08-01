package com.solid.goodliskov;

public class CreditCardLoan implements LoanPayment{

	@Override
	public void doPayment(int amount) {
		System.out.println(amount + "is paid for Credit card loan");
		
	}

}
