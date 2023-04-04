package com.inheritance;         //multilevel inheritance


public class CourseDetail {
public static void main(String[] args) {

	CourseA   coursec    =new CourseC(101, "testing", 20000, "xyz");
	System.out.println(coursec);


}
}

class CourseA {
	int cId;
	String cName;
	public CourseA(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
	
	
}

class CourseB extends CourseA {
	int cFee;

	public CourseB(int cId, String cName, int cFee) {
		super(cId, cName);
		this.cFee = cFee;
	}

	
	

}
class CourseC extends CourseB {
	String cTeacer;

	public CourseC(int cId, String cName, int cFee, String cTeacer) {
		super(cId, cName, cFee);
		this.cTeacer = cTeacer;
	}

	@Override
	public String toString() {
		return "CourseC [cTeacer=" + cTeacer + ", cFee=" + cFee + ", cId=" + cId + ", cName=" + cName + "]";
	}

	
	
}
