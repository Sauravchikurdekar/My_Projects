

public class LCD extends TV{
    String resolution;
    String mercury;
       LCD(String br, int p, String t, String clr, String rs, String mr) {
           super(br, p, t, clr);
           resolution=rs;
           mercury=mr;
       }
       public void print() {
           super.print();
           System.out.println(" Resolution-"+resolution+" Mercury-"+mercury);
       }

   }