package com.chaitanya.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class M1 implements MobileProcessor
{
	@Override
   public void process() {
	   System.out.println("M1 chip is the processor");
   }
}
