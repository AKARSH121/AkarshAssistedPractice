package com.AkarshJavaAssignment;

public class PrimitiveDataType {

	public static void main(String[] args) {
		 int num1 = 5;
		    double num2 = 5.65;
		    boolean num3 = true;

		    
		    Integer obj1 = Integer.valueOf(num1);
		    Double obj2 = Double.valueOf(num2);
		    Boolean obj3 = Boolean.valueOf(num3);

		   
		    if(obj1 instanceof Integer) {
		      System.out.println("Here the Integer object has been created.");
		    }

		    if(obj2 instanceof Double) {
		      System.out.println("Heree the double objects has been created.");
		    }

		    if(obj3 instanceof Boolean) {
		      System.out.println("here the boolean object has been created");
		    }
		  }

	}


