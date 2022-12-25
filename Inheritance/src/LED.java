


public class LED extends TV{
     String resolution;
     String mercury;
        LED(String br, int p, String t, String clr, String rs, String mr) {
            super(br, p, t, clr);
            resolution=rs;
            mercury=mr;
        }
        public void print() {
            super.print();
            System.out.println(" Resolution-"+resolution+" Mercury-"+mercury);
        }

    }