package com.example.BusinessLayer;

public class Coursepreview {

	int courseid;
	String Coursename;
	int credit;
	Double courseValue;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Double getCourseValue() {
		return courseValue;
	}
	public void setCourseValue(Double courseValue) {
		this.courseValue = courseValue;
	}
	public Coursepreview() {
		
	}
	
	public Coursepreview(int courseid, String coursename, int credit, Double courseValue) {
		super();
		this.courseid = courseid;
		Coursename = coursename;
		this.credit = credit;
		this.courseValue = courseValue;
	}
}
