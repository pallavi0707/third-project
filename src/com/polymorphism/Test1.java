package com.polymorphism;  //methode overloading 
                            //QUE----can we overload java main method
                            //ANS---YES we can have any number of main methode in a class by methode overloaing this is 
                            //becoz jvm always call main methode whic recieve string and array as argument only
public class Test1 {
	public static void main(String[] args) {
		System.out.println("pallavi");
		Test1 t1=new Test1();
		t1.main(10);
	}
	
public static void main(int a) {
		System.out.println("phule");
	}
}
