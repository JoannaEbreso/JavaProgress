import java.util.Scanner;
public class AirlineTest{
    public static void main(String[]args){
        Airline airline1 = new Airline(10);
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please type 1 for FirstClass and Please type 2 for Economy: ");
            int choice = sc.nextInt();
    
            if (choice == 1){
                airline1.firstClass();    
            }
    
            else if (choice == 2){
                airline1.economyClass();
            }

        }
       
    }

    
}