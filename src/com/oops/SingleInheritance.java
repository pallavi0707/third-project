package com.oops;

public class SingleInheritance {
public static void main(String[] args) {
	
}
}

class Shape{
	public void area() {
		System.out.println("display area");
	}
}
class Triangle extends Shape {         
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
		
	}
}

class EquilateralTriangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
		
	}
	
}

