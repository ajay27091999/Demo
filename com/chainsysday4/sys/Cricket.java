package com.chainsysday4.sys;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team A Score");
		int team1=sc.nextInt();
		System.out.println("Enter the team B Score");
		int team2=sc.nextInt();
	
		if(team1>team2) {
			System.out.println("Team A is Winner");
		}
		else if(team2>team1) {
			System.out.println("Team B is Winner");
		}
		else  {
			System.out.println("Match is draw");
		}
		

	}


}
