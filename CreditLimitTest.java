import java.util.Scanner;
public class CreditLimitTest{
    public static void main(String[] args){
        CreditLimit obj = new CreditLimit();
        System.out.println("Enter your account number: ");
        Scanner input = new Scanner(System.in);
        int accountNum = input.nextInt();
        obj.setAccountNum(accountNum);

        System.out.println("Enter your account balance: ");
        int balance = input.nextInt();
        obj.setBalance(balance);

        System.out.println("Enter the total number of items purchased: ");
        int totalItems = input.nextInt();
        obj.setTotalItem(totalItems);

        System.out.println("Enter the total credit used: ");
        int totalCredit = input.nextInt();
        obj.setTotalCredit(totalCredit);

        System.out.println("Enter your credit limit: ");
        int creditLimit = input.nextInt();
        obj.setCreditLimit(creditLimit);

        System.out.println("Enter the total charges: ");
        int charges = input.nextInt();
        obj.setCharges(charges);

        obj.calcBalance();

        System.out.println(obj.checkCreditLimit());

    }
}