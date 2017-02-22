package com.hibernate.chapter3;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetail {
	private String schoolAddress;
	private int studentCount;
	
	
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	

}
