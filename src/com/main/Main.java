package com.main;

public class Main {
	 
	public static void main(String[] args) {
		
		int a = 11; int b = 22; int c;
		
		c  = a + b + a++ + b++ + ++a + ++b;
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 11; b = 22; c = 0;
		
		 c = a--;
		 System.out.println(c);
		 System.out.println(a);
	}
	
}

/*
 * Increment
 * 
 *  Pre - ++a
 *  Post - a++
 * 
 * 
 * Decrement 
 * Pre - --a
 * Post - a--
 * 
 * */
