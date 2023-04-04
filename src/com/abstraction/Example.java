package com.abstraction;

public class Example {
	public static void main(String[] args) {
		Animal dog=new  Dog ();
		dog.eat();
		Animal tiger=new Tiger ();
		tiger.eat();
	}

}

 abstract class Animal{
	 public abstract void eat();
 }
 
 class Dog extends Animal{

	@Override
	public void eat() {
	System.out.println("eating somthing");
		
	}
	 
	
	
 }
 
class Tiger extends Animal {

	@Override
	public void eat() {
		
		System.out.println("eating ");
		
	}
	
}