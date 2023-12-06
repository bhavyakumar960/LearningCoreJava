package com.main;

public class Main {
	
	static {
		System.out.println("static-block");
	}

	
	public static void main(String[] args) {
		System.out.println("Happy guys!!");
	}
	
}

/*
 * IDETIFIERS name given to any java program. a to z, A to Z, 0-9, $, _
 * 
 * Lenght of identifiers - infinite 
 * case-sensitive
 * 
 * 
 * reserve keywords
 * 53 -> 50(keywords) + 3(Literal)
 * 50(keywords)-> 48(used) + 2(goto, const)
 * 	48 includes - Access modifiers + datATYPES, flow control, exception handing + class level keywords + object
 * 
 * datatypes -> byte, short, char, int, long, float, double, boolean(primitive types)
 * 
 * 	3 literals - > void, true, false
 * 
 * Enums : 
 * 
 * enum A{
 * 	TERMINATED, SUSPENDED
 * }
 * 
 * Methods, attributes -> camelCase  -- doItEarly
 * class, interface -> Pascal ---DoItEarly
 * 
 * Scenerios where java do not use camelCase
 * instanceof, strictfp
 * 
 * 
 * Is java pure object oriented or not ? (No)
 * 1. support primitives
 * 2. multiple inheritance not support in class
 * 
 * Multiple inheritance is suppoted in case of interfaces
 * 
 * 
 * interface
 * 
 * interface Bank{
 * 		String address, id;
 * 
 * 		setInterest, getInterest, loan
 * }
 * 
 * class PunjabNationalBank implements Bank{
 * 	
 * }
 * 	
 *	 	byte b = 10;
 * 		b++; ->  b = b + 1 
 * 		sout(b);
 * 
 *  
 * 
 */