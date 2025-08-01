package com.chaitanya.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle 
{
	@Autowired
	private Tyre tyre1;
	
	
	
	public void drive()
	{
		System.out.println("Car" + tyre1 + tyre1.getBrand());
	}
}
