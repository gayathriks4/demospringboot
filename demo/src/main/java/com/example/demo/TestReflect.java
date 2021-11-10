package com.example.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
  
// class whose object is to be created
class TestReflect
{
    // creating a private field
    private String s;
  
    // creating a public constructor
    public TestReflect()  {  s = "GeeksforGeeks"; }
  
    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + s);
    }
  
    // Creating a public method with int as argument
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }
  
    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}
  
