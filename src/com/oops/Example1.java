package com.oops;

public class Example1 {
  public static void main(String[] args) {
	  Stud s=new Stud();
	  s.name="pallavi";
	  s.age=25;
	  s.printinfo(25);
	  s.printinfo("pallavi");
	  s.printinfo("pallavi", 25);
}
}


class Stud{
	String name;
	int age;
	
	public void printinfo(String name) {
		System.out.println(name);
	}
	

	public void printinfo(int age) {
		System.out.println(age);
	}
	public void printinfo(String name,int age) {
		System.out.println(name+" "+age);
	}
}
