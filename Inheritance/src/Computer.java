

public class Computer extends ElectronicDevice {
    String model;
 Computer(String br, int p, String m) {
 super(br, p);
 model=m;

}
public void print() {
 super.print();
 System.out.println("Model::"+model);
}

}
