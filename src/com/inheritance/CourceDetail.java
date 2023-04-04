package com.inheritance;        //single Inheritance

import java.util.Scanner;

public class CourceDetail implements Cloneable {
public static void main(String[] args)throws CloneNotSupportedException {
	/* Course1 course2=new Course2(101, "tesing", 20000);
	 System.out.println(course2);*/
	Scanner sc =new Scanner(System.in);
	System.out.println("enter cId");
	int cId=sc.nextInt();
	System.out.println("enter cName");
	String cName=sc.next();
	System.out.println("enter cFee");
	int cFee=sc.nextInt();
	Course1 course2=new Course2(cId, cName, cFee);
	System.out.println(course2);
	//Course1 course3= (Course1) course2.clone();            mistek
}
}

class Course1{
	
	int cId;
	String cName;
	public Course1(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
	
	
}
class Course2 extends Course1 implements Cloneable{
	int cFee;

	public Course2(int cId, String cName, int cFee) {
		super(cId, cName);
		this.cFee = cFee;
	}

	@Override
	public String toString() {
		return "Course2 [cFee=" + cFee + ", cId=" + cId + ", cName=" + cName + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
