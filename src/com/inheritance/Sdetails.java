package com.inheritance;      //single level inheritance

public class Sdetails {
public static void main(String[] args) {
	Student2 s2=new Student2();
	s2.detailS2();
}
}

class Student1{
	
	int sId;
	String sName;
	
	void detailS1() {
		System.out.println("first student");
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student1 [sId=" + sId + ", sName=" + sName + "]";
	}
	
}

class Student2 extends Student1 {
	long voterId;
	void detailS2() {
		Student2 s2=new Student2();
		s2.setsId(101);
		s2.setsName("pallavi");
		s2.setVoterId(450235);
		System.out.println("student2="+s2);
		
	}
	public long getVoterId() {
		return voterId;
	}
	public void setVoterId(long voterId) {
		this.voterId = voterId;
	}
	
	
	
	
	
	
	
}
