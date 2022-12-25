package polymorphisum;

public class Book extends Item{

    String author;
    int edition,volume;
   
     Book(String title,String publisher, String isbn, int yearPublished, double price, String author, int edition, int volume) {
        // TODO Auto-generated constructor stub
       
        super(title, publisher, isbn, yearPublished, price);
       
        this.author = author;
        this.edition = edition;
        this.volume = volume;
    }
   
    public String toString() {
       
        return super.toString() + "Author: " + author + " Edition: " + edition + " Volume: " + volume;
    }
}



