package com.wipro.topic2;

class Boook {
	int isbn;
	String title;
	double price;

	public Boook(int isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

}

class Magazine extends Boook {
	String type;

	public Magazine(int isbn, String title, double price, String type) {
		super(isbn, title, price);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Magazine [type=" + type + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
}

class Novel extends Boook {
	String author;

	public Novel(int isbn, String title, double price, String author) {
		super(isbn, title, price);
		this.author = author;
	}

	@Override
	public String toString() {
		return "Novel [author=" + author + ", isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		
		Magazine mag1 = new Magazine(0, "Abc", 12839.33, "Sci-fi");
		System.out.println(mag1.toString());
		
		Novel nov1 = new Novel(0, "QWE", 7891.1, "Drama");
		System.out.println(nov1.toString());
	}

}
