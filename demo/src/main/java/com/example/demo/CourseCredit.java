package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="coursecredit")
public class CourseCredit {

	@Id	
	int Courseid;
	
	
	int Credits;
	String Coursename;
	
	public CourseCredit() {
		
	}
	public CourseCredit(int courseid,String coursename,int credit) {
		super();
		this.Courseid = courseid;
		this.Coursename = coursename;
		this.Credits = credit;
	}	
	public int getCourseid() {
		return Courseid;
	}
	public void setCourseid(int courseid) {
		this.Courseid = courseid;
	}
	public int getCredit() {
		return Credits;
	}
	public void setCredit(int credit) {
		this.Credits = credit;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	@Override
	public String toString() {
		return "CourseCredit [Courseid=" + Courseid +  ", Coursename=" + Coursename + ", Credits=" + Credits + "]";
	}
	
	
	
}
