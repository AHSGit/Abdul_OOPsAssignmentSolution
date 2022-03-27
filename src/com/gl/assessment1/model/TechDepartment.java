package com.gl.assessment1.model;

public class TechDepartment extends SuperDepartment { //Contains 4 methods of return type String and does not accept any parameter
	
public String departmentName() {		
		String dept = "Welcome to Tech Department";
		return dept;
	}
	
	public String getTodaysWork() {		
		String work = "Complete coding of Module 1";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String getTechStackInformation() {
		String info = "Core Java";
		return info;
	}
}


