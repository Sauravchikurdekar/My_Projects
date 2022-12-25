

public class TestED {
public static void main(String[] args) {
    Computer c=new Computer("Lenovo",35000,"A340");
    Computer c1=new Computer("Dell",48000,"I-3493");
    Mobil m= new Mobil("Samsung",55000,"Android","Black");
    Mobil m1= new Mobil("Apple",70000,"iOS","Silver");
    TV t=new TV("LG",40000,"LCD","Grey");
    TV t1=new TV("SONY",80000,"LED","Black");
    LCD l=new LCD("Sony", 70000, "LCD","Black","Low","Mercury is Used");
    LED ld=new LED("Sony", 75000, "LED","Grey","High","Mercury is not Used");
    c.print();
    c1.print();
    m.print();
    m1.print();
    t.print();
    t1.print();
    l.print();
    ld.print();
}
}
