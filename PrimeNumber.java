import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[]args)
    {   
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int counter = 0;

        for (int i=1; i<=num; i++){
            if(num%i==0){
                counter=counter+1;
            }
        }

        if (counter==2){
            System.out.printf("%d is a prime number", num);
        }
        else{
            System.out.printf("%d is not a prime number", num);
        }
    }
}