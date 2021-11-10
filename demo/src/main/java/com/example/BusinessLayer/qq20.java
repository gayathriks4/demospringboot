package com.example.BusinessLayer;

public class qq20 {

public static void main(String as[]) {
	System.out.println(m());
}
public static int m() {
	try {
		//sSystem.out.println(3/0);
		return 3;
	}
	catch(Exception e) {
		System.out.println("2");
		return 2;
	}
	finally {
		System.out.println("1");
		return 1;
	}
}
}
