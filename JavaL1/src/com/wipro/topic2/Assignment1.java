package com.wipro.topic2;

class Book {
	int isbn;
	String title;
	String author;
	double price;

	public Book(int isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String displayDetails() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public double discountedPrice(double percent) {
		return (this.price - (this.price * percent));		
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(0, "Where Good Ideas Come From", "Steven Johnson", 9090.32);
		System.out.println(book1.displayDetails());
		System.out.println(book1.discountedPrice(0.5));
	}

}
