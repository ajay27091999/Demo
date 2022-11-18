package com.chainsys.day6;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, first=0,second=1;
		System.out.println("Fibonacci Series till "+ n +" terms:");
		
		for(int i=0;i<=n;i++) {
			System.out.println(first);
		int nextValue=first+second;
		first=second;
		second=nextValue;
		}
	}

}
