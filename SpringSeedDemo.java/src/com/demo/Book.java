package com.demo;
//di with object setter method
class Publisher{
	private int pubId;
	private String name;
	private String contact;
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Publisher [pubId=" + pubId + ", name=" + name + ", contact=" + contact + "]";
	}
}

public class Book {
	private int bookId;
	private String bookName;
	private double price;
	private Publisher pub;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Publisher getPub() {
		return pub;
	}
	public void setPub(Publisher pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", pub=" + pub + "]";
	}
}
