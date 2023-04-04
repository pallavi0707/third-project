package com.interfaces;

import java.util.Scanner;

public class InterfaceExample2 {
public static void main(String[] args) {
	
	/*Dev d=new Dev();
	d.Input();
	d.Login();*/
	Custmore dev=new  Dev();
	dev.Input();
	dev.Login();
}
}
interface Custmore{
	void Input();
	
	void Login();
}

class Dev implements Custmore{
        String firstname;
        String lastname;
        
	@Override
	public void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		firstname=sc.nextLine();
		System.out.println("enter lastname");
		lastname=sc.nextLine();
		sc.close();
	}

	@Override
	public void Login() {
		System.out.println("login succesful");
		
	}
	
}
