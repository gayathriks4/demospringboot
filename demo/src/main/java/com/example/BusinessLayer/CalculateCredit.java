package com.example.BusinessLayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


import com.example.demo.CourseInter;
import com.example.demo.CourseCredit;

@Service
@ComponentScan
public class CalculateCredit {
    @Autowired
	CourseInter repo;
  
  
  @Autowired
  Coursepreview cp1;
 
  
  public CalculateCredit() {
	  
  }

public List<Coursepreview> calculateValue(){
List<CourseCredit> cocredit = repo.findAll();
	List<Double> coursevalue=new ArrayList<Double>();
	 List<Coursepreview> cplist=new ArrayList<Coursepreview>();
	 
	for (CourseCredit courseCredit : cocredit) {
		if(courseCredit.getCredit()==2) {
			System.out.println("Debug:"+courseCredit.getCredit());
			double val=courseCredit.getCredit()*500*1.8;
			cp1.setCourseid(courseCredit.getCourseid());
			cp1.setCourseValue(val);
			cp1.setCoursename(courseCredit.getCoursename());
			cp1.setCredit(courseCredit.getCredit());
			
			//Coursepreview cp1=new Coursepreview(cp.getCourseid(),cp.getCoursename(),cp.getCredit(),cp.getCourseValue());
			//cplist.add(cp.setCourseid(courseCredit.getCourseid()));
		
			coursevalue.add(val);
			//cplist.add(cp1);
		}
		else if(courseCredit.getCredit()==3) {
			double val=courseCredit.getCredit()*300*2.8;
			
			//cplist.add(cp.setCourseid(courseCredit.getCourseid()));
			cp1.setCourseid(courseCredit.getCourseid());
			cp1.setCourseValue(val);
			cp1.setCoursename(courseCredit.getCoursename());
			cp1.setCredit(courseCredit.getCredit());
			//Coursepreview cp1=new Coursepreview(cp.getCourseid(),cp.getCoursename(),cp.getCredit(),cp.getCourseValue());
			//cplist.add(cp1);
			//cplist.add(cp.setCourseValue(val));
			coursevalue.add(val);
		}
		Coursepreview cp1=new Coursepreview(cp1.getCourseid(),cp1.getCoursename(),cp1.getCredit(),cp1.getCourseValue());
		cplist.add(cp1);
	}
	for (Double double1 : coursevalue){
		System.out.println(double1);
		}
	return cplist;
}

}
