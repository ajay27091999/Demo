package com.chainsys.day6;

public class Bookmethod {
	int bookId;
	String name;
	float price;
	int rating;
	String language,couponCode= "firstorder";
	int noofCopies=5;
//2 methods	
public void review(String bookName) {
	if (bookName.trim().length()>1) {
		System.out.println("Must Read Book,4.5");
	}else {
		System.out.println("Invalid Book");
	}
}
public void order(String bookName) {
	if(bookName.trim().length()>1) { 
		System.out.println("How many of Copies needed");
		if(noofCopies>2) {
			System.out.println("You are have available discount");
			if(couponCode.equals("firstorder")) {
				price=price-100;
				System.out.println("Amount Pay"+price);
			}else {
				System.out.println("Invaild Coupon");
			}
		}else {
			System.out.println("Amount Pay"+price);
		}
}
}
}	
	