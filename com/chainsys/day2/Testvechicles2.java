package com.chainsys.day2;

import java.util.Scanner;

public class Testvechicles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);

		Vechicles vehicles1=new Vechicles();
		System.out.println("Name of Vehicle:");
		  String name=scanner.next();
		  vehicles1.vehiclesName=name;
		  System.out.println(vehicles1.vehiclesName );
		vehicles1.vehiclesOwnername="Raja";
		vehicles1.fuleType="Pertol";
		vehicles1.vehiclesType="Bike";
		System.out.println("Enter the Vehicles: ");
		int no=scanner.nextInt();
		vehicles1.vehiclesModelno=no;
		System.out.println(vehicles1.vehiclesModelno);
		//System.out.println(vehicles1.vehiclesModelno);
		//System.out.println(vehicles1.vehiclesName);
		System.out.println(vehicles1.vehiclesOwnername);
		System.out.println(vehicles1.fuleType);
		System.out.println(vehicles1.vehiclesType);

	}

}
