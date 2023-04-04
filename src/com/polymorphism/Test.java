package com.polymorphism;

public class Test {
	
	
	void show() {
		System.out.println("pallavi");
	}
	void show(int a) {
		System.out.println("phule");
	}
	void show(int a,float b) {
		System.out.println("pallavi");
	}
	void show(String b) {
		System.out.println("phule");
	}

	
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
		t.show(10);
		t.show(5, 20.5f);
		t.show("abc");
	}

}
