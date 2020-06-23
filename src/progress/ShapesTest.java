package progress;

public class ShapesTest{
	public static void main(String ...args){
		Shapes rectangle=new Shapes(5.5,2.5,"rectangle");
		Shapes square=new Shapes(2,"square");
		Shapes circle=new Shapes(8,"circle");
		
		double recArea=rectangle.calArea();
		double squareArea=square.calArea();
		double circArea=circle.calArea();
		
		System.out.printf("The area of the rectangle is: %.2f", recArea);	

	}
}