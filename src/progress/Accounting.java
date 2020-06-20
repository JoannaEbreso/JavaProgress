package progress;

public class Accounting{
    private String name;
    private double balance;

    public Accounting(String name, double balance)
    {
        this.name=name;
        if(balance > 0.0){
            this.balance=balance;
        }
    }

    public void deposit(double deposit){
        if(deposit>0.0){
            balance=balance+deposit;
        }
    }

    public void withdraw(double withdraw){
            if(withdraw<balance){
            balance=balance-withdraw;
            }
            else{
                System.out.println("The withdrawal amount is larger than balance");
            }
           
        }
    
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    
}