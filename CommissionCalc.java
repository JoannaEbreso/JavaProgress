import java.util.Scanner;
public class CommissionCalc{
    private double item1;
    private double item2;
    private double item3;
    private double item4;
    private double wage;

    public CommissionCalc(double item1, double item2, double item3, double item4){
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
    }

    public double getItemPrice(int itemNumber){
        if(itemNumber == 1){
            return item1;
        }
        else if(itemNumber == 2){
            return item2;
        }
        else if(itemNumber == 3){
            return item3;
        }
        else if(itemNumber == 4){
            return item4;
        }
        return 0.0;
    }

    public double calcWage(double totalforItems){
        Float fraction = (float)9/100;        
        wage = 200+(fraction* totalforItems);
        return wage;
    }

    public static void main(String[] args){
        CommissionCalc obj = new CommissionCalc(239.99,129.75,99.95,350.89);
        Scanner input = new Scanner(System.in);

        double totalforItems = 0;
        System.out.println("Enter the item sold by the sales person. Press 5 to stop inputting");
        int itemNumber= input.nextInt();

        while(itemNumber!=5){
            double itemPrice=obj.getItemPrice(itemNumber);
            totalforItems = totalforItems+itemPrice;
            System.out.println(totalforItems);

            System.out.println("Enteranother item sold by the sales person. Press 5 to stop inputting");
            itemNumber = input.nextInt();
        }

        System.out.printf("This salespersons wage for the week is %f", obj.calcWage(totalforItems));
        
    }
}