package polymorphisum;

public class Item {

    String title,publisher,isbn;
    int yearPublished;
    double price;
   
    public Item(String title,String publisher, String isbn, int yearPublished, double price) {
        // TODO Auto-generated constructor stub

        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
        this.price = price;
    }
   
    public String toString() {
       
        return " Title: " + title + " Publisher: " + publisher + " ISBN " + isbn + " Year Published: " + yearPublished + " Price: " + price;
    }
}
