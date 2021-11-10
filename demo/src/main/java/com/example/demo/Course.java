package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	int id;
	String course;
	int passport_id;
	public Course(int id, String course, int passport_id) {
		super();
		this.id = id;
		this.course = course;
		this.passport_id = passport_id;
	}
	
	public Course() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(int passport_id) {
		this.passport_id = passport_id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", passport_id=" + passport_id + "]";
	}
	

}
