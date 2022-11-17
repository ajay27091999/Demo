package com.sys.day3;

import java.util.Scanner;

public class Opertors {

	
	private int b;
	private int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Opertors arith=new Opertors();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Two Values:");
int num1=sc.nextInt();
int num2=sc.nextInt();
arith.a=num1;
arith.b=num2;
System.out.println("Add number= "+(num1+num2));
System.out.println("Sub number= "+(num1-num2));
System.out.println("Mulit number= "+(num1*num2));
System.out.println("Divi number= "+(num1/num2));
	}

}
