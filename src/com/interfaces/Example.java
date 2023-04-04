
package com.interfaces;    //multiple inheritance through interface//

public class Example extends child implements Parent1,Parent2{
public static void main(String[] args) {
	 Example ex=new  Example();
	 ex.M1();
	 ex.m2();
}
}

interface Parent1{
	int a=20;
	void M1();     //bydefault methode public +abstract
	
}
interface Parent2{
	int b=40;
	void m2();
}

class child implements Parent1,Parent2{

	@Override
	public void m2() {
	System.out.println("parent2 methode");
		
	}

	@Override
	public void M1() {
	
		System.out.println("parent1 methode");
	}
	
}

