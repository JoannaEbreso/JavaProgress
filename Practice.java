import java.util.Scanner;
public class Practice{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i = sc.nextInt();

        System.out.println("Enter a double: ");
        double d = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter a String: ");
        String s = sc.nextLine();
      
        
        System.out.printf("%n");
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}