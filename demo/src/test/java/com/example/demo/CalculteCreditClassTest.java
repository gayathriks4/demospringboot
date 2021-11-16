package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.BusinessLayer.CalculateCredit;
import com.example.BusinessLayer.Coursepreview;


@ExtendWith(MockitoExtension.class)
public class CalculteCreditClassTest {
	@Mock
	CourseInter repo;
	
	@Autowired
	Coursepreview cp;
	@InjectMocks  
	private CalculateCredit calcredit;
	@Test
	public void CalCreditTest() throws Exception{
		 List<CourseCredit> crlist=new ArrayList<CourseCredit>(Arrays.asList(new CourseCredit(2,"datamining",3),
	    		 new CourseCredit(3,"Data",2)));
	 Mockito.when(repo.findAll()).thenReturn(crlist);
		/*
		 * int a; for(CourseCredit cr:crlist) {
		 * Mockito.when(cp.setCourseid(a)).thenRrturn(cr.getCourseid());
		 * 
		 * }
		 */
	 List<Coursepreview> calculateValue = calcredit.calculateValue();
	
	
	
	//Double courseValue = calculateValue.get(0).getCourseValue();
	Double expected=2520.0;
	assertEquals(expected, calculateValue.get(0).getCourseValue());
	
	}

}
