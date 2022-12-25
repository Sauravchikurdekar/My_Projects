package com.has;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
@Entity
@Table (name="PUB")
class Publisher{

	@Id
	private int pubId;
	private String pubName;
	private String contact;
	
	@OneToOne(targetEntity = Book.class)
	private Book book;
	
	
	public int getPubId() {
		return pubId;
	}
	public void setPubId(int pubId) {
		this.pubId = pubId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setpubId(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setpubName(String string) {
		// TODO Auto-generated method stub
		
	}
}
@Entity
@Table(name="book1")
public class Book {
	@Id
	@GeneratedValue
	@PrimaryKeyJoinColumn
	private int bookId;
	private String bookName;
	private double price;
	@OneToOne(targetEntity = Publisher.class, cascade= CascadeType.ALL)
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

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", pub=" + pub + "]";
	}

	public void setPub(Publisher pub) {
		this.pub = pub;
	}

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		
		Session session=factory.openSession();
		Publisher pub=new Publisher();
		pub.setpubId(101);
		pub.setpubName("Delux");
		pub.setContact("tree");
		
		Book book=new Book();
		book.setBookName("java");
		book.setPrice(1000);
		
		book.setPub(pub);
		pub.setBook(book);
		session.save(book);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("table created sucessfully");

	}

}
