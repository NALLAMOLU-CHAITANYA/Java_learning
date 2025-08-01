package com.chaitanya.demoproj;

import java.util.HashMap;
import java.util.Map;

import com.chaitanya.demo2.test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	Map<String, Integer> x = new HashMap<>();
    	
        test a = new test();

    	System.out.println(x);
    	a.added(x);
        System.out.println( "Hello World!" );
        System.out.println(x);
    }
}
