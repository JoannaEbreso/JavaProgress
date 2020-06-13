import java.util.Scanner;
public class ConditionalOperator{
    public static void main(String... args){
        System.out.println("Enter the student's age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        System.out.println(age>30 ? "You are old" : "You are young");
    }
}