import java.util.Scanner;
public class Exercise4{
	public static void main(String ...args){
		System.out.println("Enter a number: ");
		Scanner input=new Scanner(System.in);
		int firstNum=input.nextInt();
		System.out.println("Enter another number: ");
		int secondNum=input.nextInt();
		if (firstNum>secondNum){
			System.out.printf("The larger number is %d ",firstNum);
		}
		if (secondNum>firstNum){
			System.out.printf("The larger number is %d ",secondNum);
		}
	}

}