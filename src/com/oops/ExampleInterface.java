package com.oops;

public class ExampleInterface {           //all field in interface are public, static and final bydefault
 public static void main(String[] args) {
	 Horse1 horse=new Horse1();
	 horse.walk();
	 horse.eat();
	 
				}                          //all methodes are public and abstract bydefault
}                                         //use for to achiev the multiple inheritance

interface Animal1{
	int eye=2;
	void walk();
}

interface Harbiwor{
	void eat();
}
class Horse1 implements Animal1, Harbiwor {

	@Override
	public void walk() {
	System.out.println("walk in 4 leg");
		
	}

	@Override
	
	public void eat() {
		System.out.println("only eat plant");
		
	}
	
}
