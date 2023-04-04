package com.polymorphism;           ///compiletime polymorphism-methode ovverloading

public class Example {
	
	/*void add(int a) {
		System.out.println("single para int methode");
	}*/
	
	/*void add(float b) {
		System.out.println("single para float methode");
	}*/
	void add(int a,double b) {
		System.out.println("double para int double methode");
	}
	void add(Integer a) {
		System.out.println("single wraper Integer methode");
	}
	/*void add(Float a) {
		System.out.println("single wraper Float methode");
	}
	/*void add(char c) {
		System.out.println("char methode");
	}*/
	void add (Object a) {
		System.out.println("single Object class methode");
	}
	void add(Number n) {
		System.out.println("single parent class  when object class absent number methode");
	}
	

	public static void main(String[] args) {
		Example ex=new Example ();
		ex.add(10.2f);         //provide float value
		
		//System.out.println("----------------------------");*/
		
		/*ex.add('x');           //provide char value
		                       //exact match 1st check
		                       //implicit casting -convert lower to higher
		                       //related wrapper class check
		                      //parent class-object class check*/
		                      
	 
	}

}
