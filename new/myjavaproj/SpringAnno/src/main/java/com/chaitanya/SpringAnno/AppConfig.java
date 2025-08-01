package com.chaitanya.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.chaitanya.SpringAnno")
public class AppConfig
{
//	@Bean
//	public Samsung getPhoneSamsung() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public Apple getPhoneApple() {
//		return new Apple();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
}
