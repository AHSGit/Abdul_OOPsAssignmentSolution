package com.gl.assessment1.driver;

import com.gl.assessment1.model.*;

public class Main { 
	//Driver class Main has been used to create objects of HrDepartment, TechDepartment and AdminDepartment
	//

	public static void main(String[] args) {
		//Each department displays all its functionalities through their corresponding objects
		
		AdminDepartment adm = new AdminDepartment();
		System.out.println(adm.departmentName());
		System.out.println(adm.getTodaysWork());
		System.out.println(adm.getWorkDeadline());
		System.out.println(adm.isTodayAHoliday()+"\n"); //Method isTodayAHoliday derived from superclass SuperDepartment
		
		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");

				
		TechDepartment tech = new TechDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
