package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.Response;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.BusinessLayer.*;



@RestController
@ComponentScan
//@PropertySource("classpath:application.properties")
@RequestMapping(value="/Demo")
public class ServiceRequest {

	@Autowired
	CalculateCredit calCredit;

	@Autowired
	CourseInter repo;
	@Autowired
	CourseInterface rep;
	@Autowired
	Coursepreview cp;
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@GetMapping("/creditdetail")
	public List<Coursepreview> courseDetail() {
		/*
		 * log.debug("Value"); log.info("DEBUG:"+calCredit.calculateValue());
		 */
		
		System.out.println("propert read:"+dbUrl);
		 return calCredit.calculateValue();
		//return rep.findAll();
	}
	@GetMapping("/creditdetailresponse")
	public ResponseEntity<List<Coursepreview>> courseDetailResponseEntity() {
		/*
		 * log.debug("Value"); log.info("DEBUG:"+calCredit.calculateValue());
		 */
		List<Coursepreview> calculateValue = calCredit.calculateValue();
		HttpHeaders headers = new HttpHeaders();
        headers.add("Responded", "ServiceRequest");
		 return ResponseEntity.ok().headers(headers).body(calculateValue);
				 
		//return rep.findAll();
	}
	
	public int creditSize() {
		return repo.findAll().size();
	}

	
	  @GetMapping("/creditdetaildb") public List<CourseCredit> courseDetaildb() {
	  
		/* log.debug("Value"); log.info("DEBUG:"+calCredit.calculateValue()); */
	  
	  return repo.findAll(); }
	 
	@GetMapping(value="/check")
	public String check() {
		/*
		 * log.debug("Value"); log.info("DEBUG:"+calCredit.calculateValue());
		 */
		return "I am here";
	}
}
