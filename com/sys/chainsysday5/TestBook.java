package com.sys.chainsysday5;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookExample book1=new BookExample();
		book1.language="English";
		////Default Constructor
		System.out.println(book1.language+book1.price+book1.rating+book1.name);
		//parameter constructor
		BookExample book2=new BookExample("English",27,4,"HBO");
		System.out.println(book2.language);
		System.out.println(book2.name);
		BookExample book3=new BookExample("English",50,5,"GOT");
		System.out.println(book3.language);
		System.out.println(book3.name);
	}

}
