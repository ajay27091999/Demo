package com.chainsysday4.sys;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Student Mark");
   int mark=sc.nextInt();
   if(mark<=25)
   {
	   System.out.println("F Grade");
   }
   else if(mark<=45)
   {
	   System.out.println("E Grade"); 
   }
   else if(mark<=50)
   {
	   System.out.println("D Grade");  
   }
   else if(mark<=60)
   {
	   System.out.println("C Grade");  
   }
   else if(mark<=80)
   {
	   System.out.println("B Grade");  
   }
   else if(mark>=80)
   {
	   System.out.println("A Grade");  
   }
	}

}
