package com.chainsys.day6;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		
			if(year%400==0)
			{
				System.out.println("The given year is leap");
			}
			else if(year%100 ==0) {
				System.out.println("The given year is not leap");
			}
			else
			{
				System.out.println("The given year is not leap");
			}

	
	}
}
