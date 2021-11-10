package com.example.BusinessLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




  public class JavaStreamExample { 
	  public static void main(String[] args) {
  List<Product> productsList = new ArrayList<Product>(); //Adding Products
  productsList.add(new Product(1,"HP Lapto",25000f)); productsList.add(new
  Product(2,"Dell Laptop",30000f)); productsList.add(new
  Product(3,"Lenevo Laptop",28000f)); productsList.add(new
  Product(4,"Sony Lapto",28000f)); productsList.add(new
  Product(5,"Apple Lapto",90000f)); 
  List<String> pricesList = productsList.stream() .filter(p ->p.name.endsWith("p")) // filtering price
  .map(pm ->pm.name) // fetching price 
  .collect(Collectors.toList());
  System.out.println(pricesList); } 
	  }
 