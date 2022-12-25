

public class Mobil extends ElectronicDevice {
    private String type;
    String color;
    Mobil(String br, int p, String t,String clr) {
        super(br, p);
        // TODO Auto-generated constructor stub
        type=t;
        color=clr;
    }
    public void print() {
        super.print();
        System.out.println("Type::"+type+" Color::"+color);
    }
}

