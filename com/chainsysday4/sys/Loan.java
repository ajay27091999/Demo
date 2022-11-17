package com.chainsysday4.sys;

public class Loan {

	public static void main(String[] args) {
		 float P = 5000, R = 15, T = 1;
		  
	        float SI = (P * T * R) / 100;
	        System.out.println("Simple interest = " + SI);
	        do
	        {
	        	System.out.println(SI);
	        	SI--;
	        }while(SI>1000);

	}

}
