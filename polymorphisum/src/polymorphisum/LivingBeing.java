package polymorphisum;

public class LivingBeing {
	public static void main(String[] arg)
	{
int Choice = 1;
		
		switch(Choice) {
		
		case 1: show(new Tiger());
		break;
		
		case 2: show(new Elephent());
		break;
		}
	}

	public static void show(Animal Animal) {
		
		Animal.eat();
	}
//	Animal a1=new Animal();
//	a1.eat();
//	Tiger t1=new Tiger();
//	t1.eat();
//	//Tiger tr;
//	//tr=(Tiger)a1;
//	//tr.show();
//	Elephant e1=new Elephant();
//	e1.eat();
}
