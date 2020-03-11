import java.util.Scanner;
public class RectangleTest{
	public static void main(String... args){
		Rectangle obj=new Rectangle();
		System.out.println("Enter the length of the rectangle: ");
		Scanner input=new Scanner(System.in);
		int length=input.nextInt();
		obj.setLength(length);
		System.out.println("Enter the width of the rectangle: ");
		int width=input.nextInt();
		obj.setWidth(width);
		int area=obj.calculateArea();
		int perimeter=obj.calculatePeri();
		System.out.printf("The area is: %d %nThe perimeter is: %d", area, perimeter);
		
	}
}