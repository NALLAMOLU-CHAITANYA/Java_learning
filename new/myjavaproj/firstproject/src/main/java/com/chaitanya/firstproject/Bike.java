package com.chaitanya.firstproject;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle 
{
	public void drive() 
	{
		System.out.println(" bike Bhaag raha hai");
	}
}
