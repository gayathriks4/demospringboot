package com.example.BusinessLayer;

import java.util.List;

public class Employee {
int id;

String name;
String dept;
int age;
List<Integer> phone;




public Employee(int id, String name, String dept, int age,List<Integer> list) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.age = age;
	this.phone=list;
}
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDept() {
	return dept;
}


public void setDept(String dept) {
	this.dept = dept;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}
public List<Integer> getPhone() {
	return phone;
}
public void setPhone(List<Integer> phone) {
	this.phone = phone;
}

}
