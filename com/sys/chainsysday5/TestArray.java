package com.sys.chainsysday5;

import java.util.Scanner;

public class TestArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the number of Employees");
      Scanner sc=new Scanner(System.in);
      int noEmp=sc.nextInt();
      
      Emp[] emp=new Emp[4];
      emp[0]=new Emp("Ajay",99,"Trainee");
      emp[1]=new Emp("raja",10,"Trainee");
      emp[3] =new Emp("Mani",76,"Trainee");
      
      for(int i=0;i<=emp.length;i++);
      {
		int i = 1;
		System.out.println("Employees name:"+emp[i].name);
		System.out.println("Employees id:"+emp[i].id);
		System.out.println("Employees designation :"+emp[i].designation);
      }
	}
}
