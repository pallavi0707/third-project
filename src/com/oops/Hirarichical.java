package com.oops;
                                  //single and multilevel
public class Hirarichical {

}

class Shape1{
	public void area() {
		
		System.out.println("display area");
	}
}
class Triangle1 extends Shape1 {         
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
		
	}
}

class Circle extends Shape1 {
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}