package progress;

import java.util.Scanner;
public class SwitchCase{
    public static void main(String... args){
        System.out.println("Enter the student's name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        System.out.printf("Enter rating number from 1 to 5 for %s: ", name);
        int rate=sc.nextInt();

        switch (rate) {
            case 1: System.out.printf("%s has a poor rating", name);
                break;
            
            case 2: System.out.printf("%s has a bad rating", name);
                break; 
            
            case 3: System.out.printf("%s has an average rating", name);
                break;

            case 4: System.out.printf("%s has a good rating", name);
                break;

            case 5: System.out.printf("%s has an excellent rating", name);
                break;

            default:System.out.printf("%s has not been rated properly", name); 
                break;
        }
        

    }
}