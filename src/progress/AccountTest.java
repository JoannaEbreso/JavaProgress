package progress;

import java.util.Scanner;

public class AccountTest{

	public static void main(String... args){

		Account obj=new Account();
		System.out.println("Enter your First Name: ");
		Scanner input=new Scanner(System.in);
		String firstName=input.next();
		obj.setfirstName(firstName);
		String output=obj.getfirstName();
		System.out.printf("We got your first name from the account class. It is %s", output);
	}
}