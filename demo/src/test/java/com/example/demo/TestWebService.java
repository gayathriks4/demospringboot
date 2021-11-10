package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.BusinessLayer.CalculateCredit;
import com.example.BusinessLayer.Coursepreview;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.hamcrest.Matchers.containsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
//@WebMvcTest(ServiceRequest.class)
public class TestWebService {
	@Autowired
	private MockMvc mvc;
	
   @MockBean
   CourseInter repo;
	
	
	@Test
	public void ReturnWelcomeStringTest() throws Exception{
		ResultMatcher ok = MockMvcResultMatchers.status().isOk();
		MockHttpServletRequestBuilder builder=MockMvcRequestBuilders.get("/Demo/check");
		this.mvc.perform(builder).andDo(print())
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("I am here"));
	}
	@Test
	public void ReturnCreditdetailDbTest() throws Exception{
		  CourseCredit cr1=new CourseCredit(2,"datamining",3);  
		     CourseCredit cr2=new CourseCredit(3,"Data",2);
		     List<CourseCredit> crlist=new ArrayList<CourseCredit>(Arrays.asList(new CourseCredit(2,"datamining",3),
		    		 new CourseCredit(3,"Data",2)));
		   
		Mockito.when(repo.findAll()).thenReturn(crlist);
		//Mockito.when(calcredit.calculateValue()).thenReturn()
		ResultMatcher ok = MockMvcResultMatchers.status().isOk();
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/Demo/creditdetaildb");
        this.mvc.perform(builder).andDo(print())
		.andExpect(status().isOk()).andExpect(content().json("[{courseid:2,coursename:datamining,credit:3},{}]"))
		;
		 // String original = result.getResponse().getContentAsString();
				 
		//System.out.println("origin:****"+original);
		/*
		 * String expected="[{\r\n" + "        \"courseid\": 2,\r\n" +
		 * "        \"coursename\": \"datamining\",\r\n" + "        \"credit\": 3\r\n" +
		 * "    },\r\n" + "    {\r\n" + "        \"courseid\": 3,\r\n" +
		 * "        \"coursename\": \"Data\",\r\n" + "        \"credit\": 2\r\n" +
		 * "    }\r\n" + "]";
		 */
		 
	//assertEquals(expected, original, false);
		
		  
		                                            
	}
	@Test
	public void ReturnCreditdetailTest() throws Exception{
		
	     List<CourseCredit> crlist=new ArrayList<CourseCredit>(Arrays.asList(new CourseCredit(1,"machinelearning",3),
	    		 new CourseCredit(3,"Data",2),
	    		 new CourseCredit(2,"datamining",3)));
	     List<Coursepreview> cpreview=new ArrayList<Coursepreview>();
	    
	     Mockito.when(repo.findAll()).thenReturn(crlist);
		ResultMatcher ok = MockMvcResultMatchers.status().isOk();
		MockHttpServletRequestBuilder builder=MockMvcRequestBuilders.get("/Demo/creditdetail");
		this.mvc.perform(builder).andDo(print())
		.andExpect(status().isOk())
		 .andExpect(MockMvcResultMatchers.content().json("[\r\n" + "    {\r\n" +
				  "        \"courseid\": 1,\r\n" + "        \"credit\": 3,\r\n" +
				  "        \"courseValue\": 2520.0,\r\n" +
				  "        \"coursename\": \"machinelearning\"\r\n" + "    },\r\n" +
				  "    {\r\n" + "        \"courseid\": 2,\r\n" + "        \"credit\": 3,\r\n" +
				  "        \"courseValue\": 2520.0,\r\n" +
				  "        \"coursename\": \"datamining\"\r\n" + "    },\r\n" + "    {\r\n" +
				  "        \"courseid\": 3,\r\n" + "        \"credit\": 2,\r\n" +
				  "        \"courseValue\": 1800.0,\r\n" +
				  "        \"coursename\": \"Data\"\r\n" + "    }\r\n" + "]"));
				 
		
		                                            
	}

	

}
