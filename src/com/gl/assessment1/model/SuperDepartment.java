package com.gl.assessment1.model;

public class SuperDepartment { 
	//SuperDepartment acts as a superclass for all the departments which extends class SuperDepartment
	//Contains 4 methods of return type String and does not accept any parameter
	
	public String departmentName() {		
		String dept = "Super Department";
		return dept;
	}
	
	public String getTodaysWork() {		
		String work = "No Work as of now";
		return work;
	}
	
	public String getWorkDeadline() {
		String deadline = "Nil";
		return deadline;
	}
	
	public String isTodayAHoliday() {
		String holiday = "Today is not a Holiday";
		return holiday;
	}
		
}
