package com.main;

public interface Inter {

	abstract void print();
	
	default void printMe() {
		System.out.println("");
	}
	
}
