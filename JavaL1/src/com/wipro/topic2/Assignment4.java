package com.wipro.topic2;

class Payment {
	double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Payment(double amount) {
		this.amount = amount;
	}

	public String paymentDetails() {
		return "Rs. " + amount + " is payed.";
	}
}

class CashPayment extends Payment {

	public CashPayment(double amount) {
		super(amount);
	}

	@Override
	public String paymentDetails() {
		return "Rs. " + amount + " is payed in cash.";
	}
}

class CreditCardPayment extends Payment {
	String name_on_the_card;
	String expiration_date;
	String credit_card_number;

	public CreditCardPayment(String name_on_the_card, String expiration_date, String credit_card_number,
			double amount) {
		super(amount);
		this.name_on_the_card = name_on_the_card;
		this.expiration_date = expiration_date;
		this.credit_card_number = credit_card_number;
	}

	@Override
	public String paymentDetails() {
		return "Rs. " + amount + " payed in Credit card, Name on the card: " + name_on_the_card
				+ ", Exp. date of the card: " + expiration_date + ", Credit card number: " + credit_card_number;
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		
		CashPayment cp1 = new CashPayment(90000.10);
		System.out.println(cp1.paymentDetails());
		
		CashPayment cp2 = new CashPayment(90000.10);
		System.out.println(cp2.paymentDetails());
		
		CreditCardPayment ccp1 = new CreditCardPayment("Abc", "09/01/21", "18320123", 18203.13);
		System.out.println(ccp1.paymentDetails());
		
		CreditCardPayment ccp2 = new CreditCardPayment("Bcd", "12/02/21", "73106813", 83920.23);
		System.out.println(ccp2.paymentDetails());
		
	}

}
