package com.chaitanya.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);    	
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
        
        //ApplicationContext factory2 = new AnnotationConfigApplicationContext(AppConfig.class);    	
        Apple pro = factory.getBean(Apple.class);
        pro.config();
    }
}
