package com.AkarshJavaAssignment;

import java.util.regex.*;

public class RegularExpressionCode11 {

	public static void main(String[] args) {
	
	
    String pattern = "[a-z]+";
	String check = "Java hello world";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
