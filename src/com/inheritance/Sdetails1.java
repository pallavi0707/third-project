package com.inheritance;    //multilevel inheritance

public class Sdetails1 {
	
public static void main(String[] args) {
	stu3 s3=new stu3();
	s3.dteail3();
	
}
}

class stu1{
	int sId;
	String sName;
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
		return "stu1 [sId=" + sId + ", sName=" + sName + "]";
	}
	
	
}

class stu2 extends stu1{
	
	long voterId;
	
	void detail2() {
		stu2 s2=new stu2();
		s2.setsId(101);
		s2.setsName("pallavi");
		s2.setVoterId(425325);
		System.out.println("stu2="+s2);
	}

	public long getVoterId() {
		return voterId;
	}

	public void setVoterId(long voterId) {
		this.voterId = voterId;
	}

	@Override
	public String toString() {
		return "stu2 [voterId=" + voterId + "]";
	}
	
}

class stu3 extends stu2 {
	
	void dteail3() {
		stu3 s3=new stu3();
		s3.setVoterId(425352);
		System.out.println("stu3="+s3);
		s3.detail2();
	}
}
