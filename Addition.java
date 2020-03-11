import java.util.Scanner;
public class Addition{
	public static void main(String... args){
		System.out.println("Enter your name: ");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		System.out.println("Enter a number: ");
		int firstNum=input.nextInt();
		System.out.println("Enter another number: ");
		int secondNum=input.nextInt();
		int total=firstNum + secondNum;
		System.out.printf("%s, the result of adding %d and %d is %d", name, firstNum, secondNum, total);	
	}
}