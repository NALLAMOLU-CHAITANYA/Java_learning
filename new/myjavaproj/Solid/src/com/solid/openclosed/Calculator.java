package com.solid.openclosed;

public class Calculator {
	public static Operation operation;
	
	public int Calculatenumber(int num1, int num2, AddOperation operation) {
		return operation.perform(num1, num2);
	}
	
	public static void main(String[] args) {
		AddOperation Addoperation = new AddOperation();
		Calculator cal = new Calculator();
		System.out.println(cal.Calculatenumber(1, 2, Addoperation));
	}
}
