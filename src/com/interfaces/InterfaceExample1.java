package com.interfaces;

import java.util.Scanner;

public class InterfaceExample1  {
	public static void main(String[] args) {
		 Devloper dev=new  Devloper();
		 dev.input();
		 dev.output();
	}
	
	 
}
interface Client{
	void input();
	void output();
}

class Devloper implements Client{
  String name; double salary;
	@Override
	public void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user name");
	name=sc.nextLine();
	System.out.println("enter salary");
	salary=sc.nextDouble();
	
		
	}

	@Override
	public void output() {
		
		System.out.println(name +" "+salary);
	}
	

}
