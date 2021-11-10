package com.example.BusinessLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Singleton {
	private String name="gayathri";
	private static Singleton obj;
	public Singleton() {
		
	}
	public static Singleton getInstance() {
		if(obj!=null)
			return obj;
		synchronized (Singleton.class) {
			if(obj==null) {
				obj=new Singleton();
			}
			return obj;
		}
		
		
	}
	public void getNamepr(){
	System.out.println("name:"+name);
	
	}
	
	public List<Integer> addItems(int a){
	System.out.println("include the input in list:"+a);
		List<Integer> a1=new ArrayList<Integer>( Arrays.asList(23,56,78,90,32,14));
		a1.add(a);
		return a1;
			
	}

}
