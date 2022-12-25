package polymorphisum;

public class Software extends Item {

	   double version;
	   
	    public Software(String title,String publisher, String isbn, int yearPublished, double price, double version) {
	        // TODO Auto-generated constructor stub
	       
	        super(title, publisher, isbn, yearPublished, price);
	       
	        this.version = version;
	    }
	   
	    public String toString() {
	       
	        return super.toString() + "Version: " + version ;
	    }
	}
