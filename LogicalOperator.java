import java.util.Scanner;
public class LogicalOperator{
    public static void main(String[]args){
        System.out.println("Enter the student's name: ");
        Scanner input=new Scanner(System.in);
        String name = input.next();

        System.out.println("Enter the student's score for Physics: ");
        int phyScore = input.nextInt();

        System.out.println("Enter the student's score for Chemistry: ");
        int chemScore = input.nextInt();

        if (phyScore>50 && chemScore>50){
            System.out.printf("%s has passed", name);
        }

        else{
            System.out.printf("%s has failed", name);
        }
    }

}