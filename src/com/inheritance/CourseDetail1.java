package com.inheritance;           //Hierarchical Inheritance

public class CourseDetail1 {
public static void main(String[] args){
	/*CourseP courser   =new  CourseR(101, "testing", "xyz");
	System.out.println(courser );
	CourseP courseq   =new CourseQ(101, "testing", 20000);
	System.out.println(courseq  );
	System.out.println(courser+" "+courseq);*/
	CourseR courser =new CourseR(101, "testing", "xyz");
	System.out.println(courser );
}
}

class CourseP{
	int cId;
	String cName;
	public CourseP(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	
	
	
}
class CourseQ extends CourseP {
	int cFee;

	public CourseQ(int cId, String cName, int cFee) {
		super(cId, cName);
		this.cFee = cFee;
	}

	@Override
	public String toString() {
		return "CourseQ [cFee=" + cFee + ", cId=" + cId + ", cName=" + cName + "]";
	}

	
	
	
}
class CourseR extends CourseP{
	String cTeacer;

	public CourseR(int cId, String cName, String cTeacer) {
		super(cId, cName);
		this.cTeacer = cTeacer;
	}

	@Override
	public String toString() {
		return "CourseR [cTeacer=" + cTeacer + ", cId=" + cId + ", cName=" + cName + "]";
	}

}
