package com.wipro.topic2;

class Document {

	String text;

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return this.text;
	}
}

class Email extends Document {
	String sender;
	String recipient;
	String title;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + ", body=" + text + "]";
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		Email email1 = new Email();
		
		email1.setSender("abc");
		email1.setRecipient("xyz");
		email1.setTitle("Hello");
		email1.setText("Hello World");
		
		System.out.println(email1.toString());
	}

}
