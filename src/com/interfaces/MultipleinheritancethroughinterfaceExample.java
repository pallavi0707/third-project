package com.interfaces; //use of interfance -to achiev the multiple inheritance we use interface-
                            //(by using class we canot achiev multiple inheritance so we use interfaces)

interface M{            //if two interface contain same name methode then we canoot overrdide 
	                    //this methode double in class becoz duplicate methode does not allow in class
	int p=20;            //but if  methode name same but variation in argument then we can oveerdide according to that
	void N1();
	}

interface N {
	int q=25;
	//void N2();
	void 	N1();
	
}








public class MultipleinheritancethroughinterfaceExample implements M,N {
public static void main(String[] args) {
	MultipleinheritancethroughinterfaceExample p=new MultipleinheritancethroughinterfaceExample();
	p.N1();
	//p.N2();
}

/*@Override
public void N2() {
System.out.println(q);
System.out.println(p);
}*/

@Override
public void N1() {
	System.out.println(p);
	
}


}


