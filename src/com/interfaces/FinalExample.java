package com.interfaces;         //final keyword 

public class FinalExample {   //if we declared variable as final then we canot assign new value to variable becoz variable we use final
	                         //if we declared methode as final then we canot override methode in another class becoz methode we use final
	                        //if we declared class as final then we canot extends class in another class becoz classwe use final

}
final class A{
	final int a=10;
	final void M1() {
	//	a=20;    //not assign or not valid becoz a is final veriable
		System.out.println(a);
	}
}
/*class B extends A{           

	/*@Override
	void M1() {                                   //connaot override methode becoz mehode is final
		System.out.println("m1 is override");
	}
	*/
	


