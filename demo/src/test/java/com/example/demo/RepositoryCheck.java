package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.BusinessLayer.Coursepreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@ExtendWith(MockitoExtension.class)
public class RepositoryCheck {
	
    @Mock 
	CourseInter repo;
    
    @InjectMocks
    ServiceRequest req;
    @Autowired
    Coursepreview cp;
    @Test
    @SuppressWarnings("unchecked")
    public void testRepo() {
    	
    	CourseCredit cr1=new CourseCredit(2,"datamining",3);
        CourseCredit cr2=new CourseCredit(3,"data",2);
     List<CourseCredit> crlist=new ArrayList<CourseCredit>();
     crlist.add(cr1);
     crlist.add(cr2);
     Mockito.when(repo.findAll()).thenReturn(crlist);
   
    	assertEquals(2, req.creditSize());
		/*
		 * List<Course> findAll = repo.findAll(); System.out.println(findAll.size());
		 * assertEquals(3, findAll.size());
		 */
    }
    @Test
    @SuppressWarnings("unchecked")
    public void testRepos() {
    	
     CourseCredit cr1=new CourseCredit(2,"datamining",3);
     CourseCredit cr2=new CourseCredit(3,"data",2);
     List<CourseCredit> crlist=new ArrayList<CourseCredit>(Arrays.asList(new CourseCredit(2,"datamining",3),
    		 new CourseCredit(3,"Data",2)));
    
     Mockito.when(repo.findAll()).thenReturn(crlist);
     
     List<Coursepreview> courseDetail = req.courseDetail();
     String expected="[{courseid:2,coursename:datamining,credit:3},{courseid:3,coursename:Data,credit:2}]";
    	assertEquals(2, courseDetail.get(0).getCourseid());
		/*
		 * List<Course> findAll = repo.findAll(); System.out.println(findAll.size());
		 * assertEquals(3, findAll.size());
		 */
    }
}
