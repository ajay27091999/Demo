package com.chainsysday4.sys;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int balance=50000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to  ATM");
			System.out.println("Enter withdrawal money:");
			int amount=sc.nextInt();
			if(balance>=amount) {
				balance=balance-amount;
				System.out.println("please collect your money");
			}
			else {
				System.out.println("balance is not sufficient");
			}
	}

}
