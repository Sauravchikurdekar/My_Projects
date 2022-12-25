package polymorphisum;

public class TestItem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Book book = new Book("xyz", "Sharma", "ISBN", 2022, 150.0, "XYZ", 2022, 1);
        System.out.println(book);
       
        MusicCD musicCD = new MusicCD("Shiv", "Sharma", "ISBN", 2021, 130.0, "XYZ", 2);
        System.out.println(musicCD);
       
        Software software = new Software("Video Editor", "XYZ", "ISBN", 2015, 5000.0, 1.0);
        System.out.println(software);
    }

}
