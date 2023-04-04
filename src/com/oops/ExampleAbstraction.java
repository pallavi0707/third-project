package com.oops;

public class ExampleAbstraction {
 public static void main(String[] args) {
	/* Animal horse=new Horse();
	 horse.walk();
	 Animal chiken=new Chiken();
	 chiken.walk();*/
	 Chiken chiken=new Chiken();
	 chiken.walk();
	 Horse horse=new Horse();               //base cllass constructor call first---means chaining of constructor
	 horse.walk();
	 horse.eat();
	 
}
}

abstract class Animal{
	 abstract void walk();          //abstract methode
	 public void eat() {
		 System.out.println("animal eats");             //non abstract methode
	 }
	 Animal(){
		 System.out.println("you are creating animal");           //constructor 
	 }
	 
}
class Horse extends Animal{

	@Override
	public void walk() {
		System.out.println("walk in 4 leg");
		
	}
	Horse (){
		System.out.println("created horse");
	}
	
	
	
}
class Chiken extends Animal{

	@Override
	public void walk() {
     System.out.println("walk in 2 leg");
		
	}
	
}