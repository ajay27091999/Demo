package com.chainsys.day6;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method invocation
		addition();
		subtraction();
		multiplication();
	}	
//method Definition
		public static void addition() {
			int a=10,b=20;
			int add=a+b;
		System.out.println("Add: " +add);
			
		}
		public static void subtraction() {
			int a=100,b=50;
			int sub=a-b;
		System.out.println("Sub: " +sub);
			
		}
		public static void multiplication() {
			int a=5,b=22;
			int multi=a*b;
		System.out.println("Multi: " +multi);
		}
		
	}


