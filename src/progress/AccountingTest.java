package progress;

import java.util.Scanner;
public class AccountingTest{
    public static void main(String ...args){
    Accounting account1= new Accounting("Joanna",100.50);
    Accounting account2= new Accounting("Lola",200.30);

    System.out.printf("%s has %.2f in her account %n", account1.getName(),account1.getBalance());
    System.out.printf("%s has %.2f in her account %n", account2.getName(),account2.getBalance());

    System.out.println("Joanna enter a deposit: ");
    Scanner input=new Scanner(System.in);
    double deposit1=input.nextDouble();

    account1.deposit(deposit1);
    System.out.printf("%s you have %.2f in your account %n", account1.getName(),account1.getBalance());

    System.out.println("Lola enter a deposit: ");
    double deposit2=input.nextDouble();

    account2.deposit(deposit2);
    System.out.printf("%s you have %.2f in your account %n", account2.getName(),account2.getBalance());

    System.out.printf("%s enter the amount you want to withdraw: ", account1.getName());
    double value=input.nextDouble();
    account1.withdraw(value);
    System.out.printf("Withdrawal Successful! %n");
    System.out.printf("Your remaining balance is %d%n", account1.getBalance());  
        
    
  }
}