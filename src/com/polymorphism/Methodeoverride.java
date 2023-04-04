package com.polymorphism;   //Method Overriding
                                                   //same method name same parameter more than two classes through inheritance
public class Methodeoverride {                     //return type-->if we use parent return type in parent class then
	                                                   //in child class we use same return type or child of those retun type
public static void main(String[] args) {           //return type--> if we use primitive or wrapper or void return type in parent class then
                                                //in child class we use same return type
	                                               //access modifier-->if we use smaller access modifier in parent class then
	PQR p= new ABC ();                                 //in child class we use same or wider access modifier
	    p.add();                                     // parent -->default-- child-->protected/public/default
	    p.M1(10);                                                    //protected --public/protected
	    p.M2();                                                       //public --public                                              
}                                                                                                    
}
class PQR{
	
	void add() {
		System.out.println("void return type methode parent class");
		
	}
	void M1(int a) {
		System.err.println("default methode p");
		
	}
	Object M2() {
		
		System.out.println("parent return type p");
		return null;}
	
	Integer M3() {
		System.out.println("wrapper methode p");
		return null;}
	
}
class ABC extends PQR{
     void add() {
    	 
    	 System.out.println("overriden same void parent  in child");
	}
    protected void M1(int a) {
    	
    	System.out.println("overriden M1 wider access modifier");
 		
 	}
     String M2(){	 
    	 System.out.println("overriden M2 use child retun type");
		return null;}
     
}
