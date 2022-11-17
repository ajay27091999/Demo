package com.chainsys.day2;

import java.util.Scanner;

public class Testhospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
Hospital hospital1=new Hospital();
  System.out.println("Name of Hospital:");
  String name=scanner.next();
  hospital1.hospitalName=name;
  System.out.println( hospital1.hospitalName);
  hospital1.deanName="Raja MBBS";
  hospital1.deanMobno=98765432111l;
  hospital1.hospitalMobno=97913114990l;
  hospital1.location="Chennai";
  
  System.out.println(hospital1.deanName);
  System.out.println(hospital1.deanMobno);
  System.out.println(hospital1.hospitalMobno);
  System.out.println(hospital1.location);
  
//  System.out.println("Name of Dean:");
//  String dean=scanner.next();
//  hospital1.deanName=dean;
//  System.out.println( hospital1.deanName);
//  System.out.println("Enter DeanMob No :");
//  long mob=scanner.nextLong();
//  hospital1.deanMobno=mob;
//  System.out.println( hospital1.deanMobno);
//  System.out.println("Enter HospitalNo");
//  long host=scanner.nextLong();
//  hospital1.hospitalMobno=host;
//  System.out.println( hospital1.hospitalMobno);
//  System.out.println("Enter Location");
// String loctate=scanner.next();
//  hospital1.location=loctate;
//  System.out.println( hospital1.location);
//  
  
  
  
	}

}
