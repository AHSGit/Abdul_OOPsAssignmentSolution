package com.gl.assessment1.model;

public class AdminDepartment extends SuperDepartment { //Contains 3 methods of return type String and does not accept any parameter
	
public String departmentName() {		
		String dept = "Welcome to Admin Department";
		return dept;
	}
	
	public String getTodaysWork() {		
		String work = "Complete your documents submission";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
}
