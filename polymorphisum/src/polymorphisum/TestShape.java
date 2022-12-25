package polymorphisum;

public class TestShape {

		public static void main(String[] args) {

			Shape s1=new Circle(2,"Blue");
			//s1.fillColor();
			s1.draw();
			s1.calculateArea();
			
			Shape s2=new Square(4,"Green");
			s2.draw();
			s2.calculateArea();
}
}