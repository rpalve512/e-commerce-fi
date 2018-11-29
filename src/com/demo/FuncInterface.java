package com.demo;

@FunctionalInterface
 interface FuncInterface {

	public  void square(int i);
	
	public default void m2() {
		System.out.println("default method");
	}
}

@FunctionalInterface
interface FuncInterface2 {

	public  void square(int i);
	
	public default void m2() {
		System.out.println("default method");
	}
}
