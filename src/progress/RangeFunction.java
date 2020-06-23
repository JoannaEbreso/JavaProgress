package progress;

import java.util.Scanner;
public class RangeFunction{

    public static void main(String[]args){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if (number%2==1){
        System.out.println("Weird!");
        }

        else if (number%2==0 && number>20){
            System.out.println("Not Weird!");
        }

        else if (number%2==0 && (number>=6 && number<=20)){
            System.out.println("Weird!");
        }
        
        else if (number%2==0 && (number>=2 && number<=5)){
            System.out.println("Not Weird!");
        }

        else{
            System.out.println("Nothing!");
        }
    }


}