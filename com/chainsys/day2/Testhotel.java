package com.chainsys.day2;

import java.util.Scanner;

public class Testhotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hotel hotel1=new Hotel();
Scanner scanner=new Scanner(System.in);

System.out.println("Enter the Hotel Name ");
String hotel= scanner.next();
hotel1.hotelName=hotel;
System.out.println(hotel1.hotelName);

hotel1.ownerName="Surya Raja";
hotel1.phoneNo=9791311499l;
hotel1.ac=true;
hotel1.hotelLocation="Chennai";
//System.out.println(hotel1.hotelName);
System.out.println(hotel1.ownerName);
System.out.println(hotel1.phoneNo);
System.out.println(hotel1.hotelLocation);
System.out.println(hotel1.ac);
	}

}
