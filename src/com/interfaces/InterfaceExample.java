package com.interfaces;        

public class InterfaceExample implements P1 {         //interface contain static and final variable by default
public static void main(String[] args) {             //in interface methodes are abstract-means method does not contain any body
	InterfaceExample exm=new InterfaceExample();     //in interface bydefault methodes are public
	exm.M1();
}

@Override
public void M1() {
	System.out.println(a);
	
}
}

interface P1{
	int a=10;         //in interface variable is final or static by default
	void M1();       //ABSTRACT METHODE-DOES NOT CONTAIN ANY BODY
	
}

