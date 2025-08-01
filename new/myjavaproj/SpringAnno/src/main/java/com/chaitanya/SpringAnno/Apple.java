package com.chaitanya.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Apple 
{
	@Autowired
	@Qualifier("m1")
	MobileProcessor cpu;
	
//	 public MobileProcessor getCpu() 
//	   {
//		   return cpu;
//	   }
//
//	   public void setCpu(MobileProcessor cpu) 
//	   {
//		   this.cpu = cpu;
//	   }
	
    public void config()
    {
    	System.out.println("Apple: Octa Core,4gb Ram, 12MP camera");
    	cpu.process();
    }
}
