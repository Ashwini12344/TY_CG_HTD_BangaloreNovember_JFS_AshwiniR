package com.capgemini.springcore.beans;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class Validation {
	
	private static String text;
	Scanner sc=new Scanner(System.in);
	 //String name=sc.next();
	public static void main(String[] args) {
		
	 validateLetters(text);
	
		
	}
	public static boolean validateLetters(String text) {

	    String regx = "[a-zA-Z]+\\.?";
	    System.out.println("name");
		Scanner sc=new Scanner(System.in);
		 String name=sc.next();
		if(name==regx) {
			System.out.println("valid name");
		}
		
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(text);
	    return matcher.find();

	}

}
