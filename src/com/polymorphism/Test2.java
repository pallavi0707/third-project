package com.polymorphism;

public class Test2 {          //QUE--- Can we achiew methode overloading by changing return type 
	                         //ANS----IN JAVA methode overloading is not possible by changing return type of the methode 
	                              //only becoz of ambiguty
	void show(int a) {
		System.out.println("addition");
		
	}
       /*String show(float b) {      //if we change return type we can not overload methode
		System.out.println("addition");
		return null;
		
		
	}*/
	
	public static void main(String[] args) {
		Test2 t2=new Test2 ();

		
	}

}
