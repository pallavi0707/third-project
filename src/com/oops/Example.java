package com.oops;

public class Example {
  public static void main(String[] args) {
	 /* Pen pen1=new Pen();
	  pen1.colour="blue";
	  pen1.type="gel";
	  pen1.write();
	  Pen pen2=new Pen();
	  pen2.colour="black";
	  pen2.type="bollpen";
	  pen1.printcolour();
	  pen2.printcolour();
	  pen1.printtype();
	  pen2.printtype();*/
	  
	  Students s1=new Students("pallavi", 25);
	  /*s1.name="pallavi";
	  s1.age=25;*/
	  s1.info();
	  
}
}

class Pen{
	String colour;
	String type;
	
	
	public void write() {
		System.out.println("write somthening");
	}
	public void printcolour() {
		System.out.println(this.colour);               ///this keyword ne samjt kont object ni call kelay
	}
	public void printtype() {
		System.out.println(this.type);
	}
}
class Students{
	String name;
	int age;
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	/*Students (){
		System.out.println("no para constructor called");
	}*/
	
	
	Students (String name, int age){
		this.name=name;
		this.age=age;
	}
	
}
