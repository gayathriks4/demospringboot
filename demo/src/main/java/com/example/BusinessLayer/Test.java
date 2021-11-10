package com.example.BusinessLayer;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	
	
Singleton s=(Singleton.getInstance());
System.out.println(s.addItems(1)+" object");

Singleton obj1=Singleton.getInstance();
Singleton obj2=null;
  	
try {
	Constructor[] cons=Singleton.class.getConstructors();
	for(Constructor co: cons) {
		co.setAccessible(true);
		obj2=(Singleton) co.newInstance();
		break;
	}
	
}
catch(Exception e) {
	e.printStackTrace();
}
System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());
	Testt t=new Testt();
	Test t1=new Test();
	t1.streamapitest();

		/*
		 * t.B(); main(20,89); System.out.println("fibonacci: "+t1.fibonacci(3)); char
		 * s1[]="geekforgeek".toCharArray(); char s2[]="forgeekge".toCharArray();
		 * System.out.println(t1.find_anagram(s1, s2));
		 */
	
}
public static void main(int a,int b) {
	System.out.println("Integer main");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("swap: "+a+" "+b);
}
public boolean find_anagram(char[] s1, char[] s2) {
	if(s1.length!=s2.length)
		return false;
	Arrays.parallelSort(s1);
	Arrays.parallelSort(s2);
	for(int i=0;i<s1.length;i++)
		if(s1[i]!=s2[i])
			return false;
	return true;
}
public void streamapitest() {
	List<Employee> Employeelist=new ArrayList<Employee>();
	Employeelist.add(new Employee(1, "john", "Development",
			 27,Arrays.asList(234567890,1237890345)));
Employeelist.add(new Employee(2,"madan", "Analysis",34,Arrays.asList(9345678,89034567))); 
		 
Employeelist.add(new Employee(3, "roop", "HR",47,Arrays.asList(93456098,81234567))); 
		  Employeelist.add(new Employee(4, "suresh", "Testing", 29,Arrays.asList(9327678,890677567)));
		  Employeelist.add(new Employee(5, "sam", "Development", 32,Arrays.asList(93456,890345)));
		  Employeelist.add(new Employee(6, "teja", "Analysis", 25,Arrays.asList(93456788,89077767)));
		  Employeelist.add(new Employee(7, "christopher", "Development", 23,Arrays.asList(9333378,89055567)));
		  Employeelist.add(new Employee(8, "vedha", "HR", 37,Arrays.asList(9321278,89909567))); 
		  Employeelist.add(new Employee(9, "nancy", "Testing", 30,Arrays.asList(76542134,56732145)));
		 
	
	List<Integer> deplist= Employeelist.stream().filter(e->e.dept.equalsIgnoreCase("development"))
			.map(em->em.getAge())
			.sorted()
			.limit(2)
			.collect(Collectors.toList());
Employeelist.parallelStream().forEach(e->System.out.println(e.getName()));
List<Integer> flatmaplist = Employeelist.stream().filter(e->e.dept.equalsIgnoreCase("HR"))
            .flatMap(em->em.getPhone().parallelStream())
            .sorted() 
            .collect(Collectors.toList());
			
	 System.out.println(deplist);
}

public int fibonacci(int n) {
	if(n<=1)
		return n;
	else
	{
		 return fibonacci(n-1)+fibonacci(n-2);
	}
}
}
