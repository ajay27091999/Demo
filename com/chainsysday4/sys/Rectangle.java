package com.chainsysday4.sys;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Length");
 int leng=sc.nextInt();
 System.out.println("Enter the Breadth");
 int bre=sc.nextInt();
  if(leng==bre) {
	  System.out.println("It is Square");
  }
  else {
	  System.out.println("It not Square");
  }
	}

}
