package com.abstraction;

public class AbstractionExample {
public static void main(String[] args) {
	/*Y y=new Y();
	y.M1();
	y.M2();*/
	/*Z z=new Z();
	 
	z.M1();
	z.M3();*/
	X yy=new  Y ();
	yy.M1();
	yy.M2();
}
}

abstract class X{                 //abstract class contain both abbstract and non abstract methode
    int a;                       // there is no specific rule for data member
    void M1() {                  // we can write constructor in abstract
    	
    	System.out.println("welcome ");
    }
  abstract  void M2();
	
	
}

class Y  extends X{

	@Override
	void M2() {
		System.out.println("java program");
		
	}
}

class Z extends Y{
	
	void M3() {
		Z z=new Z();
		z.M2();
	}
	
}
