import java.util.Scanner;
public class CreditLimit{
    private int accountNum;
    private int balance;
    private int totalItem;
    private int totalCredit;
    private int creditLimit;
    private int charges;

    public void setAccountNum( int accountNum){
        this.accountNum = accountNum;

    }
    public int getAccountNum(){
        return accountNum;
    }
    public void setBalance( int balance){
        this.balance = balance;

    }
    public int getBalance(){
        return balance;
    }
    public void setTotalItem( int totalItem){
        this.totalItem = totalItem;

    }
    public int getTotalItem(){
        return totalItem;
    }

    public void setTotalCredit( int totalCredit){
        this.totalCredit = totalCredit;
    }

    public int getTotal(){
        return totalCredit;
    }

    public void setCreditLimit( int creditLimit){
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit(){
        return creditLimit;
    }

    public void setCharges( int charges){
        this.charges = charges;
    }

    public int getCharges(){
        return charges;
    }

    public int calcBalance(){
        balance= balance+(charges-totalCredit);
        return balance;
    }

    public String checkCreditLimit(){
        if (balance>creditLimit){
           return String.format("%s","You have exceeded your credit limit");
        }

        else{
            return String.format("%s","You have not exceeded your credit limit");
        }
    }

}