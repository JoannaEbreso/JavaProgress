package progress;

import java.util.Scanner;
public class Exercise3{
	public static void main(String... args){
		System.out.println("Enter a number: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int mod=num % 2;
		if (mod==0){
		System.out.println("Even");
		}
		if (mod!=0){
		System.out.println("Odd");
		}
	}
}