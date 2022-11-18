package com.chainsys.day6;

public class Testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookmethod book=new Bookmethod();
		
		book.bookId=56;
		book.name="House of";
		book.language="English";
		book.price=670;
		book.rating=4;
		String bookName="House of";
		book.review(bookName);
		book.order(bookName);

	}

}
