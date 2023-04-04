package com.polymorphism;

public class Example1 {

}


class P{
	void add() {
		System.out.println("defult no para methode");
	}
	void add(int a) {
		System.out.println("default int methode");
	}
	
	
	
	
}
class Q extends P{
	void add() {
		System.out.println("defult no para methode");
	}
	
public void add(int a) {
	System.out.println("public int methode");
	}
	
}

