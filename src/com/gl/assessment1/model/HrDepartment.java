package com.gl.assessment1.model;

public class HrDepartment extends SuperDepartment { //Contains 4 methods of return type String and does not accept any parameter
	
public String departmentName() {		
		String dept = "Welcome to HR Department";
		return dept;
	}
	
	public String getTodaysWork() {		
		String work = "Fill today’s timesheet and mark your attendance";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return deadline;
	}
	
	public String doActivity() {
		String activity = "Team Lunch";
		return activity;
	}

}
