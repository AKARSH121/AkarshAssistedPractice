package com.AkarshJavaAssignment;
import java.util.*;
public class HashMapsCode {
public static void main(String[] args) {
					
	Map<Integer,String> map=new HashMap<Integer,String>();  
	  map.put(100,"Akarsh");  
	  map.put(101,"kunal");  
	  map.put(102,"raju");  
	  //Elements can traverse in any order  
	  for(Map.Entry m:map.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	}