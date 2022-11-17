package com.chainsysday4.sys;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	      
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Two Number");
	        int num1=sc.nextInt();
	        int num2=sc.nextInt();
	        System.out.println("Enter the Operator ex(Add,Sub,Multiplication,Division)");
	         String value=sc.next();
	     if(value.equals("Add")) {
	    	 System.out.println("The Add Value is  "+(num1+num2));
	     }
	     if(value.equals("Sub")) {
	    	 System.out.println("The Sub Value is  "+(num1-num2));
	}
	     if(value.equals("Multiplication")) {
	    	 System.out.println("The Multiplication Value is  "+(num1*num2));
	     }
	     if(value.equals("Division")) {
	    	 System.out.println("The Division Value is  "+(num1/num2));
	     }
	   
	     
	}

}
