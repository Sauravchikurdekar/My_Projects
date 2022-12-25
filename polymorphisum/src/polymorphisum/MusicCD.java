package polymorphisum;

public class MusicCD extends Item {

    String artist;
    int volume;
   
    public MusicCD(String title,String publisher, String isbn, int yearPublished, double price, String artist, int volume) {
        // TODO Auto-generated constructor stub
       
        super(title, publisher, isbn, yearPublished, price);
       
        this.artist = artist;
        this.volume = volume;
    }
   
    public String toString() {
       
        return super.toString() + "Artist: " + artist + " Volume: " + volume;
    }

}



