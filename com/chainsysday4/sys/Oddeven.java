package com.chainsysday4.sys;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Values");
   int num=sc.nextInt();
 
   if(num % 2==0)
   {
	   System.out.println("The Given Values is EVEN");
   }
   else {
	   System.out.println("The Given Values is ODD");
   }
	}

}
