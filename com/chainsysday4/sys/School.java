package com.chainsysday4.sys;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of classes held:");
			int numOfClassesHeld=sc.nextInt();
			System.out.println("enter the number of classes you attended:");
			int numOfClassesAttended=sc.nextInt();
			float percentage=(float)((numOfClassesAttended*100)/numOfClassesHeld);
			System.out.println("percentage of class attended:"+percentage+"%");
			if(percentage>=75) {
				System.out.println("you can write the exam");
			}
			else {
				System.out.println("you can't write the exam");
			}
			
		}
		

	}


