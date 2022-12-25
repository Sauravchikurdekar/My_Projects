

public class TV extends ElectronicDevice {
String type;
String color;
     TV(String br, int p, String t, String clr) {
                  super(br, p);
    type=t;
    color=clr;
}

public void print() {
    super.print();
    System.out.println(" Type::"+type+" Color::"+color);
}
}